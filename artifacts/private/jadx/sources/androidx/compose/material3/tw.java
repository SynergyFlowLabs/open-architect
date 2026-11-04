package androidx.compose.material3;

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
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,848:1\n1282#2,6:849\n1282#2,6:855\n1282#2,6:861\n1282#2,6:901\n1282#2,6:945\n1282#2,6:995\n1282#2,6:1001\n55#3:867\n55#3:911\n99#4,6:868\n106#4:910\n99#4,6:912\n106#4:954\n79#5,6:874\n86#5,3:889\n89#5,2:898\n93#5:909\n79#5,6:918\n86#5,3:933\n89#5,2:942\n93#5:953\n79#5,6:964\n86#5,3:979\n89#5,2:988\n93#5:993\n347#6,9:880\n356#6:900\n357#6,2:907\n347#6,9:924\n356#6:944\n357#6,2:951\n347#6,9:970\n356#6,3:990\n4206#7,6:892\n4206#7,6:936\n4206#7,6:982\n70#8:955\n68#8,8:956\n77#8:994\n113#9:1007\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n145#1:849,6\n225#1:855,6\n239#1:861,6\n342#1:901,6\n377#1:945,6\n461#1:995,6\n462#1:1001,6\n339#1:867\n374#1:911\n333#1:868,6\n333#1:910\n369#1:912,6\n369#1:954\n333#1:874,6\n333#1:889,3\n333#1:898,2\n333#1:909\n369#1:918,6\n369#1:933,3\n369#1:942,2\n369#1:953\n388#1:964,6\n388#1:979,3\n388#1:988,2\n388#1:993\n333#1:880,9\n333#1:900\n333#1:907,2\n369#1:924,9\n369#1:944\n369#1:951,2\n388#1:970,9\n388#1:990,3\n333#1:892,6\n369#1:936,6\n388#1:982,6\n388#1:955\n388#1:956,8\n388#1:994\n841#1:1007\n*E\n"})
public final class tw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f33255a = 5.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f33256b = androidx.compose.ui.unit.h.r(8);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33257a;

        a(boolean z10) {
            this.f33257a = z10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(61121126, i10, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:294)");
            }
            iw.f29388a.e(this.f33257a, null, null, c0Var, 3072, 6);
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33258a;

        b(boolean z10) {
            this.f33258a = z10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1181873313, i10, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:140)");
            }
            iw.f29388a.e(this.f33258a, null, null, c0Var, 3072, 6);
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

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f33261c;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.foundation.layout.g5 g5Var) {
            this.f33259a = function2;
            this.f33260b = function3;
            this.f33261c = g5Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1717860164, i10, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:167)");
            }
            tw.v(this.f33259a, this.f33260b, this.f33261c, c0Var, 0);
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

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33262a;

        d(boolean z10) {
            this.f33262a = z10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-643804033, i10, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:220)");
            }
            iw.f29388a.e(this.f33262a, null, null, c0Var, 3072, 6);
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

    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f33265c;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.foundation.layout.g5 g5Var) {
            this.f33263a = function2;
            this.f33264b = function3;
            this.f33265c = g5Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1208080836, i10, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:248)");
            }
            tw.v(this.f33263a, this.f33264b, this.f33265c, c0Var, 0);
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

    static final class f implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33266a;

        f(boolean z10) {
            this.f33266a = z10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1867102712, i10, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:264)");
            }
            iw.f29388a.e(this.f33266a, null, null, c0Var, 3072, 6);
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

    @SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,848:1\n607#2:849\n604#2,6:850\n1282#3,3:856\n1285#3,3:860\n1282#3,6:863\n1247#3,6:874\n605#4:859\n165#5,5:869\n79#5,6:880\n86#5,3:895\n89#5,2:904\n93#5:909\n171#5:910\n347#6,9:886\n356#6,3:906\n4206#7,6:898\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$1$1\n*L\n393#1:849\n393#1:850,6\n393#1:856,3\n393#1:860,3\n394#1:863,6\n398#1:874,6\n393#1:859\n398#1:869,5\n398#1:880,6\n398#1:895,3\n398#1:904,2\n398#1:909\n398#1:910\n398#1:886,9\n398#1:906,3\n398#1:898,6\n*E\n"})
    static final class g implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f33268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Integer> f33269c;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.animation.core.y0<Integer> y0Var) {
            this.f33267a = function2;
            this.f33268b = function3;
            this.f33269c = y0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1372614088, i10, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:392)");
            }
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
            androidx.compose.animation.core.y0<Integer> y0Var = this.f33269c;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = new fw(s0Var, y0Var);
                c0Var.Y(objI1);
            }
            fw fwVar = (fw) objI1;
            androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.c4.a(androidx.compose.ui.a0.E, androidx.compose.foundation.layout.e4.Min);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = androidx.compose.ui.layout.n0.e(CollectionsKt.listOf((Object[]) new Function2[]{this.f33267a, this.f33268b}));
            Object objI2 = c0Var.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.ui.layout.j1.a(fwVar);
                c0Var.Y(objI2);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI2;
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            function2E.invoke(c0Var, 0);
            c0Var.o();
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", i = {}, l = {463}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f33271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f33272c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l3 f33273a;

            a(androidx.compose.runtime.l3 l3Var) {
                this.f33273a = l3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if ((gVar instanceof androidx.compose.foundation.interaction.l.b) || (gVar instanceof androidx.compose.foundation.interaction.c.a)) {
                    androidx.compose.runtime.l3 l3Var = this.f33273a;
                    l3Var.j(l3Var.m1() + 1);
                } else if ((gVar instanceof androidx.compose.foundation.interaction.l.c) || (gVar instanceof androidx.compose.foundation.interaction.c.b) || (gVar instanceof androidx.compose.foundation.interaction.l.a)) {
                    androidx.compose.runtime.l3 l3Var2 = this.f33273a;
                    l3Var2.j(l3Var2.m1() - 1);
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.l3 l3Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f33271b = hVar;
            this.f33272c = l3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f33271b, this.f33272c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f33270a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f33271b.c();
                a aVar = new a(this.f33272c);
                this.f33270a = 1;
                if (iVarC.collect(aVar, this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    private static final androidx.compose.runtime.n7<Integer> B(androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(281890131, i10, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:459)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = androidx.compose.runtime.e6.b(0);
            c0Var.Y(objI0);
        }
        androidx.compose.runtime.l3 l3Var = (androidx.compose.runtime.l3) objI0;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && c0Var.D(hVar)) || (i10 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z10 || objI1 == aVar.a()) {
            objI1 = new h(hVar, l3Var, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.i(hVar, (Function2) objI1, c0Var, i11);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return l3Var;
    }

    private static final androidx.compose.ui.a0 C(androidx.compose.ui.a0 a0Var, final boolean z10, final androidx.compose.runtime.n7<Integer> n7Var) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material3.pw
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return tw.D(n7Var, z10, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 D(final androidx.compose.runtime.n7 n7Var, final boolean z10, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.qw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tw.E(n7Var, z10, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(androidx.compose.runtime.n7 n7Var, boolean z10, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        aVar.N(i2Var, 0, 0, ((Number) n7Var.getValue()).floatValue() + (z10 ? 5.0f : 0.0f));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(@Nullable androidx.compose.ui.a0 a0Var, float f10, @NotNull final pj.n<? super im, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1844783038);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(nVar) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (i14 != 0) {
                f10 = iw.f29388a.l();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1844783038, i12, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:367)");
            }
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.c4.d(androidx.compose.foundation.layout.i6.b(a0Var, 0.0f, d0.x1.f269270a.a(), 1, null), androidx.compose.foundation.layout.e4.Min);
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(-f10)), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new jm(y5Var);
                c0VarR.Y(objI0);
            }
            nVar.invoke((jm) objI0, c0VarR, Integer.valueOf(((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        final float f11 = f10;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.l(a0Var2, f11, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.a0 a0Var, float f10, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(a0Var, f10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0173  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0189  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01db  */
    /* JADX WARN: Code duplicated, block: B:158:0x01de  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x020a  */
    /* JADX WARN: Code duplicated, block: B:165:0x025c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0265  */
    /* JADX WARN: Code duplicated, block: B:170:0x0276  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "kept for binary compatibility")
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final /* synthetic */ void m(final im imVar, final boolean z10, final Function1 function1, final androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.a0 a0Var, boolean z11, dw dwVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, final Function2 function3, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        Function1 function4;
        int i14;
        int i15;
        androidx.compose.ui.a0 a0Var2;
        int i16;
        int i17;
        boolean z12;
        int i18;
        dw dwVar2;
        androidx.compose.foundation.a1 a1VarH;
        int i19;
        androidx.compose.foundation.interaction.j jVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        final Function2 function2E;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final dw dwVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        dw dwVarI;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.ui.a0 a0Var5;
        int i25;
        dw dwVar4;
        int i26;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2065856961);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(imVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function4 = function1;
                i13 |= c0VarR.k0(function4) ? 256 : 128;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                i15 = i12 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    i17 = i12 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            z12 = z11;
                            if (c0VarR.G(z12)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i13 |= i18;
                        }
                        if ((1572864 & i10) == 0) {
                            if ((i12 & 32) == 0) {
                                dwVar2 = dwVar;
                                int i27 = c0VarR.D(dwVar2) ? 1048576 : 524288;
                                i13 |= i27;
                            } else {
                                dwVar2 = dwVar;
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        if ((i10 & 12582912) == 0) {
                            a1VarH = a1Var;
                            if ((i12 & 64) == 0 || !c0VarR.D(a1VarH)) {
                                i26 = 4194304;
                            } else {
                                i26 = 8388608;
                            }
                            i13 |= i26;
                        } else {
                            a1VarH = a1Var;
                        }
                        i19 = i12 & 128;
                        if (i19 != 0) {
                            i13 |= 100663296;
                            jVar2 = jVar;
                        } else {
                            jVar2 = jVar;
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.D(jVar2)) {
                                    i20 = 67108864;
                                } else {
                                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i20;
                            }
                        }
                        i21 = i12 & 256;
                        if (i21 != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c0VarR.k0(function2)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                                i13 |= i22;
                            }
                            if ((i12 & 512) != 0) {
                                i23 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.k0(function3)) {
                                    i24 = 4;
                                } else {
                                    i24 = 2;
                                }
                                i23 = i11 | i24;
                            } else {
                                i23 = i11;
                            }
                            if ((i13 & 306783379) == 306783378 || (i23 & 3) != 2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i15 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i17 != 0) {
                                        z12 = true;
                                    }
                                    if ((i12 & 32) != 0) {
                                        dwVarI = iw.f29388a.i(c0VarR, 6);
                                        i13 &= -3670017;
                                    } else {
                                        dwVarI = dwVar2;
                                    }
                                    if ((i12 & 64) != 0) {
                                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                        i13 = (-29360129) & i13;
                                    }
                                    if (i19 != 0) {
                                        jVar4 = null;
                                    } else {
                                        jVar4 = jVar2;
                                    }
                                    if (i21 != 0) {
                                        jVar3 = jVar4;
                                        dwVar4 = dwVarI;
                                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                        a0Var5 = a0Var4;
                                        i25 = i13;
                                    } else {
                                        a0Var5 = a0Var4;
                                        jVar3 = jVar4;
                                        i25 = i13;
                                        dwVar4 = dwVarI;
                                        function2E = function2;
                                    }
                                } else {
                                    c0VarR.u();
                                    if ((i12 & 32) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i13 &= -29360129;
                                    }
                                    function2E = function2;
                                    jVar3 = jVar2;
                                    i25 = i13;
                                    a0Var5 = a0Var2;
                                    dwVar4 = dwVar2;
                                }
                                androidx.compose.foundation.a1 a1Var3 = a1VarH;
                                boolean z15 = z12;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                                }
                                n(imVar, z10, function4, q3Var, a0Var5, z15, dwVar4, a1Var3, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a1Var2 = a1Var3;
                                dwVar3 = dwVar4;
                                z14 = z15;
                                a0Var3 = a0Var5;
                            } else {
                                c0VarR.u();
                                function2E = function2;
                                a1Var2 = a1VarH;
                                jVar3 = jVar2;
                                a0Var3 = a0Var2;
                                z14 = z12;
                                dwVar3 = dwVar2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var4 = a1VarH;
                            boolean z16 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                            }
                            n(imVar, z10, function4, q3Var, a0Var5, z16, dwVar4, a1Var4, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var4;
                            dwVar3 = dwVar4;
                            z14 = z16;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var5 = a1VarH;
                            boolean z17 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                            }
                            n(imVar, z10, function4, q3Var, a0Var5, z17, dwVar4, a1Var5, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var5;
                            dwVar3 = dwVar4;
                            z14 = z17;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var6 = a1VarH;
                        boolean z18 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z18, dwVar4, a1Var6, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var6;
                        dwVar3 = dwVar4;
                        z14 = z18;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                a0Var2 = a0Var;
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var7 = a1VarH;
                            boolean z19 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                            }
                            n(imVar, z10, function4, q3Var, a0Var5, z19, dwVar4, a1Var7, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var7;
                            dwVar3 = dwVar4;
                            z14 = z19;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var8 = a1VarH;
                        boolean z110 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z110, dwVar4, a1Var8, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var8;
                        dwVar3 = dwVar4;
                        z14 = z110;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var9 = a1VarH;
                        boolean z111 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z111, dwVar4, a1Var9, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var9;
                        dwVar3 = dwVar4;
                        z14 = z111;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var10 = a1VarH;
                    boolean z112 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z112, dwVar4, a1Var10, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var10;
                    dwVar3 = dwVar4;
                    z14 = z112;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var11 = a1VarH;
                            boolean z113 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                            }
                            n(imVar, z10, function4, q3Var, a0Var5, z113, dwVar4, a1Var11, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var11;
                            dwVar3 = dwVar4;
                            z14 = z113;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var12 = a1VarH;
                        boolean z114 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z114, dwVar4, a1Var12, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var12;
                        dwVar3 = dwVar4;
                        z14 = z114;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var13 = a1VarH;
                        boolean z115 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z115, dwVar4, a1Var13, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var13;
                        dwVar3 = dwVar4;
                        z14 = z115;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var14 = a1VarH;
                    boolean z116 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z116, dwVar4, a1Var14, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var14;
                    dwVar3 = dwVar4;
                    z14 = z116;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var15 = a1VarH;
                        boolean z117 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z117, dwVar4, a1Var15, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var15;
                        dwVar3 = dwVar4;
                        z14 = z117;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var16 = a1VarH;
                    boolean z118 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z118, dwVar4, a1Var16, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var16;
                    dwVar3 = dwVar4;
                    z14 = z118;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var17 = a1VarH;
                    boolean z119 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z119, dwVar4, a1Var17, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var17;
                    dwVar3 = dwVar4;
                    z14 = z119;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var18 = a1VarH;
                boolean z1110 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                }
                n(imVar, z10, function4, q3Var, a0Var5, z1110, dwVar4, a1Var18, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var18;
                dwVar3 = dwVar4;
                z14 = z1110;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        function4 = function1;
        if ((i12 & 4) != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(q3Var)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var19 = a1VarH;
                            boolean z1111 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                            }
                            n(imVar, z10, function4, q3Var, a0Var5, z1111, dwVar4, a1Var19, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var19;
                            dwVar3 = dwVar4;
                            z14 = z1111;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var110 = a1VarH;
                        boolean z1112 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z1112, dwVar4, a1Var110, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var110;
                        dwVar3 = dwVar4;
                        z14 = z1112;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var111 = a1VarH;
                        boolean z1113 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z1113, dwVar4, a1Var111, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var111;
                        dwVar3 = dwVar4;
                        z14 = z1113;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var112 = a1VarH;
                    boolean z1114 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z1114, dwVar4, a1Var112, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var112;
                    dwVar3 = dwVar4;
                    z14 = z1114;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var113 = a1VarH;
                        boolean z1115 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z1115, dwVar4, a1Var113, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var113;
                        dwVar3 = dwVar4;
                        z14 = z1115;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var114 = a1VarH;
                    boolean z1116 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z1116, dwVar4, a1Var114, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var114;
                    dwVar3 = dwVar4;
                    z14 = z1116;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var115 = a1VarH;
                    boolean z1117 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z1117, dwVar4, a1Var115, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var115;
                    dwVar3 = dwVar4;
                    z14 = z1117;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var116 = a1VarH;
                boolean z1118 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                }
                n(imVar, z10, function4, q3Var, a0Var5, z1118, dwVar4, a1Var116, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var116;
                dwVar3 = dwVar4;
                z14 = z1118;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        i15 = i12 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var117 = a1VarH;
                        boolean z1119 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                        }
                        n(imVar, z10, function4, q3Var, a0Var5, z1119, dwVar4, a1Var117, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var117;
                        dwVar3 = dwVar4;
                        z14 = z1119;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var118 = a1VarH;
                    boolean z11110 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z11110, dwVar4, a1Var118, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var118;
                    dwVar3 = dwVar4;
                    z14 = z11110;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var119 = a1VarH;
                    boolean z11111 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z11111, dwVar4, a1Var119, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var119;
                    dwVar3 = dwVar4;
                    z14 = z11111;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var1110 = a1VarH;
                boolean z11112 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                }
                n(imVar, z10, function4, q3Var, a0Var5, z11112, dwVar4, a1Var1110, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var1110;
                dwVar3 = dwVar4;
                z14 = z11112;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var1111 = a1VarH;
                    boolean z11113 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                    }
                    n(imVar, z10, function4, q3Var, a0Var5, z11113, dwVar4, a1Var1111, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var1111;
                    dwVar3 = dwVar4;
                    z14 = z11113;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var1112 = a1VarH;
                boolean z11114 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                }
                n(imVar, z10, function4, q3Var, a0Var5, z11114, dwVar4, a1Var1112, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var1112;
                dwVar3 = dwVar4;
                z14 = z11114;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        z12 = z11;
        if ((1572864 & i10) == 0) {
            if ((i12 & 32) == 0) {
                dwVar2 = dwVar;
                if (c0VarR.D(dwVar2)) {
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            i13 |= i27;
        } else {
            dwVar2 = dwVar;
        }
        if ((i10 & 12582912) == 0) {
            a1VarH = a1Var;
            if ((i12 & 64) == 0) {
                i26 = 4194304;
            } else {
                i26 = 4194304;
            }
            i13 |= i26;
        } else {
            a1VarH = a1Var;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 100663296;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar2)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var1113 = a1VarH;
                boolean z11115 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
                }
                n(imVar, z10, function4, q3Var, a0Var5, z11115, dwVar4, a1Var1113, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var1113;
                dwVar3 = dwVar4;
                z14 = z11115;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i12 & 512) != 0) {
            i23 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function3)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i11 | i24;
        } else {
            i23 = i11;
        }
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c0VarR.h(z13, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                } else {
                    dwVarI = dwVar2;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 = (-29360129) & i13;
                }
                if (i19 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i21 != 0) {
                    jVar3 = jVar4;
                    dwVar4 = dwVarI;
                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                    a0Var5 = a0Var4;
                    i25 = i13;
                } else {
                    a0Var5 = a0Var4;
                    jVar3 = jVar4;
                    i25 = i13;
                    dwVar4 = dwVarI;
                    function2E = function2;
                }
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                } else {
                    dwVarI = dwVar2;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 = (-29360129) & i13;
                }
                if (i19 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i21 != 0) {
                    jVar3 = jVar4;
                    dwVar4 = dwVarI;
                    function2E = androidx.compose.runtime.internal.w.e(-1867102712, true, new f(z10), c0VarR, 54);
                    a0Var5 = a0Var4;
                    i25 = i13;
                } else {
                    a0Var5 = a0Var4;
                    jVar3 = jVar4;
                    i25 = i13;
                    dwVar4 = dwVarI;
                    function2E = function2;
                }
            }
            androidx.compose.foundation.a1 a1Var1114 = a1VarH;
            boolean z11116 = z12;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2065856961, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:266)");
            }
            n(imVar, z10, function4, q3Var, a0Var5, z11116, dwVar4, a1Var1114, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a1Var2 = a1Var1114;
            dwVar3 = dwVar4;
            z14 = z11116;
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            function2E = function2;
            a1Var2 = a1VarH;
            jVar3 = jVar2;
            a0Var3 = a0Var2;
            z14 = z12;
            dwVar3 = dwVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.t(imVar, z10, function1, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:131:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:138:0x019a  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01db  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:163:0x0202  */
    /* JADX WARN: Code duplicated, block: B:165:0x0206  */
    /* JADX WARN: Code duplicated, block: B:166:0x0208  */
    /* JADX WARN: Code duplicated, block: B:168:0x020c  */
    /* JADX WARN: Code duplicated, block: B:170:0x022b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0245  */
    /* JADX WARN: Code duplicated, block: B:175:0x024f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0261  */
    /* JADX WARN: Code duplicated, block: B:179:0x026e  */
    /* JADX WARN: Code duplicated, block: B:182:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:184:0x030f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0324  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void n(@NotNull final im imVar, final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @NotNull final androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable dw dwVar, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        androidx.compose.ui.a0 a0Var2;
        int i16;
        int i17;
        final boolean z12;
        int i18;
        final dw dwVarI;
        androidx.compose.foundation.a1 a1VarH;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z13;
        final androidx.compose.foundation.layout.g5 g5Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.layout.g5 g5VarM;
        androidx.compose.foundation.interaction.j jVar3;
        dw dwVar2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        androidx.compose.foundation.a1 a1Var3;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        int i28;
        int i29;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(697872538);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(imVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i13 |= c0VarR.k0(function1) ? 256 : 128;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                i15 = i12 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    i17 = i12 & 16;
                    if (i17 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        z12 = z11;
                    } else {
                        z12 = z11;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.G(z12)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i10 & 1572864) == 0) {
                        dwVarI = dwVar;
                        if ((i12 & 32) == 0 || !c0VarR.D(dwVarI)) {
                            i29 = 524288;
                        } else {
                            i29 = 1048576;
                        }
                        i13 |= i29;
                    } else {
                        dwVarI = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0 || !c0VarR.D(a1VarH)) {
                            i28 = 4194304;
                        } else {
                            i28 = 8388608;
                        }
                        i13 |= i28;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i12 & 1024) != 0) {
                            i24 |= 48;
                        } else if ((i11 & 48) == 0) {
                            if (c0VarR.k0(function3)) {
                                i26 = 32;
                            } else {
                                i26 = 16;
                            }
                            i24 |= i26;
                        }
                        i27 = i24;
                        if ((i13 & 306783379) == 306783378 || (i27 & 19) != 18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 &= -29360129;
                                }
                                if (i19 != 0) {
                                    g5VarM = iw.f29388a.m();
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    androidx.compose.ui.a0 a0Var5 = a0Var4;
                                    dw dwVar3 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                    dwVar2 = dwVar3;
                                    a0Var2 = a0Var5;
                                } else {
                                    a0Var2 = a0Var4;
                                    dwVar2 = dwVarI;
                                    function2E = function2;
                                }
                                a1Var3 = a1VarH;
                            } else {
                                c0VarR.u();
                                if ((i12 & 32) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -29360129;
                                }
                                jVar3 = jVar;
                                z12 = z12;
                                dwVar2 = dwVarI;
                                a1Var3 = a1VarH;
                                g5VarM = g5Var;
                                function2E = function2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1615180959);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                                c0VarR.A();
                            } else {
                                c0VarR.E(640633398);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            long jB = dwVar2.b(z12, z10);
                            long jC = dwVar2.c(z12, z10);
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            androidx.compose.ui.a0 a0VarC = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var6, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                            s3 s3Var = s3.f32666a;
                            androidx.compose.foundation.layout.g5 g5Var3 = g5VarM;
                            dw dwVar4 = dwVar2;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5 = function2E;
                            u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC, s3Var.v(), s3Var.u()), z12, q3Var, jB, jC, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z12 = z12;
                            a1Var2 = a1Var3;
                            jVar2 = jVar3;
                            dwVarI = dwVar4;
                            g5Var2 = g5Var3;
                            function4 = function5;
                            a0Var3 = a0Var6;
                        } else {
                            c0VarR.u();
                            g5Var2 = g5Var;
                            function4 = function2;
                            a1Var2 = a1VarH;
                            a0Var3 = a0Var2;
                            jVar2 = jVar;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var7 = a0Var4;
                                dw dwVar5 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar5;
                                a0Var2 = a0Var7;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var8 = a0Var4;
                                dw dwVar6 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar6;
                                a0Var2 = a0Var8;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1615180959);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(640633398);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB2 = dwVar2.b(z12, z10);
                        long jC2 = dwVar2.c(z12, z10);
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        androidx.compose.ui.a0 a0VarC2 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var9, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var2 = s3.f32666a;
                        androidx.compose.foundation.layout.g5 g5Var4 = g5VarM;
                        dw dwVar7 = dwVar2;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6 = function2E;
                        u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC2, s3Var2.v(), s3Var2.u()), z12, q3Var, jB2, jC2, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar7;
                        g5Var2 = g5Var4;
                        function4 = function6;
                        a0Var3 = a0Var9;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                a0Var2 = a0Var;
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    dwVarI = dwVar;
                    if ((i12 & 32) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i13 |= i29;
                } else {
                    dwVarI = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i28 = 4194304;
                    } else {
                        i28 = 4194304;
                    }
                    i13 |= i28;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var10 = a0Var4;
                                dw dwVar8 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar8;
                                a0Var2 = a0Var10;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var11 = a0Var4;
                                dw dwVar9 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar9;
                                a0Var2 = a0Var11;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1615180959);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(640633398);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB3 = dwVar2.b(z12, z10);
                        long jC3 = dwVar2.c(z12, z10);
                        androidx.compose.ui.a0 a0Var12 = a0Var2;
                        androidx.compose.ui.a0 a0VarC3 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var12, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var3 = s3.f32666a;
                        androidx.compose.foundation.layout.g5 g5Var5 = g5VarM;
                        dw dwVar10 = dwVar2;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7 = function2E;
                        u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC3, s3Var3.v(), s3Var3.u()), z12, q3Var, jB3, jC3, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar10;
                        g5Var2 = g5Var5;
                        function4 = function7;
                        a0Var3 = a0Var12;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var13 = a0Var4;
                            dw dwVar11 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar11;
                            a0Var2 = a0Var13;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var14 = a0Var4;
                            dw dwVar12 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar12;
                            a0Var2 = a0Var14;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1615180959);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(640633398);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB4 = dwVar2.b(z12, z10);
                    long jC4 = dwVar2.c(z12, z10);
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    androidx.compose.ui.a0 a0VarC4 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var15, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var4 = s3.f32666a;
                    androidx.compose.foundation.layout.g5 g5Var6 = g5VarM;
                    dw dwVar13 = dwVar2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function2E;
                    u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC4, s3Var4.v(), s3Var4.u()), z12, q3Var, jB4, jC4, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar13;
                    g5Var2 = g5Var6;
                    function4 = function8;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    dwVarI = dwVar;
                    if ((i12 & 32) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i13 |= i29;
                } else {
                    dwVarI = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i28 = 4194304;
                    } else {
                        i28 = 4194304;
                    }
                    i13 |= i28;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var16 = a0Var4;
                                dw dwVar14 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar14;
                                a0Var2 = a0Var16;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var17 = a0Var4;
                                dw dwVar15 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar15;
                                a0Var2 = a0Var17;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1615180959);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(640633398);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB5 = dwVar2.b(z12, z10);
                        long jC5 = dwVar2.c(z12, z10);
                        androidx.compose.ui.a0 a0Var18 = a0Var2;
                        androidx.compose.ui.a0 a0VarC5 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var18, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var5 = s3.f32666a;
                        androidx.compose.foundation.layout.g5 g5Var7 = g5VarM;
                        dw dwVar16 = dwVar2;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function2E;
                        u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC5, s3Var5.v(), s3Var5.u()), z12, q3Var, jB5, jC5, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar16;
                        g5Var2 = g5Var7;
                        function4 = function9;
                        a0Var3 = a0Var18;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var19 = a0Var4;
                            dw dwVar17 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar17;
                            a0Var2 = a0Var19;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var110 = a0Var4;
                            dw dwVar18 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar18;
                            a0Var2 = a0Var110;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1615180959);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(640633398);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB6 = dwVar2.b(z12, z10);
                    long jC6 = dwVar2.c(z12, z10);
                    androidx.compose.ui.a0 a0Var111 = a0Var2;
                    androidx.compose.ui.a0 a0VarC6 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var111, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var6 = s3.f32666a;
                    androidx.compose.foundation.layout.g5 g5Var8 = g5VarM;
                    dw dwVar19 = dwVar2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function2E;
                    u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC6, s3Var6.v(), s3Var6.u()), z12, q3Var, jB6, jC6, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar19;
                    g5Var2 = g5Var8;
                    function4 = function10;
                    a0Var3 = a0Var111;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                dwVarI = dwVar;
                if ((i12 & 32) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            } else {
                dwVarI = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var112 = a0Var4;
                            dw dwVar110 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar110;
                            a0Var2 = a0Var112;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var113 = a0Var4;
                            dw dwVar111 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar111;
                            a0Var2 = a0Var113;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1615180959);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(640633398);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB7 = dwVar2.b(z12, z10);
                    long jC7 = dwVar2.c(z12, z10);
                    androidx.compose.ui.a0 a0Var114 = a0Var2;
                    androidx.compose.ui.a0 a0VarC7 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var114, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var7 = s3.f32666a;
                    androidx.compose.foundation.layout.g5 g5Var9 = g5VarM;
                    dw dwVar112 = dwVar2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function2E;
                    u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC7, s3Var7.v(), s3Var7.u()), z12, q3Var, jB7, jC7, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar112;
                    g5Var2 = g5Var9;
                    function4 = function11;
                    a0Var3 = a0Var114;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var115 = a0Var4;
                        dw dwVar113 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar113;
                        a0Var2 = a0Var115;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var116 = a0Var4;
                        dw dwVar114 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar114;
                        a0Var2 = a0Var116;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1615180959);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(640633398);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB8 = dwVar2.b(z12, z10);
                long jC8 = dwVar2.c(z12, z10);
                androidx.compose.ui.a0 a0Var117 = a0Var2;
                androidx.compose.ui.a0 a0VarC8 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var117, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var8 = s3.f32666a;
                androidx.compose.foundation.layout.g5 g5Var10 = g5VarM;
                dw dwVar115 = dwVar2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function2E;
                u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC8, s3Var8.v(), s3Var8.u()), z12, q3Var, jB8, jC8, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar115;
                g5Var2 = g5Var10;
                function4 = function12;
                a0Var3 = a0Var117;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        if ((i12 & 4) != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(q3Var)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    dwVarI = dwVar;
                    if ((i12 & 32) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i13 |= i29;
                } else {
                    dwVarI = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i28 = 4194304;
                    } else {
                        i28 = 4194304;
                    }
                    i13 |= i28;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var118 = a0Var4;
                                dw dwVar116 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar116;
                                a0Var2 = a0Var118;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                androidx.compose.ui.a0 a0Var119 = a0Var4;
                                dw dwVar117 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                                dwVar2 = dwVar117;
                                a0Var2 = a0Var119;
                            } else {
                                a0Var2 = a0Var4;
                                dwVar2 = dwVarI;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1615180959);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(640633398);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB9 = dwVar2.b(z12, z10);
                        long jC9 = dwVar2.c(z12, z10);
                        androidx.compose.ui.a0 a0Var1110 = a0Var2;
                        androidx.compose.ui.a0 a0VarC9 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var1110, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var9 = s3.f32666a;
                        androidx.compose.foundation.layout.g5 g5Var11 = g5VarM;
                        dw dwVar118 = dwVar2;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function2E;
                        u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC9, s3Var9.v(), s3Var9.u()), z12, q3Var, jB9, jC9, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar118;
                        g5Var2 = g5Var11;
                        function4 = function13;
                        a0Var3 = a0Var1110;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var1111 = a0Var4;
                            dw dwVar119 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar119;
                            a0Var2 = a0Var1111;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var1112 = a0Var4;
                            dw dwVar1110 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar1110;
                            a0Var2 = a0Var1112;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1615180959);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(640633398);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB10 = dwVar2.b(z12, z10);
                    long jC10 = dwVar2.c(z12, z10);
                    androidx.compose.ui.a0 a0Var1113 = a0Var2;
                    androidx.compose.ui.a0 a0VarC10 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var1113, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var10 = s3.f32666a;
                    androidx.compose.foundation.layout.g5 g5Var12 = g5VarM;
                    dw dwVar1111 = dwVar2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function2E;
                    u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC10, s3Var10.v(), s3Var10.u()), z12, q3Var, jB10, jC10, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar1111;
                    g5Var2 = g5Var12;
                    function4 = function14;
                    a0Var3 = a0Var1113;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                dwVarI = dwVar;
                if ((i12 & 32) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            } else {
                dwVarI = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var1114 = a0Var4;
                            dw dwVar1112 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar1112;
                            a0Var2 = a0Var1114;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var1115 = a0Var4;
                            dw dwVar1113 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar1113;
                            a0Var2 = a0Var1115;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1615180959);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(640633398);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB11 = dwVar2.b(z12, z10);
                    long jC11 = dwVar2.c(z12, z10);
                    androidx.compose.ui.a0 a0Var1116 = a0Var2;
                    androidx.compose.ui.a0 a0VarC11 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var1116, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var11 = s3.f32666a;
                    androidx.compose.foundation.layout.g5 g5Var13 = g5VarM;
                    dw dwVar1114 = dwVar2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function2E;
                    u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC11, s3Var11.v(), s3Var11.u()), z12, q3Var, jB11, jC11, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar1114;
                    g5Var2 = g5Var13;
                    function4 = function15;
                    a0Var3 = a0Var1116;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var1117 = a0Var4;
                        dw dwVar1115 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar1115;
                        a0Var2 = a0Var1117;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var1118 = a0Var4;
                        dw dwVar1116 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar1116;
                        a0Var2 = a0Var1118;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1615180959);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(640633398);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB12 = dwVar2.b(z12, z10);
                long jC12 = dwVar2.c(z12, z10);
                androidx.compose.ui.a0 a0Var1119 = a0Var2;
                androidx.compose.ui.a0 a0VarC12 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var1119, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var12 = s3.f32666a;
                androidx.compose.foundation.layout.g5 g5Var14 = g5VarM;
                dw dwVar1117 = dwVar2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function2E;
                u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC12, s3Var12.v(), s3Var12.u()), z12, q3Var, jB12, jC12, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar1117;
                g5Var2 = g5Var14;
                function4 = function16;
                a0Var3 = a0Var1119;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        i15 = i12 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                dwVarI = dwVar;
                if ((i12 & 32) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            } else {
                dwVarI = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var11110 = a0Var4;
                            dw dwVar1118 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar1118;
                            a0Var2 = a0Var11110;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            androidx.compose.ui.a0 a0Var11111 = a0Var4;
                            dw dwVar1119 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                            dwVar2 = dwVar1119;
                            a0Var2 = a0Var11111;
                        } else {
                            a0Var2 = a0Var4;
                            dwVar2 = dwVarI;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1615180959);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(640633398);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB13 = dwVar2.b(z12, z10);
                    long jC13 = dwVar2.c(z12, z10);
                    androidx.compose.ui.a0 a0Var11112 = a0Var2;
                    androidx.compose.ui.a0 a0VarC13 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var11112, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var13 = s3.f32666a;
                    androidx.compose.foundation.layout.g5 g5Var15 = g5VarM;
                    dw dwVar11110 = dwVar2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function2E;
                    u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC13, s3Var13.v(), s3Var13.u()), z12, q3Var, jB13, jC13, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar11110;
                    g5Var2 = g5Var15;
                    function4 = function17;
                    a0Var3 = a0Var11112;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var11113 = a0Var4;
                        dw dwVar11111 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar11111;
                        a0Var2 = a0Var11113;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var11114 = a0Var4;
                        dw dwVar11112 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar11112;
                        a0Var2 = a0Var11114;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1615180959);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(640633398);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB14 = dwVar2.b(z12, z10);
                long jC14 = dwVar2.c(z12, z10);
                androidx.compose.ui.a0 a0Var11115 = a0Var2;
                androidx.compose.ui.a0 a0VarC14 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var11115, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var14 = s3.f32666a;
                androidx.compose.foundation.layout.g5 g5Var16 = g5VarM;
                dw dwVar11113 = dwVar2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function2E;
                u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC14, s3Var14.v(), s3Var14.u()), z12, q3Var, jB14, jC14, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar11113;
                g5Var2 = g5Var16;
                function4 = function18;
                a0Var3 = a0Var11115;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        i17 = i12 & 16;
        if (i17 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        if ((i10 & 1572864) == 0) {
            dwVarI = dwVar;
            if ((i12 & 32) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i13 |= i29;
        } else {
            dwVarI = dwVar;
        }
        if ((i10 & 12582912) == 0) {
            a1VarH = a1Var;
            if ((i12 & 64) == 0) {
                i28 = 4194304;
            } else {
                i28 = 4194304;
            }
            i13 |= i28;
        } else {
            a1VarH = a1Var;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(g5Var)) {
                i20 = 67108864;
            } else {
                i20 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.D(jVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var11116 = a0Var4;
                        dw dwVar11114 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar11114;
                        a0Var2 = a0Var11116;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        androidx.compose.ui.a0 a0Var11117 = a0Var4;
                        dw dwVar11115 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                        dwVar2 = dwVar11115;
                        a0Var2 = a0Var11117;
                    } else {
                        a0Var2 = a0Var4;
                        dwVar2 = dwVarI;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1615180959);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(640633398);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB15 = dwVar2.b(z12, z10);
                long jC15 = dwVar2.c(z12, z10);
                androidx.compose.ui.a0 a0Var11118 = a0Var2;
                androidx.compose.ui.a0 a0VarC15 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var11118, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var15 = s3.f32666a;
                androidx.compose.foundation.layout.g5 g5Var17 = g5VarM;
                dw dwVar11116 = dwVar2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function2E;
                u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC15, s3Var15.v(), s3Var15.u()), z12, q3Var, jB15, jC15, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar11116;
                g5Var2 = g5Var17;
                function4 = function19;
                a0Var3 = a0Var11118;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i23 = i12 & 512;
        if (i23 != 0) {
            i24 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function2)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i11 | i25;
        } else {
            i24 = i11;
        }
        if ((i12 & 1024) != 0) {
            i24 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c0VarR.k0(function3)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i24 |= i26;
        }
        i27 = i24;
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c0VarR.h(z13, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 &= -29360129;
                }
                if (i19 != 0) {
                    g5VarM = iw.f29388a.m();
                } else {
                    g5VarM = g5Var;
                }
                if (i21 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i23 != 0) {
                    androidx.compose.ui.a0 a0Var11119 = a0Var4;
                    dw dwVar11117 = dwVarI;
                    function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                    dwVar2 = dwVar11117;
                    a0Var2 = a0Var11119;
                } else {
                    a0Var2 = a0Var4;
                    dwVar2 = dwVarI;
                    function2E = function2;
                }
                a1Var3 = a1VarH;
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 &= -29360129;
                }
                if (i19 != 0) {
                    g5VarM = iw.f29388a.m();
                } else {
                    g5VarM = g5Var;
                }
                if (i21 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i23 != 0) {
                    androidx.compose.ui.a0 a0Var111110 = a0Var4;
                    dw dwVar11118 = dwVarI;
                    function2E = androidx.compose.runtime.internal.w.e(1181873313, true, new b(z10), c0VarR, 54);
                    dwVar2 = dwVar11118;
                    a0Var2 = a0Var111110;
                } else {
                    a0Var2 = a0Var4;
                    dwVar2 = dwVarI;
                    function2E = function2;
                }
                a1Var3 = a1VarH;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(697872538, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:142)");
            }
            if (jVar3 == null) {
                c0VarR.E(-1615180959);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                c0VarR.A();
            } else {
                c0VarR.E(640633398);
                c0VarR.A();
                jVar4 = jVar3;
            }
            long jB16 = dwVar2.b(z12, z10);
            long jC16 = dwVar2.c(z12, z10);
            androidx.compose.ui.a0 a0Var111111 = a0Var2;
            androidx.compose.ui.a0 a0VarC16 = C(androidx.compose.foundation.layout.x5.q(imVar, a0Var111111, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
            s3 s3Var16 = s3.f32666a;
            androidx.compose.foundation.layout.g5 g5Var18 = g5VarM;
            dw dwVar11119 = dwVar2;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function2E;
            u10.e(z10, function1, androidx.compose.foundation.layout.i6.a(a0VarC16, s3Var16.v(), s3Var16.u()), z12, q3Var, jB16, jC16, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(1717860164, true, new c(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | (1879048192 & (i13 << 6)), 48, androidx.media3.exoplayer.a5.S0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z12 = z12;
            a1Var2 = a1Var3;
            jVar2 = jVar3;
            dwVarI = dwVar11119;
            g5Var2 = g5Var18;
            function4 = function110;
            a0Var3 = a0Var111111;
        } else {
            c0VarR.u();
            g5Var2 = g5Var;
            function4 = function2;
            a1Var2 = a1VarH;
            a0Var3 = a0Var2;
            jVar2 = jVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.kw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.q(imVar, z10, function1, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:162:0x0207  */
    /* JADX WARN: Code duplicated, block: B:165:0x0258  */
    /* JADX WARN: Code duplicated, block: B:167:0x0262  */
    /* JADX WARN: Code duplicated, block: B:170:0x0273  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "kept for binary compatibility")
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final /* synthetic */ void o(final gy gyVar, final boolean z10, final Function0 function0, final androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.a0 a0Var, boolean z11, dw dwVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, final Function2 function3, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        Function0 function1;
        int i14;
        int i15;
        androidx.compose.ui.a0 a0Var2;
        int i16;
        int i17;
        boolean z12;
        int i18;
        dw dwVar2;
        androidx.compose.foundation.a1 a1VarH;
        int i19;
        androidx.compose.foundation.interaction.j jVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        final Function2 function2E;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final dw dwVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        dw dwVarI;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.ui.a0 a0Var5;
        int i25;
        dw dwVar4;
        int i26;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1723786701);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(gyVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function1 = function0;
                i13 |= c0VarR.k0(function1) ? 256 : 128;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                i15 = i12 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    i17 = i12 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            z12 = z11;
                            if (c0VarR.G(z12)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i13 |= i18;
                        }
                        if ((1572864 & i10) == 0) {
                            if ((i12 & 32) == 0) {
                                dwVar2 = dwVar;
                                int i27 = c0VarR.D(dwVar2) ? 1048576 : 524288;
                                i13 |= i27;
                            } else {
                                dwVar2 = dwVar;
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        if ((i10 & 12582912) == 0) {
                            a1VarH = a1Var;
                            if ((i12 & 64) == 0 || !c0VarR.D(a1VarH)) {
                                i26 = 4194304;
                            } else {
                                i26 = 8388608;
                            }
                            i13 |= i26;
                        } else {
                            a1VarH = a1Var;
                        }
                        i19 = i12 & 128;
                        if (i19 != 0) {
                            i13 |= 100663296;
                            jVar2 = jVar;
                        } else {
                            jVar2 = jVar;
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.D(jVar2)) {
                                    i20 = 67108864;
                                } else {
                                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i20;
                            }
                        }
                        i21 = i12 & 256;
                        if (i21 != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c0VarR.k0(function2)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                                i13 |= i22;
                            }
                            if ((i12 & 512) != 0) {
                                i23 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.k0(function3)) {
                                    i24 = 4;
                                } else {
                                    i24 = 2;
                                }
                                i23 = i11 | i24;
                            } else {
                                i23 = i11;
                            }
                            if ((i13 & 306783379) == 306783378 || (i23 & 3) != 2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i15 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i17 != 0) {
                                        z12 = true;
                                    }
                                    if ((i12 & 32) != 0) {
                                        dwVarI = iw.f29388a.i(c0VarR, 6);
                                        i13 &= -3670017;
                                    } else {
                                        dwVarI = dwVar2;
                                    }
                                    if ((i12 & 64) != 0) {
                                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                        i13 = (-29360129) & i13;
                                    }
                                    if (i19 != 0) {
                                        jVar4 = null;
                                    } else {
                                        jVar4 = jVar2;
                                    }
                                    if (i21 != 0) {
                                        jVar3 = jVar4;
                                        dwVar4 = dwVarI;
                                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                        a0Var5 = a0Var4;
                                        i25 = i13;
                                    } else {
                                        a0Var5 = a0Var4;
                                        jVar3 = jVar4;
                                        i25 = i13;
                                        dwVar4 = dwVarI;
                                        function2E = function2;
                                    }
                                } else {
                                    c0VarR.u();
                                    if ((i12 & 32) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i13 &= -29360129;
                                    }
                                    function2E = function2;
                                    jVar3 = jVar2;
                                    i25 = i13;
                                    a0Var5 = a0Var2;
                                    dwVar4 = dwVar2;
                                }
                                androidx.compose.foundation.a1 a1Var3 = a1VarH;
                                boolean z15 = z12;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                                }
                                p(gyVar, z10, function1, q3Var, a0Var5, z15, dwVar4, a1Var3, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a1Var2 = a1Var3;
                                dwVar3 = dwVar4;
                                z14 = z15;
                                a0Var3 = a0Var5;
                            } else {
                                c0VarR.u();
                                function2E = function2;
                                a1Var2 = a1VarH;
                                jVar3 = jVar2;
                                a0Var3 = a0Var2;
                                z14 = z12;
                                dwVar3 = dwVar2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var4 = a1VarH;
                            boolean z16 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                            }
                            p(gyVar, z10, function1, q3Var, a0Var5, z16, dwVar4, a1Var4, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var4;
                            dwVar3 = dwVar4;
                            z14 = z16;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var5 = a1VarH;
                            boolean z17 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                            }
                            p(gyVar, z10, function1, q3Var, a0Var5, z17, dwVar4, a1Var5, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var5;
                            dwVar3 = dwVar4;
                            z14 = z17;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var6 = a1VarH;
                        boolean z18 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z18, dwVar4, a1Var6, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var6;
                        dwVar3 = dwVar4;
                        z14 = z18;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                a0Var2 = a0Var;
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var7 = a1VarH;
                            boolean z19 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                            }
                            p(gyVar, z10, function1, q3Var, a0Var5, z19, dwVar4, a1Var7, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var7;
                            dwVar3 = dwVar4;
                            z14 = z19;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var8 = a1VarH;
                        boolean z110 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z110, dwVar4, a1Var8, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var8;
                        dwVar3 = dwVar4;
                        z14 = z110;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var9 = a1VarH;
                        boolean z111 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z111, dwVar4, a1Var9, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var9;
                        dwVar3 = dwVar4;
                        z14 = z111;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var10 = a1VarH;
                    boolean z112 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z112, dwVar4, a1Var10, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var10;
                    dwVar3 = dwVar4;
                    z14 = z112;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var11 = a1VarH;
                            boolean z113 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                            }
                            p(gyVar, z10, function1, q3Var, a0Var5, z113, dwVar4, a1Var11, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var11;
                            dwVar3 = dwVar4;
                            z14 = z113;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var12 = a1VarH;
                        boolean z114 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z114, dwVar4, a1Var12, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var12;
                        dwVar3 = dwVar4;
                        z14 = z114;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var13 = a1VarH;
                        boolean z115 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z115, dwVar4, a1Var13, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var13;
                        dwVar3 = dwVar4;
                        z14 = z115;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var14 = a1VarH;
                    boolean z116 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z116, dwVar4, a1Var14, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var14;
                    dwVar3 = dwVar4;
                    z14 = z116;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var15 = a1VarH;
                        boolean z117 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z117, dwVar4, a1Var15, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var15;
                        dwVar3 = dwVar4;
                        z14 = z117;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var16 = a1VarH;
                    boolean z118 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z118, dwVar4, a1Var16, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var16;
                    dwVar3 = dwVar4;
                    z14 = z118;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var17 = a1VarH;
                    boolean z119 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z119, dwVar4, a1Var17, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var17;
                    dwVar3 = dwVar4;
                    z14 = z119;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var18 = a1VarH;
                boolean z1110 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                }
                p(gyVar, z10, function1, q3Var, a0Var5, z1110, dwVar4, a1Var18, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var18;
                dwVar3 = dwVar4;
                z14 = z1110;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        function1 = function0;
        if ((i12 & 4) != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(q3Var)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i12 & 32) == 0) {
                            dwVar2 = dwVar;
                            if (c0VarR.D(dwVar2)) {
                            }
                            i13 |= i27;
                        } else {
                            dwVar2 = dwVar;
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i13 |= i26;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i23 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function3)) {
                                i24 = 4;
                            } else {
                                i24 = 2;
                            }
                            i23 = i11 | i24;
                        } else {
                            i23 = i11;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            } else {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                } else {
                                    dwVarI = dwVar2;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 = (-29360129) & i13;
                                }
                                if (i19 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i21 != 0) {
                                    jVar3 = jVar4;
                                    dwVar4 = dwVarI;
                                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                    a0Var5 = a0Var4;
                                    i25 = i13;
                                } else {
                                    a0Var5 = a0Var4;
                                    jVar3 = jVar4;
                                    i25 = i13;
                                    dwVar4 = dwVarI;
                                    function2E = function2;
                                }
                            }
                            androidx.compose.foundation.a1 a1Var19 = a1VarH;
                            boolean z1111 = z12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                            }
                            p(gyVar, z10, function1, q3Var, a0Var5, z1111, dwVar4, a1Var19, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a1Var2 = a1Var19;
                            dwVar3 = dwVar4;
                            z14 = z1111;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            function2E = function2;
                            a1Var2 = a1VarH;
                            jVar3 = jVar2;
                            a0Var3 = a0Var2;
                            z14 = z12;
                            dwVar3 = dwVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var110 = a1VarH;
                        boolean z1112 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z1112, dwVar4, a1Var110, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var110;
                        dwVar3 = dwVar4;
                        z14 = z1112;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var111 = a1VarH;
                        boolean z1113 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z1113, dwVar4, a1Var111, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var111;
                        dwVar3 = dwVar4;
                        z14 = z1113;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var112 = a1VarH;
                    boolean z1114 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z1114, dwVar4, a1Var112, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var112;
                    dwVar3 = dwVar4;
                    z14 = z1114;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var113 = a1VarH;
                        boolean z1115 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z1115, dwVar4, a1Var113, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var113;
                        dwVar3 = dwVar4;
                        z14 = z1115;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var114 = a1VarH;
                    boolean z1116 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z1116, dwVar4, a1Var114, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var114;
                    dwVar3 = dwVar4;
                    z14 = z1116;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var115 = a1VarH;
                    boolean z1117 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z1117, dwVar4, a1Var115, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var115;
                    dwVar3 = dwVar4;
                    z14 = z1117;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var116 = a1VarH;
                boolean z1118 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                }
                p(gyVar, z10, function1, q3Var, a0Var5, z1118, dwVar4, a1Var116, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var116;
                dwVar3 = dwVar4;
                z14 = z1118;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        i15 = i12 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i12 & 32) == 0) {
                        dwVar2 = dwVar;
                        if (c0VarR.D(dwVar2)) {
                        }
                        i13 |= i27;
                    } else {
                        dwVar2 = dwVar;
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i13 |= i26;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i23 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function3)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i11 | i24;
                    } else {
                        i23 = i11;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            } else {
                                dwVarI = dwVar2;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 = (-29360129) & i13;
                            }
                            if (i19 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i21 != 0) {
                                jVar3 = jVar4;
                                dwVar4 = dwVarI;
                                function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                                a0Var5 = a0Var4;
                                i25 = i13;
                            } else {
                                a0Var5 = a0Var4;
                                jVar3 = jVar4;
                                i25 = i13;
                                dwVar4 = dwVarI;
                                function2E = function2;
                            }
                        }
                        androidx.compose.foundation.a1 a1Var117 = a1VarH;
                        boolean z1119 = z12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                        }
                        p(gyVar, z10, function1, q3Var, a0Var5, z1119, dwVar4, a1Var117, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a1Var2 = a1Var117;
                        dwVar3 = dwVar4;
                        z14 = z1119;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        function2E = function2;
                        a1Var2 = a1VarH;
                        jVar3 = jVar2;
                        a0Var3 = a0Var2;
                        z14 = z12;
                        dwVar3 = dwVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var118 = a1VarH;
                    boolean z11110 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z11110, dwVar4, a1Var118, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var118;
                    dwVar3 = dwVar4;
                    z14 = z11110;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var119 = a1VarH;
                    boolean z11111 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z11111, dwVar4, a1Var119, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var119;
                    dwVar3 = dwVar4;
                    z14 = z11111;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var1110 = a1VarH;
                boolean z11112 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                }
                p(gyVar, z10, function1, q3Var, a0Var5, z11112, dwVar4, a1Var1110, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var1110;
                dwVar3 = dwVar4;
                z14 = z11112;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((1572864 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    dwVar2 = dwVar;
                    if (c0VarR.D(dwVar2)) {
                    }
                    i13 |= i27;
                } else {
                    dwVar2 = dwVar;
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i13 |= i26;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function3)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        } else {
                            dwVarI = dwVar2;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 = (-29360129) & i13;
                        }
                        if (i19 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i21 != 0) {
                            jVar3 = jVar4;
                            dwVar4 = dwVarI;
                            function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                            a0Var5 = a0Var4;
                            i25 = i13;
                        } else {
                            a0Var5 = a0Var4;
                            jVar3 = jVar4;
                            i25 = i13;
                            dwVar4 = dwVarI;
                            function2E = function2;
                        }
                    }
                    androidx.compose.foundation.a1 a1Var1111 = a1VarH;
                    boolean z11113 = z12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                    }
                    p(gyVar, z10, function1, q3Var, a0Var5, z11113, dwVar4, a1Var1111, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a1Var2 = a1Var1111;
                    dwVar3 = dwVar4;
                    z14 = z11113;
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    function2E = function2;
                    a1Var2 = a1VarH;
                    jVar3 = jVar2;
                    a0Var3 = a0Var2;
                    z14 = z12;
                    dwVar3 = dwVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var1112 = a1VarH;
                boolean z11114 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                }
                p(gyVar, z10, function1, q3Var, a0Var5, z11114, dwVar4, a1Var1112, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var1112;
                dwVar3 = dwVar4;
                z14 = z11114;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        z12 = z11;
        if ((1572864 & i10) == 0) {
            if ((i12 & 32) == 0) {
                dwVar2 = dwVar;
                if (c0VarR.D(dwVar2)) {
                }
                i13 |= i27;
            } else {
                dwVar2 = dwVar;
            }
            i13 |= i27;
        } else {
            dwVar2 = dwVar;
        }
        if ((i10 & 12582912) == 0) {
            a1VarH = a1Var;
            if ((i12 & 64) == 0) {
                i26 = 4194304;
            } else {
                i26 = 4194304;
            }
            i13 |= i26;
        } else {
            a1VarH = a1Var;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 100663296;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar2)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            if ((i12 & 512) != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    } else {
                        dwVarI = dwVar2;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 = (-29360129) & i13;
                    }
                    if (i19 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i21 != 0) {
                        jVar3 = jVar4;
                        dwVar4 = dwVarI;
                        function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                        a0Var5 = a0Var4;
                        i25 = i13;
                    } else {
                        a0Var5 = a0Var4;
                        jVar3 = jVar4;
                        i25 = i13;
                        dwVar4 = dwVarI;
                        function2E = function2;
                    }
                }
                androidx.compose.foundation.a1 a1Var1113 = a1VarH;
                boolean z11115 = z12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
                }
                p(gyVar, z10, function1, q3Var, a0Var5, z11115, dwVar4, a1Var1113, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a1Var2 = a1Var1113;
                dwVar3 = dwVar4;
                z14 = z11115;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                function2E = function2;
                a1Var2 = a1VarH;
                jVar3 = jVar2;
                a0Var3 = a0Var2;
                z14 = z12;
                dwVar3 = dwVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i12 & 512) != 0) {
            i23 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function3)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i11 | i24;
        } else {
            i23 = i11;
        }
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c0VarR.h(z13, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                } else {
                    dwVarI = dwVar2;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 = (-29360129) & i13;
                }
                if (i19 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i21 != 0) {
                    jVar3 = jVar4;
                    dwVar4 = dwVarI;
                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                    a0Var5 = a0Var4;
                    i25 = i13;
                } else {
                    a0Var5 = a0Var4;
                    jVar3 = jVar4;
                    i25 = i13;
                    dwVar4 = dwVarI;
                    function2E = function2;
                }
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                } else {
                    dwVarI = dwVar2;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 = (-29360129) & i13;
                }
                if (i19 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (i21 != 0) {
                    jVar3 = jVar4;
                    dwVar4 = dwVarI;
                    function2E = androidx.compose.runtime.internal.w.e(61121126, true, new a(z10), c0VarR, 54);
                    a0Var5 = a0Var4;
                    i25 = i13;
                } else {
                    a0Var5 = a0Var4;
                    jVar3 = jVar4;
                    i25 = i13;
                    dwVar4 = dwVarI;
                    function2E = function2;
                }
            }
            androidx.compose.foundation.a1 a1Var1114 = a1VarH;
            boolean z11116 = z12;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1723786701, i25, i23, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:296)");
            }
            p(gyVar, z10, function1, q3Var, a0Var5, z11116, dwVar4, a1Var1114, iw.f29388a.m(), jVar3, function2E, function3, c0VarR, ((i25 << 3) & 1879048192) | (i25 & 14) | 100663296 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25), ((i25 >> 27) & 14) | ((i23 << 3) & com.planner5d.library.engine.input.f.b.B), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a1Var2 = a1Var1114;
            dwVar3 = dwVar4;
            z14 = z11116;
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            function2E = function2;
            a1Var2 = a1VarH;
            jVar3 = jVar2;
            a0Var3 = a0Var2;
            z14 = z12;
            dwVar3 = dwVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.u(gyVar, z10, function0, q3Var, a0Var3, z14, dwVar3, a1Var2, jVar3, function2E, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01db  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x0200  */
    /* JADX WARN: Code duplicated, block: B:163:0x0207  */
    /* JADX WARN: Code duplicated, block: B:165:0x020b  */
    /* JADX WARN: Code duplicated, block: B:166:0x020d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0213  */
    /* JADX WARN: Code duplicated, block: B:170:0x0234  */
    /* JADX WARN: Code duplicated, block: B:173:0x0251  */
    /* JADX WARN: Code duplicated, block: B:175:0x025b  */
    /* JADX WARN: Code duplicated, block: B:177:0x026d  */
    /* JADX WARN: Code duplicated, block: B:179:0x027a  */
    /* JADX WARN: Code duplicated, block: B:182:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:185:0x0325  */
    /* JADX WARN: Code duplicated, block: B:187:0x033c  */
    /* JADX WARN: Code duplicated, block: B:190:0x034d  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void p(@NotNull final gy gyVar, final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable dw dwVar, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i14;
        int i15;
        androidx.compose.ui.a0 a0Var2;
        int i16;
        int i17;
        final boolean z12;
        int i18;
        final dw dwVarI;
        androidx.compose.foundation.a1 a1VarH;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z13;
        final androidx.compose.foundation.layout.g5 g5Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.layout.g5 g5VarM;
        androidx.compose.foundation.interaction.j jVar3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        androidx.compose.foundation.a1 a1Var3;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        Object objI1;
        int i28;
        int i29;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1532041126);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(gyVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i13 |= c0VarR.k0(function0) ? 256 : 128;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & 3072) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                i15 = i12 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    i17 = i12 & 16;
                    if (i17 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        z12 = z11;
                    } else {
                        z12 = z11;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.G(z12)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i10 & 1572864) == 0) {
                        dwVarI = dwVar;
                        if ((i12 & 32) == 0 || !c0VarR.D(dwVarI)) {
                            i29 = 524288;
                        } else {
                            i29 = 1048576;
                        }
                        i13 |= i29;
                    } else {
                        dwVarI = dwVar;
                    }
                    if ((i10 & 12582912) == 0) {
                        a1VarH = a1Var;
                        if ((i12 & 64) == 0 || !c0VarR.D(a1VarH)) {
                            i28 = 4194304;
                        } else {
                            i28 = 8388608;
                        }
                        i13 |= i28;
                    } else {
                        a1VarH = a1Var;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i24 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function2)) {
                                i25 = 4;
                            } else {
                                i25 = 2;
                            }
                            i24 = i11 | i25;
                        } else {
                            i24 = i11;
                        }
                        if ((i12 & 1024) != 0) {
                            i24 |= 48;
                        } else if ((i11 & 48) == 0) {
                            if (c0VarR.k0(function3)) {
                                i26 = 32;
                            } else {
                                i26 = 16;
                            }
                            i24 |= i26;
                        }
                        i27 = i24;
                        if ((i13 & 306783379) == 306783378 || (i27 & 19) != 18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i15 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i17 != 0) {
                                    z12 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    dwVarI = iw.f29388a.i(c0VarR, 6);
                                    i13 &= -3670017;
                                }
                                if ((i12 & 64) != 0) {
                                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                    i13 &= -29360129;
                                }
                                if (i19 != 0) {
                                    g5VarM = iw.f29388a.m();
                                } else {
                                    g5VarM = g5Var;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    a0Var2 = a0Var4;
                                    function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                                } else {
                                    a0Var2 = a0Var4;
                                    function2E = function2;
                                }
                                a1Var3 = a1VarH;
                            } else {
                                c0VarR.u();
                                if ((i12 & 32) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -29360129;
                                }
                                jVar3 = jVar;
                                z12 = z12;
                                dwVarI = dwVarI;
                                a1Var3 = a1VarH;
                                g5VarM = g5Var;
                                function2E = function2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                            }
                            if (jVar3 == null) {
                                c0VarR.E(-1579561419);
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI1);
                                }
                                jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                                c0VarR.A();
                            } else {
                                c0VarR.E(-882238238);
                                c0VarR.A();
                                jVar4 = jVar3;
                            }
                            long jB = dwVarI.b(z12, z10);
                            long jC = dwVarI.c(z12, z10);
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            androidx.compose.ui.a0 a0VarC = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var5, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                            s3 s3Var = s3.f32666a;
                            androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.a(a0VarC, s3Var.v(), s3Var.u());
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.nw
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return tw.r((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.foundation.layout.g5 g5Var3 = g5VarM;
                            dw dwVar2 = dwVarI;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5 = function2E;
                            u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA, false, (Function1) objI0, 1, null), z12, q3Var2, jB, jC, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z12 = z12;
                            a1Var2 = a1Var3;
                            jVar2 = jVar3;
                            dwVarI = dwVar2;
                            function4 = function5;
                            g5Var2 = g5Var3;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            g5Var2 = g5Var;
                            function4 = function2;
                            a1Var2 = a1VarH;
                            a0Var3 = a0Var2;
                            jVar2 = jVar;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1579561419);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI1);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-882238238);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB2 = dwVarI.b(z12, z10);
                        long jC2 = dwVarI.c(z12, z10);
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        androidx.compose.ui.a0 a0VarC2 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var6, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var2 = s3.f32666a;
                        androidx.compose.ui.a0 a0VarA2 = androidx.compose.foundation.layout.i6.a(a0VarC2, s3Var2.v(), s3Var2.u());
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.nw
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return tw.r((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g5 g5Var4 = g5VarM;
                        dw dwVar3 = dwVarI;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6 = function2E;
                        u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA2, false, (Function1) objI0, 1, null), z12, q3Var2, jB2, jC2, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar3;
                        function4 = function6;
                        g5Var2 = g5Var4;
                        a0Var3 = a0Var6;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                a0Var2 = a0Var;
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    dwVarI = dwVar;
                    if ((i12 & 32) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i13 |= i29;
                } else {
                    dwVarI = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i28 = 4194304;
                    } else {
                        i28 = 4194304;
                    }
                    i13 |= i28;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1579561419);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI1);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-882238238);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB3 = dwVarI.b(z12, z10);
                        long jC3 = dwVarI.c(z12, z10);
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        androidx.compose.ui.a0 a0VarC3 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var7, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var3 = s3.f32666a;
                        androidx.compose.ui.a0 a0VarA3 = androidx.compose.foundation.layout.i6.a(a0VarC3, s3Var3.v(), s3Var3.u());
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.nw
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return tw.r((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g5 g5Var5 = g5VarM;
                        dw dwVar4 = dwVarI;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7 = function2E;
                        u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA3, false, (Function1) objI0, 1, null), z12, q3Var2, jB3, jC3, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar4;
                        function4 = function7;
                        g5Var2 = g5Var5;
                        a0Var3 = a0Var7;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1579561419);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-882238238);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB4 = dwVarI.b(z12, z10);
                    long jC4 = dwVarI.c(z12, z10);
                    androidx.compose.ui.a0 a0Var8 = a0Var2;
                    androidx.compose.ui.a0 a0VarC4 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var8, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var4 = s3.f32666a;
                    androidx.compose.ui.a0 a0VarA4 = androidx.compose.foundation.layout.i6.a(a0VarC4, s3Var4.v(), s3Var4.u());
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.nw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return tw.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g5 g5Var6 = g5VarM;
                    dw dwVar5 = dwVarI;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function2E;
                    u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA4, false, (Function1) objI0, 1, null), z12, q3Var2, jB4, jC4, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar5;
                    function4 = function8;
                    g5Var2 = g5Var6;
                    a0Var3 = a0Var8;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            q3Var2 = q3Var;
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    dwVarI = dwVar;
                    if ((i12 & 32) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i13 |= i29;
                } else {
                    dwVarI = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i28 = 4194304;
                    } else {
                        i28 = 4194304;
                    }
                    i13 |= i28;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1579561419);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI1);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-882238238);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB5 = dwVarI.b(z12, z10);
                        long jC5 = dwVarI.c(z12, z10);
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        androidx.compose.ui.a0 a0VarC5 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var9, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var5 = s3.f32666a;
                        androidx.compose.ui.a0 a0VarA5 = androidx.compose.foundation.layout.i6.a(a0VarC5, s3Var5.v(), s3Var5.u());
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.nw
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return tw.r((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g5 g5Var7 = g5VarM;
                        dw dwVar6 = dwVarI;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function2E;
                        u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA5, false, (Function1) objI0, 1, null), z12, q3Var2, jB5, jC5, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar6;
                        function4 = function9;
                        g5Var2 = g5Var7;
                        a0Var3 = a0Var9;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1579561419);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-882238238);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB6 = dwVarI.b(z12, z10);
                    long jC6 = dwVarI.c(z12, z10);
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    androidx.compose.ui.a0 a0VarC6 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var10, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var6 = s3.f32666a;
                    androidx.compose.ui.a0 a0VarA6 = androidx.compose.foundation.layout.i6.a(a0VarC6, s3Var6.v(), s3Var6.u());
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.nw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return tw.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g5 g5Var8 = g5VarM;
                    dw dwVar7 = dwVarI;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function2E;
                    u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA6, false, (Function1) objI0, 1, null), z12, q3Var2, jB6, jC6, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar7;
                    function4 = function10;
                    g5Var2 = g5Var8;
                    a0Var3 = a0Var10;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                dwVarI = dwVar;
                if ((i12 & 32) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            } else {
                dwVarI = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1579561419);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-882238238);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB7 = dwVarI.b(z12, z10);
                    long jC7 = dwVarI.c(z12, z10);
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    androidx.compose.ui.a0 a0VarC7 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var11, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var7 = s3.f32666a;
                    androidx.compose.ui.a0 a0VarA7 = androidx.compose.foundation.layout.i6.a(a0VarC7, s3Var7.v(), s3Var7.u());
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.nw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return tw.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g5 g5Var9 = g5VarM;
                    dw dwVar8 = dwVarI;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function2E;
                    u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA7, false, (Function1) objI0, 1, null), z12, q3Var2, jB7, jC7, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar8;
                    function4 = function11;
                    g5Var2 = g5Var9;
                    a0Var3 = a0Var11;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1579561419);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0VarR.A();
                } else {
                    c0VarR.E(-882238238);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB8 = dwVarI.b(z12, z10);
                long jC8 = dwVarI.c(z12, z10);
                androidx.compose.ui.a0 a0Var12 = a0Var2;
                androidx.compose.ui.a0 a0VarC8 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var12, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var8 = s3.f32666a;
                androidx.compose.ui.a0 a0VarA8 = androidx.compose.foundation.layout.i6.a(a0VarC8, s3Var8.v(), s3Var8.u());
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.nw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return tw.r((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g5 g5Var10 = g5VarM;
                dw dwVar9 = dwVarI;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function2E;
                u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA8, false, (Function1) objI0, 1, null), z12, q3Var2, jB8, jC8, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar9;
                function4 = function12;
                g5Var2 = g5Var10;
                a0Var3 = a0Var12;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        if ((i12 & 4) != 0) {
            if ((i10 & 3072) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    dwVarI = dwVar;
                    if ((i12 & 32) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i13 |= i29;
                } else {
                    dwVarI = dwVar;
                }
                if ((i10 & 12582912) == 0) {
                    a1VarH = a1Var;
                    if ((i12 & 64) == 0) {
                        i28 = 4194304;
                    } else {
                        i28 = 4194304;
                    }
                    i13 |= i28;
                } else {
                    a1VarH = a1Var;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 1024) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c0VarR.k0(function3)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    i27 = i24;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        } else {
                            if (i15 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if ((i12 & 32) != 0) {
                                dwVarI = iw.f29388a.i(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 64) != 0) {
                                a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                g5VarM = iw.f29388a.m();
                            } else {
                                g5VarM = g5Var;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                a0Var2 = a0Var4;
                                function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                            } else {
                                a0Var2 = a0Var4;
                                function2E = function2;
                            }
                            a1Var3 = a1VarH;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                        }
                        if (jVar3 == null) {
                            c0VarR.E(-1579561419);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI1);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-882238238);
                            c0VarR.A();
                            jVar4 = jVar3;
                        }
                        long jB9 = dwVarI.b(z12, z10);
                        long jC9 = dwVarI.c(z12, z10);
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        androidx.compose.ui.a0 a0VarC9 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var13, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                        s3 s3Var9 = s3.f32666a;
                        androidx.compose.ui.a0 a0VarA9 = androidx.compose.foundation.layout.i6.a(a0VarC9, s3Var9.v(), s3Var9.u());
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.nw
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return tw.r((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g5 g5Var11 = g5VarM;
                        dw dwVar10 = dwVarI;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function2E;
                        u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA9, false, (Function1) objI0, 1, null), z12, q3Var2, jB9, jC9, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z12 = z12;
                        a1Var2 = a1Var3;
                        jVar2 = jVar3;
                        dwVarI = dwVar10;
                        function4 = function13;
                        g5Var2 = g5Var11;
                        a0Var3 = a0Var13;
                    } else {
                        c0VarR.u();
                        g5Var2 = g5Var;
                        function4 = function2;
                        a1Var2 = a1VarH;
                        a0Var3 = a0Var2;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1579561419);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-882238238);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB10 = dwVarI.b(z12, z10);
                    long jC10 = dwVarI.c(z12, z10);
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    androidx.compose.ui.a0 a0VarC10 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var14, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var10 = s3.f32666a;
                    androidx.compose.ui.a0 a0VarA10 = androidx.compose.foundation.layout.i6.a(a0VarC10, s3Var10.v(), s3Var10.u());
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.nw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return tw.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g5 g5Var12 = g5VarM;
                    dw dwVar11 = dwVarI;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function2E;
                    u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA10, false, (Function1) objI0, 1, null), z12, q3Var2, jB10, jC10, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar11;
                    function4 = function14;
                    g5Var2 = g5Var12;
                    a0Var3 = a0Var14;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                dwVarI = dwVar;
                if ((i12 & 32) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            } else {
                dwVarI = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1579561419);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-882238238);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB11 = dwVarI.b(z12, z10);
                    long jC11 = dwVarI.c(z12, z10);
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    androidx.compose.ui.a0 a0VarC11 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var15, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var11 = s3.f32666a;
                    androidx.compose.ui.a0 a0VarA11 = androidx.compose.foundation.layout.i6.a(a0VarC11, s3Var11.v(), s3Var11.u());
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.nw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return tw.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g5 g5Var13 = g5VarM;
                    dw dwVar12 = dwVarI;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function2E;
                    u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA11, false, (Function1) objI0, 1, null), z12, q3Var2, jB11, jC11, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar12;
                    function4 = function15;
                    g5Var2 = g5Var13;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1579561419);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0VarR.A();
                } else {
                    c0VarR.E(-882238238);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB12 = dwVarI.b(z12, z10);
                long jC12 = dwVarI.c(z12, z10);
                androidx.compose.ui.a0 a0Var16 = a0Var2;
                androidx.compose.ui.a0 a0VarC12 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var16, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var12 = s3.f32666a;
                androidx.compose.ui.a0 a0VarA12 = androidx.compose.foundation.layout.i6.a(a0VarC12, s3Var12.v(), s3Var12.u());
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.nw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return tw.r((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g5 g5Var14 = g5VarM;
                dw dwVar13 = dwVarI;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function2E;
                u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA12, false, (Function1) objI0, 1, null), z12, q3Var2, jB12, jC12, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar13;
                function4 = function16;
                g5Var2 = g5Var14;
                a0Var3 = a0Var16;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        q3Var2 = q3Var;
        i15 = i12 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z12 = z11;
            } else {
                z12 = z11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                dwVarI = dwVar;
                if ((i12 & 32) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            } else {
                dwVarI = dwVar;
            }
            if ((i10 & 12582912) == 0) {
                a1VarH = a1Var;
                if ((i12 & 64) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            } else {
                a1VarH = a1Var;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 1024) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c0VarR.k0(function3)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                i27 = i24;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    } else {
                        if (i15 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            dwVarI = iw.f29388a.i(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 64) != 0) {
                            a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            g5VarM = iw.f29388a.m();
                        } else {
                            g5VarM = g5Var;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            a0Var2 = a0Var4;
                            function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                        } else {
                            a0Var2 = a0Var4;
                            function2E = function2;
                        }
                        a1Var3 = a1VarH;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-1579561419);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-882238238);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    long jB13 = dwVarI.b(z12, z10);
                    long jC13 = dwVarI.c(z12, z10);
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    androidx.compose.ui.a0 a0VarC13 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var17, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                    s3 s3Var13 = s3.f32666a;
                    androidx.compose.ui.a0 a0VarA13 = androidx.compose.foundation.layout.i6.a(a0VarC13, s3Var13.v(), s3Var13.u());
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.nw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return tw.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g5 g5Var15 = g5VarM;
                    dw dwVar14 = dwVarI;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function2E;
                    u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA13, false, (Function1) objI0, 1, null), z12, q3Var2, jB13, jC13, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z12 = z12;
                    a1Var2 = a1Var3;
                    jVar2 = jVar3;
                    dwVarI = dwVar14;
                    function4 = function17;
                    g5Var2 = g5Var15;
                    a0Var3 = a0Var17;
                } else {
                    c0VarR.u();
                    g5Var2 = g5Var;
                    function4 = function2;
                    a1Var2 = a1VarH;
                    a0Var3 = a0Var2;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1579561419);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0VarR.A();
                } else {
                    c0VarR.E(-882238238);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB14 = dwVarI.b(z12, z10);
                long jC14 = dwVarI.c(z12, z10);
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                androidx.compose.ui.a0 a0VarC14 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var18, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var14 = s3.f32666a;
                androidx.compose.ui.a0 a0VarA14 = androidx.compose.foundation.layout.i6.a(a0VarC14, s3Var14.v(), s3Var14.u());
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.nw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return tw.r((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g5 g5Var16 = g5VarM;
                dw dwVar15 = dwVarI;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function2E;
                u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA14, false, (Function1) objI0, 1, null), z12, q3Var2, jB14, jC14, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar15;
                function4 = function18;
                g5Var2 = g5Var16;
                a0Var3 = a0Var18;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        i17 = i12 & 16;
        if (i17 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        if ((i10 & 1572864) == 0) {
            dwVarI = dwVar;
            if ((i12 & 32) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i13 |= i29;
        } else {
            dwVarI = dwVar;
        }
        if ((i10 & 12582912) == 0) {
            a1VarH = a1Var;
            if ((i12 & 64) == 0) {
                i28 = 4194304;
            } else {
                i28 = 4194304;
            }
            i13 |= i28;
        } else {
            a1VarH = a1Var;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(g5Var)) {
                i20 = 67108864;
            } else {
                i20 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.D(jVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 1024) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c0VarR.k0(function3)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            i27 = i24;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                } else {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        dwVarI = iw.f29388a.i(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 64) != 0) {
                        a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        g5VarM = iw.f29388a.m();
                    } else {
                        g5VarM = g5Var;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        a0Var2 = a0Var4;
                        function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                    } else {
                        a0Var2 = a0Var4;
                        function2E = function2;
                    }
                    a1Var3 = a1VarH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-1579561419);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0VarR.A();
                } else {
                    c0VarR.E(-882238238);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                long jB15 = dwVarI.b(z12, z10);
                long jC15 = dwVarI.c(z12, z10);
                androidx.compose.ui.a0 a0Var19 = a0Var2;
                androidx.compose.ui.a0 a0VarC15 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var19, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
                s3 s3Var15 = s3.f32666a;
                androidx.compose.ui.a0 a0VarA15 = androidx.compose.foundation.layout.i6.a(a0VarC15, s3Var15.v(), s3Var15.u());
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.nw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return tw.r((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g5 g5Var17 = g5VarM;
                dw dwVar16 = dwVarI;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function2E;
                u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA15, false, (Function1) objI0, 1, null), z12, q3Var2, jB15, jC15, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z12 = z12;
                a1Var2 = a1Var3;
                jVar2 = jVar3;
                dwVarI = dwVar16;
                function4 = function19;
                g5Var2 = g5Var17;
                a0Var3 = a0Var19;
            } else {
                c0VarR.u();
                g5Var2 = g5Var;
                function4 = function2;
                a1Var2 = a1VarH;
                a0Var3 = a0Var2;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i23 = i12 & 512;
        if (i23 != 0) {
            i24 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function2)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i11 | i25;
        } else {
            i24 = i11;
        }
        if ((i12 & 1024) != 0) {
            i24 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c0VarR.k0(function3)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i24 |= i26;
        }
        i27 = i24;
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c0VarR.h(z13, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 &= -29360129;
                }
                if (i19 != 0) {
                    g5VarM = iw.f29388a.m();
                } else {
                    g5VarM = g5Var;
                }
                if (i21 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i23 != 0) {
                    a0Var2 = a0Var4;
                    function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                } else {
                    a0Var2 = a0Var4;
                    function2E = function2;
                }
                a1Var3 = a1VarH;
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    dwVarI = iw.f29388a.i(c0VarR, 6);
                    i13 &= -3670017;
                }
                if ((i12 & 64) != 0) {
                    a1VarH = iw.h(iw.f29388a, dwVarI.a(z12, z10), 0.0f, 2, null);
                    i13 &= -29360129;
                }
                if (i19 != 0) {
                    g5VarM = iw.f29388a.m();
                } else {
                    g5VarM = g5Var;
                }
                if (i21 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i23 != 0) {
                    a0Var2 = a0Var4;
                    function2E = androidx.compose.runtime.internal.w.e(-643804033, true, new d(z10), c0VarR, 54);
                } else {
                    a0Var2 = a0Var4;
                    function2E = function2;
                }
                a1Var3 = a1VarH;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1532041126, i13, i27, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:222)");
            }
            if (jVar3 == null) {
                c0VarR.E(-1579561419);
                objI1 = c0VarR.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI1);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                c0VarR.A();
            } else {
                c0VarR.E(-882238238);
                c0VarR.A();
                jVar4 = jVar3;
            }
            long jB16 = dwVarI.b(z12, z10);
            long jC16 = dwVarI.c(z12, z10);
            androidx.compose.ui.a0 a0Var110 = a0Var2;
            androidx.compose.ui.a0 a0VarC16 = C(androidx.compose.foundation.layout.x5.q(gyVar, a0Var110, 1.0f, false, 2, null), z10, B(jVar4, c0VarR, 0));
            s3 s3Var16 = s3.f32666a;
            androidx.compose.ui.a0 a0VarA16 = androidx.compose.foundation.layout.i6.a(a0VarC16, s3Var16.v(), s3Var16.u());
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.nw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return tw.r((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.layout.g5 g5Var18 = g5VarM;
            dw dwVar17 = dwVarI;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function2E;
            u10.d(z10, function0, androidx.compose.ui.semantics.t.f(a0VarA16, false, (Function1) objI0, 1, null), z12, q3Var2, jB16, jC16, 0.0f, 0.0f, a1Var3, jVar4, androidx.compose.runtime.internal.w.e(-1208080836, true, new e(function2E, function3, g5VarM), c0VarR, 54), c0VarR, ((i13 >> 3) & okhttp3.internal.ws.g.f334652s) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), 48, androidx.media3.exoplayer.a5.S0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z12 = z12;
            a1Var2 = a1Var3;
            jVar2 = jVar3;
            dwVarI = dwVar17;
            function4 = function110;
            g5Var2 = g5Var18;
            a0Var3 = a0Var110;
        } else {
            c0VarR.u();
            g5Var2 = g5Var;
            function4 = function2;
            a1Var2 = a1VarH;
            a0Var3 = a0Var2;
            jVar2 = jVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ow
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.s(gyVar, z10, function0, q3Var, a0Var3, z12, dwVarI, a1Var2, g5Var2, jVar2, function4, function3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(im imVar, boolean z10, Function1 function1, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.a0 a0Var, boolean z11, dw dwVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, Function2 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        n(imVar, z10, function1, q3Var, a0Var, z11, dwVar, a1Var, g5Var, jVar, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.f());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(gy gyVar, boolean z10, Function0 function0, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.a0 a0Var, boolean z11, dw dwVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, Function2 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        p(gyVar, z10, function0, q3Var, a0Var, z11, dwVar, a1Var, g5Var, jVar, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(im imVar, boolean z10, Function1 function1, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.a0 a0Var, boolean z11, dw dwVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, Function2 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        m(imVar, z10, function1, q3Var, a0Var, z11, dwVar, a1Var, jVar, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(gy gyVar, boolean z10, Function0 function0, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.ui.a0 a0Var, boolean z11, dw dwVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, Function2 function3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        o(gyVar, z10, function0, q3Var, a0Var, z11, dwVar, a1Var, jVar, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void v(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final androidx.compose.foundation.layout.g5 g5Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1069265073);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(g5Var) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1069265073, i11, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:386)");
            }
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, g5Var);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            q50.o(la0.e(d0.x1.f269270a.i(), c0VarR, 6), androidx.compose.runtime.internal.w.e(-1372614088, true, new g(function2, function3, hm.b(d0.h1.FastSpatial, c0VarR, 6)), c0VarR, 54), c0VarR, 48);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.w(function2, function3, g5Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Function2 function2, Function2 function3, androidx.compose.foundation.layout.g5 g5Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        v(function2, function3, g5Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void x(@Nullable androidx.compose.ui.a0 a0Var, float f10, @NotNull final pj.n<? super gy, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2041406825);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(nVar) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (i14 != 0) {
                f10 = iw.f29388a.l();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2041406825, i12, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:331)");
            }
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.c4.d(androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.b.b(a0Var), 0.0f, d0.x1.f269270a.a(), 1, null), androidx.compose.foundation.layout.e4.Min);
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(-f10)), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new hy(y5Var);
                c0VarR.Y(objI0);
            }
            nVar.invoke((hy) objI0, c0VarR, Integer.valueOf(((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        final float f11 = f10;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.jw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tw.y(a0Var2, f11, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.ui.a0 a0Var, float f10, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        x(a0Var, f10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

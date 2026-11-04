package androidx.compose.material3.internal;

import androidx.compose.animation.core.t4;
import androidx.compose.foundation.layout.g5;
import androidx.compose.material3.c7;
import androidx.compose.material3.hm;
import androidx.compose.material3.j40;
import androidx.compose.material3.ja0;
import androidx.compose.material3.pj;
import androidx.compose.material3.u40;
import androidx.compose.material3.uq;
import androidx.compose.material3.v40;
import androidx.compose.material3.w40;
import androidx.compose.material3.wi;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,543:1\n382#1,10:548\n392#1,4:562\n390#1,14:570\n417#1,4:587\n401#1:595\n425#1,2:596\n429#1,4:601\n424#1:609\n436#1,5:610\n442#1,3:617\n437#1:635\n450#1,4:636\n448#1,14:643\n463#1:687\n646#2:544\n635#2:545\n646#2:546\n635#2:547\n1925#3:558\n1832#3,3:559\n1835#3,4:566\n1832#3,3:584\n1835#3,4:591\n1832#3,3:598\n1835#3,4:605\n1832#3,7:628\n1925#3:688\n1832#3,7:689\n1925#3:696\n1832#3,7:697\n1925#3:704\n1832#3,7:705\n1832#3,7:722\n1832#3,7:739\n67#4,2:615\n69#4:620\n71#4:627\n69#4,3:640\n67#4,3:712\n71#4:721\n67#4,3:729\n71#4:738\n1247#5,6:621\n1282#5,6:657\n1282#5,6:663\n1282#5,6:669\n1282#5,6:675\n1282#5,6:681\n1247#5,6:715\n1247#5,6:732\n75#6:746\n75#6:760\n102#7:747\n113#7:748\n113#7:758\n152#7:759\n113#7:781\n113#7:782\n113#7:783\n113#7:784\n113#7:785\n113#7:786\n113#7:787\n113#7:788\n52#8,9:749\n60#8:762\n1#9:761\n85#10:763\n85#10:764\n57#11:765\n61#11:768\n57#11:771\n61#11:774\n60#12:766\n70#12:769\n60#12:772\n70#12:775\n53#12,3:778\n22#13:767\n22#13:770\n22#13:773\n22#13:776\n33#14:777\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n*L\n117#1:548,10\n117#1:562,4\n117#1:570,14\n117#1:587,4\n117#1:595\n117#1:596,2\n117#1:601,4\n117#1:609\n117#1:610,5\n117#1:617,3\n117#1:635\n117#1:636,4\n117#1:643,14\n117#1:687\n121#1:544\n121#1:545\n125#1:546\n125#1:547\n117#1:558\n117#1:559,3\n117#1:566,4\n117#1:584,3\n117#1:591,4\n117#1:598,3\n117#1:605,4\n117#1:628,7\n391#1:688\n391#1:689,7\n402#1:696\n402#1:697,7\n425#1:704\n425#1:705,7\n438#1:722,7\n450#1:739,7\n117#1:615,2\n117#1:620\n117#1:627\n117#1:640,3\n438#1:712,3\n438#1:721\n450#1:729,3\n450#1:738\n117#1:621,6\n131#1:657,6\n156#1:663,6\n173#1:669,6\n254#1:675,6\n280#1:681,6\n438#1:715,6\n450#1:732,6\n522#1:746\n532#1:760\n523#1:747\n523#1:748\n524#1:758\n524#1:759\n535#1:781\n536#1:782\n537#1:783\n538#1:784\n539#1:785\n540#1:786\n541#1:787\n542#1:788\n524#1:749,9\n532#1:762\n156#1:763\n173#1:764\n285#1:765\n286#1:768\n288#1:771\n289#1:774\n285#1:766\n286#1:769\n288#1:772\n289#1:775\n291#1:778,3\n285#1:767\n286#1:770\n288#1:773\n289#1:776\n291#1:777\n*E\n"})
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f28671a = "TextField";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f28672b = "Hint";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f28673c = "Label";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f28674d = "Leading";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f28675e = "Trailing";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f28676f = "Prefix";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f28677g = "Suffix";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f28678h = "Supporting";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f28679i = "Container";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f28680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f28681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f28682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f28683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28684n = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f28685o = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f28686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f28687q;

    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n70#2:544\n67#2,9:545\n77#2:584\n79#3,6:554\n86#3,3:569\n89#3,2:578\n93#3:583\n347#4,9:560\n356#4,3:580\n4206#5,6:572\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1\n*L\n256#1:544\n256#1:545,9\n256#1:584\n256#1:554,6\n256#1:569,3\n256#1:578,2\n256#1:583\n256#1:560,9\n256#1:580,3\n256#1:572,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<n0.n> f28688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v40 f28689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g5 f28690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28691d;

        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.runtime.n3<n0.n> n3Var, v40 v40Var, g5 g5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28688a = n3Var;
            this.f28689b = v40Var;
            this.f28690c = g5Var;
            this.f28691d = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(528115858, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
            }
            androidx.compose.ui.a0 a0VarP = uq.p(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, b4.f28679i), new kotlin.jvm.internal.t0(this.f28688a) { // from class: androidx.compose.material3.internal.b4.c.a
                @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
                public Object get() {
                    return ((androidx.compose.runtime.n3) this.receiver).getValue();
                }

                @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
                public void set(Object obj) {
                    ((androidx.compose.runtime.n3) this.receiver).setValue(obj);
                }
            }, b4.I(this.f28689b), this.f28690c);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28691d;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$containerWithId$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n70#2:544\n67#2,9:545\n77#2:584\n79#3,6:554\n86#3,3:569\n89#3,2:578\n93#3:583\n347#4,9:560\n356#4,3:580\n4206#5,6:572\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$containerWithId$1\n*L\n230#1:544\n230#1:545,9\n230#1:584\n230#1:554,6\n230#1:569,3\n230#1:578,2\n230#1:583\n230#1:560,9\n230#1:580,3\n230#1:572,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28692a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28692a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1729858187, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, b4.f28679i);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28692a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
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

    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n7<Float> f28695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n7<androidx.compose.ui.graphics.q0> f28696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f28697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n7<androidx.compose.ui.graphics.q0> f28698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<w40, androidx.compose.runtime.c0, Integer, Unit> f28699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l f28700h;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<w40, androidx.compose.runtime.c0, Integer, Unit> f28701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f28702b;

            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, l lVar) {
                this.f28701a = nVar;
                this.f28702b = lVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1157484991, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:147)");
                }
                this.f28701a.invoke(this.f28702b, c0Var, 6);
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

        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.text.y3 y3Var2, n7<Float> n7Var, n7<androidx.compose.ui.graphics.q0> n7Var2, boolean z10, n7<androidx.compose.ui.graphics.q0> n7Var3, pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, l lVar) {
            this.f28693a = y3Var;
            this.f28694b = y3Var2;
            this.f28695c = n7Var;
            this.f28696d = n7Var2;
            this.f28697e = z10;
            this.f28698f = n7Var3;
            this.f28699g = nVar;
            this.f28700h = lVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1076580032, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            androidx.compose.ui.text.y3 y3VarC = androidx.compose.ui.text.z3.c(this.f28693a, this.f28694b, this.f28695c.getValue().floatValue());
            boolean z10 = this.f28697e;
            n7<androidx.compose.ui.graphics.q0> n7Var = this.f28698f;
            if (z10) {
                y3VarC = androidx.compose.ui.text.y3.m(y3VarC, n7Var.getValue().M(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            b4.s(this.f28696d.getValue().M(), y3VarC, androidx.compose.runtime.internal.w.e(1157484991, true, new a(this.f28699g, this.f28700h), c0Var, 54), c0Var, a5.S0);
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
        final /* synthetic */ long f28703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28704b;

        /* JADX WARN: Multi-variable type inference failed */
        f(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28703a = j10;
            this.f28704b = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 3 | 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1736293487, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
            }
            b4.t(this.f28703a, this.f28704b, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n1282#2,6:544\n70#3:550\n67#3,9:551\n77#3:590\n79#4,6:560\n86#4,3:575\n89#4,2:584\n93#4:589\n347#5,9:566\n356#5,3:586\n4206#6,6:578\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n*L\n162#1:544,6\n162#1:550\n162#1:551,9\n162#1:590\n162#1:560,6\n162#1:575,3\n162#1:584,2\n162#1:589\n162#1:566,9\n162#1:586,3\n162#1:578,6\n*E\n"})
    static final class g implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Float> f28705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f28706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28708d;

        /* JADX WARN: Multi-variable type inference failed */
        g(n7<Float> n7Var, long j10, androidx.compose.ui.text.y3 y3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28705a = n7Var;
            this.f28706b = j10;
            this.f28707c = y3Var;
            this.f28708d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.setAlpha(((Number) n7Var.getValue()).floatValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(a0Var) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1405547205, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            boolean zD = c0Var.D(this.f28705a);
            final n7<Float> n7Var = this.f28705a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.internal.c4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b4.g.f(n7Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(a0Var, (Function1) objI0);
            long j10 = this.f28706b;
            androidx.compose.ui.text.y3 y3Var = this.f28707c;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28708d;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            int i11 = 0 << 0;
            b4.s(j10, y3Var, function2, c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            d(a0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n1282#2,6:544\n70#3:550\n67#3,9:551\n77#3:590\n79#4,6:560\n86#4,3:575\n89#4,2:584\n93#4:589\n347#5,9:566\n356#5,3:586\n4206#6,6:578\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1\n*L\n179#1:544,6\n179#1:550\n179#1:551,9\n179#1:590\n179#1:560,6\n179#1:575,3\n179#1:584,2\n179#1:589\n179#1:566,9\n179#1:586,3\n179#1:578,6\n*E\n"})
    static final class h implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Float> f28709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f28710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28712d;

        /* JADX WARN: Multi-variable type inference failed */
        h(n7<Float> n7Var, long j10, androidx.compose.ui.text.y3 y3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28709a = n7Var;
            this.f28710b = j10;
            this.f28711c = y3Var;
            this.f28712d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.setAlpha(((Number) n7Var.getValue()).floatValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(606594655, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(this.f28709a);
            final n7<Float> n7Var = this.f28709a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.internal.d4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b4.h.f(n7Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(aVar, (Function1) objI0);
            long j10 = this.f28710b;
            androidx.compose.ui.text.y3 y3Var = this.f28711c;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28712d;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            b4.s(j10, y3Var, function2, c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n1282#2,6:544\n70#3:550\n67#3,9:551\n77#3:590\n79#4,6:560\n86#4,3:575\n89#4,2:584\n93#4:589\n347#5,9:566\n356#5,3:586\n4206#6,6:578\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1\n*L\n193#1:544,6\n193#1:550\n193#1:551,9\n193#1:590\n193#1:560,6\n193#1:575,3\n193#1:584,2\n193#1:589\n193#1:566,9\n193#1:586,3\n193#1:578,6\n*E\n"})
    static final class i implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Float> f28713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f28714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28716d;

        /* JADX WARN: Multi-variable type inference failed */
        i(n7<Float> n7Var, long j10, androidx.compose.ui.text.y3 y3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28713a = n7Var;
            this.f28714b = j10;
            this.f28715c = y3Var;
            this.f28716d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.setAlpha(((Number) n7Var.getValue()).floatValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-45078754, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(this.f28713a);
            final n7<Float> n7Var = this.f28713a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.internal.e4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b4.i.f(n7Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(aVar, (Function1) objI0);
            long j10 = this.f28714b;
            androidx.compose.ui.text.y3 y3Var = this.f28715c;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28716d;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            b4.s(j10, y3Var, function2, c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class j implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f28717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f28718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28719c;

        /* JADX WARN: Multi-variable type inference failed */
        j(long j10, androidx.compose.ui.text.y3 y3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28717a = j10;
            this.f28718b = y3Var;
            this.f28719c = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(837168720, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            b4.s(this.f28717a, this.f28718b, this.f28719c, c0Var, 0);
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

    static final class k implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f28720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28721b;

        /* JADX WARN: Multi-variable type inference failed */
        k(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28720a = j10;
            this.f28721b = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1334518521, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
            }
            b4.t(this.f28720a, this.f28721b, c0Var, 0);
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

    public static final class l implements w40 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Float> f28722a;

        l(n7<Float> n7Var) {
            this.f28722a = n7Var;
        }

        @Override // androidx.compose.material3.w40
        public float a() {
            return this.f28722a.getValue().floatValue();
        }
    }

    public static final class m implements pj.n<androidx.compose.animation.core.l3.b<r2>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> f28723a;

        public m(androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var) {
            this.f28723a = y0Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> c(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1190923886);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1190923886, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
            }
            androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var = this.f28723a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> invoke(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    public static final class n implements pj.n<androidx.compose.animation.core.l3.b<r2>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f28724a;

        public n(androidx.compose.animation.core.y0<Float> y0Var) {
            this.f28724a = y0Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-709912974);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-709912974, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:390)");
            }
            androidx.compose.animation.core.y0<Float> y0Var = this.f28724a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    public static final class o implements pj.n<androidx.compose.animation.core.l3.b<r2>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> f28725a;

        public o(androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var) {
            this.f28725a = y0Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> c(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1954111929);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1954111929, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
            }
            androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var = this.f28725a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> invoke(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    public static final class p implements pj.n<androidx.compose.animation.core.l3.b<r2>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f28726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f28727b;

        public p(androidx.compose.animation.core.y0<Float> y0Var, androidx.compose.animation.core.y0<Float> y0Var2) {
            this.f28726a = y0Var;
            this.f28727b = y0Var2;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.animation.core.y0<Float> y0Var;
            c0Var.E(-984009111);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-984009111, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
            }
            r2 r2Var = r2.Focused;
            r2 r2Var2 = r2.UnfocusedEmpty;
            if (bVar.f(r2Var, r2Var2)) {
                y0Var = this.f28726a;
            } else {
                y0Var = (bVar.f(r2Var2, r2Var) || bVar.f(r2.UnfocusedNotEmpty, r2Var2)) ? this.f28727b : this.f28726a;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    public static final class q implements pj.n<androidx.compose.animation.core.l3.b<r2>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f28728a;

        public q(androidx.compose.animation.core.y0<Float> y0Var) {
            this.f28728a = y0Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(2126293195);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2126293195, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
            }
            androidx.compose.animation.core.y0<Float> y0Var = this.f28728a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<r2> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    public /* synthetic */ class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28730b;

        static {
            int[] iArr = new int[f4.values().length];
            try {
                iArr[f4.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f4.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28729a = iArr;
            int[] iArr2 = new int[r2.values().length];
            try {
                iArr2[r2.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[r2.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r2.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f28730b = iArr2;
        }
    }

    static final class s implements o2, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f28731a;

        s(Function0 function0) {
            this.f28731a = function0;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f28731a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof o2) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }

        @Override // androidx.compose.material3.internal.o2
        public final /* synthetic */ float invoke() {
            return ((Number) this.f28731a.invoke()).floatValue();
        }
    }

    static {
        float f10 = 16;
        f28680j = androidx.compose.ui.unit.h.r(f10);
        float f11 = 4;
        f28681k = androidx.compose.ui.unit.h.r(f11);
        f28682l = androidx.compose.ui.unit.h.r(f11);
        f28683m = androidx.compose.ui.unit.h.r(f11);
        f28686p = androidx.compose.ui.unit.h.r(f10);
        f28687q = androidx.compose.ui.unit.h.r(f10);
    }

    @NotNull
    public static final androidx.compose.ui.a0 A(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, @NotNull final String str) {
        return z10 ? androidx.compose.ui.semantics.t.f(a0Var, false, new Function1() { // from class: androidx.compose.material3.internal.x3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.B(str, (androidx.compose.ui.semantics.e0) obj);
            }
        }, 1, null) : a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.q(e0Var, str);
        return Unit.f312394a;
    }

    public static final float C() {
        return f28682l;
    }

    public static final float D() {
        return f28681k;
    }

    @NotNull
    public static final androidx.compose.ui.e.b E(@NotNull v40 v40Var) {
        if (v40Var instanceof v40.a) {
            return ((v40.a) v40Var).a();
        }
        if (v40Var instanceof v40.b) {
            return ((v40.b) v40Var).b();
        }
        throw new IllegalArgumentException("Unknown position: " + v40Var);
    }

    public static final float F() {
        return f28686p;
    }

    public static final float G() {
        return f28687q;
    }

    public static final float H() {
        return f28685o;
    }

    @NotNull
    public static final androidx.compose.ui.e.b I(@NotNull v40 v40Var) {
        if (v40Var instanceof v40.a) {
            return ((v40.a) v40Var).a();
        }
        if (v40Var instanceof v40.b) {
            return ((v40.b) v40Var).c();
        }
        throw new IllegalArgumentException("Unknown position: " + v40Var);
    }

    public static final float J() {
        return f28684n;
    }

    private static final boolean K(v40 v40Var) {
        if (!(v40Var instanceof v40.b) || ((v40.b) v40Var).a()) {
            return false;
        }
        int i10 = 6 & 1;
        return true;
    }

    public static final float L() {
        return f28683m;
    }

    public static final float M() {
        return f28680j;
    }

    @androidx.compose.runtime.o
    public static final float N(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1251545215, i10, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        long jI = pj.f31758a.e(c0Var, 6).i().I();
        long jA = d0.d3.f267855a.A();
        if (!androidx.compose.ui.unit.z.q(jI)) {
            jI = jA;
        }
        float fR = androidx.compose.ui.unit.h.r(((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).y(jI) / 2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fR;
    }

    @NotNull
    public static final androidx.compose.ui.a0 O(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final androidx.compose.ui.graphics.x0 x0Var, @NotNull final androidx.compose.ui.graphics.q3 q3Var) {
        return androidx.compose.ui.draw.n.c(a0Var, new Function1() { // from class: androidx.compose.material3.internal.z3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.P(q3Var, x0Var, (androidx.compose.ui.draw.i) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o P(androidx.compose.ui.graphics.q3 q3Var, final androidx.compose.ui.graphics.x0 x0Var, androidx.compose.ui.draw.i iVar) {
        final androidx.compose.ui.graphics.f2 f2VarMo0createOutlinePq9zytI = q3Var.mo0createOutlinePq9zytI(iVar.d(), iVar.getLayoutDirection(), iVar);
        return iVar.M(new Function1() { // from class: androidx.compose.material3.internal.y3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.Q(f2VarMo0createOutlinePq9zytI, x0Var, (androidx.compose.ui.graphics.drawscope.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(androidx.compose.ui.graphics.f2 f2Var, androidx.compose.ui.graphics.x0 x0Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.g2.f(fVar, f2Var, x0Var.a(), 0.0f, null, null, 0, 60, null);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final float R(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 3 & (-1);
            androidx.compose.runtime.m0.A0(1986450462, i10, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float fO = ((androidx.compose.ui.unit.h) c0Var.W(wi.g())).O();
        if (Float.isNaN(fO)) {
            fO = androidx.compose.ui.unit.h.r(0);
        }
        float fR = androidx.compose.ui.unit.h.r(kotlin.ranges.r.t(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fO - d0.n2.f268546a.f()) / 2), androidx.compose.ui.unit.h.r(0)));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fR;
    }

    @NotNull
    public static final androidx.compose.ui.a0 S(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final Function0<androidx.compose.ui.unit.h> function0) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material3.internal.w3
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return b4.T(function0, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 T(Function0 function0, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        float fO = ((androidx.compose.ui.unit.h) function0.invoke()).O();
        int i10 = 1 << 0;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(bVar.x(), 0, 0, androidx.compose.ui.unit.c.h(bVar.x(), !androidx.compose.ui.unit.h.x(fO, androidx.compose.ui.unit.h.f42689b.e()) ? c1Var.g6(fO) : 0), 0, 11, null));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.internal.q3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4.U(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:287:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:290:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:291:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:294:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:295:0x0500  */
    /* JADX WARN: Code duplicated, block: B:298:0x0508  */
    /* JADX WARN: Code duplicated, block: B:303:0x0524  */
    /* JADX WARN: Code duplicated, block: B:306:0x054a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0558  */
    /* JADX WARN: Code duplicated, block: B:310:0x055b  */
    /* JADX WARN: Code duplicated, block: B:313:0x0563  */
    /* JADX WARN: Code duplicated, block: B:316:0x057f  */
    /* JADX WARN: Code duplicated, block: B:317:0x058b  */
    /* JADX WARN: Code duplicated, block: B:320:0x059c  */
    /* JADX WARN: Code duplicated, block: B:323:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:326:0x05db  */
    /* JADX WARN: Code duplicated, block: B:329:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:334:0x0602  */
    /* JADX WARN: Code duplicated, block: B:337:0x0625  */
    /* JADX WARN: Code duplicated, block: B:340:0x0630  */
    /* JADX WARN: Code duplicated, block: B:343:0x064c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0652  */
    /* JADX WARN: Code duplicated, block: B:347:0x0659  */
    /* JADX WARN: Code duplicated, block: B:350:0x0685  */
    /* JADX WARN: Code duplicated, block: B:353:0x0694  */
    /* JADX WARN: Code duplicated, block: B:355:0x06be  */
    /* JADX WARN: Code duplicated, block: B:358:0x070b  */
    /* JADX WARN: Code duplicated, block: B:366:0x0749  */
    /* JADX WARN: Code duplicated, block: B:369:0x0761  */
    /* JADX WARN: Code duplicated, block: B:370:0x0776  */
    /* JADX WARN: Code duplicated, block: B:376:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:382:0x07da  */
    /* JADX WARN: Code duplicated, block: B:385:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:386:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:389:0x0817  */
    /* JADX WARN: Code duplicated, block: B:390:0x0824  */
    /* JADX WARN: Code duplicated, block: B:393:0x0844  */
    /* JADX WARN: Code duplicated, block: B:394:0x0852  */
    /* JADX WARN: Code duplicated, block: B:397:0x0878  */
    /* JADX WARN: Code duplicated, block: B:399:0x087b  */
    /* JADX WARN: Code duplicated, block: B:401:0x088b  */
    /* JADX WARN: Code duplicated, block: B:404:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:405:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:410:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:412:0x093a  */
    /* JADX WARN: Code duplicated, block: B:414:0x094b  */
    /* JADX WARN: Code duplicated, block: B:417:0x09b6  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void l(@NotNull final f4 f4Var, @NotNull final CharSequence charSequence, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final v40 v40Var, @Nullable final pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8, final boolean z10, final boolean z11, final boolean z12, @NotNull final androidx.compose.foundation.interaction.h hVar, @NotNull final g5 g5Var, @NotNull final j40 j40Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        j40 j40Var2;
        androidx.compose.runtime.c0 c0Var2;
        r2 r2Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        r2 r2Var2;
        long j10;
        androidx.compose.ui.graphics.colorspace.c cVarE;
        boolean zD;
        Object objI0;
        r2 r2Var3;
        long j11;
        r2 r2Var4;
        n7 n7VarD;
        androidx.compose.ui.graphics.colorspace.c cVarE2;
        boolean zD2;
        Object objI1;
        boolean z13;
        n7 n7VarD2;
        Object objI2;
        androidx.compose.runtime.c0.a aVar;
        l lVar;
        androidx.compose.runtime.internal.c cVarE3;
        androidx.compose.runtime.c0 c0Var3;
        int i15;
        androidx.compose.ui.text.y3 y3Var;
        androidx.compose.ui.text.y3 y3Var2;
        final n7 n7Var;
        androidx.compose.runtime.internal.c cVar;
        Object objI3;
        androidx.compose.runtime.internal.c cVar2;
        Object objI4;
        final n7 n7Var2;
        n7 n7Var3;
        androidx.compose.runtime.internal.c cVar3;
        androidx.compose.runtime.internal.c cVar4;
        long jZ;
        androidx.compose.runtime.internal.c cVar5;
        long jG0;
        androidx.compose.runtime.internal.c cVarE4;
        long jD0;
        int i16;
        androidx.compose.runtime.internal.c cVarE5;
        int i17;
        Object objI5;
        final androidx.compose.runtime.n3 n3Var;
        boolean z14;
        boolean zD3;
        Object objI6;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(546805032);
        if ((i10 & 6) == 0) {
            i12 = (c0VarR.K(f4Var.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 = i12 | (c0VarR.k0(charSequence) ? 32 : 16);
        } else {
            i13 = i12;
        }
        if ((i10 & a5.S0) == 0) {
            i13 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= c0VarR.D(v40Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= c0VarR.k0(nVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= c0VarR.k0(function3) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= c0VarR.k0(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= c0VarR.k0(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= c0VarR.k0(function6) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((805306368 & i10) == 0) {
            i13 |= c0VarR.k0(function7) ? 536870912 : 268435456;
        }
        int i18 = i13;
        if ((i11 & 6) == 0) {
            i14 = i11 | (c0VarR.k0(function8) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & a5.S0) == 0) {
            i14 |= c0VarR.G(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= c0VarR.G(z12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= c0VarR.D(hVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= c0VarR.D(g5Var) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            j40Var2 = j40Var;
            i14 |= c0VarR.D(j40Var2) ? 1048576 : 524288;
        } else {
            j40Var2 = j40Var;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= c0VarR.k0(function9) ? 8388608 : 4194304;
        }
        int i19 = i14;
        if (c0VarR.h(((i18 & 306783379) == 306783378 && (4793491 & i19) == 4793490) ? false : true, i18 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(546805032, i18, i19, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:98)");
            }
            boolean zBooleanValue = androidx.compose.foundation.interaction.d.a(hVar, c0VarR, (i19 >> 12) & 14).getValue().booleanValue();
            if (zBooleanValue) {
                r2Var = r2.Focused;
            } else {
                r2Var = charSequence.length() == 0 ? r2.UnfocusedEmpty : r2.UnfocusedNotEmpty;
            }
            long jY = j40Var2.Y(z11, z12, zBooleanValue);
            ja0 ja0VarE = pj.f31758a.e(c0VarR, 6);
            androidx.compose.ui.text.y3 y3VarE = ja0VarE.e();
            androidx.compose.ui.text.y3 y3VarI = ja0VarE.i();
            long jT = y3VarE.t();
            androidx.compose.ui.graphics.q0.a aVar2 = androidx.compose.ui.graphics.q0.f38131b;
            boolean z15 = (androidx.compose.ui.graphics.q0.y(jT, aVar2.u()) && !androidx.compose.ui.graphics.q0.y(y3VarI.t(), aVar2.u())) || (!androidx.compose.ui.graphics.q0.y(y3VarE.t(), aVar2.u()) && androidx.compose.ui.graphics.q0.y(y3VarI.t(), aVar2.u()));
            long jT2 = y3VarI.t();
            if (z15 && jT2 == 16) {
                jT2 = jY;
            }
            long jT3 = y3VarE.t();
            if (z15 && jT3 == 16) {
                jT3 = jY;
            }
            boolean z16 = nVar != null && K(v40Var);
            long j12 = jT2;
            androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(r2Var, "TextFieldInputState", c0VarR, 48, 0);
            n nVar2 = new n(hm.b(d0.h1.FastSpatial, c0VarR, 6));
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = t4.P(zVar);
            r2 r2Var5 = (r2) l3VarJ.p();
            c0VarR.E(-1436405362);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            }
            int[] iArr = r.f28730b;
            int i20 = iArr[r2Var5.ordinal()];
            if (i20 == 1) {
                f10 = 1.0f;
            } else {
                if (i20 != 2) {
                    if (i20 != 3) {
                        throw new kotlin.k0();
                    }
                } else if (z16) {
                    f10 = 0.0f;
                }
                f10 = 1.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf = Float.valueOf(f10);
            r2 r2Var6 = (r2) l3VarJ.y();
            c0VarR.E(-1436405362);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            }
            int i21 = iArr[r2Var6.ordinal()];
            if (i21 == 1) {
                f11 = 1.0f;
            } else {
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new kotlin.k0();
                    }
                } else if (z16) {
                    f11 = 0.0f;
                }
                f11 = 1.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            n7 n7VarD3 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf, Float.valueOf(f11), nVar2.invoke(l3VarJ.w(), c0VarR, 0), z3VarP, "LabelProgress", c0VarR, androidx.profileinstaller.n.c.f73814m);
            d0.h1 h1Var = d0.h1.FastEffects;
            androidx.compose.animation.core.y0 y0VarB = hm.b(h1Var, c0VarR, 6);
            p pVar = new p(y0VarB, hm.b(d0.h1.SlowEffects, c0VarR, 6));
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = t4.P(zVar);
            r2 r2Var7 = (r2) l3VarJ.p();
            c0VarR.E(-1093194547);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
            }
            int i22 = iArr[r2Var7.ordinal()];
            if (i22 == 1) {
                f12 = 1.0f;
            } else {
                if (i22 != 2) {
                    if (i22 != 3) {
                        throw new kotlin.k0();
                    }
                } else if (!z16) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf2 = Float.valueOf(f12);
            r2 r2Var8 = (r2) l3VarJ.y();
            c0VarR.E(-1093194547);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
            }
            int i23 = iArr[r2Var8.ordinal()];
            if (i23 == 1) {
                f13 = 1.0f;
            } else {
                if (i23 != 2) {
                    if (i23 != 3) {
                        throw new kotlin.k0();
                    }
                } else if (!z16) {
                    f13 = 1.0f;
                }
                f13 = 0.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            final n7 n7VarD4 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf2, Float.valueOf(f13), pVar.invoke(l3VarJ.w(), c0VarR, 0), z3VarP2, "PlaceholderOpacity", c0VarR, androidx.profileinstaller.n.c.f73814m);
            q qVar = new q(y0VarB);
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP3 = t4.P(zVar);
            r2 r2Var9 = (r2) l3VarJ.p();
            c0VarR.E(-1258455321);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
            }
            int i24 = iArr[r2Var9.ordinal()];
            if (i24 == 1) {
                f14 = 1.0f;
            } else {
                if (i24 != 2) {
                    if (i24 != 3) {
                        throw new kotlin.k0();
                    }
                } else if (z16) {
                    f14 = 0.0f;
                }
                f14 = 1.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf3 = Float.valueOf(f14);
            r2 r2Var10 = (r2) l3VarJ.y();
            c0VarR.E(-1258455321);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
            }
            int i25 = iArr[r2Var10.ordinal()];
            if (i25 != 1) {
                if (i25 == 2) {
                    if (z16) {
                        f15 = 0.0f;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    androidx.compose.animation.core.w3.D(l3VarJ, fValueOf3, Float.valueOf(f15), qVar.invoke(l3VarJ.w(), c0VarR, 0), z3VarP3, "PrefixSuffixOpacity", c0VarR, androidx.profileinstaller.n.c.f73814m);
                    androidx.compose.animation.core.y0 y0VarB2 = hm.b(h1Var, c0VarR, 6);
                    o oVar = new o(y0VarB2);
                    r2Var2 = (r2) l3VarJ.y();
                    c0VarR.E(-12973394);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                    }
                    if (iArr[r2Var2.ordinal()] == 1) {
                        j10 = j12;
                    } else {
                        j10 = jT3;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    cVarE = androidx.compose.ui.graphics.q0.E(j10);
                    zD = c0VarR.D(cVarE);
                    objI0 = c0VarR.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(aVar2).invoke(cVarE);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.animation.core.z3 z3Var = (androidx.compose.animation.core.z3) objI0;
                    r2Var3 = (r2) l3VarJ.p();
                    c0VarR.E(-12973394);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                    }
                    if (iArr[r2Var3.ordinal()] == 1) {
                        j11 = j12;
                    } else {
                        j11 = jT3;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(j11);
                    r2Var4 = (r2) l3VarJ.y();
                    c0VarR.E(-12973394);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                    }
                    if (iArr[r2Var4.ordinal()] == 1) {
                        jT3 = j12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, q0VarN, androidx.compose.ui.graphics.q0.n(jT3), oVar.invoke(l3VarJ.w(), c0VarR, 0), z3Var, "LabelTextStyleColor", c0VarR, androidx.profileinstaller.n.c.f73814m);
                    m mVar = new m(y0VarB2);
                    c0VarR.E(-464752477);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    cVarE2 = androidx.compose.ui.graphics.q0.E(jY);
                    zD2 = c0VarR.D(cVarE2);
                    objI1 = c0VarR.i0();
                    if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(aVar2).invoke(cVarE2);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.animation.core.z3 z3Var2 = (androidx.compose.animation.core.z3) objI1;
                    c0VarR.E(-464752477);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    androidx.compose.ui.graphics.q0 q0VarN2 = androidx.compose.ui.graphics.q0.n(jY);
                    c0VarR.E(-464752477);
                    if (androidx.compose.runtime.m0.l0()) {
                        z13 = false;
                        androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                    } else {
                        z13 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0VarR.A();
                    n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, q0VarN2, androidx.compose.ui.graphics.q0.n(jY), mVar.invoke(l3VarJ.w(), c0VarR, 0), z3Var2, "LabelContentColor", c0VarR, androidx.profileinstaller.n.c.f73814m);
                    objI2 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI2 == aVar.a()) {
                        objI2 = new l(n7VarD3);
                        c0VarR.Y(objI2);
                    }
                    lVar = (l) objI2;
                    cVarE3 = null;
                    if (nVar == null) {
                        c0VarR.E(-1891724857);
                        c0VarR.A();
                        n7Var = n7VarD3;
                        c0Var3 = c0VarR;
                        y3Var2 = y3VarI;
                        y3Var = y3VarE;
                        i15 = 54;
                    } else {
                        c0VarR.E(-1891724856);
                        c0Var3 = c0VarR;
                        i15 = 54;
                        e eVar = new e(y3VarE, y3VarI, n7VarD3, n7VarD2, z15, n7VarD, nVar, lVar);
                        y3Var = y3VarE;
                        y3Var2 = y3VarI;
                        n7Var = n7VarD3;
                        cVarE3 = androidx.compose.runtime.internal.w.e(-1076580032, true, eVar, c0Var3, 54);
                        c0Var3.A();
                    }
                    cVar = cVarE3;
                    long jA0 = j40Var.a0(z11, z12, zBooleanValue);
                    objI3 = c0Var3.i0();
                    if (objI3 == aVar.a()) {
                        objI3 = w6.d(w6.z(), new Function0() { // from class: androidx.compose.material3.internal.s3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(b4.p(n7VarD4));
                            }
                        });
                        c0Var3.Y(objI3);
                    }
                    n7 n7Var4 = (n7) objI3;
                    if (function3 == null && charSequence.length() == 0 && q(n7Var4)) {
                        c0Var3.E(-1890614312);
                        androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(1405547205, true, new g(n7VarD4, jA0, y3Var, function3), c0Var3, i15);
                        c0Var3.A();
                        cVar2 = cVarE6;
                    } else {
                        c0Var3.E(-1890217110);
                        c0Var3.A();
                        cVar2 = null;
                    }
                    long jB0 = j40Var.b0(z11, z12, zBooleanValue);
                    objI4 = c0Var3.i0();
                    if (objI4 == aVar.a()) {
                        n7Var2 = r11;
                        objI4 = w6.d(w6.z(), new Function0() { // from class: androidx.compose.material3.internal.t3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(b4.m(n7Var2));
                            }
                        });
                        c0Var3.Y(objI4);
                    } else {
                        n7Var2 = r11;
                    }
                    n7 n7Var5 = (n7) objI4;
                    if (function6 == null && n(n7Var5)) {
                        c0Var3.E(-1889877907);
                        n7Var3 = n7Var2;
                        androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(606594655, true, new h(n7Var3, jB0, y3Var, function6), c0Var3, i15);
                        c0Var3.A();
                        cVar3 = cVarE7;
                    } else {
                        n7Var3 = n7Var2;
                        c0Var3.E(-1889500886);
                        c0Var3.A();
                        cVar3 = null;
                    }
                    long jC0 = j40Var.c0(z11, z12, zBooleanValue);
                    if (function7 == null && n(n7Var5)) {
                        c0Var3.E(-1889301555);
                        androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(-45078754, true, new i(n7Var3, jC0, y3Var, function7), c0Var3, i15);
                        c0Var3.A();
                        cVar4 = cVarE8;
                    } else {
                        c0Var3.E(-1888924534);
                        c0Var3.A();
                        cVar4 = null;
                    }
                    jZ = j40Var.Z(z11, z12, zBooleanValue);
                    if (function4 == null) {
                        c0Var3.E(-1888749663);
                        c0Var3.A();
                        cVar5 = null;
                    } else {
                        c0Var3.E(-1888749662);
                        androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(-1736293487, true, new f(jZ, function4), c0Var3, i15);
                        c0Var3.A();
                        cVar5 = cVarE9;
                    }
                    jG0 = j40Var.g0(z11, z12, zBooleanValue);
                    if (function5 == null) {
                        c0Var3.E(-1888469888);
                        c0Var3.A();
                        cVarE4 = null;
                    } else {
                        c0Var3.E(-1888469887);
                        cVarE4 = androidx.compose.runtime.internal.w.e(1334518521, true, new k(jG0, function5), c0Var3, 54);
                        c0Var3.A();
                    }
                    jD0 = j40Var.d0(z11, z12, zBooleanValue);
                    if (function8 == null) {
                        c0Var3.E(-1888176380);
                        c0Var3.A();
                        cVarE5 = null;
                        i16 = 1;
                    } else {
                        c0Var3.E(-1888176379);
                        j jVar = new j(jD0, y3Var2, function8);
                        i16 = 1;
                        cVarE5 = androidx.compose.runtime.internal.w.e(837168720, true, jVar, c0Var3, 54);
                        c0Var3.A();
                    }
                    i17 = r.f28729a[f4Var.ordinal()];
                    if (i17 != i16) {
                        androidx.compose.runtime.internal.c cVar6 = cVar4;
                        androidx.compose.runtime.c0 c0Var4 = c0Var3;
                        c0Var4.E(-1887830698);
                        c0Var2 = c0Var4;
                        u40.l(androidx.compose.ui.a0.E, function2, cVar, cVar2, cVar5, cVarE4, cVar3, cVar6, z10, v40Var, new s(new kotlin.jvm.internal.c1(n7Var) { // from class: androidx.compose.material3.internal.b4.a
                            @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                            public Object get() {
                                return ((n7) this.receiver).getValue();
                            }
                        }), androidx.compose.runtime.internal.w.e(-1729858187, true, new d(function9), c0Var4, 54), cVarE5, g5Var, c0Var2, ((r43 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6 | ((i19 << 21) & 234881024) | ((r43 << 18) & 1879048192), ((i19 >> 6) & 7168) | 48);
                        c0Var2.A();
                        Unit unit = Unit.f312394a;
                    } else {
                        if (i17 == 2) {
                            androidx.compose.runtime.c0 c0Var5 = c0Var3;
                            c0Var5.E(493292232);
                            c0Var5.A();
                            throw new kotlin.k0();
                        }
                        c0Var3.E(-1886778186);
                        objI5 = c0Var3.i0();
                        if (objI5 == aVar.a()) {
                            objI5 = d7.g(n0.n.c(n0.n.f332724b.c()), null, 2, null);
                            c0Var3.Y(objI5);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI5;
                        androidx.compose.runtime.internal.c cVar7 = cVarE4;
                        androidx.compose.runtime.internal.c cVar8 = cVarE5;
                        androidx.compose.runtime.internal.c cVar9 = cVar5;
                        androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(528115858, true, new c(n3Var, v40Var, g5Var, function9), c0Var3, 54);
                        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                        androidx.compose.runtime.internal.c cVar10 = cVar2;
                        s sVar = new s(new kotlin.jvm.internal.c1(n7Var) { // from class: androidx.compose.material3.internal.b4.b
                            @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                            public Object get() {
                                return ((n7) this.receiver).getValue();
                            }
                        });
                        if ((i18 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        zD3 = z14 | c0Var3.D(n7Var);
                        objI6 = c0Var3.i0();
                        if (zD3 || objI6 == aVar.a()) {
                            objI6 = new Function1() { // from class: androidx.compose.material3.internal.u3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b4.o(v40Var, n7Var, n3Var, (n0.n) obj);
                                }
                            };
                            c0Var3.Y(objI6);
                        }
                        uq.m(aVar3, function2, cVar10, cVar, cVar9, cVar7, cVar3, cVar4, z10, v40Var, sVar, (Function1) objI6, cVarE10, cVar8, g5Var, c0Var3, ((i18 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6 | ((i19 << 21) & 234881024) | ((i18 << 18) & 1879048192), (57344 & (i19 >> 3)) | a5.S0);
                        androidx.compose.runtime.c0 c0Var6 = c0Var3;
                        c0Var6.A();
                        Unit unit2 = Unit.f312394a;
                        c0Var2 = c0Var6;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else if (i25 != 3) {
                    throw new kotlin.k0();
                }
            }
            f15 = 1.0f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.animation.core.w3.D(l3VarJ, fValueOf3, Float.valueOf(f15), qVar.invoke(l3VarJ.w(), c0VarR, 0), z3VarP3, "PrefixSuffixOpacity", c0VarR, androidx.profileinstaller.n.c.f73814m);
            androidx.compose.animation.core.y0 y0VarB3 = hm.b(h1Var, c0VarR, 6);
            o oVar2 = new o(y0VarB3);
            r2Var2 = (r2) l3VarJ.y();
            c0VarR.E(-12973394);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
            }
            if (iArr[r2Var2.ordinal()] == 1) {
                j10 = j12;
            } else {
                j10 = jT3;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            cVarE = androidx.compose.ui.graphics.q0.E(j10);
            zD = c0VarR.D(cVarE);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(aVar2).invoke(cVarE);
                c0VarR.Y(objI0);
            } else {
                objI0 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(aVar2).invoke(cVarE);
                c0VarR.Y(objI0);
            }
            androidx.compose.animation.core.z3 z3Var3 = (androidx.compose.animation.core.z3) objI0;
            r2Var3 = (r2) l3VarJ.p();
            c0VarR.E(-12973394);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
            }
            if (iArr[r2Var3.ordinal()] == 1) {
                j11 = j12;
            } else {
                j11 = jT3;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.ui.graphics.q0 q0VarN3 = androidx.compose.ui.graphics.q0.n(j11);
            r2Var4 = (r2) l3VarJ.y();
            c0VarR.E(-12973394);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
            }
            if (iArr[r2Var4.ordinal()] == 1) {
                jT3 = j12;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, q0VarN3, androidx.compose.ui.graphics.q0.n(jT3), oVar2.invoke(l3VarJ.w(), c0VarR, 0), z3Var3, "LabelTextStyleColor", c0VarR, androidx.profileinstaller.n.c.f73814m);
            m mVar2 = new m(y0VarB3);
            c0VarR.E(-464752477);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            cVarE2 = androidx.compose.ui.graphics.q0.E(jY);
            zD2 = c0VarR.D(cVarE2);
            objI1 = c0VarR.i0();
            if (zD2) {
                objI1 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(aVar2).invoke(cVarE2);
                c0VarR.Y(objI1);
            } else {
                objI1 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(aVar2).invoke(cVarE2);
                c0VarR.Y(objI1);
            }
            androidx.compose.animation.core.z3 z3Var4 = (androidx.compose.animation.core.z3) objI1;
            c0VarR.E(-464752477);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.ui.graphics.q0 q0VarN4 = androidx.compose.ui.graphics.q0.n(jY);
            c0VarR.E(-464752477);
            if (androidx.compose.runtime.m0.l0()) {
                z13 = false;
                androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
            } else {
                z13 = false;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, q0VarN4, androidx.compose.ui.graphics.q0.n(jY), mVar2.invoke(l3VarJ.w(), c0VarR, 0), z3Var4, "LabelContentColor", c0VarR, androidx.profileinstaller.n.c.f73814m);
            objI2 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI2 == aVar.a()) {
                objI2 = new l(n7VarD3);
                c0VarR.Y(objI2);
            }
            lVar = (l) objI2;
            cVarE3 = null;
            if (nVar == null) {
                c0VarR.E(-1891724857);
                c0VarR.A();
                n7Var = n7VarD3;
                c0Var3 = c0VarR;
                y3Var2 = y3VarI;
                y3Var = y3VarE;
                i15 = 54;
            } else {
                c0VarR.E(-1891724856);
                c0Var3 = c0VarR;
                i15 = 54;
                e eVar2 = new e(y3VarE, y3VarI, n7VarD3, n7VarD2, z15, n7VarD, nVar, lVar);
                y3Var = y3VarE;
                y3Var2 = y3VarI;
                n7Var = n7VarD3;
                cVarE3 = androidx.compose.runtime.internal.w.e(-1076580032, true, eVar2, c0Var3, 54);
                c0Var3.A();
            }
            cVar = cVarE3;
            long jA1 = j40Var.a0(z11, z12, zBooleanValue);
            objI3 = c0Var3.i0();
            if (objI3 == aVar.a()) {
                objI3 = w6.d(w6.z(), new Function0() { // from class: androidx.compose.material3.internal.s3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(b4.p(n7VarD4));
                    }
                });
                c0Var3.Y(objI3);
            }
            n7 n7Var6 = (n7) objI3;
            if (function3 == null) {
                c0Var3.E(-1890217110);
                c0Var3.A();
                cVar2 = null;
            } else {
                c0Var3.E(-1890217110);
                c0Var3.A();
                cVar2 = null;
            }
            long jB1 = j40Var.b0(z11, z12, zBooleanValue);
            objI4 = c0Var3.i0();
            if (objI4 == aVar.a()) {
                n7Var2 = r11;
                objI4 = w6.d(w6.z(), new Function0() { // from class: androidx.compose.material3.internal.t3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(b4.m(n7Var2));
                    }
                });
                c0Var3.Y(objI4);
            } else {
                n7Var2 = r11;
            }
            n7 n7Var7 = (n7) objI4;
            if (function6 == null) {
                n7Var3 = n7Var2;
                c0Var3.E(-1889500886);
                c0Var3.A();
                cVar3 = null;
            } else {
                n7Var3 = n7Var2;
                c0Var3.E(-1889500886);
                c0Var3.A();
                cVar3 = null;
            }
            long jC1 = j40Var.c0(z11, z12, zBooleanValue);
            if (function7 == null) {
                c0Var3.E(-1888924534);
                c0Var3.A();
                cVar4 = null;
            } else {
                c0Var3.E(-1888924534);
                c0Var3.A();
                cVar4 = null;
            }
            jZ = j40Var.Z(z11, z12, zBooleanValue);
            if (function4 == null) {
                c0Var3.E(-1888749663);
                c0Var3.A();
                cVar5 = null;
            } else {
                c0Var3.E(-1888749662);
                androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(-1736293487, true, new f(jZ, function4), c0Var3, i15);
                c0Var3.A();
                cVar5 = cVarE11;
            }
            jG0 = j40Var.g0(z11, z12, zBooleanValue);
            if (function5 == null) {
                c0Var3.E(-1888469888);
                c0Var3.A();
                cVarE4 = null;
            } else {
                c0Var3.E(-1888469887);
                cVarE4 = androidx.compose.runtime.internal.w.e(1334518521, true, new k(jG0, function5), c0Var3, 54);
                c0Var3.A();
            }
            jD0 = j40Var.d0(z11, z12, zBooleanValue);
            if (function8 == null) {
                c0Var3.E(-1888176380);
                c0Var3.A();
                cVarE5 = null;
                i16 = 1;
            } else {
                c0Var3.E(-1888176379);
                j jVar2 = new j(jD0, y3Var2, function8);
                i16 = 1;
                cVarE5 = androidx.compose.runtime.internal.w.e(837168720, true, jVar2, c0Var3, 54);
                c0Var3.A();
            }
            i17 = r.f28729a[f4Var.ordinal()];
            if (i17 != i16) {
                androidx.compose.runtime.internal.c cVar11 = cVar4;
                androidx.compose.runtime.c0 c0Var7 = c0Var3;
                c0Var7.E(-1887830698);
                c0Var2 = c0Var7;
                u40.l(androidx.compose.ui.a0.E, function2, cVar, cVar2, cVar5, cVarE4, cVar3, cVar11, z10, v40Var, new s(new kotlin.jvm.internal.c1(n7Var) { // from class: androidx.compose.material3.internal.b4.a
                    @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                    public Object get() {
                        return ((n7) this.receiver).getValue();
                    }
                }), androidx.compose.runtime.internal.w.e(-1729858187, true, new d(function9), c0Var7, 54), cVarE5, g5Var, c0Var2, ((r43 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6 | ((i19 << 21) & 234881024) | ((r43 << 18) & 1879048192), ((i19 >> 6) & 7168) | 48);
                c0Var2.A();
                Unit unit3 = Unit.f312394a;
            } else {
                if (i17 == 2) {
                    androidx.compose.runtime.c0 c0Var8 = c0Var3;
                    c0Var8.E(493292232);
                    c0Var8.A();
                    throw new kotlin.k0();
                }
                c0Var3.E(-1886778186);
                objI5 = c0Var3.i0();
                if (objI5 == aVar.a()) {
                    objI5 = d7.g(n0.n.c(n0.n.f332724b.c()), null, 2, null);
                    c0Var3.Y(objI5);
                }
                n3Var = (androidx.compose.runtime.n3) objI5;
                androidx.compose.runtime.internal.c cVar12 = cVarE4;
                androidx.compose.runtime.internal.c cVar13 = cVarE5;
                androidx.compose.runtime.internal.c cVar14 = cVar5;
                androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(528115858, true, new c(n3Var, v40Var, g5Var, function9), c0Var3, 54);
                androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                androidx.compose.runtime.internal.c cVar15 = cVar2;
                s sVar2 = new s(new kotlin.jvm.internal.c1(n7Var) { // from class: androidx.compose.material3.internal.b4.b
                    @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                    public Object get() {
                        return ((n7) this.receiver).getValue();
                    }
                });
                if ((i18 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                zD3 = z14 | c0Var3.D(n7Var);
                objI6 = c0Var3.i0();
                if (zD3) {
                    objI6 = new Function1() { // from class: androidx.compose.material3.internal.u3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b4.o(v40Var, n7Var, n3Var, (n0.n) obj);
                        }
                    };
                    c0Var3.Y(objI6);
                } else {
                    objI6 = new Function1() { // from class: androidx.compose.material3.internal.u3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b4.o(v40Var, n7Var, n3Var, (n0.n) obj);
                        }
                    };
                    c0Var3.Y(objI6);
                }
                uq.m(aVar4, function2, cVar15, cVar, cVar14, cVar12, cVar3, cVar4, z10, v40Var, sVar2, (Function1) objI6, cVarE12, cVar13, g5Var, c0Var3, ((i18 >> 3) & com.planner5d.library.engine.input.f.b.B) | 6 | ((i19 << 21) & 234881024) | ((i18 << 18) & 1879048192), (57344 & (i19 >> 3)) | a5.S0);
                androidx.compose.runtime.c0 c0Var9 = c0Var3;
                c0Var9.A();
                Unit unit4 = Unit.f312394a;
                c0Var2 = c0Var9;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.v3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b4.r(f4Var, charSequence, function2, v40Var, nVar, function3, function4, function5, function6, function7, function8, z10, z11, z12, hVar, g5Var, j40Var, function9, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue() > 0.0f;
    }

    private static final boolean n(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(v40 v40Var, n7 n7Var, androidx.compose.runtime.n3 n3Var, n0.n nVar) {
        if (v40Var instanceof v40.a) {
            return Unit.f312394a;
        }
        float fFloatValue = ((Number) n7Var.getValue()).floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nVar.y() >> 32)) * fFloatValue;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nVar.y() & com.rabbitmq.client.k0.f265952a)) * fFloatValue;
        if (Float.intBitsToFloat((int) (((n0.n) n3Var.getValue()).y() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((n0.n) n3Var.getValue()).y() & com.rabbitmq.client.k0.f265952a)) != fIntBitsToFloat2) {
            n3Var.setValue(n0.n.c(n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a))));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue() > 0.0f;
    }

    private static final boolean q(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(f4 f4Var, CharSequence charSequence, Function2 function2, v40 v40Var, pj.n nVar, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z10, boolean z11, boolean z12, androidx.compose.foundation.interaction.h hVar, g5 g5Var, j40 j40Var, Function2 function9, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        l(f4Var, charSequence, function2, v40Var, nVar, function3, function4, function5, function6, function7, function8, z10, z11, z12, hVar, g5Var, j40Var, function9, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void s(long j10, androidx.compose.ui.text.y3 y3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        final androidx.compose.ui.text.y3 y3Var2;
        final long j11;
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(396611577);
        if ((i10 & 6) == 0) {
            if (c0VarR.L(j10)) {
                i12 = 4;
                int i13 = 5 | 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(y3Var) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(396611577, i11, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            k3.b(j10, y3Var, function2, c0VarR, i11 & androidx.media3.exoplayer.analytics.b.f62802b0);
            j11 = j10;
            y3Var2 = y3Var;
            function3 = function2;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            function3 = function2;
            y3Var2 = y3Var;
            j11 = j10;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b4.u(j11, y3Var2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void t(final long j10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(590397809);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(590397809, i11, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:330)");
            }
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j10)), function2, c0VarR, (i11 & com.planner5d.library.engine.input.f.b.B) | n4.f36267i);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.r3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b4.v(j10, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(long j10, androidx.compose.ui.text.y3 y3Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        s(j10, y3Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(long j10, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        t(j10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    private static final void w(r2 r2Var, long j10, long j11, long j12, boolean z10, pj.r<? super n7<Float>, ? super n7<androidx.compose.ui.graphics.q0>, ? super n7<androidx.compose.ui.graphics.q0>, ? super n7<Float>, ? super n7<Float>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> rVar, androidx.compose.runtime.c0 c0Var, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(r2Var, "TextFieldInputState", c0Var, (i10 & 14) | 48, 0);
        n nVar = new n(hm.b(d0.h1.FastSpatial, c0Var, 6));
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
        androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = t4.P(zVar);
        r2 r2Var2 = (r2) l3VarJ.p();
        c0Var.E(-1436405362);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
        }
        int[] iArr = r.f28730b;
        int i11 = iArr[r2Var2.ordinal()];
        float f15 = 0.0f;
        if (i11 == 1) {
            f10 = 1.0f;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new kotlin.k0();
                }
            } else if (z10) {
                f10 = 0.0f;
            }
            f10 = 1.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        Float fValueOf = Float.valueOf(f10);
        r2 r2Var3 = (r2) l3VarJ.y();
        c0Var.E(-1436405362);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
        }
        int i12 = iArr[r2Var3.ordinal()];
        if (i12 == 1) {
            f11 = 1.0f;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new kotlin.k0();
                }
            } else if (z10) {
                f11 = 0.0f;
            }
            f11 = 1.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        n7 n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf, Float.valueOf(f11), nVar.invoke(l3VarJ.w(), c0Var, 0), z3VarP, "LabelProgress", c0Var, androidx.profileinstaller.n.c.f73814m);
        d0.h1 h1Var = d0.h1.FastEffects;
        androidx.compose.animation.core.y0 y0VarB = hm.b(h1Var, c0Var, 6);
        p pVar = new p(y0VarB, hm.b(d0.h1.SlowEffects, c0Var, 6));
        androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = t4.P(zVar);
        r2 r2Var4 = (r2) l3VarJ.p();
        c0Var.E(-1093194547);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
        }
        int i13 = iArr[r2Var4.ordinal()];
        if (i13 == 1) {
            f12 = 1.0f;
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new kotlin.k0();
                }
            } else if (!z10) {
                f12 = 1.0f;
            }
            f12 = 0.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        Float fValueOf2 = Float.valueOf(f12);
        r2 r2Var5 = (r2) l3VarJ.y();
        c0Var.E(-1093194547);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
        }
        int i14 = iArr[r2Var5.ordinal()];
        if (i14 == 1) {
            f13 = 1.0f;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new kotlin.k0();
                }
            } else if (!z10) {
                f13 = 1.0f;
            }
            f13 = 0.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        n7 n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf2, Float.valueOf(f13), pVar.invoke(l3VarJ.w(), c0Var, 0), z3VarP2, "PlaceholderOpacity", c0Var, androidx.profileinstaller.n.c.f73814m);
        q qVar = new q(y0VarB);
        androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP3 = t4.P(zVar);
        r2 r2Var6 = (r2) l3VarJ.p();
        c0Var.E(-1258455321);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
        }
        int i15 = iArr[r2Var6.ordinal()];
        if (i15 == 1) {
            f14 = 1.0f;
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new kotlin.k0();
                }
            } else if (z10) {
                f14 = 0.0f;
            }
            f14 = 1.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        Float fValueOf3 = Float.valueOf(f14);
        r2 r2Var7 = (r2) l3VarJ.y();
        c0Var.E(-1258455321);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
        }
        int i16 = iArr[r2Var7.ordinal()];
        if (i16 == 1) {
            f15 = 1.0f;
        } else {
            if (i16 != 2) {
                if (i16 != 3) {
                    throw new kotlin.k0();
                }
            } else if (!z10) {
            }
            f15 = 1.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        n7 n7VarD3 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf3, Float.valueOf(f15), qVar.invoke(l3VarJ.w(), c0Var, 0), z3VarP3, "PrefixSuffixOpacity", c0Var, androidx.profileinstaller.n.c.f73814m);
        androidx.compose.animation.core.y0 y0VarB2 = hm.b(h1Var, c0Var, 6);
        o oVar = new o(y0VarB2);
        r2 r2Var8 = (r2) l3VarJ.y();
        c0Var.E(-12973394);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
        }
        long j13 = iArr[r2Var8.ordinal()] == 1 ? j10 : j11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        androidx.compose.ui.graphics.colorspace.c cVarE = androidx.compose.ui.graphics.q0.E(j13);
        boolean zD = c0Var.D(cVarE);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(cVarE);
            c0Var.Y(objI0);
        }
        androidx.compose.animation.core.z3 z3Var = (androidx.compose.animation.core.z3) objI0;
        r2 r2Var9 = (r2) l3VarJ.p();
        c0Var.E(-12973394);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
        }
        long j14 = iArr[r2Var9.ordinal()] == 1 ? j10 : j11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(j14);
        r2 r2Var10 = (r2) l3VarJ.y();
        c0Var.E(-12973394);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
        }
        long j15 = iArr[r2Var10.ordinal()] == 1 ? j10 : j11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        n7 n7VarD4 = androidx.compose.animation.core.w3.D(l3VarJ, q0VarN, androidx.compose.ui.graphics.q0.n(j15), oVar.invoke(l3VarJ.w(), c0Var, 0), z3Var, "LabelTextStyleColor", c0Var, androidx.profileinstaller.n.c.f73814m);
        m mVar = new m(y0VarB2);
        c0Var.E(-464752477);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        androidx.compose.ui.graphics.colorspace.c cVarE2 = androidx.compose.ui.graphics.q0.E(j12);
        boolean zD2 = c0Var.D(cVarE2);
        Object objI1 = c0Var.i0();
        if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(cVarE2);
            c0Var.Y(objI1);
        }
        androidx.compose.animation.core.z3 z3Var2 = (androidx.compose.animation.core.z3) objI1;
        c0Var.E(-464752477);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        androidx.compose.ui.graphics.q0 q0VarN2 = androidx.compose.ui.graphics.q0.n(j12);
        c0Var.E(-464752477);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        rVar.N(n7VarD, n7VarD4, androidx.compose.animation.core.w3.D(l3VarJ, q0VarN2, androidx.compose.ui.graphics.q0.n(j12), mVar.invoke(l3VarJ.w(), c0Var, 0), z3Var2, "LabelContentColor", c0Var, androidx.profileinstaller.n.c.f73814m), n7VarD2, n7VarD3, c0Var, Integer.valueOf(i10 & 458752));
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<androidx.compose.foundation.a1> z(boolean z10, boolean z11, boolean z12, @NotNull j40 j40Var, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        n7<androidx.compose.ui.graphics.q0> n7VarW;
        n7<androidx.compose.ui.unit.h> n7VarW2;
        androidx.compose.runtime.c0 c0Var2 = c0Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2047013045, i10, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
        }
        long jX = j40Var.X(z10, z11, z12);
        androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.FastEffects, c0Var2, 6);
        if (z10) {
            c0Var2.E(-1674507999);
            n7VarW = androidx.compose.animation.e1.c(jX, y0VarB, null, null, c0Var, 0, 12);
            c0Var2 = c0Var;
            c0Var2.A();
        } else {
            c0Var2.E(-1674427244);
            n7VarW = w6.w(androidx.compose.ui.graphics.q0.n(jX), c0Var2, 0);
            c0Var2.A();
        }
        n7<androidx.compose.ui.graphics.q0> n7Var = n7VarW;
        androidx.compose.animation.core.y0 y0VarB2 = hm.b(d0.h1.FastSpatial, c0Var2, 6);
        if (z10) {
            c0Var2.E(-1674245832);
            n7VarW2 = androidx.compose.animation.core.f.d(z12 ? f10 : f11, y0VarB2, null, null, c0Var2, 0, 12);
            c0Var2.A();
        } else {
            c0Var2.E(-1674063769);
            n7VarW2 = w6.w(androidx.compose.ui.unit.h.o(f11), c0Var2, (i10 >> 15) & 14);
            c0Var2.A();
        }
        n7<androidx.compose.foundation.a1> n7VarW3 = w6.w(androidx.compose.foundation.b1.a(n7VarW2.getValue().O(), n7Var.getValue().M()), c0Var2, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW3;
    }
}

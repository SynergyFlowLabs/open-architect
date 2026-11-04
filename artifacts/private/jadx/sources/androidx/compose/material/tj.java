package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,381:1\n1282#2,6:382\n646#3:388\n635#3:389\n646#3:390\n635#3:391\n113#4:392\n113#4:393\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:382,6\n118#1:388\n118#1:389\n123#1:390\n123#1:391\n379#1:392\n380#1:393\n*E\n"})
public final class tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f25022a = "TextField";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f25023b = "Hint";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f25024c = "Label";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f25025d = "Leading";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f25026e = "Trailing";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25027f = 150;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f25028g = 83;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f25029h = 67;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f25030i = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f25031j = androidx.compose.ui.unit.h.r(12);

    @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,381:1\n1282#2,6:382\n1282#2,6:388\n57#3:394\n61#3:397\n57#3:400\n61#3:403\n60#4:395\n70#4:398\n60#4:401\n70#4:404\n53#4,3:407\n22#5:396\n22#5:399\n22#5:402\n22#5:405\n33#6:406\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n*L\n192#1:382,6\n210#1:388,6\n211#1:394\n212#1:397\n214#1:400\n215#1:403\n211#1:395\n212#1:398\n214#1:401\n215#1:404\n217#1:407,3\n211#1:396\n212#1:399\n214#1:402\n215#1:405\n217#1:406\n*E\n"})
    static final class a implements pj.q<Float, androidx.compose.ui.graphics.q0, androidx.compose.ui.graphics.q0, Float, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ gj f25035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f25037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f25038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f25041j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ lk f25042k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25043l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f25044m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f25045n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f25046o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25047s;

        /* JADX INFO: renamed from: androidx.compose.material.tj$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0202a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25048a;

            static {
                int[] iArr = new int[lk.values().length];
                try {
                    iArr[lk.Filled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lk.Outlined.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f25048a = iArr;
            }
        }

        static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f25049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f25050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f25052d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f25053e;

            /* JADX WARN: Multi-variable type inference failed */
            b(float f10, long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, long j11) {
                this.f25049a = f10;
                this.f25050b = j10;
                this.f25051c = function2;
                this.f25052d = z10;
                this.f25053e = j11;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(723429411, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                }
                x9 x9Var = x9.f25488a;
                androidx.compose.ui.text.y3 y3VarC = androidx.compose.ui.text.z3.c(x9Var.c(c0Var, 6).n(), x9Var.c(c0Var, 6).f(), this.f25049a);
                boolean z10 = this.f25052d;
                long j10 = this.f25053e;
                if (z10) {
                    y3VarC = androidx.compose.ui.text.y3.m(y3VarC, j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                }
                tj.f(this.f25050b, y3VarC, null, this.f25051c, c0Var, androidx.media3.exoplayer.a5.S0, 0);
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
            final /* synthetic */ long f25054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25055b;

            /* JADX WARN: Multi-variable type inference failed */
            c(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f25054a = j10;
                this.f25055b = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-317090443, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                }
                tj.f(this.f25054a, null, null, this.f25055b, c0Var, 0, 6);
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

        @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,381:1\n70#2:382\n67#2,9:383\n77#2:422\n79#3,6:392\n86#3,3:407\n89#3,2:416\n93#3:421\n347#4,9:398\n356#4,3:418\n4206#5,6:410\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n*L\n152#1:382\n152#1:383,9\n152#1:422\n152#1:392,6\n152#1:407,3\n152#1:416,2\n152#1:421\n152#1:398,9\n152#1:418,3\n152#1:410,6\n*E\n"})
        static final class d implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f25056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gj f25057b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f25058c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25059d;

            /* JADX WARN: Multi-variable type inference failed */
            d(float f10, gj gjVar, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f25056a = f10;
                this.f25057b = gjVar;
                this.f25058c = z10;
                this.f25059d = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= c0Var.D(a0Var) ? 4 : 2;
                }
                if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-426706263, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.a.a(a0Var, this.f25056a);
                gj gjVar = this.f25057b;
                boolean z10 = this.f25058c;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f25059d;
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
                int i11 = 3 ^ 0;
                tj.f(gjVar.g(z10, c0Var, 0).getValue().M(), x9.f25488a.c(c0Var, 6).n(), null, function2, c0Var, 0, 4);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                c(a0Var, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f25060a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25061b;

            /* JADX WARN: Multi-variable type inference failed */
            e(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f25060a = j10;
                this.f25061b = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(262889693, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                }
                tj.f(this.f25060a, null, null, this.f25061b, c0Var, 0, 6);
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

        @SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,381:1\n70#2:382\n67#2,9:383\n77#2:422\n79#3,6:392\n86#3,3:407\n89#3,2:416\n93#3:421\n347#4,9:398\n356#4,3:418\n4206#5,6:410\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1\n*L\n194#1:382\n194#1:383,9\n194#1:422\n194#1:392,6\n194#1:407,3\n194#1:416,2\n194#1:421\n194#1:398,9\n194#1:418,3\n194#1:410,6\n*E\n"})
        static final class f implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3<n0.n> f25062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.g5 f25063b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25064c;

            /* JADX WARN: Multi-variable type inference failed */
            f(androidx.compose.runtime.n3<n0.n> n3Var, androidx.compose.foundation.layout.g5 g5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f25062a = n3Var;
                this.f25063b = g5Var;
                this.f25064c = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1107746014, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                }
                androidx.compose.ui.a0 a0VarF = gc.F(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, gc.f22899c), this.f25062a.getValue().y(), this.f25063b);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f25064c;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
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
                if (function2 == null) {
                    c0Var.E(-1295979683);
                } else {
                    c0Var.E(235288868);
                    function2.invoke(c0Var, 0);
                }
                c0Var.A();
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

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, String str, gj gjVar, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, androidx.compose.ui.graphics.q3 q3Var, lk lkVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, boolean z12, androidx.compose.foundation.layout.g5 g5Var, boolean z13, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7) {
            this.f25032a = function2;
            this.f25033b = function3;
            this.f25034c = str;
            this.f25035d = gjVar;
            this.f25036e = z10;
            this.f25037f = z11;
            this.f25038g = hVar;
            this.f25039h = function4;
            this.f25040i = function5;
            this.f25041j = q3Var;
            this.f25042k = lkVar;
            this.f25043l = function6;
            this.f25044m = z12;
            this.f25045n = g5Var;
            this.f25046o = z13;
            this.f25047s = function7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(float f10, androidx.compose.runtime.n3 n3Var, n0.n nVar) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (nVar.y() >> 32)) * f10;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nVar.y() & com.rabbitmq.client.k0.f265952a)) * f10;
            if (Float.intBitsToFloat((int) (((n0.n) n3Var.getValue()).y() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((n0.n) n3Var.getValue()).y() & com.rabbitmq.client.k0.f265952a)) != fIntBitsToFloat2) {
                n3Var.setValue(n0.n.c(n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a))));
            }
            return Unit.f312394a;
        }

        @Override // pj.q
        public /* bridge */ /* synthetic */ Unit H(Float f10, androidx.compose.ui.graphics.q0 q0Var, androidx.compose.ui.graphics.q0 q0Var2, Float f11, androidx.compose.runtime.c0 c0Var, Integer num) {
            d(f10.floatValue(), q0Var.M(), q0Var2.M(), f11.floatValue(), c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(float f10, long j10, long j11, float f11, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            long j12;
            int i12;
            androidx.compose.runtime.internal.c cVar;
            androidx.compose.runtime.internal.c cVar2;
            androidx.compose.runtime.internal.c cVar3;
            final float f12 = f10;
            if ((i10 & 6) == 0) {
                i11 = (c0Var.I(f12) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                j12 = j10;
                i11 |= c0Var.L(j12) ? 32 : 16;
            } else {
                j12 = j10;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i11 |= c0Var.L(j11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= c0Var.I(f11) ? 2048 : 1024;
            }
            int i13 = i11;
            if (!c0Var.h((i13 & 9363) != 9362, i13 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(33336375, i13, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f25032a;
            androidx.compose.runtime.internal.c cVarE = null;
            if (function2 == null) {
                c0Var.E(986681709);
                c0Var.A();
                i12 = 54;
            } else {
                c0Var.E(986681710);
                i12 = 54;
                b bVar = new b(f12, j11, function2, this.f25046o, j12);
                f12 = f12;
                cVarE = androidx.compose.runtime.internal.w.e(723429411, true, bVar, c0Var, 54);
                c0Var.A();
            }
            androidx.compose.runtime.internal.c cVar4 = cVarE;
            if (this.f25033b == null || this.f25034c.length() != 0 || f11 <= 0.0f) {
                c0Var.E(988093542);
                c0Var.A();
                cVar = null;
            } else {
                c0Var.E(987666549);
                androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-426706263, true, new d(f11, this.f25035d, this.f25036e, this.f25033b), c0Var, i12);
                c0Var.A();
                cVar = cVarE2;
            }
            long jM = this.f25035d.d(this.f25036e, this.f25037f, this.f25038g, c0Var, 0).getValue().M();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f25039h;
            if (function3 == null) {
                c0Var.E(988282301);
                c0Var.A();
                cVar2 = null;
            } else {
                c0Var.E(988282302);
                androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-317090443, true, new c(jM, function3), c0Var, i12);
                c0Var.A();
                cVar2 = cVarE3;
            }
            long jM2 = this.f25035d.j(this.f25036e, this.f25037f, this.f25038g, c0Var, 0).getValue().M();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function4 = this.f25040i;
            if (function4 == null) {
                c0Var.E(988575964);
                c0Var.A();
                cVar3 = null;
            } else {
                c0Var.E(988575965);
                androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(262889693, true, new e(jM2, function4), c0Var, i12);
                c0Var.A();
                cVar3 = cVarE4;
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.v.c(androidx.compose.ui.a0.E, this.f25035d.a(this.f25036e, c0Var, 0).getValue().M(), this.f25041j);
            int i14 = C0202a.f25048a[this.f25042k.ordinal()];
            if (i14 == 1) {
                c0Var.E(988856360);
                ck.r(a0VarC, this.f25043l, cVar4, cVar, cVar2, cVar3, this.f25044m, f10, this.f25045n, c0Var, (i13 << 21) & 29360128);
                c0Var.A();
            } else {
                if (i14 != 2) {
                    c0Var.E(1971561250);
                    c0Var.A();
                    throw new kotlin.k0();
                }
                c0Var.E(989436742);
                Object objI0 = c0Var.i0();
                androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(n0.n.c(n0.n.f332724b.c()), null, 2, null);
                    c0Var.Y(objI0);
                }
                final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-1107746014, true, new f(n3Var, this.f25045n, this.f25047s), c0Var, i12);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function5 = this.f25043l;
                boolean z10 = this.f25044m;
                boolean z11 = (i13 & 14) == 4;
                Object objI1 = c0Var.i0();
                if (z11 || objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material.sj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return tj.a.f(f12, n3Var, (n0.n) obj);
                        }
                    };
                    c0Var.Y(objI1);
                }
                gc.x(a0VarC, function5, cVar, cVar4, cVar2, cVar3, z10, f12, (Function1) objI1, cVarE5, this.f25045n, c0Var, ((i13 << 21) & 29360128) | 805306368, 0);
                c0Var.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    static final class b implements pj.n<j9, androidx.compose.runtime.c0, Integer, androidx.compose.ui.graphics.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ gj f25065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f25068d;

        b(gj gjVar, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar) {
            this.f25065a = gjVar;
            this.f25066b = z10;
            this.f25067c = z11;
            this.f25068d = hVar;
        }

        @androidx.compose.runtime.o
        public final long c(j9 j9Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1423138213);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1423138213, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
            }
            long jM = this.f25065a.h(this.f25066b, j9Var == j9.UnfocusedEmpty ? false : this.f25067c, this.f25068d, c0Var, 0).getValue().M();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return jM;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.q0 invoke(j9 j9Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return androidx.compose.ui.graphics.q0.n(c(j9Var, c0Var, num.intValue()));
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f25069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Float f25070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25071c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Float f25072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f25074c;

            /* JADX WARN: Multi-variable type inference failed */
            a(Float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, long j10) {
                this.f25072a = f10;
                this.f25073b = function2;
                this.f25074c = j10;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1624601445, i10, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                }
                if (this.f25072a != null) {
                    c0Var.E(1484860324);
                    androidx.compose.runtime.a1.e(w4.c().f(this.f25072a), this.f25073b, c0Var, androidx.compose.runtime.n4.f36267i);
                    c0Var.A();
                } else {
                    c0Var.E(1485059902);
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(this.f25074c))), this.f25073b, c0Var, androidx.compose.runtime.n4.f36267i);
                    c0Var.A();
                }
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
        c(long j10, Float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f25069a = j10;
            this.f25070b = f10;
            this.f25071c = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-650790565, i10, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            androidx.compose.runtime.a1.e(x4.a().f(androidx.compose.ui.graphics.q0.n(this.f25069a)), androidx.compose.runtime.internal.w.e(-1624601445, true, new a(this.f25070b, this.f25071c, this.f25069a), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void d(@NotNull final lk lkVar, @NotNull final String str, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final androidx.compose.ui.text.input.j1 j1Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, final boolean z10, final boolean z11, final boolean z12, @NotNull final androidx.compose.foundation.interaction.h hVar, @NotNull final androidx.compose.foundation.layout.g5 g5Var, @NotNull final androidx.compose.ui.graphics.q3 q3Var, @NotNull final gj gjVar, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        int i13;
        androidx.compose.runtime.c0 c0Var2;
        j9 j9Var;
        Integer num;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(418608794);
        if ((i10 & 6) == 0) {
            i12 = (c0VarR.K(lkVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(str) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            function8 = function2;
            i12 |= c0VarR.k0(function8) ? 256 : 128;
        } else {
            function8 = function2;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0VarR.D(j1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0VarR.k0(function3) ? 16384 : 8192;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            function9 = function4;
            i12 |= c0VarR.k0(function9) ? 131072 : 65536;
        } else {
            function9 = function4;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0VarR.k0(function5) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0VarR.k0(function6) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0VarR.G(z10) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0VarR.G(z11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.G(z12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.D(hVar) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.D(g5Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.D(q3Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.D(gjVar) ? 16384 : 8192;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i13 |= c0VarR.k0(function7) ? 131072 : 65536;
        }
        int i14 = i13;
        if (c0VarR.h(((i12 & 306783379) == 306783378 && (74899 & i14) == 74898) ? false : true, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(418608794, i12, i14, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z13 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | ((i12 & 7168) == 2048);
            Object objI0 = c0VarR.i0();
            if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = j1Var.a(new androidx.compose.ui.text.f(str, null, 2, null));
                c0VarR.Y(objI0);
            }
            String strM = ((androidx.compose.ui.text.input.h1) objI0).b().m();
            if (androidx.compose.foundation.interaction.d.a(hVar, c0VarR, (i14 >> 3) & 14).getValue().booleanValue()) {
                j9Var = j9.Focused;
            } else {
                j9Var = strM.length() == 0 ? j9.UnfocusedEmpty : j9.UnfocusedNotEmpty;
            }
            b bVar = new b(gjVar, z11, z12, hVar);
            x9 x9Var = x9.f25488a;
            cl clVarC = x9Var.c(c0VarR, 6);
            androidx.compose.ui.text.y3 y3VarN = clVarC.n();
            androidx.compose.ui.text.y3 y3VarF = clVarC.f();
            long jT = y3VarN.t();
            androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
            boolean z14 = (androidx.compose.ui.graphics.q0.y(jT, aVar.u()) && !androidx.compose.ui.graphics.q0.y(y3VarF.t(), aVar.u())) || (!androidx.compose.ui.graphics.q0.y(y3VarN.t(), aVar.u()) && androidx.compose.ui.graphics.q0.y(y3VarF.t(), aVar.u()));
            kk kkVar = kk.f23613a;
            c0VarR.E(-1443811635);
            long jT2 = x9Var.c(c0VarR, 6).f().t();
            if (z14) {
                c0VarR.E(-887928539);
                if (jT2 != 16) {
                    num = 0;
                } else {
                    num = 0;
                    jT2 = bVar.invoke(j9Var, c0VarR, null).M();
                }
                c0VarR.A();
            } else {
                num = 0;
                c0VarR.E(1218284988);
                c0VarR.A();
            }
            long j10 = jT2;
            c0VarR.A();
            c0VarR.E(-1443804369);
            long jT3 = x9Var.c(c0VarR, 6).n().t();
            if (z14 != 0) {
                c0VarR.E(-1026713946);
                if (jT3 == 16) {
                    jT3 = bVar.invoke(j9Var, c0VarR, num).M();
                }
                c0VarR.A();
            } else {
                c0VarR.E(798166043);
                c0VarR.A();
            }
            long j11 = jT3;
            c0VarR.A();
            j9 j9Var2 = j9Var;
            c0Var2 = c0VarR;
            kkVar.b(j9Var2, j10, j11, bVar, function3 != null, androidx.compose.runtime.internal.w.e(33336375, true, new a(function3, function9, strM, gjVar, z11, z12, hVar, function5, function6, q3Var, lkVar, function8, z10, g5Var, z14, function7), c0Var2, 54), c0Var2, 1769472);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.qj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tj.e(lkVar, str, function2, j1Var, function3, function4, function5, function6, z10, z11, z12, hVar, g5Var, q3Var, gjVar, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(lk lkVar, String str, Function2 function2, androidx.compose.ui.text.input.j1 j1Var, Function2 function3, Function2 function4, Function2 function5, Function2 function6, boolean z10, boolean z11, boolean z12, androidx.compose.foundation.interaction.h hVar, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.ui.graphics.q3 q3Var, gj gjVar, Function2 function7, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(lkVar, str, function2, j1Var, function3, function4, function5, function6, z10, z11, z12, hVar, g5Var, q3Var, gjVar, function7, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.q(index = 0)
    public static final void f(final long j10, @Nullable androidx.compose.ui.text.y3 y3Var, @Nullable Float f10, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.text.y3 y3Var2;
        final Float f11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2064632657);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(y3Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(f10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            androidx.compose.ui.text.y3 y3Var3 = i13 != 0 ? null : y3Var;
            Float f12 = i14 != 0 ? null : f10;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2064632657, i12, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-650790565, true, new c(j10, f12, function2), c0VarR, 54);
            if (y3Var3 != null) {
                c0VarR.E(-162878945);
                wk.l(y3Var3, cVarE, c0VarR, ((i12 >> 3) & 14) | 48);
            } else {
                c0VarR.E(-162877309);
                cVarE.invoke(c0VarR, 6);
            }
            c0VarR.A();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            y3Var2 = y3Var3;
            f11 = f12;
        } else {
            c0VarR.u();
            y3Var2 = y3Var;
            f11 = f10;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.rj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tj.g(j10, y3Var2, f11, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(long j10, androidx.compose.ui.text.y3 y3Var, Float f10, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(j10, y3Var, f10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, @NotNull final String str) {
        if (z10) {
            a0Var = androidx.compose.ui.semantics.t.f(a0Var, false, new Function1() { // from class: androidx.compose.material.pj
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tj.i(str, (androidx.compose.ui.semantics.e0) obj);
                }
            }, 1, null);
        }
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.q(e0Var, str);
        return Unit.f312394a;
    }

    public static final float j() {
        return f25031j;
    }

    @Nullable
    public static final Object k(@NotNull androidx.compose.ui.layout.y yVar) {
        Object objC = yVar.c();
        androidx.compose.ui.layout.k0 k0Var = objC instanceof androidx.compose.ui.layout.k0 ? (androidx.compose.ui.layout.k0) objC : null;
        if (k0Var != null) {
            return k0Var.N6();
        }
        return null;
    }

    public static final float l() {
        return f25030i;
    }

    public static final int m(@Nullable androidx.compose.ui.layout.i2 i2Var) {
        if (i2Var != null) {
            return i2Var.c1();
        }
        return 0;
    }

    public static final int n(@Nullable androidx.compose.ui.layout.i2 i2Var) {
        if (i2Var != null) {
            return i2Var.h1();
        }
        return 0;
    }
}

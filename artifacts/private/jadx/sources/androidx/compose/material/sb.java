package androidx.compose.material;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n75#2:448\n70#3:449\n68#3,8:450\n77#3:488\n70#3:525\n67#3,9:526\n77#3:565\n70#3:566\n67#3,9:567\n77#3:606\n79#4,6:458\n86#4,3:473\n89#4,2:482\n93#4:487\n79#4:495\n77#4,8:496\n86#4,3:513\n89#4,2:522\n79#4,6:535\n86#4,3:550\n89#4,2:559\n93#4:564\n79#4,6:576\n86#4,3:591\n89#4,2:600\n93#4:605\n93#4:609\n347#5,9:464\n356#5,3:484\n347#5,9:504\n356#5:524\n347#5,9:541\n356#5,3:561\n347#5,9:582\n356#5,3:602\n357#5,2:607\n4206#6,6:476\n4206#6,6:516\n4206#6,6:553\n4206#6,6:594\n1282#7,6:489\n85#8:610\n113#9:611\n113#9:612\n113#9:613\n113#9:614\n113#9:615\n113#9:616\n113#9:617\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n211#1:448\n228#1:449\n228#1:450,8\n228#1:488\n320#1:525\n320#1:526,9\n320#1:565\n322#1:566\n322#1:567,9\n322#1:606\n228#1:458,6\n228#1:473,3\n228#1:482,2\n228#1:487\n319#1:495\n319#1:496,8\n319#1:513,3\n319#1:522,2\n320#1:535,6\n320#1:550,3\n320#1:559,2\n320#1:564\n322#1:576,6\n322#1:591,3\n322#1:600,2\n322#1:605\n319#1:609\n228#1:464,9\n228#1:484,3\n319#1:504,9\n319#1:524\n320#1:541,9\n320#1:561,3\n322#1:582,9\n322#1:602,3\n319#1:607,2\n228#1:476,6\n319#1:516,6\n320#1:553,6\n322#1:594,6\n324#1:489,6\n288#1:610\n424#1:611\n427#1:612\n430#1:613\n436#1:614\n439#1:615\n444#1:616\n446#1:617\n*E\n"})
public final class sb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f24922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f24923e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f24919a = new androidx.compose.animation.core.y3<>(300, 0, androidx.compose.animation.core.u0.d(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24920b = androidx.compose.ui.unit.h.r(72);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24921c = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24924f = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24925g = androidx.compose.ui.unit.h.r(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.v6 f24926h = androidx.compose.foundation.layout.b7.e(androidx.compose.ui.unit.h.r(0), 0.0f, 0.0f, 0.0f, 14, null);

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRail$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,447:1\n87#2:448\n84#2,9:449\n94#2:488\n79#3,6:458\n86#3,3:473\n89#3,2:482\n93#3:487\n347#4,9:464\n356#4,3:484\n4206#5,6:476\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRail$1\n*L\n116#1:448\n116#1:449,9\n116#1:488\n116#1:458,6\n116#1:473,3\n116#1:482,2\n116#1:487\n116#1:464,9\n116#1:484,3\n116#1:476,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f24927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f24928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f24929c;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.layout.v6 v6Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2) {
            this.f24927a = v6Var;
            this.f24928b = nVar;
            this.f24929c = nVar2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10 = false | true;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(366031815, i10, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:115)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.selection.b.b(androidx.compose.foundation.layout.d5.t(androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.d(aVar, 0.0f, 1, null), this.f24927a), 0.0f, sb.f24922d, 1, null));
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f24928b;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar2 = this.f24929c;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), bVarM, c0Var, 48);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            if (nVar != null) {
                c0Var.E(-1703415150);
                nVar.invoke(n0Var, c0Var, 6);
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar, sb.f24923e), c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(-1703323855);
                c0Var.A();
            }
            nVar2.invoke(n0Var, c0Var, 6);
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

    static final class b implements pj.n<Float, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24932c;

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f24930a = z10;
            this.f24931b = function2;
            this.f24932c = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(float f10, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.I(f10) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 4 ^ (-1);
                androidx.compose.runtime.m0.A0(317431928, i10, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:242)");
            }
            if (this.f24930a) {
                f10 = 1.0f;
            }
            sb.k(this.f24931b, this.f24932c, f10, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Float f10, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(f10.floatValue(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24933a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f24933a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-674640273, i10, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:215)");
            }
            wk.l(androidx.compose.ui.text.y3.m(x9.f25488a.c(c0Var, 6).f(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), this.f24933a, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRailItemBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,447:1\n563#2,2:448\n34#2,6:450\n565#2:456\n563#2,2:457\n34#2,6:459\n565#2:465\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRailItemBaselineLayout$2$1\n*L\n325#1:448,2\n325#1:450,6\n325#1:456\n330#1:457,2\n330#1:459,6\n330#1:465\n*E\n"})
    static final class d implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f24935b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, float f10) {
            this.f24934a = function2;
            this.f24935b = f10;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.i2 i2VarP0;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i11);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "icon")) {
                    androidx.compose.ui.layout.i2 i2VarP1 = z0Var.P0(j10);
                    if (this.f24934a != null) {
                        int size2 = list.size();
                        while (true) {
                            if (i10 >= size2) {
                                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                                throw new kotlin.a0();
                            }
                            androidx.compose.ui.layout.z0 z0Var2 = list.get(i10);
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), com.google.firebase.messaging.e.f.f123534d)) {
                                i2VarP0 = z0Var2.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null));
                                break;
                            }
                            i10++;
                        }
                    } else {
                        i2VarP0 = null;
                    }
                    if (this.f24934a == null) {
                        return sb.y(c1Var, i2VarP1, j10);
                    }
                    Intrinsics.checkNotNull(i2VarP0);
                    return sb.A(c1Var, i2VarP0, i2VarP1, j10, this.f24935b);
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<Float, androidx.compose.runtime.c0, Integer, Unit> f24936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f24937b;

        /* JADX WARN: Multi-variable type inference failed */
        e(pj.n<? super Float, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.n7<Float> n7Var) {
            this.f24936a = nVar;
            this.f24937b = n7Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1330097921, i10, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:298)");
            }
            this.f24936a.invoke(Float.valueOf(sb.o(this.f24937b)), c0Var, 0);
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

    static {
        float f10 = 8;
        f24922d = androidx.compose.ui.unit.h.r(f10);
        f24923e = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 A(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10) {
        final int iO = (androidx.compose.ui.unit.b.o(j10) - i2Var.M(androidx.compose.ui.layout.b.b())) - c1Var.g6(f24924f);
        final int iP = (androidx.compose.ui.unit.b.p(j10) - i2Var.h1()) / 2;
        final int iG6 = c1Var.g6(f24925g);
        int iO2 = (androidx.compose.ui.unit.b.o(j10) - i2Var2.c1()) / 2;
        final int iP2 = (androidx.compose.ui.unit.b.p(j10) - i2Var2.h1()) / 2;
        final int iL0 = kotlin.math.b.L0((iO2 - iG6) * (1 - f10));
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.material.mb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sb.B(f10, i2Var, iP, iO, iL0, i2Var2, iP2, iG6, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(float f10, androidx.compose.ui.layout.i2 i2Var, int i10, int i11, int i12, androidx.compose.ui.layout.i2 i2Var2, int i13, int i14, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a aVar2;
        if (f10 == 0.0f) {
            aVar2 = aVar;
        } else {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i10, i11 + i12, 0.0f, 4, null);
            aVar2 = aVar;
        }
        androidx.compose.ui.layout.i2.a.e0(aVar2, i2Var2, i13, i14 + i12, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:109:0x018b  */
    /* JADX WARN: Code duplicated, block: B:112:0x019b  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void h(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @Nullable pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jN;
        long j12;
        float fA;
        int i13;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        int i14;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j13;
        final long j14;
        final float f11;
        final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5;
        int i16;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2116369751);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
                jN = j10;
                int i18 = c0VarR.L(jN) ? 32 : 16;
                i12 |= i18;
            } else {
                jN = j10;
            }
            i12 |= i18;
        } else {
            jN = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j11;
                int i19 = c0VarR.L(j12) ? 256 : 128;
                i12 |= i19;
            } else {
                j12 = j11;
            }
            i12 |= i19;
        } else {
            j12 = j11;
        }
        int i20 = i11 & 8;
        if (i20 == 0) {
            if ((i10 & 3072) == 0) {
                fA = f10;
                i12 |= c0VarR.I(fA) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    nVar3 = nVar;
                    if (c0VarR.k0(nVar3)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i12 |= i15;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                                jN = x9.f25488a.a(c0VarR, 6).n();
                            }
                            if ((i11 & 4) != 0) {
                                long jD = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                                i12 &= -897;
                                j12 = jD;
                            }
                            if (i20 != 0) {
                                fA = kb.f23505a.a();
                            }
                            if (i13 != 0) {
                                nVar5 = null;
                                i16 = -2116369751;
                            } else {
                                nVar5 = nVar3;
                                i16 = -2116369751;
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            fA = fA;
                            nVar5 = nVar3;
                            i16 = -2116369751;
                            a0Var4 = a0Var2;
                            jN = jN;
                        }
                        long j15 = j12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                        }
                        int i21 = i12 << 3;
                        c0Var2 = c0VarR;
                        i(f24926h, a0Var4, jN, j15, fA, nVar5, nVar2, c0Var2, 6 | (i21 & com.planner5d.library.engine.input.f.b.B) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (i21 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        j13 = jN;
                        j14 = j15;
                        f11 = fA;
                        nVar4 = nVar5;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j13 = jN;
                        j14 = j12;
                        f11 = fA;
                        nVar4 = nVar3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 4) != 0) {
                            long jD2 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD2;
                        }
                        if (i20 != 0) {
                            fA = kb.f23505a.a();
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                            i16 = -2116369751;
                        } else {
                            nVar5 = nVar3;
                            i16 = -2116369751;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 4) != 0) {
                            long jD3 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD3;
                        }
                        if (i20 != 0) {
                            fA = kb.f23505a.a();
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                            i16 = -2116369751;
                        } else {
                            nVar5 = nVar3;
                            i16 = -2116369751;
                        }
                    }
                    long j16 = j12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                    }
                    int i22 = i12 << 3;
                    c0Var2 = c0VarR;
                    i(f24926h, a0Var4, jN, j16, fA, nVar5, nVar2, c0Var2, 6 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (i22 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j13 = jN;
                    j14 = j16;
                    f11 = fA;
                    nVar4 = nVar5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jN;
                    j14 = j12;
                    f11 = fA;
                    nVar4 = nVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar3 = nVar;
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 4) != 0) {
                            long jD4 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD4;
                        }
                        if (i20 != 0) {
                            fA = kb.f23505a.a();
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                            i16 = -2116369751;
                        } else {
                            nVar5 = nVar3;
                            i16 = -2116369751;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 4) != 0) {
                            long jD5 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD5;
                        }
                        if (i20 != 0) {
                            fA = kb.f23505a.a();
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                            i16 = -2116369751;
                        } else {
                            nVar5 = nVar3;
                            i16 = -2116369751;
                        }
                    }
                    long j17 = j12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                    }
                    int i23 = i12 << 3;
                    c0Var2 = c0VarR;
                    i(f24926h, a0Var4, jN, j17, fA, nVar5, nVar2, c0Var2, 6 | (i23 & com.planner5d.library.engine.input.f.b.B) | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (i23 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j13 = jN;
                    j14 = j17;
                    f11 = fA;
                    nVar4 = nVar5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jN;
                    j14 = j12;
                    f11 = fA;
                    nVar4 = nVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 4) != 0) {
                        long jD6 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD6;
                    }
                    if (i20 != 0) {
                        fA = kb.f23505a.a();
                    }
                    if (i13 != 0) {
                        nVar5 = null;
                        i16 = -2116369751;
                    } else {
                        nVar5 = nVar3;
                        i16 = -2116369751;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 4) != 0) {
                        long jD7 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD7;
                    }
                    if (i20 != 0) {
                        fA = kb.f23505a.a();
                    }
                    if (i13 != 0) {
                        nVar5 = null;
                        i16 = -2116369751;
                    } else {
                        nVar5 = nVar3;
                        i16 = -2116369751;
                    }
                }
                long j18 = j12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                }
                int i24 = i12 << 3;
                c0Var2 = c0VarR;
                i(f24926h, a0Var4, jN, j18, fA, nVar5, nVar2, c0Var2, 6 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (i24 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j13 = jN;
                j14 = j18;
                f11 = fA;
                nVar4 = nVar5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jN;
                j14 = j12;
                f11 = fA;
                nVar4 = nVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        fA = f10;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                nVar3 = nVar;
                if (c0VarR.k0(nVar3)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 4) != 0) {
                            long jD8 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD8;
                        }
                        if (i20 != 0) {
                            fA = kb.f23505a.a();
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                            i16 = -2116369751;
                        } else {
                            nVar5 = nVar3;
                            i16 = -2116369751;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 4) != 0) {
                            long jD9 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD9;
                        }
                        if (i20 != 0) {
                            fA = kb.f23505a.a();
                        }
                        if (i13 != 0) {
                            nVar5 = null;
                            i16 = -2116369751;
                        } else {
                            nVar5 = nVar3;
                            i16 = -2116369751;
                        }
                    }
                    long j19 = j12;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                    }
                    int i25 = i12 << 3;
                    c0Var2 = c0VarR;
                    i(f24926h, a0Var4, jN, j19, fA, nVar5, nVar2, c0Var2, 6 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j13 = jN;
                    j14 = j19;
                    f11 = fA;
                    nVar4 = nVar5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jN;
                    j14 = j12;
                    f11 = fA;
                    nVar4 = nVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 4) != 0) {
                        long jD10 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD10;
                    }
                    if (i20 != 0) {
                        fA = kb.f23505a.a();
                    }
                    if (i13 != 0) {
                        nVar5 = null;
                        i16 = -2116369751;
                    } else {
                        nVar5 = nVar3;
                        i16 = -2116369751;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 4) != 0) {
                        long jD11 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD11;
                    }
                    if (i20 != 0) {
                        fA = kb.f23505a.a();
                    }
                    if (i13 != 0) {
                        nVar5 = null;
                        i16 = -2116369751;
                    } else {
                        nVar5 = nVar3;
                        i16 = -2116369751;
                    }
                }
                long j110 = j12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                }
                int i26 = i12 << 3;
                c0Var2 = c0VarR;
                i(f24926h, a0Var4, jN, j110, fA, nVar5, nVar2, c0Var2, 6 | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j13 = jN;
                j14 = j110;
                f11 = fA;
                nVar4 = nVar5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jN;
                j14 = j12;
                f11 = fA;
                nVar4 = nVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        nVar3 = nVar;
        if ((i11 & 32) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 4) != 0) {
                        long jD12 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD12;
                    }
                    if (i20 != 0) {
                        fA = kb.f23505a.a();
                    }
                    if (i13 != 0) {
                        nVar5 = null;
                        i16 = -2116369751;
                    } else {
                        nVar5 = nVar3;
                        i16 = -2116369751;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 4) != 0) {
                        long jD13 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD13;
                    }
                    if (i20 != 0) {
                        fA = kb.f23505a.a();
                    }
                    if (i13 != 0) {
                        nVar5 = null;
                        i16 = -2116369751;
                    } else {
                        nVar5 = nVar3;
                        i16 = -2116369751;
                    }
                }
                long j111 = j12;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                }
                int i27 = i12 << 3;
                c0Var2 = c0VarR;
                i(f24926h, a0Var4, jN, j111, fA, nVar5, nVar2, c0Var2, 6 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j13 = jN;
                j14 = j111;
                f11 = fA;
                nVar4 = nVar5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jN;
                j14 = j12;
                f11 = fA;
                nVar4 = nVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jN = x9.f25488a.a(c0VarR, 6).n();
                }
                if ((i11 & 4) != 0) {
                    long jD14 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jD14;
                }
                if (i20 != 0) {
                    fA = kb.f23505a.a();
                }
                if (i13 != 0) {
                    nVar5 = null;
                    i16 = -2116369751;
                } else {
                    nVar5 = nVar3;
                    i16 = -2116369751;
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jN = x9.f25488a.a(c0VarR, 6).n();
                }
                if ((i11 & 4) != 0) {
                    long jD15 = n4.d(jN, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jD15;
                }
                if (i20 != 0) {
                    fA = kb.f23505a.a();
                }
                if (i13 != 0) {
                    nVar5 = null;
                    i16 = -2116369751;
                } else {
                    nVar5 = nVar3;
                    i16 = -2116369751;
                }
            }
            long j112 = j12;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
            }
            int i28 = i12 << 3;
            c0Var2 = c0VarR;
            i(f24926h, a0Var4, jN, j112, fA, nVar5, nVar2, c0Var2, 6 | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j13 = jN;
            j14 = j112;
            f11 = fA;
            nVar4 = nVar5;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j13 = jN;
            j14 = j12;
            f11 = fA;
            nVar4 = nVar3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ob
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return sb.q(a0Var3, j13, j14, f11, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x0191  */
    /* JADX WARN: Code duplicated, block: B:118:0x019d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @Nullable pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        long jN;
        long jD;
        int i13;
        float f11;
        int i14;
        int i15;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        int i16;
        int i17;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final long j12;
        final long j13;
        final float f12;
        final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        float fA;
        long j14;
        androidx.compose.ui.a0 a0Var4;
        int i18;
        int i19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-171916405);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(v6Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    jN = j10;
                    int i21 = c0VarR.L(jN) ? 256 : 128;
                    i12 |= i21;
                } else {
                    jN = j10;
                }
                i12 |= i21;
            } else {
                jN = j10;
            }
            if ((i10 & 3072) == 0) {
                jD = j11;
                if ((i11 & 8) == 0 || !c0VarR.L(jD)) {
                    i19 = 1024;
                } else {
                    i19 = 2048;
                }
                i12 |= i19;
            } else {
                jD = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        nVar3 = nVar;
                        if (c0VarR.k0(nVar3)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i20 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jN = x9.f25488a.a(c0VarR, 6).n();
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fA = kb.f23505a.a();
                            } else {
                                fA = f11;
                            }
                            if (i15 != 0) {
                                nVar4 = null;
                            } else {
                                nVar4 = nVar3;
                            }
                            j14 = jD;
                            a0Var4 = a0Var3;
                            i18 = -171916405;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            fA = f11;
                            nVar4 = nVar3;
                            i18 = -171916405;
                            jN = jN;
                            j14 = jD;
                            a0Var4 = a0Var;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                        }
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var4;
                        j12 = jN;
                        j13 = j14;
                        f12 = fA;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        j12 = jN;
                        j13 = jD;
                        f12 = f11;
                        nVar4 = nVar3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar3 = nVar;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = kb.f23505a.a();
                        } else {
                            fA = f11;
                        }
                        if (i15 != 0) {
                            nVar4 = null;
                        } else {
                            nVar4 = nVar3;
                        }
                        j14 = jD;
                        a0Var4 = a0Var3;
                        i18 = -171916405;
                    } else {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = kb.f23505a.a();
                        } else {
                            fA = f11;
                        }
                        if (i15 != 0) {
                            nVar4 = null;
                        } else {
                            nVar4 = nVar3;
                        }
                        j14 = jD;
                        a0Var4 = a0Var3;
                        i18 = -171916405;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var4;
                    j12 = jN;
                    j13 = j14;
                    f12 = fA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jN;
                    j13 = jD;
                    f12 = f11;
                    nVar4 = nVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            f11 = f10;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    nVar3 = nVar;
                    if (c0VarR.k0(nVar3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = kb.f23505a.a();
                        } else {
                            fA = f11;
                        }
                        if (i15 != 0) {
                            nVar4 = null;
                        } else {
                            nVar4 = nVar3;
                        }
                        j14 = jD;
                        a0Var4 = a0Var3;
                        i18 = -171916405;
                    } else {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = kb.f23505a.a();
                        } else {
                            fA = f11;
                        }
                        if (i15 != 0) {
                            nVar4 = null;
                        } else {
                            nVar4 = nVar3;
                        }
                        j14 = jD;
                        a0Var4 = a0Var3;
                        i18 = -171916405;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var4;
                    j12 = jN;
                    j13 = j14;
                    f12 = fA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jN;
                    j13 = jD;
                    f12 = f11;
                    nVar4 = nVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar3 = nVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = kb.f23505a.a();
                    } else {
                        fA = f11;
                    }
                    if (i15 != 0) {
                        nVar4 = null;
                    } else {
                        nVar4 = nVar3;
                    }
                    j14 = jD;
                    a0Var4 = a0Var3;
                    i18 = -171916405;
                } else {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = kb.f23505a.a();
                    } else {
                        fA = f11;
                    }
                    if (i15 != 0) {
                        nVar4 = null;
                    } else {
                        nVar4 = nVar3;
                    }
                    j14 = jD;
                    a0Var4 = a0Var3;
                    i18 = -171916405;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                }
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var4;
                j12 = jN;
                j13 = j14;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jN;
                j13 = jD;
                f12 = f11;
                nVar4 = nVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jN = j10;
                if (c0VarR.L(jN)) {
                }
                i12 |= i21;
            } else {
                jN = j10;
            }
            i12 |= i21;
        } else {
            jN = j10;
        }
        if ((i10 & 3072) == 0) {
            jD = j11;
            if ((i11 & 8) == 0) {
                i19 = 1024;
            } else {
                i19 = 1024;
            }
            i12 |= i19;
        } else {
            jD = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    nVar3 = nVar;
                    if (c0VarR.k0(nVar3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = kb.f23505a.a();
                        } else {
                            fA = f11;
                        }
                        if (i15 != 0) {
                            nVar4 = null;
                        } else {
                            nVar4 = nVar3;
                        }
                        j14 = jD;
                        a0Var4 = a0Var3;
                        i18 = -171916405;
                    } else {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jN = x9.f25488a.a(c0VarR, 6).n();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = kb.f23505a.a();
                        } else {
                            fA = f11;
                        }
                        if (i15 != 0) {
                            nVar4 = null;
                        } else {
                            nVar4 = nVar3;
                        }
                        j14 = jD;
                        a0Var4 = a0Var3;
                        i18 = -171916405;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var4;
                    j12 = jN;
                    j13 = j14;
                    f12 = fA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jN;
                    j13 = jD;
                    f12 = f11;
                    nVar4 = nVar3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar3 = nVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = kb.f23505a.a();
                    } else {
                        fA = f11;
                    }
                    if (i15 != 0) {
                        nVar4 = null;
                    } else {
                        nVar4 = nVar3;
                    }
                    j14 = jD;
                    a0Var4 = a0Var3;
                    i18 = -171916405;
                } else {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = kb.f23505a.a();
                    } else {
                        fA = f11;
                    }
                    if (i15 != 0) {
                        nVar4 = null;
                    } else {
                        nVar4 = nVar3;
                    }
                    j14 = jD;
                    a0Var4 = a0Var3;
                    i18 = -171916405;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                }
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var4;
                j12 = jN;
                j13 = j14;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jN;
                j13 = jD;
                f12 = f11;
                nVar4 = nVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        f11 = f10;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                nVar3 = nVar;
                if (c0VarR.k0(nVar3)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = kb.f23505a.a();
                    } else {
                        fA = f11;
                    }
                    if (i15 != 0) {
                        nVar4 = null;
                    } else {
                        nVar4 = nVar3;
                    }
                    j14 = jD;
                    a0Var4 = a0Var3;
                    i18 = -171916405;
                } else {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = kb.f23505a.a();
                    } else {
                        fA = f11;
                    }
                    if (i15 != 0) {
                        nVar4 = null;
                    } else {
                        nVar4 = nVar3;
                    }
                    j14 = jD;
                    a0Var4 = a0Var3;
                    i18 = -171916405;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                }
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var4;
                j12 = jN;
                j13 = j14;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jN;
                j13 = jD;
                f12 = f11;
                nVar4 = nVar3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar3 = nVar;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(nVar2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i11 & 4) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fA = kb.f23505a.a();
                } else {
                    fA = f11;
                }
                if (i15 != 0) {
                    nVar4 = null;
                } else {
                    nVar4 = nVar3;
                }
                j14 = jD;
                a0Var4 = a0Var3;
                i18 = -171916405;
            } else {
                if (i20 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i11 & 4) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jN, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fA = kb.f23505a.a();
                } else {
                    fA = f11;
                }
                if (i15 != 0) {
                    nVar4 = null;
                } else {
                    nVar4 = nVar3;
                }
                j14 = jD;
                a0Var4 = a0Var3;
                i18 = -171916405;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
            }
            c0Var2 = c0VarR;
            ah.e(a0Var4, null, jN, j14, null, fA, androidx.compose.runtime.internal.w.e(366031815, true, new a(v6Var, nVar4, nVar2), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var4;
            j12 = jN;
            j13 = j14;
            f12 = fA;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            j12 = jN;
            j13 = jD;
            f12 = f11;
            nVar4 = nVar3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.pb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return sb.r(v6Var, a0Var2, j12, j13, f12, nVar4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:149:0x0201  */
    /* JADX WARN: Code duplicated, block: B:152:0x020e  */
    /* JADX WARN: Code duplicated, block: B:154:0x021a  */
    /* JADX WARN: Code duplicated, block: B:156:0x022f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0232  */
    /* JADX WARN: Code duplicated, block: B:160:0x0296  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:172:0x0325  */
    /* JADX WARN: Code duplicated, block: B:175:0x0333  */
    /* JADX WARN: Code duplicated, block: B:178:0x0346  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z12, @Nullable androidx.compose.foundation.interaction.j jVar, long j10, long j11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i19;
        int i20;
        boolean z14;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z15;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.foundation.interaction.j jVar2;
        final boolean z16;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final long j12;
        final long j13;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z17;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.internal.c cVarE;
        androidx.compose.foundation.interaction.j jVar3;
        long j14;
        int i26;
        long jW;
        float f10;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int i27;
        int i28;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(83562179);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function0) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= androidx.media3.exoplayer.a5.S0;
            } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            function4 = function3;
                            if (c0VarR.k0(function4)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        i20 = i11 & 64;
                        if (i20 != 0) {
                            if ((1572864 & i10) == 0) {
                                z14 = z12;
                                if (c0VarR.G(z14)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i12 |= i21;
                            }
                            i22 = i11 & 128;
                            if (i22 != 0) {
                                if ((i10 & 12582912) == 0) {
                                    if (c0VarR.D(jVar)) {
                                        i23 = 8388608;
                                    } else {
                                        i23 = 4194304;
                                    }
                                    i12 |= i23;
                                }
                                if ((i10 & 100663296) == 0) {
                                    int i29 = i12;
                                    if ((i11 & 256) == 0 || !c0VarR.L(j10)) {
                                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                                    } else {
                                        i28 = 67108864;
                                    }
                                    i24 = i29 | i28;
                                } else {
                                    i24 = i12;
                                }
                                if ((i10 & 805306368) == 0) {
                                    int i30 = i24;
                                    if ((i11 & 512) == 0 || !c0VarR.L(j11)) {
                                        i27 = 268435456;
                                    } else {
                                        i27 = 536870912;
                                    }
                                    i24 = i30 | i27;
                                }
                                i25 = i24;
                                if ((i25 & 306783379) != 306783378) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (c0VarR.h(z15, i25 & 1)) {
                                    c0VarR.l0();
                                    cVarE = null;
                                    if ((i10 & 1) != 0 || c0VarR.y()) {
                                        if (i14 != 0) {
                                            a0Var2 = androidx.compose.ui.a0.E;
                                        }
                                        if (i16 != 0) {
                                            z13 = true;
                                        }
                                        if (i18 != 0) {
                                            function4 = null;
                                        }
                                        if (i20 != 0) {
                                            z14 = true;
                                        }
                                        if (i22 != 0) {
                                            jVar3 = null;
                                        } else {
                                            jVar3 = jVar;
                                        }
                                        if ((i11 & 256) != 0) {
                                            j14 = x9.f25488a.a(c0VarR, 6).j();
                                            i26 = i25 & (-234881025);
                                        } else {
                                            j14 = j10;
                                            i26 = i25;
                                        }
                                        if ((i11 & 512) != 0) {
                                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                            i26 &= -1879048193;
                                        } else {
                                            jW = j11;
                                        }
                                    } else {
                                        c0VarR.u();
                                        int i31 = (i11 & 256) != 0 ? i25 & (-234881025) : i25;
                                        if ((i11 & 512) != 0) {
                                            i31 &= -1879048193;
                                        }
                                        j14 = j10;
                                        jW = j11;
                                        i26 = i31;
                                        jVar3 = jVar;
                                    }
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                    }
                                    if (function4 == null) {
                                        c0VarR.E(-1679605042);
                                    } else {
                                        c0VarR.E(-1679605041);
                                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                    }
                                    c0VarR.A();
                                    androidx.compose.runtime.internal.c cVar = cVarE;
                                    if (function4 == null) {
                                        f10 = f24921c;
                                    } else {
                                        f10 = f24920b;
                                    }
                                    androidx.compose.foundation.interaction.j jVar4 = jVar3;
                                    boolean z18 = z13;
                                    androidx.compose.ui.a0 a0VarW = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar4, wd.h(false, 0.0f, j14, 2, null), z18, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarW);
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
                                    int i32 = i26 >> 24;
                                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar), c0VarR, 54), c0VarR, (i32 & com.planner5d.library.engine.input.f.b.B) | (i32 & 14) | 3072 | ((i26 << 6) & 896));
                                    c0Var2 = c0VarR;
                                    c0Var2.o();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    jVar2 = jVar4;
                                    function5 = function4;
                                    z16 = z18;
                                    j13 = jW;
                                    j12 = j14;
                                } else {
                                    c0Var2 = c0VarR;
                                    c0Var2.u();
                                    jVar2 = jVar;
                                    z16 = z13;
                                    function5 = function4;
                                    j12 = j10;
                                    j13 = j11;
                                }
                                a0Var3 = a0Var2;
                                z17 = z14;
                                s5VarT = c0Var2.T();
                                if (s5VarT != null) {
                                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i12 |= 12582912;
                            if ((i10 & 100663296) == 0) {
                                int i210 = i12;
                                if ((i11 & 256) == 0) {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i24 = i210 | i28;
                            } else {
                                i24 = i12;
                            }
                            if ((i10 & 805306368) == 0) {
                                int i33 = i24;
                                if ((i11 & 512) == 0) {
                                    i27 = 268435456;
                                } else {
                                    i27 = 268435456;
                                }
                                i24 = i33 | i27;
                            }
                            i25 = i24;
                            if ((i25 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i25 & 1)) {
                                c0VarR.l0();
                                cVarE = null;
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                } else {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(-1679605042);
                                } else {
                                    c0VarR.E(-1679605041);
                                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                androidx.compose.runtime.internal.c cVar2 = cVarE;
                                if (function4 == null) {
                                    f10 = f24921c;
                                } else {
                                    f10 = f24920b;
                                }
                                androidx.compose.foundation.interaction.j jVar5 = jVar3;
                                boolean z19 = z13;
                                androidx.compose.ui.a0 a0VarW2 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar5, wd.h(false, 0.0f, j14, 2, null), z19, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarW2);
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
                                int i34 = i26 >> 24;
                                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar2), c0VarR, 54), c0VarR, (i34 & com.planner5d.library.engine.input.f.b.B) | (i34 & 14) | 3072 | ((i26 << 6) & 896));
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar5;
                                function5 = function4;
                                z16 = z19;
                                j13 = jW;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                z16 = z13;
                                function5 = function4;
                                j12 = j10;
                                j13 = j11;
                            }
                            a0Var3 = a0Var2;
                            z17 = z14;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 1572864;
                        z14 = z12;
                        i22 = i11 & 128;
                        if (i22 != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i23 = 8388608;
                                } else {
                                    i23 = 4194304;
                                }
                                i12 |= i23;
                            }
                            if ((i10 & 100663296) == 0) {
                                int i211 = i12;
                                if ((i11 & 256) == 0) {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i24 = i211 | i28;
                            } else {
                                i24 = i12;
                            }
                            if ((i10 & 805306368) == 0) {
                                int i35 = i24;
                                if ((i11 & 512) == 0) {
                                    i27 = 268435456;
                                } else {
                                    i27 = 268435456;
                                }
                                i24 = i35 | i27;
                            }
                            i25 = i24;
                            if ((i25 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i25 & 1)) {
                                c0VarR.l0();
                                cVarE = null;
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                } else {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(-1679605042);
                                } else {
                                    c0VarR.E(-1679605041);
                                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                androidx.compose.runtime.internal.c cVar3 = cVarE;
                                if (function4 == null) {
                                    f10 = f24921c;
                                } else {
                                    f10 = f24920b;
                                }
                                androidx.compose.foundation.interaction.j jVar6 = jVar3;
                                boolean z110 = z13;
                                androidx.compose.ui.a0 a0VarW3 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar6, wd.h(false, 0.0f, j14, 2, null), z110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarW3);
                                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                                function0A = aVar3.a();
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
                                androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar3.e());
                                androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar3.g());
                                function2B = aVar3.b();
                                if (c0VarD.P()) {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                } else {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                }
                                androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                                int i36 = i26 >> 24;
                                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar3), c0VarR, 54), c0VarR, (i36 & com.planner5d.library.engine.input.f.b.B) | (i36 & 14) | 3072 | ((i26 << 6) & 896));
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar6;
                                function5 = function4;
                                z16 = z110;
                                j13 = jW;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                z16 = z13;
                                function5 = function4;
                                j12 = j10;
                                j13 = j11;
                            }
                            a0Var3 = a0Var2;
                            z17 = z14;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 12582912;
                        if ((i10 & 100663296) == 0) {
                            int i212 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i212 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i37 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i37 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar4 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar7 = jVar3;
                            boolean z111 = z13;
                            androidx.compose.ui.a0 a0VarW4 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar7, wd.h(false, 0.0f, j14, 2, null), z111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarW4);
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar4.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar4.g());
                            function2B = aVar4.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                            androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                            int i38 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar4), c0VarR, 54), c0VarR, (i38 & com.planner5d.library.engine.input.f.b.B) | (i38 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar7;
                            function5 = function4;
                            z16 = z111;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function4 = function3;
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i10) == 0) {
                            z14 = z12;
                            if (c0VarR.G(z14)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        i22 = i11 & 128;
                        if (i22 != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i23 = 8388608;
                                } else {
                                    i23 = 4194304;
                                }
                                i12 |= i23;
                            }
                            if ((i10 & 100663296) == 0) {
                                int i213 = i12;
                                if ((i11 & 256) == 0) {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i24 = i213 | i28;
                            } else {
                                i24 = i12;
                            }
                            if ((i10 & 805306368) == 0) {
                                int i39 = i24;
                                if ((i11 & 512) == 0) {
                                    i27 = 268435456;
                                } else {
                                    i27 = 268435456;
                                }
                                i24 = i39 | i27;
                            }
                            i25 = i24;
                            if ((i25 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i25 & 1)) {
                                c0VarR.l0();
                                cVarE = null;
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                } else {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(-1679605042);
                                } else {
                                    c0VarR.E(-1679605041);
                                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                androidx.compose.runtime.internal.c cVar5 = cVarE;
                                if (function4 == null) {
                                    f10 = f24921c;
                                } else {
                                    f10 = f24920b;
                                }
                                androidx.compose.foundation.interaction.j jVar8 = jVar3;
                                boolean z112 = z13;
                                androidx.compose.ui.a0 a0VarW5 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar8, wd.h(false, 0.0f, j14, 2, null), z112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarW5);
                                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                                function0A = aVar5.a();
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
                                androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar5.e());
                                androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar5.g());
                                function2B = aVar5.b();
                                if (c0VarD.P()) {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                } else {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                }
                                androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                                androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                                int i310 = i26 >> 24;
                                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar5), c0VarR, 54), c0VarR, (i310 & com.planner5d.library.engine.input.f.b.B) | (i310 & 14) | 3072 | ((i26 << 6) & 896));
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar8;
                                function5 = function4;
                                z16 = z112;
                                j13 = jW;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                z16 = z13;
                                function5 = function4;
                                j12 = j10;
                                j13 = j11;
                            }
                            a0Var3 = a0Var2;
                            z17 = z14;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 12582912;
                        if ((i10 & 100663296) == 0) {
                            int i214 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i214 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i311 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i311 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar6 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar9 = jVar3;
                            boolean z113 = z13;
                            androidx.compose.ui.a0 a0VarW6 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar9, wd.h(false, 0.0f, j14, 2, null), z113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarW6);
                            androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                            function0A = aVar6.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar6.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar6.g());
                            function2B = aVar6.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                            androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                            int i312 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar6), c0VarR, 54), c0VarR, (i312 & com.planner5d.library.engine.input.f.b.B) | (i312 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar9;
                            function5 = function4;
                            z16 = z113;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z14 = z12;
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i215 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i215 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i313 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i313 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar7 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar10 = jVar3;
                            boolean z114 = z13;
                            androidx.compose.ui.a0 a0VarW7 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar10, wd.h(false, 0.0f, j14, 2, null), z114, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarW7);
                            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                            function0A = aVar7.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar7.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar7.g());
                            function2B = aVar7.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                            androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                            int i314 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar7), c0VarR, 54), c0VarR, (i314 & com.planner5d.library.engine.input.f.b.B) | (i314 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar10;
                            function5 = function4;
                            z16 = z114;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i216 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i216 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i315 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i315 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar8 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar11 = jVar3;
                        boolean z115 = z13;
                        androidx.compose.ui.a0 a0VarW8 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11, wd.h(false, 0.0f, j14, 2, null), z115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarW8);
                        androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                        function0A = aVar8.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar8.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar8.g());
                        function2B = aVar8.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
                        androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                        int i316 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar8), c0VarR, 54), c0VarR, (i316 & com.planner5d.library.engine.input.f.b.B) | (i316 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar11;
                        function5 = function4;
                        z16 = z115;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z13 = z11;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function3;
                        if (c0VarR.k0(function4)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i10) == 0) {
                            z14 = z12;
                            if (c0VarR.G(z14)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        i22 = i11 & 128;
                        if (i22 != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i23 = 8388608;
                                } else {
                                    i23 = 4194304;
                                }
                                i12 |= i23;
                            }
                            if ((i10 & 100663296) == 0) {
                                int i217 = i12;
                                if ((i11 & 256) == 0) {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i24 = i217 | i28;
                            } else {
                                i24 = i12;
                            }
                            if ((i10 & 805306368) == 0) {
                                int i317 = i24;
                                if ((i11 & 512) == 0) {
                                    i27 = 268435456;
                                } else {
                                    i27 = 268435456;
                                }
                                i24 = i317 | i27;
                            }
                            i25 = i24;
                            if ((i25 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i25 & 1)) {
                                c0VarR.l0();
                                cVarE = null;
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                } else {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(-1679605042);
                                } else {
                                    c0VarR.E(-1679605041);
                                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                androidx.compose.runtime.internal.c cVar9 = cVarE;
                                if (function4 == null) {
                                    f10 = f24921c;
                                } else {
                                    f10 = f24920b;
                                }
                                androidx.compose.foundation.interaction.j jVar12 = jVar3;
                                boolean z116 = z13;
                                androidx.compose.ui.a0 a0VarW9 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar12, wd.h(false, 0.0f, j14, 2, null), z116, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarW9);
                                androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                                function0A = aVar9.a();
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
                                androidx.compose.runtime.y7.n(c0VarD, a1VarK9, aVar9.e());
                                androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar9.g());
                                function2B = aVar9.b();
                                if (c0VarD.P()) {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                } else {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                }
                                androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar9.f());
                                androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                                int i318 = i26 >> 24;
                                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar9), c0VarR, 54), c0VarR, (i318 & com.planner5d.library.engine.input.f.b.B) | (i318 & 14) | 3072 | ((i26 << 6) & 896));
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar12;
                                function5 = function4;
                                z16 = z116;
                                j13 = jW;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                z16 = z13;
                                function5 = function4;
                                j12 = j10;
                                j13 = j11;
                            }
                            a0Var3 = a0Var2;
                            z17 = z14;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 12582912;
                        if ((i10 & 100663296) == 0) {
                            int i218 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i218 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i319 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i319 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar10 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar13 = jVar3;
                            boolean z117 = z13;
                            androidx.compose.ui.a0 a0VarW10 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar13, wd.h(false, 0.0f, j14, 2, null), z117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarW10);
                            androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                            function0A = aVar10.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK10, aVar10.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar10.g());
                            function2B = aVar10.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar10.f());
                            androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                            int i3110 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar10), c0VarR, 54), c0VarR, (i3110 & com.planner5d.library.engine.input.f.b.B) | (i3110 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar13;
                            function5 = function4;
                            z16 = z117;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z14 = z12;
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i219 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i219 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i3111 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i3111 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar11 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar14 = jVar3;
                            boolean z118 = z13;
                            androidx.compose.ui.a0 a0VarW11 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar14, wd.h(false, 0.0f, j14, 2, null), z118, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarW11);
                            androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                            function0A = aVar11.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK11, aVar11.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK11, aVar11.g());
                            function2B = aVar11.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar11.f());
                            androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                            int i3112 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11), c0VarR, 54), c0VarR, (i3112 & com.planner5d.library.engine.input.f.b.B) | (i3112 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar14;
                            function5 = function4;
                            z16 = z118;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i2110 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2110 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3113 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3113 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar12 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar15 = jVar3;
                        boolean z119 = z13;
                        androidx.compose.ui.a0 a0VarW12 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar15, wd.h(false, 0.0f, j14, 2, null), z119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarW12);
                        androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                        function0A = aVar12.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK12, aVar12.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK12, aVar12.g());
                        function2B = aVar12.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar12.f());
                        androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3114 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar12), c0VarR, 54), c0VarR, (i3114 & com.planner5d.library.engine.input.f.b.B) | (i3114 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar15;
                        function5 = function4;
                        z16 = z119;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
                i20 = i11 & 64;
                if (i20 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i2111 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i2111 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i3115 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i3115 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar13 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar16 = jVar3;
                            boolean z1110 = z13;
                            androidx.compose.ui.a0 a0VarW13 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar16, wd.h(false, 0.0f, j14, 2, null), z1110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarW13);
                            androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                            function0A = aVar13.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK13, aVar13.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar13.g());
                            function2B = aVar13.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar13.f());
                            androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                            int i3116 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar13), c0VarR, 54), c0VarR, (i3116 & com.planner5d.library.engine.input.f.b.B) | (i3116 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar16;
                            function5 = function4;
                            z16 = z1110;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i2112 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2112 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3117 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3117 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar14 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar17 = jVar3;
                        boolean z1111 = z13;
                        androidx.compose.ui.a0 a0VarW14 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar17, wd.h(false, 0.0f, j14, 2, null), z1111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarW14);
                        androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                        function0A = aVar14.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK14, aVar14.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK14, aVar14.g());
                        function2B = aVar14.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar14.f());
                        androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3118 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar14), c0VarR, 54), c0VarR, (i3118 & com.planner5d.library.engine.input.f.b.B) | (i3118 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar17;
                        function5 = function4;
                        z16 = z1111;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i2113 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2113 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3119 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3119 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar15 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar18 = jVar3;
                        boolean z1112 = z13;
                        androidx.compose.ui.a0 a0VarW15 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar18, wd.h(false, 0.0f, j14, 2, null), z1112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarW15);
                        androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                        function0A = aVar15.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK15, aVar15.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK15, aVar15.g());
                        function2B = aVar15.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar15.f());
                        androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                        int i31110 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar15), c0VarR, 54), c0VarR, (i31110 & com.planner5d.library.engine.input.f.b.B) | (i31110 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar18;
                        function5 = function4;
                        z16 = z1112;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i2114 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i2114 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i31111 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i31111 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar16 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar19 = jVar3;
                    boolean z1113 = z13;
                    androidx.compose.ui.a0 a0VarW16 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar19, wd.h(false, 0.0f, j14, 2, null), z1113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarW16);
                    androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                    function0A = aVar16.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK16, aVar16.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar16.g());
                    function2B = aVar16.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar16.f());
                    androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
                    int i31112 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar16), c0VarR, 54), c0VarR, (i31112 & com.planner5d.library.engine.input.f.b.B) | (i31112 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar19;
                    function5 = function4;
                    z16 = z1113;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function3;
                        if (c0VarR.k0(function4)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i10) == 0) {
                            z14 = z12;
                            if (c0VarR.G(z14)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        i22 = i11 & 128;
                        if (i22 != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i23 = 8388608;
                                } else {
                                    i23 = 4194304;
                                }
                                i12 |= i23;
                            }
                            if ((i10 & 100663296) == 0) {
                                int i2115 = i12;
                                if ((i11 & 256) == 0) {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i24 = i2115 | i28;
                            } else {
                                i24 = i12;
                            }
                            if ((i10 & 805306368) == 0) {
                                int i31113 = i24;
                                if ((i11 & 512) == 0) {
                                    i27 = 268435456;
                                } else {
                                    i27 = 268435456;
                                }
                                i24 = i31113 | i27;
                            }
                            i25 = i24;
                            if ((i25 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i25 & 1)) {
                                c0VarR.l0();
                                cVarE = null;
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                } else {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(-1679605042);
                                } else {
                                    c0VarR.E(-1679605041);
                                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                androidx.compose.runtime.internal.c cVar17 = cVarE;
                                if (function4 == null) {
                                    f10 = f24921c;
                                } else {
                                    f10 = f24920b;
                                }
                                androidx.compose.foundation.interaction.j jVar110 = jVar3;
                                boolean z1114 = z13;
                                androidx.compose.ui.a0 a0VarW17 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar110, wd.h(false, 0.0f, j14, 2, null), z1114, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                androidx.compose.ui.layout.a1 a1VarK17 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarW17);
                                androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                                function0A = aVar17.a();
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
                                androidx.compose.runtime.y7.n(c0VarD, a1VarK17, aVar17.e());
                                androidx.compose.runtime.y7.n(c0VarD, b1VarK17, aVar17.g());
                                function2B = aVar17.b();
                                if (c0VarD.P()) {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                } else {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                }
                                androidx.compose.runtime.y7.n(c0VarD, a0VarN17, aVar17.f());
                                androidx.compose.foundation.layout.d0 d0Var17 = androidx.compose.foundation.layout.d0.f15956a;
                                int i31114 = i26 >> 24;
                                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar17), c0VarR, 54), c0VarR, (i31114 & com.planner5d.library.engine.input.f.b.B) | (i31114 & 14) | 3072 | ((i26 << 6) & 896));
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar110;
                                function5 = function4;
                                z16 = z1114;
                                j13 = jW;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                z16 = z13;
                                function5 = function4;
                                j12 = j10;
                                j13 = j11;
                            }
                            a0Var3 = a0Var2;
                            z17 = z14;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 12582912;
                        if ((i10 & 100663296) == 0) {
                            int i2116 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i2116 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i31115 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i31115 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar18 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar111 = jVar3;
                            boolean z1115 = z13;
                            androidx.compose.ui.a0 a0VarW18 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111, wd.h(false, 0.0f, j14, 2, null), z1115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK18 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarW18);
                            androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                            function0A = aVar18.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK18, aVar18.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK18, aVar18.g());
                            function2B = aVar18.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN18, aVar18.f());
                            androidx.compose.foundation.layout.d0 d0Var18 = androidx.compose.foundation.layout.d0.f15956a;
                            int i31116 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar18), c0VarR, 54), c0VarR, (i31116 & com.planner5d.library.engine.input.f.b.B) | (i31116 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar111;
                            function5 = function4;
                            z16 = z1115;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z14 = z12;
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i2117 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i2117 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i31117 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i31117 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar19 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar112 = jVar3;
                            boolean z1116 = z13;
                            androidx.compose.ui.a0 a0VarW19 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar112, wd.h(false, 0.0f, j14, 2, null), z1116, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK19 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarW19);
                            androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                            function0A = aVar19.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK19, aVar19.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK19, aVar19.g());
                            function2B = aVar19.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN19, aVar19.f());
                            androidx.compose.foundation.layout.d0 d0Var19 = androidx.compose.foundation.layout.d0.f15956a;
                            int i31118 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar19), c0VarR, 54), c0VarR, (i31118 & com.planner5d.library.engine.input.f.b.B) | (i31118 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar112;
                            function5 = function4;
                            z16 = z1116;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i2118 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2118 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i31119 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i31119 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar110 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar113 = jVar3;
                        boolean z1117 = z13;
                        androidx.compose.ui.a0 a0VarW110 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar113, wd.h(false, 0.0f, j14, 2, null), z1117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarW110);
                        androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                        function0A = aVar110.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK110, aVar110.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK110, aVar110.g());
                        function2B = aVar110.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN110, aVar110.f());
                        androidx.compose.foundation.layout.d0 d0Var110 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311110 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar110), c0VarR, 54), c0VarR, (i311110 & com.planner5d.library.engine.input.f.b.B) | (i311110 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar113;
                        function5 = function4;
                        z16 = z1117;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
                i20 = i11 & 64;
                if (i20 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i2119 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i2119 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i311111 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i311111 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar111 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar114 = jVar3;
                            boolean z1118 = z13;
                            androidx.compose.ui.a0 a0VarW111 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar114, wd.h(false, 0.0f, j14, 2, null), z1118, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarW111);
                            androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                            function0A = aVar111.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK111, aVar111.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK111, aVar111.g());
                            function2B = aVar111.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN111, aVar111.f());
                            androidx.compose.foundation.layout.d0 d0Var111 = androidx.compose.foundation.layout.d0.f15956a;
                            int i311112 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111), c0VarR, 54), c0VarR, (i311112 & com.planner5d.library.engine.input.f.b.B) | (i311112 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar114;
                            function5 = function4;
                            z16 = z1118;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i21110 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21110 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311113 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311113 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar112 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar115 = jVar3;
                        boolean z1119 = z13;
                        androidx.compose.ui.a0 a0VarW112 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar115, wd.h(false, 0.0f, j14, 2, null), z1119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarW112);
                        androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                        function0A = aVar112.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK112, aVar112.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK112, aVar112.g());
                        function2B = aVar112.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN112, aVar112.f());
                        androidx.compose.foundation.layout.d0 d0Var112 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311114 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar112), c0VarR, 54), c0VarR, (i311114 & com.planner5d.library.engine.input.f.b.B) | (i311114 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar115;
                        function5 = function4;
                        z16 = z1119;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i21111 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21111 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311115 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311115 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar113 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar116 = jVar3;
                        boolean z11110 = z13;
                        androidx.compose.ui.a0 a0VarW113 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar116, wd.h(false, 0.0f, j14, 2, null), z11110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarW113);
                        androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                        function0A = aVar113.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK113, aVar113.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK113, aVar113.g());
                        function2B = aVar113.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN113, aVar113.f());
                        androidx.compose.foundation.layout.d0 d0Var113 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311116 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar113), c0VarR, 54), c0VarR, (i311116 & com.planner5d.library.engine.input.f.b.B) | (i311116 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar116;
                        function5 = function4;
                        z16 = z11110;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i21112 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21112 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i311117 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i311117 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar114 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar117 = jVar3;
                    boolean z11111 = z13;
                    androidx.compose.ui.a0 a0VarW114 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar117, wd.h(false, 0.0f, j14, 2, null), z11111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarW114);
                    androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                    function0A = aVar114.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK114, aVar114.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK114, aVar114.g());
                    function2B = aVar114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN114, aVar114.f());
                    androidx.compose.foundation.layout.d0 d0Var114 = androidx.compose.foundation.layout.d0.f15956a;
                    int i311118 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar114), c0VarR, 54), c0VarR, (i311118 & com.planner5d.library.engine.input.f.b.B) | (i311118 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar117;
                    function5 = function4;
                    z16 = z11111;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z13 = z11;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i21113 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i21113 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i311119 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i311119 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar115 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar118 = jVar3;
                            boolean z11112 = z13;
                            androidx.compose.ui.a0 a0VarW115 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar118, wd.h(false, 0.0f, j14, 2, null), z11112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarW115);
                            androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                            function0A = aVar115.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK115, aVar115.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK115, aVar115.g());
                            function2B = aVar115.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN115, aVar115.f());
                            androidx.compose.foundation.layout.d0 d0Var115 = androidx.compose.foundation.layout.d0.f15956a;
                            int i3111110 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar115), c0VarR, 54), c0VarR, (i3111110 & com.planner5d.library.engine.input.f.b.B) | (i3111110 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar118;
                            function5 = function4;
                            z16 = z11112;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i21114 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21114 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111111 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111111 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar116 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar119 = jVar3;
                        boolean z11113 = z13;
                        androidx.compose.ui.a0 a0VarW116 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar119, wd.h(false, 0.0f, j14, 2, null), z11113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarW116);
                        androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                        function0A = aVar116.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK116, aVar116.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK116, aVar116.g());
                        function2B = aVar116.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN116, aVar116.f());
                        androidx.compose.foundation.layout.d0 d0Var116 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3111112 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar116), c0VarR, 54), c0VarR, (i3111112 & com.planner5d.library.engine.input.f.b.B) | (i3111112 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar119;
                        function5 = function4;
                        z16 = z11113;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i21115 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21115 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111113 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111113 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar117 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar1110 = jVar3;
                        boolean z11114 = z13;
                        androidx.compose.ui.a0 a0VarW117 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1110, wd.h(false, 0.0f, j14, 2, null), z11114, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarW117);
                        androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                        function0A = aVar117.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK117, aVar117.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK117, aVar117.g());
                        function2B = aVar117.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN117, aVar117.f());
                        androidx.compose.foundation.layout.d0 d0Var117 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3111114 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar117), c0VarR, 54), c0VarR, (i3111114 & com.planner5d.library.engine.input.f.b.B) | (i3111114 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar1110;
                        function5 = function4;
                        z16 = z11114;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i21116 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21116 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i3111115 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i3111115 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar118 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar1111 = jVar3;
                    boolean z11115 = z13;
                    androidx.compose.ui.a0 a0VarW118 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111, wd.h(false, 0.0f, j14, 2, null), z11115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarW118);
                    androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                    function0A = aVar118.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK118, aVar118.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK118, aVar118.g());
                    function2B = aVar118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN118, aVar118.f());
                    androidx.compose.foundation.layout.d0 d0Var118 = androidx.compose.foundation.layout.d0.f15956a;
                    int i3111116 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar118), c0VarR, 54), c0VarR, (i3111116 & com.planner5d.library.engine.input.f.b.B) | (i3111116 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar1111;
                    function5 = function4;
                    z16 = z11115;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i20 = i11 & 64;
            if (i20 != 0) {
                if ((1572864 & i10) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i21117 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21117 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111117 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111117 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar119 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar1112 = jVar3;
                        boolean z11116 = z13;
                        androidx.compose.ui.a0 a0VarW119 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1112, wd.h(false, 0.0f, j14, 2, null), z11116, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarW119);
                        androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                        function0A = aVar119.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK119, aVar119.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK119, aVar119.g());
                        function2B = aVar119.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN119, aVar119.f());
                        androidx.compose.foundation.layout.d0 d0Var119 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3111118 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar119), c0VarR, 54), c0VarR, (i3111118 & com.planner5d.library.engine.input.f.b.B) | (i3111118 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar1112;
                        function5 = function4;
                        z16 = z11116;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i21118 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21118 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i3111119 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i3111119 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar1110 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar1113 = jVar3;
                    boolean z11117 = z13;
                    androidx.compose.ui.a0 a0VarW1110 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1113, wd.h(false, 0.0f, j14, 2, null), z11117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK1110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarW1110);
                    androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                    function0A = aVar1110.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK1110, aVar1110.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK1110, aVar1110.g());
                    function2B = aVar1110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN1110, aVar1110.f());
                    androidx.compose.foundation.layout.d0 d0Var1110 = androidx.compose.foundation.layout.d0.f15956a;
                    int i31111110 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1110), c0VarR, 54), c0VarR, (i31111110 & com.planner5d.library.engine.input.f.b.B) | (i31111110 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar1113;
                    function5 = function4;
                    z16 = z11117;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            i22 = i11 & 128;
            if (i22 != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 100663296) == 0) {
                    int i21119 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21119 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i31111111 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i31111111 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar1111 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar1114 = jVar3;
                    boolean z11118 = z13;
                    androidx.compose.ui.a0 a0VarW1111 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1114, wd.h(false, 0.0f, j14, 2, null), z11118, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK1111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarW1111);
                    androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                    function0A = aVar1111.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK1111, aVar1111.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK1111, aVar1111.g());
                    function2B = aVar1111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN1111, aVar1111.f());
                    androidx.compose.foundation.layout.d0 d0Var1111 = androidx.compose.foundation.layout.d0.f15956a;
                    int i31111112 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1111), c0VarR, 54), c0VarR, (i31111112 & com.planner5d.library.engine.input.f.b.B) | (i31111112 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar1114;
                    function5 = function4;
                    z16 = z11118;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i10 & 100663296) == 0) {
                int i211110 = i12;
                if ((i11 & 256) == 0) {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 = i211110 | i28;
            } else {
                i24 = i12;
            }
            if ((i10 & 805306368) == 0) {
                int i31111113 = i24;
                if ((i11 & 512) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i24 = i31111113 | i27;
            }
            i25 = i24;
            if ((i25 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i25 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                }
                if (function4 == null) {
                    c0VarR.E(-1679605042);
                } else {
                    c0VarR.E(-1679605041);
                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVar1112 = cVarE;
                if (function4 == null) {
                    f10 = f24921c;
                } else {
                    f10 = f24920b;
                }
                androidx.compose.foundation.interaction.j jVar1115 = jVar3;
                boolean z11119 = z13;
                androidx.compose.ui.a0 a0VarW1112 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1115, wd.h(false, 0.0f, j14, 2, null), z11119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                androidx.compose.ui.layout.a1 a1VarK1112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK1112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarW1112);
                androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
                function0A = aVar1112.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK1112, aVar1112.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK1112, aVar1112.g());
                function2B = aVar1112.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN1112, aVar1112.f());
                androidx.compose.foundation.layout.d0 d0Var1112 = androidx.compose.foundation.layout.d0.f15956a;
                int i31111114 = i26 >> 24;
                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1112), c0VarR, 54), c0VarR, (i31111114 & com.planner5d.library.engine.input.f.b.B) | (i31111114 & 14) | 3072 | ((i26 << 6) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar1115;
                function5 = function4;
                z16 = z11119;
                j13 = jW;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                z16 = z13;
                function5 = function4;
                j12 = j10;
                j13 = j11;
            }
            a0Var3 = a0Var2;
            z17 = z14;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if (c0VarR.k0(function2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function3;
                        if (c0VarR.k0(function4)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i10) == 0) {
                            z14 = z12;
                            if (c0VarR.G(z14)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        i22 = i11 & 128;
                        if (i22 != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i23 = 8388608;
                                } else {
                                    i23 = 4194304;
                                }
                                i12 |= i23;
                            }
                            if ((i10 & 100663296) == 0) {
                                int i211111 = i12;
                                if ((i11 & 256) == 0) {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i24 = i211111 | i28;
                            } else {
                                i24 = i12;
                            }
                            if ((i10 & 805306368) == 0) {
                                int i31111115 = i24;
                                if ((i11 & 512) == 0) {
                                    i27 = 268435456;
                                } else {
                                    i27 = 268435456;
                                }
                                i24 = i31111115 | i27;
                            }
                            i25 = i24;
                            if ((i25 & 306783379) != 306783378) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i25 & 1)) {
                                c0VarR.l0();
                                cVarE = null;
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                } else {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        function4 = null;
                                    }
                                    if (i20 != 0) {
                                        z14 = true;
                                    }
                                    if (i22 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i11 & 256) != 0) {
                                        j14 = x9.f25488a.a(c0VarR, 6).j();
                                        i26 = i25 & (-234881025);
                                    } else {
                                        j14 = j10;
                                        i26 = i25;
                                    }
                                    if ((i11 & 512) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i26 &= -1879048193;
                                    } else {
                                        jW = j11;
                                    }
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(-1679605042);
                                } else {
                                    c0VarR.E(-1679605041);
                                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                androidx.compose.runtime.internal.c cVar1113 = cVarE;
                                if (function4 == null) {
                                    f10 = f24921c;
                                } else {
                                    f10 = f24920b;
                                }
                                androidx.compose.foundation.interaction.j jVar1116 = jVar3;
                                boolean z111110 = z13;
                                androidx.compose.ui.a0 a0VarW1113 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1116, wd.h(false, 0.0f, j14, 2, null), z111110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                                androidx.compose.ui.layout.a1 a1VarK1113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK1113 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, a0VarW1113);
                                androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
                                function0A = aVar1113.a();
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
                                androidx.compose.runtime.y7.n(c0VarD, a1VarK1113, aVar1113.e());
                                androidx.compose.runtime.y7.n(c0VarD, b1VarK1113, aVar1113.g());
                                function2B = aVar1113.b();
                                if (c0VarD.P()) {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                } else {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                }
                                androidx.compose.runtime.y7.n(c0VarD, a0VarN1113, aVar1113.f());
                                androidx.compose.foundation.layout.d0 d0Var1113 = androidx.compose.foundation.layout.d0.f15956a;
                                int i31111116 = i26 >> 24;
                                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1113), c0VarR, 54), c0VarR, (i31111116 & com.planner5d.library.engine.input.f.b.B) | (i31111116 & 14) | 3072 | ((i26 << 6) & 896));
                                c0Var2 = c0VarR;
                                c0Var2.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar2 = jVar1116;
                                function5 = function4;
                                z16 = z111110;
                                j13 = jW;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                z16 = z13;
                                function5 = function4;
                                j12 = j10;
                                j13 = j11;
                            }
                            a0Var3 = a0Var2;
                            z17 = z14;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 12582912;
                        if ((i10 & 100663296) == 0) {
                            int i211112 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i211112 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i31111117 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i31111117 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar1114 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar1117 = jVar3;
                            boolean z111111 = z13;
                            androidx.compose.ui.a0 a0VarW1114 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1117, wd.h(false, 0.0f, j14, 2, null), z111111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK1114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK1114 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1114 = androidx.compose.ui.m.n(c0VarR, a0VarW1114);
                            androidx.compose.ui.node.g.a aVar1114 = androidx.compose.ui.node.g.I;
                            function0A = aVar1114.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK1114, aVar1114.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK1114, aVar1114.g());
                            function2B = aVar1114.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN1114, aVar1114.f());
                            androidx.compose.foundation.layout.d0 d0Var1114 = androidx.compose.foundation.layout.d0.f15956a;
                            int i31111118 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1114), c0VarR, 54), c0VarR, (i31111118 & com.planner5d.library.engine.input.f.b.B) | (i31111118 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar1117;
                            function5 = function4;
                            z16 = z111111;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z14 = z12;
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i211113 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i211113 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i31111119 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i31111119 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar1115 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar1118 = jVar3;
                            boolean z111112 = z13;
                            androidx.compose.ui.a0 a0VarW1115 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1118, wd.h(false, 0.0f, j14, 2, null), z111112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK1115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK1115 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1115 = androidx.compose.ui.m.n(c0VarR, a0VarW1115);
                            androidx.compose.ui.node.g.a aVar1115 = androidx.compose.ui.node.g.I;
                            function0A = aVar1115.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK1115, aVar1115.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK1115, aVar1115.g());
                            function2B = aVar1115.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN1115, aVar1115.f());
                            androidx.compose.foundation.layout.d0 d0Var1115 = androidx.compose.foundation.layout.d0.f15956a;
                            int i311111110 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1115), c0VarR, 54), c0VarR, (i311111110 & com.planner5d.library.engine.input.f.b.B) | (i311111110 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar1118;
                            function5 = function4;
                            z16 = z111112;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i211114 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i211114 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311111111 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311111111 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar1116 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar1119 = jVar3;
                        boolean z111113 = z13;
                        androidx.compose.ui.a0 a0VarW1116 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1119, wd.h(false, 0.0f, j14, 2, null), z111113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK1116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK1116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1116 = androidx.compose.ui.m.n(c0VarR, a0VarW1116);
                        androidx.compose.ui.node.g.a aVar1116 = androidx.compose.ui.node.g.I;
                        function0A = aVar1116.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK1116, aVar1116.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK1116, aVar1116.g());
                        function2B = aVar1116.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN1116, aVar1116.f());
                        androidx.compose.foundation.layout.d0 d0Var1116 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311111112 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1116), c0VarR, 54), c0VarR, (i311111112 & com.planner5d.library.engine.input.f.b.B) | (i311111112 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar1119;
                        function5 = function4;
                        z16 = z111113;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
                i20 = i11 & 64;
                if (i20 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i211115 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i211115 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i311111113 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i311111113 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar1117 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar11110 = jVar3;
                            boolean z111114 = z13;
                            androidx.compose.ui.a0 a0VarW1117 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11110, wd.h(false, 0.0f, j14, 2, null), z111114, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK1117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK1117 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1117 = androidx.compose.ui.m.n(c0VarR, a0VarW1117);
                            androidx.compose.ui.node.g.a aVar1117 = androidx.compose.ui.node.g.I;
                            function0A = aVar1117.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK1117, aVar1117.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK1117, aVar1117.g());
                            function2B = aVar1117.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN1117, aVar1117.f());
                            androidx.compose.foundation.layout.d0 d0Var1117 = androidx.compose.foundation.layout.d0.f15956a;
                            int i311111114 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1117), c0VarR, 54), c0VarR, (i311111114 & com.planner5d.library.engine.input.f.b.B) | (i311111114 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar11110;
                            function5 = function4;
                            z16 = z111114;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i211116 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i211116 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311111115 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311111115 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar1118 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar11111 = jVar3;
                        boolean z111115 = z13;
                        androidx.compose.ui.a0 a0VarW1118 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11111, wd.h(false, 0.0f, j14, 2, null), z111115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK1118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK1118 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1118 = androidx.compose.ui.m.n(c0VarR, a0VarW1118);
                        androidx.compose.ui.node.g.a aVar1118 = androidx.compose.ui.node.g.I;
                        function0A = aVar1118.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK1118, aVar1118.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK1118, aVar1118.g());
                        function2B = aVar1118.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN1118, aVar1118.f());
                        androidx.compose.foundation.layout.d0 d0Var1118 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311111116 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1118), c0VarR, 54), c0VarR, (i311111116 & com.planner5d.library.engine.input.f.b.B) | (i311111116 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar11111;
                        function5 = function4;
                        z16 = z111115;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i211117 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i211117 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311111117 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311111117 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar1119 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar11112 = jVar3;
                        boolean z111116 = z13;
                        androidx.compose.ui.a0 a0VarW1119 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11112, wd.h(false, 0.0f, j14, 2, null), z111116, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK1119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK1119 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1119 = androidx.compose.ui.m.n(c0VarR, a0VarW1119);
                        androidx.compose.ui.node.g.a aVar1119 = androidx.compose.ui.node.g.I;
                        function0A = aVar1119.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK1119, aVar1119.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK1119, aVar1119.g());
                        function2B = aVar1119.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN1119, aVar1119.f());
                        androidx.compose.foundation.layout.d0 d0Var1119 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311111118 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1119), c0VarR, 54), c0VarR, (i311111118 & com.planner5d.library.engine.input.f.b.B) | (i311111118 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar11112;
                        function5 = function4;
                        z16 = z111116;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i211118 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i211118 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i311111119 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i311111119 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar11110 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar11113 = jVar3;
                    boolean z111117 = z13;
                    androidx.compose.ui.a0 a0VarW11110 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11113, wd.h(false, 0.0f, j14, 2, null), z111117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK11110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11110 = androidx.compose.ui.m.n(c0VarR, a0VarW11110);
                    androidx.compose.ui.node.g.a aVar11110 = androidx.compose.ui.node.g.I;
                    function0A = aVar11110.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK11110, aVar11110.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11110, aVar11110.g());
                    function2B = aVar11110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11110, aVar11110.f());
                    androidx.compose.foundation.layout.d0 d0Var11110 = androidx.compose.foundation.layout.d0.f15956a;
                    int i3111111110 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11110), c0VarR, 54), c0VarR, (i3111111110 & com.planner5d.library.engine.input.f.b.B) | (i3111111110 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar11113;
                    function5 = function4;
                    z16 = z111117;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z13 = z11;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i211119 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i211119 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i3111111111 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i3111111111 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar11111 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar11114 = jVar3;
                            boolean z111118 = z13;
                            androidx.compose.ui.a0 a0VarW11111 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11114, wd.h(false, 0.0f, j14, 2, null), z111118, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK11111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK11111 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN11111 = androidx.compose.ui.m.n(c0VarR, a0VarW11111);
                            androidx.compose.ui.node.g.a aVar11111 = androidx.compose.ui.node.g.I;
                            function0A = aVar11111.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK11111, aVar11111.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK11111, aVar11111.g());
                            function2B = aVar11111.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN11111, aVar11111.f());
                            androidx.compose.foundation.layout.d0 d0Var11111 = androidx.compose.foundation.layout.d0.f15956a;
                            int i3111111112 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11111), c0VarR, 54), c0VarR, (i3111111112 & com.planner5d.library.engine.input.f.b.B) | (i3111111112 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar11114;
                            function5 = function4;
                            z16 = z111118;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i2111110 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2111110 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111111113 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111111113 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar11112 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar11115 = jVar3;
                        boolean z111119 = z13;
                        androidx.compose.ui.a0 a0VarW11112 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11115, wd.h(false, 0.0f, j14, 2, null), z111119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK11112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK11112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11112 = androidx.compose.ui.m.n(c0VarR, a0VarW11112);
                        androidx.compose.ui.node.g.a aVar11112 = androidx.compose.ui.node.g.I;
                        function0A = aVar11112.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK11112, aVar11112.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK11112, aVar11112.g());
                        function2B = aVar11112.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN11112, aVar11112.f());
                        androidx.compose.foundation.layout.d0 d0Var11112 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3111111114 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11112), c0VarR, 54), c0VarR, (i3111111114 & com.planner5d.library.engine.input.f.b.B) | (i3111111114 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar11115;
                        function5 = function4;
                        z16 = z111119;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i2111111 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2111111 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111111115 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111111115 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar11113 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar11116 = jVar3;
                        boolean z1111110 = z13;
                        androidx.compose.ui.a0 a0VarW11113 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11116, wd.h(false, 0.0f, j14, 2, null), z1111110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK11113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK11113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11113 = androidx.compose.ui.m.n(c0VarR, a0VarW11113);
                        androidx.compose.ui.node.g.a aVar11113 = androidx.compose.ui.node.g.I;
                        function0A = aVar11113.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK11113, aVar11113.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK11113, aVar11113.g());
                        function2B = aVar11113.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN11113, aVar11113.f());
                        androidx.compose.foundation.layout.d0 d0Var11113 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3111111116 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11113), c0VarR, 54), c0VarR, (i3111111116 & com.planner5d.library.engine.input.f.b.B) | (i3111111116 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar11116;
                        function5 = function4;
                        z16 = z1111110;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i2111112 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i2111112 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i3111111117 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i3111111117 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar11114 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar11117 = jVar3;
                    boolean z1111111 = z13;
                    androidx.compose.ui.a0 a0VarW11114 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11117, wd.h(false, 0.0f, j14, 2, null), z1111111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK11114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11114 = androidx.compose.ui.m.n(c0VarR, a0VarW11114);
                    androidx.compose.ui.node.g.a aVar11114 = androidx.compose.ui.node.g.I;
                    function0A = aVar11114.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK11114, aVar11114.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11114, aVar11114.g());
                    function2B = aVar11114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11114, aVar11114.f());
                    androidx.compose.foundation.layout.d0 d0Var11114 = androidx.compose.foundation.layout.d0.f15956a;
                    int i3111111118 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11114), c0VarR, 54), c0VarR, (i3111111118 & com.planner5d.library.engine.input.f.b.B) | (i3111111118 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar11117;
                    function5 = function4;
                    z16 = z1111111;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i20 = i11 & 64;
            if (i20 != 0) {
                if ((1572864 & i10) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i2111113 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2111113 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111111119 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111111119 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar11115 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar11118 = jVar3;
                        boolean z1111112 = z13;
                        androidx.compose.ui.a0 a0VarW11115 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11118, wd.h(false, 0.0f, j14, 2, null), z1111112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK11115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK11115 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11115 = androidx.compose.ui.m.n(c0VarR, a0VarW11115);
                        androidx.compose.ui.node.g.a aVar11115 = androidx.compose.ui.node.g.I;
                        function0A = aVar11115.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK11115, aVar11115.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK11115, aVar11115.g());
                        function2B = aVar11115.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN11115, aVar11115.f());
                        androidx.compose.foundation.layout.d0 d0Var11115 = androidx.compose.foundation.layout.d0.f15956a;
                        int i31111111110 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11115), c0VarR, 54), c0VarR, (i31111111110 & com.planner5d.library.engine.input.f.b.B) | (i31111111110 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar11118;
                        function5 = function4;
                        z16 = z1111112;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i2111114 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i2111114 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i31111111111 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i31111111111 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar11116 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar11119 = jVar3;
                    boolean z1111113 = z13;
                    androidx.compose.ui.a0 a0VarW11116 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar11119, wd.h(false, 0.0f, j14, 2, null), z1111113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK11116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11116 = androidx.compose.ui.m.n(c0VarR, a0VarW11116);
                    androidx.compose.ui.node.g.a aVar11116 = androidx.compose.ui.node.g.I;
                    function0A = aVar11116.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK11116, aVar11116.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11116, aVar11116.g());
                    function2B = aVar11116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11116, aVar11116.f());
                    androidx.compose.foundation.layout.d0 d0Var11116 = androidx.compose.foundation.layout.d0.f15956a;
                    int i31111111112 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11116), c0VarR, 54), c0VarR, (i31111111112 & com.planner5d.library.engine.input.f.b.B) | (i31111111112 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar11119;
                    function5 = function4;
                    z16 = z1111113;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            i22 = i11 & 128;
            if (i22 != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 100663296) == 0) {
                    int i2111115 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i2111115 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i31111111113 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i31111111113 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar11117 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar111110 = jVar3;
                    boolean z1111114 = z13;
                    androidx.compose.ui.a0 a0VarW11117 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111110, wd.h(false, 0.0f, j14, 2, null), z1111114, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK11117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11117 = androidx.compose.ui.m.n(c0VarR, a0VarW11117);
                    androidx.compose.ui.node.g.a aVar11117 = androidx.compose.ui.node.g.I;
                    function0A = aVar11117.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK11117, aVar11117.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11117, aVar11117.g());
                    function2B = aVar11117.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11117, aVar11117.f());
                    androidx.compose.foundation.layout.d0 d0Var11117 = androidx.compose.foundation.layout.d0.f15956a;
                    int i31111111114 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11117), c0VarR, 54), c0VarR, (i31111111114 & com.planner5d.library.engine.input.f.b.B) | (i31111111114 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar111110;
                    function5 = function4;
                    z16 = z1111114;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i10 & 100663296) == 0) {
                int i2111116 = i12;
                if ((i11 & 256) == 0) {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 = i2111116 | i28;
            } else {
                i24 = i12;
            }
            if ((i10 & 805306368) == 0) {
                int i31111111115 = i24;
                if ((i11 & 512) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i24 = i31111111115 | i27;
            }
            i25 = i24;
            if ((i25 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i25 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                }
                if (function4 == null) {
                    c0VarR.E(-1679605042);
                } else {
                    c0VarR.E(-1679605041);
                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVar11118 = cVarE;
                if (function4 == null) {
                    f10 = f24921c;
                } else {
                    f10 = f24920b;
                }
                androidx.compose.foundation.interaction.j jVar111111 = jVar3;
                boolean z1111115 = z13;
                androidx.compose.ui.a0 a0VarW11118 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111111, wd.h(false, 0.0f, j14, 2, null), z1111115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                androidx.compose.ui.layout.a1 a1VarK11118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK11118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11118 = androidx.compose.ui.m.n(c0VarR, a0VarW11118);
                androidx.compose.ui.node.g.a aVar11118 = androidx.compose.ui.node.g.I;
                function0A = aVar11118.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK11118, aVar11118.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK11118, aVar11118.g());
                function2B = aVar11118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN11118, aVar11118.f());
                androidx.compose.foundation.layout.d0 d0Var11118 = androidx.compose.foundation.layout.d0.f15956a;
                int i31111111116 = i26 >> 24;
                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11118), c0VarR, 54), c0VarR, (i31111111116 & com.planner5d.library.engine.input.f.b.B) | (i31111111116 & 14) | 3072 | ((i26 << 6) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar111111;
                function5 = function4;
                z16 = z1111115;
                j13 = jW;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                z16 = z13;
                function5 = function4;
                j12 = j10;
                j13 = j11;
            }
            a0Var3 = a0Var2;
            z17 = z14;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    if ((1572864 & i10) == 0) {
                        z14 = z12;
                        if (c0VarR.G(z14)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    i22 = i11 & 128;
                    if (i22 != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(jVar)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i2111117 = i12;
                            if ((i11 & 256) == 0) {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i28 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i24 = i2111117 | i28;
                        } else {
                            i24 = i12;
                        }
                        if ((i10 & 805306368) == 0) {
                            int i31111111117 = i24;
                            if ((i11 & 512) == 0) {
                                i27 = 268435456;
                            } else {
                                i27 = 268435456;
                            }
                            i24 = i31111111117 | i27;
                        }
                        i25 = i24;
                        if ((i25 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i25 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    function4 = null;
                                }
                                if (i20 != 0) {
                                    z14 = true;
                                }
                                if (i22 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 256) != 0) {
                                    j14 = x9.f25488a.a(c0VarR, 6).j();
                                    i26 = i25 & (-234881025);
                                } else {
                                    j14 = j10;
                                    i26 = i25;
                                }
                                if ((i11 & 512) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i26 &= -1879048193;
                                } else {
                                    jW = j11;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1679605042);
                            } else {
                                c0VarR.E(-1679605041);
                                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVar11119 = cVarE;
                            if (function4 == null) {
                                f10 = f24921c;
                            } else {
                                f10 = f24920b;
                            }
                            androidx.compose.foundation.interaction.j jVar111112 = jVar3;
                            boolean z1111116 = z13;
                            androidx.compose.ui.a0 a0VarW11119 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111112, wd.h(false, 0.0f, j14, 2, null), z1111116, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                            androidx.compose.ui.layout.a1 a1VarK11119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK11119 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN11119 = androidx.compose.ui.m.n(c0VarR, a0VarW11119);
                            androidx.compose.ui.node.g.a aVar11119 = androidx.compose.ui.node.g.I;
                            function0A = aVar11119.a();
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK11119, aVar11119.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK11119, aVar11119.g());
                            function2B = aVar11119.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN11119, aVar11119.f());
                            androidx.compose.foundation.layout.d0 d0Var11119 = androidx.compose.foundation.layout.d0.f15956a;
                            int i31111111118 = i26 >> 24;
                            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar11119), c0VarR, 54), c0VarR, (i31111111118 & com.planner5d.library.engine.input.f.b.B) | (i31111111118 & 14) | 3072 | ((i26 << 6) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar2 = jVar111112;
                            function5 = function4;
                            z16 = z1111116;
                            j13 = jW;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            z16 = z13;
                            function5 = function4;
                            j12 = j10;
                            j13 = j11;
                        }
                        a0Var3 = a0Var2;
                        z17 = z14;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i10 & 100663296) == 0) {
                        int i2111118 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2111118 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i31111111119 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i31111111119 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar111110 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar111113 = jVar3;
                        boolean z1111117 = z13;
                        androidx.compose.ui.a0 a0VarW111110 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111113, wd.h(false, 0.0f, j14, 2, null), z1111117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK111110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK111110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111110 = androidx.compose.ui.m.n(c0VarR, a0VarW111110);
                        androidx.compose.ui.node.g.a aVar111110 = androidx.compose.ui.node.g.I;
                        function0A = aVar111110.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK111110, aVar111110.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK111110, aVar111110.g());
                        function2B = aVar111110.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN111110, aVar111110.f());
                        androidx.compose.foundation.layout.d0 d0Var111110 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311111111110 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111110), c0VarR, 54), c0VarR, (i311111111110 & com.planner5d.library.engine.input.f.b.B) | (i311111111110 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar111113;
                        function5 = function4;
                        z16 = z1111117;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i2111119 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i2111119 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311111111111 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311111111111 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar111111 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar111114 = jVar3;
                        boolean z1111118 = z13;
                        androidx.compose.ui.a0 a0VarW111111 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111114, wd.h(false, 0.0f, j14, 2, null), z1111118, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK111111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK111111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111111 = androidx.compose.ui.m.n(c0VarR, a0VarW111111);
                        androidx.compose.ui.node.g.a aVar111111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111111.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK111111, aVar111111.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK111111, aVar111111.g());
                        function2B = aVar111111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN111111, aVar111111.f());
                        androidx.compose.foundation.layout.d0 d0Var111111 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311111111112 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111111), c0VarR, 54), c0VarR, (i311111111112 & com.planner5d.library.engine.input.f.b.B) | (i311111111112 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar111114;
                        function5 = function4;
                        z16 = z1111118;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i21111110 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21111110 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i311111111113 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i311111111113 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar111112 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar111115 = jVar3;
                    boolean z1111119 = z13;
                    androidx.compose.ui.a0 a0VarW111112 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111115, wd.h(false, 0.0f, j14, 2, null), z1111119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK111112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK111112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111112 = androidx.compose.ui.m.n(c0VarR, a0VarW111112);
                    androidx.compose.ui.node.g.a aVar111112 = androidx.compose.ui.node.g.I;
                    function0A = aVar111112.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK111112, aVar111112.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK111112, aVar111112.g());
                    function2B = aVar111112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN111112, aVar111112.f());
                    androidx.compose.foundation.layout.d0 d0Var111112 = androidx.compose.foundation.layout.d0.f15956a;
                    int i311111111114 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111112), c0VarR, 54), c0VarR, (i311111111114 & com.planner5d.library.engine.input.f.b.B) | (i311111111114 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar111115;
                    function5 = function4;
                    z16 = z1111119;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i20 = i11 & 64;
            if (i20 != 0) {
                if ((1572864 & i10) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i21111111 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21111111 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i311111111115 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i311111111115 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar111113 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar111116 = jVar3;
                        boolean z11111110 = z13;
                        androidx.compose.ui.a0 a0VarW111113 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111116, wd.h(false, 0.0f, j14, 2, null), z11111110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK111113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK111113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111113 = androidx.compose.ui.m.n(c0VarR, a0VarW111113);
                        androidx.compose.ui.node.g.a aVar111113 = androidx.compose.ui.node.g.I;
                        function0A = aVar111113.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK111113, aVar111113.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK111113, aVar111113.g());
                        function2B = aVar111113.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN111113, aVar111113.f());
                        androidx.compose.foundation.layout.d0 d0Var111113 = androidx.compose.foundation.layout.d0.f15956a;
                        int i311111111116 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111113), c0VarR, 54), c0VarR, (i311111111116 & com.planner5d.library.engine.input.f.b.B) | (i311111111116 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar111116;
                        function5 = function4;
                        z16 = z11111110;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i21111112 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21111112 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i311111111117 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i311111111117 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar111114 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar111117 = jVar3;
                    boolean z11111111 = z13;
                    androidx.compose.ui.a0 a0VarW111114 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111117, wd.h(false, 0.0f, j14, 2, null), z11111111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK111114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK111114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111114 = androidx.compose.ui.m.n(c0VarR, a0VarW111114);
                    androidx.compose.ui.node.g.a aVar111114 = androidx.compose.ui.node.g.I;
                    function0A = aVar111114.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK111114, aVar111114.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK111114, aVar111114.g());
                    function2B = aVar111114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN111114, aVar111114.f());
                    androidx.compose.foundation.layout.d0 d0Var111114 = androidx.compose.foundation.layout.d0.f15956a;
                    int i311111111118 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111114), c0VarR, 54), c0VarR, (i311111111118 & com.planner5d.library.engine.input.f.b.B) | (i311111111118 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar111117;
                    function5 = function4;
                    z16 = z11111111;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            i22 = i11 & 128;
            if (i22 != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 100663296) == 0) {
                    int i21111113 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21111113 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i311111111119 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i311111111119 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar111115 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar111118 = jVar3;
                    boolean z11111112 = z13;
                    androidx.compose.ui.a0 a0VarW111115 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111118, wd.h(false, 0.0f, j14, 2, null), z11111112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK111115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK111115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111115 = androidx.compose.ui.m.n(c0VarR, a0VarW111115);
                    androidx.compose.ui.node.g.a aVar111115 = androidx.compose.ui.node.g.I;
                    function0A = aVar111115.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK111115, aVar111115.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK111115, aVar111115.g());
                    function2B = aVar111115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN111115, aVar111115.f());
                    androidx.compose.foundation.layout.d0 d0Var111115 = androidx.compose.foundation.layout.d0.f15956a;
                    int i3111111111110 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111115), c0VarR, 54), c0VarR, (i3111111111110 & com.planner5d.library.engine.input.f.b.B) | (i3111111111110 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar111118;
                    function5 = function4;
                    z16 = z11111112;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i10 & 100663296) == 0) {
                int i21111114 = i12;
                if ((i11 & 256) == 0) {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 = i21111114 | i28;
            } else {
                i24 = i12;
            }
            if ((i10 & 805306368) == 0) {
                int i3111111111111 = i24;
                if ((i11 & 512) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i24 = i3111111111111 | i27;
            }
            i25 = i24;
            if ((i25 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i25 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                }
                if (function4 == null) {
                    c0VarR.E(-1679605042);
                } else {
                    c0VarR.E(-1679605041);
                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVar111116 = cVarE;
                if (function4 == null) {
                    f10 = f24921c;
                } else {
                    f10 = f24920b;
                }
                androidx.compose.foundation.interaction.j jVar111119 = jVar3;
                boolean z11111113 = z13;
                androidx.compose.ui.a0 a0VarW111116 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar111119, wd.h(false, 0.0f, j14, 2, null), z11111113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                androidx.compose.ui.layout.a1 a1VarK111116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK111116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111116 = androidx.compose.ui.m.n(c0VarR, a0VarW111116);
                androidx.compose.ui.node.g.a aVar111116 = androidx.compose.ui.node.g.I;
                function0A = aVar111116.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK111116, aVar111116.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK111116, aVar111116.g());
                function2B = aVar111116.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN111116, aVar111116.f());
                androidx.compose.foundation.layout.d0 d0Var111116 = androidx.compose.foundation.layout.d0.f15956a;
                int i3111111111112 = i26 >> 24;
                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111116), c0VarR, 54), c0VarR, (i3111111111112 & com.planner5d.library.engine.input.f.b.B) | (i3111111111112 & 14) | 3072 | ((i26 << 6) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar111119;
                function5 = function4;
                z16 = z11111113;
                j13 = jW;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                z16 = z13;
                function5 = function4;
                j12 = j10;
                j13 = j11;
            }
            a0Var3 = a0Var2;
            z17 = z14;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z13 = z11;
        i18 = i11 & 32;
        if (i18 != 0) {
            if ((196608 & i10) == 0) {
                function4 = function3;
                if (c0VarR.k0(function4)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                if ((1572864 & i10) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                i22 = i11 & 128;
                if (i22 != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i21111115 = i12;
                        if ((i11 & 256) == 0) {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i28 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i24 = i21111115 | i28;
                    } else {
                        i24 = i12;
                    }
                    if ((i10 & 805306368) == 0) {
                        int i3111111111113 = i24;
                        if ((i11 & 512) == 0) {
                            i27 = 268435456;
                        } else {
                            i27 = 268435456;
                        }
                        i24 = i3111111111113 | i27;
                    }
                    i25 = i24;
                    if ((i25 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i25 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                function4 = null;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            }
                            if (i22 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 256) != 0) {
                                j14 = x9.f25488a.a(c0VarR, 6).j();
                                i26 = i25 & (-234881025);
                            } else {
                                j14 = j10;
                                i26 = i25;
                            }
                            if ((i11 & 512) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -1879048193;
                            } else {
                                jW = j11;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1679605042);
                        } else {
                            c0VarR.E(-1679605041);
                            cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVar111117 = cVarE;
                        if (function4 == null) {
                            f10 = f24921c;
                        } else {
                            f10 = f24920b;
                        }
                        androidx.compose.foundation.interaction.j jVar1111110 = jVar3;
                        boolean z11111114 = z13;
                        androidx.compose.ui.a0 a0VarW111117 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111110, wd.h(false, 0.0f, j14, 2, null), z11111114, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                        androidx.compose.ui.layout.a1 a1VarK111117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK111117 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111117 = androidx.compose.ui.m.n(c0VarR, a0VarW111117);
                        androidx.compose.ui.node.g.a aVar111117 = androidx.compose.ui.node.g.I;
                        function0A = aVar111117.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK111117, aVar111117.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK111117, aVar111117.g());
                        function2B = aVar111117.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN111117, aVar111117.f());
                        androidx.compose.foundation.layout.d0 d0Var111117 = androidx.compose.foundation.layout.d0.f15956a;
                        int i3111111111114 = i26 >> 24;
                        n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111117), c0VarR, 54), c0VarR, (i3111111111114 & com.planner5d.library.engine.input.f.b.B) | (i3111111111114 & 14) | 3072 | ((i26 << 6) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar2 = jVar1111110;
                        function5 = function4;
                        z16 = z11111114;
                        j13 = jW;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        z16 = z13;
                        function5 = function4;
                        j12 = j10;
                        j13 = j11;
                    }
                    a0Var3 = a0Var2;
                    z17 = z14;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i10 & 100663296) == 0) {
                    int i21111116 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21111116 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i3111111111115 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i3111111111115 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar111118 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar1111111 = jVar3;
                    boolean z11111115 = z13;
                    androidx.compose.ui.a0 a0VarW111118 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111111, wd.h(false, 0.0f, j14, 2, null), z11111115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK111118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111118 = androidx.compose.ui.m.n(c0VarR, a0VarW111118);
                    androidx.compose.ui.node.g.a aVar111118 = androidx.compose.ui.node.g.I;
                    function0A = aVar111118.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK111118, aVar111118.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK111118, aVar111118.g());
                    function2B = aVar111118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN111118, aVar111118.f());
                    androidx.compose.foundation.layout.d0 d0Var111118 = androidx.compose.foundation.layout.d0.f15956a;
                    int i3111111111116 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111118), c0VarR, 54), c0VarR, (i3111111111116 & com.planner5d.library.engine.input.f.b.B) | (i3111111111116 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar1111111;
                    function5 = function4;
                    z16 = z11111115;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            i22 = i11 & 128;
            if (i22 != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 100663296) == 0) {
                    int i21111117 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21111117 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i3111111111117 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i3111111111117 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar111119 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar1111112 = jVar3;
                    boolean z11111116 = z13;
                    androidx.compose.ui.a0 a0VarW111119 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111112, wd.h(false, 0.0f, j14, 2, null), z11111116, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK111119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111119 = androidx.compose.ui.m.n(c0VarR, a0VarW111119);
                    androidx.compose.ui.node.g.a aVar111119 = androidx.compose.ui.node.g.I;
                    function0A = aVar111119.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK111119, aVar111119.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK111119, aVar111119.g());
                    function2B = aVar111119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN111119, aVar111119.f());
                    androidx.compose.foundation.layout.d0 d0Var111119 = androidx.compose.foundation.layout.d0.f15956a;
                    int i3111111111118 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar111119), c0VarR, 54), c0VarR, (i3111111111118 & com.planner5d.library.engine.input.f.b.B) | (i3111111111118 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar1111112;
                    function5 = function4;
                    z16 = z11111116;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i10 & 100663296) == 0) {
                int i21111118 = i12;
                if ((i11 & 256) == 0) {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 = i21111118 | i28;
            } else {
                i24 = i12;
            }
            if ((i10 & 805306368) == 0) {
                int i3111111111119 = i24;
                if ((i11 & 512) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i24 = i3111111111119 | i27;
            }
            i25 = i24;
            if ((i25 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i25 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                }
                if (function4 == null) {
                    c0VarR.E(-1679605042);
                } else {
                    c0VarR.E(-1679605041);
                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVar1111110 = cVarE;
                if (function4 == null) {
                    f10 = f24921c;
                } else {
                    f10 = f24920b;
                }
                androidx.compose.foundation.interaction.j jVar1111113 = jVar3;
                boolean z11111117 = z13;
                androidx.compose.ui.a0 a0VarW1111110 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111113, wd.h(false, 0.0f, j14, 2, null), z11111117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                androidx.compose.ui.layout.a1 a1VarK1111110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK1111110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111110 = androidx.compose.ui.m.n(c0VarR, a0VarW1111110);
                androidx.compose.ui.node.g.a aVar1111110 = androidx.compose.ui.node.g.I;
                function0A = aVar1111110.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK1111110, aVar1111110.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK1111110, aVar1111110.g());
                function2B = aVar1111110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN1111110, aVar1111110.f());
                androidx.compose.foundation.layout.d0 d0Var1111110 = androidx.compose.foundation.layout.d0.f15956a;
                int i31111111111110 = i26 >> 24;
                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1111110), c0VarR, 54), c0VarR, (i31111111111110 & com.planner5d.library.engine.input.f.b.B) | (i31111111111110 & 14) | 3072 | ((i26 << 6) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar1111113;
                function5 = function4;
                z16 = z11111117;
                j13 = jW;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                z16 = z13;
                function5 = function4;
                j12 = j10;
                j13 = j11;
            }
            a0Var3 = a0Var2;
            z17 = z14;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function4 = function3;
        i20 = i11 & 64;
        if (i20 != 0) {
            if ((1572864 & i10) == 0) {
                z14 = z12;
                if (c0VarR.G(z14)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            i22 = i11 & 128;
            if (i22 != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 100663296) == 0) {
                    int i21111119 = i12;
                    if ((i11 & 256) == 0) {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i28 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i24 = i21111119 | i28;
                } else {
                    i24 = i12;
                }
                if ((i10 & 805306368) == 0) {
                    int i31111111111111 = i24;
                    if ((i11 & 512) == 0) {
                        i27 = 268435456;
                    } else {
                        i27 = 268435456;
                    }
                    i24 = i31111111111111 | i27;
                }
                i25 = i24;
                if ((i25 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i25 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            function4 = null;
                        }
                        if (i20 != 0) {
                            z14 = true;
                        }
                        if (i22 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 256) != 0) {
                            j14 = x9.f25488a.a(c0VarR, 6).j();
                            i26 = i25 & (-234881025);
                        } else {
                            j14 = j10;
                            i26 = i25;
                        }
                        if ((i11 & 512) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -1879048193;
                        } else {
                            jW = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1679605042);
                    } else {
                        c0VarR.E(-1679605041);
                        cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVar1111111 = cVarE;
                    if (function4 == null) {
                        f10 = f24921c;
                    } else {
                        f10 = f24920b;
                    }
                    androidx.compose.foundation.interaction.j jVar1111114 = jVar3;
                    boolean z11111118 = z13;
                    androidx.compose.ui.a0 a0VarW1111111 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111114, wd.h(false, 0.0f, j14, 2, null), z11111118, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                    androidx.compose.ui.layout.a1 a1VarK1111111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK1111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111 = androidx.compose.ui.m.n(c0VarR, a0VarW1111111);
                    androidx.compose.ui.node.g.a aVar1111111 = androidx.compose.ui.node.g.I;
                    function0A = aVar1111111.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK1111111, aVar1111111.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK1111111, aVar1111111.g());
                    function2B = aVar1111111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN1111111, aVar1111111.f());
                    androidx.compose.foundation.layout.d0 d0Var1111111 = androidx.compose.foundation.layout.d0.f15956a;
                    int i31111111111112 = i26 >> 24;
                    n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1111111), c0VarR, 54), c0VarR, (i31111111111112 & com.planner5d.library.engine.input.f.b.B) | (i31111111111112 & 14) | 3072 | ((i26 << 6) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar2 = jVar1111114;
                    function5 = function4;
                    z16 = z11111118;
                    j13 = jW;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    z16 = z13;
                    function5 = function4;
                    j12 = j10;
                    j13 = j11;
                }
                a0Var3 = a0Var2;
                z17 = z14;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i10 & 100663296) == 0) {
                int i211111110 = i12;
                if ((i11 & 256) == 0) {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 = i211111110 | i28;
            } else {
                i24 = i12;
            }
            if ((i10 & 805306368) == 0) {
                int i31111111111113 = i24;
                if ((i11 & 512) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i24 = i31111111111113 | i27;
            }
            i25 = i24;
            if ((i25 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i25 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                }
                if (function4 == null) {
                    c0VarR.E(-1679605042);
                } else {
                    c0VarR.E(-1679605041);
                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVar1111112 = cVarE;
                if (function4 == null) {
                    f10 = f24921c;
                } else {
                    f10 = f24920b;
                }
                androidx.compose.foundation.interaction.j jVar1111115 = jVar3;
                boolean z11111119 = z13;
                androidx.compose.ui.a0 a0VarW1111112 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111115, wd.h(false, 0.0f, j14, 2, null), z11111119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                androidx.compose.ui.layout.a1 a1VarK1111112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK1111112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111112 = androidx.compose.ui.m.n(c0VarR, a0VarW1111112);
                androidx.compose.ui.node.g.a aVar1111112 = androidx.compose.ui.node.g.I;
                function0A = aVar1111112.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK1111112, aVar1111112.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK1111112, aVar1111112.g());
                function2B = aVar1111112.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN1111112, aVar1111112.f());
                androidx.compose.foundation.layout.d0 d0Var1111112 = androidx.compose.foundation.layout.d0.f15956a;
                int i31111111111114 = i26 >> 24;
                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1111112), c0VarR, 54), c0VarR, (i31111111111114 & com.planner5d.library.engine.input.f.b.B) | (i31111111111114 & 14) | 3072 | ((i26 << 6) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar1111115;
                function5 = function4;
                z16 = z11111119;
                j13 = jW;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                z16 = z13;
                function5 = function4;
                j12 = j10;
                j13 = j11;
            }
            a0Var3 = a0Var2;
            z17 = z14;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        z14 = z12;
        i22 = i11 & 128;
        if (i22 != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.D(jVar)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((i10 & 100663296) == 0) {
                int i211111111 = i12;
                if ((i11 & 256) == 0) {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i28 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i24 = i211111111 | i28;
            } else {
                i24 = i12;
            }
            if ((i10 & 805306368) == 0) {
                int i31111111111115 = i24;
                if ((i11 & 512) == 0) {
                    i27 = 268435456;
                } else {
                    i27 = 268435456;
                }
                i24 = i31111111111115 | i27;
            }
            i25 = i24;
            if ((i25 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i25 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        function4 = null;
                    }
                    if (i20 != 0) {
                        z14 = true;
                    }
                    if (i22 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 256) != 0) {
                        j14 = x9.f25488a.a(c0VarR, 6).j();
                        i26 = i25 & (-234881025);
                    } else {
                        j14 = j10;
                        i26 = i25;
                    }
                    if ((i11 & 512) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -1879048193;
                    } else {
                        jW = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                }
                if (function4 == null) {
                    c0VarR.E(-1679605042);
                } else {
                    c0VarR.E(-1679605041);
                    cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVar1111113 = cVarE;
                if (function4 == null) {
                    f10 = f24921c;
                } else {
                    f10 = f24920b;
                }
                androidx.compose.foundation.interaction.j jVar1111116 = jVar3;
                boolean z111111110 = z13;
                androidx.compose.ui.a0 a0VarW1111113 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111116, wd.h(false, 0.0f, j14, 2, null), z111111110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
                androidx.compose.ui.layout.a1 a1VarK1111113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK1111113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111113 = androidx.compose.ui.m.n(c0VarR, a0VarW1111113);
                androidx.compose.ui.node.g.a aVar1111113 = androidx.compose.ui.node.g.I;
                function0A = aVar1111113.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK1111113, aVar1111113.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK1111113, aVar1111113.g());
                function2B = aVar1111113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN1111113, aVar1111113.f());
                androidx.compose.foundation.layout.d0 d0Var1111113 = androidx.compose.foundation.layout.d0.f15956a;
                int i31111111111116 = i26 >> 24;
                n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1111113), c0VarR, 54), c0VarR, (i31111111111116 & com.planner5d.library.engine.input.f.b.B) | (i31111111111116 & 14) | 3072 | ((i26 << 6) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar2 = jVar1111116;
                function5 = function4;
                z16 = z111111110;
                j13 = jW;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                z16 = z13;
                function5 = function4;
                j12 = j10;
                j13 = j11;
            }
            a0Var3 = a0Var2;
            z17 = z14;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((i10 & 100663296) == 0) {
            int i211111112 = i12;
            if ((i11 & 256) == 0) {
                i28 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i28 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i24 = i211111112 | i28;
        } else {
            i24 = i12;
        }
        if ((i10 & 805306368) == 0) {
            int i31111111111117 = i24;
            if ((i11 & 512) == 0) {
                i27 = 268435456;
            } else {
                i27 = 268435456;
            }
            i24 = i31111111111117 | i27;
        }
        i25 = i24;
        if ((i25 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c0VarR.h(z15, i25 & 1)) {
            c0VarR.l0();
            cVarE = null;
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    function4 = null;
                }
                if (i20 != 0) {
                    z14 = true;
                }
                if (i22 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if ((i11 & 256) != 0) {
                    j14 = x9.f25488a.a(c0VarR, 6).j();
                    i26 = i25 & (-234881025);
                } else {
                    j14 = j10;
                    i26 = i25;
                }
                if ((i11 & 512) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i26 &= -1879048193;
                } else {
                    jW = j11;
                }
            } else {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    function4 = null;
                }
                if (i20 != 0) {
                    z14 = true;
                }
                if (i22 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if ((i11 & 256) != 0) {
                    j14 = x9.f25488a.a(c0VarR, 6).j();
                    i26 = i25 & (-234881025);
                } else {
                    j14 = j10;
                    i26 = i25;
                }
                if ((i11 & 512) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i26 &= -1879048193;
                } else {
                    jW = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(83562179, i26, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
            }
            if (function4 == null) {
                c0VarR.E(-1679605042);
            } else {
                c0VarR.E(-1679605041);
                cVarE = androidx.compose.runtime.internal.w.e(-674640273, true, new c(function4), c0VarR, 54);
            }
            c0VarR.A();
            androidx.compose.runtime.internal.c cVar1111114 = cVarE;
            if (function4 == null) {
                f10 = f24921c;
            } else {
                f10 = f24920b;
            }
            androidx.compose.foundation.interaction.j jVar1111117 = jVar3;
            boolean z111111111 = z13;
            androidx.compose.ui.a0 a0VarW1111114 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.selection.c.a(a0Var2, z10, jVar1111117, wd.h(false, 0.0f, j14, 2, null), z111111111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function0), f10);
            androidx.compose.ui.layout.a1 a1VarK1111114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK1111114 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111114 = androidx.compose.ui.m.n(c0VarR, a0VarW1111114);
            androidx.compose.ui.node.g.a aVar1111114 = androidx.compose.ui.node.g.I;
            function0A = aVar1111114.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK1111114, aVar1111114.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK1111114, aVar1111114.g());
            function2B = aVar1111114.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN1111114, aVar1111114.f());
            androidx.compose.foundation.layout.d0 d0Var1111114 = androidx.compose.foundation.layout.d0.f15956a;
            int i31111111111118 = i26 >> 24;
            n(j14, jW, z10, androidx.compose.runtime.internal.w.e(317431928, true, new b(z14, function2, cVar1111114), c0VarR, 54), c0VarR, (i31111111111118 & com.planner5d.library.engine.input.f.b.B) | (i31111111111118 & 14) | 3072 | ((i26 << 6) & 896));
            c0Var2 = c0VarR;
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar2 = jVar1111117;
            function5 = function4;
            z16 = z111111111;
            j13 = jW;
            j12 = j14;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            jVar2 = jVar;
            z16 = z13;
            function5 = function4;
            j12 = j10;
            j13 = j11;
        }
        a0Var3 = a0Var2;
        z17 = z14;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.nb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return sb.m(z10, function0, function2, a0Var3, z16, function5, z17, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void k(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1276874318);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.I(f10) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1276874318, i11, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:317)");
            }
            boolean z10 = ((i11 & com.planner5d.library.engine.input.f.b.B) == 32) | ((i11 & 896) == 256);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new d(function3, f10);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, "icon");
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
            c0VarR.o();
            if (function3 != null) {
                c0VarR.E(-1177221249);
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.a.a(androidx.compose.ui.layout.i0.b(aVar, com.google.firebase.messaging.e.f.f123534d), f10);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar2.f());
                function3.invoke(c0VarR, Integer.valueOf((i11 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-1177121305);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.rb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return sb.l(function2, function3, f10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function2 function2, Function2 function3, float f10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(function2, function3, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z10, Function0 function0, Function2 function2, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function3, boolean z12, androidx.compose.foundation.interaction.j jVar, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(z10, function0, function2, a0Var, z11, function3, z12, jVar, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    private static final void n(final long j10, final long j11, final boolean z10, final pj.n<? super Float, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(140356545);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(nVar) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(140356545, i11, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:285)");
            }
            androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, f24919a, 0.0f, null, null, c0VarR, 48, 28);
            long jQ = androidx.compose.ui.graphics.s0.q(j11, j10, o(n7VarF));
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{x4.a().f(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.w(jQ, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(jQ)))}, androidx.compose.runtime.internal.w.e(1330097921, true, new e(nVar, n7VarF), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.lb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return sb.p(j10, j11, z10, nVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(long j10, long j11, boolean z10, pj.n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        n(j10, j11, z10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, pj.n nVar, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(a0Var, j10, j11, f10, nVar, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, pj.n nVar, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(v6Var, a0Var, j10, j11, f10, nVar, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 y(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, long j10) {
        boolean z10 = false | false;
        final int iMax = Math.max(0, (androidx.compose.ui.unit.b.p(j10) - i2Var.h1()) / 2);
        final int iMax2 = Math.max(0, (androidx.compose.ui.unit.b.o(j10) - i2Var.c1()) / 2);
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.material.qb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sb.z(i2Var, iMax, iMax2, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i10, i11, 0.0f, 4, null);
        return Unit.f312394a;
    }
}

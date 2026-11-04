package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,495:1\n113#2:496\n70#3:497\n67#3,9:498\n77#3:537\n79#4,6:507\n86#4,3:522\n89#4,2:531\n93#4:536\n165#4:596\n163#4,7:597\n79#4,6:610\n86#4,3:625\n89#4,2:634\n93#4:639\n171#4:640\n347#5,9:513\n356#5,3:533\n347#5,9:616\n356#5,3:636\n4206#6,6:525\n4206#6,6:628\n1282#7,6:538\n1282#7,6:544\n1282#7,6:550\n1282#7,6:556\n1282#7,3:569\n1285#7,3:573\n1282#7,6:578\n1282#7,6:584\n1282#7,6:590\n1247#7,6:604\n607#8:562\n604#8,6:563\n605#9:572\n75#10:576\n1#11:577\n59#12:641\n90#13:642\n70#13:644\n70#13:647\n61#14:643\n61#14:646\n22#15:645\n22#15:648\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n127#1:496\n137#1:497\n137#1:498,9\n137#1:537\n137#1:507,6\n137#1:522,3\n137#1:531,2\n137#1:536\n415#1:596\n415#1:597,7\n415#1:610,6\n415#1:625,3\n415#1:634,2\n415#1:639\n415#1:640\n137#1:513,9\n137#1:533,3\n415#1:616,9\n415#1:636,3\n137#1:525,6\n415#1:628,6\n191#1:538,6\n193#1:544,6\n213#1:550,6\n243#1:556,6\n249#1:569,3\n249#1:573,3\n255#1:578,6\n272#1:584,6\n417#1:590,6\n415#1:604,6\n249#1:562\n249#1:563,6\n249#1:572\n251#1:576\n276#1:641\n276#1:642\n474#1:644\n492#1:647\n474#1:643\n492#1:646\n474#1:645\n492#1:648\n*E\n"})
public final class j3 {

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,495:1\n1282#2,6:496\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1\n*L\n145#1:496,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3 f29578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> f29580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f29581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f29582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f29584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f29585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f29586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f29587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f29588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f29590m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ pj.n<f10, androidx.compose.runtime.c0, Integer, Unit> f29591n;

        /* JADX INFO: renamed from: androidx.compose.material3.j3$a$a, reason: collision with other inner class name */
        static final class C0240a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> f29592a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f29593b;

            /* JADX WARN: Multi-variable type inference failed */
            C0240a(pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, float f10) {
                this.f29592a = nVar;
                this.f29593b = f10;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-519581786, i10, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:142)");
                }
                this.f29592a.invoke(androidx.compose.foundation.layout.d5.j(0.0f, 0.0f, 0.0f, this.f29593b, 7, null), c0Var, 0);
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
            final /* synthetic */ q3 f29594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f29595b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f29596c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f29597d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.q3 f29598e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f29599f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f29600g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f29601h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ float f29602i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29603j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f29604k;

            /* JADX WARN: Multi-variable type inference failed */
            b(q3 q3Var, float f10, float f11, boolean z10, androidx.compose.ui.graphics.q3 q3Var2, long j10, long j11, float f12, float f13, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f29594a = q3Var;
                this.f29595b = f10;
                this.f29596c = f11;
                this.f29597d = z10;
                this.f29598e = q3Var2;
                this.f29599f = j10;
                this.f29600g = j11;
                this.f29601h = f12;
                this.f29602i = f13;
                this.f29603j = function2;
                this.f29604k = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-815624571, i10, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:147)");
                }
                j3.o(this.f29594a.a(), this.f29595b, this.f29596c, this.f29597d, this.f29598e, this.f29599f, this.f29600g, this.f29601h, this.f29602i, this.f29603j, this.f29604k, c0Var, 0, 0);
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
            final /* synthetic */ pj.n<f10, androidx.compose.runtime.c0, Integer, Unit> f29605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q3 f29606b;

            /* JADX WARN: Multi-variable type inference failed */
            c(pj.n<? super f10, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, q3 q3Var) {
                this.f29605a = nVar;
                this.f29606b = q3Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1111667356, i10, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:143)");
                }
                this.f29605a.invoke(this.f29606b.b(), c0Var, 0);
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
        a(q3 q3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, float f10, float f11, boolean z10, androidx.compose.ui.graphics.q3 q3Var2, long j10, long j11, float f12, float f13, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, pj.n<? super f10, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3) {
            this.f29578a = q3Var;
            this.f29579b = function2;
            this.f29580c = nVar;
            this.f29581d = f10;
            this.f29582e = f11;
            this.f29583f = z10;
            this.f29584g = q3Var2;
            this.f29585h = j10;
            this.f29586i = j11;
            this.f29587j = f12;
            this.f29588k = f13;
            this.f29589l = function3;
            this.f29590m = nVar2;
            this.f29591n = nVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(q3 q3Var) {
            return q3Var.a().F();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(999829022, i10, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:140)");
            }
            tx txVarA = this.f29578a.a();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f29579b;
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-519581786, true, new C0240a(this.f29580c, this.f29581d), c0Var, 54);
            androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-815624571, true, new b(this.f29578a, this.f29581d, this.f29582e, this.f29583f, this.f29584g, this.f29585h, this.f29586i, this.f29587j, this.f29588k, this.f29589l, this.f29590m), c0Var, 54);
            androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-1111667356, true, new c(this.f29591n, this.f29578a), c0Var, 54);
            boolean zD = c0Var.D(this.f29578a);
            final q3 q3Var = this.f29578a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.i3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(j3.a.f(q3Var));
                    }
                };
                c0Var.Y(objI0);
            }
            j3.l(function2, cVarE, cVarE2, cVarE3, (Function0) objI0, txVarA, c0Var, 3504);
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

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,495:1\n150#2,3:496\n34#2,6:499\n153#2:505\n150#2,3:506\n34#2,6:509\n153#2:515\n320#2,8:516\n150#2,3:524\n34#2,6:527\n153#2:533\n150#2,3:534\n34#2,6:537\n153#2:543\n320#2,8:544\n320#2,8:552\n320#2,8:560\n34#2,6:568\n34#2,6:574\n34#2,6:580\n34#2,6:586\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n*L\n424#1:496,3\n424#1:499,6\n424#1:505\n426#1:506,3\n426#1:509,6\n426#1:515\n427#1:516,8\n430#1:524,3\n430#1:527,6\n430#1:533\n432#1:534,3\n432#1:537,6\n432#1:543\n435#1:544,8\n438#1:552,8\n439#1:560,8\n449#1:568,6\n450#1:574,6\n451#1:580,6\n452#1:586,6\n*E\n"})
    static final class b implements androidx.compose.ui.layout.h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tx f29607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f29608b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29609a;

            static {
                int[] iArr = new int[vx.values().length];
                try {
                    iArr[vx.PartiallyExpanded.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vx.Expanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vx.Hidden.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f29609a = iArr;
            }
        }

        b(tx txVar, Function0<Float> function0) {
            this.f29607a = txVar;
            this.f29608b = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(List list, int i10, List list2, tx txVar, Function0 function0, int i11, List list3, List list4, int i12, androidx.compose.ui.layout.i2.a aVar) {
            Integer numValueOf;
            Integer numValueOf2;
            int iL0;
            Integer numValueOf3 = null;
            if (!list.isEmpty()) {
                numValueOf = Integer.valueOf(((androidx.compose.ui.layout.i2) list.get(0)).h1());
                int lastIndex = CollectionsKt.getLastIndex(list);
                if (1 <= lastIndex) {
                    int i13 = 1;
                    while (true) {
                        Integer numValueOf4 = Integer.valueOf(((androidx.compose.ui.layout.i2) list.get(i13)).h1());
                        if (numValueOf4.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf4;
                        }
                        if (i13 == lastIndex) {
                            break;
                        }
                        i13++;
                    }
                }
            } else {
                numValueOf = null;
            }
            int iMax = Math.max(0, (i10 - (numValueOf != null ? numValueOf.intValue() : 0)) / 2);
            if (!list2.isEmpty()) {
                numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.i2) list2.get(0)).h1());
                int lastIndex2 = CollectionsKt.getLastIndex(list2);
                if (1 <= lastIndex2) {
                    int i14 = 1;
                    while (true) {
                        Integer numValueOf5 = Integer.valueOf(((androidx.compose.ui.layout.i2) list2.get(i14)).h1());
                        if (numValueOf5.compareTo(numValueOf2) > 0) {
                            numValueOf2 = numValueOf5;
                        }
                        if (i14 == lastIndex2) {
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                numValueOf2 = null;
            }
            int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
            if (!list2.isEmpty()) {
                numValueOf3 = Integer.valueOf(((androidx.compose.ui.layout.i2) list2.get(0)).c1());
                int lastIndex3 = CollectionsKt.getLastIndex(list2);
                if (1 <= lastIndex3) {
                    int i15 = 1;
                    while (true) {
                        Integer numValueOf6 = Integer.valueOf(((androidx.compose.ui.layout.i2) list2.get(i15)).c1());
                        if (numValueOf6.compareTo(numValueOf3) > 0) {
                            numValueOf3 = numValueOf6;
                        }
                        if (i15 == lastIndex3) {
                            break;
                        }
                        i15++;
                    }
                }
            }
            int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
            int i16 = (i10 - iIntValue) / 2;
            int i17 = a.f29609a[txVar.s().ordinal()];
            if (i17 == 1) {
                iL0 = kotlin.math.b.L0(((Number) function0.invoke()).floatValue()) - iIntValue2;
            } else {
                if (i17 != 2 && i17 != 3) {
                    throw new kotlin.k0();
                }
                iL0 = i11 - iIntValue2;
            }
            int size = list3.size();
            for (int i18 = 0; i18 < size; i18++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list3.get(i18), 0, i12, 0.0f, 4, null);
            }
            int size2 = list4.size();
            for (int i19 = 0; i19 < size2; i19++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list4.get(i19), 0, 0, 0.0f, 4, null);
            }
            int size3 = list.size();
            for (int i20 = 0; i20 < size3; i20++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i20), iMax, 0, 0.0f, 4, null);
            }
            int size4 = list2.size();
            for (int i21 = 0; i21 < size4; i21++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list2.get(i21), i16, iL0, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.h1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends List<? extends androidx.compose.ui.layout.z0>> list, long j10) {
            Integer numValueOf;
            List<? extends androidx.compose.ui.layout.z0> list2 = list.get(0);
            int i10 = 1;
            List<? extends androidx.compose.ui.layout.z0> list3 = list.get(1);
            List<? extends androidx.compose.ui.layout.z0> list4 = list.get(2);
            List<? extends androidx.compose.ui.layout.z0> list5 = list.get(3);
            final int iP = androidx.compose.ui.unit.b.p(j10);
            final int iO = androidx.compose.ui.unit.b.o(j10);
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
            final ArrayList arrayList = new ArrayList(list4.size());
            int size = list4.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list4.get(i11).P0(jD));
            }
            final ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(list2.get(i12).P0(jD));
            }
            if (!arrayList2.isEmpty()) {
                numValueOf = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList2.get(0)).c1());
                int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                if (1 <= lastIndex) {
                    while (true) {
                        Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.i2) arrayList2.get(i10)).c1());
                        if (numValueOf2.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                numValueOf = null;
            }
            final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            long jD2 = androidx.compose.ui.unit.b.d(jD, 0, 0, 0, iO - iIntValue, 7, null);
            final ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(list3.get(i13).P0(jD2));
            }
            final ArrayList arrayList4 = new ArrayList(list5.size());
            int size4 = list5.size();
            for (int i14 = 0; i14 < size4; i14++) {
                arrayList4.add(list5.get(i14).P0(jD));
            }
            final tx txVar = this.f29607a;
            final Function0<Float> function0 = this.f29608b;
            return androidx.compose.ui.layout.c1.h6(c1Var, iP, iO, null, new Function1() { // from class: androidx.compose.material3.k3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j3.b.g(arrayList, iP, arrayList4, txVar, function0, iO, arrayList3, arrayList2, iIntValue, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,495:1\n87#2:496\n84#2,9:497\n94#2:539\n79#3,6:506\n86#3,3:521\n89#3,2:530\n93#3:538\n347#4,9:512\n356#4:532\n357#4,2:536\n4206#5,6:524\n192#6:533\n195#6:534\n198#6:535\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n*L\n324#1:496\n324#1:497,9\n324#1:539\n324#1:506,6\n324#1:521,3\n324#1:530,2\n324#1:538\n324#1:512,9\n324#1:532\n324#1:536,2\n324#1:524,6\n333#1:533\n334#1:534\n335#1:535\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tx f29610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f29612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f29613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f29614e;

        @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,495:1\n1282#2,6:496\n1282#2,6:502\n70#3:508\n67#3,9:509\n77#3:548\n79#4,6:518\n86#4,3:533\n89#4,2:542\n93#4:547\n347#5,9:524\n356#5,3:544\n4206#6,6:536\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3$1$1\n*L\n339#1:496,6\n354#1:502,6\n337#1:508\n337#1:509,9\n337#1:548\n337#1:518,6\n337#1:533,3\n337#1:542,2\n337#1:547\n337#1:524,9\n337#1:544,3\n337#1:536,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ tx f29615a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f29616b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f29617c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29618d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29619e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f29620f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29621g;

            /* JADX INFO: renamed from: androidx.compose.material3.j3$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {344, 346}, m = "invokeSuspend", n = {}, s = {})
            static final class C0241a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29622a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f29623b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0241a(tx txVar, kotlin.coroutines.d<? super C0241a> dVar) {
                    super(2, dVar);
                    this.f29623b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0241a(this.f29623b, dVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
                
                    if (r6.B(r5) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
                
                    if (r6.E(r5) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
                
                    return r0;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r5.f29622a
                        r2 = 1
                        r2 = 2
                        r4 = 0
                        r3 = 1
                        if (r1 == 0) goto L22
                        r4 = 0
                        if (r1 == r3) goto L1d
                        r4 = 1
                        if (r1 != r2) goto L13
                        goto L1d
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "/ sr/k mw ootioei/t uor s/ue/cvhecnofelere/iatl //b"
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L1d:
                        r4 = 1
                        kotlin.ResultKt.m(r6)
                        goto L49
                    L22:
                        kotlin.ResultKt.m(r6)
                        androidx.compose.material3.tx r6 = r5.f29623b
                        r4 = 2
                        boolean r6 = r6.y()
                        r4 = 6
                        if (r6 != 0) goto L3c
                        androidx.compose.material3.tx r6 = r5.f29623b
                        r4 = 0
                        r5.f29622a = r3
                        r4 = 5
                        java.lang.Object r5 = r6.B(r5)
                        if (r5 != r0) goto L49
                        goto L48
                    L3c:
                        androidx.compose.material3.tx r6 = r5.f29623b
                        r4 = 1
                        r5.f29622a = r2
                        java.lang.Object r5 = r6.E(r5)
                        r4 = 6
                        if (r5 != r0) goto L49
                    L48:
                        return r0
                    L49:
                        kotlin.Unit r5 = kotlin.Unit.f312394a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.j3.c.a.C0241a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0241a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2", f = "BottomSheetScaffold.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29624a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f29625b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(tx txVar, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f29625b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f29625b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f29624a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f29625b;
                        this.f29624a = 1;
                        if (txVar.o(this) == objL) {
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
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.material3.j3$c$a$c, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3", f = "BottomSheetScaffold.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {})
            static final class C0242c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29626a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f29627b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0242c(tx txVar, kotlin.coroutines.d<? super C0242c> dVar) {
                    super(2, dVar);
                    this.f29627b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0242c(this.f29627b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f29626a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f29627b;
                        this.f29626a = 1;
                        if (txVar.L(this) == objL) {
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
                    return ((C0242c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
            static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29628a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f29629b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(tx txVar, kotlin.coroutines.d<? super d> dVar) {
                    super(2, dVar);
                    this.f29629b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new d(this.f29629b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f29628a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f29629b;
                        this.f29628a = 1;
                        if (txVar.o(this) == objL) {
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
                    return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
            static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29630a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f29631b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(tx txVar, kotlin.coroutines.d<? super e> dVar) {
                    super(2, dVar);
                    this.f29631b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new e(this.f29631b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f29630a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f29631b;
                        this.f29630a = 1;
                        if (txVar.E(this) == objL) {
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
                    return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$3$1", f = "BottomSheetScaffold.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
            static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29632a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f29633b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(tx txVar, kotlin.coroutines.d<? super f> dVar) {
                    super(2, dVar);
                    this.f29633b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new f(this.f29633b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f29632a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f29633b;
                        this.f29632a = 1;
                        if (txVar.B(this) == objL) {
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

            public /* synthetic */ class g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f29634a;

                static {
                    int[] iArr = new int[vx.values().length];
                    try {
                        iArr[vx.Expanded.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vx.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f29634a = iArr;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(tx txVar, kotlinx.coroutines.s0 s0Var, boolean z10, String str, String str2, String str3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f29615a = txVar;
                this.f29616b = s0Var;
                this.f29617c = z10;
                this.f29618d = str;
                this.f29619e = str2;
                this.f29620f = str3;
                this.f29621g = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit n(tx txVar, kotlinx.coroutines.s0 s0Var) {
                int i10 = g.f29634a[txVar.s().ordinal()];
                if (i10 == 1) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new C0241a(txVar, null), 3, null);
                } else if (i10 != 2) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new C0242c(txVar, null), 3, null);
                } else {
                    kotlinx.coroutines.k.f(s0Var, null, null, new b(txVar, null), 3, null);
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(final tx txVar, boolean z10, String str, String str2, String str3, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
                if (txVar.q().u().getSize() > 1 && z10) {
                    vx vxVarS = txVar.s();
                    vx vxVar = vx.PartiallyExpanded;
                    if (vxVarS == vxVar) {
                        if (txVar.q().x().invoke(vx.Expanded).booleanValue()) {
                            androidx.compose.ui.semantics.b0.r(e0Var, str, new Function0() { // from class: androidx.compose.material3.l3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(j3.c.a.v(s0Var, txVar));
                                }
                            });
                        }
                    } else if (txVar.q().x().invoke(vxVar).booleanValue()) {
                        androidx.compose.ui.semantics.b0.g(e0Var, str2, new Function0() { // from class: androidx.compose.material3.m3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(j3.c.a.x(s0Var, txVar));
                            }
                        });
                    }
                    if (!txVar.y()) {
                        androidx.compose.ui.semantics.b0.o(e0Var, str3, new Function0() { // from class: androidx.compose.material3.n3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(j3.c.a.y(s0Var, txVar));
                            }
                        });
                    }
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean v(kotlinx.coroutines.s0 s0Var, tx txVar) {
                kotlinx.coroutines.k.f(s0Var, null, null, new d(txVar, null), 3, null);
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean x(kotlinx.coroutines.s0 s0Var, tx txVar) {
                int i10 = 2 >> 0;
                kotlinx.coroutines.k.f(s0Var, null, null, new e(txVar, null), 3, null);
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean y(kotlinx.coroutines.s0 s0Var, tx txVar) {
                kotlinx.coroutines.k.f(s0Var, null, null, new f(txVar, null), 3, null);
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                m(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void m(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-511691176, i10, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:336)");
                }
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                boolean zD = c0Var.D(this.f29615a) | c0Var.k0(this.f29616b);
                final tx txVar = this.f29615a;
                final kotlinx.coroutines.s0 s0Var = this.f29616b;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.o3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j3.c.a.n(txVar, s0Var);
                        }
                    };
                    c0Var.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.i1.h(aVar, false, null, null, (Function0) objI0, 7, null);
                boolean zD2 = c0Var.D(this.f29615a) | c0Var.G(this.f29617c) | c0Var.D(this.f29618d) | c0Var.k0(this.f29616b) | c0Var.D(this.f29619e) | c0Var.D(this.f29620f);
                final tx txVar2 = this.f29615a;
                final boolean z10 = this.f29617c;
                final String str = this.f29618d;
                final String str2 = this.f29619e;
                final String str3 = this.f29620f;
                final kotlinx.coroutines.s0 s0Var2 = this.f29616b;
                Object objI1 = c0Var.i0();
                if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    Function1 function1 = new Function1() { // from class: androidx.compose.material3.p3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j3.c.a.s(txVar2, z10, str, str2, str3, s0Var2, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(function1);
                    objI1 = function1;
                }
                androidx.compose.ui.a0 a0VarE = androidx.compose.ui.semantics.t.e(a0VarH, true, (Function1) objI1);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f29621g;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarE);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0Var, 0);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(tx txVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, kotlinx.coroutines.s0 s0Var, boolean z10) {
            this.f29610a = txVar;
            this.f29611b = function2;
            this.f29612c = nVar;
            this.f29613d = s0Var;
            this.f29614e = z10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1508311921, i10, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:323)");
            }
            androidx.compose.ui.a0 a0VarZ = j3.z(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), this.f29610a);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f29611b;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f29612c;
            tx txVar = this.f29610a;
            kotlinx.coroutines.s0 s0Var = this.f29613d;
            boolean z10 = this.f29614e;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarZ);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            if (function2 != null) {
                c0Var.E(-1044068159);
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                ix.g(n0Var, androidx.compose.runtime.internal.w.e(-511691176, true, new a(txVar, s0Var, z10, androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31832d), c0Var, 0), androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31826a), c0Var, 0), androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31828b), c0Var, 0), function2), c0Var, 54), c0Var, 54);
                c0Var.A();
            } else {
                c0Var.E(-1040260677);
                c0Var.A();
            }
            nVar.invoke(n0Var, c0Var, 6);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tx f29636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29637c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(tx txVar, float f10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f29636b = txVar;
            this.f29637c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f29636b, this.f29637c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29635a;
            if (i10 == 0) {
                ResultKt.m(obj);
                tx txVar = this.f29636b;
                float f10 = this.f29637c;
                this.f29635a = 1;
                if (txVar.K(f10, this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29638a;

        static {
            int[] iArr = new int[vx.values().length];
            try {
                iArr[vx.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vx.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vx.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29638a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(tx txVar, androidx.compose.ui.graphics.r1 r1Var) {
        float fC = txVar.q().C();
        float fE = txVar.q().u().e();
        float f10 = fC < fE ? fE - fC : 0.0f;
        r1Var.C(f10 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a)) + f10) / Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a))) : 1.0f);
        r1Var.W1(androidx.compose.ui.graphics.a4.a(0.5f, 0.0f));
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 B(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final tx txVar) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.material3.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j3.C(txVar, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(tx txVar, androidx.compose.ui.graphics.r1 r1Var) {
        float fC = txVar.q().C();
        float fE = txVar.q().u().e();
        float f10 = fC < fE ? fE - fC : 0.0f;
        r1Var.C(f10 > 0.0f ? (Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a)) + f10) / Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & r1Var.d())) : 1.0f);
        r1Var.W1(androidx.compose.ui.graphics.a4.a(0.5f, 0.0f));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x015d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x0181  */
    /* JADX WARN: Code duplicated, block: B:123:0x0188  */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01da  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0203  */
    /* JADX WARN: Code duplicated, block: B:165:0x020b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0214  */
    /* JADX WARN: Code duplicated, block: B:170:0x021d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0222  */
    /* JADX WARN: Code duplicated, block: B:175:0x0228  */
    /* JADX WARN: Code duplicated, block: B:176:0x022d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0235  */
    /* JADX WARN: Code duplicated, block: B:180:0x023b  */
    /* JADX WARN: Code duplicated, block: B:181:0x023e  */
    /* JADX WARN: Code duplicated, block: B:185:0x024d  */
    /* JADX WARN: Code duplicated, block: B:189:0x025a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0263  */
    /* JADX WARN: Code duplicated, block: B:194:0x026e  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:224:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:226:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:232:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:235:0x030a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0318  */
    /* JADX WARN: Code duplicated, block: B:238:0x031f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0323  */
    /* JADX WARN: Code duplicated, block: B:241:0x032a  */
    /* JADX WARN: Code duplicated, block: B:243:0x032e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0335  */
    /* JADX WARN: Code duplicated, block: B:246:0x0339  */
    /* JADX WARN: Code duplicated, block: B:247:0x033c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0342  */
    /* JADX WARN: Code duplicated, block: B:250:0x0345  */
    /* JADX WARN: Code duplicated, block: B:252:0x034b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0352  */
    /* JADX WARN: Code duplicated, block: B:256:0x0358  */
    /* JADX WARN: Code duplicated, block: B:257:0x036c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0376  */
    /* JADX WARN: Code duplicated, block: B:262:0x0389  */
    /* JADX WARN: Code duplicated, block: B:265:0x0395  */
    /* JADX WARN: Code duplicated, block: B:268:0x03de  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:275:0x0411  */
    /* JADX WARN: Code duplicated, block: B:277:0x041f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0483  */
    /* JADX WARN: Code duplicated, block: B:282:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:285:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void k(@NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable q3 q3Var, float f10, float f11, @Nullable androidx.compose.ui.graphics.q3 q3Var2, long j10, long j11, float f12, float f13, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable pj.n<? super f10, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, long j12, long j13, @NotNull final pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        q3 q3Var3;
        int i14;
        float fM;
        int i15;
        int i16;
        int i17;
        float fL;
        int i18;
        androidx.compose.ui.graphics.q3 q3VarH;
        long jF;
        long jG;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z11;
        final androidx.compose.ui.a0 a0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        final pj.n<? super f10, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        final long j14;
        final long j15;
        final float f14;
        final float f15;
        final androidx.compose.ui.graphics.q3 q3Var4;
        final long j16;
        final q3 q3Var5;
        final long j17;
        final float f16;
        final float f17;
        final boolean z12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        q3 q3VarW;
        float fR;
        float fG;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2B;
        boolean z13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        pj.n<? super f10, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarC;
        long jM0;
        long j18;
        long j19;
        int i37;
        androidx.compose.ui.a0 a0Var4;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        int i38;
        int i39;
        int i40;
        int i41;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(920075480);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i42 = i12 & 2;
        if (i42 == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    q3Var3 = q3Var;
                    int i43 = c0VarR.D(q3Var3) ? 256 : 128;
                    i13 |= i43;
                } else {
                    q3Var3 = q3Var;
                }
                i13 |= i43;
            } else {
                q3Var3 = q3Var;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    fM = f10;
                    if (c0VarR.I(fM)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                i17 = 8192;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        fL = f11;
                        if (c0VarR.I(fL)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i13 |= i18;
                    }
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        q3VarH = q3Var2;
                        if ((i12 & 32) == 0 || !c0VarR.D(q3VarH)) {
                            i41 = 65536;
                        } else {
                            i41 = 131072;
                        }
                        i13 |= i41;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i10 & 1572864) == 0) {
                        jF = j10;
                        if ((i12 & 64) == 0 || !c0VarR.L(jF)) {
                            i40 = 524288;
                        } else {
                            i40 = 1048576;
                        }
                        i13 |= i40;
                    } else {
                        jF = j10;
                    }
                    if ((i10 & 12582912) == 0) {
                        jG = j11;
                        if ((i12 & 128) == 0 || !c0VarR.L(jG)) {
                            i39 = 4194304;
                        } else {
                            i39 = 8388608;
                        }
                        i13 |= i39;
                    } else {
                        jG = j11;
                    }
                    i19 = i12 & 256;
                    if (i19 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.I(f13)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 1024;
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
                        i26 = i12 & 2048;
                        if (i26 != 0) {
                            i24 |= 48;
                        } else if ((i11 & 48) != 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        i28 = i24;
                        i29 = i12 & 4096;
                        if (i29 != 0) {
                            i31 = i28 | androidx.media3.exoplayer.a5.S0;
                        } else {
                            i30 = i28;
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if (c0VarR.k0(function3)) {
                                    i32 = 256;
                                } else {
                                    i32 = 128;
                                }
                                i30 |= i32;
                            }
                            i31 = i30;
                        }
                        i33 = i12 & 8192;
                        if (i33 != 0) {
                            i35 = i31 | 3072;
                        } else {
                            i34 = i31;
                            if ((i11 & 3072) == 0) {
                                i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                            } else {
                                i35 = i34;
                            }
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0 && c0VarR.L(j12)) {
                                i17 = 16384;
                            }
                            i35 |= i17;
                        }
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                            if ((i12 & 32768) == 0 || !c0VarR.L(j13)) {
                                i38 = 65536;
                            } else {
                                i38 = 131072;
                            }
                            i35 |= i38;
                        }
                        if ((i12 & 65536) != 0) {
                            i35 |= 1572864;
                        } else if ((i11 & 1572864) == 0) {
                            if (c0VarR.k0(nVar3)) {
                                i36 = 1048576;
                            } else {
                                i36 = 524288;
                            }
                            i35 |= i36;
                        }
                        if ((306783379 & i13) == 306783378 || (i35 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i42 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if ((i12 & 4) != 0) {
                                    q3VarW = w(null, null, c0VarR, 0, 3);
                                    i13 &= -897;
                                } else {
                                    q3VarW = q3Var3;
                                }
                                if (i14 != 0) {
                                    fM = x2.f34346a.m();
                                }
                                if (i16 != 0) {
                                    fL = x2.f34346a.l();
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarH = x2.f34346a.h(c0VarR, 6);
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    jF = x2.f34346a.f(c0VarR, 6);
                                    i13 &= -3670017;
                                }
                                if ((i12 & 128) != 0) {
                                    jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                }
                                if (i19 != 0) {
                                    fR = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    fR = f12;
                                }
                                if (i21 != 0) {
                                    fG = x2.f34346a.g();
                                } else {
                                    fG = f13;
                                }
                                if (i23 != 0) {
                                    function2B = q6.f32119a.b();
                                } else {
                                    function2B = function2;
                                }
                                if (i26 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i29 != 0) {
                                    function6 = null;
                                } else {
                                    function6 = function3;
                                }
                                if (i33 != 0) {
                                    nVarC = q6.f32119a.c();
                                } else {
                                    nVarC = nVar2;
                                }
                                if ((i12 & 16384) != 0) {
                                    i35 &= -57345;
                                    jM0 = pj.f31758a.a(c0VarR, 6).M0();
                                } else {
                                    jM0 = j12;
                                }
                                if ((32768 & i12) != 0) {
                                    long jG2 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                    i35 &= -458753;
                                    j18 = jG2;
                                } else {
                                    j18 = j13;
                                }
                                j19 = jM0;
                                i37 = i35;
                                a0Var4 = a0Var3;
                            } else {
                                c0VarR.u();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 128) != 0) {
                                    i13 &= -29360129;
                                }
                                if ((i12 & 16384) != 0) {
                                    i35 &= -57345;
                                }
                                if ((32768 & i12) != 0) {
                                    i35 &= -458753;
                                }
                                a0Var4 = a0Var;
                                fG = f13;
                                function2B = function2;
                                z13 = z10;
                                function6 = function3;
                                nVarC = nVar2;
                                j19 = j12;
                                j18 = j13;
                                q3VarW = q3Var3;
                                i37 = i35;
                                fR = f12;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                            }
                            long j20 = j19;
                            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j20, null, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
                            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                            androidx.compose.ui.a0 a0Var5 = a0Var4;
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
                            function2B2 = aVar.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B2);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f14 = fM;
                            f15 = fL;
                            q3Var5 = q3VarW;
                            q3Var4 = q3VarH;
                            j16 = jF;
                            f16 = fR;
                            f17 = fG;
                            j17 = jG;
                            nVar4 = nVarC;
                            j14 = j20;
                            function4 = function2B;
                            function5 = function6;
                            z12 = z13;
                            a0Var2 = a0Var5;
                            j15 = j18;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            function4 = function2;
                            nVar4 = nVar2;
                            j14 = j12;
                            j15 = j13;
                            f14 = fM;
                            f15 = fL;
                            q3Var4 = q3VarH;
                            j16 = jF;
                            q3Var5 = q3Var3;
                            j17 = jG;
                            f16 = f12;
                            f17 = f13;
                            z12 = z10;
                            function5 = function3;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i23 = i12 & 1024;
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
                    i26 = i12 & 2048;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i12 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | androidx.media3.exoplayer.a5.S0;
                    } else {
                        i30 = i28;
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if (c0VarR.k0(function3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i12 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i11 & 3072) == 0) {
                            i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i35 |= i17;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i35 |= i38;
                    }
                    if ((i12 & 65536) != 0) {
                        i35 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(nVar3)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i35 |= i36;
                    }
                    if ((306783379 & i13) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG3 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG3;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        } else {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG4 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG4;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                        }
                        long j21 = j19;
                        androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j21, null, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarD2);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var6 = a0Var4;
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
                        function2B2 = aVar2.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
                        androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f14 = fM;
                        f15 = fL;
                        q3Var5 = q3VarW;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        f16 = fR;
                        f17 = fG;
                        j17 = jG;
                        nVar4 = nVarC;
                        j14 = j21;
                        function4 = function2B;
                        function5 = function6;
                        z12 = z13;
                        a0Var2 = a0Var6;
                        j15 = j18;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        function4 = function2;
                        nVar4 = nVar2;
                        j14 = j12;
                        j15 = j13;
                        f14 = fM;
                        f15 = fL;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        q3Var5 = q3Var3;
                        j17 = jG;
                        f16 = f12;
                        f17 = f13;
                        z12 = z10;
                        function5 = function3;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                fL = f11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarH = q3Var2;
                    if ((i12 & 32) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i13 |= i41;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i10 & 1572864) == 0) {
                    jF = j10;
                    if ((i12 & 64) == 0) {
                        i40 = 524288;
                    } else {
                        i40 = 524288;
                    }
                    i13 |= i40;
                } else {
                    jF = j10;
                }
                if ((i10 & 12582912) == 0) {
                    jG = j11;
                    if ((i12 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i13 |= i39;
                } else {
                    jG = j11;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f13)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
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
                    i26 = i12 & 2048;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i12 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | androidx.media3.exoplayer.a5.S0;
                    } else {
                        i30 = i28;
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if (c0VarR.k0(function3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i12 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i11 & 3072) == 0) {
                            i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i35 |= i17;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i35 |= i38;
                    }
                    if ((i12 & 65536) != 0) {
                        i35 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(nVar3)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i35 |= i36;
                    }
                    if ((306783379 & i13) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG5 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG5;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        } else {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG6 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG6;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                        }
                        long j22 = j19;
                        androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j22, null, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarD3);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
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
                        function2B2 = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                        androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f14 = fM;
                        f15 = fL;
                        q3Var5 = q3VarW;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        f16 = fR;
                        f17 = fG;
                        j17 = jG;
                        nVar4 = nVarC;
                        j14 = j22;
                        function4 = function2B;
                        function5 = function6;
                        z12 = z13;
                        a0Var2 = a0Var7;
                        j15 = j18;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        function4 = function2;
                        nVar4 = nVar2;
                        j14 = j12;
                        j15 = j13;
                        f14 = fM;
                        f15 = fL;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        q3Var5 = q3Var3;
                        j17 = jG;
                        f16 = f12;
                        f17 = f13;
                        z12 = z10;
                        function5 = function3;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 1024;
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
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i12 & 4096;
                if (i29 != 0) {
                    i31 = i28 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i30 = i28;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.k0(function3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i11 & 3072) == 0) {
                        i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i35 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i35 |= i38;
                }
                if ((i12 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i35 |= i36;
                }
                if ((306783379 & i13) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG7 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG7;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    } else {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG8 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG8;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                    }
                    long j23 = j19;
                    androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j23, null, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarD4);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var8 = a0Var4;
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
                    function2B2 = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = fM;
                    f15 = fL;
                    q3Var5 = q3VarW;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    f16 = fR;
                    f17 = fG;
                    j17 = jG;
                    nVar4 = nVarC;
                    j14 = j23;
                    function4 = function2B;
                    function5 = function6;
                    z12 = z13;
                    a0Var2 = a0Var8;
                    j15 = j18;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    function4 = function2;
                    nVar4 = nVar2;
                    j14 = j12;
                    j15 = j13;
                    f14 = fM;
                    f15 = fL;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    q3Var5 = q3Var3;
                    j17 = jG;
                    f16 = f12;
                    f17 = f13;
                    z12 = z10;
                    function5 = function3;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            fM = f10;
            i16 = i12 & 16;
            i17 = 8192;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    fL = f11;
                    if (c0VarR.I(fL)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarH = q3Var2;
                    if ((i12 & 32) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i13 |= i41;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i10 & 1572864) == 0) {
                    jF = j10;
                    if ((i12 & 64) == 0) {
                        i40 = 524288;
                    } else {
                        i40 = 524288;
                    }
                    i13 |= i40;
                } else {
                    jF = j10;
                }
                if ((i10 & 12582912) == 0) {
                    jG = j11;
                    if ((i12 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i13 |= i39;
                } else {
                    jG = j11;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f13)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
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
                    i26 = i12 & 2048;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i12 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | androidx.media3.exoplayer.a5.S0;
                    } else {
                        i30 = i28;
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if (c0VarR.k0(function3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i12 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i11 & 3072) == 0) {
                            i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i35 |= i17;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i35 |= i38;
                    }
                    if ((i12 & 65536) != 0) {
                        i35 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(nVar3)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i35 |= i36;
                    }
                    if ((306783379 & i13) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG9 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG9;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        } else {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG10 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG10;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                        }
                        long j24 = j19;
                        androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j24, null, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarD5);
                        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
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
                        function2B2 = aVar5.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                        androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f14 = fM;
                        f15 = fL;
                        q3Var5 = q3VarW;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        f16 = fR;
                        f17 = fG;
                        j17 = jG;
                        nVar4 = nVarC;
                        j14 = j24;
                        function4 = function2B;
                        function5 = function6;
                        z12 = z13;
                        a0Var2 = a0Var9;
                        j15 = j18;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        function4 = function2;
                        nVar4 = nVar2;
                        j14 = j12;
                        j15 = j13;
                        f14 = fM;
                        f15 = fL;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        q3Var5 = q3Var3;
                        j17 = jG;
                        f16 = f12;
                        f17 = f13;
                        z12 = z10;
                        function5 = function3;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 1024;
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
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i12 & 4096;
                if (i29 != 0) {
                    i31 = i28 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i30 = i28;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.k0(function3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i11 & 3072) == 0) {
                        i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i35 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i35 |= i38;
                }
                if ((i12 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i35 |= i36;
                }
                if ((306783379 & i13) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG11 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG11;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    } else {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG12 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG12;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                    }
                    long j25 = j19;
                    androidx.compose.ui.a0 a0VarD6 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j25, null, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarD6);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var10 = a0Var4;
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
                    function2B2 = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                    androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = fM;
                    f15 = fL;
                    q3Var5 = q3VarW;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    f16 = fR;
                    f17 = fG;
                    j17 = jG;
                    nVar4 = nVarC;
                    j14 = j25;
                    function4 = function2B;
                    function5 = function6;
                    z12 = z13;
                    a0Var2 = a0Var10;
                    j15 = j18;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    function4 = function2;
                    nVar4 = nVar2;
                    j14 = j12;
                    j15 = j13;
                    f14 = fM;
                    f15 = fL;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    q3Var5 = q3Var3;
                    j17 = jG;
                    f16 = f12;
                    f17 = f13;
                    z12 = z10;
                    function5 = function3;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            fL = f11;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarH = q3Var2;
                if ((i12 & 32) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i13 |= i41;
            } else {
                q3VarH = q3Var2;
            }
            if ((i10 & 1572864) == 0) {
                jF = j10;
                if ((i12 & 64) == 0) {
                    i40 = 524288;
                } else {
                    i40 = 524288;
                }
                i13 |= i40;
            } else {
                jF = j10;
            }
            if ((i10 & 12582912) == 0) {
                jG = j11;
                if ((i12 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i13 |= i39;
            } else {
                jG = j11;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f13)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
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
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i12 & 4096;
                if (i29 != 0) {
                    i31 = i28 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i30 = i28;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.k0(function3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i11 & 3072) == 0) {
                        i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i35 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i35 |= i38;
                }
                if ((i12 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i35 |= i36;
                }
                if ((306783379 & i13) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG13 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG13;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    } else {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG14 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG14;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                    }
                    long j26 = j19;
                    androidx.compose.ui.a0 a0VarD7 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j26, null, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarD7);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
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
                    function2B2 = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                    androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = fM;
                    f15 = fL;
                    q3Var5 = q3VarW;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    f16 = fR;
                    f17 = fG;
                    j17 = jG;
                    nVar4 = nVarC;
                    j14 = j26;
                    function4 = function2B;
                    function5 = function6;
                    z12 = z13;
                    a0Var2 = a0Var11;
                    j15 = j18;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    function4 = function2;
                    nVar4 = nVar2;
                    j14 = j12;
                    j15 = j13;
                    f14 = fM;
                    f15 = fL;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    q3Var5 = q3Var3;
                    j17 = jG;
                    f16 = f12;
                    f17 = f13;
                    z12 = z10;
                    function5 = function3;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 1024;
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
            i26 = i12 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.G(z10)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i12 & 4096;
            if (i29 != 0) {
                i31 = i28 | androidx.media3.exoplayer.a5.S0;
            } else {
                i30 = i28;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.k0(function3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i12 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i11 & 3072) == 0) {
                    i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i35 |= i17;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i35 |= i38;
            }
            if ((i12 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i35 |= i36;
            }
            if ((306783379 & i13) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG15 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG15;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                } else {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG16 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG16;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                }
                long j27 = j19;
                androidx.compose.ui.a0 a0VarD8 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j27, null, 2, null);
                androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarD8);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var12 = a0Var4;
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
                function2B2 = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
                androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f14 = fM;
                f15 = fL;
                q3Var5 = q3VarW;
                q3Var4 = q3VarH;
                j16 = jF;
                f16 = fR;
                f17 = fG;
                j17 = jG;
                nVar4 = nVarC;
                j14 = j27;
                function4 = function2B;
                function5 = function6;
                z12 = z13;
                a0Var2 = a0Var12;
                j15 = j18;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                function4 = function2;
                nVar4 = nVar2;
                j14 = j12;
                j15 = j13;
                f14 = fM;
                f15 = fL;
                q3Var4 = q3VarH;
                j16 = jF;
                q3Var5 = q3Var3;
                j17 = jG;
                f16 = f12;
                f17 = f13;
                z12 = z10;
                function5 = function3;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                q3Var3 = q3Var;
                if (c0VarR.D(q3Var3)) {
                }
                i13 |= i43;
            } else {
                q3Var3 = q3Var;
            }
            i13 |= i43;
        } else {
            q3Var3 = q3Var;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                fM = f10;
                if (c0VarR.I(fM)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            i17 = 8192;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    fL = f11;
                    if (c0VarR.I(fL)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarH = q3Var2;
                    if ((i12 & 32) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i13 |= i41;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i10 & 1572864) == 0) {
                    jF = j10;
                    if ((i12 & 64) == 0) {
                        i40 = 524288;
                    } else {
                        i40 = 524288;
                    }
                    i13 |= i40;
                } else {
                    jF = j10;
                }
                if ((i10 & 12582912) == 0) {
                    jG = j11;
                    if ((i12 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i13 |= i39;
                } else {
                    jG = j11;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.I(f13)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
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
                    i26 = i12 & 2048;
                    if (i26 != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    i28 = i24;
                    i29 = i12 & 4096;
                    if (i29 != 0) {
                        i31 = i28 | androidx.media3.exoplayer.a5.S0;
                    } else {
                        i30 = i28;
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if (c0VarR.k0(function3)) {
                                i32 = 256;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i31 = i30;
                    }
                    i33 = i12 & 8192;
                    if (i33 != 0) {
                        i35 = i31 | 3072;
                    } else {
                        i34 = i31;
                        if ((i11 & 3072) == 0) {
                            i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                        } else {
                            i35 = i34;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i35 |= i17;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i35 |= i38;
                    }
                    if ((i12 & 65536) != 0) {
                        i35 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(nVar3)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i35 |= i36;
                    }
                    if ((306783379 & i13) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG17 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG17;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        } else {
                            if (i42 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                q3VarW = w(null, null, c0VarR, 0, 3);
                                i13 &= -897;
                            } else {
                                q3VarW = q3Var3;
                            }
                            if (i14 != 0) {
                                fM = x2.f34346a.m();
                            }
                            if (i16 != 0) {
                                fL = x2.f34346a.l();
                            }
                            if ((i12 & 32) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f12;
                            }
                            if (i21 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f13;
                            }
                            if (i23 != 0) {
                                function2B = q6.f32119a.b();
                            } else {
                                function2B = function2;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            if (i33 != 0) {
                                nVarC = q6.f32119a.c();
                            } else {
                                nVarC = nVar2;
                            }
                            if ((i12 & 16384) != 0) {
                                i35 &= -57345;
                                jM0 = pj.f31758a.a(c0VarR, 6).M0();
                            } else {
                                jM0 = j12;
                            }
                            if ((32768 & i12) != 0) {
                                long jG18 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                                i35 &= -458753;
                                j18 = jG18;
                            } else {
                                j18 = j13;
                            }
                            j19 = jM0;
                            i37 = i35;
                            a0Var4 = a0Var3;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                        }
                        long j28 = j19;
                        androidx.compose.ui.a0 a0VarD9 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j28, null, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarD9);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var13 = a0Var4;
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
                        function2B2 = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar9.f());
                        androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f14 = fM;
                        f15 = fL;
                        q3Var5 = q3VarW;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        f16 = fR;
                        f17 = fG;
                        j17 = jG;
                        nVar4 = nVarC;
                        j14 = j28;
                        function4 = function2B;
                        function5 = function6;
                        z12 = z13;
                        a0Var2 = a0Var13;
                        j15 = j18;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        function4 = function2;
                        nVar4 = nVar2;
                        j14 = j12;
                        j15 = j13;
                        f14 = fM;
                        f15 = fL;
                        q3Var4 = q3VarH;
                        j16 = jF;
                        q3Var5 = q3Var3;
                        j17 = jG;
                        f16 = f12;
                        f17 = f13;
                        z12 = z10;
                        function5 = function3;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i23 = i12 & 1024;
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
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i12 & 4096;
                if (i29 != 0) {
                    i31 = i28 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i30 = i28;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.k0(function3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i11 & 3072) == 0) {
                        i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i35 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i35 |= i38;
                }
                if ((i12 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i35 |= i36;
                }
                if ((306783379 & i13) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG19 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG19;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    } else {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG110 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG110;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                    }
                    long j29 = j19;
                    androidx.compose.ui.a0 a0VarD10 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j29, null, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarD10);
                    androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var14 = a0Var4;
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
                    function2B2 = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar10.f());
                    androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = fM;
                    f15 = fL;
                    q3Var5 = q3VarW;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    f16 = fR;
                    f17 = fG;
                    j17 = jG;
                    nVar4 = nVarC;
                    j14 = j29;
                    function4 = function2B;
                    function5 = function6;
                    z12 = z13;
                    a0Var2 = a0Var14;
                    j15 = j18;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    function4 = function2;
                    nVar4 = nVar2;
                    j14 = j12;
                    j15 = j13;
                    f14 = fM;
                    f15 = fL;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    q3Var5 = q3Var3;
                    j17 = jG;
                    f16 = f12;
                    f17 = f13;
                    z12 = z10;
                    function5 = function3;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            fL = f11;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarH = q3Var2;
                if ((i12 & 32) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i13 |= i41;
            } else {
                q3VarH = q3Var2;
            }
            if ((i10 & 1572864) == 0) {
                jF = j10;
                if ((i12 & 64) == 0) {
                    i40 = 524288;
                } else {
                    i40 = 524288;
                }
                i13 |= i40;
            } else {
                jF = j10;
            }
            if ((i10 & 12582912) == 0) {
                jG = j11;
                if ((i12 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i13 |= i39;
            } else {
                jG = j11;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f13)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
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
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i12 & 4096;
                if (i29 != 0) {
                    i31 = i28 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i30 = i28;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.k0(function3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i11 & 3072) == 0) {
                        i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i35 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i35 |= i38;
                }
                if ((i12 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i35 |= i36;
                }
                if ((306783379 & i13) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG111 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG111;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    } else {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG112 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG112;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                    }
                    long j210 = j19;
                    androidx.compose.ui.a0 a0VarD11 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j210, null, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarD11);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var15 = a0Var4;
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
                    function2B2 = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar11.f());
                    androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = fM;
                    f15 = fL;
                    q3Var5 = q3VarW;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    f16 = fR;
                    f17 = fG;
                    j17 = jG;
                    nVar4 = nVarC;
                    j14 = j210;
                    function4 = function2B;
                    function5 = function6;
                    z12 = z13;
                    a0Var2 = a0Var15;
                    j15 = j18;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    function4 = function2;
                    nVar4 = nVar2;
                    j14 = j12;
                    j15 = j13;
                    f14 = fM;
                    f15 = fL;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    q3Var5 = q3Var3;
                    j17 = jG;
                    f16 = f12;
                    f17 = f13;
                    z12 = z10;
                    function5 = function3;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 1024;
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
            i26 = i12 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.G(z10)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i12 & 4096;
            if (i29 != 0) {
                i31 = i28 | androidx.media3.exoplayer.a5.S0;
            } else {
                i30 = i28;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.k0(function3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i12 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i11 & 3072) == 0) {
                    i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i35 |= i17;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i35 |= i38;
            }
            if ((i12 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i35 |= i36;
            }
            if ((306783379 & i13) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG113 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG113;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                } else {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG114 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG114;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                }
                long j211 = j19;
                androidx.compose.ui.a0 a0VarD12 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j211, null, 2, null);
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarD12);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var16 = a0Var4;
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
                function2B2 = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar12.f());
                androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f14 = fM;
                f15 = fL;
                q3Var5 = q3VarW;
                q3Var4 = q3VarH;
                j16 = jF;
                f16 = fR;
                f17 = fG;
                j17 = jG;
                nVar4 = nVarC;
                j14 = j211;
                function4 = function2B;
                function5 = function6;
                z12 = z13;
                a0Var2 = a0Var16;
                j15 = j18;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                function4 = function2;
                nVar4 = nVar2;
                j14 = j12;
                j15 = j13;
                f14 = fM;
                f15 = fL;
                q3Var4 = q3VarH;
                j16 = jF;
                q3Var5 = q3Var3;
                j17 = jG;
                f16 = f12;
                f17 = f13;
                z12 = z10;
                function5 = function3;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        fM = f10;
        i16 = i12 & 16;
        i17 = 8192;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                fL = f11;
                if (c0VarR.I(fL)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i13 |= i18;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarH = q3Var2;
                if ((i12 & 32) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i13 |= i41;
            } else {
                q3VarH = q3Var2;
            }
            if ((i10 & 1572864) == 0) {
                jF = j10;
                if ((i12 & 64) == 0) {
                    i40 = 524288;
                } else {
                    i40 = 524288;
                }
                i13 |= i40;
            } else {
                jF = j10;
            }
            if ((i10 & 12582912) == 0) {
                jG = j11;
                if ((i12 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i13 |= i39;
            } else {
                jG = j11;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.I(f13)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
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
                i26 = i12 & 2048;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                i28 = i24;
                i29 = i12 & 4096;
                if (i29 != 0) {
                    i31 = i28 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i30 = i28;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.k0(function3)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i31 = i30;
                }
                i33 = i12 & 8192;
                if (i33 != 0) {
                    i35 = i31 | 3072;
                } else {
                    i34 = i31;
                    if ((i11 & 3072) == 0) {
                        i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                    } else {
                        i35 = i34;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i35 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i35 |= i38;
                }
                if ((i12 & 65536) != 0) {
                    i35 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(nVar3)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i35 |= i36;
                }
                if ((306783379 & i13) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG115 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG115;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    } else {
                        if (i42 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            q3VarW = w(null, null, c0VarR, 0, 3);
                            i13 &= -897;
                        } else {
                            q3VarW = q3Var3;
                        }
                        if (i14 != 0) {
                            fM = x2.f34346a.m();
                        }
                        if (i16 != 0) {
                            fL = x2.f34346a.l();
                        }
                        if ((i12 & 32) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f12;
                        }
                        if (i21 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f13;
                        }
                        if (i23 != 0) {
                            function2B = q6.f32119a.b();
                        } else {
                            function2B = function2;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i33 != 0) {
                            nVarC = q6.f32119a.c();
                        } else {
                            nVarC = nVar2;
                        }
                        if ((i12 & 16384) != 0) {
                            i35 &= -57345;
                            jM0 = pj.f31758a.a(c0VarR, 6).M0();
                        } else {
                            jM0 = j12;
                        }
                        if ((32768 & i12) != 0) {
                            long jG116 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                            i35 &= -458753;
                            j18 = jG116;
                        } else {
                            j18 = j13;
                        }
                        j19 = jM0;
                        i37 = i35;
                        a0Var4 = a0Var3;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                    }
                    long j212 = j19;
                    androidx.compose.ui.a0 a0VarD13 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j212, null, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarD13);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var17 = a0Var4;
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
                    function2B2 = aVar13.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar13.f());
                    androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = fM;
                    f15 = fL;
                    q3Var5 = q3VarW;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    f16 = fR;
                    f17 = fG;
                    j17 = jG;
                    nVar4 = nVarC;
                    j14 = j212;
                    function4 = function2B;
                    function5 = function6;
                    z12 = z13;
                    a0Var2 = a0Var17;
                    j15 = j18;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    function4 = function2;
                    nVar4 = nVar2;
                    j14 = j12;
                    j15 = j13;
                    f14 = fM;
                    f15 = fL;
                    q3Var4 = q3VarH;
                    j16 = jF;
                    q3Var5 = q3Var3;
                    j17 = jG;
                    f16 = f12;
                    f17 = f13;
                    z12 = z10;
                    function5 = function3;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i23 = i12 & 1024;
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
            i26 = i12 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.G(z10)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i12 & 4096;
            if (i29 != 0) {
                i31 = i28 | androidx.media3.exoplayer.a5.S0;
            } else {
                i30 = i28;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.k0(function3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i12 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i11 & 3072) == 0) {
                    i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i35 |= i17;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i35 |= i38;
            }
            if ((i12 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i35 |= i36;
            }
            if ((306783379 & i13) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG117 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG117;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                } else {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG118 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG118;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                }
                long j213 = j19;
                androidx.compose.ui.a0 a0VarD14 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j213, null, 2, null);
                androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarD14);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var18 = a0Var4;
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
                function2B2 = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar14.f());
                androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f14 = fM;
                f15 = fL;
                q3Var5 = q3VarW;
                q3Var4 = q3VarH;
                j16 = jF;
                f16 = fR;
                f17 = fG;
                j17 = jG;
                nVar4 = nVarC;
                j14 = j213;
                function4 = function2B;
                function5 = function6;
                z12 = z13;
                a0Var2 = a0Var18;
                j15 = j18;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                function4 = function2;
                nVar4 = nVar2;
                j14 = j12;
                j15 = j13;
                f14 = fM;
                f15 = fL;
                q3Var4 = q3VarH;
                j16 = jF;
                q3Var5 = q3Var3;
                j17 = jG;
                f16 = f12;
                f17 = f13;
                z12 = z10;
                function5 = function3;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        fL = f11;
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            q3VarH = q3Var2;
            if ((i12 & 32) == 0) {
                i41 = 65536;
            } else {
                i41 = 65536;
            }
            i13 |= i41;
        } else {
            q3VarH = q3Var2;
        }
        if ((i10 & 1572864) == 0) {
            jF = j10;
            if ((i12 & 64) == 0) {
                i40 = 524288;
            } else {
                i40 = 524288;
            }
            i13 |= i40;
        } else {
            jF = j10;
        }
        if ((i10 & 12582912) == 0) {
            jG = j11;
            if ((i12 & 128) == 0) {
                i39 = 4194304;
            } else {
                i39 = 4194304;
            }
            i13 |= i39;
        } else {
            jG = j11;
        }
        i19 = i12 & 256;
        if (i19 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.I(f12)) {
                i20 = 67108864;
            } else {
                i20 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i20;
        }
        i21 = i12 & 512;
        if (i21 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.I(f13)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 1024;
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
            i26 = i12 & 2048;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.G(z10)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            i28 = i24;
            i29 = i12 & 4096;
            if (i29 != 0) {
                i31 = i28 | androidx.media3.exoplayer.a5.S0;
            } else {
                i30 = i28;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.k0(function3)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i31 = i30;
            }
            i33 = i12 & 8192;
            if (i33 != 0) {
                i35 = i31 | 3072;
            } else {
                i34 = i31;
                if ((i11 & 3072) == 0) {
                    i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
                } else {
                    i35 = i34;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i35 |= i17;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i35 |= i38;
            }
            if ((i12 & 65536) != 0) {
                i35 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(nVar3)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i35 |= i36;
            }
            if ((306783379 & i13) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG119 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG119;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                } else {
                    if (i42 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        q3VarW = w(null, null, c0VarR, 0, 3);
                        i13 &= -897;
                    } else {
                        q3VarW = q3Var3;
                    }
                    if (i14 != 0) {
                        fM = x2.f34346a.m();
                    }
                    if (i16 != 0) {
                        fL = x2.f34346a.l();
                    }
                    if ((i12 & 32) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f12;
                    }
                    if (i21 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f13;
                    }
                    if (i23 != 0) {
                        function2B = q6.f32119a.b();
                    } else {
                        function2B = function2;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i33 != 0) {
                        nVarC = q6.f32119a.c();
                    } else {
                        nVarC = nVar2;
                    }
                    if ((i12 & 16384) != 0) {
                        i35 &= -57345;
                        jM0 = pj.f31758a.a(c0VarR, 6).M0();
                    } else {
                        jM0 = j12;
                    }
                    if ((32768 & i12) != 0) {
                        long jG1110 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                        i35 &= -458753;
                        j18 = jG1110;
                    } else {
                        j18 = j13;
                    }
                    j19 = jM0;
                    i37 = i35;
                    a0Var4 = a0Var3;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                }
                long j214 = j19;
                androidx.compose.ui.a0 a0VarD15 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j214, null, 2, null);
                androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarD15);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var19 = a0Var4;
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
                function2B2 = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar15.f());
                androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f14 = fM;
                f15 = fL;
                q3Var5 = q3VarW;
                q3Var4 = q3VarH;
                j16 = jF;
                f16 = fR;
                f17 = fG;
                j17 = jG;
                nVar4 = nVarC;
                j14 = j214;
                function4 = function2B;
                function5 = function6;
                z12 = z13;
                a0Var2 = a0Var19;
                j15 = j18;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                function4 = function2;
                nVar4 = nVar2;
                j14 = j12;
                j15 = j13;
                f14 = fM;
                f15 = fL;
                q3Var4 = q3VarH;
                j16 = jF;
                q3Var5 = q3Var3;
                j17 = jG;
                f16 = f12;
                f17 = f13;
                z12 = z10;
                function5 = function3;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i23 = i12 & 1024;
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
        i26 = i12 & 2048;
        if (i26 != 0) {
            i24 |= 48;
        } else if ((i11 & 48) != 0) {
            if (c0VarR.G(z10)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i24 |= i27;
        }
        i28 = i24;
        i29 = i12 & 4096;
        if (i29 != 0) {
            i31 = i28 | androidx.media3.exoplayer.a5.S0;
        } else {
            i30 = i28;
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if (c0VarR.k0(function3)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            i31 = i30;
        }
        i33 = i12 & 8192;
        if (i33 != 0) {
            i35 = i31 | 3072;
        } else {
            i34 = i31;
            if ((i11 & 3072) == 0) {
                i35 = i34 | (c0VarR.k0(nVar2) ? 2048 : 1024);
            } else {
                i35 = i34;
            }
        }
        if ((i11 & 24576) != 0) {
            if ((i12 & 16384) == 0) {
                i17 = 16384;
            }
            i35 |= i17;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) != 0) {
            if ((i12 & 32768) == 0) {
                i38 = 65536;
            } else {
                i38 = 65536;
            }
            i35 |= i38;
        }
        if ((i12 & 65536) != 0) {
            i35 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c0VarR.k0(nVar3)) {
                i36 = 1048576;
            } else {
                i36 = 524288;
            }
            i35 |= i36;
        }
        if ((306783379 & i13) == 306783378) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (c0VarR.h(z11, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i42 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i12 & 4) != 0) {
                    q3VarW = w(null, null, c0VarR, 0, 3);
                    i13 &= -897;
                } else {
                    q3VarW = q3Var3;
                }
                if (i14 != 0) {
                    fM = x2.f34346a.m();
                }
                if (i16 != 0) {
                    fL = x2.f34346a.l();
                }
                if ((i12 & 32) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i13 &= -3670017;
                }
                if ((i12 & 128) != 0) {
                    jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                    i13 &= -29360129;
                }
                if (i19 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f12;
                }
                if (i21 != 0) {
                    fG = x2.f34346a.g();
                } else {
                    fG = f13;
                }
                if (i23 != 0) {
                    function2B = q6.f32119a.b();
                } else {
                    function2B = function2;
                }
                if (i26 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i29 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i33 != 0) {
                    nVarC = q6.f32119a.c();
                } else {
                    nVarC = nVar2;
                }
                if ((i12 & 16384) != 0) {
                    i35 &= -57345;
                    jM0 = pj.f31758a.a(c0VarR, 6).M0();
                } else {
                    jM0 = j12;
                }
                if ((32768 & i12) != 0) {
                    long jG1111 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                    i35 &= -458753;
                    j18 = jG1111;
                } else {
                    j18 = j13;
                }
                j19 = jM0;
                i37 = i35;
                a0Var4 = a0Var3;
            } else {
                if (i42 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i12 & 4) != 0) {
                    q3VarW = w(null, null, c0VarR, 0, 3);
                    i13 &= -897;
                } else {
                    q3VarW = q3Var3;
                }
                if (i14 != 0) {
                    fM = x2.f34346a.m();
                }
                if (i16 != 0) {
                    fL = x2.f34346a.l();
                }
                if ((i12 & 32) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i13 &= -3670017;
                }
                if ((i12 & 128) != 0) {
                    jG = o6.g(jF, c0VarR, (i13 >> 18) & 14);
                    i13 &= -29360129;
                }
                if (i19 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f12;
                }
                if (i21 != 0) {
                    fG = x2.f34346a.g();
                } else {
                    fG = f13;
                }
                if (i23 != 0) {
                    function2B = q6.f32119a.b();
                } else {
                    function2B = function2;
                }
                if (i26 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i29 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i33 != 0) {
                    nVarC = q6.f32119a.c();
                } else {
                    nVarC = nVar2;
                }
                if ((i12 & 16384) != 0) {
                    i35 &= -57345;
                    jM0 = pj.f31758a.a(c0VarR, 6).M0();
                } else {
                    jM0 = j12;
                }
                if ((32768 & i12) != 0) {
                    long jG1112 = o6.g(jM0, c0VarR, (i35 >> 12) & 14);
                    i35 &= -458753;
                    j18 = jG1112;
                } else {
                    j18 = j13;
                }
                j19 = jM0;
                i37 = i35;
                a0Var4 = a0Var3;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(920075480, i13, i37, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
            }
            long j215 = j19;
            androidx.compose.ui.a0 a0VarD16 = androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), j215, null, 2, null);
            androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarD16);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            androidx.compose.ui.a0 a0Var110 = a0Var4;
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
            function2B2 = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B2);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar16.f());
            androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j18)), androidx.compose.runtime.internal.w.e(999829022, true, new a(q3VarW, function6, nVar3, fM, fL, z13, q3VarH, jF, jG, fR, fG, function2B, nVar, nVarC), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f14 = fM;
            f15 = fL;
            q3Var5 = q3VarW;
            q3Var4 = q3VarH;
            j16 = jF;
            f16 = fR;
            f17 = fG;
            j17 = jG;
            nVar4 = nVarC;
            j14 = j215;
            function4 = function2B;
            function5 = function6;
            z12 = z13;
            a0Var2 = a0Var110;
            j15 = j18;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            function4 = function2;
            nVar4 = nVar2;
            j14 = j12;
            j15 = j13;
            f14 = fM;
            f15 = fL;
            q3Var4 = q3VarH;
            j16 = jF;
            q3Var5 = q3Var3;
            j17 = jG;
            f16 = f12;
            f17 = f13;
            z12 = z10;
            function5 = function3;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.f3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j3.n(nVar, a0Var2, q3Var5, f14, f15, q3Var4, j16, j17, f16, f17, function4, z12, function5, nVar4, j14, j15, nVar3, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_]]")
    public static final void l(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, final Function0<Float> function0, final tx txVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1217723575);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function5) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(txVar) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1217723575, i11, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:413)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2 == null ? q6.f32119a.a() : function2, function3, function4, function5});
            boolean z10 = ((458752 & i11) == 131072) | ((i11 & 57344) == 16384);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new b(txVar, function0);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.h1 h1Var = (androidx.compose.ui.layout.h1) objI0;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = androidx.compose.ui.layout.n0.e(listListOf);
            boolean zD = c0VarR.D(h1Var);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = androidx.compose.ui.layout.j1.a(h1Var);
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI1;
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
            function2E.invoke(c0VarR, 0);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.h3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j3.m(function2, function3, function4, function5, function0, txVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function0 function0, tx txVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        l(function2, function3, function4, function5, function0, txVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(pj.n nVar, androidx.compose.ui.a0 a0Var, q3 q3Var, float f10, float f11, androidx.compose.ui.graphics.q3 q3Var2, long j10, long j11, float f12, float f13, Function2 function2, boolean z10, Function2 function3, pj.n nVar2, long j12, long j13, pj.n nVar3, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        k(nVar, a0Var, q3Var, f10, f11, q3Var2, j10, j11, f12, f13, function2, z10, function3, nVar2, j12, j13, nVar3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void o(final tx txVar, final float f10, final float f11, final boolean z10, final androidx.compose.ui.graphics.q3 q3Var, final long j10, final long j11, final float f12, final float f13, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0.a aVar;
        Object obj;
        androidx.compose.ui.a0 a0VarB;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2108849428);
        if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(txVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.I(f11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0VarR.D(q3Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0VarR.L(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0VarR.L(j11) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0VarR.I(f12) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0VarR.I(f13) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c0VarR.k0(function2) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.k0(nVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (c0VarR.h(((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2108849428, i12, i13, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:235)");
            }
            d0.h1 h1Var = d0.h1.DefaultSpatial;
            final androidx.compose.animation.core.y0 y0VarB = hm.b(h1Var, c0VarR, 6);
            final androidx.compose.animation.core.y0 y0VarB2 = hm.b(h1Var, c0VarR, 6);
            final androidx.compose.animation.core.y0 y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            int i14 = i12 & 14;
            boolean zK0 = (i14 == 4) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j3.t(txVar, y0VarB2, y0VarB3, y0VarB);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
            Object objI1 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI1 == aVar2.a()) {
                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI1;
            androidx.compose.foundation.gestures.q3 q3Var2 = androidx.compose.foundation.gestures.q3.Vertical;
            final float fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f10);
            if (z10) {
                c0VarR.E(2049456610);
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                boolean zD = c0VarR.D(txVar.q());
                aVar = aVar2;
                Object objI2 = c0VarR.i0();
                if (zD || objI2 == aVar.a()) {
                    objI2 = ix.f(txVar, q3Var2, new Function1() { // from class: androidx.compose.material3.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return j3.p(s0Var, txVar, ((Float) obj2).floatValue());
                        }
                    });
                    c0VarR.Y(objI2);
                }
                obj = null;
                a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar3, (androidx.compose.ui.input.nestedscroll.a) objI2, null, 2, null);
                c0VarR.A();
            } else {
                aVar = aVar2;
                obj = null;
                c0VarR.E(2049851798);
                c0VarR.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            int i15 = i12;
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.n(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(androidx.compose.ui.a0.E, 0.0f, f11, 1, obj), 0.0f, 1, obj), f10, 0.0f, 2, obj).B2(a0VarB);
            androidx.compose.material3.internal.d0<vx> d0VarQ = txVar.q();
            boolean zI = (i14 == 4) | c0VarR.I(fS7);
            Object objI3 = c0VarR.i0();
            if (zI || objI3 == aVar.a()) {
                objI3 = new Function2() { // from class: androidx.compose.material3.b3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return j3.q(txVar, fS7, (androidx.compose.ui.unit.u) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarB3 = B(androidx.compose.material3.internal.t.e(androidx.compose.material3.internal.t.h(a0VarB2, d0VarQ, q3Var2, (Function2) objI3), txVar.q(), q3Var2, z10, false, null, 24, null), txVar);
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(1508311921, true, new c(txVar, function2, nVar, s0Var, z10), c0VarR, 54);
            int i16 = i15 >> 9;
            c0Var2 = c0VarR;
            u10.c(a0VarB3, q3Var, j10, j11, f12, f13, null, cVarE, c0Var2, (i16 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752), 64);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return j3.s(txVar, f10, f11, z10, q3Var, j10, j11, f12, f13, function2, nVar, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(kotlinx.coroutines.s0 s0Var, tx txVar, float f10) {
        kotlinx.coroutines.k.f(s0Var, null, null, new d(txVar, f10, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x004e A[PHI: r7
      0x004e: PHI (r7v6 androidx.compose.material3.vx) = 
      (r7v5 androidx.compose.material3.vx)
      (r7v7 androidx.compose.material3.vx)
      (r7v9 androidx.compose.material3.vx)
      (r7v8 androidx.compose.material3.vx)
      (r7v10 androidx.compose.material3.vx)
      (r7v12 androidx.compose.material3.vx)
      (r7v11 androidx.compose.material3.vx)
     binds: [B:30:0x0095, B:20:0x0076, B:26:0x008a, B:24:0x0081, B:9:0x004c, B:15:0x0066, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Pair q(final tx txVar, final float f10, androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
        vx vxVar;
        final float fO = androidx.compose.ui.unit.b.o(bVar.x());
        final float fQ = (int) (uVar.q() & com.rabbitmq.client.k0.f265952a);
        androidx.compose.material3.internal.b2 b2VarA = androidx.compose.material3.internal.t.a(new Function1() { // from class: androidx.compose.material3.g3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j3.r(txVar, fO, f10, fQ, (androidx.compose.material3.internal.c2) obj);
            }
        });
        vx vxVarF = txVar.q().F();
        int i10 = e.f29638a[vxVarF.ordinal()];
        if (i10 != 1) {
            int i11 = 2 >> 2;
            if (i10 == 2) {
                vxVar = vx.PartiallyExpanded;
                if (b2VarA.d(vxVar)) {
                    vxVarF = vxVar;
                } else {
                    vxVar = vx.Expanded;
                    if (!b2VarA.d(vxVar)) {
                        vxVar = vx.Hidden;
                        if (b2VarA.d(vxVar)) {
                        }
                    }
                    vxVarF = vxVar;
                }
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                vxVar = vx.Expanded;
                if (b2VarA.d(vxVar)) {
                    vxVarF = vxVar;
                } else {
                    vxVar = vx.PartiallyExpanded;
                    if (!b2VarA.d(vxVar)) {
                        vxVar = vx.Hidden;
                        if (b2VarA.d(vxVar)) {
                        }
                    }
                    vxVarF = vxVar;
                }
            }
        } else {
            vxVar = vx.Hidden;
            if (b2VarA.d(vxVar)) {
                vxVarF = vxVar;
            }
        }
        return TuplesKt.to(b2VarA, vxVarF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(tx txVar, float f10, float f11, float f12, androidx.compose.material3.internal.c2 c2Var) {
        if (!txVar.z()) {
            c2Var.a(vx.PartiallyExpanded, f10 - f11);
        }
        if (f12 != f11) {
            c2Var.a(vx.Expanded, Math.max(f10 - f12, 0.0f));
        }
        if (!txVar.y()) {
            c2Var.a(vx.Hidden, f10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(tx txVar, float f10, float f11, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f12, float f13, Function2 function2, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(txVar, f10, f11, z10, q3Var, j10, j11, f12, f13, function2, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(tx txVar, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3) {
        txVar.J(y0Var);
        txVar.I(y0Var2);
        txVar.G(y0Var3);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public static final q3 w(@Nullable tx txVar, @Nullable f10 f10Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 1) != 0) {
            int i12 = 2 & 0;
            c0Var2 = c0Var;
            txVar = x(null, null, false, c0Var2, 0, 7);
        } else {
            c0Var2 = c0Var;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var2.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new f10();
                c0Var2.Y(objI0);
            }
            f10Var = (f10) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1474606134, i10, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var2.D(txVar)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.D(f10Var)) || (i10 & 48) == 32);
        Object objI1 = c0Var2.i0();
        if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new q3(txVar, f10Var);
            c0Var2.Y(objI1);
        }
        q3 q3Var = (q3) objI1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3Var;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public static final tx x(@Nullable vx vxVar, @Nullable Function1<? super vx, Boolean> function1, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            vxVar = vx.PartiallyExpanded;
        }
        vx vxVar2 = vxVar;
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.e3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(j3.y((vx) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        Function1<? super vx, Boolean> function2 = function1;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(678511581, i10, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:215)");
        }
        tx txVarK = ix.k(false, function2, vxVar2, z11, 0.0f, 0.0f, c0Var, (i10 & com.planner5d.library.engine.input.f.b.B) | ((i10 << 6) & 896) | ((i10 << 3) & 7168), 49);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return txVarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(vx vxVar) {
        return true;
    }

    @NotNull
    public static final androidx.compose.ui.a0 z(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final tx txVar) {
        return androidx.compose.ui.graphics.q1.a(a0Var, new Function1() { // from class: androidx.compose.material3.y2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j3.A(txVar, (androidx.compose.ui.graphics.r1) obj);
            }
        });
    }
}

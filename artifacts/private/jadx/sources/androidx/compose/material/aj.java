package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,489:1\n113#2:490\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n484#1:490\n*E\n"})
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f22090a = androidx.compose.ui.unit.h.r(90);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.o<Float> f22091b = androidx.compose.animation.core.p.t(250, 0, androidx.compose.animation.core.u0.d(), 2, null);

    static final class a implements pj.n<List<? extends ti>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22092a;

        a(int i10) {
            this.f22092a = i10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(List<ti> list, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-233732148, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:230)");
            }
            wi wiVar = wi.f25419a;
            wiVar.e(wiVar.j(androidx.compose.ui.a0.E, list.get(this.f22092a)), 0.0f, 0L, c0Var, 3072, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ti> list, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(list, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,489:1\n607#2:490\n604#2,6:491\n1282#3,3:497\n1285#3,3:501\n1282#3,6:504\n1282#3,6:510\n605#4:500\n34#5,6:516\n34#5,6:522\n34#5,6:528\n150#5,3:534\n34#5,6:537\n153#5:543\n34#5,6:544\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n*L\n238#1:490\n238#1:491,6\n238#1:497,3\n238#1:501,3\n240#1:504,6\n249#1:510,6\n238#1:500\n269#1:516,6\n277#1:522,6\n292#1:528,6\n255#1:534,3\n255#1:537,6\n255#1:543\n259#1:544,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f22093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<List<ti>, androidx.compose.runtime.c0, Integer, Unit> f22096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f22097e;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<List<ti>, androidx.compose.runtime.c0, Integer, Unit> f22098a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<ti> f22099b;

            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, List<ti> list) {
                this.f22098a = nVar;
                this.f22099b = list;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-43203918, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:290)");
                }
                this.f22098a.invoke(this.f22099b, c0Var, 0);
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
        b(float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10) {
            this.f22093a = f10;
            this.f22094b = function2;
            this.f22095c = function3;
            this.f22096d = nVar;
            this.f22097e = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 i(float f10, Function2 function2, final Function2 function3, final je jeVar, final int i10, final pj.n nVar, final androidx.compose.ui.layout.b3 b3Var, final androidx.compose.ui.unit.b bVar) {
            int iG6 = b3Var.g6(aj.f22090a);
            final int iG7 = b3Var.g6(f10);
            long jD = androidx.compose.ui.unit.b.d(bVar.x(), iG6, 0, 0, 0, 14, null);
            List<androidx.compose.ui.layout.z0> listS4 = b3Var.S4(fj.Tabs, function2);
            final ArrayList arrayList = new ArrayList(listS4.size());
            int size = listS4.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listS4.get(i11).P0(jD));
            }
            final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
            fVar.f312749a = iG7 * 2;
            final kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) arrayList.get(i12);
                fVar.f312749a += i2Var.h1();
                fVar2.f312749a = Math.max(fVar2.f312749a, i2Var.c1());
            }
            return androidx.compose.ui.layout.c1.h6(b3Var, fVar.f312749a, fVar2.f312749a, null, new Function1() { // from class: androidx.compose.material.cj
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return aj.b.k(iG7, arrayList, b3Var, function3, jeVar, i10, bVar, fVar, fVar2, nVar, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(int i10, List list, androidx.compose.ui.layout.b3 b3Var, Function2 function2, je jeVar, int i11, androidx.compose.ui.unit.b bVar, kotlin.jvm.internal.i1.f fVar, kotlin.jvm.internal.i1.f fVar2, pj.n nVar, androidx.compose.ui.layout.i2.a aVar) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int iH1 = i10;
            for (int i12 = 0; i12 < size; i12++) {
                androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) list.get(i12);
                androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, iH1, 0, 0.0f, 4, null);
                arrayList.add(new ti(b3Var.D3(iH1), b3Var.D3(i2Var.h1()), null));
                iH1 += i2Var.h1();
            }
            List<androidx.compose.ui.layout.z0> listS4 = b3Var.S4(fj.Divider, function2);
            int size2 = listS4.size();
            for (int i13 = 0; i13 < size2; i13++) {
                androidx.compose.ui.layout.z0 z0Var = listS4.get(i13);
                long jX = bVar.x();
                int i14 = fVar.f312749a;
                androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(jX, i14, i14, 0, 0, 8, null));
                androidx.compose.ui.layout.i2.a.e0(aVar, i2VarP0, 0, fVar2.f312749a - i2VarP0.c1(), 0.0f, 4, null);
            }
            List<androidx.compose.ui.layout.z0> listS5 = b3Var.S4(fj.Indicator, androidx.compose.runtime.internal.w.c(-43203918, true, new a(nVar, arrayList)));
            int size3 = listS5.size();
            for (int i15 = 0; i15 < size3; i15++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, listS5.get(i15).P0(androidx.compose.ui.unit.b.f42658b.c(fVar.f312749a, fVar2.f312749a)), 0, 0, 0.0f, 4, null);
            }
            jeVar.c(b3Var, i10, arrayList, i11);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1575164555, i10, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:236)");
            }
            androidx.compose.foundation.b5 b5VarF = androidx.compose.foundation.q4.f(0, c0Var, 0, 1);
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
            boolean zD = c0Var.D(b5VarF) | c0Var.D(s0Var);
            Object objI1 = c0Var.i0();
            if (zD || objI1 == aVar.a()) {
                objI1 = new je(b5VarF, s0Var);
                c0Var.Y(objI1);
            }
            final je jeVar = (je) objI1;
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.draw.j.b(androidx.compose.foundation.selection.b.b(androidx.compose.foundation.q4.e(androidx.compose.foundation.layout.i6.H(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.e.f37317a.o(), false, 2, null), b5VarF, false, null, false, 14, null)));
            boolean zI = c0Var.I(this.f22093a) | c0Var.D(this.f22094b) | c0Var.D(this.f22095c) | c0Var.D(this.f22096d) | c0Var.k0(jeVar) | c0Var.K(this.f22097e);
            final float f10 = this.f22093a;
            final Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22094b;
            final Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f22095c;
            final int i11 = this.f22097e;
            final pj.n<List<ti>, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f22096d;
            Object objI2 = c0Var.i0();
            if (zI || objI2 == aVar.a()) {
                Object obj = new Function2() { // from class: androidx.compose.material.bj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return aj.b.i(f10, function2, function3, jeVar, i11, nVar, (androidx.compose.ui.layout.b3) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0Var.Y(obj);
                objI2 = obj;
            }
            androidx.compose.ui.layout.z2.a(a0VarB, (Function2) objI2, c0Var, 0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            f(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements pj.n<List<? extends ti>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22100a;

        c(int i10) {
            this.f22100a = i10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(List<ti> list, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1896966245, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:140)");
            }
            wi wiVar = wi.f25419a;
            wiVar.e(wiVar.j(androidx.compose.ui.a0.E, list.get(this.f22100a)), 0.0f, 0L, c0Var, 3072, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ti> list, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(list, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,489:1\n1282#2,6:490\n70#3,6:496\n34#3,6:502\n34#3,6:508\n150#3,3:514\n34#3,6:517\n153#3:523\n168#3,13:524\n1#4:537\n68#5:538\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n*L\n151#1:490,6\n167#1:496,6\n171#1:502,6\n177#1:508,6\n157#1:514,3\n157#1:517,6\n157#1:523\n161#1:524,13\n164#1:538\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<List<ti>, androidx.compose.runtime.c0, Integer, Unit> f22103c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<List<ti>, androidx.compose.runtime.c0, Integer, Unit> f22104a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<ti> f22105b;

            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, List<ti> list) {
                this.f22104a = nVar;
                this.f22105b = list;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-220665376, i10, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                }
                this.f22104a.invoke(this.f22105b, c0Var, 0);
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
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f22101a = function2;
            this.f22102b = function3;
            this.f22103c = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 i(Function2 function2, final Function2 function3, final pj.n nVar, final androidx.compose.ui.layout.b3 b3Var, final androidx.compose.ui.unit.b bVar) {
            int i10;
            Object obj;
            final int iP = androidx.compose.ui.unit.b.p(bVar.x());
            List<androidx.compose.ui.layout.z0> listS4 = b3Var.S4(fj.Tabs, function2);
            int size = listS4.size();
            int i11 = iP / size;
            final ArrayList arrayList = new ArrayList(listS4.size());
            int size2 = listS4.size();
            int i12 = 0;
            while (i12 < size2) {
                int i13 = i11;
                arrayList.add(listS4.get(i12).P0(androidx.compose.ui.unit.b.d(bVar.x(), i13, i13, 0, 0, 12, null)));
                i12++;
                i11 = i13;
            }
            final int i14 = i11;
            if (!arrayList.isEmpty()) {
                i10 = 0;
                obj = arrayList.get(0);
                int iC1 = ((androidx.compose.ui.layout.i2) obj).c1();
                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                int i15 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        Object obj2 = arrayList.get(i15);
                        int iC2 = ((androidx.compose.ui.layout.i2) obj2).c1();
                        if (iC1 < iC2) {
                            obj = obj2;
                            iC1 = iC2;
                        }
                        if (i15 == lastIndex) {
                            break;
                        }
                        i15++;
                    }
                }
            } else {
                obj = null;
                i10 = 0;
            }
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) obj;
            int iC3 = i2Var != null ? i2Var.c1() : i10;
            final ArrayList arrayList2 = new ArrayList(size);
            for (int i16 = i10; i16 < size; i16++) {
                arrayList2.add(new ti(androidx.compose.ui.unit.h.r(b3Var.D3(i14) * i16), b3Var.D3(i14), null));
            }
            final int i17 = iC3;
            return androidx.compose.ui.layout.c1.h6(b3Var, iP, i17, null, new Function1() { // from class: androidx.compose.material.ej
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return aj.d.k(arrayList, b3Var, function3, i14, bVar, i17, nVar, arrayList2, iP, (androidx.compose.ui.layout.i2.a) obj3);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(List list, androidx.compose.ui.layout.b3 b3Var, Function2 function2, int i10, androidx.compose.ui.unit.b bVar, int i11, pj.n nVar, List list2, int i12, androidx.compose.ui.layout.i2.a aVar) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i13), i13 * i10, 0, 0.0f, 4, null);
            }
            List<androidx.compose.ui.layout.z0> listS4 = b3Var.S4(fj.Divider, function2);
            int size2 = listS4.size();
            for (int i14 = 0; i14 < size2; i14++) {
                androidx.compose.ui.layout.i2 i2VarP0 = listS4.get(i14).P0(androidx.compose.ui.unit.b.d(bVar.x(), 0, 0, 0, 0, 11, null));
                androidx.compose.ui.layout.i2.a.e0(aVar, i2VarP0, 0, i11 - i2VarP0.c1(), 0.0f, 4, null);
            }
            List<androidx.compose.ui.layout.z0> listS5 = b3Var.S4(fj.Indicator, androidx.compose.runtime.internal.w.c(-220665376, true, new a(nVar, list2)));
            int size3 = listS5.size();
            for (int i15 = 0; i15 < size3; i15++) {
                androidx.compose.ui.layout.i2.a.e0(aVar, listS5.get(i15).P0(androidx.compose.ui.unit.b.f42658b.c(i12, i11)), 0, 0, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 3 >> 1;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-638448612, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:150)");
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
            boolean zD = c0Var.D(this.f22101a) | c0Var.D(this.f22102b) | c0Var.D(this.f22103c);
            final Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22101a;
            final Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f22102b;
            final pj.n<List<ti>, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f22103c;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function2() { // from class: androidx.compose.material.dj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.d.i(function2, function3, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.layout.z2.a(a0VarH, (Function2) objI0, c0Var, 6, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            f(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01df  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void c(final int i10, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @Nullable pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        long jH;
        long jD;
        int i14;
        float f11;
        int i15;
        int i16;
        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final long j12;
        final long j13;
        final float f12;
        final pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        float fI;
        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarE;
        androidx.compose.ui.a0 a0Var4;
        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1291546575);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                i13 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    jH = j10;
                    int i22 = c0VarR.L(jH) ? 256 : 128;
                    i13 |= i22;
                } else {
                    jH = j10;
                }
                i13 |= i22;
            } else {
                jH = j10;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    jD = j11;
                    int i23 = c0VarR.L(jD) ? 2048 : 1024;
                    i13 |= i23;
                } else {
                    jD = j11;
                }
                i13 |= i23;
            } else {
                jD = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i11) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 128) != 0) {
                        if ((i11 & 12582912) == 0) {
                            if (c0VarR.k0(function3)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i13 |= i20;
                        }
                        if ((i13 & 4793491) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0 || c0VarR.y()) {
                                if (i21 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if ((i12 & 4) != 0) {
                                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                    i13 &= -897;
                                }
                                if ((i12 & 8) != 0) {
                                    jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                    i13 &= -7169;
                                }
                                if (i14 != 0) {
                                    fI = wi.f25419a.i();
                                } else {
                                    fI = f11;
                                }
                                if (i16 != 0) {
                                    nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                                } else {
                                    nVarE = nVar2;
                                }
                                if (i18 != 0) {
                                    function2B = t4.f24975a.b();
                                    pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5 = nVarE;
                                    a0Var4 = a0Var3;
                                    nVar4 = nVar5;
                                } else {
                                    pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6 = nVarE;
                                    a0Var4 = a0Var3;
                                    nVar4 = nVar6;
                                    function2B = function2;
                                }
                            } else {
                                c0VarR.u();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                function2B = function2;
                                fI = f11;
                                nVar4 = nVar2;
                                a0Var4 = a0Var;
                            }
                            long j14 = jH;
                            long j15 = jD;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5 = function2B;
                            c0Var2 = c0VarR;
                            ah.e(a0Var4, null, j14, j15, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function5, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            nVar3 = nVar4;
                            function4 = function5;
                            f12 = fI;
                            a0Var2 = a0Var4;
                            j12 = j14;
                            j13 = j15;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            j12 = jH;
                            j13 = jD;
                            f12 = f11;
                            nVar3 = nVar2;
                            function4 = function2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i13 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar7 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar7;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar8 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar8;
                                function2B = function2;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar9 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar9;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar10 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar10;
                                function2B = function2;
                            }
                        }
                        long j16 = jH;
                        long j17 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6 = function2B;
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, null, j16, j17, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function6, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        nVar3 = nVar4;
                        function4 = function6;
                        f12 = fI;
                        a0Var2 = a0Var4;
                        j12 = j16;
                        j13 = j17;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        j12 = jH;
                        j13 = jD;
                        f12 = f11;
                        nVar3 = nVar2;
                        function4 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                nVar2 = nVar;
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i12 & 128) != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    if ((i13 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar11;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar12 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar12;
                                function2B = function2;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar13 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar13;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar14 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar14;
                                function2B = function2;
                            }
                        }
                        long j18 = jH;
                        long j19 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7 = function2B;
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, null, j18, j19, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function7, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        nVar3 = nVar4;
                        function4 = function7;
                        f12 = fI;
                        a0Var2 = a0Var4;
                        j12 = j18;
                        j13 = j19;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        j12 = jH;
                        j13 = jD;
                        f12 = f11;
                        nVar3 = nVar2;
                        function4 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i13 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar15 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar15;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar16 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar16;
                            function2B = function2;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar17 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar17;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar18 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar18;
                            function2B = function2;
                        }
                    }
                    long j110 = jH;
                    long j111 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function2B;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j110, j111, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function8, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    nVar3 = nVar4;
                    function4 = function8;
                    f12 = fI;
                    a0Var2 = a0Var4;
                    j12 = j110;
                    j13 = j111;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                    nVar3 = nVar2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            f11 = f10;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i12 & 128) != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    if ((i13 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar19 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar19;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar110 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar110;
                                function2B = function2;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar111;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar112 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar112;
                                function2B = function2;
                            }
                        }
                        long j112 = jH;
                        long j113 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function2B;
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, null, j112, j113, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function9, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        nVar3 = nVar4;
                        function4 = function9;
                        f12 = fI;
                        a0Var2 = a0Var4;
                        j12 = j112;
                        j13 = j113;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        j12 = jH;
                        j13 = jD;
                        f12 = f11;
                        nVar3 = nVar2;
                        function4 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i13 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar113 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar113;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar114 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar114;
                            function2B = function2;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar115 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar115;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar116 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar116;
                            function2B = function2;
                        }
                    }
                    long j114 = jH;
                    long j115 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function2B;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j114, j115, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function10, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    nVar3 = nVar4;
                    function4 = function10;
                    f12 = fI;
                    a0Var2 = a0Var4;
                    j12 = j114;
                    j13 = j115;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                    nVar3 = nVar2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                if ((i13 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar117 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar117;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar118 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar118;
                            function2B = function2;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar119 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar119;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1110 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar1110;
                            function2B = function2;
                        }
                    }
                    long j116 = jH;
                    long j117 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function2B;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j116, j117, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function11, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    nVar3 = nVar4;
                    function4 = function11;
                    f12 = fI;
                    a0Var2 = a0Var4;
                    j12 = j116;
                    j13 = j117;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                    nVar3 = nVar2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i13 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1111;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1112 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1112;
                        function2B = function2;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1113 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1113;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1114 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1114;
                        function2B = function2;
                    }
                }
                long j118 = jH;
                long j119 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function2B;
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, j118, j119, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function12, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                nVar3 = nVar4;
                function4 = function12;
                f12 = fI;
                a0Var2 = a0Var4;
                j12 = j118;
                j13 = j119;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                f12 = f11;
                nVar3 = nVar2;
                function4 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                jH = j10;
                if (c0VarR.L(jH)) {
                }
                i13 |= i22;
            } else {
                jH = j10;
            }
            i13 |= i22;
        } else {
            jH = j10;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                jD = j11;
                if (c0VarR.L(jD)) {
                }
                i13 |= i23;
            } else {
                jD = j11;
            }
            i13 |= i23;
        } else {
            jD = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i12 & 128) != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    if ((i13 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1115 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar1115;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1116 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar1116;
                                function2B = function2;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fI = wi.f25419a.i();
                            } else {
                                fI = f11;
                            }
                            if (i16 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i18 != 0) {
                                function2B = t4.f24975a.b();
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1117 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar1117;
                            } else {
                                pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1118 = nVarE;
                                a0Var4 = a0Var3;
                                nVar4 = nVar1118;
                                function2B = function2;
                            }
                        }
                        long j1110 = jH;
                        long j1111 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function2B;
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, null, j1110, j1111, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function13, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        nVar3 = nVar4;
                        function4 = function13;
                        f12 = fI;
                        a0Var2 = a0Var4;
                        j12 = j1110;
                        j13 = j1111;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        j12 = jH;
                        j13 = jD;
                        f12 = f11;
                        nVar3 = nVar2;
                        function4 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i13 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1119 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar1119;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11110 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11110;
                            function2B = function2;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11111 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11111;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11112 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11112;
                            function2B = function2;
                        }
                    }
                    long j1112 = jH;
                    long j1113 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function2B;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j1112, j1113, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function14, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    nVar3 = nVar4;
                    function4 = function14;
                    f12 = fI;
                    a0Var2 = a0Var4;
                    j12 = j1112;
                    j13 = j1113;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                    nVar3 = nVar2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                if ((i13 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11113 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11113;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11114 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11114;
                            function2B = function2;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11115 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11115;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11116 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar11116;
                            function2B = function2;
                        }
                    }
                    long j1114 = jH;
                    long j1115 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function2B;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j1114, j1115, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function15, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    nVar3 = nVar4;
                    function4 = function15;
                    f12 = fI;
                    a0Var2 = a0Var4;
                    j12 = j1114;
                    j13 = j1115;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                    nVar3 = nVar2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i13 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11117 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar11117;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11118 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar11118;
                        function2B = function2;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11119 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar11119;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111110 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar111110;
                        function2B = function2;
                    }
                }
                long j1116 = jH;
                long j1117 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function2B;
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, j1116, j1117, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function16, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                nVar3 = nVar4;
                function4 = function16;
                f12 = fI;
                a0Var2 = a0Var4;
                j12 = j1116;
                j13 = j1117;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                f12 = f11;
                nVar3 = nVar2;
                function4 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        f11 = f10;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                if ((i13 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111111 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar111111;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111112 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar111112;
                            function2B = function2;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fI = wi.f25419a.i();
                        } else {
                            fI = f11;
                        }
                        if (i16 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i18 != 0) {
                            function2B = t4.f24975a.b();
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111113 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar111113;
                        } else {
                            pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111114 = nVarE;
                            a0Var4 = a0Var3;
                            nVar4 = nVar111114;
                            function2B = function2;
                        }
                    }
                    long j1118 = jH;
                    long j1119 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function2B;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j1118, j1119, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function17, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    nVar3 = nVar4;
                    function4 = function17;
                    f12 = fI;
                    a0Var2 = a0Var4;
                    j12 = j1118;
                    j13 = j1119;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                    nVar3 = nVar2;
                    function4 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i13 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111115 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar111115;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111116 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar111116;
                        function2B = function2;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111117 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar111117;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111118 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar111118;
                        function2B = function2;
                    }
                }
                long j11110 = jH;
                long j11111 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function2B;
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, j11110, j11111, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function18, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                nVar3 = nVar4;
                function4 = function18;
                f12 = fI;
                a0Var2 = a0Var4;
                j12 = j11110;
                j13 = j11111;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                f12 = f11;
                nVar3 = nVar2;
                function4 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        nVar2 = nVar;
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c0VarR.k0(function2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        if ((i12 & 128) != 0) {
            if ((i11 & 12582912) == 0) {
                if (c0VarR.k0(function3)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            if ((i13 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar111119 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar111119;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111110 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1111110;
                        function2B = function2;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fI = wi.f25419a.i();
                    } else {
                        fI = f11;
                    }
                    if (i16 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i18 != 0) {
                        function2B = t4.f24975a.b();
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111111 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1111111;
                    } else {
                        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111112 = nVarE;
                        a0Var4 = a0Var3;
                        nVar4 = nVar1111112;
                        function2B = function2;
                    }
                }
                long j11112 = jH;
                long j11113 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function2B;
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, j11112, j11113, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function19, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                nVar3 = nVar4;
                function4 = function19;
                f12 = fI;
                a0Var2 = a0Var4;
                j12 = j11112;
                j13 = j11113;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                f12 = f11;
                nVar3 = nVar2;
                function4 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 12582912;
        if ((i13 & 4793491) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i12 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    fI = wi.f25419a.i();
                } else {
                    fI = f11;
                }
                if (i16 != 0) {
                    nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                } else {
                    nVarE = nVar2;
                }
                if (i18 != 0) {
                    function2B = t4.f24975a.b();
                    pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111113 = nVarE;
                    a0Var4 = a0Var3;
                    nVar4 = nVar1111113;
                } else {
                    pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111114 = nVarE;
                    a0Var4 = a0Var3;
                    nVar4 = nVar1111114;
                    function2B = function2;
                }
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i12 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    fI = wi.f25419a.i();
                } else {
                    fI = f11;
                }
                if (i16 != 0) {
                    nVarE = androidx.compose.runtime.internal.w.e(-233732148, true, new a(i10), c0VarR, 54);
                } else {
                    nVarE = nVar2;
                }
                if (i18 != 0) {
                    function2B = t4.f24975a.b();
                    pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111115 = nVarE;
                    a0Var4 = a0Var3;
                    nVar4 = nVar1111115;
                } else {
                    pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar1111116 = nVarE;
                    a0Var4 = a0Var3;
                    nVar4 = nVar1111116;
                    function2B = function2;
                }
            }
            long j11114 = jH;
            long j11115 = jD;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1291546575, i13, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
            }
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function2B;
            c0Var2 = c0VarR;
            ah.e(a0Var4, null, j11114, j11115, null, 0.0f, androidx.compose.runtime.internal.w.e(-1575164555, true, new b(fI, function3, function110, nVar4, i10), c0VarR, 54), c0Var2, ((i13 >> 3) & 14) | 1572864 | (i13 & 896) | (i13 & 7168), 50);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            nVar3 = nVar4;
            function4 = function110;
            f12 = fI;
            a0Var2 = a0Var4;
            j12 = j11114;
            j13 = j11115;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            j12 = jH;
            j13 = jD;
            f12 = f11;
            nVar3 = nVar2;
            function4 = function2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.yi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aj.d(i10, a0Var2, j12, j13, f12, nVar3, function4, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, pj.n nVar, Function2 function2, Function2 function3, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        c(i10, a0Var, j10, j11, f10, nVar, function2, function3, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0191  */
    /* JADX WARN: Code duplicated, block: B:118:0x019b  */
    /* JADX WARN: Code duplicated, block: B:121:0x01af  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
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
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108 A[PHI: r0 r3 r6 r8 r11
      0x0108: PHI (r0v12 androidx.compose.ui.a0) = (r0v9 androidx.compose.ui.a0), (r0v16 androidx.compose.ui.a0) binds: [B:109:0x0147, B:94:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r3v29 int) = (r3v22 int), (r3v33 int) binds: [B:109:0x0147, B:94:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r6v13 long) = (r6v7 long), (r6v6 long) binds: [B:109:0x0147, B:94:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r8v10 pj.n<? super java.util.List<androidx.compose.material.ti>, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>) = 
      (r8v5 pj.n<? super java.util.List<androidx.compose.material.ti>, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
      (r8v11 pj.n<? super java.util.List<androidx.compose.material.ti>, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:109:0x0147, B:94:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r11v10 long) = (r11v3 long), (r11v1 long) binds: [B:109:0x0147, B:94:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void e(final int i10, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        long jH;
        long jD;
        int i14;
        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i15;
        int i16;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i17;
        int i18;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final long j12;
        final long j13;
        final pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        pj.n<? super List<ti>, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarE;
        int i19;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2A;
        long j14;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(113221600);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                i13 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    jH = j10;
                    int i22 = c0VarR.L(jH) ? 256 : 128;
                    i13 |= i22;
                } else {
                    jH = j10;
                }
                i13 |= i22;
            } else {
                jH = j10;
            }
            if ((i11 & 3072) == 0) {
                jD = j11;
                if ((i12 & 8) == 0 || !c0VarR.L(jD)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i13 |= i20;
            } else {
                jD = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i11) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if ((i12 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                            } else {
                                nVarE = nVar2;
                            }
                            if (i16 != 0) {
                                long j15 = jH;
                                i19 = i13;
                                function2A = t4.f24975a.a();
                                j14 = j15;
                            }
                            long j16 = jD;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                            }
                            c0Var2 = c0VarR;
                            ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j16, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var2 = a0Var3;
                            nVar3 = nVarE;
                            j13 = j16;
                            function5 = function2A;
                            j12 = j14;
                        } else {
                            c0VarR.u();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                            }
                            a0Var3 = a0Var;
                            nVarE = nVar2;
                        }
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                        long j17 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                        }
                        c0Var2 = c0VarR;
                        ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j17, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        nVar3 = nVarE;
                        j13 = j17;
                        function5 = function2A;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        j12 = jH;
                        j13 = jD;
                        nVar3 = nVar2;
                        function5 = function4;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function2;
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i16 != 0) {
                            long j18 = jH;
                            i19 = i13;
                            function2A = t4.f24975a.a();
                            j14 = j18;
                        } else {
                            j14 = jH;
                            i19 = i13;
                            function2A = function4;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i16 != 0) {
                            long j19 = jH;
                            i19 = i13;
                            function2A = t4.f24975a.a();
                            j14 = j19;
                        } else {
                            j14 = jH;
                            i19 = i13;
                            function2A = function4;
                        }
                    }
                    long j110 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j110, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    nVar3 = nVarE;
                    j13 = j110;
                    function5 = function2A;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    nVar3 = nVar2;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            nVar2 = nVar;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i16 != 0) {
                            long j111 = jH;
                            i19 = i13;
                            function2A = t4.f24975a.a();
                            j14 = j111;
                        } else {
                            j14 = jH;
                            i19 = i13;
                            function2A = function4;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i16 != 0) {
                            long j112 = jH;
                            i19 = i13;
                            function2A = t4.f24975a.a();
                            j14 = j112;
                        } else {
                            j14 = jH;
                            i19 = i13;
                            function2A = function4;
                        }
                    }
                    long j113 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j113, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    nVar3 = nVarE;
                    j13 = j113;
                    function5 = function2A;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    nVar3 = nVar2;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function2;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i16 != 0) {
                        long j114 = jH;
                        i19 = i13;
                        function2A = t4.f24975a.a();
                        j14 = j114;
                    } else {
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i16 != 0) {
                        long j115 = jH;
                        i19 = i13;
                        function2A = t4.f24975a.a();
                        j14 = j115;
                    } else {
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                    }
                }
                long j116 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                }
                c0Var2 = c0VarR;
                ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j116, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                nVar3 = nVarE;
                j13 = j116;
                function5 = function2A;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                nVar3 = nVar2;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                jH = j10;
                if (c0VarR.L(jH)) {
                }
                i13 |= i22;
            } else {
                jH = j10;
            }
            i13 |= i22;
        } else {
            jH = j10;
        }
        if ((i11 & 3072) == 0) {
            jD = j11;
            if ((i12 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i13 |= i20;
        } else {
            jD = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i16 != 0) {
                            long j117 = jH;
                            i19 = i13;
                            function2A = t4.f24975a.a();
                            j14 = j117;
                        } else {
                            j14 = jH;
                            i19 = i13;
                            function2A = function4;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i12 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                        } else {
                            nVarE = nVar2;
                        }
                        if (i16 != 0) {
                            long j118 = jH;
                            i19 = i13;
                            function2A = t4.f24975a.a();
                            j14 = j118;
                        } else {
                            j14 = jH;
                            i19 = i13;
                            function2A = function4;
                        }
                    }
                    long j119 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j119, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    nVar3 = nVarE;
                    j13 = j119;
                    function5 = function2A;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    nVar3 = nVar2;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function2;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i16 != 0) {
                        long j1110 = jH;
                        i19 = i13;
                        function2A = t4.f24975a.a();
                        j14 = j1110;
                    } else {
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i16 != 0) {
                        long j1111 = jH;
                        i19 = i13;
                        function2A = t4.f24975a.a();
                        j14 = j1111;
                    } else {
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                    }
                }
                long j1112 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                }
                c0Var2 = c0VarR;
                ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j1112, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                nVar3 = nVarE;
                j13 = j1112;
                function5 = function2A;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                nVar3 = nVar2;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        nVar2 = nVar;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                function4 = function2;
                if (c0VarR.k0(function4)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i16 != 0) {
                        long j1113 = jH;
                        i19 = i13;
                        function2A = t4.f24975a.a();
                        j14 = j1113;
                    } else {
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i12 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                    } else {
                        nVarE = nVar2;
                    }
                    if (i16 != 0) {
                        long j1114 = jH;
                        i19 = i13;
                        function2A = t4.f24975a.a();
                        j14 = j1114;
                    } else {
                        j14 = jH;
                        i19 = i13;
                        function2A = function4;
                    }
                }
                long j1115 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                }
                c0Var2 = c0VarR;
                ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j1115, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                nVar3 = nVarE;
                j13 = j1115;
                function5 = function2A;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                nVar3 = nVar2;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        function4 = function2;
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c0VarR.k0(function3)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        if ((i13 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i12 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                } else {
                    nVarE = nVar2;
                }
                if (i16 != 0) {
                    long j1116 = jH;
                    i19 = i13;
                    function2A = t4.f24975a.a();
                    j14 = j1116;
                } else {
                    j14 = jH;
                    i19 = i13;
                    function2A = function4;
                }
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i12 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    nVarE = androidx.compose.runtime.internal.w.e(1896966245, true, new c(i10), c0VarR, 54);
                } else {
                    nVarE = nVar2;
                }
                if (i16 != 0) {
                    long j1117 = jH;
                    i19 = i13;
                    function2A = t4.f24975a.a();
                    j14 = j1117;
                } else {
                    j14 = jH;
                    i19 = i13;
                    function2A = function4;
                }
            }
            long j1118 = jD;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(113221600, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
            }
            c0Var2 = c0VarR;
            ah.e(androidx.compose.foundation.selection.b.b(a0Var3), null, j14, j1118, null, 0.0f, androidx.compose.runtime.internal.w.e(-638448612, true, new d(function3, function2A, nVarE), c0VarR, 54), c0Var2, (i19 & 896) | 1572864 | (i19 & 7168), 50);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            nVar3 = nVarE;
            j13 = j1118;
            function5 = function2A;
            j12 = j14;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            j12 = jH;
            j13 = jD;
            nVar3 = nVar2;
            function5 = function4;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.zi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aj.f(i10, a0Var2, j12, j13, nVar3, function5, function3, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(int i10, androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n nVar, Function2 function2, Function2 function3, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        e(i10, a0Var, j10, j11, nVar, function2, function3, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }
}

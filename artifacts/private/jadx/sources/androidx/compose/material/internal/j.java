package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.y1;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import androidx.compose.ui.unit.w;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,459:1\n75#2:460\n75#2:461\n75#2:462\n75#2:463\n1282#3,6:464\n1282#3,6:470\n1282#3,6:476\n1282#3,6:482\n1282#3,6:488\n1282#3,6:494\n1282#3,6:500\n1282#3,6:536\n79#4,6:506\n86#4,3:521\n89#4,2:530\n93#4:535\n79#4,6:542\n86#4,3:557\n89#4,2:566\n93#4:571\n347#5,9:512\n356#5,3:532\n347#5,9:548\n356#5,3:568\n4206#6,6:524\n4206#6,6:560\n85#7:572\n66#8,5:573\n66#8,5:578\n65#9:583\n69#9:586\n60#10:584\n70#10:587\n80#10:589\n22#11:585\n32#12:588\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n82#1:460\n83#1:461\n84#1:462\n85#1:463\n88#1:464,6\n89#1:470,6\n115#1:476,6\n129#1:482,6\n137#1:488,6\n149#1:494,6\n160#1:500,6\n176#1:536,6\n146#1:506,6\n146#1:521,3\n146#1:530,2\n146#1:535\n176#1:542,6\n176#1:557,3\n176#1:566,2\n176#1:571\n146#1:512,9\n146#1:532,3\n176#1:548,9\n176#1:568,3\n146#1:524,6\n176#1:560,6\n87#1:572\n122#1:573,5\n140#1:578,5\n154#1:583\n154#1:586\n154#1:584\n154#1:587\n154#1:589\n154#1:585\n154#1:588\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m4<String> f23204a = a1.k(null, new Function0() { // from class: androidx.compose.material.internal.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j.p();
        }
    }, 1, null);

    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f23205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f23206b;

        a(u uVar, w wVar) {
            this.f23205a = uVar;
            this.f23206b = wVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(i2.a aVar) {
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            this.f23205a.setParentLayoutDirection(this.f23206b);
            return c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.material.internal.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j.a.g((i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n1#1,69:1\n140#2:70\n*E\n"})
    public static final class b implements u1 {
        @Override // androidx.compose.runtime.u1
        public void dispose() {
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n1#1,69:1\n123#2,4:70\n*E\n"})
    public static final class c implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f23207a;

        public c(u uVar) {
            this.f23207a = uVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f23207a.disposeComposition();
            this.f23207a.o();
        }
    }

    @SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,459:1\n1282#2,6:460\n1282#2,6:466\n1282#2,6:474\n175#3,2:472\n201#3:510\n79#4,6:480\n86#4,3:495\n89#4,2:504\n93#4:509\n347#5,9:486\n356#5,3:506\n4206#6,6:498\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n*L\n101#1:460,6\n103#1:466,6\n100#1:474,6\n100#1:472,2\n100#1:510\n100#1:480,6\n100#1:495,3\n100#1:504,2\n100#1:509\n100#1:486,9\n100#1:506,3\n100#1:498,6\n*E\n"})
    static final class d implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f23208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7<Function2<c0, Integer, Unit>> f23209b;

        /* JADX WARN: Multi-variable type inference failed */
        d(u uVar, n7<? extends Function2<? super c0, ? super Integer, Unit>> n7Var) {
            this.f23208a = uVar;
            this.f23209b = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(e0 e0Var) {
            b0.i1(e0Var);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(u uVar, androidx.compose.ui.unit.u uVar2) {
            uVar.m2setPopupContentSizefhxjrPA(uVar2);
            uVar.x();
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1879981140, i10, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:99)");
            }
            a0.a aVar = a0.E;
            Object objI0 = c0Var.i0();
            c0.a aVar2 = c0.f35327a;
            if (objI0 == aVar2.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.internal.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.d.i((e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            boolean zK0 = c0Var.k0(this.f23208a);
            final u uVar = this.f23208a;
            Object objI1 = c0Var.i0();
            if (zK0 || objI1 == aVar2.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.internal.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.d.k(uVar, (androidx.compose.ui.unit.u) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            a0 a0VarA = androidx.compose.ui.draw.a.a(y1.a(a0VarF, (Function1) objI1), this.f23208a.getCanCalculatePosition() ? 1.0f : 0.0f);
            Function2 function2I = j.i(this.f23209b);
            Object objI2 = c0Var.i0();
            if (objI2 == aVar2.a()) {
                objI2 = e.f23210a;
                c0Var.Y(objI2);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI2;
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1Var, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            function2I.invoke(c0Var, 0);
            c0Var.o();
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            f(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n150#2,3:460\n34#2,6:463\n153#2:469\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1\n*L\n184#1:460,3\n184#1:463,6\n184#1:469\n*E\n"})
    public static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f23210a = new e();

        public static final class a implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f23211a = new a();

            public final void c(i2.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        public static final class b implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i2 f23212a;

            public b(i2 i2Var) {
                this.f23212a = i2Var;
            }

            public final void c(i2.a aVar) {
                i2.a.e0(aVar, this.f23212a, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        public static final class c implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<i2> f23213a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends i2> list) {
                this.f23213a = list;
            }

            public final void c(i2.a aVar) {
                int lastIndex = CollectionsKt.getLastIndex(this.f23213a);
                if (lastIndex < 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    i2.a aVar2 = aVar;
                    i2.a.e0(aVar2, this.f23213a.get(i10), 0, 0, 0.0f, 4, null);
                    if (i10 == lastIndex) {
                        return;
                    }
                    i10++;
                    aVar = aVar2;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            int i10;
            int i11;
            int size = list.size();
            if (size == 0) {
                int i12 = 0 << 0;
                return c1.h6(c1Var, 0, 0, null, a.f23211a, 4, null);
            }
            int i13 = 0;
            if (size == 1) {
                i2 i2VarP0 = list.get(0).P0(j10);
                return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new b(i2VarP0), 4, null);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList.add(list.get(i14).P0(j10));
            }
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (lastIndex >= 0) {
                int iMax = 0;
                int iMax2 = 0;
                while (true) {
                    i2 i2Var = (i2) arrayList.get(i13);
                    iMax = Math.max(iMax, i2Var.h1());
                    iMax2 = Math.max(iMax2, i2Var.c1());
                    if (i13 == lastIndex) {
                        break;
                    }
                    i13++;
                }
                i10 = iMax;
                i11 = iMax2;
            } else {
                i10 = 0;
                i11 = 0;
            }
            return c1.h6(c1Var, i10, i11, null, new c(arrayList), 4, null);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(@Nullable Function0<Unit> function0, @NotNull androidx.compose.ui.window.s sVar, @NotNull final Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        final Function0<Unit> function3;
        final String str;
        final androidx.compose.ui.window.s sVar2 = sVar;
        c0 c0VarR = c0Var.R(1705178815);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else if ((i10 & 6) == 0) {
            function1 = function0;
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            function1 = function0;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(sVar2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        int i14 = i12;
        if (c0VarR.h((i14 & com.planner5d.library.engine.input.f.b.F1) != 146, i14 & 1)) {
            function3 = i13 != 0 ? null : function1;
            if (m0.l0()) {
                m0.A0(1705178815, i14, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
            }
            View view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(q1.m());
            String str2 = (String) c0VarR.W(f23204a);
            final w wVar = (w) c0VarR.W(q1.u());
            p0 p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            n7 n7VarW = w6.w(function2, c0VarR, (i14 >> 6) & 14);
            Object[] objArr = new Object[0];
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.internal.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.m();
                    }
                };
                c0VarR.Y(objI0);
            }
            UUID uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 48);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                u uVar = new u(function3, str2, view, dVar, sVar, uuid);
                str = str2;
                sVar2 = sVar;
                uVar.r(p0VarY, androidx.compose.runtime.internal.w.c(1879981140, true, new d(uVar, n7VarW)));
                c0VarR.Y(uVar);
                objI1 = uVar;
            } else {
                str = str2;
            }
            final u uVar2 = (u) objI1;
            int i15 = i14 & 14;
            boolean zK0 = c0VarR.k0(uVar2) | (i15 == 4) | c0VarR.D(str) | c0VarR.K(wVar.ordinal());
            Object objI2 = c0VarR.i0();
            if (zK0 || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material.internal.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.n(uVar2, function3, str, wVar, (v1) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            b2.d(uVar2, (Function1) objI2, c0VarR, 0);
            boolean zK1 = c0VarR.k0(uVar2) | (i15 == 4) | c0VarR.D(str) | c0VarR.K(wVar.ordinal());
            Object objI3 = c0VarR.i0();
            if (zK1 || objI3 == aVar.a()) {
                objI3 = new Function0() { // from class: androidx.compose.material.internal.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.o(uVar2, function3, str, wVar);
                    }
                };
                c0VarR.Y(objI3);
            }
            b2.m((Function0) objI3, c0VarR, 0);
            boolean zK2 = c0VarR.k0(uVar2) | ((i14 & com.planner5d.library.engine.input.f.b.B) == 32);
            Object objI4 = c0VarR.i0();
            if (zK2 || objI4 == aVar.a()) {
                objI4 = new Function1() { // from class: androidx.compose.material.internal.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.j(uVar2, sVar2, (v1) obj);
                    }
                };
                c0VarR.Y(objI4);
            }
            b2.d(sVar2, (Function1) objI4, c0VarR, (i14 >> 3) & 14);
            a0.a aVar2 = a0.E;
            boolean zK3 = c0VarR.k0(uVar2);
            Object objI5 = c0VarR.i0();
            if (zK3 || objI5 == aVar.a()) {
                objI5 = new Function1() { // from class: androidx.compose.material.internal.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.k(uVar2, (g0) obj);
                    }
                };
                c0VarR.Y(objI5);
            }
            a0 a0VarA = androidx.compose.ui.layout.q1.a(aVar2, (Function1) objI5);
            boolean zK4 = c0VarR.k0(uVar2) | c0VarR.K(wVar.ordinal());
            Object objI6 = c0VarR.i0();
            if (zK4 || objI6 == aVar.a()) {
                objI6 = new a(uVar2, wVar);
                c0VarR.Y(objI6);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI6;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1Var, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
            function3 = function1;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.internal.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j.l(function3, sVar2, function2, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<c0, Integer, Unit> i(n7<? extends Function2<? super c0, ? super Integer, Unit>> n7Var) {
        return (Function2) n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 j(u uVar, androidx.compose.ui.window.s sVar, v1 v1Var) {
        uVar.setPositionProvider(sVar);
        uVar.x();
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(u uVar, g0 g0Var) {
        g0 g0VarG0 = g0Var.g0();
        Intrinsics.checkNotNull(g0VarG0);
        long jA = g0VarG0.a();
        long jG = h0.g(g0VarG0);
        uVar.s(androidx.compose.ui.unit.t.b(androidx.compose.ui.unit.q.f((((long) kotlin.math.b.L0(Float.intBitsToFloat((int) (jG >> 32)))) << 32) | (k0.f265952a & ((long) kotlin.math.b.L0(Float.intBitsToFloat((int) (jG & k0.f265952a)))))), jA));
        uVar.x();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function0 function0, androidx.compose.ui.window.s sVar, Function2 function2, int i10, int i11, c0 c0Var, int i12) {
        h(function0, sVar, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID m() {
        return UUID.randomUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 n(u uVar, Function0 function0, String str, w wVar, v1 v1Var) {
        uVar.t();
        uVar.w(function0, str, wVar);
        return new c(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(u uVar, Function0 function0, String str, w wVar) {
        uVar.w(function0, str, wVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p() {
        return "DEFAULT_TEST_TAG";
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void q(a0 a0Var, Function2<? super c0, ? super Integer, Unit> function2, c0 c0Var, int i10) {
        Object objI0 = c0Var.i0();
        if (objI0 == c0.f35327a.a()) {
            objI0 = e.f23210a;
            c0Var.Y(objI0);
        }
        androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
        int i11 = ((i10 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i10 >> 3) & 14) | a5.S0;
        int iJ = androidx.compose.runtime.v.j(c0Var, 0);
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        int i12 = ((i11 << 6) & 896) | 6;
        if (c0Var.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var.q();
        if (c0Var.P()) {
            c0Var.q0(function0A);
        } else {
            c0Var.l();
        }
        c0 c0VarD = y7.d(c0Var);
        y7.n(c0VarD, a1Var, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
            c0VarD.Y(Integer.valueOf(iJ));
            c0VarD.f(Integer.valueOf(iJ), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        function2.invoke(c0Var, Integer.valueOf((i12 >> 6) & 14));
        c0Var.o();
    }

    @NotNull
    public static final m4<String> s() {
        return f23204a;
    }
}

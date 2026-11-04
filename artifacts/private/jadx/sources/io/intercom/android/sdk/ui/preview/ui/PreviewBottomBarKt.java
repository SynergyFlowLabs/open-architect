package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.lazy.j1;
import androidx.compose.foundation.lazy.o1;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.foundation.t0;
import androidx.compose.material3.a4;
import androidx.compose.material3.q50;
import androidx.compose.material3.s3;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPreviewBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewBottomBar.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewBottomBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,135:1\n113#2:136\n113#2:137\n113#2:138\n113#2:213\n113#2:244\n99#3,6:139\n106#3:217\n80#4,6:145\n87#4,3:160\n90#4,2:169\n80#4,6:182\n87#4,3:197\n90#4,2:206\n94#4:211\n94#4:216\n391#5,9:151\n400#5:171\n391#5,9:188\n400#5,3:208\n401#5,2:214\n4360#6,6:163\n4360#6,6:200\n70#7:172\n67#7,9:173\n77#7:212\n607#8:218\n604#8,6:219\n1282#9,3:225\n1285#9,3:229\n1282#9,6:232\n1282#9,6:238\n605#10:228\n204#11,13:245\n*S KotlinDebug\n*F\n+ 1 PreviewBottomBar.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewBottomBarKt\n*L\n48#1:136\n50#1:137\n52#1:138\n70#1:213\n107#1:244\n45#1:139,6\n45#1:217\n45#1:145,6\n45#1:160,3\n45#1:169,2\n54#1:182,6\n54#1:197,3\n54#1:206,2\n54#1:211\n45#1:216\n45#1:151,9\n45#1:171\n54#1:188,9\n54#1:208,3\n45#1:214,2\n45#1:163,6\n54#1:200,6\n54#1:172\n54#1:173,9\n54#1:212\n89#1:218\n89#1:219,6\n89#1:225,3\n89#1:229,3\n91#1:232,6\n94#1:238,6\n89#1:228\n110#1:245,13\n*E\n"})
public final class PreviewBottomBarKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewBottomBar(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final PreviewUiState uiState, @NotNull final Function1<? super Integer, Unit> onThumbnailClick, @NotNull final Function0<Unit> onCtaClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "onThumbnailClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1411281377);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        float f10 = 16;
        androidx.compose.ui.a0 a0VarR = d5.r(androidx.compose.foundation.v.d(i6.i(i6.h(a0Var2, 0.0f, 1, null), androidx.compose.ui.unit.h.r(100)), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), androidx.compose.ui.unit.h.r(f10));
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8)), aVar.q(), c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
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
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarE, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(-2090574877);
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar3, 1.0f, false, 2, null);
        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
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
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarK, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        c0VarR.E(654440355);
        if (uiState.getFiles().size() > 1) {
            ThumbnailList(uiState.getFiles(), uiState.getCurrentPage(), onThumbnailClick, c0VarR, (i10 & 896) | 8);
        }
        c0VarR.A();
        c0VarR.o();
        String confirmationText = uiState.getConfirmationText();
        if (confirmationText == null || StringsKt.w3(confirmationText)) {
            c0VarR.A();
        } else {
            androidx.compose.ui.a0 a0VarV = d5.v(aVar3, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 11, null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            a4.g(onCtaClick, a0VarV, false, intercomTheme.getShapes(c0VarR, 6).m(), s3.f32666a.b(intercomTheme.getColors(c0VarR, 6).m684getAction0d7_KjU(), 0L, 0L, 0L, c0VarR, s3.f32683r << 12, 14), null, null, null, null, androidx.compose.runtime.internal.w.e(-950541555, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$PreviewBottomBar$1$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(x5Var, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(x5 Button, androidx.compose.runtime.c0 c0Var2, int i12) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i12 & 81) == 16 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        q50.t(uiState.getConfirmationText(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                    }
                }
            }, c0VarR, 54), c0VarR, ((i10 >> 9) & 14) | 805306416, 484);
            c0VarR = c0VarR;
            c0VarR.A();
        }
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewBottomBarKt.PreviewBottomBar$lambda$2(a0Var3, uiState, onThumbnailClick, onCtaClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBottomBar$lambda$2(androidx.compose.ui.a0 a0Var, PreviewUiState uiState, Function1 onThumbnailClick, Function0 onCtaClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "$onThumbnailClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "$onCtaClick");
        PreviewBottomBar(a0Var, uiState, onThumbnailClick, onCtaClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ThumbnailList(final List<? extends IntercomPreviewFile> list, final int i10, final Function1<? super Integer, Unit> function1, androidx.compose.runtime.c0 c0Var, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1185141070);
        final j1 j1VarF = o1.f(0, 0, c0VarR, 0, 3);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
            c0VarR.Y(objI0);
        }
        final s0 s0Var = (s0) objI0;
        c0VarR.E(1591198182);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar.a()) {
            objI1 = d7.g(CollectionsKt.emptyList(), null, 2, null);
            c0VarR.Y(objI1);
        }
        final n3 n3Var = (n3) objI1;
        c0VarR.A();
        c0VarR.E(1591201463);
        boolean zD = c0VarR.D(j1VarF);
        Object objI2 = c0VarR.i0();
        if (zD || objI2 == aVar.a()) {
            objI2 = new PreviewBottomBarKt$ThumbnailList$1$1(j1VarF, n3Var, null);
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        b2.i("", (Function2) objI2, c0VarR, 70);
        androidx.compose.foundation.lazy.h.n(androidx.compose.ui.a0.E, j1VarF, d5.g(androidx.compose.ui.unit.h.r(8), androidx.compose.ui.unit.h.r(4)), false, androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewBottomBarKt.ThumbnailList$lambda$8(list, n3Var, i10, s0Var, function1, j1VarF, (w0) obj);
            }
        }, c0VarR, 221574, 456);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewBottomBarKt.ThumbnailList$lambda$9(list, i10, function1, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThumbnailList$lambda$8(final List files, n3 visibleItems, final int i10, s0 scope, final Function1 onThumbnailClick, j1 listState, w0 LazyRow) {
        Intrinsics.checkNotNullParameter(files, "$files");
        Intrinsics.checkNotNullParameter(visibleItems, "$visibleItems");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "$onThumbnailClick");
        Intrinsics.checkNotNullParameter(listState, "$listState");
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.A(files.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                files.get(i11);
                return null;
            }
        }, androidx.compose.runtime.internal.w.c(2039820996, true, new pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                invoke(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void invoke(androidx.compose.foundation.lazy.i iVar, final int i11, androidx.compose.runtime.c0 c0Var, int i12) {
                int i13;
                if ((i12 & 6) == 0) {
                    i13 = i12 | (c0Var.D(iVar) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    i13 |= c0Var.K(i11) ? 32 : 16;
                }
                boolean z10 = true;
                if (!c0Var.h((i13 & com.planner5d.library.engine.input.f.b.F1) != 146, i13 & 1)) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(2039820996, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                IntercomPreviewFile intercomPreviewFile = (IntercomPreviewFile) files.get(i11);
                c0Var.E(534177283);
                long jW = i10 == i11 ? q0.f38131b.w() : q0.f38131b.s();
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarR = d5.r(t0.i(aVar, androidx.compose.ui.unit.h.r(2), jW, androidx.compose.foundation.shape.o.c(10)), androidx.compose.ui.unit.h.r(4));
                c0Var.E(-1229685931);
                boolean zD = c0Var.D(onThumbnailClick);
                if ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.K(i11)) && (i13 & 48) != 32) {
                    z10 = false;
                }
                boolean z11 = zD | z10;
                Object objI0 = c0Var.i0();
                if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    final Function1 function1 = onThumbnailClick;
                    objI0 = new Function0<Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f312394a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Integer.valueOf(i11));
                        }
                    };
                    c0Var.Y(objI0);
                }
                c0Var.A();
                androidx.compose.ui.a0 a0VarJ = i1.j(a0VarR, false, null, null, null, (Function0) objI0, 15, null);
                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarJ);
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
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                PreviewUriKt.ThumbnailPreview(androidx.compose.ui.draw.j.a(i6.w(aVar, androidx.compose.ui.unit.h.r(48)), androidx.compose.foundation.shape.o.c(10)), androidx.compose.ui.layout.l.f39405a.a(), intercomPreviewFile, c0Var, 560, 0);
                c0Var.o();
                c0Var.A();
                if (m0.l0()) {
                    m0.z0();
                }
            }
        }));
        if (!((List) visibleItems.getValue()).contains(Integer.valueOf(i10))) {
            kotlinx.coroutines.k.f(scope, null, null, new PreviewBottomBarKt$ThumbnailList$2$2(listState, i10, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThumbnailList$lambda$9(List files, int i10, Function1 onThumbnailClick, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(files, "$files");
        Intrinsics.checkNotNullParameter(onThumbnailClick, "$onThumbnailClick");
        ThumbnailList(files, i10, onThumbnailClick, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }
}

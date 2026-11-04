package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAskedAboutRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskedAboutRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/AskedAboutRowKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,93:1\n75#2:94\n113#3:95\n113#3:133\n87#4:96\n84#4,9:97\n94#4:137\n80#5,6:106\n87#5,3:121\n90#5,2:130\n94#5:136\n391#6,9:112\n400#6:132\n401#6,2:134\n4360#7,6:124\n*S KotlinDebug\n*F\n+ 1 AskedAboutRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/AskedAboutRowKt\n*L\n28#1:94\n30#1:95\n40#1:133\n29#1:96\n29#1:97,9\n29#1:137\n29#1:106,6\n29#1:121,3\n29#1:130,2\n29#1:136\n29#1:112,9\n29#1:132\n29#1:134,2\n29#1:124,6\n*E\n"})
public final class AskedAboutRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AskedAboutRow(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Part part, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(part, "part");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1277406973);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.a0 a0VarT = d5.t(a0Var2, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
        androidx.compose.foundation.layout.q.m mVarY = androidx.compose.foundation.layout.q.f16330a.y();
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
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
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        String strD = u0.i.d(R.string.intercom_asked_about, c0VarR, 0);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        y3 y3VarM = y3.m(intercomTheme.getTypography(c0VarR, i12).getType04Point5(), intercomTheme.getColors(c0VarR, i12).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        q50.t(strD, d5.v(n0Var.p(aVar3, aVar.m()), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(8), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarM, c0VarR, 0, 0, 131068);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        List<Block> blocks = part.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
        final Block block = (Block) CollectionsKt.firstOrNull((List) blocks);
        c0Var2.E(-1827597217);
        if (block != null) {
            IntercomCardKt.IntercomCard(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AskedAboutRowKt.AskedAboutRow$lambda$2$lambda$1$lambda$0(context, block);
                }
            }, i6.h(aVar3, 0.0f, 1, null), false, IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0Var2, IntercomCardStyle.$stable << 15, 31), null, androidx.compose.runtime.internal.w.e(-1866574392, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$AskedAboutRow$1$1$2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(m0Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var3, int i13) {
                    Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                    if ((i13 & 81) == 16 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarR = d5.r(aVar4, androidx.compose.ui.unit.h.r(16));
                    Block block2 = block;
                    androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var3, 0);
                    int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                    androidx.compose.runtime.b1 b1VarK2 = c0Var3.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var3, a0VarR);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A2 = aVar5.a();
                    if (c0Var3.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var3.q();
                    if (c0Var3.P()) {
                        c0Var3.q0(function0A2);
                    } else {
                        c0Var3.l();
                    }
                    androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var3);
                    y7.n(c0VarD2, a1VarB2, aVar5.e());
                    y7.n(c0VarD2, b1VarK2, aVar5.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar5.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar5.f());
                    androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                    String title = block2.getTitle();
                    Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
                    q50.t(title, d5.r(aVar4, androidx.compose.ui.unit.h.r(8)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var3, IntercomTheme.$stable).getType04SemiBold(), c0Var3, 48, 0, 131068);
                    c0Var3.o();
                }
            }, c0Var2, 54), c0Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
            c0Var2 = c0Var2;
        }
        c0Var2.A();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AskedAboutRowKt.AskedAboutRow$lambda$3(a0Var3, part, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskedAboutRow$lambda$2$lambda$1$lambda$0(Context context, Block it) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "$it");
        IntercomArticleActivity.Companion companion = IntercomArticleActivity.Companion;
        String articleId = it.getArticleId();
        Intrinsics.checkNotNullExpressionValue(articleId, "getArticleId(...)");
        context.startActivity(companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, "conversation", false, true)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskedAboutRow$lambda$3(androidx.compose.ui.a0 a0Var, Part part, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(part, "$part");
        AskedAboutRow(a0Var, part, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void AskedAboutRowPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(97963709);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m277getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AskedAboutRowKt.AskedAboutRowPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AskedAboutRowPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        AskedAboutRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}

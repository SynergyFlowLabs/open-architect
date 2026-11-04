package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBubbleMessageRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ComposableSingletons$BubbleMessageRowKt$lambda-2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,582:1\n87#2:583\n84#2,9:584\n94#2:630\n80#3,6:593\n87#3,3:608\n90#3,2:617\n94#3:629\n391#4,9:599\n400#4:619\n401#4,2:627\n4360#5,6:611\n113#6:620\n113#6:621\n113#6:622\n113#6:623\n113#6:624\n113#6:625\n113#6:626\n*S KotlinDebug\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ComposableSingletons$BubbleMessageRowKt$lambda-2$1\n*L\n360#1:583\n360#1:584,9\n360#1:630\n360#1:593,6\n360#1:608,3\n360#1:617,2\n360#1:629\n360#1:599,9\n360#1:619\n360#1:627,2\n360#1:611,6\n365#1:620\n387#1:621\n398#1:622\n409#1:623\n427#1:624\n438#1:625\n449#1:626\n*E\n"})
final class ComposableSingletons$BubbleMessageRowKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$BubbleMessageRowKt$lambda2$1 INSTANCE = new ComposableSingletons$BubbleMessageRowKt$lambda2$1();

    ComposableSingletons$BubbleMessageRowKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(i6.f(aVar, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null);
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
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
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        float f10 = 16;
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf((Object[]) new Block.Builder[]{BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock()})).withMetadata(new Metadata("Bot", "AI Agent", 1726738186L, CollectionsKt.listOf(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).build();
        Intrinsics.checkNotNullExpressionValue(partBuild, "build(...)");
        GroupingPosition groupingPosition = GroupingPosition.TOP;
        BubbleMessageRowKt.BubbleMessageRow(partBuild, groupingPosition, true, null, "10:08 AM", null, null, null, null, null, null, null, c0Var, 25016, 0, 4072);
        float f11 = 4;
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f11)), c0Var, 6);
        Part partBuild2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild2, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild2, GroupingPosition.MIDDLE, true, null, "11:08 AM", null, null, null, null, null, null, null, c0Var, 25016, 0, 4072);
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f11)), c0Var, 6);
        Part partBuild3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getLongParagraphBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild3, "build(...)");
        GroupingPosition groupingPosition2 = GroupingPosition.BOTTOM;
        BubbleMessageRowKt.BubbleMessageRow(partBuild3, groupingPosition2, true, null, "11:10 AM", null, null, null, null, null, null, null, c0Var, 25016, 0, 4072);
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
        Part partBuild4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).withMetadata(new Metadata("Bob", null, 1726738186L, CollectionsKt.listOf(new Avatar.Builder().withInitials("SK")), 2, null)).build();
        Intrinsics.checkNotNullExpressionValue(partBuild4, "build(...)");
        GroupingPosition groupingPosition3 = GroupingPosition.STANDALONE;
        BubbleMessageRowKt.BubbleMessageRow(partBuild4, groupingPosition3, true, null, "11:10 AM", null, null, null, null, null, null, null, c0Var, 25016, 0, 4072);
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
        Part partBuild5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild5, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild5, groupingPosition, false, null, "11:10 AM", null, null, null, null, null, null, null, c0Var, 25016, 0, 4072);
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f11)), c0Var, 6);
        Part partBuild6 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getLongParagraphBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild6, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild6, groupingPosition2, false, null, "11:08 AM", null, null, null, null, null, null, null, c0Var, 25016, 0, 4072);
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0Var, 6);
        Part partBuild7 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getLongParagraphBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild7, "build(...)");
        BubbleMessageRowKt.BubbleMessageRow(partBuild7, groupingPosition3, false, null, "11:08 AM", null, null, null, null, null, new FailedMessage("Error message", new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }), null, c0Var, 25016, 0, 3048);
        c0Var.o();
    }
}

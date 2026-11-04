package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$LazyMessageListKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$LazyMessageListKt$lambda2$1 INSTANCE = new ComposableSingletons$LazyMessageListKt$lambda2$1();

    ComposableSingletons$LazyMessageListKt$lambda2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
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
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new ContentRow.TeamIntroRow("Our team is here to help you with any questions you have"));
        listCreateListBuilder.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
        Part partBuild = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
        Intrinsics.checkNotNullExpressionValue(partBuild, "build(...)");
        ContentRow.BubbleMessageRow.PartWrapper partWrapper = new ContentRow.BubbleMessageRow.PartWrapper(partBuild, false, true, null, null, 24, null);
        GroupingPosition groupingPosition = GroupingPosition.STANDALONE;
        listCreateListBuilder.add(new ContentRow.BubbleMessageRow(partWrapper, groupingPosition, null, false, false, 16, null));
        listCreateListBuilder.add(new ContentRow.DayDividerRow(164138400L));
        Part partBuild2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
        Intrinsics.checkNotNullExpressionValue(partBuild2, "build(...)");
        listCreateListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild2, false, true, null, null, 24, null), GroupingPosition.TOP, null, false, false, 16, null));
        Part partBuild3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getArticleBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild3, "build(...)");
        listCreateListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild3, false, true, null, null, 24, null), GroupingPosition.MIDDLE, null, false, false, 16, null));
        Part partBuild4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getCreateTicketBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild4, "build(...)");
        listCreateListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild4, false, true, null, null, 24, null), GroupingPosition.BOTTOM, null, false, false, 16, null));
        Part partBuild5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).build();
        Intrinsics.checkNotNullExpressionValue(partBuild5, "build(...)");
        listCreateListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(partBuild5, false, false, null, null, 24, null), groupingPosition, null, true, false, 16, null));
        LazyMessageListKt.LazyMessageList(null, CollectionsKt.build(listCreateListBuilder), null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$LazyMessageListKt$lambda2$1.invoke$lambda$1((ReplyOption) obj);
            }
        }, null, null, null, null, null, false, null, false, null, false, null, c0Var, 24640, 0, 65517);
    }
}

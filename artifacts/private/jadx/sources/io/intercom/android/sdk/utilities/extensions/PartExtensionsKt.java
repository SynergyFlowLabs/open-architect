package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PartExtensionsKt {
    public static final boolean hasNextConcatPartNewStyle(@NotNull List<? extends Part> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 < 0 || i10 >= CollectionsKt.getLastIndex(list)) {
            return false;
        }
        boolean z10 = true & true;
        return shouldConcatenate(list.get(i10), list.get(i10 + 1));
    }

    public static final boolean hasPreviousConcatPartNewStyle(@NotNull List<? extends Part> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return 1 <= i10 && i10 <= CollectionsKt.getLastIndex(list) && shouldConcatenate(list.get(i10 + (-1)), list.get(i10));
    }

    public static final boolean isAttributeCollector(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        return part.getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR && !part.getForm().getAttributes().isEmpty();
    }

    public static final boolean isLinkCard(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        return isSingleBlockPartOfType(part, BlockType.LINK) && MessageStyle.CHAT == part.getMessageStyle();
    }

    public static final boolean isQuickReplyOnly(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        List<ReplyOption> replyOptions = part.getReplyOptions();
        Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
        return !replyOptions.isEmpty() && part.getBlocks().isEmpty();
    }

    private static final boolean isSingleBlockPartOfType(Part part, BlockType blockType) {
        return part.getBlocks().size() == 1 && part.getBlocks().get(0).getType() == blockType;
    }

    public static final boolean isTypingPart(@NotNull Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        return part.getMessageStyle() == MessageStyle.ADMIN_IS_TYPING_STYLE;
    }

    public static final boolean nextPartFromSameParticipant(@NotNull Part part, @NotNull Part nextPart) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        Intrinsics.checkNotNullParameter(nextPart, "nextPart");
        return Intrinsics.areEqual(part.getParticipantId(), nextPart.getParticipantId());
    }

    private static final boolean shouldConcatenate(Part part, Part part2) {
        if (!nextPartFromSameParticipant(part, part2) || Math.abs(part2.getCreatedAt() - part.getCreatedAt()) >= TimeUnit.MINUTES.toSeconds(3L) || isTypingPart(part) || isTypingPart(part2) || isLinkCard(part) || isLinkCard(part2) || part.isEvent().booleanValue() || part2.isEvent().booleanValue() || isAttributeCollector(part) || isAttributeCollector(part2) || isQuickReplyOnly(part) || isQuickReplyOnly(part2)) {
            return false;
        }
        MessageStyle messageStyle = part.getMessageStyle();
        MessageStyle messageStyle2 = MessageStyle.POST;
        if (messageStyle == messageStyle2 || part2.getMessageStyle() == messageStyle2) {
            return false;
        }
        MessageStyle messageStyle3 = part.getMessageStyle();
        MessageStyle messageStyle4 = MessageStyle.NOTE;
        return (messageStyle3 == messageStyle4 || part2.getMessageStyle() == messageStyle4) ? false : true;
    }
}

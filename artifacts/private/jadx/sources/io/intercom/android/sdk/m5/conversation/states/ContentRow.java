package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.tickets.TicketDetailState;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ContentRow {

    @w0(parameters = 0)
    public static final class AskedAboutRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final Part part;

        public AskedAboutRow(@NotNull Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.part = part;
        }

        public static /* synthetic */ AskedAboutRow copy$default(AskedAboutRow askedAboutRow, Part part, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = askedAboutRow.part;
            }
            return askedAboutRow.copy(part);
        }

        @NotNull
        public final Part component1() {
            return this.part;
        }

        @NotNull
        public final AskedAboutRow copy(@NotNull Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            return new AskedAboutRow(part);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof AskedAboutRow) && Intrinsics.areEqual(this.part, ((AskedAboutRow) obj).part)) {
                return true;
            }
            return false;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "asked_about_row_" + this.part.getId();
        }

        @NotNull
        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.part.hashCode();
        }

        @NotNull
        public String toString() {
            return "AskedAboutRow(part=" + this.part + ')';
        }
    }

    @w0(parameters = 0)
    public static final class BigTicketRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final TicketDetailState.TicketDetailContentState ticketDetailContentState;

        @NotNull
        private final String ticketId;

        public BigTicketRow(@NotNull TicketDetailState.TicketDetailContentState ticketDetailContentState, @NotNull String ticketId) {
            Intrinsics.checkNotNullParameter(ticketDetailContentState, "ticketDetailContentState");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            this.ticketDetailContentState = ticketDetailContentState;
            this.ticketId = ticketId;
        }

        public static /* synthetic */ BigTicketRow copy$default(BigTicketRow bigTicketRow, TicketDetailState.TicketDetailContentState ticketDetailContentState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ticketDetailContentState = bigTicketRow.ticketDetailContentState;
            }
            if ((i10 & 2) != 0) {
                str = bigTicketRow.ticketId;
            }
            return bigTicketRow.copy(ticketDetailContentState, str);
        }

        @NotNull
        public final TicketDetailState.TicketDetailContentState component1() {
            return this.ticketDetailContentState;
        }

        @NotNull
        public final String component2() {
            return this.ticketId;
        }

        @NotNull
        public final BigTicketRow copy(@NotNull TicketDetailState.TicketDetailContentState ticketDetailContentState, @NotNull String ticketId) {
            Intrinsics.checkNotNullParameter(ticketDetailContentState, "ticketDetailContentState");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            return new BigTicketRow(ticketDetailContentState, ticketId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BigTicketRow)) {
                return false;
            }
            BigTicketRow bigTicketRow = (BigTicketRow) obj;
            return Intrinsics.areEqual(this.ticketDetailContentState, bigTicketRow.ticketDetailContentState) && Intrinsics.areEqual(this.ticketId, bigTicketRow.ticketId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "big_ticket_row_" + this.ticketId;
        }

        @NotNull
        public final TicketDetailState.TicketDetailContentState getTicketDetailContentState() {
            return this.ticketDetailContentState;
        }

        @NotNull
        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return (this.ticketDetailContentState.hashCode() * 31) + this.ticketId.hashCode();
        }

        @NotNull
        public String toString() {
            return "BigTicketRow(ticketDetailContentState=" + this.ticketDetailContentState + ", ticketId=" + this.ticketId + ')';
        }
    }

    @w0(parameters = 0)
    public static final class ComposerSuggestionRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final List<ReplySuggestion> suggestions;

        public ComposerSuggestionRow(@NotNull List<ReplySuggestion> suggestions) {
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            this.suggestions = suggestions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComposerSuggestionRow copy$default(ComposerSuggestionRow composerSuggestionRow, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = composerSuggestionRow.suggestions;
            }
            return composerSuggestionRow.copy(list);
        }

        @NotNull
        public final List<ReplySuggestion> component1() {
            return this.suggestions;
        }

        @NotNull
        public final ComposerSuggestionRow copy(@NotNull List<ReplySuggestion> suggestions) {
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            return new ComposerSuggestionRow(suggestions);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerSuggestionRow) && Intrinsics.areEqual(this.suggestions, ((ComposerSuggestionRow) obj).suggestions);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "composer_suggestion_row_" + this.suggestions.hashCode();
        }

        @NotNull
        public final List<ReplySuggestion> getSuggestions() {
            return this.suggestions;
        }

        public int hashCode() {
            return this.suggestions.hashCode();
        }

        @NotNull
        public String toString() {
            return "ComposerSuggestionRow(suggestions=" + this.suggestions + ')';
        }
    }

    @w0(parameters = 1)
    public static final class DayDividerRow implements ContentRow {
        public static final int $stable = 0;
        private final long timestamp;

        public DayDividerRow(long j10) {
            this.timestamp = j10;
        }

        public static /* synthetic */ DayDividerRow copy$default(DayDividerRow dayDividerRow, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = dayDividerRow.timestamp;
            }
            return dayDividerRow.copy(j10);
        }

        public final long component1() {
            return this.timestamp;
        }

        @NotNull
        public final DayDividerRow copy(long j10) {
            return new DayDividerRow(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof DayDividerRow) && this.timestamp == ((DayDividerRow) obj).timestamp) {
                return true;
            }
            return false;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "day_divider_row_" + Long.hashCode(this.timestamp);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        @NotNull
        public String toString() {
            return "DayDividerRow(timestamp=" + this.timestamp + ')';
        }
    }

    @w0(parameters = 0)
    public static final class EventRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final Avatar avatar;

        @NotNull
        private final List<EventLabelSegment> labelSegments;

        @NotNull
        private final String partId;

        public EventRow(@NotNull List<EventLabelSegment> labelSegments, @NotNull Avatar avatar, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(labelSegments, "labelSegments");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.labelSegments = labelSegments;
            this.avatar = avatar;
            this.partId = partId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventRow copy$default(EventRow eventRow, List list, Avatar avatar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = eventRow.labelSegments;
            }
            if ((i10 & 2) != 0) {
                avatar = eventRow.avatar;
            }
            if ((i10 & 4) != 0) {
                str = eventRow.partId;
            }
            return eventRow.copy(list, avatar, str);
        }

        @NotNull
        public final List<EventLabelSegment> component1() {
            return this.labelSegments;
        }

        @NotNull
        public final Avatar component2() {
            return this.avatar;
        }

        @NotNull
        public final String component3() {
            return this.partId;
        }

        @NotNull
        public final EventRow copy(@NotNull List<EventLabelSegment> labelSegments, @NotNull Avatar avatar, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(labelSegments, "labelSegments");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new EventRow(labelSegments, avatar, partId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventRow)) {
                return false;
            }
            EventRow eventRow = (EventRow) obj;
            return Intrinsics.areEqual(this.labelSegments, eventRow.labelSegments) && Intrinsics.areEqual(this.avatar, eventRow.avatar) && Intrinsics.areEqual(this.partId, eventRow.partId);
        }

        @NotNull
        public final Avatar getAvatar() {
            return this.avatar;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "event_row_" + this.partId;
        }

        @NotNull
        public final List<EventLabelSegment> getLabelSegments() {
            return this.labelSegments;
        }

        @NotNull
        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return (((this.labelSegments.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.partId.hashCode();
        }

        @NotNull
        public String toString() {
            return "EventRow(labelSegments=" + this.labelSegments + ", avatar=" + this.avatar + ", partId=" + this.partId + ')';
        }
    }

    @w0(parameters = 0)
    public static final class FinAnswerRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final GroupingPosition groupingPosition;

        @NotNull
        private final Part part;

        public FinAnswerRow(@NotNull Part part, @NotNull GroupingPosition groupingPosition) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            this.part = part;
            this.groupingPosition = groupingPosition;
        }

        public static /* synthetic */ FinAnswerRow copy$default(FinAnswerRow finAnswerRow, Part part, GroupingPosition groupingPosition, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = finAnswerRow.part;
            }
            if ((i10 & 2) != 0) {
                groupingPosition = finAnswerRow.groupingPosition;
            }
            return finAnswerRow.copy(part, groupingPosition);
        }

        @NotNull
        public final Part component1() {
            return this.part;
        }

        @NotNull
        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        @NotNull
        public final FinAnswerRow copy(@NotNull Part part, @NotNull GroupingPosition groupingPosition) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            return new FinAnswerRow(part, groupingPosition);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinAnswerRow)) {
                return false;
            }
            FinAnswerRow finAnswerRow = (FinAnswerRow) obj;
            return Intrinsics.areEqual(this.part, finAnswerRow.part) && this.groupingPosition == finAnswerRow.groupingPosition;
        }

        @NotNull
        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "fin_answer_row_" + this.part.getId();
        }

        @NotNull
        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.groupingPosition.hashCode();
        }

        @NotNull
        public String toString() {
            return "FinAnswerRow(part=" + this.part + ", groupingPosition=" + this.groupingPosition + ')';
        }
    }

    @w0(parameters = 0)
    public static final class FinStreamingRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final List<Block> blocks;

        @NotNull
        private final StreamingPart streamingPart;

        /* JADX WARN: Multi-variable type inference failed */
        public FinStreamingRow(@NotNull List<? extends Block> blocks, @NotNull StreamingPart streamingPart) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(streamingPart, "streamingPart");
            this.blocks = blocks;
            this.streamingPart = streamingPart;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinStreamingRow copy$default(FinStreamingRow finStreamingRow, List list, StreamingPart streamingPart, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = finStreamingRow.blocks;
            }
            if ((i10 & 2) != 0) {
                streamingPart = finStreamingRow.streamingPart;
            }
            return finStreamingRow.copy(list, streamingPart);
        }

        @NotNull
        public final List<Block> component1() {
            return this.blocks;
        }

        @NotNull
        public final StreamingPart component2() {
            return this.streamingPart;
        }

        @NotNull
        public final FinStreamingRow copy(@NotNull List<? extends Block> blocks, @NotNull StreamingPart streamingPart) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(streamingPart, "streamingPart");
            return new FinStreamingRow(blocks, streamingPart);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinStreamingRow)) {
                return false;
            }
            FinStreamingRow finStreamingRow = (FinStreamingRow) obj;
            return Intrinsics.areEqual(this.blocks, finStreamingRow.blocks) && Intrinsics.areEqual(this.streamingPart, finStreamingRow.streamingPart);
        }

        @NotNull
        public final List<Block> getBlocks() {
            return this.blocks;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "fin_streaming_row_" + this.blocks.hashCode();
        }

        @NotNull
        public final StreamingPart getStreamingPart() {
            return this.streamingPart;
        }

        public int hashCode() {
            return (this.blocks.hashCode() * 31) + this.streamingPart.hashCode();
        }

        @NotNull
        public String toString() {
            return "FinStreamingRow(blocks=" + this.blocks + ", streamingPart=" + this.streamingPart + ')';
        }
    }

    @w0(parameters = 0)
    public static final class FooterNoticeRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeRow(@NotNull FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeRow copy$default(FooterNoticeRow footerNoticeRow, FooterNoticeState footerNoticeState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                footerNoticeState = footerNoticeRow.footerNoticeState;
            }
            return footerNoticeRow.copy(footerNoticeState);
        }

        @NotNull
        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        @NotNull
        public final FooterNoticeRow copy(@NotNull FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            return new FooterNoticeRow(footerNoticeState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeRow) && Intrinsics.areEqual(this.footerNoticeState, ((FooterNoticeRow) obj).footerNoticeState);
        }

        @NotNull
        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "footer_notice_row_" + this.footerNoticeState.hashCode();
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        @NotNull
        public String toString() {
            return "FooterNoticeRow(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    @w0(parameters = 1)
    public static final class MergedConversationRow implements ContentRow {
        public static final int $stable = 0;

        @Nullable
        private final String conversationId;

        @Nullable
        private final String description;

        @NotNull
        private final String partId;

        public MergedConversationRow(@Nullable String str, @Nullable String str2, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.description = str;
            this.conversationId = str2;
            this.partId = partId;
        }

        public static /* synthetic */ MergedConversationRow copy$default(MergedConversationRow mergedConversationRow, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = mergedConversationRow.description;
            }
            if ((i10 & 2) != 0) {
                str2 = mergedConversationRow.conversationId;
            }
            if ((i10 & 4) != 0) {
                str3 = mergedConversationRow.partId;
            }
            return mergedConversationRow.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.description;
        }

        @Nullable
        public final String component2() {
            return this.conversationId;
        }

        @NotNull
        public final String component3() {
            return this.partId;
        }

        @NotNull
        public final MergedConversationRow copy(@Nullable String str, @Nullable String str2, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new MergedConversationRow(str, str2, partId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MergedConversationRow)) {
                return false;
            }
            MergedConversationRow mergedConversationRow = (MergedConversationRow) obj;
            return Intrinsics.areEqual(this.description, mergedConversationRow.description) && Intrinsics.areEqual(this.conversationId, mergedConversationRow.conversationId) && Intrinsics.areEqual(this.partId, mergedConversationRow.partId);
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "merged_conversation_row_" + this.partId;
        }

        @NotNull
        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            String str = this.description;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.conversationId;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.partId.hashCode();
        }

        @NotNull
        public String toString() {
            return "MergedConversationRow(description=" + this.description + ", conversationId=" + this.conversationId + ", partId=" + this.partId + ')';
        }
    }

    @w0(parameters = 1)
    public static final class NewMessagesRow implements ContentRow {
        public static final int $stable = 0;

        @NotNull
        private final String partId;

        public NewMessagesRow(@NotNull String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.partId = partId;
        }

        public static /* synthetic */ NewMessagesRow copy$default(NewMessagesRow newMessagesRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = newMessagesRow.partId;
            }
            return newMessagesRow.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.partId;
        }

        @NotNull
        public final NewMessagesRow copy(@NotNull String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new NewMessagesRow(partId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewMessagesRow) && Intrinsics.areEqual(this.partId, ((NewMessagesRow) obj).partId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "new_messages_row_" + this.partId;
        }

        @NotNull
        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return this.partId.hashCode();
        }

        @NotNull
        public String toString() {
            return "NewMessagesRow(partId=" + this.partId + ')';
        }
    }

    @w0(parameters = 0)
    public static final class NoteCardRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final String companyName;

        @NotNull
        private final Part part;

        public NoteCardRow(@NotNull Part part, @NotNull String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.part = part;
            this.companyName = companyName;
        }

        public static /* synthetic */ NoteCardRow copy$default(NoteCardRow noteCardRow, Part part, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = noteCardRow.part;
            }
            if ((i10 & 2) != 0) {
                str = noteCardRow.companyName;
            }
            return noteCardRow.copy(part, str);
        }

        @NotNull
        public final Part component1() {
            return this.part;
        }

        @NotNull
        public final String component2() {
            return this.companyName;
        }

        @NotNull
        public final NoteCardRow copy(@NotNull Part part, @NotNull String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            return new NoteCardRow(part, companyName);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteCardRow)) {
                return false;
            }
            NoteCardRow noteCardRow = (NoteCardRow) obj;
            return Intrinsics.areEqual(this.part, noteCardRow.part) && Intrinsics.areEqual(this.companyName, noteCardRow.companyName);
        }

        @NotNull
        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "note_card_row_" + this.part.getId();
        }

        @NotNull
        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.companyName.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoteCardRow(part=" + this.part + ", companyName=" + this.companyName + ')';
        }
    }

    @w0(parameters = 0)
    public static final class PostCardRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final String companyName;

        @NotNull
        private final Part part;

        public PostCardRow(@NotNull Part part, @NotNull String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.part = part;
            this.companyName = companyName;
        }

        public static /* synthetic */ PostCardRow copy$default(PostCardRow postCardRow, Part part, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part = postCardRow.part;
            }
            if ((i10 & 2) != 0) {
                str = postCardRow.companyName;
            }
            return postCardRow.copy(part, str);
        }

        @NotNull
        public final Part component1() {
            return this.part;
        }

        @NotNull
        public final String component2() {
            return this.companyName;
        }

        @NotNull
        public final PostCardRow copy(@NotNull Part part, @NotNull String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            return new PostCardRow(part, companyName);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostCardRow)) {
                return false;
            }
            PostCardRow postCardRow = (PostCardRow) obj;
            if (Intrinsics.areEqual(this.part, postCardRow.part) && Intrinsics.areEqual(this.companyName, postCardRow.companyName)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "post_card_row_" + this.part.getId();
        }

        @NotNull
        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.companyName.hashCode();
        }

        @NotNull
        public String toString() {
            return "PostCardRow(part=" + this.part + ", companyName=" + this.companyName + ')';
        }
    }

    @w0(parameters = 0)
    public static final class QuickRepliesRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final String partId;

        @NotNull
        private final List<ReplyOption> replyOptions;

        public QuickRepliesRow(@NotNull List<ReplyOption> replyOptions, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.replyOptions = replyOptions;
            this.partId = partId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuickRepliesRow copy$default(QuickRepliesRow quickRepliesRow, List list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = quickRepliesRow.replyOptions;
            }
            if ((i10 & 2) != 0) {
                str = quickRepliesRow.partId;
            }
            return quickRepliesRow.copy(list, str);
        }

        @NotNull
        public final List<ReplyOption> component1() {
            return this.replyOptions;
        }

        @NotNull
        public final String component2() {
            return this.partId;
        }

        @NotNull
        public final QuickRepliesRow copy(@NotNull List<ReplyOption> replyOptions, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new QuickRepliesRow(replyOptions, partId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickRepliesRow)) {
                return false;
            }
            QuickRepliesRow quickRepliesRow = (QuickRepliesRow) obj;
            return Intrinsics.areEqual(this.replyOptions, quickRepliesRow.replyOptions) && Intrinsics.areEqual(this.partId, quickRepliesRow.partId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "quick_replies_row_" + this.partId;
        }

        @NotNull
        public final String getPartId() {
            return this.partId;
        }

        @NotNull
        public final List<ReplyOption> getReplyOptions() {
            return this.replyOptions;
        }

        public int hashCode() {
            return (this.replyOptions.hashCode() * 31) + this.partId.hashCode();
        }

        @NotNull
        public String toString() {
            return "QuickRepliesRow(replyOptions=" + this.replyOptions + ", partId=" + this.partId + ')';
        }
    }

    @w0(parameters = 1)
    public static final class SpecialNoticeRow implements ContentRow {
        public static final int $stable = 0;

        @NotNull
        private final String message;

        public SpecialNoticeRow(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ SpecialNoticeRow copy$default(SpecialNoticeRow specialNoticeRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = specialNoticeRow.message;
            }
            return specialNoticeRow.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final SpecialNoticeRow copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new SpecialNoticeRow(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecialNoticeRow) && Intrinsics.areEqual(this.message, ((SpecialNoticeRow) obj).message);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "special_notice_row_" + this.message.hashCode();
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "SpecialNoticeRow(message=" + this.message + ')';
        }
    }

    @w0(parameters = 1)
    public static final class TeamIntroRow implements ContentRow {
        public static final int $stable = 0;

        @NotNull
        private final String message;

        public TeamIntroRow(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ TeamIntroRow copy$default(TeamIntroRow teamIntroRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = teamIntroRow.message;
            }
            return teamIntroRow.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final TeamIntroRow copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TeamIntroRow(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeamIntroRow) && Intrinsics.areEqual(this.message, ((TeamIntroRow) obj).message);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "team_intro_row_" + this.message.hashCode();
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "TeamIntroRow(message=" + this.message + ')';
        }
    }

    @w0(parameters = 1)
    public static final class TicketStatusRow implements ContentRow {
        public static final int $stable = 0;
        private final long createdAt;

        @Nullable
        private final String customStateLabel;

        @Nullable
        private final String customStatePrefix;

        @NotNull
        private final String partId;

        @NotNull
        private final String ticketEventStatus;

        @NotNull
        private final String ticketStatusText;

        public TicketStatusRow(@NotNull String ticketEventStatus, @NotNull String ticketStatusText, long j10, @Nullable String str, @Nullable String str2, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(ticketEventStatus, "ticketEventStatus");
            Intrinsics.checkNotNullParameter(ticketStatusText, "ticketStatusText");
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.ticketEventStatus = ticketEventStatus;
            this.ticketStatusText = ticketStatusText;
            this.createdAt = j10;
            this.customStateLabel = str;
            this.customStatePrefix = str2;
            this.partId = partId;
        }

        public static /* synthetic */ TicketStatusRow copy$default(TicketStatusRow ticketStatusRow, String str, String str2, long j10, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketStatusRow.ticketEventStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = ticketStatusRow.ticketStatusText;
            }
            if ((i10 & 4) != 0) {
                j10 = ticketStatusRow.createdAt;
            }
            if ((i10 & 8) != 0) {
                str3 = ticketStatusRow.customStateLabel;
            }
            if ((i10 & 16) != 0) {
                str4 = ticketStatusRow.customStatePrefix;
            }
            if ((i10 & 32) != 0) {
                str5 = ticketStatusRow.partId;
            }
            String str6 = str5;
            String str7 = str3;
            long j11 = j10;
            return ticketStatusRow.copy(str, str2, j11, str7, str4, str6);
        }

        @NotNull
        public final String component1() {
            return this.ticketEventStatus;
        }

        @NotNull
        public final String component2() {
            return this.ticketStatusText;
        }

        public final long component3() {
            return this.createdAt;
        }

        @Nullable
        public final String component4() {
            return this.customStateLabel;
        }

        @Nullable
        public final String component5() {
            return this.customStatePrefix;
        }

        @NotNull
        public final String component6() {
            return this.partId;
        }

        @NotNull
        public final TicketStatusRow copy(@NotNull String ticketEventStatus, @NotNull String ticketStatusText, long j10, @Nullable String str, @Nullable String str2, @NotNull String partId) {
            Intrinsics.checkNotNullParameter(ticketEventStatus, "ticketEventStatus");
            Intrinsics.checkNotNullParameter(ticketStatusText, "ticketStatusText");
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new TicketStatusRow(ticketEventStatus, ticketStatusText, j10, str, str2, partId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketStatusRow)) {
                return false;
            }
            TicketStatusRow ticketStatusRow = (TicketStatusRow) obj;
            return Intrinsics.areEqual(this.ticketEventStatus, ticketStatusRow.ticketEventStatus) && Intrinsics.areEqual(this.ticketStatusText, ticketStatusRow.ticketStatusText) && this.createdAt == ticketStatusRow.createdAt && Intrinsics.areEqual(this.customStateLabel, ticketStatusRow.customStateLabel) && Intrinsics.areEqual(this.customStatePrefix, ticketStatusRow.customStatePrefix) && Intrinsics.areEqual(this.partId, ticketStatusRow.partId);
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final String getCustomStateLabel() {
            return this.customStateLabel;
        }

        @Nullable
        public final String getCustomStatePrefix() {
            return this.customStatePrefix;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "ticket_status_row_" + this.partId;
        }

        @NotNull
        public final String getPartId() {
            return this.partId;
        }

        @NotNull
        public final String getTicketEventStatus() {
            return this.ticketEventStatus;
        }

        @NotNull
        public final String getTicketStatusText() {
            return this.ticketStatusText;
        }

        public int hashCode() {
            int iHashCode = ((((this.ticketEventStatus.hashCode() * 31) + this.ticketStatusText.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31;
            String str = this.customStateLabel;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customStatePrefix;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.partId.hashCode();
        }

        @NotNull
        public String toString() {
            return "TicketStatusRow(ticketEventStatus=" + this.ticketEventStatus + ", ticketStatusText=" + this.ticketStatusText + ", createdAt=" + this.createdAt + ", customStateLabel=" + this.customStateLabel + ", customStatePrefix=" + this.customStatePrefix + ", partId=" + this.partId + ')';
        }
    }

    @w0(parameters = 0)
    public static final class TypingIndicatorRow implements ContentRow {
        public static final int $stable = 8;

        @NotNull
        private final CurrentlyTypingState currentlyTypingState;

        public TypingIndicatorRow(@NotNull CurrentlyTypingState currentlyTypingState) {
            Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
            this.currentlyTypingState = currentlyTypingState;
        }

        public static /* synthetic */ TypingIndicatorRow copy$default(TypingIndicatorRow typingIndicatorRow, CurrentlyTypingState currentlyTypingState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                currentlyTypingState = typingIndicatorRow.currentlyTypingState;
            }
            return typingIndicatorRow.copy(currentlyTypingState);
        }

        @NotNull
        public final CurrentlyTypingState component1() {
            return this.currentlyTypingState;
        }

        @NotNull
        public final TypingIndicatorRow copy(@NotNull CurrentlyTypingState currentlyTypingState) {
            Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
            return new TypingIndicatorRow(currentlyTypingState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypingIndicatorRow) && Intrinsics.areEqual(this.currentlyTypingState, ((TypingIndicatorRow) obj).currentlyTypingState);
        }

        @NotNull
        public final CurrentlyTypingState getCurrentlyTypingState() {
            return this.currentlyTypingState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "typing_indicator_row_" + this.currentlyTypingState.hashCode();
        }

        public int hashCode() {
            return this.currentlyTypingState.hashCode();
        }

        @NotNull
        public String toString() {
            return "TypingIndicatorRow(currentlyTypingState=" + this.currentlyTypingState + ')';
        }
    }

    @NotNull
    String getKey();

    @w0(parameters = 0)
    public static final class BubbleMessageRow implements ContentRow {
        public static final int $stable = 8;

        @Nullable
        private final PendingMessage.FailedImageUploadData failedImageUploadData;

        @NotNull
        private final GroupingPosition groupingPosition;
        private final boolean isFailed;
        private final boolean isPending;

        @NotNull
        private final PartWrapper partWrapper;

        public BubbleMessageRow(@NotNull PartWrapper partWrapper, @NotNull GroupingPosition groupingPosition, @Nullable PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(partWrapper, "partWrapper");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            this.partWrapper = partWrapper;
            this.groupingPosition = groupingPosition;
            this.failedImageUploadData = failedImageUploadData;
            this.isFailed = z10;
            this.isPending = z11;
        }

        public static /* synthetic */ BubbleMessageRow copy$default(BubbleMessageRow bubbleMessageRow, PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                partWrapper = bubbleMessageRow.partWrapper;
            }
            if ((i10 & 2) != 0) {
                groupingPosition = bubbleMessageRow.groupingPosition;
            }
            if ((i10 & 4) != 0) {
                failedImageUploadData = bubbleMessageRow.failedImageUploadData;
            }
            if ((i10 & 8) != 0) {
                z10 = bubbleMessageRow.isFailed;
            }
            if ((i10 & 16) != 0) {
                z11 = bubbleMessageRow.isPending;
            }
            boolean z12 = z11;
            PendingMessage.FailedImageUploadData failedImageUploadData2 = failedImageUploadData;
            return bubbleMessageRow.copy(partWrapper, groupingPosition, failedImageUploadData2, z10, z12);
        }

        @NotNull
        public final PartWrapper component1() {
            return this.partWrapper;
        }

        @NotNull
        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        @Nullable
        public final PendingMessage.FailedImageUploadData component3() {
            return this.failedImageUploadData;
        }

        public final boolean component4() {
            return this.isFailed;
        }

        public final boolean component5() {
            return this.isPending;
        }

        @NotNull
        public final BubbleMessageRow copy(@NotNull PartWrapper partWrapper, @NotNull GroupingPosition groupingPosition, @Nullable PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(partWrapper, "partWrapper");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            return new BubbleMessageRow(partWrapper, groupingPosition, failedImageUploadData, z10, z11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleMessageRow)) {
                return false;
            }
            BubbleMessageRow bubbleMessageRow = (BubbleMessageRow) obj;
            return Intrinsics.areEqual(this.partWrapper, bubbleMessageRow.partWrapper) && this.groupingPosition == bubbleMessageRow.groupingPosition && Intrinsics.areEqual(this.failedImageUploadData, bubbleMessageRow.failedImageUploadData) && this.isFailed == bubbleMessageRow.isFailed && this.isPending == bubbleMessageRow.isPending;
        }

        @Nullable
        public final PendingMessage.FailedImageUploadData getFailedImageUploadData() {
            return this.failedImageUploadData;
        }

        @NotNull
        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        @NotNull
        public String getKey() {
            return "message_row_" + this.partWrapper.getPart().getId();
        }

        @NotNull
        public final PartWrapper getPartWrapper() {
            return this.partWrapper;
        }

        public int hashCode() {
            int iHashCode = ((this.partWrapper.hashCode() * 31) + this.groupingPosition.hashCode()) * 31;
            PendingMessage.FailedImageUploadData failedImageUploadData = this.failedImageUploadData;
            return ((((iHashCode + (failedImageUploadData == null ? 0 : failedImageUploadData.hashCode())) * 31) + Boolean.hashCode(this.isFailed)) * 31) + Boolean.hashCode(this.isPending);
        }

        public final boolean isFailed() {
            return this.isFailed;
        }

        public final boolean isPending() {
            return this.isPending;
        }

        @NotNull
        public String toString() {
            return "BubbleMessageRow(partWrapper=" + this.partWrapper + ", groupingPosition=" + this.groupingPosition + ", failedImageUploadData=" + this.failedImageUploadData + ", isFailed=" + this.isFailed + ", isPending=" + this.isPending + ')';
        }

        @w0(parameters = 0)
        public static final class PartWrapper {
            public static final int $stable = 8;

            @NotNull
            private final List<String> failedAttributeIdentifiers;
            private final boolean isAdminOrAltParticipant;
            private final boolean isLastPart;

            @NotNull
            private final List<String> loadingAttributeIdentifiers;

            @NotNull
            private final Part part;

            public PartWrapper(@NotNull Part part, boolean z10, boolean z11, @NotNull List<String> failedAttributeIdentifiers, @NotNull List<String> loadingAttributeIdentifiers) {
                Intrinsics.checkNotNullParameter(part, "part");
                Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
                Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
                this.part = part;
                this.isLastPart = z10;
                this.isAdminOrAltParticipant = z11;
                this.failedAttributeIdentifiers = failedAttributeIdentifiers;
                this.loadingAttributeIdentifiers = loadingAttributeIdentifiers;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PartWrapper copy$default(PartWrapper partWrapper, Part part, boolean z10, boolean z11, List list, List list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    part = partWrapper.part;
                }
                if ((i10 & 2) != 0) {
                    z10 = partWrapper.isLastPart;
                }
                if ((i10 & 4) != 0) {
                    z11 = partWrapper.isAdminOrAltParticipant;
                }
                if ((i10 & 8) != 0) {
                    list = partWrapper.failedAttributeIdentifiers;
                }
                if ((i10 & 16) != 0) {
                    list2 = partWrapper.loadingAttributeIdentifiers;
                }
                List list3 = list2;
                boolean z12 = z11;
                return partWrapper.copy(part, z10, z12, list, list3);
            }

            @NotNull
            public final Part component1() {
                return this.part;
            }

            public final boolean component2() {
                return this.isLastPart;
            }

            public final boolean component3() {
                return this.isAdminOrAltParticipant;
            }

            @NotNull
            public final List<String> component4() {
                return this.failedAttributeIdentifiers;
            }

            @NotNull
            public final List<String> component5() {
                return this.loadingAttributeIdentifiers;
            }

            @NotNull
            public final PartWrapper copy(@NotNull Part part, boolean z10, boolean z11, @NotNull List<String> failedAttributeIdentifiers, @NotNull List<String> loadingAttributeIdentifiers) {
                Intrinsics.checkNotNullParameter(part, "part");
                Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
                Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
                return new PartWrapper(part, z10, z11, failedAttributeIdentifiers, loadingAttributeIdentifiers);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PartWrapper)) {
                    return false;
                }
                PartWrapper partWrapper = (PartWrapper) obj;
                return Intrinsics.areEqual(this.part, partWrapper.part) && this.isLastPart == partWrapper.isLastPart && this.isAdminOrAltParticipant == partWrapper.isAdminOrAltParticipant && Intrinsics.areEqual(this.failedAttributeIdentifiers, partWrapper.failedAttributeIdentifiers) && Intrinsics.areEqual(this.loadingAttributeIdentifiers, partWrapper.loadingAttributeIdentifiers);
            }

            @NotNull
            public final List<String> getFailedAttributeIdentifiers() {
                return this.failedAttributeIdentifiers;
            }

            @NotNull
            public final List<String> getLoadingAttributeIdentifiers() {
                return this.loadingAttributeIdentifiers;
            }

            @NotNull
            public final Part getPart() {
                return this.part;
            }

            public int hashCode() {
                return (((((((this.part.hashCode() * 31) + Boolean.hashCode(this.isLastPart)) * 31) + Boolean.hashCode(this.isAdminOrAltParticipant)) * 31) + this.failedAttributeIdentifiers.hashCode()) * 31) + this.loadingAttributeIdentifiers.hashCode();
            }

            public final boolean isAdminOrAltParticipant() {
                return this.isAdminOrAltParticipant;
            }

            public final boolean isLastPart() {
                return this.isLastPart;
            }

            @NotNull
            public String toString() {
                return "PartWrapper(part=" + this.part + ", isLastPart=" + this.isLastPart + ", isAdminOrAltParticipant=" + this.isAdminOrAltParticipant + ", failedAttributeIdentifiers=" + this.failedAttributeIdentifiers + ", loadingAttributeIdentifiers=" + this.loadingAttributeIdentifiers + ')';
            }

            public /* synthetic */ PartWrapper(Part part, boolean z10, boolean z11, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(part, z10, z11, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list2);
            }
        }

        public /* synthetic */ BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(partWrapper, groupingPosition, failedImageUploadData, z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}

package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.l;

/* JADX INFO: loaded from: classes13.dex */
public class Part implements Parcelable {
    private final AiAnswerInfo aiAnswerInfo;
    private final List<Attachments> attachments;
    private final List<Block> blocks;
    private String clientAssignedUuid;
    private final long createdAt;
    private final DeliveryOption deliveryOption;
    private final EventData eventData;
    private final Form form;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f293119id;
    private final boolean isInitialMessage;
    private MessageState messageState;
    private final MessageStyle messageStyle;

    @p0
    private final Metadata metadata;
    private Conversation parentConversation;
    private Participant participant;
    private String participantId;
    private final boolean participantIsAdmin;
    private final ReactionReply reactionReply;
    private final List<ReplyOption> replyOptions;
    private String seenByAdmin;
    private final List<Source> sources;
    private final String summary;
    public static final Part NULL = new Part(new Builder());
    public static final Parcelable.Creator<Part> CREATOR = new Parcelable.Creator<Part>() { // from class: io.intercom.android.sdk.models.Part.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Part createFromParcel(Parcel parcel) {
            return new Part(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Part[] newArray(int i10) {
            return new Part[i10];
        }
    };

    public static final class Builder {

        @p0
        AiAnswerInfo ai_answer_info;

        @p0
        List<Attachments.Builder> attachments;

        @p0
        List<Block.Builder> body;

        @p0
        String client_assigned_uuid;
        long created_at;

        @p0
        DeliveryOption delivery_option;

        @p0
        EventData event_data;

        @p0
        Form form;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @p0
        String f293120id;
        boolean is_initial_message;

        @p0
        MessageStyle message_style;

        @p0
        Metadata metadata;

        @p0
        String participant_id;
        boolean participant_is_admin;

        @p0
        ReactionReply.Builder reactions_reply;

        @p0
        List<ReplyOption> reply_options;

        @p0
        String seen_by_admin;

        @p0
        List<Source> sources;

        @p0
        String summary;

        public Part build() {
            return new Part(this);
        }

        public Builder withAiAnswerInfo(AiAnswerInfo aiAnswerInfo) {
            this.ai_answer_info = aiAnswerInfo;
            return this;
        }

        public Builder withAttachments(List<Attachments.Builder> list) {
            this.attachments = list;
            return this;
        }

        public Builder withBlocks(List<Block.Builder> list) {
            this.body = list;
            return this;
        }

        public Builder withClientAssignedUuid(String str) {
            this.client_assigned_uuid = str;
            return this;
        }

        public Builder withCreatedAt(long j10) {
            this.created_at = j10;
            return this;
        }

        public Builder withDeliveryOptions(DeliveryOption deliveryOption) {
            this.delivery_option = deliveryOption;
            return this;
        }

        public Builder withEventData(EventData eventData) {
            this.event_data = eventData;
            return this;
        }

        public Builder withForm(Form form) {
            this.form = form;
            return this;
        }

        public Builder withId(String str) {
            this.f293120id = str;
            return this;
        }

        public Builder withIsInitialMessage(Boolean bool) {
            this.is_initial_message = bool.booleanValue();
            return this;
        }

        public Builder withMetadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder withParticipantId(String str) {
            this.participant_id = str;
            return this;
        }

        public Builder withParticipantIsAdmin(boolean z10) {
            this.participant_is_admin = z10;
            return this;
        }

        public Builder withReplyOptions(List<ReplyOption> list) {
            this.reply_options = list;
            return this;
        }

        public Builder withSeenByAdmin(String str) {
            this.seen_by_admin = str;
            return this;
        }

        public Builder withSources(List<Source> list) {
            this.sources = list;
            return this;
        }

        public Builder withStyle(MessageStyle messageStyle) {
            this.message_style = messageStyle;
            return this;
        }

        public Builder withSummary(String str) {
            this.summary = str;
            return this;
        }
    }

    public enum MessageState {
        SENDING,
        FAILED,
        UPLOAD_FAILED,
        NORMAL
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Part) {
            Part part = (Part) obj;
            if (((this.f293119id.equals(part.f293119id) && this.form.equals(part.form)) || (!this.clientAssignedUuid.equals("") && this.clientAssignedUuid.equals(part.clientAssignedUuid))) && this.seenByAdmin.equals(part.seenByAdmin)) {
                return true;
            }
        }
        return false;
    }

    public AiAnswerInfo getAiAnswerInfo() {
        return this.aiAnswerInfo;
    }

    public List<Attachments> getAttachments() {
        return this.attachments;
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

    public EventData getEventData() {
        return this.eventData;
    }

    public Form getForm() {
        return this.form;
    }

    public String getId() {
        return this.f293119id;
    }

    public MessageState getMessageState() {
        return this.messageState;
    }

    public MessageStyle getMessageStyle() {
        return this.messageStyle;
    }

    @p0
    public Metadata getMetadata() {
        return this.metadata;
    }

    @l(message = "This was added for use in tickets. With conversation rewrite, we should use {@link ContentRow.MessageRow.PartWrapper )} instead to add in data that we require from the parent conversation object.")
    public Conversation getParentConversation() {
        return this.parentConversation;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    public List<ReplyOption> getReplyOptions() {
        return this.replyOptions;
    }

    public String getSeenByAdmin() {
        return this.participantIsAdmin ? SeenState.HIDE : this.seenByAdmin;
    }

    public List<Source> getSources() {
        return this.sources;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getUuid() {
        return this.clientAssignedUuid;
    }

    public boolean hasAttachments() {
        return !this.attachments.isEmpty();
    }

    public int hashCode() {
        return this.f293119id.hashCode();
    }

    public boolean isAdmin() {
        return this.participantIsAdmin;
    }

    public Boolean isEvent() {
        return Boolean.valueOf((this.eventData.getEventAsPlainText().isEmpty() && this.eventData.getEventContent().isEmpty() && (this.eventData.getCustomStateLabel() == null || this.eventData.getCustomStateLabel().isEmpty()) && (this.eventData.getMergedConversationId() == null || this.eventData.getMergedConversationId().isEmpty())) ? false : true);
    }

    public boolean isInitialMessage() {
        return this.isInitialMessage;
    }

    public boolean isReply() {
        return !this.isInitialMessage;
    }

    public boolean isUser() {
        return !isAdmin();
    }

    public void setMessageState(MessageState messageState) {
        this.messageState = messageState;
    }

    public void setParentConversation(Conversation conversation) {
        this.parentConversation = conversation;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
        this.participantId = participant.getId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f293119id);
        parcel.writeString(this.participantId);
        parcel.writeByte(this.participantIsAdmin ? (byte) 1 : (byte) 0);
        parcel.writeList(this.blocks);
        parcel.writeList(this.attachments);
        parcel.writeList(this.replyOptions);
        parcel.writeValue(this.messageStyle);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.summary);
        if (ReactionReply.isNull(this.reactionReply)) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeValue(this.reactionReply);
        }
        parcel.writeString(this.seenByAdmin);
        parcel.writeValue(this.participant);
        parcel.writeValue(this.eventData);
        parcel.writeByte(this.isInitialMessage ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.deliveryOption);
        parcel.writeValue(this.form);
        parcel.writeList(this.sources);
        parcel.writeValue(this.aiAnswerInfo);
        parcel.writeValue(this.metadata);
    }

    public Part() {
        this(new Builder());
    }

    private Part(Builder builder) {
        ReactionReply reactionReplyBuild;
        String str = builder.f293120id;
        this.f293119id = str == null ? UUID.randomUUID().toString() : str;
        this.participantId = NullSafety.valueOrEmpty(builder.participant_id);
        this.participantIsAdmin = builder.participant_is_admin;
        this.summary = NullSafety.valueOrEmpty(builder.summary);
        this.createdAt = builder.created_at;
        MessageStyle messageStyle = builder.message_style;
        this.messageStyle = messageStyle == null ? MessageStyle.CHAT : messageStyle;
        DeliveryOption deliveryOption = builder.delivery_option;
        this.deliveryOption = deliveryOption == null ? DeliveryOption.SUMMARY : deliveryOption;
        this.blocks = new ArrayList();
        List<Block.Builder> list = builder.body;
        if (list != null) {
            Iterator<Block.Builder> it = list.iterator();
            while (it.hasNext()) {
                this.blocks.add(it.next().build());
            }
        }
        ReactionReply.Builder builder2 = builder.reactions_reply;
        if (builder2 == null) {
            reactionReplyBuild = ReactionReply.NULL;
        } else {
            reactionReplyBuild = builder2.build();
        }
        this.reactionReply = reactionReplyBuild;
        String str2 = builder.seen_by_admin;
        this.seenByAdmin = str2 == null ? SeenState.HIDE : str2;
        this.attachments = new ArrayList();
        List<Attachments.Builder> list2 = builder.attachments;
        if (list2 != null) {
            Iterator<Attachments.Builder> it2 = list2.iterator();
            while (it2.hasNext()) {
                this.attachments.add(it2.next().build());
            }
        }
        EventData eventData = builder.event_data;
        this.eventData = eventData == null ? EventData.NULL : eventData;
        this.parentConversation = new Conversation();
        this.participant = Participant.NULL;
        this.isInitialMessage = builder.is_initial_message;
        this.messageState = MessageState.NORMAL;
        ArrayList arrayList = new ArrayList();
        this.replyOptions = arrayList;
        List<ReplyOption> list3 = builder.reply_options;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        Form form = builder.form;
        this.form = form == null ? new Form("", Collections.EMPTY_LIST, false) : form;
        this.clientAssignedUuid = NullSafety.valueOrEmpty(builder.client_assigned_uuid);
        ArrayList arrayList2 = new ArrayList();
        this.sources = arrayList2;
        List<Source> list4 = builder.sources;
        if (list4 != null) {
            arrayList2.addAll(list4);
        }
        AiAnswerInfo aiAnswerInfo = builder.ai_answer_info;
        this.aiAnswerInfo = aiAnswerInfo == null ? new AiAnswerInfo("") : aiAnswerInfo;
        this.metadata = builder.metadata;
    }

    private Part(Parcel parcel) {
        this.f293119id = parcel.readString();
        this.participantId = parcel.readString();
        this.participantIsAdmin = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.blocks = arrayList;
        parcel.readList(arrayList, Block.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.attachments = arrayList2;
        parcel.readList(arrayList2, Attachments.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.replyOptions = arrayList3;
        parcel.readList(arrayList3, ReplyOption.class.getClassLoader());
        this.messageStyle = (MessageStyle) parcel.readValue(MessageStyle.class.getClassLoader());
        this.createdAt = parcel.readLong();
        this.summary = parcel.readString();
        if (parcel.readByte() == 0) {
            this.reactionReply = ReactionReply.NULL;
        } else {
            this.reactionReply = (ReactionReply) parcel.readValue(ReactionReply.class.getClassLoader());
        }
        this.seenByAdmin = parcel.readString();
        this.participant = (Participant) parcel.readValue(Participant.class.getClassLoader());
        this.eventData = (EventData) parcel.readValue(EventData.class.getClassLoader());
        this.isInitialMessage = parcel.readByte() != 0;
        this.deliveryOption = (DeliveryOption) parcel.readValue(DeliveryOption.class.getClassLoader());
        this.form = (Form) parcel.readValue(Form.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.sources = arrayList4;
        parcel.readList(arrayList4, Source.class.getClassLoader());
        this.aiAnswerInfo = (AiAnswerInfo) parcel.readValue(AiAnswerInfo.class.getClassLoader());
        this.metadata = (Metadata) parcel.readValue(Metadata.class.getClassLoader());
    }
}

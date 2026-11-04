package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.sentry.a8;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class Ticket {

    @c("assignee")
    @NotNull
    private final Participant.Builder assignee;

    @c(a8.b.f303905f)
    @NotNull
    private final List<TicketAttribute> attributes;

    @c("conversation_button")
    @Nullable
    private final ConversationButton conversationButton;

    @c(CreateTicketDestinationKt.CONVERSATION_ID)
    @Nullable
    private final String conversationId;

    @c("current_status")
    @NotNull
    private final Status currentStatus;

    @c("description")
    @NotNull
    private final String description;

    @c("emoji")
    @NotNull
    private final String emoji;

    @c("icon_url")
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @NotNull
    private final String f293123id;

    @c("read")
    @Nullable
    private final Boolean isRead;

    @c("latest_status_updated_at")
    private final long latestStatusUpdatedAt;

    @c("public_ticket_id")
    @Nullable
    private final String publicId;

    @c("status_list")
    @NotNull
    private final List<Status> statusList;

    @c(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @c("title")
    @NotNull
    private final String title;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Ticket NULL = new Ticket(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 32767, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ticket getNULL() {
            return Ticket.NULL;
        }

        private Companion() {
        }
    }

    @w0(parameters = 1)
    public static final class ConversationButton {
        public static final int $stable = 0;

        @c("icon")
        @Nullable
        private final IconType icon;

        @c("text")
        @NotNull
        private final String text;

        public enum IconType {
            SEND,
            CONVERSATION;

            private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

            @NotNull
            public static a<IconType> getEntries() {
                return $ENTRIES;
            }
        }

        public ConversationButton(@Nullable IconType iconType, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = iconType;
            this.text = text;
        }

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i10 & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        @Nullable
        public final IconType component1() {
            return this.icon;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final ConversationButton copy(@Nullable IconType iconType, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ConversationButton(iconType, text);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) obj;
            return this.icon == conversationButton.icon && Intrinsics.areEqual(this.text, conversationButton.text);
        }

        @Nullable
        public final IconType getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            IconType iconType = this.icon;
            return ((iconType == null ? 0 : iconType.hashCode()) * 31) + this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationButton(icon=" + this.icon + ", text=" + this.text + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Status {
        public static final int $stable = 0;

        @c("created_date")
        private final long createdDate;

        @c("is_current_status")
        private final boolean isCurrentStatus;

        @c("status_detail")
        @NotNull
        private final String statusDetail;

        @c("title")
        @NotNull
        private final String title;

        @c("type")
        @NotNull
        private final String type;

        public Status() {
            this(null, null, null, false, 0L, 31, null);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = status.title;
            }
            if ((i10 & 2) != 0) {
                str2 = status.type;
            }
            if ((i10 & 4) != 0) {
                str3 = status.statusDetail;
            }
            if ((i10 & 8) != 0) {
                z10 = status.isCurrentStatus;
            }
            if ((i10 & 16) != 0) {
                j10 = status.createdDate;
            }
            long j11 = j10;
            return status.copy(str, str2, str3, z10, j11);
        }

        @NotNull
        public final String component1() {
            return this.title;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final String component3() {
            return this.statusDetail;
        }

        public final boolean component4() {
            return this.isCurrentStatus;
        }

        public final long component5() {
            return this.createdDate;
        }

        @NotNull
        public final Status copy(@NotNull String title, @NotNull String type, @NotNull String statusDetail, boolean z10, long j10) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(statusDetail, "statusDetail");
            return new Status(title, type, statusDetail, z10, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            if (Intrinsics.areEqual(this.title, status.title) && Intrinsics.areEqual(this.type, status.type) && Intrinsics.areEqual(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate) {
                return true;
            }
            return false;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }

        @NotNull
        public final String getStatusDetail() {
            return this.statusDetail;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.statusDetail.hashCode()) * 31) + Boolean.hashCode(this.isCurrentStatus)) * 31) + Long.hashCode(this.createdDate);
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        @NotNull
        public String toString() {
            return "Status(title=" + this.title + ", type=" + this.type + ", statusDetail=" + this.statusDetail + ", isCurrentStatus=" + this.isCurrentStatus + ", createdDate=" + this.createdDate + ')';
        }

        public Status(@NotNull String title, @NotNull String type, @NotNull String statusDetail, boolean z10, long j10) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(statusDetail, "statusDetail");
            this.title = title;
            this.type = type;
            this.statusDetail = statusDetail;
            this.isCurrentStatus = z10;
            this.createdDate = j10;
        }

        public /* synthetic */ Status(String str, String str2, String str3, boolean z10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? 0L : j10);
        }
    }

    @w0(parameters = 1)
    public static abstract class TicketAttribute {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @c("id")
        @NotNull
        private final String f293124id;

        @c("identifier")
        @NotNull
        private final String identifier;

        @c("name")
        @NotNull
        private final String name;

        @c("required")
        private final boolean required;

        @c("type")
        @NotNull
        private final TicketAttributeType type;

        @w0(parameters = 1)
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @c("value")
            @NotNull
            private final String value;

            public DateTimeAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.w3(this.value);
            }

            public /* synthetic */ DateTimeAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? TicketAttributeType.DATETIME : ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(@NotNull String id2, @NotNull String identifier, @NotNull String name, boolean z10, @NotNull TicketAttributeType type, @NotNull String value) {
                super(id2, identifier, name, z10, type, null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        @w0(parameters = 0)
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;

            @c("value")
            @NotNull
            private final List<File> value;

            @w0(parameters = 1)
            public static final class File {
                public static final int $stable = 0;

                @c("media_type")
                @NotNull
                private final FileType fileType;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @c("id")
                @NotNull
                private final String f293125id;

                @c("name")
                @NotNull
                private final String name;

                @c("url")
                @NotNull
                private final String url;

                public File(@NotNull String id2, @NotNull String name, @NotNull String url, @NotNull FileType fileType) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(fileType, "fileType");
                    this.f293125id = id2;
                    this.name = name;
                    this.url = url;
                    this.fileType = fileType;
                }

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = file.f293125id;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i10 & 8) != 0) {
                        fileType = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType);
                }

                @NotNull
                public final String component1() {
                    return this.f293125id;
                }

                @NotNull
                public final String component2() {
                    return this.name;
                }

                @NotNull
                public final String component3() {
                    return this.url;
                }

                @NotNull
                public final FileType component4() {
                    return this.fileType;
                }

                @NotNull
                public final File copy(@NotNull String id2, @NotNull String name, @NotNull String url, @NotNull FileType fileType) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(fileType, "fileType");
                    return new File(id2, name, url, fileType);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof File)) {
                        return false;
                    }
                    File file = (File) obj;
                    return Intrinsics.areEqual(this.f293125id, file.f293125id) && Intrinsics.areEqual(this.name, file.name) && Intrinsics.areEqual(this.url, file.url) && this.fileType == file.fileType;
                }

                @NotNull
                public final FileType getFileType() {
                    return this.fileType;
                }

                @NotNull
                public final String getId() {
                    return this.f293125id;
                }

                @NotNull
                public final String getName() {
                    return this.name;
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return (((((this.f293125id.hashCode() * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + this.fileType.hashCode();
                }

                @NotNull
                public String toString() {
                    return "File(id=" + this.f293125id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }
            }

            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, ticketAttributeType, list);
            }

            @NotNull
            public final List<File> getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilesAttribute(@NotNull String id2, @NotNull String identifier, @NotNull String name, boolean z10, @NotNull TicketAttributeType type, @NotNull List<File> value) {
                super(id2, identifier, name, z10, type, null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        @w0(parameters = 1)
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @c("value")
            @NotNull
            private final String value;

            public ListAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.w3(this.value);
            }

            public /* synthetic */ ListAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? TicketAttributeType.LIST : ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListAttribute(@NotNull String id2, @NotNull String identifier, @NotNull String name, boolean z10, @NotNull TicketAttributeType type, @NotNull String value) {
                super(id2, identifier, name, z10, type, null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        @w0(parameters = 1)
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @c("value")
            @NotNull
            private final String value;

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute() {
                this(null, null, null, false, null, null, 63, null);
                boolean z10 = false | false | false;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.w3(this.value);
            }

            public /* synthetic */ PrimitiveAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? TicketAttributeType.STRING : ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(@NotNull String id2, @NotNull String identifier, @NotNull String name, boolean z10, @NotNull TicketAttributeType type, @NotNull String value) {
                super(id2, identifier, name, z10, type, null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z10, ticketAttributeType);
        }

        @NotNull
        public final String getId() {
            return this.f293124id;
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        @NotNull
        public final TicketAttributeType getType() {
            return this.type;
        }

        public abstract boolean hasValue();

        @w0(parameters = 0)
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;

            @c("value")
            @NotNull
            private final Object value;

            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z10, ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            @NotNull
            public final Object getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.w3(this.value.toString());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnSupported(@NotNull String id2, @NotNull String identifier, @NotNull String name, boolean z10, @NotNull TicketAttributeType type, @NotNull Object value) {
                super(id2, identifier, name, z10, type, null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        private TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType) {
            this.f293124id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z10;
            this.type = ticketAttributeType;
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, ticketAttributeType, null);
        }
    }

    public Ticket() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0L, 32767, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i10, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j10, int i11, Object obj) {
        long j11;
        String str8;
        String str9 = (i11 & 1) != 0 ? ticket.f293123id : str;
        String str10 = (i11 & 2) != 0 ? ticket.publicId : str2;
        String str11 = (i11 & 4) != 0 ? ticket.title : str3;
        String str12 = (i11 & 8) != 0 ? ticket.description : str4;
        String str13 = (i11 & 16) != 0 ? ticket.iconUrl : str5;
        String str14 = (i11 & 32) != 0 ? ticket.emoji : str6;
        Status status2 = (i11 & 64) != 0 ? ticket.currentStatus : status;
        List list3 = (i11 & 128) != 0 ? ticket.statusList : list;
        List list4 = (i11 & 256) != 0 ? ticket.attributes : list2;
        int i12 = (i11 & 512) != 0 ? ticket.ticketTypeId : i10;
        Participant.Builder builder2 = (i11 & 1024) != 0 ? ticket.assignee : builder;
        String str15 = (i11 & 2048) != 0 ? ticket.conversationId : str7;
        ConversationButton conversationButton2 = (i11 & 4096) != 0 ? ticket.conversationButton : conversationButton;
        Boolean bool2 = (i11 & 8192) != 0 ? ticket.isRead : bool;
        if ((i11 & 16384) != 0) {
            str8 = str9;
            j11 = ticket.latestStatusUpdatedAt;
        } else {
            j11 = j10;
            str8 = str9;
        }
        return ticket.copy(str8, str10, str11, str12, str13, str14, status2, list3, list4, i12, builder2, str15, conversationButton2, bool2, j11);
    }

    @NotNull
    public final String component1() {
        return this.f293123id;
    }

    public final int component10() {
        return this.ticketTypeId;
    }

    @NotNull
    public final Participant.Builder component11() {
        return this.assignee;
    }

    @Nullable
    public final String component12() {
        return this.conversationId;
    }

    @Nullable
    public final ConversationButton component13() {
        return this.conversationButton;
    }

    @Nullable
    public final Boolean component14() {
        return this.isRead;
    }

    public final long component15() {
        return this.latestStatusUpdatedAt;
    }

    @Nullable
    public final String component2() {
        return this.publicId;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final String component5() {
        return this.iconUrl;
    }

    @NotNull
    public final String component6() {
        return this.emoji;
    }

    @NotNull
    public final Status component7() {
        return this.currentStatus;
    }

    @NotNull
    public final List<Status> component8() {
        return this.statusList;
    }

    @NotNull
    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    @NotNull
    public final Ticket copy(@NotNull String id2, @Nullable String str, @NotNull String title, @NotNull String description, @NotNull String iconUrl, @NotNull String emoji, @NotNull Status currentStatus, @NotNull List<Status> statusList, @NotNull List<? extends TicketAttribute> attributes, int i10, @NotNull Participant.Builder assignee, @Nullable String str2, @Nullable ConversationButton conversationButton, @Nullable Boolean bool, long j10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(currentStatus, "currentStatus");
        Intrinsics.checkNotNullParameter(statusList, "statusList");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(assignee, "assignee");
        return new Ticket(id2, str, title, description, iconUrl, emoji, currentStatus, statusList, attributes, i10, assignee, str2, conversationButton, bool, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return Intrinsics.areEqual(this.f293123id, ticket.f293123id) && Intrinsics.areEqual(this.publicId, ticket.publicId) && Intrinsics.areEqual(this.title, ticket.title) && Intrinsics.areEqual(this.description, ticket.description) && Intrinsics.areEqual(this.iconUrl, ticket.iconUrl) && Intrinsics.areEqual(this.emoji, ticket.emoji) && Intrinsics.areEqual(this.currentStatus, ticket.currentStatus) && Intrinsics.areEqual(this.statusList, ticket.statusList) && Intrinsics.areEqual(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && Intrinsics.areEqual(this.assignee, ticket.assignee) && Intrinsics.areEqual(this.conversationId, ticket.conversationId) && Intrinsics.areEqual(this.conversationButton, ticket.conversationButton) && Intrinsics.areEqual(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt;
    }

    @NotNull
    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    @NotNull
    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEmoji() {
        return this.emoji;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getId() {
        return this.f293123id;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    @Nullable
    public final String getPublicId() {
        return this.publicId;
    }

    @NotNull
    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.f293123id.hashCode() * 31;
        String str = this.publicId;
        int iHashCode2 = (((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.emoji.hashCode()) * 31) + this.currentStatus.hashCode()) * 31) + this.statusList.hashCode()) * 31) + this.attributes.hashCode()) * 31) + Integer.hashCode(this.ticketTypeId)) * 31) + this.assignee.hashCode()) * 31;
        String str2 = this.conversationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationButton conversationButton = this.conversationButton;
        int iHashCode4 = (iHashCode3 + (conversationButton == null ? 0 : conversationButton.hashCode())) * 31;
        Boolean bool = this.isRead;
        return ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + Long.hashCode(this.latestStatusUpdatedAt);
    }

    @Nullable
    public final Boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public String toString() {
        return "Ticket(id=" + this.f293123id + ", publicId=" + this.publicId + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", emoji=" + this.emoji + ", currentStatus=" + this.currentStatus + ", statusList=" + this.statusList + ", attributes=" + this.attributes + ", ticketTypeId=" + this.ticketTypeId + ", assignee=" + this.assignee + ", conversationId=" + this.conversationId + ", conversationButton=" + this.conversationButton + ", isRead=" + this.isRead + ", latestStatusUpdatedAt=" + this.latestStatusUpdatedAt + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticket(@NotNull String id2, @Nullable String str, @NotNull String title, @NotNull String description, @NotNull String iconUrl, @NotNull String emoji, @NotNull Status currentStatus, @NotNull List<Status> statusList, @NotNull List<? extends TicketAttribute> attributes, int i10, @NotNull Participant.Builder assignee, @Nullable String str2, @Nullable ConversationButton conversationButton, @Nullable Boolean bool, long j10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(currentStatus, "currentStatus");
        Intrinsics.checkNotNullParameter(statusList, "statusList");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(assignee, "assignee");
        this.f293123id = id2;
        this.publicId = str;
        this.title = title;
        this.description = description;
        this.iconUrl = iconUrl;
        this.emoji = emoji;
        this.currentStatus = currentStatus;
        this.statusList = statusList;
        this.attributes = attributes;
        this.ticketTypeId = i10;
        this.assignee = assignee;
        this.conversationId = str2;
        this.conversationButton = conversationButton;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j10;
    }

    public /* synthetic */ Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i10, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) == 0 ? str6 : "", (i11 & 64) != 0 ? new Status(null, null, null, false, 0L, 31, null) : status, (i11 & 128) != 0 ? CollectionsKt.emptyList() : list, (i11 & 256) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 512) != 0 ? 0 : i10, (i11 & 1024) != 0 ? new Participant.Builder() : builder, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : conversationButton, (i11 & 8192) == 0 ? bool : null, (i11 & 16384) != 0 ? 0L : j10);
    }
}

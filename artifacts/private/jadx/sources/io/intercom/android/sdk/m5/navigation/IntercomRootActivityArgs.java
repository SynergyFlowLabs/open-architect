package io.intercom.android.sdk.m5.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@e.a({"ParcelCreator"})
@gk.d
public abstract class IntercomRootActivityArgs implements Parcelable {
    public static final int $stable = 0;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class ConversationScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<ConversationScreenArgs> CREATOR = new Creator();

        @Nullable
        private final String articleId;

        @Nullable
        private final String articleTitle;

        @Nullable
        private final String conversationId;

        @NotNull
        private final String initialMessage;
        private final boolean isLaunchedProgrammatically;

        @NotNull
        private final TransitionArgs transitionArgs;

        public static final class Creator implements Parcelable.Creator<ConversationScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConversationScreenArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), TransitionArgs.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs[] newArray(int i10) {
                return new ConversationScreenArgs[i10];
            }
        }

        public ConversationScreenArgs() {
            this(null, null, false, null, null, null, 63, null);
        }

        private final String component2() {
            return this.initialMessage;
        }

        public static /* synthetic */ ConversationScreenArgs copy$default(ConversationScreenArgs conversationScreenArgs, String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationScreenArgs.conversationId;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationScreenArgs.initialMessage;
            }
            if ((i10 & 4) != 0) {
                z10 = conversationScreenArgs.isLaunchedProgrammatically;
            }
            if ((i10 & 8) != 0) {
                str3 = conversationScreenArgs.articleId;
            }
            if ((i10 & 16) != 0) {
                str4 = conversationScreenArgs.articleTitle;
            }
            if ((i10 & 32) != 0) {
                transitionArgs = conversationScreenArgs.transitionArgs;
            }
            String str5 = str4;
            TransitionArgs transitionArgs2 = transitionArgs;
            return conversationScreenArgs.copy(str, str2, z10, str3, str5, transitionArgs2);
        }

        @Nullable
        public final String component1() {
            return this.conversationId;
        }

        public final boolean component3() {
            return this.isLaunchedProgrammatically;
        }

        @Nullable
        public final String component4() {
            return this.articleId;
        }

        @Nullable
        public final String component5() {
            return this.articleTitle;
        }

        @NotNull
        public final TransitionArgs component6() {
            return this.transitionArgs;
        }

        @NotNull
        public final ConversationScreenArgs copy(@Nullable String str, @NotNull String initialMessage, boolean z10, @Nullable String str2, @Nullable String str3, @NotNull TransitionArgs transitionArgs) {
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
            return new ConversationScreenArgs(str, initialMessage, z10, str2, str3, transitionArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationScreenArgs)) {
                return false;
            }
            ConversationScreenArgs conversationScreenArgs = (ConversationScreenArgs) obj;
            return Intrinsics.areEqual(this.conversationId, conversationScreenArgs.conversationId) && Intrinsics.areEqual(this.initialMessage, conversationScreenArgs.initialMessage) && this.isLaunchedProgrammatically == conversationScreenArgs.isLaunchedProgrammatically && Intrinsics.areEqual(this.articleId, conversationScreenArgs.articleId) && Intrinsics.areEqual(this.articleTitle, conversationScreenArgs.articleTitle) && Intrinsics.areEqual(this.transitionArgs, conversationScreenArgs.transitionArgs);
        }

        @Nullable
        public final String getArticleId() {
            return this.articleId;
        }

        @Nullable
        public final String getArticleTitle() {
            return this.articleTitle;
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getEncodedInitialMessage() {
            String strEncode = Uri.encode(this.initialMessage);
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "CONVERSATION?conversationId=" + this.conversationId + "&initialMessage=" + getEncodedInitialMessage() + "&articleId=" + this.articleId + "&articleTitle=" + this.articleTitle + "&isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + "&transitionArgs=" + this.transitionArgs;
        }

        @NotNull
        public final TransitionArgs getTransitionArgs() {
            return this.transitionArgs;
        }

        public int hashCode() {
            String str = this.conversationId;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.initialMessage.hashCode()) * 31) + Boolean.hashCode(this.isLaunchedProgrammatically)) * 31;
            String str2 = this.articleId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.articleTitle;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.transitionArgs.hashCode();
        }

        public final boolean isLaunchedProgrammatically() {
            return this.isLaunchedProgrammatically;
        }

        @NotNull
        public String toString() {
            return "ConversationScreenArgs(conversationId=" + this.conversationId + ", initialMessage=" + this.initialMessage + ", isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + ", articleId=" + this.articleId + ", articleTitle=" + this.articleTitle + ", transitionArgs=" + this.transitionArgs + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.conversationId);
            dest.writeString(this.initialMessage);
            dest.writeInt(this.isLaunchedProgrammatically ? 1 : 0);
            dest.writeString(this.articleId);
            dest.writeString(this.articleTitle);
            this.transitionArgs.writeToParcel(dest, i10);
        }

        public /* synthetic */ ConversationScreenArgs(String str, String str2, boolean z10, String str3, String str4, TransitionArgs transitionArgs, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationScreenArgs(@Nullable String str, @NotNull String initialMessage, boolean z10, @Nullable String str2, @Nullable String str3, @NotNull TransitionArgs transitionArgs) {
            super(null);
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(transitionArgs, "transitionArgs");
            this.conversationId = str;
            this.initialMessage = initialMessage;
            this.isLaunchedProgrammatically = z10;
            this.articleId = str2;
            this.articleTitle = str3;
            this.transitionArgs = transitionArgs;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class HelpCenterCollectionArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<HelpCenterCollectionArgs> CREATOR = new Creator();

        @NotNull
        private final String collectionId;

        @NotNull
        private final String metricPlace;

        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HelpCenterCollectionArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs[] newArray(int i10) {
                return new HelpCenterCollectionArgs[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionArgs(@NotNull String collectionId, @NotNull String metricPlace) {
            super(null);
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            this.collectionId = collectionId;
            this.metricPlace = metricPlace;
        }

        public static /* synthetic */ HelpCenterCollectionArgs copy$default(HelpCenterCollectionArgs helpCenterCollectionArgs, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = helpCenterCollectionArgs.collectionId;
            }
            if ((i10 & 2) != 0) {
                str2 = helpCenterCollectionArgs.metricPlace;
            }
            return helpCenterCollectionArgs.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.collectionId;
        }

        @NotNull
        public final String component2() {
            return this.metricPlace;
        }

        @NotNull
        public final HelpCenterCollectionArgs copy(@NotNull String collectionId, @NotNull String metricPlace) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            return new HelpCenterCollectionArgs(collectionId, metricPlace);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionArgs)) {
                return false;
            }
            HelpCenterCollectionArgs helpCenterCollectionArgs = (HelpCenterCollectionArgs) obj;
            return Intrinsics.areEqual(this.collectionId, helpCenterCollectionArgs.collectionId) && Intrinsics.areEqual(this.metricPlace, helpCenterCollectionArgs.metricPlace);
        }

        @NotNull
        public final String getCollectionId() {
            return this.collectionId;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return (this.collectionId.hashCode() * 31) + this.metricPlace.hashCode();
        }

        @NotNull
        public String toString() {
            return "HelpCenterCollectionArgs(collectionId=" + this.collectionId + ", metricPlace=" + this.metricPlace + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.collectionId);
            dest.writeString(this.metricPlace);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class HomeScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final HomeScreenArgs INSTANCE = new HomeScreenArgs();

        @NotNull
        public static final Parcelable.Creator<HomeScreenArgs> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<HomeScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HomeScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs[] newArray(int i10) {
                return new HomeScreenArgs[i10];
            }
        }

        private HomeScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "HOME";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class MessagesScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final MessagesScreenArgs INSTANCE = new MessagesScreenArgs();

        @NotNull
        public static final Parcelable.Creator<MessagesScreenArgs> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<MessagesScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MessagesScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs[] newArray(int i10) {
                return new MessagesScreenArgs[i10];
            }
        }

        private MessagesScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "MESSAGES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class NoContent extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final NoContent INSTANCE = new NoContent();

        @NotNull
        public static final Parcelable.Creator<NoContent> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<NoContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoContent.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent[] newArray(int i10) {
                return new NoContent[i10];
            }
        }

        private NoContent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class TicketDetailsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<TicketDetailsScreenArgs> CREATOR = new Creator();

        @NotNull
        private final String from;

        @NotNull
        private final String ticketId;

        public static final class Creator implements Parcelable.Creator<TicketDetailsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TicketDetailsScreenArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs[] newArray(int i10) {
                return new TicketDetailsScreenArgs[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketDetailsScreenArgs(@NotNull String ticketId, @NotNull String from) {
            super(null);
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            Intrinsics.checkNotNullParameter(from, "from");
            int i10 = 6 | 0;
            this.ticketId = ticketId;
            this.from = from;
        }

        public static /* synthetic */ TicketDetailsScreenArgs copy$default(TicketDetailsScreenArgs ticketDetailsScreenArgs, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketDetailsScreenArgs.ticketId;
            }
            if ((i10 & 2) != 0) {
                str2 = ticketDetailsScreenArgs.from;
            }
            return ticketDetailsScreenArgs.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.ticketId;
        }

        @NotNull
        public final String component2() {
            return this.from;
        }

        @NotNull
        public final TicketDetailsScreenArgs copy(@NotNull String ticketId, @NotNull String from) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            Intrinsics.checkNotNullParameter(from, "from");
            return new TicketDetailsScreenArgs(ticketId, from);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailsScreenArgs)) {
                return false;
            }
            TicketDetailsScreenArgs ticketDetailsScreenArgs = (TicketDetailsScreenArgs) obj;
            return Intrinsics.areEqual(this.ticketId, ticketDetailsScreenArgs.ticketId) && Intrinsics.areEqual(this.from, ticketDetailsScreenArgs.from);
        }

        @NotNull
        public final String getFrom() {
            return this.from;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "TICKET_DETAIL/" + this.ticketId + "?from=" + this.from;
        }

        @NotNull
        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return (this.ticketId.hashCode() * 31) + this.from.hashCode();
        }

        @NotNull
        public String toString() {
            return "TicketDetailsScreenArgs(ticketId=" + this.ticketId + ", from=" + this.from + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.ticketId);
            dest.writeString(this.from);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class TicketsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;

        @NotNull
        public static final TicketsScreenArgs INSTANCE = new TicketsScreenArgs();

        @NotNull
        public static final Parcelable.Creator<TicketsScreenArgs> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TicketsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TicketsScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs[] newArray(int i10) {
                return new TicketsScreenArgs[i10];
            }
        }

        private TicketsScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "TICKETS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ IntercomRootActivityArgs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getRoute();

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class HelpCenterCollectionsArgs extends IntercomRootActivityArgs {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<HelpCenterCollectionsArgs> CREATOR = new Creator();

        @NotNull
        private final List<String> collectionIds;

        @NotNull
        private final String metricPlace;

        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionsArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HelpCenterCollectionsArgs(parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs[] newArray(int i10) {
                return new HelpCenterCollectionsArgs[i10];
            }
        }

        public /* synthetic */ HelpCenterCollectionsArgs(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollectionsArgs copy$default(HelpCenterCollectionsArgs helpCenterCollectionsArgs, List list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = helpCenterCollectionsArgs.collectionIds;
            }
            if ((i10 & 2) != 0) {
                str = helpCenterCollectionsArgs.metricPlace;
            }
            return helpCenterCollectionsArgs.copy(list, str);
        }

        @NotNull
        public final List<String> component1() {
            return this.collectionIds;
        }

        @NotNull
        public final String component2() {
            return this.metricPlace;
        }

        @NotNull
        public final HelpCenterCollectionsArgs copy(@NotNull List<String> collectionIds, @NotNull String metricPlace) {
            Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            return new HelpCenterCollectionsArgs(collectionIds, metricPlace);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionsArgs)) {
                return false;
            }
            HelpCenterCollectionsArgs helpCenterCollectionsArgs = (HelpCenterCollectionsArgs) obj;
            return Intrinsics.areEqual(this.collectionIds, helpCenterCollectionsArgs.collectionIds) && Intrinsics.areEqual(this.metricPlace, helpCenterCollectionsArgs.metricPlace);
        }

        @NotNull
        public final List<String> getCollectionIds() {
            return this.collectionIds;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        @NotNull
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return (this.collectionIds.hashCode() * 31) + this.metricPlace.hashCode();
        }

        @NotNull
        public String toString() {
            return "HelpCenterCollectionsArgs(collectionIds=" + this.collectionIds + ", metricPlace=" + this.metricPlace + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.collectionIds);
            dest.writeString(this.metricPlace);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionsArgs(@NotNull List<String> collectionIds, @NotNull String metricPlace) {
            super(null);
            Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            this.collectionIds = collectionIds;
            this.metricPlace = metricPlace;
        }
    }

    private IntercomRootActivityArgs() {
    }
}

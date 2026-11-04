package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class OpenMessengerResponse {
    public static final int $stable = 8;

    @c("composer_state")
    @NotNull
    private final ComposerState composerState;

    @c(MetricTracker.Object.COMPOSER_SUGGESTIONS)
    @Nullable
    private final ComposerSuggestions composerSuggestions;

    @c("new_conversation")
    @Nullable
    private final NewConversationData newConversationData;

    @c("open_inbound_conversation_ids")
    @NotNull
    private final List<String> openInboundConversations;

    @c("powered_by")
    @Nullable
    private final PoweredBy poweredBy;

    @c("privacy_policy_notice")
    @Nullable
    private final PrivacyNotice privacyNotice;

    @c("request_id")
    @Nullable
    private final String requestId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IconType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;

        @c("chevron")
        public static final IconType CHEVRON = new CHEVRON("CHEVRON", 0);

        @c("question_bubble")
        public static final IconType QUESTION_BUBBLE = new QUESTION_BUBBLE("QUESTION_BUBBLE", 1);

        @c("paper_plane")
        public static final IconType PAPER_PLANE = new PAPER_PLANE("PAPER_PLANE", 2);

        static final class CHEVRON extends IconType {
            CHEVRON(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            @NotNull
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_chevron);
            }
        }

        static final class PAPER_PLANE extends IconType {
            PAPER_PLANE(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            @NotNull
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_send_message_icon);
            }
        }

        static final class QUESTION_BUBBLE extends IconType {
            QUESTION_BUBBLE(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            @NotNull
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_conversation_card_question);
            }
        }

        private static final /* synthetic */ IconType[] $values() {
            return new IconType[]{CHEVRON, QUESTION_BUBBLE, PAPER_PLANE};
        }

        static {
            IconType[] iconTypeArr$values = $values();
            $VALUES = iconTypeArr$values;
            $ENTRIES = kotlin.enums.c.c(iconTypeArr$values);
        }

        public /* synthetic */ IconType(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        @NotNull
        public static a<IconType> getEntries() {
            return $ENTRIES;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }

        @Nullable
        public abstract Integer getIcon();

        private IconType(String str, int i10) {
            super(str, i10);
        }
    }

    public OpenMessengerResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenMessengerResponse copy$default(OpenMessengerResponse openMessengerResponse, ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composerSuggestions = openMessengerResponse.composerSuggestions;
        }
        if ((i10 & 2) != 0) {
            newConversationData = openMessengerResponse.newConversationData;
        }
        if ((i10 & 4) != 0) {
            composerState = openMessengerResponse.composerState;
        }
        if ((i10 & 8) != 0) {
            str = openMessengerResponse.requestId;
        }
        if ((i10 & 16) != 0) {
            poweredBy = openMessengerResponse.poweredBy;
        }
        if ((i10 & 32) != 0) {
            list = openMessengerResponse.openInboundConversations;
        }
        if ((i10 & 64) != 0) {
            privacyNotice = openMessengerResponse.privacyNotice;
        }
        List list2 = list;
        PrivacyNotice privacyNotice2 = privacyNotice;
        PoweredBy poweredBy2 = poweredBy;
        ComposerState composerState2 = composerState;
        return openMessengerResponse.copy(composerSuggestions, newConversationData, composerState2, str, poweredBy2, list2, privacyNotice2);
    }

    @Nullable
    public final ComposerSuggestions component1() {
        return this.composerSuggestions;
    }

    @Nullable
    public final NewConversationData component2() {
        return this.newConversationData;
    }

    @NotNull
    public final ComposerState component3() {
        return this.composerState;
    }

    @Nullable
    public final String component4() {
        return this.requestId;
    }

    @Nullable
    public final PoweredBy component5() {
        return this.poweredBy;
    }

    @NotNull
    public final List<String> component6() {
        return this.openInboundConversations;
    }

    @Nullable
    public final PrivacyNotice component7() {
        return this.privacyNotice;
    }

    @NotNull
    public final OpenMessengerResponse copy(@Nullable ComposerSuggestions composerSuggestions, @Nullable NewConversationData newConversationData, @NotNull ComposerState composerState, @Nullable String str, @Nullable PoweredBy poweredBy, @NotNull List<String> openInboundConversations, @Nullable PrivacyNotice privacyNotice) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(openInboundConversations, "openInboundConversations");
        return new OpenMessengerResponse(composerSuggestions, newConversationData, composerState, str, poweredBy, openInboundConversations, privacyNotice);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMessengerResponse)) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        return Intrinsics.areEqual(this.composerSuggestions, openMessengerResponse.composerSuggestions) && Intrinsics.areEqual(this.newConversationData, openMessengerResponse.newConversationData) && Intrinsics.areEqual(this.composerState, openMessengerResponse.composerState) && Intrinsics.areEqual(this.requestId, openMessengerResponse.requestId) && Intrinsics.areEqual(this.poweredBy, openMessengerResponse.poweredBy) && Intrinsics.areEqual(this.openInboundConversations, openMessengerResponse.openInboundConversations) && Intrinsics.areEqual(this.privacyNotice, openMessengerResponse.privacyNotice);
    }

    @NotNull
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    @Nullable
    public final ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    @Nullable
    public final NewConversationData getNewConversationData() {
        return this.newConversationData;
    }

    @NotNull
    public final List<String> getOpenInboundConversations() {
        return this.openInboundConversations;
    }

    @Nullable
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    @Nullable
    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        ComposerSuggestions composerSuggestions = this.composerSuggestions;
        int iHashCode = (composerSuggestions == null ? 0 : composerSuggestions.hashCode()) * 31;
        NewConversationData newConversationData = this.newConversationData;
        int iHashCode2 = (((iHashCode + (newConversationData == null ? 0 : newConversationData.hashCode())) * 31) + this.composerState.hashCode()) * 31;
        String str = this.requestId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iHashCode4 = (((iHashCode3 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31) + this.openInboundConversations.hashCode()) * 31;
        PrivacyNotice privacyNotice = this.privacyNotice;
        return iHashCode4 + (privacyNotice != null ? privacyNotice.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenMessengerResponse(composerSuggestions=" + this.composerSuggestions + ", newConversationData=" + this.newConversationData + ", composerState=" + this.composerState + ", requestId=" + this.requestId + ", poweredBy=" + this.poweredBy + ", openInboundConversations=" + this.openInboundConversations + ", privacyNotice=" + this.privacyNotice + ')';
    }

    public OpenMessengerResponse(@Nullable ComposerSuggestions composerSuggestions, @Nullable NewConversationData newConversationData, @NotNull ComposerState composerState, @Nullable String str, @Nullable PoweredBy poweredBy, @NotNull List<String> openInboundConversations, @Nullable PrivacyNotice privacyNotice) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(openInboundConversations, "openInboundConversations");
        this.composerSuggestions = composerSuggestions;
        this.newConversationData = newConversationData;
        this.composerState = composerState;
        this.requestId = str;
        this.poweredBy = poweredBy;
        this.openInboundConversations = openInboundConversations;
        this.privacyNotice = privacyNotice;
    }

    @w0(parameters = 0)
    public static final class NewConversationData {
        public static final int $stable = 8;

        @c("cta")
        @NotNull
        private final Cta cta;

        @c("header")
        @Nullable
        private final Header header;

        @c("home_card")
        @NotNull
        private final HomeCard homeCard;

        @c("participants")
        @NotNull
        private final List<Participant.Builder> participants;

        @c("parts")
        @NotNull
        private final List<Part.Builder> parts;

        @c("special_notice")
        @Nullable
        private final String specialNotice;

        @c("team_intro")
        @Nullable
        private final String teamIntro;

        public NewConversationData(@NotNull Cta cta, @NotNull HomeCard homeCard, @NotNull List<Part.Builder> parts, @NotNull List<Participant.Builder> participants, @Nullable Header header, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(homeCard, "homeCard");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(participants, "participants");
            this.cta = cta;
            this.homeCard = homeCard;
            this.parts = parts;
            this.participants = participants;
            this.header = header;
            this.teamIntro = str;
            this.specialNotice = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewConversationData copy$default(NewConversationData newConversationData, Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cta = newConversationData.cta;
            }
            if ((i10 & 2) != 0) {
                homeCard = newConversationData.homeCard;
            }
            if ((i10 & 4) != 0) {
                list = newConversationData.parts;
            }
            if ((i10 & 8) != 0) {
                list2 = newConversationData.participants;
            }
            if ((i10 & 16) != 0) {
                header = newConversationData.header;
            }
            if ((i10 & 32) != 0) {
                str = newConversationData.teamIntro;
            }
            if ((i10 & 64) != 0) {
                str2 = newConversationData.specialNotice;
            }
            String str3 = str;
            String str4 = str2;
            Header header2 = header;
            List list3 = list;
            return newConversationData.copy(cta, homeCard, list3, list2, header2, str3, str4);
        }

        @NotNull
        public final Cta component1() {
            return this.cta;
        }

        @NotNull
        public final HomeCard component2() {
            return this.homeCard;
        }

        @NotNull
        public final List<Part.Builder> component3() {
            return this.parts;
        }

        @NotNull
        public final List<Participant.Builder> component4() {
            return this.participants;
        }

        @Nullable
        public final Header component5() {
            return this.header;
        }

        @Nullable
        public final String component6() {
            return this.teamIntro;
        }

        @Nullable
        public final String component7() {
            return this.specialNotice;
        }

        @NotNull
        public final NewConversationData copy(@NotNull Cta cta, @NotNull HomeCard homeCard, @NotNull List<Part.Builder> parts, @NotNull List<Participant.Builder> participants, @Nullable Header header, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(homeCard, "homeCard");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(participants, "participants");
            return new NewConversationData(cta, homeCard, parts, participants, header, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewConversationData)) {
                return false;
            }
            NewConversationData newConversationData = (NewConversationData) obj;
            return Intrinsics.areEqual(this.cta, newConversationData.cta) && Intrinsics.areEqual(this.homeCard, newConversationData.homeCard) && Intrinsics.areEqual(this.parts, newConversationData.parts) && Intrinsics.areEqual(this.participants, newConversationData.participants) && Intrinsics.areEqual(this.header, newConversationData.header) && Intrinsics.areEqual(this.teamIntro, newConversationData.teamIntro) && Intrinsics.areEqual(this.specialNotice, newConversationData.specialNotice);
        }

        @NotNull
        public final Cta getCta() {
            return this.cta;
        }

        @Nullable
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final HomeCard getHomeCard() {
            return this.homeCard;
        }

        @NotNull
        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        @NotNull
        public final List<Part.Builder> getParts() {
            return this.parts;
        }

        @Nullable
        public final String getSpecialNotice() {
            return this.specialNotice;
        }

        @Nullable
        public final String getTeamIntro() {
            return this.teamIntro;
        }

        public int hashCode() {
            int iHashCode = ((((((this.cta.hashCode() * 31) + this.homeCard.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.participants.hashCode()) * 31;
            Header header = this.header;
            int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
            String str = this.teamIntro;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.specialNotice;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NewConversationData(cta=" + this.cta + ", homeCard=" + this.homeCard + ", parts=" + this.parts + ", participants=" + this.participants + ", header=" + this.header + ", teamIntro=" + this.teamIntro + ", specialNotice=" + this.specialNotice + ')';
        }

        @w0(parameters = 1)
        public static final class Cta {
            public static final int $stable = 0;

            @c("icon")
            @NotNull
            private final IconType icon;

            @c("subtitle")
            @Nullable
            private final String subtitle;

            @c("text")
            @NotNull
            private final String text;

            public Cta(@NotNull String text, @Nullable String str, @NotNull IconType icon) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.text = text;
                this.subtitle = str;
                this.icon = icon;
            }

            public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, IconType iconType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cta.text;
                }
                if ((i10 & 2) != 0) {
                    str2 = cta.subtitle;
                }
                if ((i10 & 4) != 0) {
                    iconType = cta.icon;
                }
                return cta.copy(str, str2, iconType);
            }

            @NotNull
            public final String component1() {
                return this.text;
            }

            @Nullable
            public final String component2() {
                return this.subtitle;
            }

            @NotNull
            public final IconType component3() {
                return this.icon;
            }

            @NotNull
            public final Cta copy(@NotNull String text, @Nullable String str, @NotNull IconType icon) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new Cta(text, str, icon);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cta)) {
                    return false;
                }
                Cta cta = (Cta) obj;
                return Intrinsics.areEqual(this.text, cta.text) && Intrinsics.areEqual(this.subtitle, cta.subtitle) && this.icon == cta.icon;
            }

            @NotNull
            public final IconType getIcon() {
                return this.icon;
            }

            @Nullable
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.icon.hashCode();
            }

            @NotNull
            public String toString() {
                return "Cta(text=" + this.text + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ')';
            }

            public /* synthetic */ Cta(String str, String str2, IconType iconType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, iconType);
            }
        }

        @w0(parameters = 0)
        public static final class HomeCard {
            public static final int $stable = 8;

            @c("avatar_details")
            @Nullable
            private final AvatarDetails avatarDetails;

            @c("icon")
            @Nullable
            private final IconType icon;

            @c("subtitle")
            @Nullable
            private final String subtitle;

            @c("text")
            @NotNull
            private final String text;

            public HomeCard(@NotNull String text, @Nullable String str, @Nullable AvatarDetails avatarDetails, @Nullable IconType iconType) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.subtitle = str;
                this.avatarDetails = avatarDetails;
                this.icon = iconType;
            }

            public static /* synthetic */ HomeCard copy$default(HomeCard homeCard, String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeCard.text;
                }
                if ((i10 & 2) != 0) {
                    str2 = homeCard.subtitle;
                }
                if ((i10 & 4) != 0) {
                    avatarDetails = homeCard.avatarDetails;
                }
                if ((i10 & 8) != 0) {
                    iconType = homeCard.icon;
                }
                return homeCard.copy(str, str2, avatarDetails, iconType);
            }

            @NotNull
            public final String component1() {
                return this.text;
            }

            @Nullable
            public final String component2() {
                return this.subtitle;
            }

            @Nullable
            public final AvatarDetails component3() {
                return this.avatarDetails;
            }

            @Nullable
            public final IconType component4() {
                return this.icon;
            }

            @NotNull
            public final HomeCard copy(@NotNull String text, @Nullable String str, @Nullable AvatarDetails avatarDetails, @Nullable IconType iconType) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new HomeCard(text, str, avatarDetails, iconType);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HomeCard)) {
                    return false;
                }
                HomeCard homeCard = (HomeCard) obj;
                if (Intrinsics.areEqual(this.text, homeCard.text) && Intrinsics.areEqual(this.subtitle, homeCard.subtitle) && Intrinsics.areEqual(this.avatarDetails, homeCard.avatarDetails) && this.icon == homeCard.icon) {
                    return true;
                }
                return false;
            }

            @Nullable
            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            @Nullable
            public final IconType getIcon() {
                return this.icon;
            }

            @Nullable
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                int iHashCode2 = 0;
                int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                int iHashCode4 = (iHashCode3 + (avatarDetails == null ? 0 : avatarDetails.hashCode())) * 31;
                IconType iconType = this.icon;
                if (iconType != null) {
                    iHashCode2 = iconType.hashCode();
                }
                return iHashCode4 + iHashCode2;
            }

            @NotNull
            public String toString() {
                return "HomeCard(text=" + this.text + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ')';
            }

            public /* synthetic */ HomeCard(String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : avatarDetails, (i10 & 8) != 0 ? null : iconType);
            }
        }

        public /* synthetic */ NewConversationData(Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cta, homeCard, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 16) != 0 ? null : header, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : str2);
        }
    }

    public /* synthetic */ OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : composerSuggestions, (i10 & 2) != 0 ? null : newConversationData, (i10 & 4) != 0 ? ComposerState.Companion.getNULL() : composerState, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : poweredBy, (i10 & 32) != 0 ? CollectionsKt.emptyList() : list, (i10 & 64) != 0 ? null : privacyNotice);
    }
}

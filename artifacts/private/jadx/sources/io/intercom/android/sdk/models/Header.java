package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.enums.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class Header {
    public static final int $stable = 8;

    @c("background_color")
    @NotNull
    private final String backgroundColor;

    @c("background_color_dark")
    @NotNull
    private final String backgroundColorDark;

    @c("collapsed")
    @NotNull
    private final Collapsed collapsed;

    @c("display_active_indicator")
    private final boolean displayActiveIndicator;

    @c("expanded")
    @Nullable
    private final Expanded expanded;

    @c("foreground_primary_color")
    @NotNull
    private final String foregroundPrimaryColor;

    @c("foreground_primary_color_dark")
    @NotNull
    private final String foregroundPrimaryColorDark;

    @c("foreground_secondary_color")
    @NotNull
    private final String foregroundSecondaryColor;

    @c("foreground_secondary_color_dark")
    @NotNull
    private final String foregroundSecondaryColorDark;

    @c("hide_greeting")
    private final boolean hideGreeting;

    @c("use_bot_header")
    private final boolean useBotHeader;

    @w0(parameters = 0)
    public static final class Collapsed {
        public static final int $stable = 8;

        @c("avatar_details")
        @Nullable
        private final AvatarDetails avatarDetails;

        @c("icon")
        @Nullable
        private final HeaderIconType icon;

        @c("subtitle")
        @Nullable
        private final String subtitle;

        @c("title")
        @NotNull
        private final String title;

        public enum HeaderIconType {
            CLOCK,
            AI;

            private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

            @NotNull
            public static a<HeaderIconType> getEntries() {
                return $ENTRIES;
            }
        }

        public Collapsed(@Nullable AvatarDetails avatarDetails, @Nullable HeaderIconType headerIconType, @Nullable String str, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.avatarDetails = avatarDetails;
            this.icon = headerIconType;
            this.subtitle = str;
            this.title = title;
        }

        public static /* synthetic */ Collapsed copy$default(Collapsed collapsed, AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatarDetails = collapsed.avatarDetails;
            }
            if ((i10 & 2) != 0) {
                headerIconType = collapsed.icon;
            }
            if ((i10 & 4) != 0) {
                str = collapsed.subtitle;
            }
            if ((i10 & 8) != 0) {
                str2 = collapsed.title;
            }
            return collapsed.copy(avatarDetails, headerIconType, str, str2);
        }

        @Nullable
        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        @Nullable
        public final HeaderIconType component2() {
            return this.icon;
        }

        @Nullable
        public final String component3() {
            return this.subtitle;
        }

        @NotNull
        public final String component4() {
            return this.title;
        }

        @NotNull
        public final Collapsed copy(@Nullable AvatarDetails avatarDetails, @Nullable HeaderIconType headerIconType, @Nullable String str, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Collapsed(avatarDetails, headerIconType, str, title);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Collapsed)) {
                return false;
            }
            Collapsed collapsed = (Collapsed) obj;
            return Intrinsics.areEqual(this.avatarDetails, collapsed.avatarDetails) && this.icon == collapsed.icon && Intrinsics.areEqual(this.subtitle, collapsed.subtitle) && Intrinsics.areEqual(this.title, collapsed.title);
        }

        @Nullable
        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        @Nullable
        public final HeaderIconType getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            int iHashCode = (avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31;
            HeaderIconType headerIconType = this.icon;
            int iHashCode2 = (iHashCode + (headerIconType == null ? 0 : headerIconType.hashCode())) * 31;
            String str = this.subtitle;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return "Collapsed(avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ", subtitle=" + this.subtitle + ", title=" + this.title + ')';
        }
    }

    @w0(parameters = 0)
    public static final class Expanded {
        public static final int $stable = 8;

        @c("avatar_details")
        @Nullable
        private final AvatarDetails avatarDetails;

        @c("body")
        @NotNull
        private final List<Body> body;

        @c("footer")
        @NotNull
        private final List<Footer> footer;

        @c("social_accounts")
        @NotNull
        private final List<SocialAccount> socialAccounts;

        @c("title")
        @NotNull
        private final String title;

        @w0(parameters = 0)
        public static final class Body {
            public static final int $stable = 8;

            @c("color")
            @Nullable
            private String color;

            @c("style")
            @NotNull
            private final Style style;

            @c("text")
            @NotNull
            private final String text;

            public Body(@NotNull Style style, @NotNull String text, @Nullable String str) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                this.style = style;
                this.text = text;
                this.color = str;
            }

            public static /* synthetic */ Body copy$default(Body body, Style style, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    style = body.style;
                }
                if ((i10 & 2) != 0) {
                    str = body.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = body.color;
                }
                return body.copy(style, str, str2);
            }

            @NotNull
            public final Style component1() {
                return this.style;
            }

            @NotNull
            public final String component2() {
                return this.text;
            }

            @Nullable
            public final String component3() {
                return this.color;
            }

            @NotNull
            public final Body copy(@NotNull Style style, @NotNull String text, @Nullable String str) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                return new Body(style, text, str);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Body)) {
                    return false;
                }
                Body body = (Body) obj;
                return this.style == body.style && Intrinsics.areEqual(this.text, body.text) && Intrinsics.areEqual(this.color, body.color);
            }

            @Nullable
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final Style getStyle() {
                return this.style;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = ((this.style.hashCode() * 31) + this.text.hashCode()) * 31;
                String str = this.color;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final void setColor(@Nullable String str) {
                this.color = str;
            }

            @NotNull
            public String toString() {
                return "Body(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ')';
            }
        }

        @w0(parameters = 0)
        public static final class Footer {
            public static final int $stable = 8;

            @c("avatar_details")
            @Nullable
            private final AvatarDetails avatarDetails;

            @c("color")
            @Nullable
            private String color;

            @c("style")
            @NotNull
            private final Style style;

            @c("text")
            @NotNull
            private final String text;

            public Footer(@NotNull Style style, @NotNull String text, @Nullable String str, @Nullable AvatarDetails avatarDetails) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                this.style = style;
                this.text = text;
                this.color = str;
                this.avatarDetails = avatarDetails;
            }

            public static /* synthetic */ Footer copy$default(Footer footer, Style style, String str, String str2, AvatarDetails avatarDetails, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    style = footer.style;
                }
                if ((i10 & 2) != 0) {
                    str = footer.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = footer.color;
                }
                if ((i10 & 8) != 0) {
                    avatarDetails = footer.avatarDetails;
                }
                return footer.copy(style, str, str2, avatarDetails);
            }

            @NotNull
            public final Style component1() {
                return this.style;
            }

            @NotNull
            public final String component2() {
                return this.text;
            }

            @Nullable
            public final String component3() {
                return this.color;
            }

            @Nullable
            public final AvatarDetails component4() {
                return this.avatarDetails;
            }

            @NotNull
            public final Footer copy(@NotNull Style style, @NotNull String text, @Nullable String str, @Nullable AvatarDetails avatarDetails) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                return new Footer(style, text, str, avatarDetails);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) obj;
                return this.style == footer.style && Intrinsics.areEqual(this.text, footer.text) && Intrinsics.areEqual(this.color, footer.color) && Intrinsics.areEqual(this.avatarDetails, footer.avatarDetails);
            }

            @Nullable
            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            @Nullable
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final Style getStyle() {
                return this.style;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = ((this.style.hashCode() * 31) + this.text.hashCode()) * 31;
                String str = this.color;
                int iHashCode2 = 0;
                int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                if (avatarDetails != null) {
                    iHashCode2 = avatarDetails.hashCode();
                }
                return iHashCode3 + iHashCode2;
            }

            public final void setColor(@Nullable String str) {
                this.color = str;
            }

            @NotNull
            public String toString() {
                return "Footer(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ", avatarDetails=" + this.avatarDetails + ')';
            }
        }

        @w0(parameters = 1)
        public static final class SocialAccount {
            public static final int $stable = 0;

            @c("image_url")
            @NotNull
            private final String imageUrl;

            @c("profile_url")
            @NotNull
            private final String profileUrl;

            @c("provider")
            @NotNull
            private final String provider;

            @c("username")
            @NotNull
            private final String username;

            public SocialAccount(@NotNull String provider, @NotNull String profileUrl, @NotNull String imageUrl, @NotNull String username) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(username, "username");
                this.provider = provider;
                this.profileUrl = profileUrl;
                this.imageUrl = imageUrl;
                this.username = username;
            }

            public static /* synthetic */ SocialAccount copy$default(SocialAccount socialAccount, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = socialAccount.provider;
                }
                if ((i10 & 2) != 0) {
                    str2 = socialAccount.profileUrl;
                }
                if ((i10 & 4) != 0) {
                    str3 = socialAccount.imageUrl;
                }
                if ((i10 & 8) != 0) {
                    str4 = socialAccount.username;
                }
                return socialAccount.copy(str, str2, str3, str4);
            }

            @NotNull
            public final String component1() {
                return this.provider;
            }

            @NotNull
            public final String component2() {
                return this.profileUrl;
            }

            @NotNull
            public final String component3() {
                return this.imageUrl;
            }

            @NotNull
            public final String component4() {
                return this.username;
            }

            @NotNull
            public final SocialAccount copy(@NotNull String provider, @NotNull String profileUrl, @NotNull String imageUrl, @NotNull String username) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(username, "username");
                return new SocialAccount(provider, profileUrl, imageUrl, username);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SocialAccount)) {
                    return false;
                }
                SocialAccount socialAccount = (SocialAccount) obj;
                return Intrinsics.areEqual(this.provider, socialAccount.provider) && Intrinsics.areEqual(this.profileUrl, socialAccount.profileUrl) && Intrinsics.areEqual(this.imageUrl, socialAccount.imageUrl) && Intrinsics.areEqual(this.username, socialAccount.username);
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            public final String getProfileUrl() {
                return this.profileUrl;
            }

            @NotNull
            public final String getProvider() {
                return this.provider;
            }

            @NotNull
            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (((((this.provider.hashCode() * 31) + this.profileUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.username.hashCode();
            }

            @NotNull
            public String toString() {
                return "SocialAccount(provider=" + this.provider + ", profileUrl=" + this.profileUrl + ", imageUrl=" + this.imageUrl + ", username=" + this.username + ')';
            }
        }

        public enum Style {
            UNKNOWN,
            H1,
            PARAGRAPH,
            GREETING,
            INTRO,
            QUOTE,
            CAPTION;

            private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

            @NotNull
            public static a<Style> getEntries() {
                return $ENTRIES;
            }
        }

        public Expanded(@Nullable AvatarDetails avatarDetails, @NotNull List<Body> body, @NotNull List<Footer> footer, @NotNull List<SocialAccount> socialAccounts, @NotNull String title) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(socialAccounts, "socialAccounts");
            Intrinsics.checkNotNullParameter(title, "title");
            this.avatarDetails = avatarDetails;
            this.body = body;
            this.footer = footer;
            this.socialAccounts = socialAccounts;
            this.title = title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Expanded copy$default(Expanded expanded, AvatarDetails avatarDetails, List list, List list2, List list3, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatarDetails = expanded.avatarDetails;
            }
            if ((i10 & 2) != 0) {
                list = expanded.body;
            }
            if ((i10 & 4) != 0) {
                list2 = expanded.footer;
            }
            if ((i10 & 8) != 0) {
                list3 = expanded.socialAccounts;
            }
            if ((i10 & 16) != 0) {
                str = expanded.title;
            }
            String str2 = str;
            List list4 = list2;
            return expanded.copy(avatarDetails, list, list4, list3, str2);
        }

        @Nullable
        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        @NotNull
        public final List<Body> component2() {
            return this.body;
        }

        @NotNull
        public final List<Footer> component3() {
            return this.footer;
        }

        @NotNull
        public final List<SocialAccount> component4() {
            return this.socialAccounts;
        }

        @NotNull
        public final String component5() {
            return this.title;
        }

        @NotNull
        public final Expanded copy(@Nullable AvatarDetails avatarDetails, @NotNull List<Body> body, @NotNull List<Footer> footer, @NotNull List<SocialAccount> socialAccounts, @NotNull String title) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(socialAccounts, "socialAccounts");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Expanded(avatarDetails, body, footer, socialAccounts, title);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) obj;
            return Intrinsics.areEqual(this.avatarDetails, expanded.avatarDetails) && Intrinsics.areEqual(this.body, expanded.body) && Intrinsics.areEqual(this.footer, expanded.footer) && Intrinsics.areEqual(this.socialAccounts, expanded.socialAccounts) && Intrinsics.areEqual(this.title, expanded.title);
        }

        @Nullable
        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        @NotNull
        public final List<Body> getBody() {
            return this.body;
        }

        @NotNull
        public final List<Footer> getFooter() {
            return this.footer;
        }

        @NotNull
        public final List<SocialAccount> getSocialAccounts() {
            return this.socialAccounts;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            return ((((((((avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31) + this.body.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.socialAccounts.hashCode()) * 31) + this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return "Expanded(avatarDetails=" + this.avatarDetails + ", body=" + this.body + ", footer=" + this.footer + ", socialAccounts=" + this.socialAccounts + ", title=" + this.title + ')';
        }
    }

    public Header(@NotNull String backgroundColor, @NotNull String backgroundColorDark, @NotNull String foregroundPrimaryColor, @NotNull String foregroundPrimaryColorDark, @NotNull String foregroundSecondaryColor, @NotNull String foregroundSecondaryColorDark, @NotNull Collapsed collapsed, boolean z10, @Nullable Expanded expanded, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundColorDark, "backgroundColorDark");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColor, "foregroundPrimaryColor");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColorDark, "foregroundPrimaryColorDark");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColor, "foregroundSecondaryColor");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColorDark, "foregroundSecondaryColorDark");
        Intrinsics.checkNotNullParameter(collapsed, "collapsed");
        this.backgroundColor = backgroundColor;
        this.backgroundColorDark = backgroundColorDark;
        this.foregroundPrimaryColor = foregroundPrimaryColor;
        this.foregroundPrimaryColorDark = foregroundPrimaryColorDark;
        this.foregroundSecondaryColor = foregroundSecondaryColor;
        this.foregroundSecondaryColorDark = foregroundSecondaryColorDark;
        this.collapsed = collapsed;
        this.displayActiveIndicator = z10;
        this.expanded = expanded;
        this.useBotHeader = z11;
        this.hideGreeting = z12;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, String str4, String str5, String str6, Collapsed collapsed, boolean z10, Expanded expanded, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = header.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = header.backgroundColorDark;
        }
        if ((i10 & 4) != 0) {
            str3 = header.foregroundPrimaryColor;
        }
        if ((i10 & 8) != 0) {
            str4 = header.foregroundPrimaryColorDark;
        }
        if ((i10 & 16) != 0) {
            str5 = header.foregroundSecondaryColor;
        }
        if ((i10 & 32) != 0) {
            str6 = header.foregroundSecondaryColorDark;
        }
        if ((i10 & 64) != 0) {
            collapsed = header.collapsed;
        }
        if ((i10 & 128) != 0) {
            z10 = header.displayActiveIndicator;
        }
        if ((i10 & 256) != 0) {
            expanded = header.expanded;
        }
        if ((i10 & 512) != 0) {
            z11 = header.useBotHeader;
        }
        if ((i10 & 1024) != 0) {
            z12 = header.hideGreeting;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        boolean z15 = z10;
        Expanded expanded2 = expanded;
        String str7 = str6;
        Collapsed collapsed2 = collapsed;
        String str8 = str5;
        String str9 = str3;
        return header.copy(str, str2, str9, str4, str8, str7, collapsed2, z15, expanded2, z13, z14);
    }

    @NotNull
    public final String component1() {
        return this.backgroundColor;
    }

    public final boolean component10() {
        return this.useBotHeader;
    }

    public final boolean component11() {
        return this.hideGreeting;
    }

    @NotNull
    public final String component2() {
        return this.backgroundColorDark;
    }

    @NotNull
    public final String component3() {
        return this.foregroundPrimaryColor;
    }

    @NotNull
    public final String component4() {
        return this.foregroundPrimaryColorDark;
    }

    @NotNull
    public final String component5() {
        return this.foregroundSecondaryColor;
    }

    @NotNull
    public final String component6() {
        return this.foregroundSecondaryColorDark;
    }

    @NotNull
    public final Collapsed component7() {
        return this.collapsed;
    }

    public final boolean component8() {
        return this.displayActiveIndicator;
    }

    @Nullable
    public final Expanded component9() {
        return this.expanded;
    }

    @NotNull
    public final Header copy(@NotNull String backgroundColor, @NotNull String backgroundColorDark, @NotNull String foregroundPrimaryColor, @NotNull String foregroundPrimaryColorDark, @NotNull String foregroundSecondaryColor, @NotNull String foregroundSecondaryColorDark, @NotNull Collapsed collapsed, boolean z10, @Nullable Expanded expanded, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundColorDark, "backgroundColorDark");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColor, "foregroundPrimaryColor");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColorDark, "foregroundPrimaryColorDark");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColor, "foregroundSecondaryColor");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColorDark, "foregroundSecondaryColorDark");
        Intrinsics.checkNotNullParameter(collapsed, "collapsed");
        return new Header(backgroundColor, backgroundColorDark, foregroundPrimaryColor, foregroundPrimaryColorDark, foregroundSecondaryColor, foregroundSecondaryColorDark, collapsed, z10, expanded, z11, z12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.areEqual(this.backgroundColor, header.backgroundColor) && Intrinsics.areEqual(this.backgroundColorDark, header.backgroundColorDark) && Intrinsics.areEqual(this.foregroundPrimaryColor, header.foregroundPrimaryColor) && Intrinsics.areEqual(this.foregroundPrimaryColorDark, header.foregroundPrimaryColorDark) && Intrinsics.areEqual(this.foregroundSecondaryColor, header.foregroundSecondaryColor) && Intrinsics.areEqual(this.foregroundSecondaryColorDark, header.foregroundSecondaryColorDark) && Intrinsics.areEqual(this.collapsed, header.collapsed) && this.displayActiveIndicator == header.displayActiveIndicator && Intrinsics.areEqual(this.expanded, header.expanded) && this.useBotHeader == header.useBotHeader && this.hideGreeting == header.hideGreeting;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    @NotNull
    public final Collapsed getCollapsed() {
        return this.collapsed;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @Nullable
    public final Expanded getExpanded() {
        return this.expanded;
    }

    @NotNull
    public final String getForegroundPrimaryColor() {
        return this.foregroundPrimaryColor;
    }

    @NotNull
    public final String getForegroundPrimaryColorDark() {
        return this.foregroundPrimaryColorDark;
    }

    @NotNull
    public final String getForegroundSecondaryColor() {
        return this.foregroundSecondaryColor;
    }

    @NotNull
    public final String getForegroundSecondaryColorDark() {
        return this.foregroundSecondaryColorDark;
    }

    public final boolean getHideGreeting() {
        return this.hideGreeting;
    }

    public final boolean getUseBotHeader() {
        return this.useBotHeader;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.backgroundColor.hashCode() * 31) + this.backgroundColorDark.hashCode()) * 31) + this.foregroundPrimaryColor.hashCode()) * 31) + this.foregroundPrimaryColorDark.hashCode()) * 31) + this.foregroundSecondaryColor.hashCode()) * 31) + this.foregroundSecondaryColorDark.hashCode()) * 31) + this.collapsed.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator)) * 31;
        Expanded expanded = this.expanded;
        return ((((iHashCode + (expanded == null ? 0 : expanded.hashCode())) * 31) + Boolean.hashCode(this.useBotHeader)) * 31) + Boolean.hashCode(this.hideGreeting);
    }

    @NotNull
    public String toString() {
        return "Header(backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", foregroundPrimaryColor=" + this.foregroundPrimaryColor + ", foregroundPrimaryColorDark=" + this.foregroundPrimaryColorDark + ", foregroundSecondaryColor=" + this.foregroundSecondaryColor + ", foregroundSecondaryColorDark=" + this.foregroundSecondaryColorDark + ", collapsed=" + this.collapsed + ", displayActiveIndicator=" + this.displayActiveIndicator + ", expanded=" + this.expanded + ", useBotHeader=" + this.useBotHeader + ", hideGreeting=" + this.hideGreeting + ')';
    }
}

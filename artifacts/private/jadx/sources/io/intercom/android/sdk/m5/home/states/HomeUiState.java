package io.intercom.android.sdk.m5.home.states;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class HomeUiState {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class Error extends HomeUiState {
        public static final int $stable = 0;

        @NotNull
        private final ErrorState errorState;

        @NotNull
        private final ErrorHeader header;

        @Nullable
        private final PoweredBy poweredBy;

        @w0(parameters = 1)
        public static final class ErrorHeader {
            public static final int $stable = 0;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final String foregroundColor;

            public ErrorHeader(@NotNull String backgroundColor, @NotNull String foregroundColor) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                this.backgroundColor = backgroundColor;
                this.foregroundColor = foregroundColor;
            }

            public static /* synthetic */ ErrorHeader copy$default(ErrorHeader errorHeader, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = errorHeader.backgroundColor;
                }
                if ((i10 & 2) != 0) {
                    str2 = errorHeader.foregroundColor;
                }
                return errorHeader.copy(str, str2);
            }

            @NotNull
            public final String component1() {
                return this.backgroundColor;
            }

            @NotNull
            public final String component2() {
                return this.foregroundColor;
            }

            @NotNull
            public final ErrorHeader copy(@NotNull String backgroundColor, @NotNull String foregroundColor) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                return new ErrorHeader(backgroundColor, foregroundColor);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorHeader)) {
                    return false;
                }
                ErrorHeader errorHeader = (ErrorHeader) obj;
                if (Intrinsics.areEqual(this.backgroundColor, errorHeader.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, errorHeader.foregroundColor)) {
                    return true;
                }
                return false;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getForegroundColor() {
                return this.foregroundColor;
            }

            public int hashCode() {
                return (this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode();
            }

            @NotNull
            public String toString() {
                return "ErrorHeader(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@Nullable PoweredBy poweredBy, @NotNull ErrorState errorState, @NotNull ErrorHeader header) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(header, "header");
            this.poweredBy = poweredBy;
            this.errorState = errorState;
            this.header = header;
        }

        public static /* synthetic */ Error copy$default(Error error, PoweredBy poweredBy, ErrorState errorState, ErrorHeader errorHeader, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy = error.poweredBy;
            }
            if ((i10 & 2) != 0) {
                errorState = error.errorState;
            }
            if ((i10 & 4) != 0) {
                errorHeader = error.header;
            }
            return error.copy(poweredBy, errorState, errorHeader);
        }

        @Nullable
        public final PoweredBy component1() {
            return this.poweredBy;
        }

        @NotNull
        public final ErrorState component2() {
            return this.errorState;
        }

        @NotNull
        public final ErrorHeader component3() {
            return this.header;
        }

        @NotNull
        public final Error copy(@Nullable PoweredBy poweredBy, @NotNull ErrorState errorState, @NotNull ErrorHeader header) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(header, "header");
            return new Error(poweredBy, errorState, header);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.poweredBy, error.poweredBy) && Intrinsics.areEqual(this.errorState, error.errorState) && Intrinsics.areEqual(this.header, error.header);
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @NotNull
        public final ErrorHeader getHeader() {
            return this.header;
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        @Nullable
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            return ((((poweredBy == null ? 0 : poweredBy.hashCode()) * 31) + this.errorState.hashCode()) * 31) + this.header.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(poweredBy=" + this.poweredBy + ", errorState=" + this.errorState + ", header=" + this.header + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Loading extends HomeUiState {
        public static final int $stable = 0;

        @Nullable
        private final PoweredBy poweredBy;

        public Loading(@Nullable PoweredBy poweredBy) {
            super(null);
            this.poweredBy = poweredBy;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, PoweredBy poweredBy, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy = loading.poweredBy;
            }
            return loading.copy(poweredBy);
        }

        @Nullable
        public final PoweredBy component1() {
            return this.poweredBy;
        }

        @NotNull
        public final Loading copy(@Nullable PoweredBy poweredBy) {
            return new Loading(poweredBy);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.poweredBy, ((Loading) obj).poweredBy);
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        @Nullable
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            if (poweredBy == null) {
                return 0;
            }
            return poweredBy.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(poweredBy=" + this.poweredBy + ')';
        }
    }

    public /* synthetic */ HomeUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract PoweredBy getPoweredBy();

    private HomeUiState() {
    }

    @w0(parameters = 0)
    public static final class Content extends HomeUiState {
        public static final int $stable = 8;

        @NotNull
        private final List<AvatarWrapper> adminsAvatars;

        @Nullable
        private final AvatarWrapper botAvatar;

        @NotNull
        private final List<HomeCards> cards;

        @NotNull
        private final ContentHeader header;

        @Nullable
        private final PoweredBy poweredBy;
        private final boolean teammateAccessEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(@Nullable PoweredBy poweredBy, @NotNull List<? extends HomeCards> cards, @NotNull List<AvatarWrapper> adminsAvatars, @Nullable AvatarWrapper avatarWrapper, boolean z10, @NotNull ContentHeader header) {
            super(null);
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
            Intrinsics.checkNotNullParameter(header, "header");
            this.poweredBy = poweredBy;
            this.cards = cards;
            this.adminsAvatars = adminsAvatars;
            this.botAvatar = avatarWrapper;
            this.teammateAccessEnabled = z10;
            this.header = header;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, PoweredBy poweredBy, List list, List list2, AvatarWrapper avatarWrapper, boolean z10, ContentHeader contentHeader, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy = content.poweredBy;
            }
            if ((i10 & 2) != 0) {
                list = content.cards;
            }
            if ((i10 & 4) != 0) {
                list2 = content.adminsAvatars;
            }
            if ((i10 & 8) != 0) {
                avatarWrapper = content.botAvatar;
            }
            if ((i10 & 16) != 0) {
                z10 = content.teammateAccessEnabled;
            }
            if ((i10 & 32) != 0) {
                contentHeader = content.header;
            }
            boolean z11 = z10;
            ContentHeader contentHeader2 = contentHeader;
            return content.copy(poweredBy, list, list2, avatarWrapper, z11, contentHeader2);
        }

        @Nullable
        public final PoweredBy component1() {
            return this.poweredBy;
        }

        @NotNull
        public final List<HomeCards> component2() {
            return this.cards;
        }

        @NotNull
        public final List<AvatarWrapper> component3() {
            return this.adminsAvatars;
        }

        @Nullable
        public final AvatarWrapper component4() {
            return this.botAvatar;
        }

        public final boolean component5() {
            return this.teammateAccessEnabled;
        }

        @NotNull
        public final ContentHeader component6() {
            return this.header;
        }

        @NotNull
        public final Content copy(@Nullable PoweredBy poweredBy, @NotNull List<? extends HomeCards> cards, @NotNull List<AvatarWrapper> adminsAvatars, @Nullable AvatarWrapper avatarWrapper, boolean z10, @NotNull ContentHeader header) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
            Intrinsics.checkNotNullParameter(header, "header");
            return new Content(poweredBy, cards, adminsAvatars, avatarWrapper, z10, header);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.poweredBy, content.poweredBy) && Intrinsics.areEqual(this.cards, content.cards) && Intrinsics.areEqual(this.adminsAvatars, content.adminsAvatars) && Intrinsics.areEqual(this.botAvatar, content.botAvatar) && this.teammateAccessEnabled == content.teammateAccessEnabled && Intrinsics.areEqual(this.header, content.header);
        }

        @NotNull
        public final List<AvatarWrapper> getAdminsAvatars() {
            return this.adminsAvatars;
        }

        @Nullable
        public final AvatarWrapper getBotAvatar() {
            return this.botAvatar;
        }

        @NotNull
        public final List<HomeCards> getCards() {
            return this.cards;
        }

        @NotNull
        public final ContentHeader getHeader() {
            return this.header;
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        @Nullable
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final boolean getTeammateAccessEnabled() {
            return this.teammateAccessEnabled;
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            int iHashCode = (((((poweredBy == null ? 0 : poweredBy.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.adminsAvatars.hashCode()) * 31;
            AvatarWrapper avatarWrapper = this.botAvatar;
            return ((((iHashCode + (avatarWrapper != null ? avatarWrapper.hashCode() : 0)) * 31) + Boolean.hashCode(this.teammateAccessEnabled)) * 31) + this.header.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(poweredBy=" + this.poweredBy + ", cards=" + this.cards + ", adminsAvatars=" + this.adminsAvatars + ", botAvatar=" + this.botAvatar + ", teammateAccessEnabled=" + this.teammateAccessEnabled + ", header=" + this.header + ')';
        }

        @w0(parameters = 0)
        public static final class ContentHeader {
            public static final int $stable = 8;

            @NotNull
            private final List<AvatarWrapper> adminsAvatars;

            @NotNull
            private final CloseButtonColor closeButtonColor;

            @NotNull
            private final ColoredText greeting;

            @NotNull
            private final HeaderBackdropStyle headerBackdropStyle;

            @Nullable
            private final HeaderBackdropStyle headerBackdropStyleDark;

            @NotNull
            private final ColoredText intro;

            @Nullable
            private final String logoDarkUrl;

            @Nullable
            private final String logoUrl;
            private final boolean showAvatars;
            private final boolean showLogo;

            @w0(parameters = 1)
            public static abstract class HeaderBackdropStyle {
                public static final int $stable = 0;

                @w0(parameters = 0)
                public static final class Gradient extends HeaderBackdropStyle {
                    public static final int $stable = 8;

                    @NotNull
                    private final List<q0> colors;
                    private final boolean fade;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Gradient(@NotNull List<q0> colors, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        this.colors = colors;
                        this.fade = z10;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            list = gradient.colors;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = gradient.fade;
                        }
                        return gradient.copy(list, z10);
                    }

                    @NotNull
                    public final List<q0> component1() {
                        return this.colors;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    @NotNull
                    public final Gradient copy(@NotNull List<q0> colors, boolean z10) {
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        return new Gradient(colors, z10);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Gradient)) {
                            return false;
                        }
                        Gradient gradient = (Gradient) obj;
                        return Intrinsics.areEqual(this.colors, gradient.colors) && this.fade == gradient.fade;
                    }

                    @NotNull
                    public final List<q0> getColors() {
                        return this.colors;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        return (this.colors.hashCode() * 31) + Boolean.hashCode(this.fade);
                    }

                    @NotNull
                    public String toString() {
                        return "Gradient(colors=" + this.colors + ", fade=" + this.fade + ')';
                    }
                }

                @w0(parameters = 1)
                public static final class Image extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final boolean fade;
                    private final long fallbackColor;

                    @Nullable
                    private final String imageUrl;

                    public /* synthetic */ Image(long j10, String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j10, str, z10);
                    }

                    /* JADX INFO: renamed from: copy-ek8zF_U$default, reason: not valid java name */
                    public static /* synthetic */ Image m357copyek8zF_U$default(Image image, long j10, String str, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            j10 = image.fallbackColor;
                        }
                        if ((i10 & 2) != 0) {
                            str = image.imageUrl;
                        }
                        if ((i10 & 4) != 0) {
                            z10 = image.fade;
                        }
                        return image.m359copyek8zF_U(j10, str, z10);
                    }

                    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
                    public final long m358component10d7_KjU() {
                        return this.fallbackColor;
                    }

                    @Nullable
                    public final String component2() {
                        return this.imageUrl;
                    }

                    public final boolean component3() {
                        return this.fade;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: copy-ek8zF_U, reason: not valid java name */
                    public final Image m359copyek8zF_U(long j10, @Nullable String str, boolean z10) {
                        return new Image(j10, str, z10, null);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Image)) {
                            return false;
                        }
                        Image image = (Image) obj;
                        return q0.y(this.fallbackColor, image.fallbackColor) && Intrinsics.areEqual(this.imageUrl, image.imageUrl) && this.fade == image.fade;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    /* JADX INFO: renamed from: getFallbackColor-0d7_KjU, reason: not valid java name */
                    public final long m360getFallbackColor0d7_KjU() {
                        return this.fallbackColor;
                    }

                    @Nullable
                    public final String getImageUrl() {
                        return this.imageUrl;
                    }

                    public int hashCode() {
                        int iK = q0.K(this.fallbackColor) * 31;
                        String str = this.imageUrl;
                        return ((iK + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.fade);
                    }

                    @NotNull
                    public String toString() {
                        return "Image(fallbackColor=" + ((Object) q0.L(this.fallbackColor)) + ", imageUrl=" + this.imageUrl + ", fade=" + this.fade + ')';
                    }

                    private Image(long j10, String str, boolean z10) {
                        super(null);
                        this.fallbackColor = j10;
                        this.imageUrl = str;
                        this.fade = z10;
                    }
                }

                @w0(parameters = 1)
                public static final class Solid extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final long color;
                    private final boolean fade;

                    public /* synthetic */ Solid(long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j10, z10);
                    }

                    /* JADX INFO: renamed from: copy-DxMtmZc$default, reason: not valid java name */
                    public static /* synthetic */ Solid m361copyDxMtmZc$default(Solid solid, long j10, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            j10 = solid.color;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = solid.fade;
                        }
                        return solid.m363copyDxMtmZc(j10, z10);
                    }

                    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
                    public final long m362component10d7_KjU() {
                        return this.color;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: copy-DxMtmZc, reason: not valid java name */
                    public final Solid m363copyDxMtmZc(long j10, boolean z10) {
                        return new Solid(j10, z10, null);
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Solid)) {
                            return false;
                        }
                        Solid solid = (Solid) obj;
                        return q0.y(this.color, solid.color) && this.fade == solid.fade;
                    }

                    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
                    public final long m364getColor0d7_KjU() {
                        return this.color;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        return (q0.K(this.color) * 31) + Boolean.hashCode(this.fade);
                    }

                    @NotNull
                    public String toString() {
                        return "Solid(color=" + ((Object) q0.L(this.color)) + ", fade=" + this.fade + ')';
                    }

                    private Solid(long j10, boolean z10) {
                        super(null);
                        this.color = j10;
                        this.fade = z10;
                    }
                }

                public /* synthetic */ HeaderBackdropStyle(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract boolean getFade();

                private HeaderBackdropStyle() {
                }
            }

            public ContentHeader(boolean z10, @Nullable String str, @Nullable String str2, @NotNull ColoredText greeting, @NotNull ColoredText intro, @NotNull HeaderBackdropStyle headerBackdropStyle, @Nullable HeaderBackdropStyle headerBackdropStyle2, boolean z11, @NotNull List<AvatarWrapper> adminsAvatars, @NotNull CloseButtonColor closeButtonColor) {
                Intrinsics.checkNotNullParameter(greeting, "greeting");
                Intrinsics.checkNotNullParameter(intro, "intro");
                Intrinsics.checkNotNullParameter(headerBackdropStyle, "headerBackdropStyle");
                Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
                Intrinsics.checkNotNullParameter(closeButtonColor, "closeButtonColor");
                this.showLogo = z10;
                this.logoUrl = str;
                this.logoDarkUrl = str2;
                this.greeting = greeting;
                this.intro = intro;
                this.headerBackdropStyle = headerBackdropStyle;
                this.headerBackdropStyleDark = headerBackdropStyle2;
                this.showAvatars = z11;
                this.adminsAvatars = adminsAvatars;
                this.closeButtonColor = closeButtonColor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ContentHeader copy$default(ContentHeader contentHeader, boolean z10, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List list, CloseButtonColor closeButtonColor, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = contentHeader.showLogo;
                }
                if ((i10 & 2) != 0) {
                    str = contentHeader.logoUrl;
                }
                if ((i10 & 4) != 0) {
                    str2 = contentHeader.logoDarkUrl;
                }
                if ((i10 & 8) != 0) {
                    coloredText = contentHeader.greeting;
                }
                if ((i10 & 16) != 0) {
                    coloredText2 = contentHeader.intro;
                }
                if ((i10 & 32) != 0) {
                    headerBackdropStyle = contentHeader.headerBackdropStyle;
                }
                if ((i10 & 64) != 0) {
                    headerBackdropStyle2 = contentHeader.headerBackdropStyleDark;
                }
                if ((i10 & 128) != 0) {
                    z11 = contentHeader.showAvatars;
                }
                if ((i10 & 256) != 0) {
                    list = contentHeader.adminsAvatars;
                }
                if ((i10 & 512) != 0) {
                    closeButtonColor = contentHeader.closeButtonColor;
                }
                List list2 = list;
                CloseButtonColor closeButtonColor2 = closeButtonColor;
                HeaderBackdropStyle headerBackdropStyle3 = headerBackdropStyle2;
                boolean z12 = z11;
                ColoredText coloredText3 = coloredText2;
                HeaderBackdropStyle headerBackdropStyle4 = headerBackdropStyle;
                return contentHeader.copy(z10, str, str2, coloredText, coloredText3, headerBackdropStyle4, headerBackdropStyle3, z12, list2, closeButtonColor2);
            }

            public final boolean component1() {
                return this.showLogo;
            }

            @NotNull
            public final CloseButtonColor component10() {
                return this.closeButtonColor;
            }

            @Nullable
            public final String component2() {
                return this.logoUrl;
            }

            @Nullable
            public final String component3() {
                return this.logoDarkUrl;
            }

            @NotNull
            public final ColoredText component4() {
                return this.greeting;
            }

            @NotNull
            public final ColoredText component5() {
                return this.intro;
            }

            @NotNull
            public final HeaderBackdropStyle component6() {
                return this.headerBackdropStyle;
            }

            @Nullable
            public final HeaderBackdropStyle component7() {
                return this.headerBackdropStyleDark;
            }

            public final boolean component8() {
                return this.showAvatars;
            }

            @NotNull
            public final List<AvatarWrapper> component9() {
                return this.adminsAvatars;
            }

            @NotNull
            public final ContentHeader copy(boolean z10, @Nullable String str, @Nullable String str2, @NotNull ColoredText greeting, @NotNull ColoredText intro, @NotNull HeaderBackdropStyle headerBackdropStyle, @Nullable HeaderBackdropStyle headerBackdropStyle2, boolean z11, @NotNull List<AvatarWrapper> adminsAvatars, @NotNull CloseButtonColor closeButtonColor) {
                Intrinsics.checkNotNullParameter(greeting, "greeting");
                Intrinsics.checkNotNullParameter(intro, "intro");
                Intrinsics.checkNotNullParameter(headerBackdropStyle, "headerBackdropStyle");
                Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
                Intrinsics.checkNotNullParameter(closeButtonColor, "closeButtonColor");
                return new ContentHeader(z10, str, str2, greeting, intro, headerBackdropStyle, headerBackdropStyle2, z11, adminsAvatars, closeButtonColor);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentHeader)) {
                    return false;
                }
                ContentHeader contentHeader = (ContentHeader) obj;
                return this.showLogo == contentHeader.showLogo && Intrinsics.areEqual(this.logoUrl, contentHeader.logoUrl) && Intrinsics.areEqual(this.logoDarkUrl, contentHeader.logoDarkUrl) && Intrinsics.areEqual(this.greeting, contentHeader.greeting) && Intrinsics.areEqual(this.intro, contentHeader.intro) && Intrinsics.areEqual(this.headerBackdropStyle, contentHeader.headerBackdropStyle) && Intrinsics.areEqual(this.headerBackdropStyleDark, contentHeader.headerBackdropStyleDark) && this.showAvatars == contentHeader.showAvatars && Intrinsics.areEqual(this.adminsAvatars, contentHeader.adminsAvatars) && Intrinsics.areEqual(this.closeButtonColor, contentHeader.closeButtonColor);
            }

            @NotNull
            public final List<AvatarWrapper> getAdminsAvatars() {
                return this.adminsAvatars;
            }

            @NotNull
            public final CloseButtonColor getCloseButtonColor() {
                return this.closeButtonColor;
            }

            @NotNull
            public final ColoredText getGreeting() {
                return this.greeting;
            }

            @NotNull
            public final HeaderBackdropStyle getHeaderBackdropStyle() {
                return this.headerBackdropStyle;
            }

            @Nullable
            public final HeaderBackdropStyle getHeaderBackdropStyleDark() {
                return this.headerBackdropStyleDark;
            }

            @NotNull
            public final ColoredText getIntro() {
                return this.intro;
            }

            @Nullable
            public final String getLogoDarkUrl() {
                return this.logoDarkUrl;
            }

            @Nullable
            public final String getLogoUrl() {
                return this.logoUrl;
            }

            public final boolean getShowAvatars() {
                return this.showAvatars;
            }

            public final boolean getShowLogo() {
                return this.showLogo;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.showLogo) * 31;
                String str = this.logoUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.logoDarkUrl;
                int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.greeting.hashCode()) * 31) + this.intro.hashCode()) * 31) + this.headerBackdropStyle.hashCode()) * 31;
                HeaderBackdropStyle headerBackdropStyle = this.headerBackdropStyleDark;
                return ((((((iHashCode3 + (headerBackdropStyle != null ? headerBackdropStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.showAvatars)) * 31) + this.adminsAvatars.hashCode()) * 31) + this.closeButtonColor.hashCode();
            }

            @NotNull
            public String toString() {
                return "ContentHeader(showLogo=" + this.showLogo + ", logoUrl=" + this.logoUrl + ", logoDarkUrl=" + this.logoDarkUrl + ", greeting=" + this.greeting + ", intro=" + this.intro + ", headerBackdropStyle=" + this.headerBackdropStyle + ", headerBackdropStyleDark=" + this.headerBackdropStyleDark + ", showAvatars=" + this.showAvatars + ", adminsAvatars=" + this.adminsAvatars + ", closeButtonColor=" + this.closeButtonColor + ')';
            }

            @w0(parameters = 1)
            public static final class CloseButtonColor {
                public static final int $stable = 0;

                @NotNull
                private final String backgroundColor;
                private final float backgroundOpacity;

                @NotNull
                private final String foregroundColor;

                @Nullable
                private final String foregroundColorDark;

                public CloseButtonColor(@NotNull String backgroundColor, @NotNull String foregroundColor, @Nullable String str, float f10) {
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                    this.backgroundColor = backgroundColor;
                    this.foregroundColor = foregroundColor;
                    this.foregroundColorDark = str;
                    this.backgroundOpacity = f10;
                }

                public static /* synthetic */ CloseButtonColor copy$default(CloseButtonColor closeButtonColor, String str, String str2, String str3, float f10, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = closeButtonColor.backgroundColor;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = closeButtonColor.foregroundColor;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = closeButtonColor.foregroundColorDark;
                    }
                    if ((i10 & 8) != 0) {
                        f10 = closeButtonColor.backgroundOpacity;
                    }
                    return closeButtonColor.copy(str, str2, str3, f10);
                }

                @NotNull
                public final String component1() {
                    return this.backgroundColor;
                }

                @NotNull
                public final String component2() {
                    return this.foregroundColor;
                }

                @Nullable
                public final String component3() {
                    return this.foregroundColorDark;
                }

                public final float component4() {
                    return this.backgroundOpacity;
                }

                @NotNull
                public final CloseButtonColor copy(@NotNull String backgroundColor, @NotNull String foregroundColor, @Nullable String str, float f10) {
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                    return new CloseButtonColor(backgroundColor, foregroundColor, str, f10);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CloseButtonColor)) {
                        return false;
                    }
                    CloseButtonColor closeButtonColor = (CloseButtonColor) obj;
                    return Intrinsics.areEqual(this.backgroundColor, closeButtonColor.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, closeButtonColor.foregroundColor) && Intrinsics.areEqual(this.foregroundColorDark, closeButtonColor.foregroundColorDark) && Float.compare(this.backgroundOpacity, closeButtonColor.backgroundOpacity) == 0;
                }

                @NotNull
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final float getBackgroundOpacity() {
                    return this.backgroundOpacity;
                }

                @NotNull
                public final String getForegroundColor() {
                    return this.foregroundColor;
                }

                @Nullable
                public final String getForegroundColorDark() {
                    return this.foregroundColorDark;
                }

                public int hashCode() {
                    int iHashCode = ((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31;
                    String str = this.foregroundColorDark;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.backgroundOpacity);
                }

                @NotNull
                public String toString() {
                    return "CloseButtonColor(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", foregroundColorDark=" + this.foregroundColorDark + ", backgroundOpacity=" + this.backgroundOpacity + ')';
                }

                public /* synthetic */ CloseButtonColor(String str, String str2, String str3, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3, f10);
                }
            }

            @w0(parameters = 1)
            public static final class ColoredText {
                public static final int $stable = 0;
                private final float opacity;

                @NotNull
                private final String text;

                @Nullable
                private final String textColorDark;

                @NotNull
                private final String textColorLight;

                @Nullable
                private final String textColorType;

                @Nullable
                private final String textColorTypeDark;

                public ColoredText(@NotNull String text, float f10, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String textColorLight) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(textColorLight, "textColorLight");
                    this.text = text;
                    this.opacity = f10;
                    this.textColorType = str;
                    this.textColorTypeDark = str2;
                    this.textColorDark = str3;
                    this.textColorLight = textColorLight;
                }

                public static /* synthetic */ ColoredText copy$default(ColoredText coloredText, String str, float f10, String str2, String str3, String str4, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = coloredText.text;
                    }
                    if ((i10 & 2) != 0) {
                        f10 = coloredText.opacity;
                    }
                    if ((i10 & 4) != 0) {
                        str2 = coloredText.textColorType;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = coloredText.textColorTypeDark;
                    }
                    if ((i10 & 16) != 0) {
                        str4 = coloredText.textColorDark;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = coloredText.textColorLight;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    return coloredText.copy(str, f10, str2, str3, str6, str7);
                }

                @NotNull
                public final String component1() {
                    return this.text;
                }

                public final float component2() {
                    return this.opacity;
                }

                @Nullable
                public final String component3() {
                    return this.textColorType;
                }

                @Nullable
                public final String component4() {
                    return this.textColorTypeDark;
                }

                @Nullable
                public final String component5() {
                    return this.textColorDark;
                }

                @NotNull
                public final String component6() {
                    return this.textColorLight;
                }

                @NotNull
                public final ColoredText copy(@NotNull String text, float f10, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String textColorLight) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(textColorLight, "textColorLight");
                    return new ColoredText(text, f10, str, str2, str3, textColorLight);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ColoredText)) {
                        return false;
                    }
                    ColoredText coloredText = (ColoredText) obj;
                    return Intrinsics.areEqual(this.text, coloredText.text) && Float.compare(this.opacity, coloredText.opacity) == 0 && Intrinsics.areEqual(this.textColorType, coloredText.textColorType) && Intrinsics.areEqual(this.textColorTypeDark, coloredText.textColorTypeDark) && Intrinsics.areEqual(this.textColorDark, coloredText.textColorDark) && Intrinsics.areEqual(this.textColorLight, coloredText.textColorLight);
                }

                public final float getOpacity() {
                    return this.opacity;
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                @Nullable
                public final String getTextColorDark() {
                    return this.textColorDark;
                }

                @NotNull
                public final String getTextColorLight() {
                    return this.textColorLight;
                }

                @Nullable
                public final String getTextColorType() {
                    return this.textColorType;
                }

                @Nullable
                public final String getTextColorTypeDark() {
                    return this.textColorTypeDark;
                }

                public int hashCode() {
                    int iHashCode = ((this.text.hashCode() * 31) + Float.hashCode(this.opacity)) * 31;
                    String str = this.textColorType;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.textColorTypeDark;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.textColorDark;
                    return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.textColorLight.hashCode();
                }

                @NotNull
                public String toString() {
                    return "ColoredText(text=" + this.text + ", opacity=" + this.opacity + ", textColorType=" + this.textColorType + ", textColorTypeDark=" + this.textColorTypeDark + ", textColorDark=" + this.textColorDark + ", textColorLight=" + this.textColorLight + ')';
                }

                public /* synthetic */ ColoredText(String str, float f10, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, f10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, str5);
                }
            }

            public /* synthetic */ ContentHeader(boolean z10, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List list, CloseButtonColor closeButtonColor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, str, (i10 & 4) != 0 ? null : str2, coloredText, coloredText2, headerBackdropStyle, (i10 & 64) != 0 ? null : headerBackdropStyle2, z11, list, closeButtonColor);
            }
        }
    }
}

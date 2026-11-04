package io.intercom.android.sdk.m5.components.avatar;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AvatarWrapper {
    public static final int $stable = 8;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final AvatarWrapper NULL;

    @NotNull
    private final Avatar avatar;

    @NotNull
    private final String initials;
    private final boolean isBot;

    @NotNull
    private final String label;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvatarWrapper getNULL() {
            return AvatarWrapper.NULL;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        Avatar NULL2 = Avatar.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL2, "NULL");
        NULL = new AvatarWrapper(NULL2, false, 2, defaultConstructorMarker);
    }

    public AvatarWrapper(@NotNull Avatar avatar, boolean z10) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.avatar = avatar;
        this.isBot = z10;
        String initials = avatar.getInitials();
        Intrinsics.checkNotNullExpressionValue(initials, "getInitials(...)");
        this.initials = initials;
        String label = avatar.getLabel();
        Intrinsics.checkNotNullExpressionValue(label, "getLabel(...)");
        this.label = label;
    }

    public static /* synthetic */ AvatarWrapper copy$default(AvatarWrapper avatarWrapper, Avatar avatar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatar = avatarWrapper.avatar;
        }
        if ((i10 & 2) != 0) {
            z10 = avatarWrapper.isBot;
        }
        return avatarWrapper.copy(avatar, z10);
    }

    @NotNull
    public final Avatar component1() {
        return this.avatar;
    }

    public final boolean component2() {
        return this.isBot;
    }

    @NotNull
    public final AvatarWrapper copy(@NotNull Avatar avatar, boolean z10) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new AvatarWrapper(avatar, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarWrapper)) {
            return false;
        }
        AvatarWrapper avatarWrapper = (AvatarWrapper) obj;
        return Intrinsics.areEqual(this.avatar, avatarWrapper.avatar) && this.isBot == avatarWrapper.isBot;
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final String getImageUrl(@Nullable c0 c0Var, int i10) {
        c0Var.E(1575443384);
        String strSelectUrlForThemeCompose$intercom_sdk_base_release = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(this.avatar.getImageUrl(), this.avatar.getImageDarkUrl(), c0Var, a5.S0);
        if (strSelectUrlForThemeCompose$intercom_sdk_base_release == null) {
            strSelectUrlForThemeCompose$intercom_sdk_base_release = "";
        }
        c0Var.A();
        return strSelectUrlForThemeCompose$intercom_sdk_base_release;
    }

    @NotNull
    public final String getInitials() {
        return this.initials;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.avatar.hashCode() * 31) + Boolean.hashCode(this.isBot);
    }

    public final boolean isBot() {
        return this.isBot;
    }

    @NotNull
    public String toString() {
        return "AvatarWrapper(avatar=" + this.avatar + ", isBot=" + this.isBot + ')';
    }

    public /* synthetic */ AvatarWrapper(Avatar avatar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(avatar, (i10 & 2) != 0 ? false : z10);
    }
}

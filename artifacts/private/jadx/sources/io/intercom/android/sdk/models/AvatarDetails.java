package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AvatarDetails {
    public static final int $stable = 8;

    @c("avatar_type")
    @NotNull
    private final AvatarType avatarType;

    @c("avatars")
    @NotNull
    private final List<Avatar.Builder> avatars;

    public AvatarDetails(@NotNull AvatarType avatarType, @NotNull List<Avatar.Builder> avatars) {
        Intrinsics.checkNotNullParameter(avatarType, "avatarType");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.avatarType = avatarType;
        this.avatars = avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarDetails copy$default(AvatarDetails avatarDetails, AvatarType avatarType, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatarType = avatarDetails.avatarType;
        }
        if ((i10 & 2) != 0) {
            list = avatarDetails.avatars;
        }
        return avatarDetails.copy(avatarType, list);
    }

    @NotNull
    public final AvatarType component1() {
        return this.avatarType;
    }

    @NotNull
    public final List<Avatar.Builder> component2() {
        return this.avatars;
    }

    @NotNull
    public final AvatarDetails copy(@NotNull AvatarType avatarType, @NotNull List<Avatar.Builder> avatars) {
        Intrinsics.checkNotNullParameter(avatarType, "avatarType");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        return new AvatarDetails(avatarType, avatars);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarDetails)) {
            return false;
        }
        AvatarDetails avatarDetails = (AvatarDetails) obj;
        return this.avatarType == avatarDetails.avatarType && Intrinsics.areEqual(this.avatars, avatarDetails.avatars);
    }

    @NotNull
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    @NotNull
    public final List<Avatar.Builder> getAvatars() {
        return this.avatars;
    }

    public int hashCode() {
        return (this.avatarType.hashCode() * 31) + this.avatars.hashCode();
    }

    @NotNull
    public String toString() {
        return "AvatarDetails(avatarType=" + this.avatarType + ", avatars=" + this.avatars + ')';
    }
}

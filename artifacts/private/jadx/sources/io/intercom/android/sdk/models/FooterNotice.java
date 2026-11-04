package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class FooterNotice {
    public static final int $stable = 8;

    @c("avatar_details")
    @Nullable
    private final AvatarDetails avatarDetails;

    @c("subtitle")
    @Nullable
    private final String subtitle;

    @c("title")
    @NotNull
    private final String title;

    public FooterNotice(@NotNull String title, @Nullable String str, @Nullable AvatarDetails avatarDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.avatarDetails = avatarDetails;
    }

    public static /* synthetic */ FooterNotice copy$default(FooterNotice footerNotice, String str, String str2, AvatarDetails avatarDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footerNotice.title;
        }
        if ((i10 & 2) != 0) {
            str2 = footerNotice.subtitle;
        }
        if ((i10 & 4) != 0) {
            avatarDetails = footerNotice.avatarDetails;
        }
        return footerNotice.copy(str, str2, avatarDetails);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.subtitle;
    }

    @Nullable
    public final AvatarDetails component3() {
        return this.avatarDetails;
    }

    @NotNull
    public final FooterNotice copy(@NotNull String title, @Nullable String str, @Nullable AvatarDetails avatarDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FooterNotice(title, str, avatarDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNotice)) {
            return false;
        }
        FooterNotice footerNotice = (FooterNotice) obj;
        return Intrinsics.areEqual(this.title, footerNotice.title) && Intrinsics.areEqual(this.subtitle, footerNotice.subtitle) && Intrinsics.areEqual(this.avatarDetails, footerNotice.avatarDetails);
    }

    @Nullable
    public final AvatarDetails getAvatarDetails() {
        return this.avatarDetails;
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
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AvatarDetails avatarDetails = this.avatarDetails;
        return iHashCode2 + (avatarDetails != null ? avatarDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FooterNotice(title=" + this.title + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ')';
    }
}

package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@b0
public final class Avatar {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String initials;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Avatar> serializer() {
            return Avatar$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Avatar() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = avatar.initials;
        }
        if ((i10 & 2) != 0) {
            str2 = avatar.imageUrl;
        }
        return avatar.copy(str, str2);
    }

    @a0("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @a0("initials")
    public static /* synthetic */ void getInitials$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Avatar avatar, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(avatar.initials, "")) {
            eVar.encodeStringElement(serialDescriptor, 0, avatar.initials);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.areEqual(avatar.imageUrl, "")) {
            return;
        }
        eVar.encodeStringElement(serialDescriptor, 1, avatar.imageUrl);
    }

    @NotNull
    public final String component1() {
        return this.initials;
    }

    @NotNull
    public final String component2() {
        return this.imageUrl;
    }

    @NotNull
    public final Avatar copy(@NotNull String initials, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new Avatar(initials, imageUrl);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(this.initials, avatar.initials) && Intrinsics.areEqual(this.imageUrl, avatar.imageUrl);
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        return (this.initials.hashCode() * 31) + this.imageUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "Avatar(initials=" + this.initials + ", imageUrl=" + this.imageUrl + ')';
    }

    public /* synthetic */ Avatar(int i10, String str, String str2, v2 v2Var) {
        if ((i10 & 1) == 0) {
            this.initials = "";
        } else {
            this.initials = str;
        }
        if ((i10 & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
    }

    public Avatar(@NotNull String initials, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.initials = initials;
        this.imageUrl = imageUrl;
    }

    public /* synthetic */ Avatar(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}

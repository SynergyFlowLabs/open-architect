package com.superwall.sdk.models.postback;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PostbackProductIdentifier {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String identifier;

    @NotNull
    private final String platform;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PostbackProductIdentifier> serializer() {
            return PostbackProductIdentifier$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostbackProductIdentifier(int i10, String str, String str2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, PostbackProductIdentifier$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.platform = str2;
    }

    public static /* synthetic */ PostbackProductIdentifier copy$default(PostbackProductIdentifier postbackProductIdentifier, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postbackProductIdentifier.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = postbackProductIdentifier.platform;
        }
        return postbackProductIdentifier.copy(str, str2);
    }

    @a0("identifier")
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @a0("platform")
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PostbackProductIdentifier postbackProductIdentifier, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, postbackProductIdentifier.identifier);
        eVar.encodeStringElement(serialDescriptor, 1, postbackProductIdentifier.platform);
    }

    @NotNull
    public final String component1() {
        return this.identifier;
    }

    @NotNull
    public final String component2() {
        return this.platform;
    }

    @NotNull
    public final PostbackProductIdentifier copy(@NotNull String identifier, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new PostbackProductIdentifier(identifier, platform);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostbackProductIdentifier)) {
            return false;
        }
        PostbackProductIdentifier postbackProductIdentifier = (PostbackProductIdentifier) obj;
        if (Intrinsics.areEqual(this.identifier, postbackProductIdentifier.identifier) && Intrinsics.areEqual(this.platform, postbackProductIdentifier.platform)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public final boolean getIsiOS() {
        String lowerCase = this.platform.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.areEqual(lowerCase, "ios");
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.platform.hashCode();
    }

    @NotNull
    public String toString() {
        return "PostbackProductIdentifier(identifier=" + this.identifier + ", platform=" + this.platform + ")";
    }

    public PostbackProductIdentifier(@NotNull String identifier, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.identifier = identifier;
        this.platform = platform;
    }
}

package com.devtodev.analytics.internal.validator;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialNetworkPostData {

    @NotNull
    private final String name;

    @NotNull
    private final String reason;

    public SocialNetworkPostData(@NotNull String name, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.name = name;
        this.reason = reason;
    }

    public static /* synthetic */ SocialNetworkPostData copy$default(SocialNetworkPostData socialNetworkPostData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = socialNetworkPostData.name;
        }
        if ((i10 & 2) != 0) {
            str2 = socialNetworkPostData.reason;
        }
        return socialNetworkPostData.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.reason;
    }

    @NotNull
    public final SocialNetworkPostData copy(@NotNull String name, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new SocialNetworkPostData(name, reason);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialNetworkPostData)) {
            return false;
        }
        SocialNetworkPostData socialNetworkPostData = (SocialNetworkPostData) obj;
        return Intrinsics.areEqual(this.name, socialNetworkPostData.name) && Intrinsics.areEqual(this.reason, socialNetworkPostData.reason);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SocialNetworkPostData(name=" + this.name + ", reason=" + this.reason + ")";
    }
}

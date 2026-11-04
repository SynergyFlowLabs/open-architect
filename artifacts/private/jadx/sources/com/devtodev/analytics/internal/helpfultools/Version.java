package com.devtodev.analytics.internal.helpfultools;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Version {

    @NotNull
    private final String version;

    public Version(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.version = version;
    }

    public static /* synthetic */ Version copy$default(Version version, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = version.version;
        }
        return version.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.version;
    }

    @NotNull
    public final Version copy(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new Version(version);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Version) && Intrinsics.areEqual(this.version, ((Version) obj).version);
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode();
    }

    @NotNull
    public String toString() {
        return "Version(version=" + this.version + ")";
    }
}

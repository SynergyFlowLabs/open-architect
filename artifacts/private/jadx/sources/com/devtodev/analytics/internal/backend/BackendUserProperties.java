package com.devtodev.analytics.internal.backend;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendUserProperties {

    @NotNull
    private final String country;

    public BackendUserProperties(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.country = country;
    }

    public static /* synthetic */ BackendUserProperties copy$default(BackendUserProperties backendUserProperties, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = backendUserProperties.country;
        }
        return backendUserProperties.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.country;
    }

    @NotNull
    public final BackendUserProperties copy(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return new BackendUserProperties(country);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackendUserProperties) && Intrinsics.areEqual(this.country, ((BackendUserProperties) obj).country);
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        return this.country.hashCode();
    }

    @NotNull
    public String toString() {
        return "BackendUserProperties(country=" + this.country + ")";
    }
}

package com.superwall.sdk.network;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class URLQueryItem {

    @NotNull
    private final String name;

    @NotNull
    private final String value;

    public URLQueryItem(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
    }

    public static /* synthetic */ URLQueryItem copy$default(URLQueryItem uRLQueryItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uRLQueryItem.name;
        }
        if ((i10 & 2) != 0) {
            str2 = uRLQueryItem.value;
        }
        return uRLQueryItem.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final URLQueryItem copy(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new URLQueryItem(name, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLQueryItem)) {
            return false;
        }
        URLQueryItem uRLQueryItem = (URLQueryItem) obj;
        return Intrinsics.areEqual(this.name, uRLQueryItem.name) && Intrinsics.areEqual(this.value, uRLQueryItem.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "URLQueryItem(name=" + this.name + ", value=" + this.value + ")";
    }
}

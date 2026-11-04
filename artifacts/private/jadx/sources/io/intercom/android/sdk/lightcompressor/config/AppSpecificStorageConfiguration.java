package io.intercom.android.sdk.lightcompressor.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class AppSpecificStorageConfiguration {

    @Nullable
    private String subFolderName;

    /* JADX WARN: Multi-variable type inference failed */
    public AppSpecificStorageConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AppSpecificStorageConfiguration copy$default(AppSpecificStorageConfiguration appSpecificStorageConfiguration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appSpecificStorageConfiguration.subFolderName;
        }
        return appSpecificStorageConfiguration.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.subFolderName;
    }

    @NotNull
    public final AppSpecificStorageConfiguration copy(@Nullable String str) {
        return new AppSpecificStorageConfiguration(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppSpecificStorageConfiguration) && Intrinsics.areEqual(this.subFolderName, ((AppSpecificStorageConfiguration) obj).subFolderName);
    }

    @Nullable
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        String str = this.subFolderName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSubFolderName(@Nullable String str) {
        this.subFolderName = str;
    }

    @NotNull
    public String toString() {
        return "AppSpecificStorageConfiguration(subFolderName=" + this.subFolderName + ')';
    }

    public AppSpecificStorageConfiguration(@Nullable String str) {
        this.subFolderName = str;
    }

    public /* synthetic */ AppSpecificStorageConfiguration(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}

package io.intercom.android.sdk.lightcompressor.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SharedStorageConfiguration {

    @Nullable
    private SaveLocation saveAt;

    @Nullable
    private String subFolderName;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedStorageConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SharedStorageConfiguration copy$default(SharedStorageConfiguration sharedStorageConfiguration, SaveLocation saveLocation, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saveLocation = sharedStorageConfiguration.saveAt;
        }
        if ((i10 & 2) != 0) {
            str = sharedStorageConfiguration.subFolderName;
        }
        return sharedStorageConfiguration.copy(saveLocation, str);
    }

    @Nullable
    public final SaveLocation component1() {
        return this.saveAt;
    }

    @Nullable
    public final String component2() {
        return this.subFolderName;
    }

    @NotNull
    public final SharedStorageConfiguration copy(@Nullable SaveLocation saveLocation, @Nullable String str) {
        return new SharedStorageConfiguration(saveLocation, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedStorageConfiguration)) {
            return false;
        }
        SharedStorageConfiguration sharedStorageConfiguration = (SharedStorageConfiguration) obj;
        return this.saveAt == sharedStorageConfiguration.saveAt && Intrinsics.areEqual(this.subFolderName, sharedStorageConfiguration.subFolderName);
    }

    @Nullable
    public final SaveLocation getSaveAt() {
        return this.saveAt;
    }

    @Nullable
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        SaveLocation saveLocation = this.saveAt;
        int iHashCode = (saveLocation == null ? 0 : saveLocation.hashCode()) * 31;
        String str = this.subFolderName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setSaveAt(@Nullable SaveLocation saveLocation) {
        this.saveAt = saveLocation;
    }

    public final void setSubFolderName(@Nullable String str) {
        this.subFolderName = str;
    }

    @NotNull
    public String toString() {
        return "SharedStorageConfiguration(saveAt=" + this.saveAt + ", subFolderName=" + this.subFolderName + ')';
    }

    public SharedStorageConfiguration(@Nullable SaveLocation saveLocation, @Nullable String str) {
        this.saveAt = saveLocation;
        this.subFolderName = str;
    }

    public /* synthetic */ SharedStorageConfiguration(SaveLocation saveLocation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : saveLocation, (i10 & 2) != 0 ? null : str);
    }
}

package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.config.Config;
import java.io.File;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LatestConfig implements Storable<Config> {

    @NotNull
    public static final LatestConfig INSTANCE = new LatestConfig();

    private LatestConfig() {
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public File file(@NotNull Context context) {
        return Storable.DefaultImpls.file(this, context);
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public SearchPathDirectory getDirectory() {
        return SearchPathDirectory.CACHE;
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public String getKey() {
        return "store.configCache";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Config> getSerializer() {
        return Config.Companion.serializer();
    }
}

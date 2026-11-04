package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.internal.WebRedemptionResponse;
import java.io.File;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LatestRedemptionResponse implements Storable<WebRedemptionResponse> {

    @NotNull
    public static final LatestRedemptionResponse INSTANCE = new LatestRedemptionResponse();

    private LatestRedemptionResponse() {
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public File file(@NotNull Context context) {
        return Storable.DefaultImpls.file(this, context);
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public SearchPathDirectory getDirectory() {
        return SearchPathDirectory.APP_SPECIFIC_DOCUMENTS;
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public String getKey() {
        return "store.latestRedemptionResponse";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<WebRedemptionResponse> getSerializer() {
        return WebRedemptionResponse.Companion.serializer();
    }
}

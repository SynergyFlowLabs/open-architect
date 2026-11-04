package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import java.io.File;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class StoredSubscriptionStatus implements Storable<SubscriptionStatus> {

    @NotNull
    public static final StoredSubscriptionStatus INSTANCE = new StoredSubscriptionStatus();

    private StoredSubscriptionStatus() {
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
        return "store.entitlementStatus";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<SubscriptionStatus> getSerializer() {
        return SubscriptionStatus.Companion.serializer();
    }
}

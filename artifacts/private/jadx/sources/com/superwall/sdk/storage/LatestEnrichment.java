package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.enrichment.Enrichment;
import java.io.File;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LatestEnrichment implements Storable<Enrichment> {

    @NotNull
    public static final LatestEnrichment INSTANCE = new LatestEnrichment();

    private LatestEnrichment() {
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
        return "store.enrichmentCache";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Enrichment> getSerializer() {
        return Enrichment.Companion.serializer();
    }
}

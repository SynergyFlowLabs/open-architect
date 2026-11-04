package com.superwall.sdk.storage;

import android.content.Context;
import java.io.File;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LastPaywallView implements Storable<Date> {

    @NotNull
    public static final LastPaywallView INSTANCE = new LastPaywallView();

    private LastPaywallView() {
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public File file(@NotNull Context context) {
        return Storable.DefaultImpls.file(this, context);
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public SearchPathDirectory getDirectory() {
        return SearchPathDirectory.USER_SPECIFIC_DOCUMENTS;
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public String getKey() {
        return "store.lastPaywallView";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Date> getSerializer() {
        return DateSerializer.INSTANCE;
    }
}

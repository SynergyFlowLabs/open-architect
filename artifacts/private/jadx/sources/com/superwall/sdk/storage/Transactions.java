package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import java.io.File;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class Transactions implements Storable<StoreTransaction> {

    @NotNull
    public static final Transactions INSTANCE = new Transactions();

    private Transactions() {
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
        return "store.transactions.v2";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<StoreTransaction> getSerializer() {
        return StoreTransaction.Companion.serializer();
    }
}

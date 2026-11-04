package com.superwall.sdk.storage;

import android.content.Context;
import hk.a;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PurchasingProductdIds implements Storable<Set<? extends String>> {

    @NotNull
    public static final PurchasingProductdIds INSTANCE = new PurchasingProductdIds();

    private PurchasingProductdIds() {
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
        return "store.purchasingProductIds";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Set<? extends String>> getSerializer() {
        return a.o(a.K(q1.f312784a));
    }
}

package com.superwall.sdk.storage;

import android.content.Context;
import hk.a;
import java.io.File;
import kotlin.jvm.internal.i0;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class TotalPaywallViews implements Storable<Integer> {

    @NotNull
    public static final TotalPaywallViews INSTANCE = new TotalPaywallViews();

    private TotalPaywallViews() {
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
        return "store.totalPaywallViews";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Integer> getSerializer() {
        return a.H(i0.f312739a);
    }
}

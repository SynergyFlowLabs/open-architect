package com.superwall.sdk.storage;

import android.content.Context;
import hk.a;
import java.io.File;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AliasId implements Storable<String> {

    @NotNull
    public static final AliasId INSTANCE = new AliasId();

    private AliasId() {
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
        return "store.aliasId";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<String> getSerializer() {
        return a.K(q1.f312784a);
    }
}

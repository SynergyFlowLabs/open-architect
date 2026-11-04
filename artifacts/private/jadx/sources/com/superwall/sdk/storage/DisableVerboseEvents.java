package com.superwall.sdk.storage;

import android.content.Context;
import hk.a;
import java.io.File;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DisableVerboseEvents implements Storable<Boolean> {

    @NotNull
    public static final DisableVerboseEvents INSTANCE = new DisableVerboseEvents();

    private DisableVerboseEvents() {
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
        return "store.disableVerboseEvents";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Boolean> getSerializer() {
        return a.C(m.f312762a);
    }
}

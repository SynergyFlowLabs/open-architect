package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.utilities.ErrorTracking;
import java.io.File;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ErrorLog implements Storable<ErrorTracking.ErrorOccurence> {

    @NotNull
    public static final ErrorLog INSTANCE = new ErrorLog();

    private ErrorLog() {
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
        return "store.errorLog";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<ErrorTracking.ErrorOccurence> getSerializer() {
        return ErrorTracking.ErrorOccurence.Companion.serializer();
    }
}

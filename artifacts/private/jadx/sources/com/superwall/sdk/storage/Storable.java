package com.superwall.sdk.storage;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface Storable<T> {

    public static final class DefaultImpls {
        @NotNull
        public static <T> File file(@NotNull Storable<T> storable, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File fileFileDirectory = storable.getDirectory().fileDirectory(context);
            if (!fileFileDirectory.exists()) {
                fileFileDirectory.mkdir();
            }
            return new File(fileFileDirectory, CacheKeysKt.toMD5(storable.getKey()));
        }
    }

    @NotNull
    File file(@NotNull Context context);

    @NotNull
    SearchPathDirectory getDirectory();

    @NotNull
    String getKey();

    @NotNull
    KSerializer<T> getSerializer();
}

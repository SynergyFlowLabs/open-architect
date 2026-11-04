package com.sdk.growthbook.utils;

import dev.whyoleg.cryptography.CryptographyProvider;
import dev.whyoleg.cryptography.algorithms.AES;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements c {
    private final AES.IvCipher c(byte[] bArr) {
        return CryptographyProvider.Companion.getDefault().get(AES.CBC.Companion).keyDecoder().decodeFromByteArrayBlocking(AES.Key.Format.RAW, bArr).cipher(true);
    }

    @Override // com.sdk.growthbook.utils.c
    @NotNull
    public byte[] a(@NotNull byte[] inputText, @NotNull byte[] key, @NotNull byte[] iv) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv, "iv");
        return c(key).encryptWithIvBlocking(iv, inputText);
    }

    @Override // com.sdk.growthbook.utils.c
    @NotNull
    public byte[] b(@NotNull byte[] cipherText, @NotNull byte[] key, @NotNull byte[] iv) {
        Intrinsics.checkNotNullParameter(cipherText, "cipherText");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv, "iv");
        return c(key).decryptWithIvBlocking(iv, cipherText);
    }
}

package com.superwall.sdk.storage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCacheKeys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheKeys.kt\ncom/superwall/sdk/storage/CacheKeysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,343:1\n12834#2,3:344\n*S KotlinDebug\n*F\n+ 1 CacheKeys.kt\ncom/superwall/sdk/storage/CacheKeysKt\n*L\n81#1:344,3\n*E\n"})
public final class CacheKeysKt {
    @NotNull
    public static final String toMD5(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        String str2 = "";
        for (byte b10 : bArrDigest) {
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            str2 = str2 + str3;
        }
        return str2;
    }
}

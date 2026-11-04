package com.superwall.sdk.misc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.apache.commons.codec.digest.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nString+SHA256.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String+SHA256.kt\ncom/superwall/sdk/misc/String_SHA256Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1557#2:35\n1628#2,3:36\n*S KotlinDebug\n*F\n+ 1 String+SHA256.kt\ncom/superwall/sdk/misc/String_SHA256Kt\n*L\n23#1:35\n23#1:36,3\n*E\n"})
public final class String_SHA256Kt {
    @Nullable
    public static final byte[] sha256(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(g.f335251e);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Integer sha256MappedToRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrSha256 = sha256(str);
        if (bArrSha256 == null) {
            return null;
        }
        List listWindowed$default = CollectionsKt.windowed$default(ArraysKt.toList(bArrSha256), 8, 8, false, 4, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listWindowed$default, 10));
        Iterator it = listWindowed$default.iterator();
        while (it.hasNext()) {
            arrayList.add(CollectionsKt.toByteArray((List) it.next()));
        }
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bigIntegerAdd = bigIntegerAdd.add(new BigInteger((byte[]) it2.next()));
        }
        return Integer.valueOf(bigIntegerAdd.mod(new BigInteger("100")).intValue());
    }
}

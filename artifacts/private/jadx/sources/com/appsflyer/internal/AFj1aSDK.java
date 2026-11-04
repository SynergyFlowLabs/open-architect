package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,126:1\n13004#2,3:127\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n54#1:127,3\n*E\n"})
public final class AFj1aSDK {
    public static final String getMonetizationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str3 = "";
        for (byte b10 : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }

    public static final int getMonetizationNetwork(@NotNull String str) {
        String strF;
        Integer intOrNull;
        String strF2;
        Integer intOrNull2;
        String strF3;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultJ = new Regex("(\\d+).(\\d+).(\\d+).*").j(str);
        if (matchResultJ == null) {
            return -1;
        }
        MatchGroup matchGroup = matchResultJ.b().get(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroup == null || (strF3 = matchGroup.f()) == null || (intOrNull3 = StringsKt.toIntOrNull(strF3)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = matchResultJ.b().get(2);
        int iIntValue3 = iIntValue2 + (((matchGroup2 == null || (strF2 = matchGroup2.f()) == null || (intOrNull2 = StringsKt.toIntOrNull(strF2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = matchResultJ.b().get(3);
        if (matchGroup3 != null && (strF = matchGroup3.f()) != null && (intOrNull = StringsKt.toIntOrNull(strF)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}

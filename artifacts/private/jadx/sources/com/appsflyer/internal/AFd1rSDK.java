package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13004#2,3:103\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n*L\n44#1:103,3\n*E\n"})
public final class AFd1rSDK {
    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final String getCurrencyIso4217Code(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        int i10 = 1 << 0;
        String str3 = "";
        for (byte b10 : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }

    @Nullable
    public static final Pair<Integer, Integer> getMediationNetwork(@NotNull String str) {
        String strF;
        String strF2;
        String strF3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultJ = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").j(str);
        if (matchResultJ != null) {
            MatchGroup matchGroup = matchResultJ.b().get(1);
            Integer intOrNull = (matchGroup == null || (strF3 = matchGroup.f()) == null) ? null : StringsKt.toIntOrNull(strF3);
            MatchGroup matchGroup2 = matchResultJ.b().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (strF2 = matchGroup2.f()) == null) ? null : StringsKt.toIntOrNull(strF2);
            MatchGroup matchGroup3 = matchResultJ.b().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (strF = matchGroup3.f()) == null) ? null : StringsKt.toIntOrNull(strF);
            if (intOrNull != null) {
                return TuplesKt.to(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return TuplesKt.to(Integer.valueOf((intOrNull2.intValue() * 1000000) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * 1000000) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    @Nullable
    public static final Pair<Integer, Integer> getRevenue(@NotNull String str) {
        String strF;
        String strF2;
        String strF3;
        String strF4;
        String strF5;
        String strF6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultJ = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").j(str);
        boolean z10 = true & false;
        if (matchResultJ != null) {
            MatchGroup matchGroup = matchResultJ.b().get(1);
            Integer intOrNull = (matchGroup == null || (strF6 = matchGroup.f()) == null) ? null : StringsKt.toIntOrNull(strF6);
            MatchGroup matchGroup2 = matchResultJ.b().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (strF5 = matchGroup2.f()) == null) ? null : StringsKt.toIntOrNull(strF5);
            MatchGroup matchGroup3 = matchResultJ.b().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (strF4 = matchGroup3.f()) == null) ? null : StringsKt.toIntOrNull(strF4);
            MatchGroup matchGroup4 = matchResultJ.b().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (strF3 = matchGroup4.f()) == null) ? null : StringsKt.toIntOrNull(strF3);
            MatchGroup matchGroup5 = matchResultJ.b().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (strF2 = matchGroup5.f()) == null) ? null : StringsKt.toIntOrNull(strF2);
            MatchGroup matchGroup6 = matchResultJ.b().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (strF = matchGroup6.f()) == null) ? null : StringsKt.toIntOrNull(strF);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.checkNotNull(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int iIntValue2 = iIntValue + (intOrNull2.intValue() * 1000);
                Intrinsics.checkNotNull(intOrNull3);
                Integer numValueOf = Integer.valueOf(iIntValue2 + intOrNull3.intValue());
                Intrinsics.checkNotNull(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int iIntValue4 = iIntValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.checkNotNull(num);
                return TuplesKt.to(numValueOf, Integer.valueOf(iIntValue4 + num.intValue()));
            }
        }
        return null;
    }

    private static boolean getRevenue(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !ArraysKt.contains(objArr, (Object) null);
    }
}

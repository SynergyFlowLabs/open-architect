package com.superwall.sdk.misc;

import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nString+Helpers.kt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String+Helpers.kt.kt\ncom/superwall/sdk/misc/String_Helpers_ktKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class String_Helpers_ktKt {
    @NotNull
    public static final String camelCaseToSnakeCase(@NotNull String str) {
        String strProcessCamelCaseRegex;
        String strProcessCamelCaseRegex2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strProcessCamelCaseRegex3 = processCamelCaseRegex(str, "([A-Z]+)([A-Z][a-z]|[0-9])");
        if (strProcessCamelCaseRegex3 != null && (strProcessCamelCaseRegex = processCamelCaseRegex(strProcessCamelCaseRegex3, "([a-z])([A-Z]|[0-9])")) != null && (strProcessCamelCaseRegex2 = processCamelCaseRegex(strProcessCamelCaseRegex, "([0-9])([A-Z])")) != null) {
            String lowerCase = strProcessCamelCaseRegex2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    private static final String processCamelCaseRegex(String str, String str2) {
        String strM = new Regex(str2).m(str, new Function1() { // from class: com.superwall.sdk.misc.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return String_Helpers_ktKt.processCamelCaseRegex$lambda$0((MatchResult) obj);
            }
        });
        if (StringsKt.w3(strM)) {
            return null;
        }
        return strM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence processCamelCaseRegex$lambda$0(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        MatchGroup matchGroup = matchResult.b().get(1);
        String strF = matchGroup != null ? matchGroup.f() : null;
        MatchGroup matchGroup2 = matchResult.b().get(2);
        return strF + "_" + (matchGroup2 != null ? matchGroup2.f() : null);
    }
}

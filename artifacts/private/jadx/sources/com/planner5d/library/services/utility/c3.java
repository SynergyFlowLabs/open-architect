package com.planner5d.library.services.utility;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtils.kt\ncom/planner5d/library/services/utility/StringUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c3 f225174a = new c3();

    private c3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        if (word.length() <= 0) {
            return word;
        }
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(word.charAt(0));
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sb2.append((Object) upperCase);
        String strSubstring = word.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @oj.n
    @NotNull
    public static final String g(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.n
    @NotNull
    public static final String j(int i10) {
        if (i10 > 9999) {
            return "9k+";
        }
        if (i10 <= 999) {
            return String.valueOf(i10);
        }
        return (i10 / 1000) + "k+";
    }

    @oj.n
    @NotNull
    public static final String k(@Nullable Context context, boolean z10) {
        if (context != null) {
            String string = context.getString(z10 ? o2.q.Pv : o2.q.f228284tg);
            if (string != null) {
                return string;
            }
        }
        return z10 ? "yes" : "no";
    }

    @NotNull
    public final String b(@NotNull String camelCaseString) {
        Intrinsics.checkNotNullParameter(camelCaseString, "camelCaseString");
        String lowerCase = new Regex("(?<=.)[A-Z]").replace(camelCaseString, "_$0").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.p5(StringsKt.t5(lowerCase, ".", null, 2, null), "_", null, 2, null);
    }

    @NotNull
    public final String c(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return string.length() == 0 ? string : CollectionsKt.joinToString$default(StringsKt.T4(string, new char[]{' '}, false, 0, 6, null), " ", null, null, 0, null, new Function1() { // from class: com.planner5d.library.services.utility.b3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c3.d((String) obj);
            }
        }, 30, null);
    }

    @NotNull
    public final String e(@NotNull List<String> data, @NotNull String separator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return CollectionsKt.joinToString$default(data, separator, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public final String f(@NotNull float[] data, @NotNull String separator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return ArraysKt.joinToString$default(data, (CharSequence) separator, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    @NotNull
    public final String h(@NotNull String data, int i10, @NotNull String separator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return new Regex(StringsKt.g2(".", i10)).replace(data, "$0" + separator);
    }

    @Nullable
    public final Long i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (Exception unused) {
            return null;
        }
    }
}

package io.ktor.http;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHeaderValueWithParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParametersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f296121a = SetsKt.setOf((Object[]) new Character[]{'(', ')', Character.valueOf(kotlin.text.b0.f313280e), Character.valueOf(kotlin.text.b0.f313281f), '@', Character.valueOf(AbstractJsonLexerKt.COMMA), ';', Character.valueOf(AbstractJsonLexerKt.COLON), '\\', '\"', '/', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '?', '=', Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), Character.valueOf(AbstractJsonLexerKt.END_OBJ), ' ', '\t', '\n', Character.valueOf(org.apache.commons.lang3.k.f337188d)});

    public static final void b(@NotNull io.ktor.util.p1 p1Var, @NotNull String name, @NotNull t0 value) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        p1Var.l(name, value.toString());
    }

    @NotNull
    public static final String c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (f(str)) {
            str = g(str);
        }
        return str;
    }

    private static final void d(String str, StringBuilder sb2) {
        if (f(str)) {
            sb2.append(g(str));
        } else {
            sb2.append(str);
        }
    }

    private static final boolean e(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (StringsKt.U6(str) == '\"' && StringsKt.t7(str) == '\"') {
            int i10 = 1;
            while (true) {
                String str2 = str;
                int iQ3 = StringsKt.q3(str2, '\"', i10, false, 4, null);
                if (iQ3 != StringsKt.i3(str2)) {
                    int i11 = 0;
                    for (int i12 = iQ3 - 1; str2.charAt(i12) == '\\'; i12--) {
                        i11++;
                    }
                    if (i11 % 2 == 0) {
                        return false;
                    }
                    i10 = iQ3 + 1;
                    if (i10 < str2.length()) {
                        str = str2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (e(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (f296121a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final String g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        h(str, sb2);
        return sb2.toString();
    }

    private static final void h(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                sb2.append(cCharAt);
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append("\"");
    }
}

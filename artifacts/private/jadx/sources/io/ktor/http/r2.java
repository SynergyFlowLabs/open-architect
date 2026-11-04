package io.ktor.http;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nURLParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLParser.kt\nio/ktor/http/URLParserKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n158#2,6:284\n170#2,6:290\n1#3:296\n*S KotlinDebug\n*F\n+ 1 URLParser.kt\nio/ktor/http/URLParserKt\n*L\n38#1:284,6\n39#1:290,6\n*E\n"})
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f296086a = CollectionsKt.listOf("");

    private static final int b(String str, int i10, int i11, char c10) {
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 >= i11 || str.charAt(i13) != c10) {
                break;
            }
            i12++;
        }
        return i12;
    }

    private static final void c(k2 k2Var, String str, int i10, int i11) {
        int i12;
        Integer numValueOf = Integer.valueOf(f(str, i10, i11));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i11;
        String strSubstring = str.substring(i10, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        k2Var.y(strSubstring);
        int i13 = iIntValue + 1;
        if (i13 < i11) {
            String strSubstring2 = str.substring(i13, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            i12 = Integer.parseInt(strSubstring2);
        } else {
            i12 = 0;
        }
        k2Var.B(i12);
    }

    private static final int d(String str, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt = str.charAt(i10);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i12 = i10;
            i13 = i12;
        } else {
            i12 = i10;
            i13 = -1;
        }
        while (i12 < i11) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 == ':') {
                if (i13 == -1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i13);
            }
            if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                break;
            }
            if (i13 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i13 = i12;
            }
            i12++;
        }
        return -1;
    }

    @NotNull
    public static final List<String> e() {
        return f296086a;
    }

    private static final int f(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z10 = true;
                } else if (cCharAt == ']') {
                    z10 = false;
                }
            } else if (!z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static final boolean g(char c10) {
        char lowerCase = Character.toLowerCase(c10);
        return 'a' <= lowerCase && lowerCase < '{';
    }

    private static final void h(k2 k2Var, String str, int i10, int i11, int i12) {
        if (i12 == 1) {
            k2Var.y("");
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            n2.y(k2Var, strSubstring);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            k2Var.y("");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            String strSubstring2 = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            n2.y(k2Var, sb2.toString());
            return;
        }
        int iQ3 = StringsKt.q3(str, '/', i10, false, 4, null);
        if (iQ3 != -1 && iQ3 != i11) {
            String strSubstring3 = str.substring(i10, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            k2Var.y(strSubstring3);
            String strSubstring4 = str.substring(iQ3, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            n2.y(k2Var, strSubstring4);
            return;
        }
        String strSubstring5 = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        k2Var.y(strSubstring5);
    }

    private static final void i(k2 k2Var, String str, int i10, int i11) {
        if (i10 >= i11 || str.charAt(i10) != '#') {
            return;
        }
        String strSubstring = str.substring(i10 + 1, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        k2Var.s(strSubstring);
    }

    private static final void j(k2 k2Var, String str, int i10, int i11) {
        int iR3 = StringsKt.r3(str, "@", i10, false, 4, null);
        if (iR3 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String strSubstring = str.substring(i10, iR3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int i12 = 0 << 0;
        k2Var.F(h.i(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iR3 + 1, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        k2Var.y(strSubstring2);
    }

    private static final int k(final k2 k2Var, String str, int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            k2Var.E(true);
            return i11;
        }
        Integer numValueOf = Integer.valueOf(StringsKt.q3(str, '#', i12, false, 4, null));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i11 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i12, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        d2.d(strSubstring, 0, 0, false, 6, null).e(new Function2() { // from class: io.ktor.http.q2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return r2.l(k2Var, (String) obj, (List) obj2);
            }
        });
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(k2 k2Var, String key, List values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        k2Var.e().g(key, values);
        return Unit.f312394a;
    }

    @NotNull
    public static final k2 m(@NotNull k2 k2Var, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (StringsKt.w3(urlString)) {
            return k2Var;
        }
        try {
            return n(k2Var, urlString);
        } catch (Throwable th2) {
            throw new p2(urlString, th2);
        }
    }

    @NotNull
    public static final k2 n(@NotNull k2 k2Var, @NotNull String urlString) {
        int i10;
        int iIntValue;
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        int length = urlString.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!CharsKt.q(urlString.charAt(i11))) {
                break;
            }
            i11++;
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            i10 = -1;
            break;
        }
        while (true) {
            int i12 = length2 - 1;
            if (!CharsKt.q(urlString.charAt(length2))) {
                i10 = length2;
                break;
            }
            if (i12 < 0) {
                i10 = -1;
                break;
            }
            length2 = i12;
        }
        int i13 = i10 + 1;
        int iD = d(urlString, i11, i13);
        if (iD > 0) {
            String strSubstring = urlString.substring(i11, i11 + iD);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            k2Var.C(s2.f296093c.a(strSubstring));
            i11 += iD + 1;
        }
        int iB = b(urlString, i11, i13, '/');
        int iK = i11 + iB;
        if (Intrinsics.areEqual(k2Var.o().getName(), com.facebook.share.internal.k.f101891c)) {
            h(k2Var, urlString, iK, i13, iB);
            return k2Var;
        }
        if (Intrinsics.areEqual(k2Var.o().getName(), "mailto")) {
            if (iB != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            j(k2Var, urlString, iK, i13);
            return k2Var;
        }
        if (Intrinsics.areEqual(k2Var.o().getName(), "about")) {
            if (iB != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring2 = urlString.substring(iK, i13);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            k2Var.y(strSubstring2);
            return k2Var;
        }
        if (Intrinsics.areEqual(k2Var.o().getName(), "tel")) {
            if (iB != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring3 = urlString.substring(iK, i13);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            k2Var.y(strSubstring3);
            return k2Var;
        }
        if (iB >= 2) {
            while (true) {
                Integer numValueOf = Integer.valueOf(StringsKt.v3(urlString, io.ktor.util.v.b("@/\\?#"), iK, false, 4, null));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i13;
                if (iIntValue >= i13 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iF = f(urlString, iK, iIntValue);
                if (iF != -1) {
                    String strSubstring4 = urlString.substring(iK, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    k2Var.w(strSubstring4);
                    String strSubstring5 = urlString.substring(iF + 1, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    k2Var.u(strSubstring5);
                } else {
                    String strSubstring6 = urlString.substring(iK, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                    k2Var.w(strSubstring6);
                }
                iK = iIntValue + 1;
            }
            c(k2Var, urlString, iK, iIntValue);
            iK = iIntValue;
        }
        if (iK >= i13) {
            k2Var.v(urlString.charAt(i10) == '/' ? f296086a : CollectionsKt.emptyList());
            return k2Var;
        }
        k2Var.v(iB == 0 ? CollectionsKt.dropLast(k2Var.g(), 1) : CollectionsKt.emptyList());
        Integer numValueOf2 = Integer.valueOf(StringsKt.v3(urlString, io.ktor.util.v.b("?#"), iK, false, 4, null));
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : i13;
        if (iIntValue2 > iK) {
            String strSubstring7 = urlString.substring(iK, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
            k2Var.v(CollectionsKt.plus((Collection) ((k2Var.g().size() == 1 && ((CharSequence) CollectionsKt.first((List) k2Var.g())).length() == 0) ? CollectionsKt.emptyList() : k2Var.g()), (Iterable) CollectionsKt.plus((Collection) (iB == 1 ? f296086a : CollectionsKt.emptyList()), (Iterable) (Intrinsics.areEqual(strSubstring7, "/") ? f296086a : StringsKt.T4(strSubstring7, new char[]{'/'}, false, 0, 6, null)))));
            iK = iIntValue2;
        }
        if (iK < i13 && urlString.charAt(iK) == '?') {
            iK = k(k2Var, urlString, iK, i13);
        }
        i(k2Var, urlString, iK, i13);
        return k2Var;
    }
}

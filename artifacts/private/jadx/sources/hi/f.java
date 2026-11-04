package hi;

import io.ktor.http.i0;
import io.ktor.utils.io.o0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f285829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f285830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Regex f285831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Regex f285832d;

    static {
        Character chValueOf = Character.valueOf(b0.f313279d);
        Character chValueOf2 = Character.valueOf(l.f335457d);
        f285829a = SetsKt.setOf((Object[]) new Character[]{'!', '#', '$', '%', chValueOf, '\'', '*', '+', chValueOf2, '.', '^', '_', '`', '|', '~'});
        f285830b = SetsKt.setOf((Object[]) new Character[]{chValueOf2, '.', '_', '~', '+', '/'});
        f285831c = new Regex("[a-zA-Z0-9\\-._~+/]+=*");
        f285832d = new Regex("\\\\.");
    }

    private static final boolean c(char c10) {
        return ('a' <= c10 && c10 < '{') || ('A' <= c10 && c10 < '[') || i0.c(c10) || f285829a.contains(Character.valueOf(c10));
    }

    private static final boolean d(char c10) {
        if (('a' > c10 || c10 >= '{') && (('A' > c10 || c10 >= '[') && !i0.c(c10) && !f285830b.contains(Character.valueOf(c10)))) {
            return false;
        }
        return true;
    }

    private static final int e(String str, int i10, Map<String, String> map) {
        int i11;
        int iM = m(str, i10);
        int i12 = iM;
        while (i12 < str.length() && c(str.charAt(i12))) {
            i12++;
        }
        String strK5 = StringsKt.k5(str, r.W1(iM, i12));
        int iM2 = m(str, i12);
        if (iM2 != str.length() && str.charAt(iM2) == '=') {
            int iM3 = m(str, iM2 + 1);
            boolean z10 = false;
            if (str.charAt(iM3) == '\"') {
                iM3++;
                i11 = iM3;
                boolean z11 = false;
                while (i11 < str.length() && (str.charAt(i11) != '\"' || z11)) {
                    z11 = !z11 && str.charAt(i11) == '\\';
                    i11++;
                }
                if (i11 == str.length()) {
                    throw new ji.l("Expected closing quote'\"' in parameter", null, 2, null);
                }
                z10 = true;
            } else {
                i11 = iM3;
                while (i11 < str.length() && str.charAt(i11) != ' ' && str.charAt(i11) != ',') {
                    i11++;
                }
            }
            String strK6 = StringsKt.k5(str, r.W1(iM3, i11));
            if (z10) {
                strK6 = n(strK6);
            }
            map.put(strK5, strK6);
            return z10 ? i11 + 1 : i11;
        }
        return i10;
    }

    private static final int f(String str, int i10, Map<String, String> map) {
        while (i10 > 0 && i10 < str.length()) {
            int iE = e(str, i10, map);
            if (iE == i10) {
                break;
            }
            i10 = l(str, iE, AbstractJsonLexerKt.COMMA);
        }
        return i10;
    }

    private static final int g(String str, int i10) {
        int iM = m(str, i10);
        while (iM < str.length() && d(str.charAt(iM))) {
            iM++;
        }
        while (iM < str.length() && str.charAt(iM) == '=') {
            iM++;
        }
        return m(str, iM);
    }

    private static final Integer h(List<c> list, c cVar, int i10, String str) {
        if (i10 != str.length() && str.charAt(i10) != ',') {
            return null;
        }
        list.add(cVar);
        if (i10 == str.length()) {
            return -1;
        }
        if (str.charAt(i10) == ',') {
            return Integer.valueOf(i10 + 1);
        }
        throw new IllegalStateException("");
    }

    private static final int i(String str, int i10, List<c> list) {
        Integer numH;
        int iM = m(str, i10);
        int i11 = iM;
        while (i11 < str.length() && c(str.charAt(i11))) {
            i11++;
        }
        String strK5 = StringsKt.k5(str, r.W1(iM, i11));
        if (StringsKt.w3(strK5)) {
            throw new ji.l("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
        }
        int iM2 = m(str, i11);
        int i12 = 4 | 0;
        Integer numH2 = h(list, new c.b(strK5, CollectionsKt.emptyList(), (b) null, 4, (DefaultConstructorMarker) null), iM2, str);
        if (numH2 != null) {
            return numH2.intValue();
        }
        int iG = g(str, iM2);
        String string = StringsKt.E5(StringsKt.k5(str, r.W1(iM2, iG))).toString();
        if (string.length() > 0 && (numH = h(list, new c.d(strK5, string), iG, str)) != null) {
            return numH.intValue();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iF = f(str, iM2, linkedHashMap);
        list.add(new c.b(strK5, linkedHashMap, (b) null, 4, (DefaultConstructorMarker) null));
        return iF;
    }

    @Nullable
    public static final c j(@NotNull String headerValue) {
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        int iM = m(headerValue, 0);
        int i10 = iM;
        while (i10 < headerValue.length() && c(headerValue.charAt(i10))) {
            i10++;
        }
        String strK5 = StringsKt.k5(headerValue, r.W1(iM, i10));
        int iM2 = m(headerValue, i10);
        if (StringsKt.w3(strK5)) {
            return null;
        }
        if (headerValue.length() == iM2) {
            return new c.b(strK5, CollectionsKt.emptyList(), (b) null, 4, (DefaultConstructorMarker) null);
        }
        int iG = g(headerValue, iM2);
        String string = StringsKt.E5(StringsKt.k5(headerValue, r.W1(iM2, iG))).toString();
        if (string.length() > 0 && iG == headerValue.length()) {
            return new c.d(strK5, string);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (f(headerValue, iM2, linkedHashMap) != -1) {
            throw new ji.l("Function parseAuthorizationHeader can parse only one header", null, 2, null);
        }
        return new c.b(strK5, linkedHashMap, (b) null, 4, (DefaultConstructorMarker) null);
    }

    @o0
    @NotNull
    public static final List<c> k(@NotNull String headerValue) {
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 != -1) {
            i10 = i(headerValue, i10, arrayList);
        }
        return arrayList;
    }

    private static final int l(String str, int i10, char c10) {
        int iM = m(str, i10);
        if (iM == str.length()) {
            return -1;
        }
        if (str.charAt(iM) == c10) {
            return m(str, iM + 1);
        }
        throw new ji.l("Expected delimiter " + c10 + " at position " + iM, null, 2, null);
    }

    private static final int m(String str, int i10) {
        while (i10 < str.length() && str.charAt(i10) == ' ') {
            i10++;
        }
        return i10;
    }

    private static final String n(String str) {
        return f285832d.m(str, new Function1() { // from class: hi.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.o((MatchResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.Z8(it.getValue(), 1);
    }
}

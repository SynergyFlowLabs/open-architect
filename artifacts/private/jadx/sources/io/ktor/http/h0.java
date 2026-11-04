package io.ktor.http;

import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nio/ktor/http/CookieKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,263:1\n248#1:280\n252#1:281\n252#1:282\n248#1:283\n248#1:284\n256#1:285\n256#1:286\n260#1:290\n256#1:291\n248#1:292\n260#1:294\n256#1:295\n248#1:296\n256#1:304\n248#1:305\n230#2,2:264\n1252#2,4:269\n774#2:297\n865#2,2:298\n1#3:266\n480#4:267\n426#4:268\n490#4,7:273\n126#5:287\n153#5,2:288\n155#5:293\n1088#6,2:300\n1088#6,2:302\n*S KotlinDebug\n*F\n+ 1 Cookie.kt\nio/ktor/http/CookieKt\n*L\n190#1:280\n191#1:281\n192#1:282\n193#1:283\n194#1:284\n196#1:285\n197#1:286\n198#1:290\n198#1:291\n198#1:292\n199#1:294\n199#1:295\n199#1:296\n260#1:304\n260#1:305\n102#1:264,2\n104#1:269,4\n200#1:297\n200#1:298,2\n104#1:267\n104#1:268\n116#1:273,7\n198#1:287\n198#1:288,2\n198#1:293\n215#1:300,2\n238#1:302,2\n*E\n"})
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<String> f295857a = SetsKt.setOf((Object[]) new String[]{io.ktor.client.utils.d.f295388b, "expires", "domain", "path", "secure", "httponly", "$x-enc"});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Regex f295858b = new Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f295859c = SetsKt.setOf((Object[]) new Character[]{';', Character.valueOf(AbstractJsonLexerKt.COMMA), '\"'});

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f295860a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.DQUOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.BASE64_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.URI_ENCODING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f295860a = iArr;
        }
    }

    private static final String d(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (u(str.charAt(i10))) {
                throw new IllegalArgumentException("Cookie name is not valid: " + str);
            }
        }
        return str;
    }

    private static final String e(String str, Object obj, c0 c0Var) {
        if (obj == null) {
            return "";
        }
        return str + '=' + j(obj.toString(), c0Var);
    }

    private static final String f(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + '=' + j(str2.toString(), c0.RAW);
    }

    private static final String g(String str, boolean z10) {
        return z10 ? str : "";
    }

    private static final String h(String str, Object obj) {
        if (obj == null) {
            return "";
        }
        return str + '=' + obj;
    }

    @NotNull
    public static final String i(@NotNull String encodedValue, @NotNull c0 encoding) {
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        int i10 = a.f295860a[encoding.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (StringsKt.u2(StringsKt.Q5(encodedValue).toString(), "\"", false, 2, null) && StringsKt.M1(StringsKt.K5(encodedValue).toString(), "\"", false, 2, null)) {
                encodedValue = StringsKt.m4(StringsKt.E5(encodedValue).toString(), "\"");
            }
            return encodedValue;
        }
        if (i10 == 3) {
            return io.ktor.util.f.d(encodedValue);
        }
        if (i10 == 4) {
            return h.k(encodedValue, 0, 0, true, null, 11, null);
        }
        throw new kotlin.k0();
    }

    @NotNull
    public static final String j(@NotNull String value, @NotNull c0 encoding) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        int i10 = a.f295860a[encoding.ordinal()];
        if (i10 == 1) {
            return value;
        }
        int i11 = 0 ^ 2;
        if (i10 != 2) {
            if (i10 == 3) {
                return io.ktor.util.f.e(value);
            }
            if (i10 == 4) {
                return h.m(value, true);
            }
            throw new kotlin.k0();
        }
        if (StringsKt.U2(value, '\"', false, 2, null)) {
            throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
        }
        for (int i12 = 0; i12 < value.length(); i12++) {
            if (u(value.charAt(i12))) {
                return '\"' + value + '\"';
            }
        }
        return value;
    }

    @NotNull
    public static final Map<String, String> k(@NotNull String cookiesHeader, final boolean z10) {
        Intrinsics.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        int i10 = 7 ^ 0;
        return MapsKt.toMap(kotlin.sequences.o.k1(kotlin.sequences.o.p0(kotlin.sequences.o.k1(Regex.f(f295858b, cookiesHeader, 0, 2, null), new Function1() { // from class: io.ktor.http.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.m((MatchResult) obj);
            }
        }), new Function1() { // from class: io.ktor.http.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h0.n(z10, (Pair) obj));
            }
        }), new Function1() { // from class: io.ktor.http.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.o((Pair) obj);
            }
        }));
    }

    public static /* synthetic */ Map l(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return k(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair m(MatchResult it) {
        String strF;
        String strF2;
        Intrinsics.checkNotNullParameter(it, "it");
        MatchGroup matchGroup = it.b().get(2);
        String str = "";
        if (matchGroup == null || (strF = matchGroup.f()) == null) {
            strF = "";
        }
        MatchGroup matchGroup2 = it.b().get(4);
        if (matchGroup2 != null && (strF2 = matchGroup2.f()) != null) {
            str = strF2;
        }
        return TuplesKt.to(strF, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(boolean z10, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z10 && StringsKt.u2((String) it.getFirst(), "$", false, 2, null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair o(Pair cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        if (StringsKt.u2((String) cookie.getSecond(), "\"", false, 2, null) && StringsKt.M1((String) cookie.getSecond(), "\"", false, 2, null)) {
            cookie = Pair.copy$default(cookie, null, StringsKt.m4((String) cookie.getSecond(), "\""), 1, null);
        }
        return cookie;
    }

    @NotNull
    public static final Cookie p(@NotNull String cookiesHeader) {
        c0 c0VarValueOf;
        Intrinsics.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        Map<String, String> mapK = k(cookiesHeader, false);
        Iterator<T> it = mapK.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!StringsKt.u2((String) entry.getKey(), "$", false, 2, null)) {
                String str = mapK.get("$x-enc");
                if (str == null || (c0VarValueOf = c0.valueOf(str)) == null) {
                    c0VarValueOf = c0.RAW;
                }
                c0 c0Var = c0VarValueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapK.size()));
                Iterator<T> it2 = mapK.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(io.ktor.util.y1.e((String) entry2.getKey()), entry2.getValue());
                }
                String str2 = (String) entry.getKey();
                String strI = i((String) entry.getValue(), c0Var);
                String str3 = (String) linkedHashMap.get(io.ktor.client.utils.d.f295388b);
                Integer numValueOf = str3 != null ? Integer.valueOf(v(str3)) : null;
                String str4 = (String) linkedHashMap.get("expires");
                GMTDate gMTDateA = str4 != null ? j0.a(str4) : null;
                String str5 = (String) linkedHashMap.get("domain");
                String str6 = (String) linkedHashMap.get("path");
                boolean zContainsKey = linkedHashMap.containsKey("secure");
                boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry3 : mapK.entrySet()) {
                    String key = entry3.getKey();
                    if (!f295857a.contains(io.ktor.util.y1.e(key)) && !Intrinsics.areEqual(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new Cookie(str2, strI, c0Var, numValueOf, gMTDateA, str5, str6, zContainsKey, zContainsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public static final String q(@NotNull Cookie cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.getName() + '=' + j(cookie.z(), cookie.s());
    }

    @NotNull
    public static final String r(@NotNull Cookie cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return t(cookie.getName(), cookie.z(), cookie.s(), cookie.w(), cookie.t(), cookie.r(), cookie.x(), cookie.y(), cookie.v(), cookie.u(), false, 1024, null);
    }

    @NotNull
    public static final String s(@NotNull String name, @NotNull String value, @NotNull c0 encoding, @Nullable Integer num, @Nullable GMTDate gMTDate, @Nullable String str, @Nullable String str2, boolean z10, boolean z11, @NotNull Map<String, String> extensions, boolean z12) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        String str3 = d(name) + '=' + j(value.toString(), encoding);
        String str4 = "";
        String str5 = num != null ? "Max-Age=" + num : "";
        String strD = gMTDate != null ? j0.d(gMTDate) : null;
        String str6 = strD != null ? com.google.common.net.d.f119530q0 + '=' + ((Object) strD) : "";
        c0 c0Var = c0.RAW;
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{str3, str5, str6, str != null ? "Domain=" + j(str.toString(), c0Var) : "", str2 != null ? "Path=" + j(str2.toString(), c0Var) : "", z10 ? "Secure" : "", z11 ? "HttpOnly" : ""});
        ArrayList arrayList = new ArrayList(extensions.size());
        for (Map.Entry<String, String> entry : extensions.entrySet()) {
            String strD2 = d(entry.getKey());
            String value2 = entry.getValue();
            if (value2 != null) {
                strD2 = strD2 + '=' + j(value2.toString(), c0.RAW);
            }
            arrayList.add(strD2);
        }
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        if (z12) {
            String strName = encoding.name();
            str4 = strName == null ? "$x-enc" : "$x-enc=" + j(strName.toString(), c0.RAW);
        }
        List listPlus2 = CollectionsKt.plus((Collection<? extends String>) listPlus, str4);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listPlus2) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList2, "; ", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String t(String str, String str2, c0 c0Var, Integer num, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, boolean z12, int i10, Object obj) {
        return s(str, str2, (i10 & 4) != 0 ? c0.URI_ENCODING : c0Var, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : gMTDate, (i10 & 32) != 0 ? null : str3, (i10 & 64) == 0 ? str4 : null, (i10 & 128) != 0 ? false : z10, (i10 & 256) == 0 ? z11 : false, (i10 & 512) != 0 ? MapsKt.emptyMap() : map, (i10 & 1024) != 0 ? true : z12);
    }

    private static final boolean u(char c10) {
        return CharsKt.q(c10) || Intrinsics.compare((int) c10, 32) < 0 || f295859c.contains(Character.valueOf(c10));
    }

    private static final int v(String str) {
        return (int) kotlin.ranges.r.K(Long.parseLong(str), 0L, androidx.collection.g3.f12256c);
    }
}

package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f333858b;

    public h(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f333857a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f333858b = mapUnmodifiableMap;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "authParams", imports = {}))
    @oj.i(name = "-deprecated_authParams")
    @NotNull
    public final Map<String, String> a() {
        return this.f333858b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = hi.c.C1916c.f285814c, imports = {}))
    @oj.i(name = "-deprecated_charset")
    @NotNull
    public final Charset b() {
        return f();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = hi.c.C1916c.f285813b, imports = {}))
    @oj.i(name = "-deprecated_realm")
    @Nullable
    public final String c() {
        return g();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "scheme", imports = {}))
    @oj.i(name = "-deprecated_scheme")
    @NotNull
    public final String d() {
        return this.f333857a;
    }

    @oj.i(name = "authParams")
    @NotNull
    public final Map<String, String> e() {
        return this.f333858b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Intrinsics.areEqual(hVar.f333857a, this.f333857a) && Intrinsics.areEqual(hVar.f333858b, this.f333858b)) {
                return true;
            }
        }
        return false;
    }

    @oj.i(name = hi.c.C1916c.f285814c)
    @NotNull
    public final Charset f() {
        String str = this.f333858b.get(hi.c.C1916c.f285814c);
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @oj.i(name = hi.c.C1916c.f285813b)
    @Nullable
    public final String g() {
        return this.f333858b.get(hi.c.C1916c.f285813b);
    }

    @oj.i(name = "scheme")
    @NotNull
    public final String h() {
        return this.f333857a;
    }

    public int hashCode() {
        return ((899 + this.f333857a.hashCode()) * 31) + this.f333858b.hashCode();
    }

    @NotNull
    public final h i(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Map mutableMap = MapsKt.toMutableMap(this.f333858b);
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "charset.name()");
        mutableMap.put(hi.c.C1916c.f285814c, strName);
        return new h(this.f333857a, (Map<String, String>) mutableMap);
    }

    @NotNull
    public String toString() {
        return this.f333857a + " authParams=" + this.f333858b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(@NotNull String scheme, @NotNull String realm) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap(hi.c.C1916c.f285813b, realm);
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}

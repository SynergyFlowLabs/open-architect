package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f334809f = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f334810g = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f334813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f334814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f334815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String[] f334816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f334808e = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f334811h = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f334812i = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @SourceDebugExtension({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @oj.i(name = "-deprecated_get")
        @NotNull
        public final x a(@NotNull String mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return c(mediaType);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @oj.i(name = "-deprecated_parse")
        @Nullable
        public final x b(@NotNull String mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return d(mediaType);
        }

        @oj.n
        @oj.i(name = "get")
        @NotNull
        public final x c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = x.f334811h.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f334812i.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.u2(strGroup4, "'", false, 2, null) && StringsKt.M1(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new x(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        @oj.n
        @oj.i(name = "parse")
        @Nullable
        public final x d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset g(x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.f(charset);
    }

    @oj.n
    @oj.i(name = "get")
    @NotNull
    public static final x h(@NotNull String str) {
        return f334808e.c(str);
    }

    @oj.n
    @oj.i(name = "parse")
    @Nullable
    public static final x j(@NotNull String str) {
        return f334808e.d(str);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "subtype", imports = {}))
    @oj.i(name = "-deprecated_subtype")
    @NotNull
    public final String a() {
        return this.f334815c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "type", imports = {}))
    @oj.i(name = "-deprecated_type")
    @NotNull
    public final String b() {
        return this.f334814b;
    }

    @oj.j
    @Nullable
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof x) && Intrinsics.areEqual(((x) obj).f334813a, this.f334813a);
    }

    @oj.j
    @Nullable
    public final Charset f(@Nullable Charset charset) {
        String strI = i(hi.c.C1916c.f285814c);
        if (strI == null) {
            return charset;
        }
        try {
            return Charset.forName(strI);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public int hashCode() {
        return this.f334813a.hashCode();
    }

    @Nullable
    public final String i(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int iC = kotlin.internal.n.c(0, this.f334816d.length - 1, 2);
        if (iC >= 0) {
            while (!StringsKt.N1(this.f334816d[i10], name, true)) {
                if (i10 != iC) {
                    i10 += 2;
                }
            }
            return this.f334816d[i10 + 1];
        }
        return null;
    }

    @oj.i(name = "subtype")
    @NotNull
    public final String k() {
        return this.f334815c;
    }

    @oj.i(name = "type")
    @NotNull
    public final String l() {
        return this.f334814b;
    }

    @NotNull
    public String toString() {
        return this.f334813a;
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f334813a = str;
        this.f334814b = str2;
        this.f334815c = str3;
        this.f334816d = strArr;
    }
}

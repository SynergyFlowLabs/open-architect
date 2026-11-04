package io.ktor.http;

import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.b0(with = j3.class)
@SourceDebugExtension({"SMAP\nUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Url.kt\nio/ktor/http/Url\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
public final class Url implements Serializable {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f295435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x1 f295436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f295437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f295438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f295439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f295440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f295441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<String> f295442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<String> f295443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final s2 f295445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final s2 f295446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295448o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295450t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295452w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Url> serializer() {
            return j3.f295909a;
        }

        private a() {
        }
    }

    public Url(@Nullable s2 s2Var, @NotNull String host, int i10, @NotNull final List<String> pathSegments, @NotNull x1 parameters, @NotNull String fragment, @Nullable String str, @Nullable String str2, boolean z10, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f295434a = host;
        this.f295435b = i10;
        this.f295436c = parameters;
        this.f295437d = fragment;
        this.f295438e = str;
        this.f295439f = str2;
        this.f295440g = z10;
        this.f295441h = urlString;
        if (i10 < 0 || i10 >= 65536) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i10).toString());
        }
        this.f295442i = pathSegments;
        this.f295443j = pathSegments;
        this.f295444k = kotlin.g0.c(new Function0() { // from class: io.ktor.http.y2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.H(pathSegments);
            }
        });
        this.f295445l = s2Var;
        this.f295446m = s2Var == null ? s2.f296093c.c() : s2Var;
        this.f295447n = kotlin.g0.c(new Function0() { // from class: io.ktor.http.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.k(pathSegments, this);
            }
        });
        this.f295448o = kotlin.g0.c(new Function0() { // from class: io.ktor.http.a3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.l(this.f295453a);
            }
        });
        this.f295449s = kotlin.g0.c(new Function0() { // from class: io.ktor.http.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.j(this.f295454a);
            }
        });
        this.f295450t = kotlin.g0.c(new Function0() { // from class: io.ktor.http.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.m(this.f295473a);
            }
        });
        this.f295451v = kotlin.g0.c(new Function0() { // from class: io.ktor.http.d3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.i(this.f295834a);
            }
        });
        this.f295452w = kotlin.g0.c(new Function0() { // from class: io.ktor.http.e3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Url.h(this.f295842a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List H(List list) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        return list.subList((((CharSequence) CollectionsKt.first(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((CharSequence) CollectionsKt.last(list)).length() == 0 ? CollectionsKt.getLastIndex(list) : 1 + CollectionsKt.getLastIndex(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Url url) {
        int iQ3 = StringsKt.q3(url.f295441h, '#', 0, false, 6, null) + 1;
        if (iQ3 == 0) {
            return "";
        }
        String strSubstring = url.f295441h.substring(iQ3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(Url url) {
        String str = url.f295439f;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String strSubstring = url.f295441h.substring(StringsKt.q3(url.f295441h, AbstractJsonLexerKt.COLON, url.f295446m.getName().length() + 3, false, 4, null) + 1, StringsKt.q3(url.f295441h, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Url url) {
        int iQ3 = StringsKt.q3(url.f295441h, '/', url.f295446m.getName().length() + 3, false, 4, null);
        if (iQ3 == -1) {
            return "";
        }
        int iQ4 = StringsKt.q3(url.f295441h, '#', iQ3, false, 4, null);
        if (iQ4 == -1) {
            String strSubstring = url.f295441h.substring(iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.f295441h.substring(iQ3, iQ4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(List list, Url url) {
        int iQ3;
        if (list.isEmpty() || (iQ3 = StringsKt.q3(url.f295441h, '/', url.f295446m.getName().length() + 3, false, 4, null)) == -1) {
            return "";
        }
        int iV3 = StringsKt.v3(url.f295441h, new char[]{'?', '#'}, iQ3, false, 4, null);
        if (iV3 == -1) {
            String strSubstring = url.f295441h.substring(iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.f295441h.substring(iQ3, iV3);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Url url) {
        int iQ3 = StringsKt.q3(url.f295441h, '?', 0, false, 6, null) + 1;
        if (iQ3 == 0) {
            return "";
        }
        int iQ4 = StringsKt.q3(url.f295441h, '#', iQ3, false, 4, null);
        if (iQ4 == -1) {
            String strSubstring = url.f295441h.substring(iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.f295441h.substring(iQ3, iQ4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(Url url) {
        String str = url.f295438e;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.f295446m.getName().length() + 3;
        int i10 = 7 ^ 2;
        String strSubstring = url.f295441h.substring(length, StringsKt.v3(url.f295441h, new char[]{AbstractJsonLexerKt.COLON, '@'}, length, false, 4, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final Object writeReplace() {
        return io.ktor.utils.io.p0.b(h3.f295863a, this);
    }

    @kotlin.l(message = "\n        `pathSegments` is deprecated.\n\n        This property will contain an empty path segment at the beginning for URLs with a hostname,\n        and an empty path segment at the end for the URLs with a trailing slash. If you need to keep this behaviour please\n        use [rawSegments]. If you only need to access the meaningful parts of the path, consider using [segments] instead.\n             \n        Please decide if you need [rawSegments] or [segments] explicitly.\n        ", replaceWith = @kotlin.b1(expression = "rawSegments", imports = {}))
    public static /* synthetic */ void y() {
    }

    @NotNull
    public final s2 A() {
        return this.f295446m;
    }

    @Nullable
    public final s2 B() {
        return this.f295445l;
    }

    @NotNull
    public final List<String> C() {
        return this.f295443j;
    }

    @NotNull
    public final List<String> D() {
        return (List) this.f295444k.getValue();
    }

    public final int E() {
        return this.f295435b;
    }

    public final boolean F() {
        return this.f295440g;
    }

    @Nullable
    public final String G() {
        return this.f295438e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Url.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f295441h, ((Url) obj).f295441h);
    }

    public int hashCode() {
        return this.f295441h.hashCode();
    }

    @NotNull
    public final String n() {
        return (String) this.f295452w.getValue();
    }

    @Nullable
    public final String o() {
        return (String) this.f295451v.getValue();
    }

    @NotNull
    public final String p() {
        return (String) this.f295447n.getValue();
    }

    @NotNull
    public final String q() {
        return (String) this.f295449s.getValue();
    }

    @NotNull
    public final String r() {
        return (String) this.f295448o.getValue();
    }

    @Nullable
    public final String s() {
        return (String) this.f295450t.getValue();
    }

    @NotNull
    public final String t() {
        return this.f295437d;
    }

    @NotNull
    public String toString() {
        return this.f295441h;
    }

    @NotNull
    public final String u() {
        return this.f295434a;
    }

    @NotNull
    public final x1 v() {
        return this.f295436c;
    }

    @Nullable
    public final String w() {
        return this.f295439f;
    }

    @NotNull
    public final List<String> x() {
        return this.f295442i;
    }

    public final int z() {
        Integer numValueOf = Integer.valueOf(this.f295435b);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f295446m.k();
    }
}

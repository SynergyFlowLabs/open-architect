package hi;

import io.ktor.http.h;
import io.ktor.http.u0;
import io.ktor.util.b0;
import io.ktor.util.s0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ji.l;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f285807b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f285808a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c c(a aVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return aVar.b(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b e(a aVar, String str, String str2, List list, String str3, Boolean bool, String str4, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = b0.e();
            }
            String str5 = str2;
            if ((i10 & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            List list2 = list;
            String str6 = (i10 & 8) != 0 ? null : str3;
            Boolean bool2 = (i10 & 16) != 0 ? null : bool;
            if ((i10 & 32) != 0) {
                str4 = "MD5";
            }
            return aVar.d(str, str5, list2, str6, bool2, str4);
        }

        @NotNull
        public final b a(@NotNull String realm, @Nullable Charset charset) {
            Intrinsics.checkNotNullParameter(realm, "realm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(C1916c.f285813b, realm);
            if (charset != null) {
                linkedHashMap.put(C1916c.f285814c, ti.a.l(charset));
            }
            return new b(hi.a.f285797b, linkedHashMap, (hi.b) null, 4, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final c b(@NotNull String scheme, @Nullable String str) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            return new b(scheme, str == null ? MapsKt.emptyMap() : MapsKt.mapOf(TuplesKt.to(C1916c.f285813b, str)), (hi.b) null, 4, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final b d(@NotNull String realm, @NotNull String nonce, @NotNull List<String> domain, @Nullable String str, @Nullable Boolean bool, @NotNull String algorithm) {
            Intrinsics.checkNotNullParameter(realm, "realm");
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(domain, "domain");
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(C1916c.f285813b, u0.g(realm));
            linkedHashMap.put("nonce", u0.g(nonce));
            if (!domain.isEmpty()) {
                linkedHashMap.put("domain", u0.g(CollectionsKt.joinToString$default(domain, " ", null, null, 0, null, null, 62, null)));
            }
            if (str != null) {
                linkedHashMap.put("opaque", u0.g(str));
            }
            if (bool != null) {
                linkedHashMap.put("stale", bool.toString());
            }
            linkedHashMap.put("algorithm", algorithm);
            return new b(hi.a.f285798c, linkedHashMap, hi.b.QUOTED_WHEN_REQUIRED);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hi.c$c, reason: collision with other inner class name */
    public static final class C1916c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1916c f285812a = new C1916c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f285813b = "realm";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f285814c = "charset";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f285815d = "oauth_callback";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f285816e = "oauth_consumer_key";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f285817f = "oauth_nonce";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f285818g = "oauth_token";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f285819h = "oauth_token_secret";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final String f285820i = "oauth_verifier";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final String f285821j = "oauth_signature_method";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final String f285822k = "oauth_timestamp";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final String f285823l = "oauth_version";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final String f285824m = "oauth_signature";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final String f285825n = "oauth_callback_confirmed";

        private C1916c() {
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f285826c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String authScheme, @NotNull String blob) {
            super(authScheme, null);
            Intrinsics.checkNotNullParameter(authScheme, "authScheme");
            Intrinsics.checkNotNullParameter(blob, "blob");
            this.f285826c = blob;
            if (!f.f285831c.k(blob)) {
                throw new l("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        @Override // hi.c
        @NotNull
        public String b() {
            return a() + ' ' + this.f285826c;
        }

        @Override // hi.c
        @NotNull
        public String c(@NotNull hi.b encoding) {
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            return b();
        }

        @NotNull
        public final String d() {
            return this.f285826c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return StringsKt.N1(dVar.a(), a(), true) && StringsKt.N1(dVar.f285826c, this.f285826c, true);
        }

        public int hashCode() {
            s0 s0Var = s0.f296806a;
            String strA = a();
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = this.f285826c.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return s0Var.a(lowerCase, lowerCase2);
        }
    }

    public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String a() {
        return this.f285808a;
    }

    @NotNull
    public abstract String b();

    @NotNull
    public abstract String c(@NotNull hi.b bVar);

    @NotNull
    public String toString() {
        return b();
    }

    @SourceDebugExtension({"SMAP\nHttpAuthHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpAuthHeader.kt\nio/ktor/http/auth/HttpAuthHeader$Parameterized\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,499:1\n1869#2,2:500\n1563#2:502\n1634#2,3:503\n360#2,7:506\n1617#2,9:513\n1869#2:522\n1870#2:524\n1626#2:525\n295#2,2:526\n1#3:523\n*S KotlinDebug\n*F\n+ 1 HttpAuthHeader.kt\nio/ktor/http/auth/HttpAuthHeader$Parameterized\n*L\n294#1:500,2\n291#1:502\n291#1:503,3\n318#1:506,7\n322#1:513,9\n322#1:522\n322#1:524\n322#1:525\n347#1:526,2\n322#1:523\n*E\n"})
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<io.ktor.http.s0> f285809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final hi.b f285810d;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f285811a;

            static {
                int[] iArr = new int[hi.b.values().length];
                try {
                    iArr[hi.b.QUOTED_WHEN_REQUIRED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hi.b.QUOTED_ALWAYS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[hi.b.URI_ENCODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f285811a = iArr;
            }
        }

        public /* synthetic */ b(String str, List list, hi.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (List<io.ktor.http.s0>) list, (i10 & 4) != 0 ? hi.b.QUOTED_WHEN_REQUIRED : bVar);
        }

        private final String e(String str, hi.b bVar) {
            int i10 = a.f285811a[bVar.ordinal()];
            if (i10 == 1) {
                return u0.c(str);
            }
            if (i10 == 2) {
                return u0.g(str);
            }
            if (i10 != 3) {
                throw new k0();
            }
            int i11 = 3 & 0;
            return h.n(str, false, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence i(b bVar, hi.b bVar2, io.ktor.http.s0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.g() + '=' + bVar.e(it.h(), bVar2);
        }

        @Override // hi.c
        @NotNull
        public String b() {
            return c(this.f285810d);
        }

        @Override // hi.c
        @NotNull
        public String c(@NotNull final hi.b encoding) {
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            if (this.f285809c.isEmpty()) {
                return a();
            }
            return CollectionsKt.joinToString$default(this.f285809c, ", ", a() + ' ', null, 0, null, new Function1() { // from class: hi.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.b.i(this.f285827a, encoding, (io.ktor.http.s0) obj);
                }
            }, 28, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return StringsKt.N1(bVar.a(), a(), true) && Intrinsics.areEqual(bVar.f285809c, this.f285809c);
        }

        @NotNull
        public final hi.b f() {
            return this.f285810d;
        }

        @NotNull
        public final List<io.ktor.http.s0> g() {
            return this.f285809c;
        }

        @Nullable
        public final String h(@NotNull String name) {
            Object next;
            Intrinsics.checkNotNullParameter(name, "name");
            Iterator<T> it = this.f285809c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((io.ktor.http.s0) next).g(), name));
            io.ktor.http.s0 s0Var = (io.ktor.http.s0) next;
            if (s0Var != null) {
                return s0Var.h();
            }
            return null;
        }

        public int hashCode() {
            s0 s0Var = s0.f296806a;
            String lowerCase = a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return s0Var.a(lowerCase, this.f285809c);
        }

        @NotNull
        public final b j(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(a(), (List<io.ktor.http.s0>) CollectionsKt.plus((Collection<? extends io.ktor.http.s0>) this.f285809c, new io.ktor.http.s0(name, value)), this.f285810d);
        }

        @NotNull
        public final b k(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<io.ktor.http.s0> it = this.f285809c.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().g(), name)) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return j(name, value);
            }
            List<io.ktor.http.s0> list = this.f285809c;
            ArrayList arrayList = new ArrayList();
            for (io.ktor.http.s0 s0Var : list) {
                if (Intrinsics.areEqual(s0Var.g(), name)) {
                    if (z10) {
                        s0Var = null;
                    } else {
                        s0Var = new io.ktor.http.s0(name, value);
                        z10 = true;
                    }
                }
                if (s0Var != null) {
                    arrayList.add(s0Var);
                }
            }
            return new b(a(), arrayList, this.f285810d);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String authScheme, @NotNull List<io.ktor.http.s0> parameters, @NotNull hi.b encoding) {
            super(authScheme, null);
            Intrinsics.checkNotNullParameter(authScheme, "authScheme");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            this.f285809c = parameters;
            this.f285810d = encoding;
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (!f.f285831c.k(((io.ktor.http.s0) it.next()).g())) {
                    throw new l("Parameter name should be a token", null, 2, null);
                }
            }
        }

        public /* synthetic */ b(String str, Map map, hi.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (Map<String, String>) map, (i10 & 4) != 0 ? hi.b.QUOTED_WHEN_REQUIRED : bVar);
        }

        public b(@NotNull String authScheme, @NotNull Map<String, String> parameters, @NotNull hi.b encoding) {
            Intrinsics.checkNotNullParameter(authScheme, "authScheme");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            Set<Map.Entry<String, String>> setEntrySet = parameters.entrySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new io.ktor.http.s0((String) entry.getKey(), (String) entry.getValue()));
            }
            this(authScheme, arrayList, encoding);
        }
    }

    private c(String str) {
        this.f285808a = str;
        if (f.f285831c.k(str)) {
            return;
        }
        throw new l("Invalid authScheme value: it should be token, but instead it is " + str, null, 2, null);
    }
}

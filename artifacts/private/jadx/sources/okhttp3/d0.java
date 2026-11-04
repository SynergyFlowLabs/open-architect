package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f333793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f333794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u f333795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final e0 f333796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, Object> f333797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private d f333798f;

    public d0(@NotNull v url, @NotNull String method, @NotNull u headers, @Nullable e0 e0Var, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f333793a = url;
        this.f333794b = method;
        this.f333795c = headers;
        this.f333796d = e0Var;
        this.f333797e = tags;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "body", imports = {}))
    @oj.i(name = "-deprecated_body")
    @Nullable
    public final e0 a() {
        return this.f333796d;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheControl", imports = {}))
    @oj.i(name = "-deprecated_cacheControl")
    @NotNull
    public final d b() {
        return g();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "headers", imports = {}))
    @oj.i(name = "-deprecated_headers")
    @NotNull
    public final u c() {
        return this.f333795c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "method", imports = {}))
    @oj.i(name = "-deprecated_method")
    @NotNull
    public final String d() {
        return this.f333794b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "url", imports = {}))
    @oj.i(name = "-deprecated_url")
    @NotNull
    public final v e() {
        return this.f333793a;
    }

    @oj.i(name = "body")
    @Nullable
    public final e0 f() {
        return this.f333796d;
    }

    @oj.i(name = "cacheControl")
    @NotNull
    public final d g() {
        d dVar = this.f333798f;
        if (dVar != null) {
            return dVar;
        }
        d dVarC = d.f333769n.c(this.f333795c);
        this.f333798f = dVarC;
        return dVarC;
    }

    @NotNull
    public final Map<Class<?>, Object> h() {
        return this.f333797e;
    }

    @Nullable
    public final String i(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f333795c.k(name);
    }

    @NotNull
    public final List<String> j(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f333795c.A(name);
    }

    @oj.i(name = "headers")
    @NotNull
    public final u k() {
        return this.f333795c;
    }

    public final boolean l() {
        return this.f333793a.G();
    }

    @oj.i(name = "method")
    @NotNull
    public final String m() {
        return this.f333794b;
    }

    @NotNull
    public final a n() {
        return new a(this);
    }

    @Nullable
    public final Object o() {
        return p(Object.class);
    }

    @Nullable
    public final <T> T p(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f333797e.get(type));
    }

    @oj.i(name = "url")
    @NotNull
    public final v q() {
        return this.f333793a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f333794b);
        sb2.append(", url=");
        sb2.append(this.f333793a);
        if (this.f333795c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f333795c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strComponent1);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(strComponent2);
                i10 = i11;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        if (!this.f333797e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f333797e);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private v f333799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f333800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private u.a f333801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private e0 f333802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private Map<Class<?>, Object> f333803e;

        public a() {
            this.f333803e = new LinkedHashMap();
            this.f333800b = "GET";
            this.f333801c = new u.a();
        }

        public static /* synthetic */ a f(a aVar, e0 e0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                e0Var = jk.f.f307486d;
            }
            return aVar.e(e0Var);
        }

        @NotNull
        public a A(@Nullable Object obj) {
            return z(Object.class, obj);
        }

        @NotNull
        public a B(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.s2(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (StringsKt.s2(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return D(v.f334772k.h(url));
        }

        @NotNull
        public a C(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            v.b bVar = v.f334772k;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return D(bVar.h(string));
        }

        @NotNull
        public a D(@NotNull v url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f333799a = url;
            return this;
        }

        @NotNull
        public a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f333801c.b(name, value);
            return this;
        }

        @NotNull
        public d0 b() {
            v vVar = this.f333799a;
            if (vVar != null) {
                return new d0(vVar, this.f333800b, this.f333801c.i(), this.f333802d, jk.f.i0(this.f333803e));
            }
            throw new IllegalStateException("url == null");
        }

        @NotNull
        public a c(@NotNull d cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? t(com.google.common.net.d.f119471a) : n(com.google.common.net.d.f119471a, string);
        }

        @oj.j
        @NotNull
        public final a d() {
            return f(this, null, 1, null);
        }

        @oj.j
        @NotNull
        public a e(@Nullable e0 e0Var) {
            return p("DELETE", e0Var);
        }

        @NotNull
        public a g() {
            return p("GET", null);
        }

        @Nullable
        public final e0 h() {
            return this.f333802d;
        }

        @NotNull
        public final u.a i() {
            return this.f333801c;
        }

        @NotNull
        public final String j() {
            return this.f333800b;
        }

        @NotNull
        public final Map<Class<?>, Object> k() {
            return this.f333803e;
        }

        @Nullable
        public final v l() {
            return this.f333799a;
        }

        @NotNull
        public a m() {
            return p("HEAD", null);
        }

        @NotNull
        public a n(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f333801c.m(name, value);
            return this;
        }

        @NotNull
        public a o(@NotNull u headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f333801c = headers.s();
            return this;
        }

        @NotNull
        public a p(@NotNull String method, @Nullable e0 e0Var) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (e0Var == null) {
                if (okhttp3.internal.http.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!okhttp3.internal.http.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f333800b = method;
            this.f333802d = e0Var;
            return this;
        }

        @NotNull
        public a q(@NotNull e0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return p("PATCH", body);
        }

        @NotNull
        public a r(@NotNull e0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return p("POST", body);
        }

        @NotNull
        public a s(@NotNull e0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return p("PUT", body);
        }

        @NotNull
        public a t(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f333801c.l(name);
            return this;
        }

        public final void u(@Nullable e0 e0Var) {
            this.f333802d = e0Var;
        }

        public final void v(@NotNull u.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f333801c = aVar;
        }

        public final void w(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f333800b = str;
        }

        public final void x(@NotNull Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f333803e = map;
        }

        public final void y(@Nullable v vVar) {
            this.f333799a = vVar;
        }

        @NotNull
        public <T> a z(@NotNull Class<? super T> type, @Nullable T t10) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (t10 == null) {
                this.f333803e.remove(type);
                return this;
            }
            if (this.f333803e.isEmpty()) {
                this.f333803e = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.f333803e;
            T tCast = type.cast(t10);
            Intrinsics.checkNotNull(tCast);
            map.put(type, tCast);
            return this;
        }

        public a(@NotNull d0 request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f333803e = new LinkedHashMap();
            this.f333799a = request.q();
            this.f333800b = request.m();
            this.f333802d = request.f();
            if (request.h().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt.toMutableMap(request.h());
            }
            this.f333803e = mutableMap;
            this.f333801c = request.k().s();
        }
    }
}

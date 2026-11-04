package io.ktor.http;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nContentTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1#2:431\n1761#3,3:432\n1761#3,3:435\n*S KotlinDebug\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType\n*L\n49#1:432,3\n89#1:435,3\n*E\n"})
public final class m extends t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final c f295981f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final m f295982g = new m("*", "*", null, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f295983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f295984e;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f295986b = "application";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final m f295992h;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private static final m f295999o;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        private static final m f296006v;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f295985a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f295987c = new m("application", "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f295988d = new m("application", "atom+xml", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f295989e = new m("application", "cbor", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f295990f = new m("application", PeopleCardEntry.json, null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final m f295991g = new m("application", "hal+json", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final m f295993i = new m("application", "octet-stream", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final m f295994j = new m("application", "rss+xml", null, 4, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final m f295995k = new m("application", "soap+xml", null, 4, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private static final m f295996l = new m("application", "xml", null, 4, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private static final m f295997m = new m("application", "xml-dtd", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private static final m f295998n = new m("application", "yaml", null, 4, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        private static final m f296000p = new m("application", "gzip", null, 4, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        private static final m f296001q = new m("application", "x-www-form-urlencoded", null, 4, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        private static final m f296002r = new m("application", "pdf", null, 4, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        private static final m f296003s = new m("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        private static final m f296004t = new m("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        private static final m f296005u = new m("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        private static final m f296007w = new m("application", "wasm", null, 4, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        private static final m f296008x = new m("application", "problem+json", null, 4, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NotNull
        private static final m f296009y = new m("application", "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            boolean z10 = 4 ^ 0;
            DefaultConstructorMarker defaultConstructorMarker = null;
            f295992h = new m("application", "javascript", null, 4, defaultConstructorMarker);
            f295999o = new m("application", "zip", null, 4, defaultConstructorMarker);
            f296006v = new m("application", "protobuf", null, 4, defaultConstructorMarker);
        }

        private a() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f295987c);
        }

        public final boolean b(@NotNull CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.c5(contentType, "application/", true);
        }

        @NotNull
        public final m c() {
            return f295987c;
        }

        @NotNull
        public final m d() {
            return f295988d;
        }

        @NotNull
        public final m e() {
            return f295989e;
        }

        @NotNull
        public final m f() {
            return f296004t;
        }

        @NotNull
        public final m g() {
            return f296001q;
        }

        @NotNull
        public final m h() {
            return f296000p;
        }

        @NotNull
        public final m i() {
            return f295991g;
        }

        @NotNull
        public final m j() {
            return f295992h;
        }

        @NotNull
        public final m k() {
            return f295990f;
        }

        @NotNull
        public final m l() {
            return f295993i;
        }

        @NotNull
        public final m m() {
            return f296002r;
        }

        @NotNull
        public final m n() {
            return f296005u;
        }

        @NotNull
        public final m o() {
            return f296008x;
        }

        @NotNull
        public final m p() {
            return f296009y;
        }

        @NotNull
        public final m q() {
            return f296006v;
        }

        @NotNull
        public final m r() {
            return f295994j;
        }

        @NotNull
        public final m s() {
            return f295995k;
        }

        @NotNull
        public final m t() {
            return f296007w;
        }

        @NotNull
        public final m u() {
            return f296003s;
        }

        @NotNull
        public final m v() {
            return f295996l;
        }

        @NotNull
        public final m w() {
            return f295997m;
        }

        @NotNull
        public final m x() {
            return f295998n;
        }

        @NotNull
        public final m y() {
            return f295999o;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296011b = "audio";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f296010a = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296012c = new m("audio", "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296013d = new m("audio", io.sentry.rrweb.j.Y, null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f296014e = new m("audio", "mpeg", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f296015f = new m("audio", "ogg", null, 4, null);

        static {
            int i10 = 2 & 0;
        }

        private b() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296012c);
        }

        public final boolean b(@NotNull CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.c5(contentType, "audio/", true);
        }

        @NotNull
        public final m c() {
            return f296012c;
        }

        @NotNull
        public final m d() {
            return f296013d;
        }

        @NotNull
        public final m e() {
            return f296014e;
        }

        @NotNull
        public final m f() {
            return f296015f;
        }
    }

    @SourceDebugExtension({"SMAP\nContentTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType$Companion\n+ 2 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters$Companion\n*L\n1#1,430:1\n70#2,2:431\n*S KotlinDebug\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType$Companion\n*L\n138#1:431,2\n*E\n"})
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a() {
            return m.f295982g;
        }

        @NotNull
        public final m b(@NotNull String value) throws io.ktor.http.b {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.w3(value)) {
                return a();
            }
            t0.a aVar = t0.f296102c;
            r0 r0Var = (r0) CollectionsKt.last((List) c1.f(value));
            String strG = r0Var.g();
            List<s0> listE = r0Var.e();
            int i10 = 6 << 0;
            int iQ3 = StringsKt.q3(strG, '/', 0, false, 6, null);
            if (iQ3 == -1) {
                if (Intrinsics.areEqual(StringsKt.E5(strG).toString(), "*")) {
                    return m.f295981f.a();
                }
                throw new io.ktor.http.b(value);
            }
            String strSubstring = strG.substring(0, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String string = StringsKt.E5(strSubstring).toString();
            if (string.length() == 0) {
                throw new io.ktor.http.b(value);
            }
            String strSubstring2 = strG.substring(iQ3 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String string2 = StringsKt.E5(strSubstring2).toString();
            if (StringsKt.U2(string, ' ', false, 2, null) || StringsKt.U2(string2, ' ', false, 2, null)) {
                throw new io.ktor.http.b(value);
            }
            if (string2.length() == 0 || StringsKt.U2(string2, '/', false, 2, null)) {
                throw new io.ktor.http.b(value);
            }
            return new m(string, string2, listE);
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f296016a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296017b = "font";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296018c = new m(f296017b, "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296019d = new m(f296017b, "collection", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f296020e = new m(f296017b, "otf", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f296021f = new m(f296017b, "sfnt", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final m f296022g = new m(f296017b, "ttf", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final m f296023h = new m(f296017b, "woff", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final m f296024i = new m(f296017b, "woff2", null, 4, null);

        static {
            int i10 = 6 >> 0;
            int i11 = 2 >> 4;
        }

        private d() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296018c);
        }

        public final boolean b(@NotNull CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.c5(contentType, "font/", true);
        }

        @NotNull
        public final m c() {
            return f296018c;
        }

        @NotNull
        public final m d() {
            return f296019d;
        }

        @NotNull
        public final m e() {
            return f296020e;
        }

        @NotNull
        public final m f() {
            return f296021f;
        }

        @NotNull
        public final m g() {
            return f296022g;
        }

        @NotNull
        public final m h() {
            return f296023h;
        }

        @NotNull
        public final m i() {
            return f296024i;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296026b = "image";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f296025a = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296027c = new m("image", "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296028d = new m("image", "gif", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f296029e = new m("image", "jpeg", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f296030f = new m("image", "png", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final m f296031g = new m("image", "svg+xml", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final m f296032h = new m("image", "x-icon", null, 4, null);

        static {
            int i10 = 6 ^ 0;
        }

        private e() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296027c);
        }

        public final boolean b(@NotNull String contentSubtype) {
            Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
            return StringsKt.s2(contentSubtype, "image/", true);
        }

        @NotNull
        public final m c() {
            return f296027c;
        }

        @NotNull
        public final m d() {
            return f296028d;
        }

        @NotNull
        public final m e() {
            return f296029e;
        }

        @NotNull
        public final m f() {
            return f296030f;
        }

        @NotNull
        public final m g() {
            return f296031g;
        }

        @NotNull
        public final m h() {
            return f296032h;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296034b = "message";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f296033a = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296035c = new m("message", "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296036d = new m("message", "http", null, 4, null);

        private f() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296035c);
        }

        public final boolean b(@NotNull String contentSubtype) {
            Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
            return StringsKt.s2(contentSubtype, "message/", true);
        }

        @NotNull
        public final m c() {
            return f296035c;
        }

        @NotNull
        public final m d() {
            return f296036d;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f296037a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296038b = "multipart";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296039c = new m(f296038b, "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296040d = new m(f296038b, "mixed", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f296041e = new m(f296038b, "alternative", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f296042f = new m(f296038b, "related", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final m f296043g = new m(f296038b, "form-data", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final m f296044h = new m(f296038b, "signed", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final m f296045i = new m(f296038b, "encrypted", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final m f296046j = new m(f296038b, "byteranges", null, 4, null);

        static {
            int i10 = 3 & 4;
        }

        private g() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296039c);
        }

        public final boolean b(@NotNull CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.c5(contentType, "multipart/", true);
        }

        @NotNull
        public final m c() {
            return f296041e;
        }

        @NotNull
        public final m d() {
            return f296039c;
        }

        @NotNull
        public final m e() {
            return f296046j;
        }

        @NotNull
        public final m f() {
            return f296045i;
        }

        @NotNull
        public final m g() {
            return f296043g;
        }

        @NotNull
        public final m h() {
            return f296040d;
        }

        @NotNull
        public final m i() {
            return f296042f;
        }

        @NotNull
        public final m j() {
            return f296044h;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296048b = "text";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f296047a = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296049c = new m("text", "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296050d = new m("text", net.openid.appauth.f.f332950p, null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f296051e = new m("text", "css", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f296052f = new m("text", "csv", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final m f296053g = new m("text", "html", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final m f296054h = new m("text", "javascript", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final m f296055i = new m("text", "vcard", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final m f296056j = new m("text", "xml", null, 4, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final m f296057k = new m("text", "event-stream", null, 4, null);

        static {
            int i10 = 0 << 0;
            int i11 = 6 & 0;
        }

        private h() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296049c);
        }

        public final boolean b(@NotNull CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.c5(contentType, "text/", true);
        }

        @NotNull
        public final m c() {
            return f296049c;
        }

        @NotNull
        public final m d() {
            return f296051e;
        }

        @NotNull
        public final m e() {
            return f296052f;
        }

        @NotNull
        public final m f() {
            return f296057k;
        }

        @NotNull
        public final m g() {
            return f296053g;
        }

        @NotNull
        public final m h() {
            return f296054h;
        }

        @NotNull
        public final m i() {
            return f296050d;
        }

        @NotNull
        public final m j() {
            return f296055i;
        }

        @NotNull
        public final m k() {
            return f296056j;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f296059b = "video";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f296058a = new i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m f296060c = new m("video", "*", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final m f296061d = new m("video", "mpeg", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final m f296062e = new m("video", io.sentry.rrweb.j.Y, null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final m f296063f = new m("video", "ogg", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final m f296064g = new m("video", "quicktime", null, 4, null);

        private i() {
        }

        public final boolean a(@NotNull m contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.h(f296060c);
        }

        public final boolean b(@NotNull CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.c5(contentType, "video/", true);
        }

        @NotNull
        public final m c() {
            return f296060c;
        }

        @NotNull
        public final m d() {
            return f296062e;
        }

        @NotNull
        public final m e() {
            return f296061d;
        }

        @NotNull
        public final m f() {
            return f296063f;
        }

        @NotNull
        public final m g() {
            return f296064g;
        }
    }

    static {
        int i10 = 4 << 0;
    }

    /* synthetic */ m(String str, String str2, String str3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    private final boolean g(String str, String str2) {
        int size = b().size();
        if (size != 0) {
            if (size != 1) {
                List<s0> listB = b();
                if ((listB instanceof Collection) && listB.isEmpty()) {
                    return false;
                }
                for (s0 s0Var : listB) {
                    if (StringsKt.N1(s0Var.g(), str, true) && StringsKt.N1(s0Var.h(), str2, true)) {
                        return true;
                    }
                }
                return false;
            }
            s0 s0Var2 = b().get(0);
            if (StringsKt.N1(s0Var2.g(), str, true) && StringsKt.N1(s0Var2.h(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String e() {
        return this.f295984e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return StringsKt.N1(this.f295983d, mVar.f295983d, true) && StringsKt.N1(this.f295984e, mVar.f295984e, true) && Intrinsics.areEqual(b(), mVar.b());
    }

    @NotNull
    public final String f() {
        return this.f295983d;
    }

    public final boolean h(@NotNull m pattern) {
        boolean zN1;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        int i10 = 1 >> 0;
        if (!Intrinsics.areEqual(pattern.f295983d, "*") && !StringsKt.N1(pattern.f295983d, this.f295983d, true)) {
            return false;
        }
        if (!Intrinsics.areEqual(pattern.f295984e, "*") && !StringsKt.N1(pattern.f295984e, this.f295984e, true)) {
            return false;
        }
        for (s0 s0Var : pattern.b()) {
            String strA = s0Var.a();
            String strB = s0Var.b();
            if (!Intrinsics.areEqual(strA, "*")) {
                String strC = c(strA);
                zN1 = Intrinsics.areEqual(strB, "*") ? strC != null : StringsKt.N1(strC, strB, true);
            } else if (!Intrinsics.areEqual(strB, "*")) {
                List<s0> listB = b();
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator<T> it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (StringsKt.N1(((s0) it.next()).h(), strB, true)) {
                            }
                        }
                    }
                }
            }
            if (!zN1) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f295983d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f295984e.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public final boolean i(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return h(f295981f.b(pattern));
    }

    @NotNull
    public final m j(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return g(name, value) ? this : new m(this.f295983d, this.f295984e, a(), CollectionsKt.plus((Collection<? extends s0>) b(), new s0(name, value)));
    }

    @NotNull
    public final m k() {
        if (b().isEmpty()) {
            return this;
        }
        return new m(this.f295983d, this.f295984e, null, 4, null);
    }

    private m(String str, String str2, String str3, List<s0> list) {
        super(str3, list);
        this.f295983d = str;
        this.f295984e = str2;
    }

    public /* synthetic */ m(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull String contentType, @NotNull String contentSubtype, @NotNull List<s0> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}

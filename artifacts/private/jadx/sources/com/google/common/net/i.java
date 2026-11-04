package com.google.common.net;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.google.common.base.a0;
import com.google.common.base.b0;
import com.google.common.base.d0;
import com.google.common.base.e0;
import com.google.common.base.j0;
import com.google.common.base.t;
import com.google.common.collect.b8;
import com.google.common.collect.k8;
import com.google.common.collect.m6;
import com.google.common.collect.n8;
import com.google.common.collect.nb;
import com.google.common.collect.t6;
import com.google.common.collect.z6;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.net.a
@z7.j
@com.google.common.annotations.b
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f119608g = "charset";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f119623l = "application";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f119626m = "audio";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f119629n = "image";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f119632o = "text";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f119635p = "video";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f119638q = "font";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f119641r = "*";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m6<String, String> f119670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private String f119671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    private int f119672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a8.b
    @fj.a
    private e0<Charset> f119673f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final m6<String, String> f119611h = m6.Z("charset", com.google.common.base.c.g(StandardCharsets.UTF_8.name()));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.common.base.e f119614i = com.google.common.base.e.f().b(com.google.common.base.e.v().F()).b(com.google.common.base.e.s(' ')).b(com.google.common.base.e.H("()<>@,;:\\\"/[]?="));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.google.common.base.e f119617j = com.google.common.base.e.f().b(com.google.common.base.e.H("\"\\\r"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.common.base.e f119620k = com.google.common.base.e.d(" \t\r\n");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map<i, i> f119644s = b8.Y();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f119647t = j("*", "*");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f119650u = j("text", "*");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f119653v = j("image", "*");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f119656w = j("audio", "*");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f119659x = j("video", "*");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i f119662y = j("application", "*");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final i f119665z = j("font", "*");
    public static final i A = k("text", "cache-manifest");
    public static final i B = k("text", "css");
    public static final i C = k("text", "csv");
    public static final i D = k("text", "html");
    public static final i E = k("text", "calendar");
    public static final i F = k("text", "markdown");
    public static final i G = k("text", net.openid.appauth.f.f332950p);
    public static final i H = k("text", "javascript");
    public static final i I = k("text", "tab-separated-values");
    public static final i J = k("text", "vcard");
    public static final i K = k("text", "vnd.wap.wml");
    public static final i L = k("text", "xml");
    public static final i M = k("text", "vtt");
    public static final i N = j("image", "bmp");
    public static final i O = j("image", "x-canon-crw");
    public static final i P = j("image", "gif");
    public static final i Q = j("image", "vnd.microsoft.icon");
    public static final i R = j("image", "jpeg");
    public static final i S = j("image", "png");
    public static final i T = j("image", "vnd.adobe.photoshop");
    public static final i U = k("image", "svg+xml");
    public static final i V = j("image", "tiff");
    public static final i W = j("image", "webp");
    public static final i X = j("image", "heif");
    public static final i Y = j("image", "jp2");
    public static final i Z = j("audio", io.sentry.rrweb.j.Y);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final i f119596a0 = j("audio", "mpeg");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final i f119598b0 = j("audio", "ogg");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final i f119600c0 = j("audio", "webm");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final i f119602d0 = j("audio", "l16");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final i f119604e0 = j("audio", "l24");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final i f119606f0 = j("audio", "basic");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final i f119609g0 = j("audio", "aac");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final i f119612h0 = j("audio", "vorbis");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final i f119615i0 = j("audio", "x-ms-wma");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final i f119618j0 = j("audio", "x-ms-wax");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final i f119621k0 = j("audio", "vnd.rn-realaudio");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final i f119624l0 = j("audio", "vnd.wave");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final i f119627m0 = j("video", io.sentry.rrweb.j.Y);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final i f119630n0 = j("video", "mpeg");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final i f119633o0 = j("video", "ogg");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i f119636p0 = j("video", "quicktime");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final i f119639q0 = j("video", "webm");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final i f119642r0 = j("video", "x-ms-wmv");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final i f119645s0 = j("video", "x-flv");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final i f119648t0 = j("video", "3gpp");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final i f119651u0 = j("video", "3gpp2");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final i f119654v0 = k("application", "xml");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final i f119657w0 = k("application", "atom+xml");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final i f119660x0 = j("application", "x-bzip2");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final i f119663y0 = k("application", "dart");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final i f119666z0 = j("application", "vnd.apple.pkpass");
    public static final i A0 = j("application", "vnd.ms-fontobject");
    public static final i B0 = j("application", "epub+zip");
    public static final i C0 = j("application", "x-www-form-urlencoded");
    public static final i D0 = j("application", "pkcs12");
    public static final i E0 = j("application", "binary");
    public static final i F0 = j("application", "geo+json");
    public static final i G0 = j("application", "x-gzip");
    public static final i H0 = j("application", "hal+json");
    public static final i I0 = k("application", "javascript");
    public static final i J0 = j("application", "jose");
    public static final i K0 = j("application", "jose+json");
    public static final i L0 = k("application", PeopleCardEntry.json);
    public static final i M0 = j("application", MetricTracker.Object.JWT);
    public static final i N0 = k("application", "manifest+json");
    public static final i O0 = j("application", "vnd.google-earth.kml+xml");
    public static final i P0 = j("application", "vnd.google-earth.kmz");
    public static final i Q0 = j("application", "mbox");
    public static final i R0 = j("application", "x-apple-aspen-config");
    public static final i S0 = j("application", "vnd.ms-excel");
    public static final i T0 = j("application", "vnd.ms-outlook");
    public static final i U0 = j("application", "vnd.ms-powerpoint");
    public static final i V0 = j("application", "msword");
    public static final i W0 = j("application", "dash+xml");
    public static final i X0 = j("application", "wasm");
    public static final i Y0 = j("application", "x-nacl");
    public static final i Z0 = j("application", "x-pnacl");

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final i f119597a1 = j("application", "octet-stream");

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final i f119599b1 = j("application", "ogg");

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final i f119601c1 = j("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final i f119603d1 = j("application", "vnd.openxmlformats-officedocument.presentationml.presentation");

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final i f119605e1 = j("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final i f119607f1 = j("application", "vnd.oasis.opendocument.graphics");

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final i f119610g1 = j("application", "vnd.oasis.opendocument.presentation");

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final i f119613h1 = j("application", "vnd.oasis.opendocument.spreadsheet");

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final i f119616i1 = j("application", "vnd.oasis.opendocument.text");

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final i f119619j1 = k("application", "opensearchdescription+xml");

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final i f119622k1 = j("application", "pdf");

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final i f119625l1 = j("application", "postscript");

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final i f119628m1 = j("application", "protobuf");

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final i f119631n1 = k("application", "rdf+xml");

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final i f119634o1 = k("application", "rtf");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final i f119637p1 = j("application", "font-sfnt");

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final i f119640q1 = j("application", "x-shockwave-flash");

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final i f119643r1 = j("application", "vnd.sketchup.skp");

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final i f119646s1 = k("application", "soap+xml");

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final i f119649t1 = j("application", "x-tar");

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final i f119652u1 = j("application", "font-woff");

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final i f119655v1 = j("application", "font-woff2");

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final i f119658w1 = k("application", "xhtml+xml");

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final i f119661x1 = k("application", "xrd+xml");

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final i f119664y1 = j("application", "zip");

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final i f119667z1 = j("font", "collection");
    public static final i A1 = j("font", "otf");
    public static final i B1 = j("font", "sfnt");
    public static final i C1 = j("font", "ttf");
    public static final i D1 = j("font", "woff");
    public static final i E1 = j("font", "woff2");
    private static final a0.d F1 = a0.p("; ").u("=");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f119674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f119675b = 0;

        a(String input) {
            this.f119674a = input;
        }

        @z7.a
        char a(char c10) {
            j0.g0(e());
            j0.g0(f() == c10);
            this.f119675b++;
            return c10;
        }

        char b(com.google.common.base.e matcher) {
            j0.g0(e());
            char cF = f();
            j0.g0(matcher.B(cF));
            this.f119675b++;
            return cF;
        }

        String c(com.google.common.base.e matcher) {
            int i10 = this.f119675b;
            String strD = d(matcher);
            j0.g0(this.f119675b != i10);
            return strD;
        }

        @z7.a
        String d(com.google.common.base.e matcher) {
            j0.g0(e());
            int i10 = this.f119675b;
            this.f119675b = matcher.F().o(this.f119674a, i10);
            return e() ? this.f119674a.substring(i10, this.f119675b) : this.f119674a.substring(i10);
        }

        boolean e() {
            int i10 = this.f119675b;
            return i10 >= 0 && i10 < this.f119674a.length();
        }

        char f() {
            j0.g0(e());
            return this.f119674a.charAt(this.f119675b);
        }
    }

    private i(String type, String subtype, m6<String, String> parameters) {
        this.f119668a = type;
        this.f119669b = subtype;
        this.f119670c = parameters;
    }

    public static /* synthetic */ String a(String str) {
        return (!f119614i.C(str) || str.isEmpty()) ? p(str) : str;
    }

    private static i b(i mediaType) {
        f119644s.put(mediaType, mediaType);
        return mediaType;
    }

    private String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f119668a);
        sb2.append('/');
        sb2.append(this.f119669b);
        if (!this.f119670c.isEmpty()) {
            sb2.append("; ");
            F1.d(sb2, n8.G(this.f119670c, new t() { // from class: com.google.common.net.g
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return i.a((String) obj);
                }
            }).u());
        }
        return sb2.toString();
    }

    private static void e(a tokenizer, char c10) {
        com.google.common.base.e eVar = f119620k;
        tokenizer.d(eVar);
        tokenizer.a(c10);
        tokenizer.d(eVar);
    }

    public static i f(String type, String subtype) {
        i iVarG = g(type, subtype, m6.X());
        iVarG.f119673f = e0.a();
        return iVarG;
    }

    private static i g(String type, String subtype, k8<String, String> parameters) {
        j0.E(type);
        j0.E(subtype);
        j0.E(parameters);
        String strT = t(type);
        String strT2 = t(subtype);
        j0.e(!"*".equals(strT) || "*".equals(strT2), "A wildcard type cannot be used with a non-wildcard subtype");
        m6.a aVarM = m6.M();
        for (Map.Entry<String, String> entry : parameters.u()) {
            String strT3 = t(entry.getKey());
            aVarM.i(strT3, s(strT3, entry.getValue()));
        }
        i iVar = new i(strT, strT2, aVarM.a());
        return (i) b0.a(f119644s.get(iVar), iVar);
    }

    static i h(String subtype) {
        return f("application", subtype);
    }

    static i i(String subtype) {
        return f("audio", subtype);
    }

    private static i j(String type, String subtype) {
        i iVarB = b(new i(type, subtype, m6.X()));
        iVarB.f119673f = e0.a();
        return iVarB;
    }

    private static i k(String type, String subtype) {
        i iVarB = b(new i(type, subtype, f119611h));
        iVarB.f119673f = e0.f(StandardCharsets.UTF_8);
        return iVarB;
    }

    static i l(String subtype) {
        return f("font", subtype);
    }

    static i m(String subtype) {
        return f("image", subtype);
    }

    static i n(String subtype) {
        return f("text", subtype);
    }

    static i o(String subtype) {
        return f("video", subtype);
    }

    private static String p(String value) {
        StringBuilder sb2 = new StringBuilder(value.length() + 16);
        sb2.append('\"');
        for (int i10 = 0; i10 < value.length(); i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        sb2.append('\"');
        return sb2.toString();
    }

    private static String s(String attribute, String value) {
        j0.E(value);
        j0.u(com.google.common.base.e.f().C(value), "parameter values must be ASCII: %s", value);
        return "charset".equals(attribute) ? com.google.common.base.c.g(value) : value;
    }

    private static String t(String token) {
        j0.d(f119614i.C(token));
        j0.d(!token.isEmpty());
        return com.google.common.base.c.g(token);
    }

    private Map<String, t6<String>> v() {
        return b8.D0(this.f119670c.l(), new t() { // from class: com.google.common.net.h
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return t6.u((Collection) obj);
            }
        });
    }

    @z7.a
    public static i w(String input) {
        String strC;
        j0.E(input);
        a aVar = new a(input);
        try {
            com.google.common.base.e eVar = f119614i;
            String strC2 = aVar.c(eVar);
            e(aVar, '/');
            String strC3 = aVar.c(eVar);
            m6.a aVarM = m6.M();
            while (aVar.e()) {
                e(aVar, ';');
                com.google.common.base.e eVar2 = f119614i;
                String strC4 = aVar.c(eVar2);
                e(aVar, '=');
                if ('\"' == aVar.f()) {
                    aVar.a('\"');
                    StringBuilder sb2 = new StringBuilder();
                    while ('\"' != aVar.f()) {
                        if ('\\' == aVar.f()) {
                            aVar.a('\\');
                            sb2.append(aVar.b(com.google.common.base.e.f()));
                        } else {
                            sb2.append(aVar.c(f119617j));
                        }
                    }
                    strC = sb2.toString();
                    aVar.a('\"');
                } else {
                    strC = aVar.c(eVar2);
                }
                aVarM.i(strC4, strC);
            }
            return g(strC2, strC3, aVarM.a());
        } catch (IllegalStateException e10) {
            throw new IllegalArgumentException("Could not parse '" + input + "'", e10);
        }
    }

    public i A(String attribute, String value) {
        return C(attribute, z6.J(value));
    }

    public i B(k8<String, String> parameters) {
        return g(this.f119668a, this.f119669b, parameters);
    }

    public i C(String attribute, Iterable<String> values) {
        j0.E(attribute);
        j0.E(values);
        String strT = t(attribute);
        m6.a aVarM = m6.M();
        nb<Map.Entry<String, String>> it = this.f119670c.u().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!strT.equals(key)) {
                aVarM.i(key, next.getValue());
            }
        }
        Iterator<String> it2 = values.iterator();
        while (it2.hasNext()) {
            aVarM.i(strT, s(strT, it2.next()));
        }
        i iVar = new i(this.f119668a, this.f119669b, aVarM.a());
        if (!strT.equals("charset")) {
            iVar.f119673f = this.f119673f;
        }
        return (i) b0.a(f119644s.get(iVar), iVar);
    }

    public i D() {
        return this.f119670c.isEmpty() ? this : f(this.f119668a, this.f119669b);
    }

    public e0<Charset> c() {
        e0<Charset> e0VarA = this.f119673f;
        if (e0VarA == null) {
            e0VarA = e0.a();
            nb<String> it = this.f119670c.x("charset").iterator();
            String str = null;
            while (it.hasNext()) {
                String next = it.next();
                if (str == null) {
                    e0VarA = e0.f(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + next);
                }
            }
            this.f119673f = e0VarA;
        }
        return e0VarA;
    }

    public boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f119668a.equals(iVar.f119668a) && this.f119669b.equals(iVar.f119669b) && v().equals(iVar.v())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f119672e;
        if (i10 != 0) {
            return i10;
        }
        int iB = d0.b(this.f119668a, this.f119669b, v());
        this.f119672e = iB;
        return iB;
    }

    public boolean q() {
        return "*".equals(this.f119668a) || "*".equals(this.f119669b);
    }

    public boolean r(i mediaTypeRange) {
        return (mediaTypeRange.f119668a.equals("*") || mediaTypeRange.f119668a.equals(this.f119668a)) && (mediaTypeRange.f119669b.equals("*") || mediaTypeRange.f119669b.equals(this.f119669b)) && this.f119670c.u().containsAll(mediaTypeRange.f119670c.u());
    }

    public String toString() {
        String str = this.f119671d;
        if (str != null) {
            return str;
        }
        String strD = d();
        this.f119671d = strD;
        return strD;
    }

    public m6<String, String> u() {
        return this.f119670c;
    }

    public String x() {
        return this.f119669b;
    }

    public String y() {
        return this.f119668a;
    }

    public i z(Charset charset) {
        j0.E(charset);
        i iVarA = A("charset", charset.name());
        iVarA.f119673f = e0.f(charset);
        return iVarA;
    }
}

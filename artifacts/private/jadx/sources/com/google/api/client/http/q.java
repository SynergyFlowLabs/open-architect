package com.google.api.client.http;

import com.google.api.client.util.n0;
import com.google.api.client.util.p0;
import com.google.api.client.util.q0;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class q extends com.google.api.client.util.s {

    @com.google.api.client.util.v(com.google.common.net.d.B0)
    private List<String> H1;

    @com.google.api.client.util.v(com.google.common.net.d.B)
    private List<String> X;

    @com.google.api.client.util.v(com.google.common.net.d.f119533r0)
    private List<String> Y;

    @com.google.api.client.util.v(com.google.common.net.d.f119539t0)
    private List<String> Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.api.client.util.v("Accept")
    private List<String> f115667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119507j)
    private List<String> f115668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.api.client.util.v("Authorization")
    private List<String> f115669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119471a)
    private List<String> f115670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119476b0)
    private List<String> f115671g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @com.google.api.client.util.v("WWW-Authenticate")
    private List<String> f115672g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.api.client.util.v("Content-Length")
    private List<Long> f115673h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.Y)
    private List<Long> f115674h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119488e0)
    private List<String> f115675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119492f0)
    private List<String> f115676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.google.api.client.util.v("Content-Type")
    private List<String> f115677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.google.api.client.util.v("Cookie")
    private List<String> f115678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119483d)
    private List<String> f115679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119527p0)
    private List<String> f115680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119530q0)
    private List<String> f115681o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @com.google.api.client.util.v("MIME-Version")
    private List<String> f115682p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.I)
    private List<String> f115683p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.P)
    private List<String> f115684p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119556z)
    private List<String> f115685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.f119553y)
    private List<String> f115686t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.A)
    private List<String> f115687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @com.google.api.client.util.v(com.google.common.net.d.C)
    private List<String> f115688w;

    private static class a extends e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final q f115689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f115690f;

        a(q qVar, b bVar) {
            this.f115689e = qVar;
            this.f115690f = bVar;
        }

        @Override // com.google.api.client.http.e0
        public void a(String str, String str2) {
            this.f115689e.W(str, str2, this.f115690f);
        }

        @Override // com.google.api.client.http.e0
        public f0 b() throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.api.client.util.b f115691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final StringBuilder f115692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.api.client.util.k f115693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<Type> f115694d;

        public b(q qVar, StringBuilder sb2) {
            Class<?> cls = qVar.getClass();
            this.f115694d = Arrays.asList(cls);
            this.f115693c = com.google.api.client.util.k.i(cls, true);
            this.f115692b = sb2;
            this.f115691a = new com.google.api.client.util.b(qVar);
        }

        void a() {
            this.f115691a.c();
        }
    }

    public q() {
        super(EnumSet.of(com.google.api.client.util.s.c.IGNORE_CASE));
        this.f115668d = new ArrayList(Collections.singleton("gzip"));
    }

    private <T> T G(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static String G0(Object obj) {
        return obj instanceof Enum ? com.google.api.client.util.r.k((Enum) obj).f() : obj.toString();
    }

    private static Object X(Type type, List<Type> list, String str) {
        return com.google.api.client.util.n.j(com.google.api.client.util.n.k(list, type), str);
    }

    static void Z(q qVar, StringBuilder sb2, StringBuilder sb3, Logger logger, e0 e0Var) throws IOException {
        a0(qVar, sb2, sb3, logger, e0Var, null);
    }

    static void a0(q qVar, StringBuilder sb2, StringBuilder sb3, Logger logger, e0 e0Var, Writer writer) throws IOException {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Object> entry : qVar.entrySet()) {
            String key = entry.getKey();
            com.google.api.client.util.h0.c(hashSet.add(key), "multiple headers of the same name (headers are case insensitive): %s", key);
            Object value = entry.getValue();
            if (value != null) {
                com.google.api.client.util.r rVarB = qVar.b().b(key);
                if (rVarB != null) {
                    key = rVarB.f();
                }
                String str = key;
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    Iterator it = q0.l(value).iterator();
                    while (it.hasNext()) {
                        g(logger, sb2, sb3, e0Var, str, it.next(), writer);
                    }
                } else {
                    g(logger, sb2, sb3, e0Var, str, value, writer);
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    public static void b0(q qVar, StringBuilder sb2, Logger logger, Writer writer) throws IOException {
        a0(qVar, sb2, null, logger, null, writer);
    }

    private static void g(Logger logger, StringBuilder sb2, StringBuilder sb3, e0 e0Var, String str, Object obj, Writer writer) throws IOException {
        if (obj == null || com.google.api.client.util.n.c(obj)) {
            return;
        }
        String strG0 = G0(obj);
        String str2 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : strG0;
        if (sb2 != null) {
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            sb2.append(n0.f116110a);
        }
        if (sb3 != null) {
            sb3.append(" -H '");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(str2);
            sb3.append("'");
        }
        if (e0Var != null) {
            e0Var.a(str, strG0);
        }
        if (writer != null) {
            writer.write(str);
            writer.write(": ");
            writer.write(strG0);
            writer.write("\r\n");
        }
    }

    private <T> List<T> o(T t10) {
        if (t10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t10);
        return arrayList;
    }

    public final String A() {
        return (String) G(this.f115677k);
    }

    public q A0(String str) {
        this.Y = o(str);
        return this;
    }

    public final String B() {
        return (String) G(this.f115678l);
    }

    public q B0(String str) {
        this.Z = o(str);
        return this;
    }

    public final String C() {
        return (String) G(this.f115679m);
    }

    public q C0(String str) {
        this.f115682p0 = o(str);
        return this;
    }

    public final String D() {
        return (String) G(this.f115680n);
    }

    public q D0(String str) {
        this.f115683p1 = o(str);
        return this;
    }

    public final String E() {
        return (String) G(this.f115681o);
    }

    public q E0(String str) {
        this.H1 = o(str);
        return this;
    }

    public String F(String str) {
        Object obj = get(str.toLowerCase(Locale.US));
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if ((obj instanceof Iterable) || cls.isArray()) {
            Iterator it = q0.l(obj).iterator();
            if (it.hasNext()) {
                return G0(it.next());
            }
        }
        return G0(obj);
    }

    public q F0(String str) {
        this.f115684p2 = o(str);
        return this;
    }

    public List<String> H(String str) {
        Object obj = get(str.toLowerCase(Locale.US));
        if (obj == null) {
            return Collections.EMPTY_LIST;
        }
        Class<?> cls = obj.getClass();
        if (!(obj instanceof Iterable) && !cls.isArray()) {
            return Collections.singletonList(G0(obj));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = q0.l(obj).iterator();
        while (it.hasNext()) {
            arrayList.add(G0(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String I() {
        return (String) G(this.f115686t);
    }

    public final String J() {
        return (String) G(this.f115685s);
    }

    public final String K() {
        return (String) G(this.f115687v);
    }

    public final String L() {
        return (String) G(this.X);
    }

    public final String M() {
        return (String) G(this.f115688w);
    }

    public final String O() {
        return (String) G(this.Y);
    }

    public final String P() {
        return (String) G(this.Z);
    }

    public final String Q() {
        return (String) G(this.f115682p0);
    }

    public final String S() {
        return (String) G(this.f115683p1);
    }

    public final String U() {
        return (String) G(this.H1);
    }

    public final String V() {
        return (String) G(this.f115684p2);
    }

    void W(String str, String str2, b bVar) {
        List<Type> list = bVar.f115694d;
        com.google.api.client.util.k kVar = bVar.f115693c;
        com.google.api.client.util.b bVar2 = bVar.f115691a;
        StringBuilder sb2 = bVar.f115692b;
        if (sb2 != null) {
            sb2.append(str + ": " + str2);
            sb2.append(n0.f116110a);
        }
        com.google.api.client.util.r rVarB = kVar.b(str);
        if (rVarB == null) {
            ArrayList arrayList = (ArrayList) get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                p(str, arrayList);
            }
            arrayList.add(str2);
            return;
        }
        Type typeK = com.google.api.client.util.n.k(list, rVarB.e());
        if (q0.j(typeK)) {
            Class<?> clsF = q0.f(list, q0.b(typeK));
            bVar2.b(rVarB.c(), clsF, X(clsF, list, str2));
        } else {
            if (!q0.k(q0.f(list, typeK), Iterable.class)) {
                rVarB.n(this, X(typeK, list, str2));
                return;
            }
            Collection<Object> collectionG = (Collection) rVarB.h(this);
            if (collectionG == null) {
                collectionG = com.google.api.client.util.n.g(typeK);
                rVarB.n(this, collectionG);
            }
            collectionG.add(X(typeK == Object.class ? null : q0.d(typeK), list, str2));
        }
    }

    @Override // com.google.api.client.util.s
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public q p(String str, Object obj) {
        return (q) super.p(str, obj);
    }

    public q d0(String str) {
        this.f115667c = o(str);
        return this;
    }

    public q e0(String str) {
        this.f115668d = o(str);
        return this;
    }

    public q f0(Long l10) {
        this.f115674h3 = o(l10);
        return this;
    }

    public q g0(String str) {
        this.f115672g3 = o(str);
        return this;
    }

    @Override // com.google.api.client.util.s, java.util.AbstractMap
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public q clone() {
        return (q) super.clone();
    }

    public q h0(String str) {
        return i0(o(str));
    }

    public final void i(q qVar) {
        try {
            b bVar = new b(this, null);
            Z(qVar, null, null, null, new a(this, bVar));
            bVar.a();
        } catch (IOException e10) {
            throw p0.a(e10);
        }
    }

    public q i0(List<String> list) {
        this.f115669e = list;
        return this;
    }

    public final void j(f0 f0Var, StringBuilder sb2) throws IOException {
        clear();
        b bVar = new b(this, sb2);
        int iF = f0Var.f();
        for (int i10 = 0; i10 < iF; i10++) {
            W(f0Var.g(i10), f0Var.h(i10), bVar);
        }
        bVar.a();
    }

    public q j0(String str, String str2) {
        return h0("Basic " + com.google.api.client.util.e.d(n0.a(((String) com.google.api.client.util.h0.d(str)) + ":" + ((String) com.google.api.client.util.h0.d(str2)))));
    }

    public final String k() {
        return (String) G(this.f115667c);
    }

    public q k0(String str) {
        this.f115670f = o(str);
        return this;
    }

    public final String l() {
        return (String) G(this.f115668d);
    }

    public q l0(String str) {
        this.f115671g = o(str);
        return this;
    }

    public q m0(Long l10) {
        this.f115673h = o(l10);
        return this;
    }

    public final Long n() {
        return (Long) G(this.f115674h3);
    }

    public q n0(String str) {
        this.f115675i = o(str);
        return this;
    }

    public final String p() {
        return (String) G(this.f115672g3);
    }

    public q p0(String str) {
        this.f115676j = o(str);
        return this;
    }

    public final List<String> q() {
        return this.f115672g3;
    }

    public q q0(String str) {
        this.f115677k = o(str);
        return this;
    }

    public q r0(String str) {
        this.f115678l = o(str);
        return this;
    }

    public final String s() {
        return (String) G(this.f115669e);
    }

    public q s0(String str) {
        this.f115679m = o(str);
        return this;
    }

    public final List<String> t() {
        return this.f115669e;
    }

    public q t0(String str) {
        this.f115680n = o(str);
        return this;
    }

    public final String u() {
        return (String) G(this.f115670f);
    }

    public q u0(String str) {
        this.f115681o = o(str);
        return this;
    }

    public final String v() {
        return (String) G(this.f115671g);
    }

    public q v0(String str) {
        this.f115686t = o(str);
        return this;
    }

    public final Long w() {
        return (Long) G(this.f115673h);
    }

    public q w0(String str) {
        this.f115685s = o(str);
        return this;
    }

    public final String x() {
        return (String) G(this.f115675i);
    }

    public q x0(String str) {
        this.f115687v = o(str);
        return this;
    }

    public q y0(String str) {
        this.X = o(str);
        return this;
    }

    public final String z() {
        return (String) G(this.f115676j);
    }

    public q z0(String str) {
        this.f115688w = o(str);
        return this;
    }
}

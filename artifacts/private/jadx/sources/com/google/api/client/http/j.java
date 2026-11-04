package com.google.api.client.http;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class j extends com.google.api.client.util.s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.api.client.util.escape.b f115631i = new com.google.api.client.util.escape.c("=&-_.!~*'()@:$,;/?:", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f115632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f115633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f115634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f115635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f115636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f115637h;

    public j() {
        this.f115635f = -1;
    }

    private static URL A(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static List<String> J(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int iIndexOf = str.indexOf(47, i10);
            boolean z11 = iIndexOf != -1;
            arrayList.add(com.google.api.client.util.escape.a.a(z11 ? str.substring(i10, iIndexOf) : str.substring(i10)));
            i10 = iIndexOf + 1;
            z10 = z11;
        }
        return arrayList;
    }

    private static URI L(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static void g(Set<Map.Entry<String, Object>> set, StringBuilder sb2) {
        boolean zH = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String strE = com.google.api.client.util.escape.a.e(entry.getKey());
                if (value instanceof Collection) {
                    Iterator it = ((Collection) value).iterator();
                    while (it.hasNext()) {
                        zH = h(zH, sb2, strE, it.next());
                    }
                } else {
                    zH = h(zH, sb2, strE, value);
                }
            }
        }
    }

    private static boolean h(boolean z10, StringBuilder sb2, String str, Object obj) {
        if (z10) {
            sb2.append('?');
            z10 = false;
        } else {
            sb2.append(kotlin.text.b0.f313279d);
        }
        sb2.append(str);
        String strE = com.google.api.client.util.escape.a.e(obj.toString());
        if (strE.length() != 0) {
            sb2.append('=');
            sb2.append(strE);
        }
        return z10;
    }

    private void j(StringBuilder sb2) {
        int size = this.f115636g.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = this.f115636g.get(i10);
            if (i10 != 0) {
                sb2.append('/');
            }
            if (str.length() != 0) {
                sb2.append(com.google.api.client.util.escape.a.c(str));
            }
        }
    }

    @Override // com.google.api.client.util.s
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public j e(String str, Object obj) {
        return (j) super.e(str, obj);
    }

    public final void C(String str) {
        this.f115637h = str;
    }

    public final void D(String str) {
        this.f115633d = (String) com.google.api.client.util.h0.d(str);
    }

    public void E(List<String> list) {
        this.f115636g = list;
    }

    public final void F(int i10) {
        com.google.api.client.util.h0.b(i10 >= -1, "expected port >= -1");
        this.f115635f = i10;
    }

    public void G(String str) {
        this.f115636g = J(str);
    }

    public final void H(String str) {
        this.f115632c = (String) com.google.api.client.util.h0.d(str);
    }

    public final void I(String str) {
        this.f115634e = str;
    }

    public final URI K() {
        return L(k());
    }

    public final URL M() {
        return A(k());
    }

    public final URL O(String str) {
        try {
            return new URL(M(), str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof j)) {
            return k().equals(((j) obj).k());
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return k().hashCode();
    }

    public void i(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        List<String> listJ = J(str);
        List<String> list = this.f115636g;
        if (list != null && !list.isEmpty()) {
            int size = this.f115636g.size();
            int i10 = size - 1;
            this.f115636g.set(i10, this.f115636g.get(i10) + listJ.get(0));
            this.f115636g.addAll(listJ.subList(1, listJ.size()));
            return;
        }
        this.f115636g = listJ;
    }

    public final String k() {
        return l() + n();
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) com.google.api.client.util.h0.d(this.f115632c));
        sb2.append("://");
        String str = this.f115634e;
        if (str != null) {
            sb2.append(com.google.api.client.util.escape.a.f(str));
            sb2.append('@');
        }
        sb2.append((String) com.google.api.client.util.h0.d(this.f115633d));
        int i10 = this.f115635f;
        if (i10 != -1) {
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(i10);
        }
        return sb2.toString();
    }

    public final String n() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f115636g != null) {
            j(sb2);
        }
        g(entrySet(), sb2);
        String str = this.f115637h;
        if (str != null) {
            sb2.append('#');
            sb2.append(f115631i.a(str));
        }
        return sb2.toString();
    }

    @Override // com.google.api.client.util.s, java.util.AbstractMap
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        if (this.f115636g != null) {
            jVar.f115636g = new ArrayList(this.f115636g);
        }
        return jVar;
    }

    public Collection<Object> p(String str) {
        Object obj = get(str);
        if (obj == null) {
            return Collections.EMPTY_SET;
        }
        return obj instanceof Collection ? Collections.unmodifiableCollection((Collection) obj) : Collections.singleton(obj);
    }

    public Object q(String str) {
        Object obj = get(str);
        if (!(obj instanceof Collection)) {
            return obj;
        }
        Iterator it = ((Collection) obj).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public String s() {
        return this.f115637h;
    }

    public String t() {
        return this.f115633d;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return k();
    }

    public List<String> u() {
        return this.f115636g;
    }

    public int v() {
        return this.f115635f;
    }

    public String w() {
        if (this.f115636g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        j(sb2);
        return sb2.toString();
    }

    public final String x() {
        return this.f115632c;
    }

    public final String z() {
        return this.f115634e;
    }

    public j(String str) {
        this(A(str));
    }

    public j(URI uri) {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo());
    }

    public j(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    private j(String str, String str2, int i10, String str3, String str4, String str5, String str6) {
        this.f115635f = -1;
        this.f115632c = str.toLowerCase(Locale.US);
        this.f115633d = str2;
        this.f115635f = i10;
        this.f115636g = J(str3);
        this.f115637h = str4 != null ? com.google.api.client.util.escape.a.a(str4) : null;
        if (str5 != null) {
            j0.f(str5, this);
        }
        this.f115634e = str6 != null ? com.google.api.client.util.escape.a.a(str6) : null;
    }
}

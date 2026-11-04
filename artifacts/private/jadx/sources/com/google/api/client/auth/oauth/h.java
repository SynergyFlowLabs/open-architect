package com.google.api.client.auth.oauth;

import com.google.api.client.http.p;
import com.google.api.client.http.u;
import com.google.api.client.http.w;
import com.superwall.sdk.network.Api;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class h implements p, w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final SecureRandom f115142l = new SecureRandom();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.google.api.client.util.escape.c f115143m = new com.google.api.client.util.escape.c("-_.~", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f115144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f115145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f115146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f115147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f115148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f115149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f115150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f115151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f115152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f115153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f115154k;

    private void c(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(g(str));
            sb2.append("=\"");
            sb2.append(g(str2));
            sb2.append("\",");
        }
    }

    public static String g(String str) {
        return f115143m.a(str);
    }

    private void i(TreeMap<String, String> treeMap, String str, Object obj) {
        treeMap.put(g(str), obj == null ? null : g(obj.toString()));
    }

    private void j(TreeMap<String, String> treeMap, String str, String str2) {
        if (str2 != null) {
            i(treeMap, str, str2);
        }
    }

    @Override // com.google.api.client.http.p
    public void a(u uVar) throws IOException {
        d();
        f();
        try {
            e(uVar.p(), uVar.y());
            uVar.j().h0(h());
        } catch (GeneralSecurityException e10) {
            IOException iOException = new IOException();
            iOException.initCause(e10);
            throw iOException;
        }
    }

    @Override // com.google.api.client.http.w
    public void b(u uVar) throws IOException {
        uVar.L(this);
    }

    public void d() {
        this.f115147d = Long.toHexString(Math.abs(f115142l.nextLong()));
    }

    public void e(String str, com.google.api.client.http.j jVar) throws GeneralSecurityException {
        j jVar2 = this.f115144a;
        String strA = jVar2.a();
        this.f115150g = strA;
        TreeMap<String, String> treeMap = new TreeMap<>();
        j(treeMap, hi.c.C1916c.f285815d, this.f115145b);
        j(treeMap, hi.c.C1916c.f285816e, this.f115146c);
        j(treeMap, hi.c.C1916c.f285817f, this.f115147d);
        j(treeMap, hi.c.C1916c.f285821j, strA);
        j(treeMap, hi.c.C1916c.f285822k, this.f115151h);
        j(treeMap, hi.c.C1916c.f285818g, this.f115152i);
        j(treeMap, hi.c.C1916c.f285820i, this.f115153j);
        j(treeMap, hi.c.C1916c.f285823l, this.f115154k);
        for (Map.Entry<String, Object> entry : jVar.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value instanceof Collection) {
                    Iterator it = ((Collection) value).iterator();
                    while (it.hasNext()) {
                        i(treeMap, key, it.next());
                    }
                } else {
                    i(treeMap, key, value);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry2 : treeMap.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(b0.f313279d);
            }
            sb2.append(entry2.getKey());
            String value2 = entry2.getValue();
            if (value2 != null) {
                sb2.append('=');
                sb2.append(value2);
            }
        }
        String string = sb2.toString();
        com.google.api.client.http.j jVar3 = new com.google.api.client.http.j();
        String strX = jVar.x();
        jVar3.H(strX);
        jVar3.D(jVar.t());
        jVar3.E(jVar.u());
        int iV = jVar.v();
        if (("http".equals(strX) && iV == 80) || (Api.scheme.equals(strX) && iV == 443)) {
            iV = -1;
        }
        jVar3.F(iV);
        this.f115149f = jVar2.b(g(str) + b0.f313279d + g(jVar3.k()) + b0.f313279d + g(string));
    }

    public void f() {
        this.f115151h = Long.toString(System.currentTimeMillis() / 1000);
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder(hi.a.f285800e);
        c(sb2, hi.c.C1916c.f285813b, this.f115148e);
        c(sb2, hi.c.C1916c.f285815d, this.f115145b);
        c(sb2, hi.c.C1916c.f285816e, this.f115146c);
        c(sb2, hi.c.C1916c.f285817f, this.f115147d);
        c(sb2, hi.c.C1916c.f285824m, this.f115149f);
        c(sb2, hi.c.C1916c.f285821j, this.f115150g);
        c(sb2, hi.c.C1916c.f285822k, this.f115151h);
        c(sb2, hi.c.C1916c.f285818g, this.f115152i);
        c(sb2, hi.c.C1916c.f285820i, this.f115153j);
        c(sb2, hi.c.C1916c.f285823l, this.f115154k);
        return sb2.substring(0, sb2.length() - 1);
    }
}

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.x;
import com.google.api.client.http.y;
import com.google.api.client.util.h0;
import com.google.api.client.util.n0;
import com.google.api.client.util.o0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class u extends y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f115253g = 4020689092957439244L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient r f115254f;

    u(y.a aVar, r rVar) {
        super(aVar);
        this.f115254f = rVar;
    }

    public static u g(com.google.api.client.json.d dVar, x xVar) throws IOException {
        r rVar;
        String strT;
        y.a aVar = new y.a(xVar.k(), xVar.l(), xVar.h());
        h0.d(dVar);
        String strG = xVar.g();
        String str = null;
        r rVar2 = null;
        try {
            if (xVar.q() || strG == null || xVar.c() == null || !com.google.api.client.http.s.d(com.google.api.client.json.c.f115763a, strG)) {
                strT = xVar.t();
            } else {
                rVar = (r) new com.google.api.client.json.f(dVar).a(xVar.c(), xVar.d(), r.class);
                try {
                    rVar2 = rVar;
                    strT = rVar.k();
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                }
            }
            r rVar3 = rVar2;
            str = strT;
            rVar = rVar3;
        } catch (IOException e11) {
            e = e11;
            rVar = null;
        }
        StringBuilder sbA = y.a(xVar);
        if (!o0.a(str)) {
            sbA.append(n0.f116110a);
            sbA.append(str);
            aVar.g(str);
        }
        aVar.i(sbA.toString());
        return new u(aVar, rVar);
    }

    public final r h() {
        return this.f115254f;
    }
}

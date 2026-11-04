package com.google.api.client.googleapis.testing.json;

import com.google.api.client.http.u;
import com.google.api.client.json.d;
import com.google.api.client.testing.http.g;
import com.google.api.client.util.f;
import java.io.IOException;
import o7.c;

/* JADX INFO: loaded from: classes4.dex */
@f
public final class a {
    public static c a(d dVar, int i10, String str) throws IOException {
        u uVarB = new com.google.api.client.testing.http.d.a().f(new g().y(i10).x(str)).a().c().b(com.google.api.client.testing.http.b.f115978b);
        uVarB.W(false);
        return c.h(dVar, uVarB.a());
    }
}

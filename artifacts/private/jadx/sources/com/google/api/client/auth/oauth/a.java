package com.google.api.client.auth.oauth;

import com.google.api.client.http.b0;
import com.google.api.client.http.j0;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public abstract class a extends com.google.api.client.http.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f115127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f115128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f115129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f115130m;

    protected a(String str) {
        super(str);
    }

    public h P() {
        h hVar = new h();
        hVar.f115146c = this.f115128k;
        hVar.f115144a = this.f115129l;
        return hVar;
    }

    public final d Q() throws IOException {
        u uVarG = this.f115127j.c().g(this.f115130m ? "POST" : "GET", this, null);
        P().a(uVarG);
        x xVarA = uVarG.a();
        xVarA.u(0);
        d dVar = new d();
        j0.f(xVarA.t(), dVar);
        return dVar;
    }
}

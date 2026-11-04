package com.google.api.client.googleapis;

import com.google.api.client.http.f;
import com.google.api.client.http.i0;
import com.google.api.client.http.p;
import com.google.api.client.http.u;
import com.google.api.client.http.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f115371b = "X-HTTP-Method-Override";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f115372c = 2048;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f115373a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f115374a;

        public b a() {
            return new b(this.f115374a);
        }

        public boolean b() {
            return this.f115374a;
        }

        public a c(boolean z10) {
            this.f115374a = z10;
            return this;
        }
    }

    public b() {
        this(false);
    }

    private boolean c(u uVar) throws IOException {
        String strP = uVar.p();
        if (strP.equals("POST")) {
            return false;
        }
        if (!strP.equals("GET") ? this.f115373a : uVar.y().k().length() > 2048) {
            return !uVar.w().f(strP);
        }
        return true;
    }

    @Override // com.google.api.client.http.p
    public void a(u uVar) throws IOException {
        if (c(uVar)) {
            String strP = uVar.p();
            uVar.Q("POST");
            uVar.j().p(f115371b, strP);
            if (strP.equals("GET")) {
                uVar.E(new i0(uVar.y().clone()));
                uVar.y().clear();
            } else if (uVar.f() == null) {
                uVar.E(new f());
            }
        }
    }

    @Override // com.google.api.client.http.w
    public void b(u uVar) {
        uVar.L(this);
    }

    b(boolean z10) {
        this.f115373a = z10;
    }
}

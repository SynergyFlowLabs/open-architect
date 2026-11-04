package com.google.api.client.googleapis.auth.clientlogin;

import androidx.core.app.w;
import com.google.api.client.http.b0;
import com.google.api.client.http.i0;
import com.google.api.client.http.j;
import com.google.api.client.http.p;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import com.google.api.client.http.y;
import com.google.api.client.util.f;
import com.google.api.client.util.n0;
import com.google.api.client.util.o0;
import com.google.api.client.util.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@f
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f115277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f115278b = new j("https://www.google.com");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v("source")
    public String f115279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v(w.Q0)
    public String f115280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v("Email")
    public String f115281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v("Passwd")
    public String f115282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @v
    public String f115283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @v("logintoken")
    public String f115284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @v("logincaptcha")
    public String f115285i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @v("Error")
        public String f115286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @v("Url")
        public String f115287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @v("CaptchaToken")
        public String f115288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @v("CaptchaUrl")
        public String f115289d;
    }

    /* JADX INFO: renamed from: com.google.api.client.googleapis.auth.clientlogin.b$b, reason: collision with other inner class name */
    public static final class C1012b implements p, com.google.api.client.http.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @v("Auth")
        public String f115290a;

        @Override // com.google.api.client.http.p
        public void a(u uVar) {
            uVar.j().h0(c());
        }

        @Override // com.google.api.client.http.w
        public void b(u uVar) {
            uVar.L(this);
        }

        public String c() {
            return b.b(this.f115290a);
        }
    }

    public static String b(String str) {
        return "GoogleLogin auth=" + str;
    }

    public C1012b a() throws IOException {
        j jVarClone = this.f115278b.clone();
        jVarClone.i("/accounts/ClientLogin");
        u uVarE = this.f115277a.c().e(jVarClone, new i0(this));
        uVarE.O(com.google.api.client.googleapis.auth.clientlogin.a.f115276a);
        uVarE.F(0);
        uVarE.W(false);
        x xVarA = uVarE.a();
        if (xVarA.q()) {
            return (C1012b) xVarA.r(C1012b.class);
        }
        y.a aVar = new y.a(xVarA.k(), xVarA.l(), xVarA.h());
        a aVar2 = (a) xVarA.r(a.class);
        String string = aVar2.toString();
        StringBuilder sbA = y.a(xVarA);
        if (!o0.a(string)) {
            sbA.append(n0.f116110a);
            sbA.append(string);
            aVar.g(string);
        }
        aVar.i(sbA.toString());
        throw new c(aVar, aVar2);
    }
}

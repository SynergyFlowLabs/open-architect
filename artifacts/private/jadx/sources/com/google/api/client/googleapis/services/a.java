package com.google.api.client.googleapis.services;

import com.google.api.client.http.b0;
import com.google.api.client.http.j;
import com.google.api.client.http.v;
import com.google.api.client.http.w;
import com.google.api.client.util.e0;
import com.google.api.client.util.h0;
import com.google.api.client.util.o0;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Logger f115484j = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f115485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f115486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f115487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f115488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f115489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f115490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f115491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f115492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f115493i;

    /* JADX INFO: renamed from: com.google.api.client.googleapis.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1018a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b0 f115494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f115495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        w f115496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e0 f115497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f115498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f115499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f115500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f115501h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f115502i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f115503j;

        protected AbstractC1018a(b0 b0Var, String str, String str2, e0 e0Var, w wVar) {
            this.f115494a = (b0) h0.d(b0Var);
            this.f115497d = e0Var;
            o(str);
            p(str2);
            this.f115496c = wVar;
        }

        public abstract a a();

        public final String b() {
            return this.f115501h;
        }

        public final d c() {
            return this.f115495b;
        }

        public final w d() {
            return this.f115496c;
        }

        public e0 e() {
            return this.f115497d;
        }

        public final String f() {
            return this.f115498e;
        }

        public final String g() {
            return this.f115499f;
        }

        public final boolean h() {
            return this.f115502i;
        }

        public final boolean i() {
            return this.f115503j;
        }

        public final b0 j() {
            return this.f115494a;
        }

        public AbstractC1018a k(String str) {
            this.f115501h = str;
            return this;
        }

        public AbstractC1018a l(String str) {
            this.f115500g = str;
            return this;
        }

        public AbstractC1018a m(d dVar) {
            this.f115495b = dVar;
            return this;
        }

        public AbstractC1018a n(w wVar) {
            this.f115496c = wVar;
            return this;
        }

        public AbstractC1018a o(String str) {
            this.f115498e = a.m(str);
            return this;
        }

        public AbstractC1018a p(String str) {
            this.f115499f = a.n(str);
            return this;
        }

        public AbstractC1018a q(boolean z10) {
            return r(true).s(true);
        }

        public AbstractC1018a r(boolean z10) {
            this.f115502i = z10;
            return this;
        }

        public AbstractC1018a s(boolean z10) {
            this.f115503j = z10;
            return this;
        }
    }

    protected a(AbstractC1018a abstractC1018a) {
        this.f115486b = abstractC1018a.f115495b;
        this.f115487c = m(abstractC1018a.f115498e);
        this.f115488d = n(abstractC1018a.f115499f);
        this.f115489e = abstractC1018a.f115500g;
        if (o0.a(abstractC1018a.f115501h)) {
            f115484j.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f115490f = abstractC1018a.f115501h;
        w wVar = abstractC1018a.f115496c;
        this.f115485a = wVar == null ? abstractC1018a.f115494a.c() : abstractC1018a.f115494a.d(wVar);
        this.f115491g = abstractC1018a.f115497d;
        this.f115492h = abstractC1018a.f115502i;
        this.f115493i = abstractC1018a.f115503j;
    }

    static String m(String str) {
        h0.e(str, "root URL cannot be null.");
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    static String n(String str) {
        h0.e(str, "service path cannot be null");
        if (str.length() == 1) {
            h0.b("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        }
        if (str.length() > 0) {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
        }
        return str;
    }

    public final com.google.api.client.googleapis.batch.b a() {
        return b(null);
    }

    public final com.google.api.client.googleapis.batch.b b(w wVar) {
        com.google.api.client.googleapis.batch.b bVar = new com.google.api.client.googleapis.batch.b(g().i(), wVar);
        if (o0.a(this.f115489e)) {
            bVar.e(new j(h() + "batch"));
            return bVar;
        }
        bVar.e(new j(h() + this.f115489e));
        return bVar;
    }

    public final String c() {
        return this.f115490f;
    }

    public final String d() {
        return this.f115487c + this.f115488d;
    }

    public final d e() {
        return this.f115486b;
    }

    public e0 f() {
        return this.f115491g;
    }

    public final v g() {
        return this.f115485a;
    }

    public final String h() {
        return this.f115487c;
    }

    public final String i() {
        return this.f115488d;
    }

    public final boolean j() {
        return this.f115492h;
    }

    public final boolean k() {
        return this.f115493i;
    }

    protected void l(b<?> bVar) throws IOException {
        if (e() != null) {
            e().a(bVar);
        }
    }
}

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.q;
import com.google.api.client.http.x;
import com.google.api.client.util.h0;
import com.google.api.client.util.i0;
import com.google.api.client.util.n0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f115351h = 300000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f115352i = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.api.client.json.d f115353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PublicKey> f115354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f115355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f115356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lock f115357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.api.client.util.l f115358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f115359g;

    @com.google.api.client.util.f
    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b0 f115361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.api.client.json.d f115362c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.google.api.client.util.l f115360a = com.google.api.client.util.l.f116096a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f115363d = k.f115349c;

        public a(b0 b0Var, com.google.api.client.json.d dVar) {
            this.f115361b = (b0) h0.d(b0Var);
            this.f115362c = (com.google.api.client.json.d) h0.d(dVar);
        }

        public l a() {
            return new l(this);
        }

        public final com.google.api.client.util.l b() {
            return this.f115360a;
        }

        public final com.google.api.client.json.d c() {
            return this.f115362c;
        }

        public final String d() {
            return this.f115363d;
        }

        public final b0 e() {
            return this.f115361b;
        }

        public a f(com.google.api.client.util.l lVar) {
            this.f115360a = (com.google.api.client.util.l) h0.d(lVar);
            return this;
        }

        public a g(String str) {
            this.f115363d = (String) h0.d(str);
            return this;
        }
    }

    public l(b0 b0Var, com.google.api.client.json.d dVar) {
        this(new a(b0Var, dVar));
    }

    long a(q qVar) {
        long jLongValue;
        if (qVar.u() == null) {
            jLongValue = 0;
            break;
        }
        String[] strArrSplit = qVar.u().split(",");
        int length = strArrSplit.length;
        int i10 = 0;
        int i11 = 3 >> 0;
        while (true) {
            if (i10 >= length) {
                jLongValue = 0;
                break;
            }
            Matcher matcher = f115352i.matcher(strArrSplit[i10]);
            if (matcher.matches()) {
                jLongValue = Long.parseLong(matcher.group(1));
                break;
            }
            i10++;
        }
        if (qVar.n() != null) {
            jLongValue -= qVar.n().longValue();
        }
        return Math.max(0L, jLongValue);
    }

    public final com.google.api.client.util.l b() {
        return this.f115358f;
    }

    public final long c() {
        return this.f115355c;
    }

    public final com.google.api.client.json.d d() {
        return this.f115353a;
    }

    public final String e() {
        return this.f115359g;
    }

    public final List<PublicKey> f() throws GeneralSecurityException, IOException {
        this.f115357e.lock();
        try {
            if (this.f115354b == null || this.f115358f.currentTimeMillis() + 300000 > this.f115355c) {
                h();
            }
            List<PublicKey> list = this.f115354b;
            this.f115357e.unlock();
            return list;
        } catch (Throwable th2) {
            this.f115357e.unlock();
            throw th2;
        }
    }

    public final b0 g() {
        return this.f115356d;
    }

    public l h() throws GeneralSecurityException, IOException {
        this.f115357e.lock();
        try {
            this.f115354b = new ArrayList();
            CertificateFactory certificateFactoryH = i0.h();
            x xVarA = this.f115356d.c().b(new com.google.api.client.http.j(this.f115359g)).a();
            this.f115355c = this.f115358f.currentTimeMillis() + (a(xVarA.h()) * 1000);
            com.google.api.client.json.g gVarD = this.f115353a.d(xVarA.c());
            com.google.api.client.json.j jVarF = gVarD.f();
            if (jVarF == null) {
                jVarF = gVarD.o();
            }
            h0.a(jVarF == com.google.api.client.json.j.START_OBJECT);
            while (gVarD.o() != com.google.api.client.json.j.END_OBJECT) {
                try {
                    gVarD.o();
                    this.f115354b.add(((X509Certificate) certificateFactoryH.generateCertificate(new ByteArrayInputStream(n0.a(gVarD.n())))).getPublicKey());
                } catch (Throwable th2) {
                    gVarD.a();
                    throw th2;
                }
            }
            this.f115354b = Collections.unmodifiableList(this.f115354b);
            gVarD.a();
            this.f115357e.unlock();
            return this;
        } catch (Throwable th3) {
            this.f115357e.unlock();
            throw th3;
        }
    }

    protected l(a aVar) {
        this.f115357e = new ReentrantLock();
        this.f115356d = aVar.f115361b;
        this.f115353a = aVar.f115362c;
        this.f115358f = aVar.f115360a;
        this.f115359g = aVar.f115363d;
    }
}

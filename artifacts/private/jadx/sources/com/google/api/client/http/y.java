package com.google.api.client.http;

import com.google.api.client.util.n0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class y extends IOException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f115752e = -1875819453475890043L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f115753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient q f115755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f115756d;

    public y(x xVar) {
        this(new a(xVar));
    }

    public static StringBuilder a(x xVar) {
        StringBuilder sb2 = new StringBuilder();
        int iK = xVar.k();
        if (iK != 0) {
            sb2.append(iK);
        }
        String strL = xVar.l();
        if (strL != null) {
            if (iK != 0) {
                sb2.append(' ');
            }
            sb2.append(strL);
        }
        return sb2;
    }

    public final String b() {
        return this.f115756d;
    }

    public q c() {
        return this.f115755c;
    }

    public final int d() {
        return this.f115753a;
    }

    public final String e() {
        return this.f115754b;
    }

    public final boolean f() {
        return a0.b(this.f115753a);
    }

    protected y(a aVar) {
        super(aVar.f115761e);
        this.f115753a = aVar.f115757a;
        this.f115754b = aVar.f115758b;
        this.f115755c = aVar.f115759c;
        this.f115756d = aVar.f115760d;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f115757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f115758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        q f115759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f115760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f115761e;

        public a(int i10, String str, q qVar) {
            j(i10);
            k(str);
            h(qVar);
        }

        public y a() {
            return new y(this);
        }

        public final String b() {
            return this.f115760d;
        }

        public q c() {
            return this.f115759c;
        }

        public final String d() {
            return this.f115761e;
        }

        public final int e() {
            return this.f115757a;
        }

        public final String f() {
            return this.f115758b;
        }

        public a g(String str) {
            this.f115760d = str;
            return this;
        }

        public a h(q qVar) {
            this.f115759c = (q) com.google.api.client.util.h0.d(qVar);
            return this;
        }

        public a i(String str) {
            this.f115761e = str;
            return this;
        }

        public a j(int i10) {
            com.google.api.client.util.h0.a(i10 >= 0);
            this.f115757a = i10;
            return this;
        }

        public a k(String str) {
            this.f115758b = str;
            return this;
        }

        public a(x xVar) {
            this(xVar.k(), xVar.l(), xVar.h());
            try {
                String strT = xVar.t();
                this.f115760d = strT;
                if (strT.length() == 0) {
                    this.f115760d = null;
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            StringBuilder sbA = y.a(xVar);
            if (this.f115760d != null) {
                sbA.append(n0.f116110a);
                sbA.append(this.f115760d);
            }
            this.f115761e = sbA.toString();
        }
    }
}

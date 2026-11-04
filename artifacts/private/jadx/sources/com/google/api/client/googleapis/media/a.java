package com.google.api.client.googleapis.media;

import com.google.api.client.http.b0;
import com.google.api.client.http.j;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import com.google.api.client.http.v;
import com.google.api.client.http.w;
import com.google.api.client.http.x;
import com.google.api.client.util.h0;
import com.google.api.client.util.t;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f115410j = 33554432;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f115411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f115412b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f115414d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f115416f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f115418h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f115413c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f115415e = f115410j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumC1017a f115417g = EnumC1017a.NOT_STARTED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f115419i = -1;

    /* JADX INFO: renamed from: com.google.api.client.googleapis.media.a$a, reason: collision with other inner class name */
    public enum EnumC1017a {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public a(b0 b0Var, w wVar) {
        this.f115412b = (b0) h0.d(b0Var);
        this.f115411a = wVar == null ? b0Var.c() : b0Var.d(wVar);
    }

    private x c(long j10, j jVar, q qVar, OutputStream outputStream) throws IOException {
        u uVarB = this.f115411a.b(jVar);
        if (qVar != null) {
            uVarB.j().putAll(qVar);
        }
        if (this.f115418h != 0 || j10 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(this.f115418h);
            sb2.append("-");
            if (j10 != -1) {
                sb2.append(j10);
            }
            uVarB.j().D0(sb2.toString());
        }
        x xVarA = uVarB.a();
        try {
            t.b(xVarA.c(), outputStream);
            return xVarA;
        } finally {
            xVarA.a();
        }
    }

    private long g(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    private void r(String str) {
        if (str != null && this.f115416f == 0) {
            this.f115416f = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    private void t(EnumC1017a enumC1017a) throws IOException {
        this.f115417g = enumC1017a;
        b bVar = this.f115414d;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void a(j jVar, q qVar, OutputStream outputStream) throws IOException {
        h0.a(this.f115417g == EnumC1017a.NOT_STARTED);
        jVar.put("alt", "media");
        if (this.f115413c) {
            t(EnumC1017a.MEDIA_IN_PROGRESS);
            long jLongValue = c(this.f115419i, jVar, qVar, outputStream).h().w().longValue();
            this.f115416f = jLongValue;
            this.f115418h = jLongValue;
            t(EnumC1017a.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long jMin = (this.f115418h + ((long) this.f115415e)) - 1;
            long j10 = this.f115419i;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            String strZ = c(jMin, jVar, qVar, outputStream).h().z();
            long jG = g(strZ);
            r(strZ);
            long j11 = this.f115416f;
            if (j11 <= jG) {
                this.f115418h = j11;
                t(EnumC1017a.MEDIA_COMPLETE);
                return;
            } else {
                this.f115418h = jG;
                t(EnumC1017a.MEDIA_IN_PROGRESS);
            }
        }
    }

    public void b(j jVar, OutputStream outputStream) throws IOException {
        a(jVar, null, outputStream);
    }

    public int d() {
        return this.f115415e;
    }

    public EnumC1017a e() {
        return this.f115417g;
    }

    public long f() {
        return this.f115419i;
    }

    public long h() {
        return this.f115418h;
    }

    public double i() {
        long j10 = this.f115416f;
        if (j10 == 0) {
            return 0.0d;
        }
        return this.f115418h / j10;
    }

    public b j() {
        return this.f115414d;
    }

    public b0 k() {
        return this.f115412b;
    }

    public boolean l() {
        return this.f115413c;
    }

    public a m(long j10) {
        h0.a(j10 >= 0);
        this.f115418h = j10;
        return this;
    }

    public a n(int i10) {
        h0.a(i10 > 0 && i10 <= 33554432);
        this.f115415e = i10;
        return this;
    }

    @Deprecated
    public a o(long j10, int i10) {
        return p(j10, i10);
    }

    public a p(long j10, long j11) {
        h0.a(j11 >= j10);
        m(j10);
        this.f115419i = j11;
        return this;
    }

    public a q(boolean z10) {
        this.f115413c = z10;
        return this;
    }

    public a s(b bVar) {
        this.f115414d = bVar;
        return this;
    }
}

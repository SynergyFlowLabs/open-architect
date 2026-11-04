package com.google.api.client.http;

import com.google.api.client.util.n0;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f115741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f115743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f115744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    f0 f115745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f115746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f115747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f115748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f115749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f115750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f115751k;

    x(u uVar, f0 f0Var) throws IOException {
        StringBuilder sb2;
        this.f115748h = uVar;
        this.f115749i = uVar.g();
        this.f115750j = uVar.B();
        this.f115745e = f0Var;
        this.f115742b = f0Var.c();
        int iJ = f0Var.j();
        boolean z10 = false;
        iJ = iJ < 0 ? 0 : iJ;
        this.f115746f = iJ;
        String strI = f0Var.i();
        this.f115747g = strI;
        Logger logger = b0.f115584a;
        if (this.f115750j && logger.isLoggable(Level.CONFIG)) {
            z10 = true;
        }
        if (z10) {
            sb2 = new StringBuilder();
            sb2.append("-------------- RESPONSE --------------");
            String str = n0.f116110a;
            sb2.append(str);
            String strK = f0Var.k();
            if (strK != null) {
                sb2.append(strK);
            } else {
                sb2.append(iJ);
                if (strI != null) {
                    sb2.append(' ');
                    sb2.append(strI);
                }
            }
            sb2.append(str);
        } else {
            sb2 = null;
        }
        uVar.q().j(f0Var, z10 ? sb2 : null);
        String strE = f0Var.e();
        strE = strE == null ? uVar.q().A() : strE;
        this.f115743c = strE;
        this.f115744d = strE != null ? new s(strE) : null;
        if (z10) {
            logger.config(sb2.toString());
        }
    }

    private boolean n() throws IOException {
        int iK = k();
        if (!j().p().equals("HEAD") && iK / 100 != 1 && iK != 204 && iK != 304) {
            return true;
        }
        o();
        return false;
    }

    public void a() throws IOException {
        o();
        this.f115745e.a();
    }

    public void b(OutputStream outputStream) throws IOException {
        com.google.api.client.util.t.b(c(), outputStream);
    }

    public InputStream c() throws IOException {
        if (!this.f115751k) {
            InputStream inputStreamB = this.f115745e.b();
            if (inputStreamB != null) {
                try {
                    String str = this.f115742b;
                    if (str != null && str.contains("gzip")) {
                        inputStreamB = new GZIPInputStream(inputStreamB);
                    }
                    Logger logger = b0.f115584a;
                    if (this.f115750j) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            inputStreamB = new com.google.api.client.util.y(inputStreamB, logger, level, this.f115749i);
                        }
                    }
                    this.f115741a = inputStreamB;
                } catch (EOFException unused) {
                    inputStreamB.close();
                } catch (Throwable th2) {
                    inputStreamB.close();
                    throw th2;
                }
            }
            this.f115751k = true;
        }
        return this.f115741a;
    }

    public Charset d() {
        s sVar = this.f115744d;
        if (sVar != null && sVar.f() != null) {
            return this.f115744d.f();
        }
        return com.google.api.client.util.j.f116087b;
    }

    public String e() {
        return this.f115742b;
    }

    public int f() {
        return this.f115749i;
    }

    public String g() {
        return this.f115743c;
    }

    public q h() {
        return this.f115748h.q();
    }

    public s i() {
        return this.f115744d;
    }

    public u j() {
        return this.f115748h;
    }

    public int k() {
        return this.f115746f;
    }

    public String l() {
        return this.f115747g;
    }

    public b0 m() {
        return this.f115748h.w();
    }

    public void o() throws IOException {
        InputStream inputStreamC = c();
        if (inputStreamC != null) {
            inputStreamC.close();
        }
    }

    public boolean p() {
        return this.f115750j;
    }

    public boolean q() {
        return a0.b(this.f115746f);
    }

    public <T> T r(Class<T> cls) throws IOException {
        if (n()) {
            return (T) this.f115748h.n().a(c(), d(), cls);
        }
        return null;
    }

    public Object s(Type type) throws IOException {
        if (n()) {
            return this.f115748h.n().d(c(), d(), type);
        }
        return null;
    }

    public String t() throws IOException {
        InputStream inputStreamC = c();
        if (inputStreamC == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.api.client.util.t.b(inputStreamC, byteArrayOutputStream);
        return byteArrayOutputStream.toString(d().name());
    }

    public x u(int i10) {
        com.google.api.client.util.h0.b(i10 >= 0, "The content logging limit must be non-negative.");
        this.f115749i = i10;
        return this;
    }

    public x v(boolean z10) {
        this.f115750j = z10;
        return this;
    }
}

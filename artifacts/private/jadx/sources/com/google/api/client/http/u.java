package com.google.api.client.http;

import com.google.api.client.util.k0;
import com.google.api.client.util.m0;
import com.google.api.client.util.n0;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static final int A = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f115712y = "1.25.0";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f115713z = "Google-HTTP-Java-Client/1.25.0 (gzip)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f115714a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f115721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b0 f115722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f115723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j f115724k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c0 f115727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.google.api.client.util.f
    private r f115728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z f115729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.api.client.util.e0 f115730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private n f115731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @com.google.api.client.util.f
    @Deprecated
    private c f115732s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f115736w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f115715b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f115716c = new q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f115717d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f115718e = 16384;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f115719f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f115720g = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f115725l = androidx.core.view.accessibility.j.f48528u0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f115726m = androidx.core.view.accessibility.j.f48528u0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f115733t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f115734u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @com.google.api.client.util.f
    @Deprecated
    private boolean f115735v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private k0 f115737x = k0.f116095a;

    class a implements Callable<x> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x call() throws Exception {
            return u.this.a();
        }
    }

    u(b0 b0Var, String str) {
        this.f115722i = b0Var;
        Q(str);
    }

    public boolean A() {
        return this.f115720g;
    }

    public boolean B() {
        return this.f115719f;
    }

    @com.google.api.client.util.f
    @Deprecated
    public u C(c cVar) {
        this.f115732s = cVar;
        return this;
    }

    public u D(int i10) {
        com.google.api.client.util.h0.a(i10 >= 0);
        this.f115725l = i10;
        return this;
    }

    public u E(m mVar) {
        this.f115721h = mVar;
        return this;
    }

    public u F(int i10) {
        com.google.api.client.util.h0.b(i10 >= 0, "The content logging limit must be non-negative.");
        this.f115718e = i10;
        return this;
    }

    public u G(boolean z10) {
        this.f115720g = z10;
        return this;
    }

    public u H(n nVar) {
        this.f115731r = nVar;
        return this;
    }

    public u I(boolean z10) {
        this.f115733t = z10;
        return this;
    }

    public u J(q qVar) {
        this.f115715b = (q) com.google.api.client.util.h0.d(qVar);
        return this;
    }

    @com.google.api.client.util.f
    public u K(r rVar) {
        this.f115728o = rVar;
        return this;
    }

    public u L(p pVar) {
        this.f115714a = pVar;
        return this;
    }

    public u M(boolean z10) {
        this.f115719f = z10;
        return this;
    }

    public u N(int i10) {
        com.google.api.client.util.h0.a(i10 >= 0);
        this.f115717d = i10;
        return this;
    }

    public u O(com.google.api.client.util.e0 e0Var) {
        this.f115730q = e0Var;
        return this;
    }

    public u P(int i10) {
        com.google.api.client.util.h0.a(i10 >= 0);
        this.f115726m = i10;
        return this;
    }

    public u Q(String str) {
        com.google.api.client.util.h0.a(str == null || s.k(str));
        this.f115723j = str;
        return this;
    }

    public u R(q qVar) {
        this.f115716c = (q) com.google.api.client.util.h0.d(qVar);
        return this;
    }

    public u S(z zVar) {
        this.f115729p = zVar;
        return this;
    }

    @com.google.api.client.util.f
    @Deprecated
    public u T(boolean z10) {
        this.f115735v = z10;
        return this;
    }

    public u U(k0 k0Var) {
        this.f115737x = (k0) com.google.api.client.util.h0.d(k0Var);
        return this;
    }

    public u V(boolean z10) {
        this.f115736w = z10;
        return this;
    }

    public u W(boolean z10) {
        this.f115734u = z10;
        return this;
    }

    public u X(c0 c0Var) {
        this.f115727n = c0Var;
        return this;
    }

    public u Y(j jVar) {
        this.f115724k = (j) com.google.api.client.util.h0.d(jVar);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0242 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:112:0x023c, B:114:0x0242, B:116:0x0246, B:121:0x0250, B:125:0x0262, B:127:0x0266, B:129:0x0270, B:132:0x027a, B:136:0x0283), top: B:168:0x023c }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0246 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:112:0x023c, B:114:0x0242, B:116:0x0246, B:121:0x0250, B:125:0x0262, B:127:0x0266, B:129:0x0270, B:132:0x027a, B:136:0x0283), top: B:168:0x023c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x024d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0250 A[Catch: all -> 0x024b, TryCatch #2 {all -> 0x024b, blocks: (B:112:0x023c, B:114:0x0242, B:116:0x0246, B:121:0x0250, B:125:0x0262, B:127:0x0266, B:129:0x0270, B:132:0x027a, B:136:0x0283), top: B:168:0x023c }] */
    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283 A[Catch: all -> 0x024b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x024b, blocks: (B:112:0x023c, B:114:0x0242, B:116:0x0246, B:121:0x0250, B:125:0x0262, B:127:0x0266, B:129:0x0270, B:132:0x027a, B:136:0x0283), top: B:168:0x023c }] */
    /* JADX WARN: Code duplicated, block: B:140:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x028d  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0297  */
    /* JADX WARN: Code duplicated, block: B:149:0x029b  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6 A[LOOP:0: B:10:0x0021->B:162:0x02b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0142, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x015c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0177, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0192, please report this as an issue */
    public x a() throws IOException {
        StringBuilder sb2;
        StringBuilder sb3;
        String strV;
        m mVar;
        boolean z10;
        int i10;
        boolean z11;
        long j10;
        m0 m0Var;
        boolean z12;
        x xVar;
        r rVar;
        c0 c0Var;
        boolean zC;
        boolean z13;
        c cVar;
        long jA;
        z zVar;
        boolean z14;
        f0 f0VarB;
        String strC;
        m0 a0Var;
        n nVar;
        String name;
        o oVar;
        long jA2;
        m0 m0Var2;
        String str;
        String string;
        com.google.api.client.util.h0.a(this.f115717d >= 0);
        int i11 = this.f115717d;
        c cVar2 = this.f115732s;
        if (cVar2 != null) {
            cVar2.reset();
        }
        com.google.api.client.util.h0.d(this.f115723j);
        com.google.api.client.util.h0.d(this.f115724k);
        int i12 = i11;
        x xVar2 = null;
        while (true) {
            if (xVar2 != null) {
                xVar2.o();
            }
            p pVar = this.f115714a;
            if (pVar != null) {
                pVar.a(this);
            }
            String strK = this.f115724k.k();
            e0 e0VarB = this.f115722i.b(this.f115723j, strK);
            Logger logger = b0.f115584a;
            boolean z15 = this.f115719f && logger.isLoggable(Level.CONFIG);
            try {
                try {
                    if (z15) {
                        sb2 = new StringBuilder();
                        sb2.append("-------------- REQUEST  --------------");
                        String str2 = n0.f116110a;
                        sb2.append(str2);
                        sb2.append(this.f115723j);
                        sb2.append(' ');
                        sb2.append(strK);
                        sb2.append(str2);
                        if (this.f115720g) {
                            sb3 = new StringBuilder("curl -v --compressed");
                            if (!this.f115723j.equals("GET")) {
                                sb3.append(" -X ");
                                sb3.append(this.f115723j);
                            }
                        }
                        strV = this.f115715b.V();
                        if (!this.f115736w) {
                            if (strV == null) {
                                this.f115715b.F0(f115713z);
                            } else {
                                this.f115715b.F0(strV + " " + f115713z);
                            }
                        }
                        q.Z(this.f115715b, sb2, sb3, logger, e0VarB);
                        if (!this.f115736w) {
                            this.f115715b.F0(strV);
                        }
                        mVar = this.f115721h;
                        if (mVar != null || mVar.a()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mVar != null) {
                            strC = this.f115721h.c();
                            if (z15) {
                                j10 = -1;
                                a0Var = new com.google.api.client.util.a0(mVar, logger, Level.CONFIG, this.f115718e);
                            } else {
                                j10 = -1;
                                a0Var = mVar;
                            }
                            nVar = this.f115731r;
                            if (nVar == null) {
                                jA2 = this.f115721h.getLength();
                                name = null;
                            } else {
                                name = nVar.getName();
                                oVar = new o(a0Var, this.f115731r);
                                if (z10) {
                                    jA2 = com.google.api.client.util.t.a(oVar);
                                } else {
                                    jA2 = j10;
                                }
                                m0Var2 = oVar;
                            }
                            if (z15) {
                                i10 = i12;
                                if (strC != null) {
                                    StringBuilder sb4 = new StringBuilder();
                                    z11 = z15;
                                    sb4.append("Content-Type: ");
                                    sb4.append(strC);
                                    string = sb4.toString();
                                    sb2.append(string);
                                    sb2.append(n0.f116110a);
                                    if (sb3 != null) {
                                        m0Var2 = a0Var;
                                        sb3.append(" -H '" + string + "'");
                                    }
                                } else {
                                    m0Var2 = a0Var;
                                    z11 = z15;
                                }
                                if (name != null) {
                                    str = "Content-Encoding: " + name;
                                    sb2.append(str);
                                    sb2.append(n0.f116110a);
                                    if (sb3 != null) {
                                        sb3.append(" -H '" + str + "'");
                                    }
                                }
                                if (jA2 >= 0) {
                                    sb2.append("Content-Length: " + jA2);
                                    sb2.append(n0.f116110a);
                                }
                            } else {
                                i10 = i12;
                                z11 = z15;
                            }
                            if (sb3 != null) {
                                m0Var2 = a0Var;
                                sb3.append(" -d '@-'");
                            }
                            m0Var2 = a0Var;
                            e0VarB.i(strC);
                            e0VarB.g(name);
                            e0VarB.h(jA2);
                            e0VarB.j(m0Var2);
                            m0Var = m0Var2;
                        } else {
                            i10 = i12;
                            z11 = z15;
                            j10 = -1;
                        }
                        if (z11) {
                            m0Var = mVar;
                            logger.config(sb2.toString());
                            if (sb3 != null) {
                                sb3.append(" -- '");
                                sb3.append(strK.replaceAll("'", "'\"'\"'"));
                                sb3.append("'");
                                if (m0Var != null) {
                                    sb3.append(" << $$$");
                                }
                                logger.config(sb3.toString());
                            }
                        }
                        if (z10 || i10 <= 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        e0VarB.k(this.f115725l, this.f115726m);
                        f0VarB = e0VarB.b();
                        xVar = new x(this, f0VarB);
                        e = null;
                        if (xVar == null) {
                            try {
                                if (xVar.q()) {
                                    if (xVar == null) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z13 = z12 & z14;
                                } else {
                                    c0Var = this.f115727n;
                                    if (c0Var != null) {
                                        zC = c0Var.c(this, xVar, z12);
                                    } else {
                                        zC = false;
                                    }
                                    if (!zC) {
                                        if (!z(xVar.k(), xVar.h())) {
                                            zC = true;
                                        } else if (z12 && (cVar = this.f115732s) != null && cVar.b(xVar.k())) {
                                            jA = this.f115732s.a();
                                            if (jA != j10) {
                                                try {
                                                    this.f115737x.e(jA);
                                                } catch (InterruptedException unused) {
                                                }
                                                zC = true;
                                            }
                                        }
                                    }
                                    z13 = z12 & zC;
                                    if (z13) {
                                        xVar.o();
                                    }
                                }
                            } catch (Throwable th2) {
                                xVar.a();
                                throw th2;
                            }
                        } else {
                            if (xVar == null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z13 = z12 & z14;
                        }
                        i12 = i10 - 1;
                        if (!z13) {
                            if (xVar != null) {
                                throw e;
                            }
                            zVar = this.f115729p;
                            if (zVar != null) {
                                zVar.a(xVar);
                            }
                            if (this.f115734u || xVar.q()) {
                                return xVar;
                            }
                            try {
                                throw new y(xVar);
                            } catch (Throwable th3) {
                                xVar.a();
                                throw th3;
                            }
                        }
                        xVar2 = xVar;
                    } else {
                        sb2 = null;
                    }
                    xVar = new x(this, f0VarB);
                    e = null;
                } catch (Throwable th4) {
                    InputStream inputStreamB = f0VarB.b();
                    if (inputStreamB != null) {
                        inputStreamB.close();
                    }
                    throw th4;
                }
                f0VarB = e0VarB.b();
            } catch (IOException e10) {
                e = e10;
                if (!this.f115735v && ((rVar = this.f115728o) == null || !rVar.a(this, z12))) {
                    throw e;
                }
                if (z11) {
                    logger.log(Level.WARNING, "exception thrown while executing request", (Throwable) e);
                }
                xVar = null;
            }
            sb3 = null;
            strV = this.f115715b.V();
            if (!this.f115736w) {
                if (strV == null) {
                    this.f115715b.F0(f115713z);
                } else {
                    this.f115715b.F0(strV + " " + f115713z);
                }
            }
            q.Z(this.f115715b, sb2, sb3, logger, e0VarB);
            if (!this.f115736w) {
                this.f115715b.F0(strV);
            }
            mVar = this.f115721h;
            if (mVar != null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (mVar != null) {
                strC = this.f115721h.c();
                if (z15) {
                    j10 = -1;
                    a0Var = new com.google.api.client.util.a0(mVar, logger, Level.CONFIG, this.f115718e);
                } else {
                    j10 = -1;
                    a0Var = mVar;
                }
                nVar = this.f115731r;
                if (nVar == null) {
                    jA2 = this.f115721h.getLength();
                    name = null;
                } else {
                    name = nVar.getName();
                    oVar = new o(a0Var, this.f115731r);
                    if (z10) {
                        jA2 = com.google.api.client.util.t.a(oVar);
                    } else {
                        jA2 = j10;
                    }
                    m0Var2 = oVar;
                }
                if (z15) {
                    i10 = i12;
                    if (strC != null) {
                        StringBuilder sb5 = new StringBuilder();
                        z11 = z15;
                        sb5.append("Content-Type: ");
                        sb5.append(strC);
                        string = sb5.toString();
                        sb2.append(string);
                        sb2.append(n0.f116110a);
                        if (sb3 != null) {
                            m0Var2 = a0Var;
                            sb3.append(" -H '" + string + "'");
                        }
                    } else {
                        m0Var2 = a0Var;
                        z11 = z15;
                    }
                    if (name != null) {
                        str = "Content-Encoding: " + name;
                        sb2.append(str);
                        sb2.append(n0.f116110a);
                        if (sb3 != null) {
                            sb3.append(" -H '" + str + "'");
                        }
                    }
                    if (jA2 >= 0) {
                        sb2.append("Content-Length: " + jA2);
                        sb2.append(n0.f116110a);
                    }
                } else {
                    i10 = i12;
                    z11 = z15;
                }
                if (sb3 != null) {
                    m0Var2 = a0Var;
                    sb3.append(" -d '@-'");
                }
                m0Var2 = a0Var;
                e0VarB.i(strC);
                e0VarB.g(name);
                e0VarB.h(jA2);
                e0VarB.j(m0Var2);
                m0Var = m0Var2;
            } else {
                i10 = i12;
                z11 = z15;
                j10 = -1;
            }
            if (z11) {
                m0Var = mVar;
                logger.config(sb2.toString());
                if (sb3 != null) {
                    sb3.append(" -- '");
                    sb3.append(strK.replaceAll("'", "'\"'\"'"));
                    sb3.append("'");
                    if (m0Var != null) {
                        sb3.append(" << $$$");
                    }
                    logger.config(sb3.toString());
                }
            }
            if (z10) {
                z12 = false;
            } else {
                z12 = false;
            }
            e0VarB.k(this.f115725l, this.f115726m);
            if (xVar == null) {
                if (xVar == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z13 = z12 & z14;
            } else if (xVar.q()) {
                c0Var = this.f115727n;
                if (c0Var != null) {
                    zC = c0Var.c(this, xVar, z12);
                } else {
                    zC = false;
                }
                if (!zC) {
                    if (!z(xVar.k(), xVar.h())) {
                        zC = true;
                    } else if (z12) {
                        jA = this.f115732s.a();
                        if (jA != j10) {
                            this.f115737x.e(jA);
                            zC = true;
                        }
                    }
                }
                z13 = z12 & zC;
                if (z13) {
                    xVar.o();
                }
            } else {
                if (xVar == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z13 = z12 & z14;
            }
            i12 = i10 - 1;
            if (!z13) {
                if (xVar != null) {
                    throw e;
                }
                zVar = this.f115729p;
                if (zVar != null) {
                    zVar.a(xVar);
                }
                if (this.f115734u) {
                }
                return xVar;
            }
            xVar2 = xVar;
        }
    }

    @com.google.api.client.util.f
    public Future<x> b() {
        return c(Executors.newSingleThreadExecutor());
    }

    @com.google.api.client.util.f
    public Future<x> c(Executor executor) {
        FutureTask futureTask = new FutureTask(new a());
        executor.execute(futureTask);
        return futureTask;
    }

    @com.google.api.client.util.f
    @Deprecated
    public c d() {
        return this.f115732s;
    }

    public int e() {
        return this.f115725l;
    }

    public m f() {
        return this.f115721h;
    }

    public int g() {
        return this.f115718e;
    }

    public n h() {
        return this.f115731r;
    }

    public boolean i() {
        return this.f115733t;
    }

    public q j() {
        return this.f115715b;
    }

    @com.google.api.client.util.f
    public r k() {
        return this.f115728o;
    }

    public p l() {
        return this.f115714a;
    }

    public int m() {
        return this.f115717d;
    }

    public final com.google.api.client.util.e0 n() {
        return this.f115730q;
    }

    public int o() {
        return this.f115726m;
    }

    public String p() {
        return this.f115723j;
    }

    public q q() {
        return this.f115716c;
    }

    public z r() {
        return this.f115729p;
    }

    @com.google.api.client.util.f
    @Deprecated
    public boolean s() {
        return this.f115735v;
    }

    public k0 t() {
        return this.f115737x;
    }

    public boolean u() {
        return this.f115736w;
    }

    public boolean v() {
        return this.f115734u;
    }

    public b0 w() {
        return this.f115722i;
    }

    public c0 x() {
        return this.f115727n;
    }

    public j y() {
        return this.f115724k;
    }

    public boolean z(int i10, q qVar) {
        String strP = qVar.P();
        if (!i() || !a0.a(i10) || strP == null) {
            return false;
        }
        Y(new j(this.f115724k.O(strP)));
        if (i10 == 303) {
            Q("GET");
            E(null);
        }
        this.f115715b.h0(null);
        this.f115715b.v0(null);
        this.f115715b.x0(null);
        this.f115715b.w0(null);
        this.f115715b.z0(null);
        this.f115715b.y0(null);
        return true;
    }
}

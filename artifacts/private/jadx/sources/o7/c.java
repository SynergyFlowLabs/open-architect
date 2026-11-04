package o7;

import com.google.api.client.http.s;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import com.google.api.client.http.y;
import com.google.api.client.json.d;
import com.google.api.client.json.g;
import com.google.api.client.json.j;
import com.google.api.client.util.h0;
import com.google.api.client.util.n0;
import com.google.api.client.util.o0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class c extends y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f333592g = 409811126989994864L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient a f333593f;

    public c(y.a aVar, a aVar2) {
        super(aVar);
        this.f333593f = aVar2;
    }

    public static x g(d dVar, u uVar) throws IOException {
        h0.d(dVar);
        boolean zV = uVar.v();
        if (zV) {
            uVar.W(false);
        }
        x xVarA = uVar.a();
        uVar.W(zV);
        if (!zV || xVarA.q()) {
            return xVarA;
        }
        throw h(dVar, xVarA);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8 A[Catch: IOException -> 0x00b3, TryCatch #1 {IOException -> 0x00b3, blocks: (B:54:0x00c8, B:57:0x00d0, B:55:0x00cc, B:44:0x00ae, B:48:0x00ba), top: B:70:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[Catch: IOException -> 0x00b3, TryCatch #1 {IOException -> 0x00b3, blocks: (B:54:0x00c8, B:57:0x00d0, B:55:0x00cc, B:44:0x00ae, B:48:0x00ba), top: B:70:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5 A[Catch: IOException -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x00d1, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x002f, B:60:0x00d5), top: B:71:0x0019 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [o7.a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static c h(d dVar, x xVar) throws Throwable {
        String strT;
        g gVarD;
        a aVar;
        y.a aVar2 = new y.a(xVar.k(), xVar.l(), xVar.h());
        h0.d(dVar);
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        try {
            if (xVar.q()) {
                strT = xVar.t();
            } else {
                String strG = xVar.g();
                if (s.d(com.google.api.client.json.c.f115763a, strG)) {
                    try {
                        if (xVar.c() != null) {
                            try {
                                gVarD = dVar.d(xVar.c());
                                try {
                                    j jVarF = gVarD.f();
                                    if (jVarF == null) {
                                        jVarF = gVarD.o();
                                    }
                                    if (jVarF != null) {
                                        gVarD.N("error");
                                        if (gVarD.f() == j.VALUE_STRING) {
                                            strT = gVarD.n();
                                        } else if (gVarD.f() == j.START_OBJECT) {
                                            a aVar3 = (a) gVarD.w(a.class);
                                            try {
                                                strT = aVar3.k();
                                                r10 = aVar3;
                                            } catch (IOException e10) {
                                                aVar = aVar3;
                                                e = e10;
                                                try {
                                                    e.printStackTrace();
                                                    if (gVarD == null) {
                                                        xVar.o();
                                                    } else if (aVar == null) {
                                                        gVarD.a();
                                                    }
                                                    strT = null;
                                                    r10 = aVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (gVarD != null) {
                                                        xVar.o();
                                                    } else if (aVar == null) {
                                                        gVarD.a();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                aVar = aVar3;
                                                th = th3;
                                                if (gVarD != null) {
                                                    xVar.o();
                                                } else if (aVar == null) {
                                                    gVarD.a();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            strT = null;
                                        }
                                    } else {
                                        strT = null;
                                    }
                                    if (r10 == 0) {
                                        try {
                                            gVarD.a();
                                        } catch (IOException e11) {
                                            e = e11;
                                            r10 = r10;
                                            e.printStackTrace();
                                        }
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    aVar = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    aVar = null;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                gVarD = null;
                                aVar = null;
                            } catch (Throwable th5) {
                                th = th5;
                                gVarD = null;
                                aVar = null;
                            }
                        } else {
                            strT = xVar.t();
                        }
                    } catch (IOException e14) {
                        e = e14;
                        strT = null;
                        r10 = strG;
                    }
                } else {
                    strT = xVar.t();
                }
            }
        } catch (IOException e15) {
            e = e15;
            strT = null;
        }
        StringBuilder sbA = y.a(xVar);
        if (!o0.a(strT)) {
            sbA.append(n0.f116110a);
            sbA.append(strT);
            aVar2.g(strT);
        }
        aVar2.i(sbA.toString());
        return new c(aVar2, r10);
    }

    public final a i() {
        return this.f333593f;
    }
}

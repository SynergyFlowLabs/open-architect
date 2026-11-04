package com.android.volley.toolbox;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class g implements com.android.volley.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f89550d = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final o f89551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f89552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final h f89553c;

    @Deprecated
    public g(o oVar) {
        this(oVar, new h(4096));
    }

    @Deprecated
    protected static Map<String, String> b(com.android.volley.k[] kVarArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            treeMap.put(kVarArr[i10].a(), kVarArr[i10].b());
        }
        return treeMap;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [com.android.volley.toolbox.g] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.android.volley.o] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // com.android.volley.l
    public com.android.volley.o a(com.android.volley.s<?> sVar) throws com.android.volley.a0 {
        IOException iOException;
        n nVarB;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ?? B = this;
        while (true) {
            try {
                nVarB = B.f89552b.b(sVar, m.c(sVar.getCacheEntry()));
                try {
                    int iE = nVarB.e();
                    List<com.android.volley.k> listD = nVarB.d();
                    if (iE == 304) {
                        B = w.b(sVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listD);
                        return B;
                    }
                    InputStream inputStreamA = nVarB.a();
                    byte[] bArrC = inputStreamA != null ? w.c(inputStreamA, nVarB.c(), B.f89553c) : new byte[0];
                    try {
                        w.d(SystemClock.elapsedRealtime() - jElapsedRealtime, sVar, bArrC, iE);
                        if (iE < 200 || iE > 299) {
                            throw new IOException();
                        }
                        return new com.android.volley.o(iE, bArrC, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listD);
                    } catch (IOException e10) {
                        e = e10;
                        bArr = bArrC;
                        B = B;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                    B = B;
                }
                iOException = e;
            } catch (IOException e12) {
                iOException = e12;
                nVarB = null;
                bArr = null;
                sVar = sVar;
            }
            w.a(sVar, w.e(sVar, iOException, jElapsedRealtime, nVarB, bArr));
            sVar = sVar;
            B = B;
        }
    }

    @Deprecated
    public g(o oVar, h hVar) {
        this.f89551a = oVar;
        this.f89552b = new a(oVar);
        this.f89553c = hVar;
    }

    public g(e eVar) {
        this(eVar, new h(4096));
    }

    public g(e eVar, h hVar) {
        this.f89552b = eVar;
        this.f89551a = eVar;
        this.f89553c = hVar;
    }
}

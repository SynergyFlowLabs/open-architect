package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlin.text.StringsKt;
import okhttp3.f0;
import okhttp3.m;
import okhttp3.u;
import okhttp3.v;
import okio.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@oj.i(name = "HttpHeaders")
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final o f334183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final o f334184b;

    static {
        o.a aVar = o.f335046d;
        f334183a = aVar.l("\"\\");
        f334184b = aVar.l("\t ,=");
    }

    @l(level = n.ERROR, message = "No longer supported", replaceWith = @b1(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@NotNull f0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return c(response);
    }

    @NotNull
    public static final List<okhttp3.h> b(@NotNull u uVar, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.N1(headerName, uVar.n(i10), true)) {
                try {
                    d(new okio.l().pa(uVar.w(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.h.f334560a.g().m("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(@NotNull f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        if (Intrinsics.areEqual(f0Var.x0().m(), "HEAD")) {
            return false;
        }
        int iE = f0Var.E();
        return (((iE >= 100 && iE < 200) || iE == 204 || iE == 304) && jk.f.A(f0Var) == -1 && !StringsKt.N1("chunked", f0.T(f0Var, com.google.common.net.d.M0, null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2 A[EDGE_INSN: B:61:0x00d2->B:50:0x00d2 BREAK  A[LOOP:2: B:23:0x007f->B:49:0x00ce], SYNTHETIC] */
    private static final void d(okio.l lVar, List<okhttp3.h> list) throws EOFException {
        String strF;
        while (true) {
            String strF2 = null;
            while (true) {
                if (strF2 == null) {
                    h(lVar);
                    strF2 = f(lVar);
                    if (strF2 == null) {
                        return;
                    }
                }
                boolean zH = h(lVar);
                String strF3 = f(lVar);
                if (strF3 == null) {
                    if (lVar.y1()) {
                        list.add(new okhttp3.h(strF2, (Map<String, String>) MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                int iW = jk.f.W(lVar, kotlin.io.encoding.a.f312535i);
                boolean zH2 = h(lVar);
                if (zH || !(zH2 || lVar.y1())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iW2 = iW + jk.f.W(lVar, kotlin.io.encoding.a.f312535i);
                    while (true) {
                        if (strF3 != null) {
                            if (iW2 != 0) {
                                break;
                                break;
                            }
                            if (iW2 <= 1) {
                                return;
                            }
                            if (i(lVar, (byte) 34)) {
                                strF = e(lVar);
                            } else {
                                strF = f(lVar);
                            }
                            if (strF != null) {
                                return;
                            }
                            if (h(lVar)) {
                            }
                            strF3 = null;
                        } else {
                            strF3 = f(lVar);
                            if (!h(lVar)) {
                                iW2 = jk.f.W(lVar, kotlin.io.encoding.a.f312535i);
                                if (iW2 != 0) {
                                    break;
                                }
                                if (iW2 <= 1 || h(lVar)) {
                                    return;
                                }
                                if (i(lVar, (byte) 34)) {
                                    strF = e(lVar);
                                } else {
                                    strF = f(lVar);
                                }
                                if (strF != null || ((String) linkedHashMap.put(strF3, strF)) != null) {
                                    return;
                                }
                                if (h(lVar) && !lVar.y1()) {
                                    return;
                                } else {
                                    strF3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new okhttp3.h(strF2, linkedHashMap));
                    strF2 = strF3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strF3 + StringsKt.g2("=", iW));
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new okhttp3.h(strF2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String e(okio.l lVar) throws EOFException {
        if (lVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        okio.l lVar2 = new okio.l();
        while (true) {
            long jP2 = lVar.P2(f334183a);
            if (jP2 == -1) {
                return null;
            }
            if (lVar.I(jP2) == 34) {
                lVar2.Ga(lVar, jP2);
                lVar.readByte();
                return lVar2.O7();
            }
            if (lVar.size() == jP2 + 1) {
                return null;
            }
            lVar2.Ga(lVar, jP2);
            lVar.readByte();
            lVar2.Ga(lVar, 1L);
        }
    }

    private static final String f(okio.l lVar) {
        long jP2 = lVar.P2(f334184b);
        if (jP2 == -1) {
            jP2 = lVar.size();
        }
        if (jP2 != 0) {
            return lVar.u5(jP2);
        }
        return null;
    }

    public static final void g(@NotNull okhttp3.n nVar, @NotNull v url, @NotNull u headers) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (nVar == okhttp3.n.f334739b) {
            return;
        }
        List<m> listG = m.f334715j.g(url, headers);
        if (listG.isEmpty()) {
            return;
        }
        nVar.b(url, listG);
    }

    private static final boolean h(okio.l lVar) throws EOFException {
        boolean z10 = false;
        while (!lVar.y1()) {
            byte bI = lVar.I(0L);
            if (bI == 44) {
                lVar.readByte();
                z10 = true;
            } else {
                if (bI != 32 && bI != 9) {
                    break;
                }
                lVar.readByte();
            }
        }
        return z10;
    }

    private static final boolean i(okio.l lVar, byte b10) {
        return !lVar.y1() && lVar.I(0L) == b10;
    }
}

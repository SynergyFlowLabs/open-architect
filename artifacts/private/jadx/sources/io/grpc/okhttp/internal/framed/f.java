package io.grpc.okhttp.internal.framed;

import com.google.common.primitives.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.network.Api;
import io.grpc.internal.v0;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.b1;
import okio.l;
import okio.l0;
import okio.n;
import okio.o;

/* JADX INFO: loaded from: classes13.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f290518a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f290519b = 31;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f290520c = 63;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f290521d = 127;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o f290522e = o.x(":");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f290523f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f290524g = 16384;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d[] f290525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<o, Integer> f290526i;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f290527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f290528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f290529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f290530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d[] f290531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f290532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f290533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f290534h;

        a(int i10, b1 b1Var) {
            this(i10, i10, b1Var);
        }

        private void a() {
            int i10 = this.f290530d;
            int i11 = this.f290534h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f290531e, (Object) null);
            this.f290532f = this.f290531e.length - 1;
            this.f290533g = 0;
            this.f290534h = 0;
        }

        private int c(int i10) {
            return this.f290532f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f290531e.length;
                while (true) {
                    length--;
                    i11 = this.f290532f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f290531e[length].f290512c;
                    i10 -= i13;
                    this.f290534h -= i13;
                    this.f290533g--;
                    i12++;
                }
                d[] dVarArr = this.f290531e;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f290533g);
                this.f290532f += i12;
            }
            return i12;
        }

        private o f(int i10) throws IOException {
            if (i(i10)) {
                return f.f290525h[i10].f290510a;
            }
            int iC = c(i10 - f.f290525h.length);
            if (iC >= 0) {
                d[] dVarArr = this.f290531e;
                if (iC < dVarArr.length) {
                    return dVarArr[iC].f290510a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void h(int i10, d dVar) {
            this.f290527a.add(dVar);
            int i11 = dVar.f290512c;
            int i12 = 2 & (-1);
            if (i10 != -1) {
                i11 -= this.f290531e[c(i10)].f290512c;
            }
            int i13 = this.f290530d;
            if (i11 > i13) {
                b();
                return;
            }
            int iD = d((this.f290534h + i11) - i13);
            if (i10 == -1) {
                int i14 = this.f290533g + 1;
                d[] dVarArr = this.f290531e;
                if (i14 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f290532f = this.f290531e.length - 1;
                    this.f290531e = dVarArr2;
                }
                int i15 = this.f290532f;
                this.f290532f = i15 - 1;
                this.f290531e[i15] = dVar;
                this.f290533g++;
            } else {
                this.f290531e[i10 + c(i10) + iD] = dVar;
            }
            this.f290534h += i11;
        }

        private boolean i(int i10) {
            return i10 >= 0 && i10 <= f.f290525h.length - 1;
        }

        private int k() throws IOException {
            return this.f290528b.readByte() & 255;
        }

        private void n(int i10) throws IOException {
            if (i(i10)) {
                this.f290527a.add(f.f290525h[i10]);
                return;
            }
            int iC = c(i10 - f.f290525h.length);
            if (iC >= 0) {
                d[] dVarArr = this.f290531e;
                if (iC <= dVarArr.length - 1) {
                    this.f290527a.add(dVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void p(int i10) throws IOException {
            int i11 = 2 | (-1);
            h(-1, new d(f(i10), l()));
        }

        private void q() throws IOException {
            h(-1, new d(f.e(l()), l()));
        }

        private void r(int i10) throws IOException {
            this.f290527a.add(new d(f(i10), l()));
        }

        private void s() throws IOException {
            this.f290527a.add(new d(f.e(l()), l()));
        }

        public List<d> e() {
            ArrayList arrayList = new ArrayList(this.f290527a);
            this.f290527a.clear();
            return arrayList;
        }

        void g(int i10) {
            this.f290529c = i10;
            this.f290530d = i10;
            a();
        }

        int j() {
            return this.f290530d;
        }

        o l() throws IOException {
            int iK = k();
            boolean z10 = (iK & 128) == 128;
            int iO = o(iK, 127);
            return z10 ? o.l0(h.f().c(this.f290528b.tb(iO))) : this.f290528b.E5(iO);
        }

        void m() throws IOException {
            while (!this.f290528b.y1()) {
                byte b10 = this.f290528b.readByte();
                int i10 = b10 & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    n(o(i10, 127) - 1);
                } else if (i10 == 64) {
                    q();
                } else if ((b10 & t.f119782a) == 64) {
                    p(o(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iO = o(i10, 31);
                    this.f290530d = iO;
                    if (iO < 0 || iO > this.f290529c) {
                        throw new IOException("Invalid dynamic table size update " + this.f290530d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    s();
                } else {
                    r(o(i10, 15) - 1);
                }
            }
        }

        int o(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iK = k();
                if ((iK & 128) == 0) {
                    return i11 + (iK << i13);
                }
                i11 += (iK & 127) << i13;
                i13 += 7;
            }
        }

        a(int i10, int i11, b1 b1Var) {
            this.f290527a = new ArrayList();
            d[] dVarArr = new d[8];
            this.f290531e = dVarArr;
            this.f290532f = dVarArr.length - 1;
            this.f290533g = 0;
            this.f290534h = 0;
            this.f290529c = i10;
            this.f290530d = i11;
            this.f290528b = l0.e(b1Var);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f290535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f290536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f290537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f290538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f290539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f290540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d[] f290541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f290542h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f290543i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f290544j;

        b(l lVar) {
            this(4096, false, lVar);
        }

        private void a() {
            int i10 = this.f290540f;
            int i11 = this.f290544j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f290541g, (Object) null);
            this.f290543i = this.f290541g.length - 1;
            this.f290542h = 0;
            this.f290544j = 0;
        }

        private int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f290541g.length;
                while (true) {
                    length--;
                    i11 = this.f290543i;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f290541g[length].f290512c;
                    i10 -= i13;
                    this.f290544j -= i13;
                    this.f290542h--;
                    i12++;
                }
                d[] dVarArr = this.f290541g;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f290542h);
                this.f290543i += i12;
            }
            return i12;
        }

        private void d(d dVar) {
            int i10 = dVar.f290512c;
            int i11 = this.f290540f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f290544j + i10) - i11);
            int i12 = this.f290542h + 1;
            d[] dVarArr = this.f290541g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f290543i = this.f290541g.length - 1;
                this.f290541g = dVarArr2;
            }
            int i13 = this.f290543i;
            this.f290543i = i13 - 1;
            this.f290541g[i13] = dVar;
            this.f290542h++;
            this.f290544j += i10;
        }

        int e() {
            return this.f290540f;
        }

        void f(int i10) {
            this.f290537c = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f290540f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f290538d = Math.min(this.f290538d, iMin);
            }
            this.f290539e = true;
            this.f290540f = iMin;
            a();
        }

        void g(o oVar) throws IOException {
            if (!this.f290536b || h.f().e(oVar.F0()) >= oVar.v0()) {
                i(oVar.v0(), 127, 0);
                this.f290535a.U7(oVar);
                return;
            }
            l lVar = new l();
            h.f().d(oVar.F0(), lVar.nf());
            o oVarR7 = lVar.r7();
            i(oVarR7.v0(), 127, 128);
            this.f290535a.U7(oVarR7);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        void h(List<d> list) throws IOException {
            int length;
            int length2;
            if (this.f290539e) {
                int i10 = this.f290538d;
                if (i10 < this.f290540f) {
                    i(i10, 31, 32);
                }
                this.f290539e = false;
                this.f290538d = Integer.MAX_VALUE;
                i(this.f290540f, 31, 32);
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = list.get(i11);
                o oVarD0 = dVar.f290510a.D0();
                o oVar = dVar.f290511b;
                Integer num = (Integer) f.f290526i.get(oVarD0);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 < 2 || length2 > 7) {
                        length = length2;
                        length2 = -1;
                    } else if (f.f290525h[iIntValue].f290511b.equals(oVar)) {
                        length = length2;
                    } else if (f.f290525h[length2].f290511b.equals(oVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i12 = this.f290543i;
                    while (true) {
                        i12++;
                        d[] dVarArr = this.f290541g;
                        if (i12 >= dVarArr.length) {
                            break;
                        }
                        if (dVarArr[i12].f290510a.equals(oVarD0)) {
                            if (this.f290541g[i12].f290511b.equals(oVar)) {
                                length2 = f.f290525h.length + (i12 - this.f290543i);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f290543i) + f.f290525h.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    i(length2, 127, 128);
                } else if (length == -1) {
                    this.f290535a.writeByte(64);
                    g(oVarD0);
                    g(oVar);
                    d(dVar);
                } else if (!oVarD0.w0(f.f290522e) || d.f290507h.equals(oVarD0)) {
                    i(length, 63, 64);
                    g(oVar);
                    d(dVar);
                } else {
                    i(length, 15, 0);
                    g(oVar);
                }
            }
        }

        void i(int i10, int i11, int i12) throws IOException {
            if (i10 < i11) {
                this.f290535a.writeByte(i10 | i12);
                return;
            }
            this.f290535a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f290535a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f290535a.writeByte(i13);
        }

        b(int i10, boolean z10, l lVar) {
            this.f290538d = Integer.MAX_VALUE;
            d[] dVarArr = new d[8];
            this.f290541g = dVarArr;
            this.f290543i = dVarArr.length - 1;
            this.f290537c = i10;
            this.f290540f = i10;
            this.f290536b = z10;
            this.f290535a = lVar;
        }
    }

    static {
        d dVar = new d(d.f290507h, "");
        o oVar = d.f290504e;
        d dVar2 = new d(oVar, "GET");
        d dVar3 = new d(oVar, "POST");
        o oVar2 = d.f290505f;
        d dVar4 = new d(oVar2, "/");
        d dVar5 = new d(oVar2, "/index.html");
        o oVar3 = d.f290506g;
        d dVar6 = new d(oVar3, "http");
        d dVar7 = new d(oVar3, Api.scheme);
        o oVar4 = d.f290503d;
        f290525h = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(oVar4, "200"), new d(oVar4, "204"), new d(oVar4, "206"), new d(oVar4, "304"), new d(oVar4, "400"), new d(oVar4, "404"), new d(oVar4, "500"), new d("accept-charset", ""), new d(v0.f289917v, "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d(v0.f289916u, ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d(AttributeType.DATE, ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d(FirebaseAnalytics.d.f120676s, ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f290526i = f();
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o e(o oVar) throws IOException {
        int iV0 = oVar.v0();
        for (int i10 = 0; i10 < iV0; i10++) {
            byte bE = oVar.E(i10);
            if (bE >= 65 && bE <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + oVar.G0());
            }
        }
        return oVar;
    }

    private static Map<o, Integer> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f290525h.length);
        int i10 = 0;
        while (true) {
            d[] dVarArr = f290525h;
            if (i10 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i10].f290510a)) {
                linkedHashMap.put(dVarArr[i10].f290510a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}

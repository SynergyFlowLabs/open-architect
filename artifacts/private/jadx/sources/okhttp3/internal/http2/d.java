package okhttp3.internal.http2;

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
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.b1;
import okio.l0;
import okio.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f334279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f334280b = 15;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f334281c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f334282d = 63;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f334283e = 127;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f334284f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f334285g = 16384;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final c[] f334286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Map<o, Integer> f334287i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f334288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f334289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<c> f334290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final okio.n f334291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        @NotNull
        public c[] f334292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f334293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        public int f334294g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oj.f
        public int f334295h;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public a(@NotNull b1 source, int i10) {
            this(source, i10, 0, 4, null);
            Intrinsics.checkNotNullParameter(source, "source");
        }

        private final void a() {
            int i10 = this.f334289b;
            int i11 = this.f334295h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            ArraysKt.fill$default(this.f334292e, (Object) null, 0, 0, 6, (Object) null);
            this.f334293f = this.f334292e.length - 1;
            this.f334294g = 0;
            this.f334295h = 0;
        }

        private final int c(int i10) {
            return this.f334293f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f334292e.length;
                while (true) {
                    length--;
                    i11 = this.f334293f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f334292e[length];
                    Intrinsics.checkNotNull(cVar);
                    int i13 = cVar.f334278c;
                    i10 -= i13;
                    this.f334295h -= i13;
                    this.f334294g--;
                    i12++;
                }
                c[] cVarArr = this.f334292e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f334294g);
                this.f334293f += i12;
            }
            return i12;
        }

        private final o f(int i10) throws IOException {
            if (h(i10)) {
                return d.f334279a.c()[i10].f334276a;
            }
            int iC = c(i10 - d.f334279a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f334292e;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    Intrinsics.checkNotNull(cVar);
                    return cVar.f334276a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, c cVar) {
            this.f334290c.add(cVar);
            int i11 = cVar.f334278c;
            if (i10 != -1) {
                c cVar2 = this.f334292e[c(i10)];
                Intrinsics.checkNotNull(cVar2);
                i11 -= cVar2.f334278c;
            }
            int i12 = this.f334289b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f334295h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f334294g + 1;
                c[] cVarArr = this.f334292e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    int i14 = 5 | 0;
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f334293f = this.f334292e.length - 1;
                    this.f334292e = cVarArr2;
                }
                int i15 = this.f334293f;
                this.f334293f = i15 - 1;
                this.f334292e[i15] = cVar;
                this.f334294g++;
            } else {
                this.f334292e[i10 + c(i10) + iD] = cVar;
            }
            this.f334295h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f334279a.c().length - 1;
        }

        private final int j() throws IOException {
            return jk.f.d(this.f334291d.readByte(), 255);
        }

        private final void m(int i10) throws IOException {
            if (h(i10)) {
                this.f334290c.add(d.f334279a.c()[i10]);
                return;
            }
            int iC = c(i10 - d.f334279a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f334292e;
                if (iC < cVarArr.length) {
                    List<c> list = this.f334290c;
                    c cVar = cVarArr[iC];
                    Intrinsics.checkNotNull(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void o(int i10) throws IOException {
            g(-1, new c(f(i10), k()));
        }

        private final void p() throws IOException {
            g(-1, new c(d.f334279a.a(k()), k()));
        }

        private final void q(int i10) throws IOException {
            this.f334290c.add(new c(f(i10), k()));
        }

        private final void r() throws IOException {
            this.f334290c.add(new c(d.f334279a.a(k()), k()));
        }

        @NotNull
        public final List<c> e() {
            List<c> list = CollectionsKt.toList(this.f334290c);
            this.f334290c.clear();
            return list;
        }

        public final int i() {
            return this.f334289b;
        }

        @NotNull
        public final o k() throws IOException {
            int iJ = j();
            boolean z10 = (iJ & 128) == 128;
            long jN = n(iJ, 127);
            if (!z10) {
                return this.f334291d.E5(jN);
            }
            okio.l lVar = new okio.l();
            k.f334475a.b(this.f334291d, jN, lVar);
            return lVar.r7();
        }

        public final void l() throws IOException {
            while (!this.f334291d.y1()) {
                int iD = jk.f.d(this.f334291d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    m(n(iD, 127) - 1);
                } else if (iD == 64) {
                    p();
                } else if ((iD & 64) == 64) {
                    o(n(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iN = n(iD, 31);
                    this.f334289b = iN;
                    if (iN < 0 || iN > this.f334288a) {
                        throw new IOException("Invalid dynamic table size update " + this.f334289b);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    r();
                } else {
                    q(n(iD, 15) - 1);
                }
            }
        }

        public final int n(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iJ = j();
                if ((iJ & 128) == 0) {
                    return i11 + (iJ << i13);
                }
                i11 += (iJ & 127) << i13;
                i13 += 7;
            }
        }

        @oj.j
        public a(@NotNull b1 source, int i10, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f334288a = i10;
            this.f334289b = i11;
            this.f334290c = new ArrayList();
            this.f334291d = l0.e(source);
            c[] cVarArr = new c[8];
            this.f334292e = cVarArr;
            this.f334293f = cVarArr.length - 1;
        }

        public /* synthetic */ a(b1 b1Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(b1Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public int f334296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f334297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final okio.l f334298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f334299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f334300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oj.f
        public int f334301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        @NotNull
        public c[] f334302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f334303h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @oj.f
        public int f334304i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @oj.f
        public int f334305j;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public b(int i10, @NotNull okio.l out) {
            this(i10, false, out, 2, null);
            Intrinsics.checkNotNullParameter(out, "out");
        }

        private final void a() {
            int i10 = this.f334301f;
            int i11 = this.f334305j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            ArraysKt.fill$default(this.f334302g, (Object) null, 0, 0, 6, (Object) null);
            this.f334303h = this.f334302g.length - 1;
            this.f334304i = 0;
            this.f334305j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f334302g.length;
                while (true) {
                    length--;
                    i11 = this.f334303h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f334302g[length];
                    Intrinsics.checkNotNull(cVar);
                    i10 -= cVar.f334278c;
                    int i13 = this.f334305j;
                    c cVar2 = this.f334302g[length];
                    Intrinsics.checkNotNull(cVar2);
                    this.f334305j = i13 - cVar2.f334278c;
                    this.f334304i--;
                    i12++;
                }
                c[] cVarArr = this.f334302g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f334304i);
                c[] cVarArr2 = this.f334302g;
                int i14 = this.f334303h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f334303h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f334278c;
            int i11 = this.f334301f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f334305j + i10) - i11);
            int i12 = this.f334304i + 1;
            c[] cVarArr = this.f334302g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f334303h = this.f334302g.length - 1;
                this.f334302g = cVarArr2;
            }
            int i13 = this.f334303h;
            this.f334303h = i13 - 1;
            this.f334302g[i13] = cVar;
            this.f334304i++;
            this.f334305j += i10;
        }

        public final void e(int i10) {
            this.f334296a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f334301f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f334299d = Math.min(this.f334299d, iMin);
            }
            this.f334300e = true;
            this.f334301f = iMin;
            a();
        }

        public final void f(@NotNull o data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f334297b) {
                k kVar = k.f334475a;
                if (kVar.d(data) < data.v0()) {
                    okio.l lVar = new okio.l();
                    kVar.c(data, lVar);
                    o oVarR7 = lVar.r7();
                    h(oVarR7.v0(), 127, 128);
                    this.f334298c.U7(oVarR7);
                    return;
                }
            }
            h(data.v0(), 127, 0);
            this.f334298c.U7(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0084  */
        public final void g(@NotNull List<c> headerBlock) throws IOException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f334300e) {
                int i10 = this.f334299d;
                if (i10 < this.f334301f) {
                    h(i10, 31, 32);
                }
                this.f334300e = false;
                this.f334299d = Integer.MAX_VALUE;
                h(this.f334301f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = headerBlock.get(i11);
                o oVarD0 = cVar.f334276a.D0();
                o oVar = cVar.f334277b;
                d dVar = d.f334279a;
                Integer num = dVar.b().get(oVarD0);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    int i12 = 2 >> 2;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (Intrinsics.areEqual(dVar.c()[iIntValue].f334277b, oVar)) {
                        length = length2;
                    } else if (Intrinsics.areEqual(dVar.c()[length2].f334277b, oVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f334302g.length;
                    for (int i13 = this.f334303h + 1; i13 < length3; i13++) {
                        c cVar2 = this.f334302g[i13];
                        Intrinsics.checkNotNull(cVar2);
                        if (Intrinsics.areEqual(cVar2.f334276a, oVarD0)) {
                            c cVar3 = this.f334302g[i13];
                            Intrinsics.checkNotNull(cVar3);
                            if (Intrinsics.areEqual(cVar3.f334277b, oVar)) {
                                length2 = d.f334279a.c().length + (i13 - this.f334303h);
                                break;
                            } else if (length == -1) {
                                length = (i13 - this.f334303h) + d.f334279a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, 128);
                } else if (length == -1) {
                    this.f334298c.writeByte(64);
                    f(oVarD0);
                    f(oVar);
                    d(cVar);
                } else if (!oVarD0.w0(c.f334265e) || Intrinsics.areEqual(c.f334275o, oVarD0)) {
                    h(length, 63, 64);
                    f(oVar);
                    d(cVar);
                } else {
                    h(length, 15, 0);
                    f(oVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f334298c.writeByte(i10 | i12);
                return;
            }
            this.f334298c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f334298c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f334298c.writeByte(i13);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public b(@NotNull okio.l out) {
            this(0, false, out, 3, null);
            Intrinsics.checkNotNullParameter(out, "out");
        }

        @oj.j
        public b(int i10, boolean z10, @NotNull okio.l out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f334296a = i10;
            this.f334297b = z10;
            this.f334298c = out;
            this.f334299d = Integer.MAX_VALUE;
            this.f334301f = i10;
            c[] cVarArr = new c[8];
            this.f334302g = cVarArr;
            this.f334303h = cVarArr.length - 1;
        }

        public /* synthetic */ b(int i10, boolean z10, okio.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, lVar);
        }
    }

    static {
        d dVar = new d();
        f334279a = dVar;
        c cVar = new c(c.f334275o, "");
        o oVar = c.f334272l;
        c cVar2 = new c(oVar, "GET");
        c cVar3 = new c(oVar, "POST");
        o oVar2 = c.f334273m;
        c cVar4 = new c(oVar2, "/");
        c cVar5 = new c(oVar2, "/index.html");
        o oVar3 = c.f334274n;
        c cVar6 = new c(oVar3, "http");
        c cVar7 = new c(oVar3, Api.scheme);
        o oVar4 = c.f334271k;
        f334286h = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(oVar4, "200"), new c(oVar4, "204"), new c(oVar4, "206"), new c(oVar4, "304"), new c(oVar4, "400"), new c(oVar4, "404"), new c(oVar4, "500"), new c("accept-charset", ""), new c(v0.f289917v, "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c(v0.f289916u, ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c(AttributeType.DATE, ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(FirebaseAnalytics.d.f120676s, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f334287i = dVar.d();
    }

    private d() {
    }

    private final Map<o, Integer> d() {
        c[] cVarArr = f334286h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f334286h;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f334276a)) {
                linkedHashMap.put(cVarArr2[i10].f334276a, Integer.valueOf(i10));
            }
        }
        Map<o, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    @NotNull
    public final o a(@NotNull o name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iV0 = name.v0();
        for (int i10 = 0; i10 < iV0; i10++) {
            byte bE = name.E(i10);
            if (65 <= bE && bE < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.G0());
            }
        }
        return name;
    }

    @NotNull
    public final Map<o, Integer> b() {
        return f334287i;
    }

    @NotNull
    public final c[] c() {
        return f334286h;
    }
}

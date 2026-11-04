package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.compose.runtime.m0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.e0;
import androidx.media3.common.util.k1;
import androidx.media3.datasource.r1;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.audio.s0;
import com.google.common.base.r0;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k implements d, r1 {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final int D = 4;
    private static final int E = 5;

    @e.a({"NonFinalStaticField", "StaticFieldLeak"})
    @p0
    private static k F = null;
    private static final int G = 2000;
    private static final int H = 524288;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l6<Long> f66073r = l6.M(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l6<Long> f66074s = l6.M(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l6<Long> f66075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l6<Long> f66076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l6<Long> f66077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l6<Long> f66078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f66079x = 1000000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66080y = 2000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f66081z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Context f66082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n6<Integer, Long> f66083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d.a.C0595a f66084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.j f66085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f66086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("this")
    private final t f66087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("this")
    private int f66088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b0("this")
    private long f66089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b0("this")
    private long f66090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("this")
    private long f66091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b0("this")
    private long f66092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @b0("this")
    private long f66093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @b0("this")
    private long f66094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f66095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f66096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f66097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f66098q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Context f66099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, Long> f66100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f66101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.common.util.j f66102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f66103e;

        public b(Context context) {
            this.f66099a = context == null ? null : context.getApplicationContext();
            this.f66101c = 2000;
            this.f66102d = androidx.media3.common.util.j.f61520a;
            this.f66103e = true;
            HashMap map = new HashMap(8);
            this.f66100b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public k a() {
            return new k(this.f66099a, this.f66100b, this.f66101c, this.f66102d, this.f66103e);
        }

        @z7.a
        public b b(androidx.media3.common.util.j jVar) {
            this.f66102d = jVar;
            return this;
        }

        @z7.a
        public b c(int i10, long j10) {
            this.f66100b.put(Integer.valueOf(i10), Long.valueOf(j10));
            return this;
        }

        @z7.a
        public b d(long j10) {
            Iterator<Integer> it = this.f66100b.keySet().iterator();
            while (it.hasNext()) {
                c(it.next().intValue(), j10);
            }
            return this;
        }

        @z7.a
        public b e(String str) {
            String strJ = com.google.common.base.c.j(str);
            for (Integer num : this.f66100b.keySet()) {
                c(num.intValue(), k.n(strJ, num.intValue()));
            }
            return this;
        }

        @z7.a
        public b f(boolean z10) {
            this.f66103e = z10;
            return this;
        }

        @z7.a
        public b g(int i10) {
            this.f66101c = i10;
            return this;
        }
    }

    static {
        Long lValueOf = Long.valueOf(s0.A);
        f66075t = l6.M(lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        f66076u = l6.M(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        f66077v = l6.M(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        f66078w = l6.M(2700000L, lValueOf, 1600000L, 1300000L, 1000000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int[] l(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b10 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b10 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b10 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b10 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b10 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b10 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b10 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b10 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b10 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b10 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b10 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b10 = 11;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b10 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b10 = com.google.common.base.c.f116468u;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b10 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b10 = com.google.common.base.c.f116471x;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b10 = com.google.common.base.c.f116472y;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b10 = com.google.common.base.c.f116473z;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b10 = com.google.common.base.c.A;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b10 = com.google.common.base.c.B;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b10 = com.google.common.base.c.C;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b10 = com.google.common.base.c.D;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b10 = com.google.common.base.c.E;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b10 = com.google.common.base.c.F;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b10 = com.google.common.base.c.G;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b10 = com.google.common.base.c.H;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b10 = com.google.common.base.c.I;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b10 = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b10 = 33;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b10 = 34;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b10 = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b10 = 36;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b10 = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b10 = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b10 = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b10 = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b10 = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b10 = 42;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b10 = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b10 = 44;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b10 = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b10 = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b10 = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b10 = 48;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b10 = 49;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b10 = 50;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b10 = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b10 = 52;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b10 = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b10 = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b10 = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b10 = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b10 = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b10 = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b10 = 59;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b10 = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b10 = kotlin.io.encoding.a.f312535i;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b10 = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b10 = 63;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b10 = com.google.common.primitives.t.f119782a;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b10 = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b10 = 66;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b10 = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b10 = 68;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b10 = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b10 = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b10 = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b10 = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b10 = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b10 = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b10 = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b10 = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b10 = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b10 = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b10 = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b10 = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b10 = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b10 = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b10 = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b10 = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b10 = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b10 = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b10 = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b10 = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b10 = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b10 = 90;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b10 = 91;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b10 = 92;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b10 = 93;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b10 = 94;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b10 = 95;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b10 = 96;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b10 = 97;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b10 = 98;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b10 = 99;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b10 = 100;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b10 = 101;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b10 = 102;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b10 = 103;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b10 = 104;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b10 = 105;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b10 = 106;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b10 = 107;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b10 = 108;
                }
                break;
            case 2396:
                if (str.equals(com.google.zxing.client.result.k.f130224q)) {
                    b10 = 109;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b10 = 110;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b10 = 111;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b10 = 112;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b10 = 113;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b10 = 114;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b10 = 115;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b10 = 116;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b10 = 117;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b10 = 118;
                }
                break;
            case 2422:
                if (str.equals(com.google.zxing.client.result.k.f130225r)) {
                    b10 = 119;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b10 = 120;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b10 = 121;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b10 = 122;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b10 = 123;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b10 = 124;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b10 = 125;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b10 = 126;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b10 = 127;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b10 = 128;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b10 = 129;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b10 = 130;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b10 = 131;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b10 = 132;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b10 = 133;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b10 = 134;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b10 = 135;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b10 = 136;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b10 = 137;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b10 = 138;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b10 = 139;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b10 = 140;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b10 = 141;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b10 = 142;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b10 = 143;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b10 = org.msgpack.core.h.a.f339267c;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b10 = 145;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b10 = 146;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b10 = 147;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b10 = 148;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b10 = 149;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b10 = 150;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b10 = 151;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b10 = 152;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b10 = 153;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b10 = 154;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    b10 = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b10 = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b10 = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b10 = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b10 = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b10 = org.msgpack.core.h.a.f339268d;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b10 = 161;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b10 = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b10 = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b10 = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b10 = 165;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b10 = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b10 = 167;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b10 = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b10 = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b10 = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b10 = 171;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b10 = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b10 = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b10 = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b10 = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b10 = 176;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b10 = 177;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b10 = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b10 = 179;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b10 = 180;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b10 = 181;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b10 = 182;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b10 = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b10 = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b10 = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b10 = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b10 = com.fasterxml.jackson.core.json.a.f102488j;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b10 = 188;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b10 = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b10 = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b10 = com.fasterxml.jackson.core.json.a.f102489k;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b10 = org.msgpack.core.h.a.f339269e;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b10 = org.msgpack.core.h.a.f339270f;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b10 = org.msgpack.core.h.a.f339271g;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b10 = org.msgpack.core.h.a.f339272h;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b10 = org.msgpack.core.h.a.f339273i;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b10 = org.msgpack.core.h.a.f339274j;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b10 = org.msgpack.core.h.a.f339275k;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b10 = org.msgpack.core.h.a.f339276l;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b10 = org.msgpack.core.h.a.f339277m;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b10 = org.msgpack.core.h.a.f339278n;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b10 = org.msgpack.core.h.a.f339279o;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b10 = org.msgpack.core.h.a.f339280p;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b10 = org.msgpack.core.h.a.f339281q;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b10 = org.msgpack.core.h.a.f339282r;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b10 = org.msgpack.core.h.a.f339283s;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b10 = org.msgpack.core.h.a.f339284t;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b10 = org.msgpack.core.h.a.f339285u;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b10 = org.msgpack.core.h.a.f339286v;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b10 = org.msgpack.core.h.a.f339287w;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b10 = org.msgpack.core.h.a.f339288x;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b10 = org.msgpack.core.h.a.f339289y;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b10 = org.msgpack.core.h.a.f339290z;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b10 = org.msgpack.core.h.a.A;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b10 = org.msgpack.core.h.a.B;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b10 = org.msgpack.core.h.a.C;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b10 = org.msgpack.core.h.a.D;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b10 = org.msgpack.core.h.a.E;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b10 = org.msgpack.core.h.a.F;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b10 = org.msgpack.core.h.a.G;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b10 = org.msgpack.core.h.a.H;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b10 = org.msgpack.core.h.a.I;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b10 = org.msgpack.core.h.a.J;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b10 = org.msgpack.core.h.a.K;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b10 = 225;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b10 = 226;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b10 = 227;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b10 = 228;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b10 = 229;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b10 = 230;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b10 = 231;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b10 = 232;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b10 = 233;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b10 = 234;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b10 = 235;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b10 = 236;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b10 = 237;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b10 = 238;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
            case 113:
            case androidx.media3.extractor.metadata.dvbsi.b.f67479d /* 116 */:
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case 41:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case 162:
            case 186:
            case com.facebook.internal.p.f100029m /* 190 */:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
            case 102:
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case com.planner5d.library.engine.input.f.b.B0 /* 84 */:
            case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
            case androidx.media2.widget.f.i.f59793p0 /* 154 */:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case androidx.media2.widget.f.i.f59775g0 /* 141 */:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case 37:
            case androidx.media2.widget.f.i.f59767c0 /* 137 */:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 38:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 39:
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case 44:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 45:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case androidx.media2.widget.f.i.f59799s0 /* 157 */:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case com.rabbitmq.client.impl.k.b.p.f265340a /* 111 */:
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                return new int[]{0, 0, 2, 0, 0, 2};
            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case com.planner5d.library.engine.input.f.b.V /* 68 */:
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160725s /* 73 */:
                return new int[]{1, 1, 3, 2, 2, 2};
            case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 75:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case com.planner5d.library.engine.input.f.b.X /* 79 */:
            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160732u0 /* 81 */:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                return new int[]{3, 4, 4, 2, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                return new int[]{2, 1, 2, 1, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                return new int[]{2, 2, 4, 3, 3, 2};
            case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case com.planner5d.library.engine.input.f.b.f160703k1 /* 94 */:
                return new int[]{3, 1, 3, 3, 2, 4};
            case com.planner5d.library.engine.input.f.b.f160706l1 /* 95 */:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case com.planner5d.library.engine.input.f.b.f160733u1 /* 103 */:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case com.planner5d.library.engine.input.f.b.f160745y1 /* 107 */:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case 109:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case com.planner5d.library.engine.input.f.b.B /* 112 */:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case me.relex.circleindicator.a.f332619e /* 117 */:
                return new int[]{2, 1, 2, 2, 3, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case okhttp3.internal.ws.g.f334652s /* 126 */:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case androidx.media2.widget.f.i.f59773f0 /* 140 */:
                return new int[]{0, 2, 4, 4, 3, 1};
            case androidx.media2.widget.f.i.f59777h0 /* 142 */:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case com.planner5d.library.engine.input.f.b.F1 /* 147 */:
                return new int[]{3, 2, 1, 3, 4, 2};
            case com.planner5d.library.engine.input.f.b.G1 /* 148 */:
                return new int[]{3, 2, 2, 1, 2, 2};
            case com.planner5d.library.engine.input.f.b.H1 /* 149 */:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case androidx.media2.widget.f.i.f59797r0 /* 156 */:
                return new int[]{3, 4, 2, 1, 2, 2};
            case androidx.media2.widget.f.i.f59801t0 /* 158 */:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case m0.f36245r /* 207 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long m(int i10) {
        Long lValueOf = this.f66083b.get(Integer.valueOf(i10));
        if (lValueOf == null) {
            lValueOf = this.f66083b.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(n(this.f66098q, i10));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n(@p0 String str, int i10) {
        int[] iArrL = l(r0.g(str));
        if (i10 != 2) {
            if (i10 == 3) {
                return f66074s.get(iArrL[1]).longValue();
            }
            if (i10 == 4) {
                return f66075t.get(iArrL[2]).longValue();
            }
            if (i10 == 5) {
                return f66076u.get(iArrL[3]).longValue();
            }
            if (i10 != 7) {
                if (i10 == 9) {
                    return f66078w.get(iArrL[5]).longValue();
                }
                if (i10 != 10) {
                    return 1000000L;
                }
                return f66077v.get(iArrL[4]).longValue();
            }
        }
        return f66073r.get(iArrL[0]).longValue();
    }

    public static synchronized k o(Context context) {
        try {
            if (F == null) {
                F = new b(context).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return F;
    }

    private static boolean p(x xVar, boolean z10) {
        return z10 && !xVar.d(8);
    }

    @b0("this")
    private void q(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f66094m) {
            return;
        }
        this.f66094m = j11;
        this.f66084c.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r(int i10) throws Throwable {
        Throwable th2;
        try {
            try {
                int i11 = this.f66095n;
                if (i11 != 0) {
                    try {
                        if (!this.f66086e) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                if (this.f66096o) {
                    i10 = this.f66097p;
                }
                if (i11 != i10 || this.f66098q == null) {
                    this.f66095n = i10;
                    if (i10 == 1 || i10 == 0 || i10 == 8) {
                        return;
                    }
                    if (this.f66098q == null) {
                        this.f66098q = k1.k0(this.f66082a);
                    }
                    this.f66093l = m(i10);
                    long jB = this.f66085d.b();
                    q(this.f66088g > 0 ? (int) (jB - this.f66089h) : 0, this.f66090i, this.f66093l);
                    this.f66089h = jB;
                    this.f66090i = 0L;
                    this.f66092k = 0L;
                    this.f66091j = 0L;
                    this.f66087f.g();
                    return;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public void a(d.a aVar) {
        this.f66084c.d(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public synchronized long b() {
        return this.f66093l;
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public void d(Handler handler, d.a aVar) {
        androidx.media3.common.util.a.g(handler);
        androidx.media3.common.util.a.g(aVar);
        this.f66084c.b(handler, aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.d
    public r1 e() {
        return this;
    }

    @Override // androidx.media3.datasource.r1
    public synchronized void f(androidx.media3.datasource.p pVar, x xVar, boolean z10) {
        try {
            if (p(xVar, z10)) {
                if (this.f66088g == 0) {
                    this.f66089h = this.f66085d.b();
                }
                this.f66088g++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.r1
    public synchronized void g(androidx.media3.datasource.p pVar, x xVar, boolean z10, int i10) {
        try {
            if (p(xVar, z10)) {
                this.f66090i += (long) i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.r1
    public synchronized void h(androidx.media3.datasource.p pVar, x xVar, boolean z10) throws Throwable {
        Throwable th2;
        k kVar;
        try {
            try {
                if (p(xVar, z10)) {
                    androidx.media3.common.util.a.i(this.f66088g > 0);
                    long jB = this.f66085d.b();
                    int i10 = (int) (jB - this.f66089h);
                    this.f66091j += (long) i10;
                    long j10 = this.f66092k;
                    long j11 = this.f66090i;
                    this.f66092k = j10 + j11;
                    if (i10 > 0) {
                        this.f66087f.c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                        if (this.f66091j < 2000) {
                            try {
                                if (this.f66092k >= PlaybackStateCompat.f9656l3) {
                                    this.f66093l = (long) this.f66087f.f(0.5f);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            this.f66093l = (long) this.f66087f.f(0.5f);
                        }
                        kVar = this;
                        kVar.q(i10, this.f66090i, this.f66093l);
                        kVar.f66089h = jB;
                        kVar.f66090i = 0L;
                    } else {
                        kVar = this;
                    }
                    kVar.f66088g--;
                    return;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    @Override // androidx.media3.datasource.r1
    public void i(androidx.media3.datasource.p pVar, x xVar, boolean z10) {
    }

    public synchronized void s(int i10) {
        try {
            this.f66097p = i10;
            this.f66096o = true;
            r(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private k(@p0 Context context, Map<Integer, Long> map, int i10, androidx.media3.common.util.j jVar, boolean z10) {
        this.f66082a = context == null ? null : context.getApplicationContext();
        this.f66083b = n6.g(map);
        this.f66084c = new d.a.C0595a();
        this.f66087f = new t(i10);
        this.f66085d = jVar;
        this.f66086e = z10;
        if (context == null) {
            this.f66095n = 0;
            this.f66093l = 1000000L;
            return;
        }
        e0 e0VarE = e0.e(context);
        int iG = e0VarE.g();
        this.f66095n = iG;
        this.f66093l = m(iG);
        e0VarE.l(new e0.c() { // from class: androidx.media3.exoplayer.upstream.j
            @Override // androidx.media3.common.util.e0.c
            public final void a(int i11) throws Throwable {
                this.f66072a.r(i11);
            }
        }, androidx.media3.common.util.c.a());
    }
}

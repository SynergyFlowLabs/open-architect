package androidx.media2.exoplayer.external.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class r implements d, q0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map<String, int[]> f57399p = j();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long[] f57400q = {5400000, 3400000, 1900000, 1100000, 400000};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long[] f57401r = {170000, 139000, 122000, 107000, 90000};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long[] f57402s = {2100000, 1300000, 960000, 770000, 450000};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long[] f57403t = {6000000, 3400000, 2100000, 1400000, 570000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f57404u = 1000000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f57405v = 2000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private static r f57406w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f57407x = 2000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f57408y = 524288;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final Context f57409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<Long> f57410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.i<d.a> f57411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.f0 f57412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.c f57413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f57415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f57416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f57417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f57418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f57419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f57420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f57421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f57422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f57423o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private final Context f57424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Long> f57425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media2.exoplayer.external.util.c f57427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f57428e;

        public b(Context context) {
            this.f57424a = context == null ? null : context.getApplicationContext();
            this.f57425b = c(androidx.media2.exoplayer.external.util.q0.K(context));
            this.f57426c = 2000;
            this.f57427d = androidx.media2.exoplayer.external.util.c.f57511a;
            this.f57428e = true;
        }

        private static int[] b(String countryCode) {
            int[] iArr = r.f57399p.get(countryCode);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }

        private static SparseArray<Long> c(String countryCode) {
            int[] iArrB = b(countryCode);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            long[] jArr = r.f57400q;
            sparseArray.append(2, Long.valueOf(jArr[iArrB[0]]));
            sparseArray.append(3, Long.valueOf(r.f57401r[iArrB[1]]));
            sparseArray.append(4, Long.valueOf(r.f57402s[iArrB[2]]));
            sparseArray.append(5, Long.valueOf(r.f57403t[iArrB[3]]));
            sparseArray.append(7, Long.valueOf(jArr[iArrB[0]]));
            return sparseArray;
        }

        public r a() {
            return new r(this.f57424a, this.f57425b, this.f57426c, this.f57427d, this.f57428e);
        }

        public b d(androidx.media2.exoplayer.external.util.c clock) {
            this.f57427d = clock;
            return this;
        }

        public b e(int networkType, long initialBitrateEstimate) {
            this.f57425b.put(networkType, Long.valueOf(initialBitrateEstimate));
            return this;
        }

        public b f(long initialBitrateEstimate) {
            for (int i10 = 0; i10 < this.f57425b.size(); i10++) {
                this.f57425b.setValueAt(i10, Long.valueOf(initialBitrateEstimate));
            }
            return this;
        }

        public b g(String countryCode) {
            this.f57425b = c(androidx.media2.exoplayer.external.util.q0.W0(countryCode));
            return this;
        }

        public b h(boolean resetOnNetworkTypeChange) {
            this.f57428e = resetOnNetworkTypeChange;
            return this;
        }

        public b i(int slidingWindowMaxWeight) {
            this.f57426c = slidingWindowMaxWeight;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static c f57429c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f57430a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<WeakReference<r>> f57431b = new ArrayList<>();

        private c() {
        }

        public static synchronized c a(Context context) {
            try {
                if (f57429c == null) {
                    f57429c = new c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f57429c, intentFilter);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f57429c;
        }

        private void d() {
            int size = this.f57431b.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                if (this.f57431b.get(size).get() == null) {
                    this.f57431b.remove(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(r bandwidthMeter) throws Throwable {
            bandwidthMeter.o();
        }

        public synchronized void c(final r bandwidthMeter) {
            try {
                d();
                this.f57431b.add(new WeakReference<>(bandwidthMeter));
                this.f57430a.post(new Runnable(this, bandwidthMeter) { // from class: androidx.media2.exoplayer.external.upstream.s

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.c f57444a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final r f57445b;

                    {
                        this.f57444a = this;
                        this.f57445b = bandwidthMeter;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        this.f57444a.b(this.f57445b);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                d();
                for (int i10 = 0; i10 < this.f57431b.size(); i10++) {
                    r rVar = this.f57431b.get(i10).get();
                    if (rVar != null) {
                        b(rVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Map<String, int[]> j() {
        HashMap map = new HashMap();
        map.put("AD", new int[]{1, 0, 0, 1});
        map.put("AE", new int[]{1, 4, 4, 4});
        map.put("AF", new int[]{4, 4, 3, 3});
        map.put("AG", new int[]{3, 2, 1, 1});
        map.put("AI", new int[]{1, 0, 1, 3});
        map.put("AL", new int[]{1, 2, 1, 1});
        map.put("AM", new int[]{2, 2, 3, 2});
        map.put("AO", new int[]{3, 4, 2, 0});
        map.put("AQ", new int[]{4, 2, 2, 2});
        map.put("AR", new int[]{2, 3, 2, 2});
        map.put("AS", new int[]{3, 3, 4, 1});
        map.put("AT", new int[]{0, 2, 0, 0});
        map.put("AU", new int[]{0, 1, 1, 1});
        map.put("AW", new int[]{1, 1, 0, 2});
        map.put("AX", new int[]{0, 2, 1, 0});
        map.put("AZ", new int[]{3, 3, 2, 2});
        map.put("BA", new int[]{1, 1, 1, 2});
        map.put("BB", new int[]{0, 1, 0, 0});
        map.put("BD", new int[]{2, 2, 3, 2});
        map.put("BE", new int[]{0, 0, 0, 1});
        map.put("BF", new int[]{4, 4, 3, 1});
        map.put("BG", new int[]{0, 1, 0, 0});
        map.put("BH", new int[]{2, 1, 3, 4});
        map.put("BI", new int[]{4, 3, 4, 4});
        map.put("BJ", new int[]{4, 3, 4, 4});
        map.put("BL", new int[]{1, 0, 2, 3});
        map.put("BM", new int[]{1, 0, 0, 0});
        map.put("BN", new int[]{4, 2, 3, 3});
        map.put("BO", new int[]{2, 2, 3, 2});
        map.put("BQ", new int[]{1, 0, 3, 4});
        map.put("BR", new int[]{2, 3, 3, 2});
        map.put("BS", new int[]{2, 0, 1, 4});
        map.put("BT", new int[]{3, 0, 2, 1});
        map.put("BW", new int[]{4, 4, 1, 2});
        map.put("BY", new int[]{0, 1, 1, 2});
        map.put("BZ", new int[]{2, 2, 3, 1});
        map.put("CA", new int[]{0, 3, 3, 3});
        map.put("CD", new int[]{4, 4, 3, 2});
        map.put("CF", new int[]{4, 3, 3, 4});
        map.put("CG", new int[]{4, 4, 4, 4});
        map.put("CH", new int[]{0, 0, 1, 1});
        map.put("CI", new int[]{3, 4, 3, 3});
        map.put("CK", new int[]{2, 4, 1, 0});
        map.put("CL", new int[]{2, 2, 2, 3});
        map.put("CM", new int[]{3, 4, 2, 1});
        map.put("CN", new int[]{2, 2, 2, 3});
        map.put("CO", new int[]{2, 3, 2, 2});
        map.put("CR", new int[]{2, 2, 4, 4});
        map.put("CU", new int[]{4, 4, 3, 1});
        map.put("CV", new int[]{2, 3, 2, 4});
        map.put("CW", new int[]{1, 0, 0, 0});
        map.put("CX", new int[]{2, 2, 2, 2});
        map.put("CY", new int[]{1, 1, 1, 1});
        map.put("CZ", new int[]{0, 1, 0, 0});
        map.put("DE", new int[]{0, 2, 2, 2});
        map.put("DJ", new int[]{3, 3, 4, 0});
        map.put("DK", new int[]{0, 0, 0, 0});
        map.put("DM", new int[]{1, 0, 0, 3});
        map.put("DO", new int[]{3, 3, 4, 4});
        map.put("DZ", new int[]{3, 3, 4, 4});
        map.put("EC", new int[]{2, 4, 4, 2});
        map.put("EE", new int[]{0, 0, 0, 0});
        map.put("EG", new int[]{3, 4, 2, 2});
        map.put("EH", new int[]{2, 0, 3, 3});
        map.put("ER", new int[]{4, 2, 2, 2});
        map.put("ES", new int[]{0, 1, 1, 1});
        map.put("ET", new int[]{4, 4, 4, 0});
        map.put("FI", new int[]{0, 0, 1, 0});
        map.put("FJ", new int[]{3, 1, 3, 3});
        map.put("FK", new int[]{4, 2, 2, 3});
        map.put("FM", new int[]{4, 2, 4, 0});
        map.put("FO", new int[]{0, 0, 0, 0});
        map.put("FR", new int[]{1, 0, 3, 1});
        map.put("GA", new int[]{3, 3, 2, 1});
        map.put("GB", new int[]{0, 1, 3, 3});
        map.put("GD", new int[]{2, 0, 4, 4});
        map.put("GE", new int[]{1, 1, 0, 3});
        map.put("GF", new int[]{1, 2, 4, 4});
        map.put("GG", new int[]{0, 0, 0, 0});
        map.put("GH", new int[]{3, 3, 3, 2});
        map.put("GI", new int[]{0, 0, 0, 1});
        map.put("GL", new int[]{2, 2, 3, 4});
        map.put("GM", new int[]{4, 3, 3, 2});
        map.put("GN", new int[]{4, 4, 4, 0});
        map.put("GP", new int[]{2, 2, 1, 3});
        map.put("GQ", new int[]{4, 3, 3, 0});
        map.put("GR", new int[]{1, 1, 0, 1});
        map.put("GT", new int[]{3, 3, 3, 4});
        map.put("GU", new int[]{1, 2, 4, 4});
        map.put("GW", new int[]{4, 4, 4, 0});
        map.put("GY", new int[]{3, 4, 1, 0});
        map.put("HK", new int[]{0, 1, 4, 4});
        map.put("HN", new int[]{3, 3, 2, 2});
        map.put("HR", new int[]{1, 0, 0, 2});
        map.put("HT", new int[]{3, 4, 4, 3});
        map.put("HU", new int[]{0, 0, 1, 0});
        map.put("ID", new int[]{3, 2, 3, 4});
        map.put("IE", new int[]{0, 0, 3, 2});
        map.put("IL", new int[]{0, 1, 2, 3});
        map.put("IM", new int[]{0, 0, 0, 1});
        map.put("IN", new int[]{2, 2, 4, 4});
        map.put("IO", new int[]{4, 4, 2, 2});
        map.put("IQ", new int[]{3, 3, 4, 4});
        map.put("IR", new int[]{1, 0, 1, 0});
        map.put("IS", new int[]{0, 0, 0, 0});
        map.put("IT", new int[]{1, 0, 1, 1});
        map.put("JE", new int[]{1, 0, 0, 1});
        map.put("JM", new int[]{3, 2, 2, 1});
        map.put("JO", new int[]{1, 1, 1, 2});
        map.put("JP", new int[]{0, 2, 2, 2});
        map.put("KE", new int[]{3, 3, 3, 3});
        map.put(com.google.zxing.client.result.k.f130224q, new int[]{1, 1, 2, 3});
        map.put("KH", new int[]{2, 0, 4, 4});
        map.put("KI", new int[]{4, 4, 4, 4});
        map.put("KM", new int[]{4, 4, 3, 3});
        map.put("KN", new int[]{1, 0, 1, 4});
        map.put("KP", new int[]{1, 2, 0, 2});
        map.put("KR", new int[]{0, 3, 0, 2});
        map.put("KW", new int[]{2, 2, 1, 2});
        map.put("KY", new int[]{1, 1, 0, 2});
        map.put("KZ", new int[]{1, 2, 2, 2});
        map.put("LA", new int[]{2, 1, 1, 0});
        map.put(com.google.zxing.client.result.k.f130225r, new int[]{3, 2, 0, 0});
        map.put("LC", new int[]{2, 1, 0, 0});
        map.put("LI", new int[]{0, 0, 2, 2});
        map.put("LK", new int[]{1, 1, 2, 2});
        map.put("LR", new int[]{3, 4, 4, 1});
        map.put("LS", new int[]{3, 3, 2, 0});
        map.put("LT", new int[]{0, 0, 0, 0});
        map.put("LU", new int[]{0, 1, 0, 0});
        map.put("LV", new int[]{0, 0, 0, 0});
        map.put("LY", new int[]{4, 3, 4, 4});
        map.put("MA", new int[]{2, 1, 2, 2});
        map.put("MC", new int[]{1, 0, 1, 0});
        map.put("MD", new int[]{1, 1, 0, 0});
        map.put("ME", new int[]{1, 2, 2, 3});
        map.put("MF", new int[]{1, 4, 2, 1});
        map.put("MG", new int[]{3, 4, 1, 3});
        map.put("MH", new int[]{4, 0, 2, 3});
        map.put("MK", new int[]{1, 0, 0, 0});
        map.put("ML", new int[]{4, 4, 4, 3});
        map.put("MM", new int[]{2, 3, 1, 2});
        map.put("MN", new int[]{2, 3, 2, 4});
        map.put("MO", new int[]{0, 0, 4, 4});
        map.put("MP", new int[]{0, 2, 4, 4});
        map.put("MQ", new int[]{1, 1, 1, 3});
        map.put("MR", new int[]{4, 4, 4, 4});
        map.put("MS", new int[]{1, 4, 0, 3});
        map.put("MT", new int[]{0, 1, 0, 0});
        map.put("MU", new int[]{2, 2, 3, 4});
        map.put("MV", new int[]{3, 2, 1, 1});
        map.put("MW", new int[]{4, 2, 1, 1});
        map.put("MX", new int[]{2, 4, 3, 2});
        map.put("MY", new int[]{2, 2, 2, 3});
        map.put("MZ", new int[]{3, 4, 2, 2});
        map.put("NA", new int[]{3, 2, 2, 1});
        map.put("NC", new int[]{2, 1, 3, 2});
        map.put("NE", new int[]{4, 4, 4, 3});
        map.put("NF", new int[]{1, 2, 2, 2});
        map.put("NG", new int[]{3, 4, 3, 2});
        map.put("NI", new int[]{3, 3, 3, 4});
        map.put("NL", new int[]{0, 2, 4, 3});
        map.put("NO", new int[]{0, 1, 0, 0});
        map.put("NP", new int[]{3, 3, 2, 2});
        map.put("NR", new int[]{4, 0, 4, 0});
        map.put("NU", new int[]{2, 2, 2, 1});
        map.put("NZ", new int[]{0, 0, 0, 1});
        map.put("OM", new int[]{2, 2, 1, 3});
        map.put("PA", new int[]{1, 3, 3, 4});
        map.put("PE", new int[]{2, 3, 4, 4});
        map.put("PF", new int[]{3, 1, 0, 1});
        map.put("PG", new int[]{4, 3, 1, 1});
        map.put("PH", new int[]{3, 0, 4, 4});
        map.put("PK", new int[]{3, 3, 3, 3});
        map.put("PL", new int[]{1, 1, 1, 3});
        map.put("PM", new int[]{0, 2, 0, 0});
        map.put("PR", new int[]{2, 1, 3, 3});
        map.put("PS", new int[]{3, 3, 1, 4});
        map.put("PT", new int[]{1, 1, 0, 1});
        map.put("PW", new int[]{2, 2, 1, 1});
        map.put("PY", new int[]{3, 1, 3, 3});
        map.put("QA", new int[]{2, 3, 0, 1});
        map.put("RE", new int[]{1, 0, 2, 2});
        map.put("RO", new int[]{0, 1, 1, 2});
        map.put("RS", new int[]{1, 2, 0, 0});
        map.put("RU", new int[]{0, 1, 1, 1});
        map.put("RW", new int[]{3, 4, 2, 4});
        map.put("SA", new int[]{2, 2, 1, 2});
        map.put("SB", new int[]{4, 4, 3, 0});
        map.put("SC", new int[]{4, 2, 0, 1});
        map.put("SD", new int[]{4, 4, 4, 2});
        map.put("SE", new int[]{0, 1, 0, 0});
        map.put("SG", new int[]{1, 2, 3, 3});
        map.put("SH", new int[]{4, 4, 2, 3});
        map.put("SI", new int[]{0, 1, 0, 1});
        map.put("SJ", new int[]{0, 0, 2, 0});
        map.put("SK", new int[]{0, 1, 0, 1});
        map.put("SL", new int[]{4, 3, 2, 4});
        map.put("SM", new int[]{0, 0, 1, 3});
        map.put("SN", new int[]{4, 4, 4, 3});
        map.put("SO", new int[]{4, 4, 4, 4});
        map.put("SR", new int[]{3, 2, 2, 4});
        map.put("SS", new int[]{4, 2, 4, 2});
        map.put("ST", new int[]{3, 4, 2, 2});
        map.put("SV", new int[]{2, 3, 3, 4});
        map.put("SX", new int[]{2, 4, 1, 0});
        map.put("SY", new int[]{4, 4, 1, 0});
        map.put("SZ", new int[]{3, 4, 2, 3});
        map.put("TC", new int[]{1, 1, 3, 1});
        map.put("TD", new int[]{4, 4, 4, 3});
        map.put("TG", new int[]{3, 3, 1, 0});
        map.put("TH", new int[]{1, 3, 4, 4});
        map.put("TJ", new int[]{4, 4, 4, 4});
        map.put("TL", new int[]{4, 2, 4, 4});
        map.put("TM", new int[]{4, 1, 2, 3});
        map.put("TN", new int[]{2, 1, 1, 1});
        map.put("TO", new int[]{3, 3, 3, 1});
        map.put("TR", new int[]{1, 2, 0, 1});
        map.put("TT", new int[]{2, 3, 1, 2});
        map.put("TV", new int[]{4, 2, 2, 4});
        map.put("TW", new int[]{0, 0, 0, 1});
        map.put("TZ", new int[]{3, 3, 4, 3});
        map.put("UA", new int[]{0, 2, 1, 2});
        map.put("UG", new int[]{4, 3, 2, 3});
        map.put("US", new int[]{0, 1, 3, 3});
        map.put("UY", new int[]{2, 2, 2, 2});
        map.put("UZ", new int[]{3, 2, 2, 2});
        map.put("VA", new int[]{1, 2, 2, 2});
        map.put("VC", new int[]{2, 1, 0, 0});
        map.put("VE", new int[]{4, 4, 4, 3});
        map.put("VG", new int[]{2, 1, 1, 2});
        map.put("VI", new int[]{1, 0, 2, 4});
        map.put("VN", new int[]{0, 2, 4, 4});
        map.put("VU", new int[]{4, 1, 3, 1});
        map.put("WS", new int[]{3, 2, 3, 1});
        map.put("XK", new int[]{1, 2, 1, 0});
        map.put("YE", new int[]{4, 4, 4, 2});
        map.put("YT", new int[]{2, 0, 2, 3});
        map.put("ZA", new int[]{2, 3, 2, 2});
        map.put("ZM", new int[]{3, 3, 2, 1});
        map.put("ZW", new int[]{3, 3, 3, 1});
        return Collections.unmodifiableMap(map);
    }

    private long k(int networkType) {
        Long l10 = this.f57410b.get(networkType);
        if (l10 == null) {
            l10 = this.f57410b.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized r l(Context context) {
        try {
            if (f57406w == null) {
                f57406w = new b(context).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f57406w;
    }

    private void n(final int elapsedMs, final long bytesTransferred, final long bitrateEstimate) {
        if (elapsedMs == 0 && bytesTransferred == 0 && bitrateEstimate == this.f57421m) {
            return;
        }
        this.f57421m = bitrateEstimate;
        this.f57411c.b(new androidx.media2.exoplayer.external.util.i.a(elapsedMs, bytesTransferred, bitrateEstimate) { // from class: androidx.media2.exoplayer.external.upstream.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f57396a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f57397b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f57398c;

            {
                this.f57396a = elapsedMs;
                this.f57397b = bytesTransferred;
                this.f57398c = bitrateEstimate;
            }

            @Override // androidx.media2.exoplayer.external.util.i.a
            public void a(Object obj) {
                ((d.a) obj).l(this.f57396a, this.f57397b, this.f57398c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() throws Throwable {
        int iT;
        try {
            try {
                if (this.f57422n) {
                    iT = this.f57423o;
                } else {
                    Context context = this.f57409a;
                    iT = context == null ? 0 : androidx.media2.exoplayer.external.util.q0.T(context);
                }
                if (this.f57417i == iT) {
                    return;
                }
                this.f57417i = iT;
                if (iT == 1 || iT == 0 || iT == 8) {
                    return;
                }
                this.f57420l = k(iT);
                long jB = this.f57413e.b();
                n(this.f57414f > 0 ? (int) (jB - this.f57415g) : 0, this.f57416h, this.f57420l);
                this.f57415g = jB;
                this.f57416h = 0L;
                this.f57419k = 0L;
                this.f57418j = 0L;
                this.f57412d.g();
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.q0
    public void a(l source, o dataSpec, boolean isNetwork) {
    }

    @Override // androidx.media2.exoplayer.external.upstream.d
    public synchronized long b() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57420l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:7:0x0006, B:11:0x000e, B:13:0x002d, B:23:0x0067, B:22:0x005a), top: B:37:0x0006 }] */
    @Override // androidx.media2.exoplayer.external.upstream.q0
    public synchronized void c(l source, o dataSpec, boolean isNetwork) throws Throwable {
        Throwable th2;
        r rVar;
        try {
            if (isNetwork) {
                try {
                    androidx.media2.exoplayer.external.util.a.i(this.f57414f > 0);
                    long jB = this.f57413e.b();
                    int i10 = (int) (jB - this.f57415g);
                    this.f57418j += (long) i10;
                    long j10 = this.f57419k;
                    long j11 = this.f57416h;
                    this.f57419k = j10 + j11;
                    if (i10 > 0) {
                        this.f57412d.a((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                        if (this.f57418j < 2000) {
                            try {
                                if (this.f57419k >= PlaybackStateCompat.f9656l3) {
                                    this.f57420l = (long) this.f57412d.d(0.5f);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        } else {
                            this.f57420l = (long) this.f57412d.d(0.5f);
                        }
                        rVar = this;
                        rVar.n(i10, this.f57416h, this.f57420l);
                        rVar.f57415g = jB;
                        rVar.f57416h = 0L;
                    } else {
                        rVar = this;
                    }
                    rVar.f57414f--;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.q0
    public synchronized void d(l source, o dataSpec, boolean isNetwork, int bytes) {
        if (isNetwork) {
            try {
                this.f57416h += (long) bytes;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.d
    @androidx.annotation.p0
    public q0 e() {
        return this;
    }

    @Override // androidx.media2.exoplayer.external.upstream.d
    public void f(d.a eventListener) {
        this.f57411c.c(eventListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.d
    public void g(Handler eventHandler, d.a eventListener) {
        this.f57411c.a(eventHandler, eventListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.q0
    public synchronized void h(l source, o dataSpec, boolean isNetwork) {
        if (isNetwork) {
            try {
                if (this.f57414f == 0) {
                    this.f57415g = this.f57413e.b();
                }
                this.f57414f++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void p(int networkType) {
        try {
            this.f57423o = networkType;
            this.f57422n = true;
            o();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public r() {
        this(null, new SparseArray(), 2000, androidx.media2.exoplayer.external.util.c.f57511a, false);
    }

    private r(@androidx.annotation.p0 Context context, SparseArray<Long> initialBitrateEstimates, int maxWeight, androidx.media2.exoplayer.external.util.c clock, boolean resetOnNetworkTypeChange) {
        this.f57409a = context == null ? null : context.getApplicationContext();
        this.f57410b = initialBitrateEstimates;
        this.f57411c = new androidx.media2.exoplayer.external.util.i<>();
        this.f57412d = new androidx.media2.exoplayer.external.util.f0(maxWeight);
        this.f57413e = clock;
        int iT = context == null ? 0 : androidx.media2.exoplayer.external.util.q0.T(context);
        this.f57417i = iT;
        this.f57420l = k(iT);
        if (context == null || !resetOnNetworkTypeChange) {
            return;
        }
        c.a(context).c(this);
    }
}

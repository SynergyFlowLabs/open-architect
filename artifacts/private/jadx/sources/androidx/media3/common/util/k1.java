package androidx.media3.common.util;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.common.collect.l6;
import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.m2;
import com.google.common.util.concurrent.t1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1
    public static final int f61540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1
    @Deprecated
    public static final String f61541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b1
    @Deprecated
    public static final String f61542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b1
    @Deprecated
    public static final String f61543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1
    public static final String f61544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b1
    public static final byte[] f61545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b1
    public static final long[] f61546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f61547h = "Util";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f61548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f61549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f61550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f61551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f61552m = "format=m3u8-aapl";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f61553n = "format=mpd-time-csf";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f61554o = 120;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private static HashMap<String, String> f61555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String[] f61556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f61557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f61558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f61559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f61560u;

    @androidx.annotation.w0(29)
    private static class a {
        private a() {
        }

        public static void a(Service service, int i10, Notification notification, int i11, String str) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (RuntimeException e10) {
                z.d(k1.f61547h, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e10;
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f61540a = i10;
        String str = Build.DEVICE;
        f61541b = str;
        String str2 = Build.MANUFACTURER;
        f61542c = str2;
        String str3 = Build.MODEL;
        f61543d = str3;
        f61544e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f61545f = new byte[0];
        f61546g = new long[0];
        f61548i = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f61549j = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f61550k = Pattern.compile("%([A-Fa-f0-9]{2})");
        f61551l = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f61556q = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", io.sentry.protocol.g0.b.f306276f, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f61557r = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f61558s = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f61559t = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f61560u = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, com.planner5d.library.engine.input.f.b.B, 119, okhttp3.internal.ws.g.f334652s, 121, 108, com.planner5d.library.engine.input.f.b.f160745y1, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, com.planner5d.library.engine.input.f.b.V1, com.planner5d.library.engine.input.f.b.U1, 242, com.planner5d.library.engine.input.f.b.O1, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, androidx.media2.widget.f.i.f59801t0, 153, androidx.media2.widget.f.i.f59773f0, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, com.planner5d.library.engine.input.f.b.R1, 241, com.planner5d.library.engine.input.f.b.P1, 227, 228, 237, 234, 183, 176, 185, com.facebook.internal.p.f100029m, 171, 172, 165, 162, 143, 136, 129, 134, com.planner5d.library.engine.input.f.b.F1, com.planner5d.library.engine.input.f.b.G1, androidx.media2.widget.f.i.f59799s0, androidx.media2.widget.f.i.f59793p0, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, com.rabbitmq.client.impl.k.b.p.f265340a, 104, 97, 102, 115, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 125, 122, androidx.media2.widget.f.i.f59767c0, androidx.media2.widget.f.i.f59777h0, 135, 128, com.planner5d.library.engine.input.f.b.H1, 146, 155, androidx.media2.widget.f.i.f59797r0, 177, 182, 191, 184, 173, 170, 163, 164, com.planner5d.library.engine.input.f.b.S1, com.planner5d.library.engine.input.f.b.X1, com.planner5d.library.engine.input.f.b.Q1, 240, 229, 226, 235, 236, 193, 198, androidx.compose.runtime.m0.f36245r, 200, 221, 218, 211, 212, 105, 110, com.planner5d.library.engine.input.f.b.f160733u1, 96, me.relex.circleindicator.a.f332619e, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, com.planner5d.library.engine.input.f.b.f160742x1, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, androidx.media2.widget.f.i.f59775g0, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, com.planner5d.library.engine.input.f.b.W1, 244, com.planner5d.library.engine.input.f.b.M1};
    }

    private k1() {
    }

    @b1
    public static <T> boolean A(@androidx.annotation.p0 SparseArray<T> sparseArray, @androidx.annotation.p0 SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f61540a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    @b1
    public static long A0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static boolean A1(Activity activity, androidx.media3.common.k0... k0VarArr) {
        if (f61540a < 23) {
            return false;
        }
        for (androidx.media3.common.k0 k0Var : k0VarArr) {
            androidx.media3.common.k0.h hVar = k0Var.f60822b;
            if (hVar != null) {
                if (z1(activity, hVar.f60920a)) {
                    return true;
                }
                l6<androidx.media3.common.k0.k> l6Var = k0Var.f60822b.f60926g;
                for (int i10 = 0; i10 < l6Var.size(); i10++) {
                    if (z1(activity, l6Var.get(i10).f60947a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @b1
    public static long A2(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j10 /= 1000;
        }
        return j10;
    }

    @b1
    public static <T> int B(SparseArray<T> sparseArray) {
        if (f61540a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i10)) * 31) + Objects.hashCode(sparseArray.valueAt(i10));
        }
        return iKeyAt;
    }

    @b1
    public static int B0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    @b1
    public static long B1(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i10));
        }
        return jMin;
    }

    @b1
    public static void B2(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    @b1
    public static int C(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int iP = com.google.common.primitives.u.p(bArr[i10]);
            i12 = D(iP & 15, D(iP >> 4, i12));
            i10++;
        }
        return i12;
    }

    @b1
    public static androidx.media3.common.w C0(int i10, int i11, int i12) {
        return new androidx.media3.common.w.b().u0("audio/raw").R(i11).v0(i12).o0(i10).N();
    }

    @b1
    public static <T> void C1(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    private static int D(int i10, int i11) {
        return (f61559t[(i10 ^ ((i11 >> 12) & 255)) & 255] ^ ((i11 << 4) & 65535)) & 65535;
    }

    @b1
    public static androidx.media3.common.w D0(androidx.media3.common.audio.g.a aVar) {
        return C0(aVar.f60335c, aVar.f60334b, aVar.f60333a);
    }

    @b1
    public static long D1(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j10 *= 1000;
        }
        return j10;
    }

    @b1
    public static int E(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f61558s[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    @b1
    public static int E0(int i10, int i11) {
        return f0(i10) * i11;
    }

    @b1
    public static ExecutorService E1(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.h1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return k1.e(str, runnable);
            }
        });
    }

    @b1
    public static int F(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f61560u[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    @b1
    public static long F0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    @b1
    public static ScheduledExecutorService F1(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.j1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return k1.d(str, runnable);
            }
        });
    }

    @b1
    public static Handler G(Looper looper, @androidx.annotation.p0 Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @b1
    public static List<String> G0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add(io.sentry.protocol.b0.b.f306153h);
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add(com.facebook.share.internal.f.P0);
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i10 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    @b1
    public static String G1(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', org.apache.commons.codec.language.l.f335457d);
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strG = com.google.common.base.c.g(str);
        String str2 = m2(strG, "-")[0];
        if (f61555p == null) {
            f61555p = L();
        }
        String str3 = f61555p.get(str2);
        if (str3 != null) {
            strG = str3 + strG.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || androidx.media3.exoplayer.upstream.h.f65997k.equals(str2) || "zh".equals(str2)) ? w1(strG) : strG;
    }

    @b1
    public static Handler H() {
        return I(null);
    }

    @b1
    public static List<String> H0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @b1
    public static <T> T[] H1(T[] tArr, T t10) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t10;
        return (T[]) p(objArrCopyOf);
    }

    @b1
    public static Handler I(@androidx.annotation.p0 Handler.Callback callback) {
        return G((Looper) androidx.media3.common.util.a.k(Looper.myLooper()), callback);
    }

    @b1
    @Deprecated
    public static int I0(int i10) {
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    @b1
    public static <T> T[] I1(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @b1
    public static Handler J() {
        return K(null);
    }

    @b1
    public static String J0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    @b1
    public static <T> T[] J1(T[] tArr, int i10) {
        androidx.media3.common.util.a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    @b1
    public static Handler K(@androidx.annotation.p0 Handler.Callback callback) {
        return G(n0(), callback);
    }

    @b1
    public static String[] K0() {
        String[] strArrL0 = L0();
        for (int i10 = 0; i10 < strArrL0.length; i10++) {
            strArrL0[i10] = G1(strArrL0[i10]);
        }
        return strArrL0;
    }

    @b1
    public static <T> T[] K1(T[] tArr, int i10, int i11) {
        androidx.media3.common.util.a.a(i10 >= 0);
        androidx.media3.common.util.a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    private static HashMap<String, String> L() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f61556q.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f61556q;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    private static String[] L0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f61540a >= 24 ? M0(configuration) : new String[]{x0(configuration.locale)};
    }

    @b1
    public static <T> void L1(List<T> list, T[] tArr) {
        androidx.media3.common.util.a.i(list.size() == tArr.length);
        list.toArray(tArr);
    }

    @b1
    public static ByteBuffer M(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    @androidx.annotation.w0(24)
    private static String[] M0(Configuration configuration) {
        return l2(configuration.getLocales().toLanguageTags(), ",");
    }

    @b1
    public static long M1(String str) throws androidx.media3.common.v0 {
        Matcher matcher = f61548i.matcher(str);
        if (!matcher.matches()) {
            throw androidx.media3.common.v0.a("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase(org.locationtech.jts.io.gml2.a.f338505w)) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(org.apache.commons.lang3.time.m.f337525a));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
    }

    @b1
    public static File N(Context context, String str) throws IOException {
        File fileO = O(context, str);
        fileO.delete();
        fileO.mkdir();
        return fileO;
    }

    @androidx.annotation.p0
    private static String N0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            z.e(f61547h, "Failed to read system property " + str, e10);
            return null;
        }
    }

    @b1
    public static long N1(String str) {
        Matcher matcher = f61549j.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j10 : j10;
    }

    @b1
    public static File O(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) androidx.media3.common.util.a.g(context.getCacheDir()));
    }

    @b1
    public static String O0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return com.planner5d.library.model.payments.a.f222474i;
                }
                return "custom (" + i10 + ")";
        }
    }

    @b1
    public static boolean O1(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    @b1
    public static long P(long j10, int i10) {
        return a2(j10, i10, 1000000L, RoundingMode.UP);
    }

    @b1
    public static String P0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = com.planner5d.library.model.payments.a.f222474i;
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + androidx.media3.common.p0.f61021c;
    }

    @b1
    public static <T> t1<T> P1(Handler handler, final Runnable runnable, final T t10) {
        final m2 m2VarF = m2.F();
        O1(handler, new Runnable() { // from class: androidx.media3.common.util.i1
            @Override // java.lang.Runnable
            public final void run() {
                k1.a(m2VarF, runnable, t10);
            }
        });
        return m2VarF;
    }

    @b1
    public static String Q(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (g2(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (g2(cCharAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(cCharAt));
                i11--;
            } else {
                sb2.append(cCharAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        return sb2.toString();
    }

    @b1
    public static byte[] Q0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    @b1
    public static boolean Q1(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @b1
    public static Uri R(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f61551l.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    @b1
    public static byte[] R0(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @b1
    public static void R1(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                R1(file2);
            }
        }
        file.delete();
    }

    @b1
    public static String S(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean S0(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        if (z0Var == null || !z0Var.P0(1)) {
            return false;
        }
        z0Var.pause();
        return true;
    }

    @b1
    @androidx.annotation.p0
    public static Intent S1(Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return f61540a < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    @b1
    public static String T(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033 A[RETURN] */
    public static boolean T0(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        boolean z10 = false;
        if (z0Var == null) {
            return false;
        }
        int iH = z0Var.H();
        if (iH != 1 || !z0Var.P0(2)) {
            if (iH == 4 && z0Var.P0(4)) {
                z0Var.U();
            }
            if (z0Var.P0(1)) {
                return z10;
            }
            z0Var.B();
            return true;
        }
        z0Var.A();
        z10 = true;
        if (z0Var.P0(1)) {
            return z10;
        }
        z0Var.B();
        return true;
    }

    @b1
    public static <T> void T1(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    @b1
    public static String U(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static boolean U0(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        return V0(z0Var, true);
    }

    @androidx.annotation.w0(api = 23)
    private static boolean U1(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    @b1
    public static int V(Context context) {
        return androidx.media3.common.audio.d.c(context).generateAudioSessionId();
    }

    @b1
    public static boolean V0(@androidx.annotation.p0 androidx.media3.common.z0 z0Var, boolean z10) {
        return i2(z0Var, z10) ? T0(z0Var) : S0(z0Var);
    }

    @androidx.annotation.w0(api = 33)
    private static boolean V1(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    @androidx.annotation.p0
    public static String W(int i10) {
        if (i10 == 0) {
            return "application/dash+xml";
        }
        if (i10 == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (i10 != 2) {
            return null;
        }
        return "application/x-mpegURL";
    }

    public static int W0(Uri uri) {
        int iZ0;
        String scheme = uri.getScheme();
        if (scheme != null && com.google.common.base.c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iZ0 = Z0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iZ0;
        }
        Matcher matcher = f61551l.matcher((CharSequence) androidx.media3.common.util.a.g(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains(f61553n)) {
                return 0;
            }
            if (strGroup.contains(f61552m)) {
                return 2;
            }
        }
        return 1;
    }

    @b1
    public static long W1(long j10, int i10) {
        return a2(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    @b1
    public static int X(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @b1
    @Deprecated
    public static int X0(Uri uri, @androidx.annotation.p0 String str) {
        return TextUtils.isEmpty(str) ? W0(uri) : Z0(str);
    }

    @b1
    public static long X1(long j10, long j11, long j12) {
        return a2(j10, j11, j12, RoundingMode.DOWN);
    }

    @b1
    @Deprecated
    public static int Y(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) {
                return 4;
            }
            if (i10 != 10) {
                return 2;
            }
        }
        return 1;
    }

    @b1
    @Deprecated
    public static int Y0(String str) {
        return W0(Uri.parse("file:///" + str));
    }

    @b1
    public static long[] Y1(List<Long> list, long j10, long j11) {
        return c2(list, j10, j11, RoundingMode.DOWN);
    }

    @b1
    public static AudioFormat Z(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static int Z0(String str) {
        String strG = com.google.common.base.c.g(str);
        strG.getClass();
        int i10 = 3 & (-1);
        switch (strG) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    @b1
    public static void Z1(long[] jArr, long j10, long j11) {
        d2(jArr, j10, j11, RoundingMode.DOWN);
    }

    public static /* synthetic */ void a(m2 m2Var, Runnable runnable, Object obj) {
        try {
            if (m2Var.isCancelled()) {
                return;
            }
            runnable.run();
            m2Var.B(obj);
        } catch (Throwable th2) {
            m2Var.C(th2);
        }
    }

    @b1
    @e.a({"InlinedApi"})
    public static int a0(int i10) {
        if (i10 == 10) {
            return f61540a >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return f61540a >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return com.planner5d.library.engine.input.f.b.V1;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int a1(Uri uri, @androidx.annotation.p0 String str) {
        if (str == null) {
            return W0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    @b1
    public static long a2(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return com.google.common.math.h.g(j10, com.google.common.math.h.g(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return com.google.common.math.h.y(j10, com.google.common.math.h.g(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? b2(j10, j11, j12, roundingMode) : com.google.common.math.h.y(j11, com.google.common.math.h.g(j10, j12, RoundingMode.UNNECESSARY));
        }
        return com.google.common.math.h.g(j11, com.google.common.math.h.g(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static /* synthetic */ void b(m2 m2Var, t1 t1Var) {
        if (m2Var.isCancelled()) {
            t1Var.cancel(false);
        }
    }

    @b1
    public static int b0(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                if (i10 != 8) {
                    return i10 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i11;
    }

    @b1
    public static boolean b1(o0 o0Var, o0 o0Var2, @androidx.annotation.p0 Inflater inflater) {
        if (o0Var.a() <= 0) {
            return false;
        }
        if (o0Var2.b() < o0Var.a()) {
            o0Var2.c(o0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(o0Var.e(), o0Var.f(), o0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(o0Var2.e(), iInflate, o0Var2.b() - iInflate);
                if (inflater.finished()) {
                    o0Var2.Z(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == o0Var2.b()) {
                        o0Var2.c(o0Var2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    private static long b2(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jY = com.google.common.math.h.y(j10, j11);
        if (jY != Long.MAX_VALUE && jY != Long.MIN_VALUE) {
            return com.google.common.math.h.g(jY, j12, roundingMode);
        }
        long jK = com.google.common.math.h.k(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jG = com.google.common.math.h.g(j11, jK, roundingMode2);
        long jG2 = com.google.common.math.h.g(j12, jK, roundingMode2);
        long jK2 = com.google.common.math.h.k(Math.abs(j10), Math.abs(jG2));
        long jG3 = com.google.common.math.h.g(j10, jK2, roundingMode2);
        long jG4 = com.google.common.math.h.g(jG2, jK2, roundingMode2);
        long jY2 = com.google.common.math.h.y(jG3, jG);
        if (jY2 != Long.MAX_VALUE && jY2 != Long.MIN_VALUE) {
            return com.google.common.math.h.g(jY2, jG4, roundingMode);
        }
        double d10 = jG3 * (jG / jG4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.common.math.c.q(d10, roundingMode);
    }

    public static /* synthetic */ void c(t1 t1Var, m2 m2Var, com.google.common.util.concurrent.w wVar) {
        try {
            try {
                m2Var.D(wVar.apply(com.google.common.util.concurrent.h1.j(t1Var)));
            } catch (Throwable th2) {
                m2Var.C(th2);
            }
        } catch (Error | RuntimeException e10) {
            m2Var.C(e10);
        } catch (CancellationException unused) {
            m2Var.cancel(false);
        } catch (ExecutionException e11) {
            e = e11;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            m2Var.C(e);
        }
    }

    @b1
    public static String c0(int i10) {
        if (i10 == 0) {
            return "undefined";
        }
        if (i10 == 1) {
            return "original";
        }
        if (i10 == 2) {
            return "depth-linear";
        }
        if (i10 == 3) {
            return "depth-inverse";
        }
        if (i10 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    @b1
    public static String c1(int i10) {
        return Integer.toString(i10, 36);
    }

    @b1
    public static long[] c2(List<Long> list, long j10, long j11, RoundingMode roundingMode) {
        long j12 = j10;
        long j13 = j11;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j12 != 0) {
            int i10 = 0;
            if (j13 >= j12 && j13 % j12 == 0) {
                long jG = com.google.common.math.h.g(j13, j12, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = com.google.common.math.h.g(list.get(i10).longValue(), jG, roundingMode2);
                    i10++;
                }
            } else if (j13 >= j12 || j12 % j13 != 0) {
                int i11 = 0;
                while (i11 < size) {
                    long jLongValue = list.get(i11).longValue();
                    if (jLongValue != 0) {
                        if (j13 >= jLongValue && j13 % jLongValue == 0) {
                            jArr[i11] = com.google.common.math.h.g(j12, com.google.common.math.h.g(j13, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j13 >= jLongValue || jLongValue % j13 != 0) {
                            jArr[i11] = b2(jLongValue, j12, j13, roundingMode2);
                        } else {
                            jArr[i11] = com.google.common.math.h.y(j12, com.google.common.math.h.g(jLongValue, j13, RoundingMode.UNNECESSARY));
                        }
                    }
                    i11++;
                    j12 = j10;
                    j13 = j11;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jG2 = com.google.common.math.h.g(j12, j13, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = com.google.common.math.h.y(list.get(i10).longValue(), jG2);
                    i10++;
                }
            }
        }
        return jArr;
    }

    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @b1
    public static androidx.media3.common.z0.c d0(androidx.media3.common.z0 z0Var, androidx.media3.common.z0.c cVar) {
        boolean zX = z0Var.x();
        boolean zK1 = z0Var.k1();
        boolean zC2 = z0Var.c2();
        boolean zO0 = z0Var.O0();
        boolean zX1 = z0Var.x1();
        boolean zT1 = z0Var.T1();
        boolean zW = z0Var.c0().w();
        boolean z10 = false;
        androidx.media3.common.z0.c.a aVarE = new androidx.media3.common.z0.c.a().b(cVar).e(4, !zX).e(5, zK1 && !zX).e(6, zC2 && !zX).e(7, !zW && (zC2 || !zX1 || zK1) && !zX).e(8, zO0 && !zX).e(9, !zW && (zO0 || (zX1 && zT1)) && !zX).e(10, !zX).e(11, zK1 && !zX);
        if (zK1 && !zX) {
            z10 = true;
        }
        return aVarE.e(12, z10).f();
    }

    private static boolean d1(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String canonicalPath3 = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            return canonicalPath.startsWith(canonicalPath2) || (canonicalPath3 != null && canonicalPath.startsWith(canonicalPath3));
        } catch (IOException unused) {
            return false;
        }
    }

    @b1
    public static void d2(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long jG = com.google.common.math.h.g(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = com.google.common.math.h.g(jArr[i10], jG, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long jG2 = com.google.common.math.h.g(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = com.google.common.math.h.y(jArr[i10], jG2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = com.google.common.math.h.g(j10, com.google.common.math.h.g(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = b2(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = com.google.common.math.h.y(j10, com.google.common.math.h.g(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static /* synthetic */ Thread e(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @b1
    public static int e0(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    @b1
    public static boolean e1(Context context) {
        return f61540a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @b1
    public static void e2(Service service, int i10, Notification notification, int i11, String str) {
        if (f61540a >= 29) {
            a.a(service, i10, notification, i11, str);
        } else {
            service.startForeground(i10, notification);
        }
    }

    @b1
    public static long f(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    @b1
    public static int f0(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    @b1
    public static boolean f1(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return f61540a >= 34;
            case "image/heic":
            case "image/heif":
                return f61540a >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @b1
    @il.e(expression = {"#1"}, result = true)
    public static boolean f2(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        return (z0Var == null || !z0Var.P0(1) || (z0Var.P0(17) && z0Var.c0().w())) ? false : true;
    }

    @b1
    @z7.m(imports = {"java.util.Objects"}, replacement = "Objects.equals(o1, o2)")
    @Deprecated
    public static boolean g(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        return Objects.equals(obj, obj2);
    }

    @b1
    public static byte[] g0(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    @b1
    public static boolean g1(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    private static boolean g2(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    @b1
    public static <T extends Comparable<? super T>> int h(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= size || list.get(i10).compareTo(t10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(list.size() - 1, i11) : i11;
    }

    @b1
    public static int h0(@androidx.annotation.p0 String str, int i10) {
        int i11 = 0;
        for (String str2 : n2(str)) {
            if (i10 == androidx.media3.common.s0.o(str2)) {
                i11++;
            }
        }
        return i11;
    }

    @b1
    public static boolean h1(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    @il.e(expression = {"#1"}, result = false)
    public static boolean h2(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        return i2(z0Var, true);
    }

    @b1
    public static int i(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= iArr.length || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.min(iArr.length - 1, i12) : i12;
    }

    @b1
    @androidx.annotation.p0
    public static String i0(@androidx.annotation.p0 String str, int i10) {
        String[] strArrN2 = n2(str);
        if (strArrN2.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrN2) {
            if (i10 == androidx.media3.common.s0.o(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @b1
    public static boolean i1(Context context) {
        int i10 = f61540a;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 != 30) {
                if (i10 == 34) {
                }
                return false;
            }
            String str = Build.MODEL;
            if (!com.google.common.base.c.a(str, "moto g(20)") && !com.google.common.base.c.a(str, "rmx3231")) {
                if (i10 == 34 || !com.google.common.base.c.a(Build.MODEL, "sm-x200")) {
                    return false;
                }
            }
        }
        return true;
    }

    @b1
    @il.e(expression = {"#1"}, result = false)
    public static boolean i2(@androidx.annotation.p0 androidx.media3.common.z0 z0Var, boolean z10) {
        return z0Var == null || !z0Var.J() || z0Var.H() == 1 || z0Var.H() == 4 || (z10 && z0Var.V1() != 0);
    }

    @b1
    public static int j(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(jArr.length - 1, i11) : i11;
    }

    @b1
    @androidx.annotation.p0
    public static String j0(@androidx.annotation.p0 String str, int i10) {
        String[] strArrN2 = n2(str);
        if (strArrN2.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrN2) {
            if (i10 != androidx.media3.common.s0.o(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @b1
    public static boolean j1(int i10) {
        return i10 == 10 || i10 == 13;
    }

    @b1
    public static void j2(Throwable th2) throws Throwable {
        k2(th2);
    }

    @b1
    public static int k(a0 a0Var, long j10, boolean z10, boolean z11) {
        int i10;
        int iD = a0Var.d() - 1;
        int i11 = 0;
        while (i11 <= iD) {
            int i12 = (i11 + iD) >>> 1;
            if (a0Var.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                iD = i12 - 1;
            }
        }
        if (z10 && (i10 = iD + 1) < a0Var.d() && a0Var.c(i10) == j10) {
            return i10;
        }
        if (z11 && iD == -1) {
            return 0;
        }
        return iD;
    }

    @b1
    public static String k0(@androidx.annotation.p0 Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.c.j(networkCountryIso);
            }
        }
        return com.google.common.base.c.j(Locale.getDefault().getCountry());
    }

    @b1
    public static boolean k1(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || com.facebook.share.internal.k.f101891c.equals(scheme);
    }

    private static <T extends Throwable> void k2(Throwable th2) throws Throwable {
        throw th2;
    }

    @b1
    public static <T extends Comparable<? super T>> int l(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int iMax;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            iMax = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || list.get(i10).compareTo(t10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            iMax = z10 ? iBinarySearch : i10;
        }
        if (z11) {
            iMax = Math.max(0, iMax);
        }
        return iMax;
    }

    @b1
    public static Point l0(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) androidx.media3.common.util.a.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m0(context, display);
    }

    private static boolean l1(Uri uri) {
        if (!FirebaseAnalytics.d.P.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        if (!"external".equals(str) && !"external_primary".equals(str)) {
            return false;
        }
        return true;
    }

    @b1
    public static String[] l2(String str, String str2) {
        return str.split(str2, -1);
    }

    @b1
    public static int m(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    @b1
    public static Point m0(Context context, Display display) {
        if (display.getDisplayId() == 0 && p1(context)) {
            String strN0 = f61540a < 28 ? N0("sys.display-size") : N0("vendor.display-size");
            if (!TextUtils.isEmpty(strN0)) {
                try {
                    String[] strArrL2 = l2(strN0.trim(), "x");
                    if (strArrL2.length == 2) {
                        int i10 = Integer.parseInt(strArrL2[0]);
                        int i11 = 5 ^ 1;
                        int i12 = Integer.parseInt(strArrL2[1]);
                        if (i10 > 0 && i12 > 0) {
                            return new Point(i10, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                z.d(f61547h, "Invalid display size: " + strN0);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f61540a >= 23) {
            q0(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    @androidx.annotation.k(api = 23)
    private static boolean m1(Activity activity, Uri uri) {
        if (f61540a < 23) {
            return false;
        }
        if (k1(uri)) {
            return !d1(activity, uri);
        }
        return l1(uri);
    }

    @b1
    public static String[] m2(String str, String str2) {
        return str.split(str2, 2);
    }

    @b1
    public static int n(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    @b1
    public static Looper n0() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    @b1
    public static boolean n1() {
        String strG = com.google.common.base.c.g(Build.DEVICE);
        return strG.contains("emulator") || strG.contains("emu64a") || strG.contains("emu64x") || strG.contains("generic");
    }

    @b1
    public static String[] n2(@androidx.annotation.p0 String str) {
        return TextUtils.isEmpty(str) ? new String[0] : l2(str.trim(), "(\\s*,\\s*)");
    }

    @b1
    @il.d({"#1"})
    public static <T> T o(@androidx.annotation.p0 T t10) {
        return t10;
    }

    @b1
    public static Uri o0(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    @androidx.annotation.w0(api = 24)
    private static boolean o1(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) androidx.media3.common.util.a.g(uri.getHost()));
    }

    @b1
    @androidx.annotation.p0
    public static ComponentName o2(Context context, Intent intent) {
        return f61540a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    @b1
    @il.d({"#1"})
    public static <T> T[] p(T[] tArr) {
        return tArr;
    }

    @b1
    public static Locale p0() {
        return f61540a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    @b1
    public static boolean p1(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @b1
    public static long p2(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    @b1
    public static int q(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    @androidx.annotation.w0(23)
    private static void q0(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    @b1
    public static boolean q1(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    @b1
    public static long q2(long... jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @b1
    public static long r(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    @b1
    public static Drawable r0(Context context, Resources resources, @androidx.annotation.v int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }

    @b1
    public static int r1(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @b1
    public static boolean r2(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static boolean s(androidx.media3.common.k0... k0VarArr) {
        if (f61540a < 24) {
            return true;
        }
        for (androidx.media3.common.k0 k0Var : k0VarArr) {
            androidx.media3.common.k0.h hVar = k0Var.f60822b;
            if (hVar != null) {
                if (o1(hVar.f60920a)) {
                    return false;
                }
                for (int i10 = 0; i10 < k0Var.f60822b.f60926g.size(); i10++) {
                    if (o1(k0Var.f60822b.f60926g.get(i10).f60947a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @androidx.annotation.p0
    public static UUID s0(String str) {
        String strG = com.google.common.base.c.g(str);
        strG.getClass();
        switch (strG) {
            case "playready":
                return androidx.media3.common.j.f60724o2;
            case "widevine":
                return androidx.media3.common.j.f60719n2;
            case "clearkey":
                return androidx.media3.common.j.f60714m2;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    @b1
    public static int s1(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    @b1
    public static byte[] s2(float f10) {
        return com.google.common.primitives.l.F(Float.floatToIntBits(f10));
    }

    @b1
    public static void t(@androidx.annotation.p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @b1
    public static int t0(int i10) {
        if (i10 == 2 || i10 == 4) {
            return androidx.media3.common.x0.E3;
        }
        if (i10 == 10) {
            return androidx.media3.common.x0.D3;
        }
        if (i10 == 7) {
            return androidx.media3.common.x0.E3;
        }
        if (i10 != 8) {
            switch (i10) {
                case 15:
                    break;
                case 16:
                case 18:
                    return androidx.media3.common.x0.E3;
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                    return androidx.media3.common.x0.D3;
                default:
                    switch (i10) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            return androidx.media3.common.x0.B3;
                        default:
                            return androidx.media3.common.x0.F3;
                    }
            }
        }
        return androidx.media3.common.x0.C3;
    }

    @b1
    public static String t1(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return T(com.google.common.io.h.u(inputStreamOpen));
        } finally {
            t(inputStreamOpen);
        }
    }

    @b1
    @Deprecated
    public static byte[] t2(InputStream inputStream) throws IOException {
        return com.google.common.io.h.u(inputStream);
    }

    @b1
    public static int u(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    @b1
    public static int u0(@androidx.annotation.p0 String str) {
        String[] strArrL2;
        int length;
        boolean z10;
        int i10 = 0;
        if (str == null || (length = (strArrL2 = l2(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrL2[length - 1];
        if (length < 3 || !"neg".equals(strArrL2[length - 2])) {
            z10 = false;
        } else {
            z10 = true;
            int i11 = 5 & 1;
        }
        try {
            i10 = Integer.parseInt((String) androidx.media3.common.util.a.g(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    @b1
    public static long u1(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMax = Math.max(jMax, sparseLongArray.valueAt(i10));
        }
        return jMax;
    }

    @b1
    public static byte[] u2(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i10 = 0;
        for (int i11 : iArr) {
            bArr[i10] = (byte) (i11 >> 24);
            bArr[i10 + 1] = (byte) (i11 >> 16);
            int i12 = i10 + 3;
            bArr[i10 + 2] = (byte) (i11 >> 8);
            i10 += 4;
            bArr[i12] = (byte) i11;
        }
        return bArr;
    }

    @b1
    public static float v(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    @b1
    public static String v0(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    @b1
    public static boolean v1(o0 o0Var, o0 o0Var2, @androidx.annotation.p0 Inflater inflater) {
        return o0Var.a() > 0 && o0Var.k() == 120 && b1(o0Var, o0Var2, inflater);
    }

    @b1
    public static String v2(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & com.google.common.base.c.f116464q, 16));
        }
        return sb2.toString();
    }

    @b1
    public static int w(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    @b1
    public static int w0(String str) {
        int length = str.length();
        androidx.media3.common.util.a.a(length <= 4);
        int iCharAt = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt << 8) | str.charAt(i10);
        }
        return iCharAt;
    }

    private static String w1(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f61557r;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    @b1
    public static long w2(int i10, int i11) {
        return x2(i11) | (x2(i10) << 32);
    }

    @b1
    public static long x(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    @b1
    public static String x0(Locale locale) {
        return locale.toLanguageTag();
    }

    @Deprecated
    public static boolean x1(Activity activity, Uri... uriArr) {
        int i10 = 4 << 0;
        for (Uri uri : uriArr) {
            if (z1(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    @b1
    public static long x2(int i10) {
        return ((long) i10) & com.rabbitmq.client.k0.f265952a;
    }

    @b1
    public static <T> boolean y(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    @b1
    public static int y0(Context context) {
        return i1(context) ? 1 : 5;
    }

    @Deprecated
    public static boolean y1(Activity activity, androidx.media3.common.k0... k0VarArr) {
        return A1(activity, k0VarArr);
    }

    @b1
    public static <T, U> t1<T> y2(final t1<U> t1Var, final com.google.common.util.concurrent.w<U, T> wVar) {
        final m2 m2VarF = m2.F();
        m2VarF.m0(new Runnable() { // from class: androidx.media3.common.util.f1
            @Override // java.lang.Runnable
            public final void run() {
                k1.b(m2VarF, t1Var);
            }
        }, a2.c());
        t1Var.m0(new Runnable() { // from class: androidx.media3.common.util.g1
            @Override // java.lang.Runnable
            public final void run() {
                k1.c(t1Var, m2VarF, wVar);
            }
        }, a2.c());
        return m2VarF;
    }

    @b1
    public static boolean z(Object[] objArr, @androidx.annotation.p0 Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @b1
    public static long z0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    private static boolean z1(Activity activity, Uri uri) {
        if (m1(activity, uri)) {
            return f61540a < 33 ? U1(activity) : V1(activity);
        }
        return false;
    }

    @b1
    @androidx.annotation.p0
    public static String z2(String str) {
        int length = str.length();
        int iEnd = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '%') {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int i12 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i12);
        Matcher matcher = f61550k.matcher(str);
        while (i10 > 0 && matcher.find()) {
            char c10 = (char) Integer.parseInt((String) androidx.media3.common.util.a.g(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c10);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i12) {
            return null;
        }
        return sb2.toString();
    }
}

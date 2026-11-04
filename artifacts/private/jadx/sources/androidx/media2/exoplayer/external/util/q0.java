package androidx.media2.exoplayer.external.util;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.t0;
import androidx.media2.exoplayer.external.u0;
import androidx.media2.exoplayer.external.w0;
import androidx.media2.exoplayer.external.x0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f57627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f57628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f57629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f57630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f57631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f57632g = "Util";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f57633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f57634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f57635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private static HashMap<String, String> f57636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f57637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f57638m;

    class a implements androidx.media2.exoplayer.external.video.u {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void J(androidx.media2.exoplayer.external.decoder.d dVar) {
            androidx.media2.exoplayer.external.video.m.d(this, dVar);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void L(androidx.media2.exoplayer.external.decoder.d dVar) {
            androidx.media2.exoplayer.external.video.m.e(this, dVar);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void c(int i10, long j10) {
            androidx.media2.exoplayer.external.video.m.a(this, i10, j10);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void d(String str, long j10, long j11) {
            androidx.media2.exoplayer.external.video.m.c(this, str, j10, j11);
        }

        @Override // androidx.media2.exoplayer.external.video.u, androidx.media2.exoplayer.external.video.l
        public void e(int i10, int i11, int i12, float f10) {
            androidx.media2.exoplayer.external.video.m.g(this, i10, i11, i12, f10);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void m(Format format) {
            androidx.media2.exoplayer.external.video.m.f(this, format);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void w(Surface surface) {
            androidx.media2.exoplayer.external.video.m.b(this, surface);
        }
    }

    class b implements androidx.media2.exoplayer.external.audio.r {
        b() {
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void I(int i10, long j10, long j11) {
            androidx.media2.exoplayer.external.audio.k.f(this, i10, j10, j11);
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void Q(androidx.media2.exoplayer.external.decoder.d dVar) {
            androidx.media2.exoplayer.external.audio.k.b(this, dVar);
        }

        @Override // androidx.media2.exoplayer.external.audio.r, androidx.media2.exoplayer.external.audio.i
        public void a(int i10) {
            androidx.media2.exoplayer.external.audio.k.e(this, i10);
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void b(String str, long j10, long j11) {
            androidx.media2.exoplayer.external.audio.k.a(this, str, j10, j11);
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void o(androidx.media2.exoplayer.external.decoder.d dVar) {
            androidx.media2.exoplayer.external.audio.k.c(this, dVar);
        }

        @Override // androidx.media2.exoplayer.external.audio.r
        public void q(Format format) {
            androidx.media2.exoplayer.external.audio.k.d(this, format);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f57626a = i10;
        String str = Build.DEVICE;
        f57627b = str;
        String str2 = Build.MANUFACTURER;
        f57628c = str2;
        String str3 = Build.MODEL;
        f57629d = str3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i10);
        f57630e = sb2.toString();
        f57631f = new byte[0];
        f57633h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f57634i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f57635j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f57637l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", io.sentry.protocol.g0.b.f306276f, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};
        f57638m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    private q0() {
    }

    public static String A(String fileName) {
        int length = fileName.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (L0(fileName.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return fileName;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char cCharAt = fileName.charAt(i10);
            if (L0(cCharAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(cCharAt));
                i11--;
            } else {
                sb2.append(cCharAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append((CharSequence) fileName, i10, length);
        }
        return sb2.toString();
    }

    public static <T> T[] A0(T[] tArr, int i10) {
        androidx.media2.exoplayer.external.util.a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static String B(String format, Object... args) {
        return String.format(Locale.US, format, args);
    }

    public static <T> T[] B0(T[] tArr, int i10, int i11) {
        androidx.media2.exoplayer.external.util.a.a(i10 >= 0);
        androidx.media2.exoplayer.external.util.a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static String C(byte[] bytes) {
        return new String(bytes, Charset.forName("UTF-8"));
    }

    public static long C0(String value) throws androidx.media2.exoplayer.external.k0 {
        Matcher matcher = f57633h.matcher(value);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(value);
            throw new androidx.media2.exoplayer.external.k0(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "));
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
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - ((long) (i10 * 60000)) : timeInMillis;
    }

    public static String D(byte[] bytes, int offset, int length) {
        return new String(bytes, offset, length, Charset.forName("UTF-8"));
    }

    public static long D0(String value) {
        Matcher matcher = f57634i.matcher(value);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(value) * 3600.0d * 1000.0d);
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

    public static int E(int streamType) {
        if (streamType != 0) {
            return (streamType == 1 || streamType == 2 || streamType == 4 || streamType == 5 || streamType == 8) ? 4 : 2;
        }
        return 1;
    }

    public static boolean E0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int F(int channelCount) {
        switch (channelCount) {
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
                int i10 = f57626a;
                return (i10 < 23 && i10 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static void F0(File fileOrDirectory) {
        File[] fileArrListFiles = fileOrDirectory.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                F0(file);
            }
        }
        fileOrDirectory.delete();
    }

    public static int G(int streamType) {
        if (streamType == 0) {
            return 2;
        }
        if (streamType == 1) {
            return 13;
        }
        if (streamType == 2) {
            return 6;
        }
        int i10 = 4;
        if (streamType != 4) {
            i10 = 5;
            if (streamType != 5) {
                return streamType != 8 ? 1 : 3;
            }
        }
        return i10;
    }

    public static <T> void G0(List<T> list, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > list.size() || fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        if (fromIndex != toIndex) {
            list.subList(fromIndex, toIndex).clear();
        }
    }

    public static byte[] H(String hexString) {
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(hexString.charAt(i11), 16) << 4) + Character.digit(hexString.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static long H0(long positionUs, x0 seekParameters, long firstSyncUs, long secondSyncUs) {
        if (x0.f57922c.equals(seekParameters)) {
            return positionUs;
        }
        long jS0 = S0(positionUs, seekParameters.f57927a, Long.MIN_VALUE);
        long jA = a(positionUs, seekParameters.f57928b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = jS0 <= firstSyncUs && firstSyncUs <= jA;
        if (jS0 <= secondSyncUs && secondSyncUs <= jA) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(firstSyncUs - positionUs) <= Math.abs(secondSyncUs - positionUs)) {
                return firstSyncUs;
            }
            return secondSyncUs;
        }
        if (!z11) {
            if (!z10) {
                return jS0;
            }
            return secondSyncUs;
        }
        return firstSyncUs;
    }

    @androidx.annotation.p0
    public static String I(String codecs, int trackType) {
        String[] strArrQ0 = Q0(codecs);
        if (strArrQ0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArrQ0) {
            if (trackType == s.i(str)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static long I0(long timestamp, long multiplier, long divisor) {
        if (divisor >= multiplier && divisor % multiplier == 0) {
            return timestamp / (divisor / multiplier);
        }
        if (divisor < multiplier && multiplier % divisor == 0) {
            return timestamp * (multiplier / divisor);
        }
        return (long) (timestamp * (multiplier / divisor));
    }

    public static String J(Object[] objects) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objects.length; i10++) {
            sb2.append(objects[i10].getClass().getSimpleName());
            if (i10 < objects.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static long[] J0(List<Long> timestamps, long multiplier, long divisor) {
        int size = timestamps.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (divisor >= multiplier && divisor % multiplier == 0) {
            long j10 = divisor / multiplier;
            while (i10 < size) {
                jArr[i10] = timestamps.get(i10).longValue() / j10;
                i10++;
            }
        } else if (divisor >= multiplier || multiplier % divisor != 0) {
            double d10 = multiplier / divisor;
            while (i10 < size) {
                jArr[i10] = (long) (timestamps.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j11 = multiplier / divisor;
            while (i10 < size) {
                jArr[i10] = timestamps.get(i10).longValue() * j11;
                i10++;
            }
        }
        return jArr;
    }

    public static String K(@androidx.annotation.p0 Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return W0(networkCountryIso);
            }
        }
        return W0(Locale.getDefault().getCountry());
    }

    public static void K0(long[] timestamps, long multiplier, long divisor) {
        int i10 = 0;
        if (divisor >= multiplier && divisor % multiplier == 0) {
            long j10 = divisor / multiplier;
            while (i10 < timestamps.length) {
                timestamps[i10] = timestamps[i10] / j10;
                i10++;
            }
        } else if (divisor >= multiplier || multiplier % divisor != 0) {
            double d10 = multiplier / divisor;
            while (i10 < timestamps.length) {
                timestamps[i10] = (long) (timestamps[i10] * d10);
                i10++;
            }
        } else {
            long j11 = multiplier / divisor;
            while (i10 < timestamps.length) {
                timestamps[i10] = timestamps[i10] * j11;
                i10++;
            }
        }
    }

    private static void L(Display display, Point outSize) {
        display.getSize(outSize);
    }

    private static boolean L0(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    @e.b(17)
    private static void M(Display display, Point outSize) {
        display.getRealSize(outSize);
    }

    public static void M0(Throwable t10) throws Throwable {
        N0(t10);
    }

    @e.b(23)
    private static void N(Display display, Point outSize) {
        Display.Mode mode = display.getMode();
        outSize.x = mode.getPhysicalWidth();
        outSize.y = mode.getPhysicalHeight();
    }

    private static <T extends Throwable> void N0(Throwable t10) throws Throwable {
        throw t10;
    }

    @androidx.annotation.p0
    public static UUID O(String drmScheme) {
        String strV0 = V0(drmScheme);
        strV0.getClass();
        int i10 = 4 & (-1);
        switch (strV0) {
            case "playready":
                return androidx.media2.exoplayer.external.c.A1;
            case "widevine":
                return androidx.media2.exoplayer.external.c.f53750z1;
            case "clearkey":
                return androidx.media2.exoplayer.external.c.f53747y1;
            default:
                try {
                    return UUID.fromString(drmScheme);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static String[] O0(String value, String regex) {
        return value.split(regex, -1);
    }

    public static int P(String string) {
        int length = string.length();
        androidx.media2.exoplayer.external.util.a.a(length <= 4);
        int iCharAt = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt << 8) | string.charAt(i10);
        }
        return iCharAt;
    }

    public static String[] P0(String value, String regex) {
        return value.split(regex, 2);
    }

    public static Looper Q() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static String[] Q0(String codecs) {
        return TextUtils.isEmpty(codecs) ? new String[0] : O0(codecs.trim(), "(\\s*,\\s*)");
    }

    public static long R(long playoutDuration, float speed) {
        return speed == 1.0f ? playoutDuration : Math.round(playoutDuration * ((double) speed));
    }

    @androidx.annotation.p0
    public static ComponentName R0(Context context, Intent intent) {
        return f57626a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    private static int S(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            default:
                return 6;
            case 18:
                return 2;
        }
    }

    public static long S0(long x10, long y10, long overflowResult) {
        long j10 = x10 - y10;
        return ((x10 ^ j10) & (y10 ^ x10)) < 0 ? overflowResult : j10;
    }

    public static int T(Context context) {
        ConnectivityManager connectivityManager;
        int i10 = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return S(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public static int[] T0(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return iArr;
    }

    public static int U(int bitDepth) {
        if (bitDepth == 8) {
            return 3;
        }
        if (bitDepth == 16) {
            return 2;
        }
        if (bitDepth == 24) {
            return Integer.MIN_VALUE;
        }
        if (bitDepth == 32) {
            return 1073741824;
        }
        int i10 = 3 << 0;
        return 0;
    }

    public static byte[] U0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static int V(int pcmEncoding, int channelCount) {
        if (pcmEncoding == Integer.MIN_VALUE) {
            return channelCount * 3;
        }
        if (pcmEncoding != 1073741824) {
            if (pcmEncoding == 2) {
                return channelCount * 2;
            }
            if (pcmEncoding == 3) {
                return channelCount;
            }
            if (pcmEncoding != 4) {
                throw new IllegalArgumentException();
            }
        }
        return channelCount * 4;
    }

    public static String V0(String text) {
        return text == null ? text : text.toLowerCase(Locale.US);
    }

    public static Point W(Context context) {
        return X(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    public static String W0(String text) {
        return text == null ? text : text.toUpperCase(Locale.US);
    }

    public static Point X(Context context, Display display) {
        int i10 = f57626a;
        if (i10 <= 28 && display.getDisplayId() == 0 && r0(context)) {
            if ("Sony".equals(f57628c) && f57629d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String strG0 = i10 < 28 ? g0("sys.display-size") : g0("vendor.display-size");
            if (!TextUtils.isEmpty(strG0)) {
                try {
                    String[] strArrO0 = O0(strG0.trim(), "x");
                    if (strArrO0.length == 2) {
                        int i11 = Integer.parseInt(strArrO0[0]);
                        int i12 = Integer.parseInt(strArrO0[1]);
                        if (i11 > 0 && i12 > 0) {
                            return new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strG0);
                p.d(f57632g, strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i13 = f57626a;
        if (i13 >= 23) {
            N(display, point);
        } else if (i13 >= 17) {
            M(display, point);
        } else {
            L(display, point);
        }
        return point;
    }

    @androidx.annotation.p0
    public static String X0(String fileName) {
        int length = fileName.length();
        int iEnd = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (fileName.charAt(i11) == '%') {
                i10++;
            }
        }
        if (i10 == 0) {
            return fileName;
        }
        int i12 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i12);
        Matcher matcher = f57635j.matcher(fileName);
        while (i10 > 0 && matcher.find()) {
            char c10 = (char) Integer.parseInt(matcher.group(1), 16);
            sb2.append((CharSequence) fileName, iEnd, matcher.start());
            sb2.append(c10);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) fileName, iEnd, length);
        }
        if (sb2.length() != i12) {
            return null;
        }
        return sb2.toString();
    }

    public static long Y(long mediaDuration, float speed) {
        return speed == 1.0f ? mediaDuration : Math.round(mediaDuration / ((double) speed));
    }

    public static void Y0(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static u0[] Z(w0 renderersFactory, @androidx.annotation.p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager) {
        t0[] t0VarArrA = renderersFactory.a(new Handler(), new a(), new b(), o0.f57614a, p0.f57622a, drmSessionManager);
        u0[] u0VarArr = new u0[t0VarArrA.length];
        for (int i10 = 0; i10 < t0VarArrA.length; i10++) {
            u0VarArr[i10] = t0VarArrA[i10].p();
        }
        return u0VarArr;
    }

    public static long a(long x10, long y10, long overflowResult) {
        long j10 = x10 + y10;
        return ((x10 ^ j10) & (y10 ^ j10)) < 0 ? overflowResult : j10;
    }

    public static int a0(int usage) {
        if (usage == 13) {
            return 1;
        }
        switch (usage) {
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
            default:
                return 3;
        }
    }

    public static boolean b(@androidx.annotation.p0 Object o10, @androidx.annotation.p0 Object o11) {
        if (o10 == null) {
            return o11 == null;
        }
        return o10.equals(o11);
    }

    public static String b0(StringBuilder builder, Formatter formatter, long timeMs) {
        if (timeMs == -9223372036854775807L) {
            timeMs = 0;
        }
        long j10 = (timeMs + 500) / 1000;
        long j11 = j10 % 60;
        long j12 = (j10 / 60) % 60;
        long j13 = j10 / 3600;
        builder.setLength(0);
        return j13 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%02d:%02d", Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static <T extends Comparable<? super T>> int c(List<? extends Comparable<? super T>> list, T value, boolean inclusive, boolean stayInBounds) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, value);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= size || list.get(i10).compareTo(value) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = inclusive ? iBinarySearch : i10;
        }
        return stayInBounds ? Math.min(list.size() - 1, i11) : i11;
    }

    public static String[] c0() {
        String[] strArrE0 = e0();
        int i10 = 4 >> 0;
        for (int i11 = 0; i11 < strArrE0.length; i11++) {
            strArrE0[i11] = x0(strArrE0[i11]);
        }
        return strArrE0;
    }

    public static int d(int[] array, int value, boolean inclusive, boolean stayInBounds) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= array.length || array[i10] != value) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = inclusive ? iBinarySearch : i10;
        }
        return stayInBounds ? Math.min(array.length - 1, i11) : i11;
    }

    @e.b(21)
    private static String[] d0(Configuration config) {
        return new String[]{config.locale.toLanguageTag()};
    }

    public static int e(long[] array, long value, boolean inclusive, boolean stayInBounds) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= array.length || array[i10] != value) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = inclusive ? iBinarySearch : i10;
        }
        return stayInBounds ? Math.min(array.length - 1, i11) : i11;
    }

    private static String[] e0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = f57626a;
        if (i10 >= 24) {
            return f0(configuration);
        }
        return i10 >= 21 ? d0(configuration) : new String[]{configuration.locale.toString()};
    }

    public static <T extends Comparable<? super T>> int f(List<? extends Comparable<? super T>> list, T value, boolean inclusive, boolean stayInBounds) {
        int i10;
        int iMax;
        int iBinarySearch = Collections.binarySearch(list, value);
        if (iBinarySearch < 0) {
            iMax = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || list.get(i10).compareTo(value) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            iMax = inclusive ? iBinarySearch : i10;
        }
        if (stayInBounds) {
            iMax = Math.max(0, iMax);
        }
        return iMax;
    }

    @e.b(24)
    private static String[] f0(Configuration config) {
        return O0(config.getLocales().toLanguageTags(), ",");
    }

    public static int g(int[] array, int value, boolean inclusive, boolean stayInBounds) {
        int i10;
        int iMax;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            iMax = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || array[i10] != value) {
                    break;
                }
                iBinarySearch = i10;
            }
            iMax = inclusive ? iBinarySearch : i10;
        }
        if (stayInBounds) {
            iMax = Math.max(0, iMax);
        }
        return iMax;
    }

    @androidx.annotation.p0
    private static String g0(String name) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, name);
        } catch (Exception e10) {
            String strValueOf = String.valueOf(name);
            p.e(f57632g, strValueOf.length() != 0 ? "Failed to read system property ".concat(strValueOf) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static int h(long[] array, long value, boolean inclusive, boolean stayInBounds) {
        int i10;
        int iMax;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            iMax = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || array[i10] != value) {
                    break;
                }
                iBinarySearch = i10;
            }
            iMax = inclusive ? iBinarySearch : i10;
        }
        if (stayInBounds) {
            iMax = Math.max(0, iMax);
        }
        return iMax;
    }

    public static String h0(Context context, String applicationName) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = com.planner5d.library.model.payments.a.f222474i;
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(applicationName).length() + 38 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb2.append(applicationName);
        sb2.append("/");
        sb2.append(str);
        sb2.append(" (Linux;Android ");
        sb2.append(str2);
        sb2.append(") ");
        sb2.append(androidx.media2.exoplayer.external.c0.f53753c);
        return sb2.toString();
    }

    @il.d({"#1"})
    public static <T> T i(@androidx.annotation.p0 T value) {
        return value;
    }

    public static byte[] i0(String value) {
        return value.getBytes(Charset.forName("UTF-8"));
    }

    @il.d({"#1"})
    public static <T> T[] j(T[] value) {
        return value;
    }

    public static int j0(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return l0(path);
    }

    public static int k(int numerator, int denominator) {
        return ((numerator + denominator) - 1) / denominator;
    }

    public static int k0(Uri uri, @androidx.annotation.p0 String overrideExtension) {
        if (TextUtils.isEmpty(overrideExtension)) {
            return j0(uri);
        }
        String strValueOf = String.valueOf(overrideExtension);
        return l0(strValueOf.length() != 0 ? ".".concat(strValueOf) : new String("."));
    }

    public static long l(long numerator, long denominator) {
        return ((numerator + denominator) - 1) / denominator;
    }

    public static int l0(String fileName) {
        String strV0 = V0(fileName);
        if (strV0.endsWith(".mpd")) {
            return 0;
        }
        if (strV0.endsWith(".m3u8")) {
            return 2;
        }
        return strV0.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    @e.b(24)
    public static boolean m(Uri... uris) {
        if (f57626a < 24) {
            return true;
        }
        for (Uri uri : uris) {
            if ("http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) androidx.media2.exoplayer.external.util.a.g(uri.getHost()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean m0(x input, x output, @androidx.annotation.p0 Inflater inflater) {
        if (input.a() <= 0) {
            return false;
        }
        byte[] bArrCopyOf = output.f57720a;
        if (bArrCopyOf.length < input.a()) {
            bArrCopyOf = new byte[input.a() * 2];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(input.f57720a, input.c(), input.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(bArrCopyOf, iInflate, bArrCopyOf.length - iInflate);
                if (inflater.finished()) {
                    output.O(bArrCopyOf, iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
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

    public static void n(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.l dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean n0(int encoding) {
        if (encoding != Integer.MIN_VALUE && encoding != 1073741824) {
            return false;
        }
        return true;
    }

    public static void o(@androidx.annotation.p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean o0(int encoding) {
        return encoding == 3 || encoding == 2 || encoding == Integer.MIN_VALUE || encoding == 1073741824 || encoding == 4;
    }

    public static int p(long left, long right) {
        if (left < right) {
            return -1;
        }
        return left == right ? 0 : 1;
    }

    public static boolean p0(int c10) {
        return c10 == 10 || c10 == 13;
    }

    public static float q(float value, float min, float max) {
        return Math.max(min, Math.min(value, max));
    }

    public static boolean q0(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !com.facebook.share.internal.k.f101891c.equals(scheme)) {
            return false;
        }
        return true;
    }

    public static int r(int value, int min, int max) {
        return Math.max(min, Math.min(value, max));
    }

    public static boolean r0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long s(long value, long min, long max) {
        return Math.max(min, Math.min(value, max));
    }

    static final /* synthetic */ void s0(List list) {
    }

    public static boolean t(Object[] items, @androidx.annotation.p0 Object item) {
        for (Object obj : items) {
            if (b(obj, item)) {
                return true;
            }
        }
        return false;
    }

    static final /* synthetic */ void t0(Metadata metadata) {
    }

    public static int u(byte[] bytes, int start, int end, int initialValue) {
        while (start < end) {
            initialValue = f57638m[((initialValue >>> 24) ^ (bytes[start] & 255)) & 255] ^ (initialValue << 8);
            start++;
        }
        return initialValue;
    }

    static final /* synthetic */ Thread u0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Handler v(Handler.Callback callback) {
        return w(Q(), callback);
    }

    @e.b(23)
    public static boolean v0(Activity activity, Uri... uris) {
        if (f57626a < 23) {
            return false;
        }
        for (Uri uri : uris) {
            if (q0(uri)) {
                if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    break;
                }
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
                return true;
            }
        }
        return false;
    }

    public static Handler w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static ExecutorService w0(final String threadName) {
        return Executors.newSingleThreadExecutor(new ThreadFactory(threadName) { // from class: androidx.media2.exoplayer.external.util.n0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f57609a;

            {
                this.f57609a = threadName;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return q0.u0(this.f57609a, runnable);
            }
        });
    }

    private static HashMap<String, String> x() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f57637l.length);
        int i10 = 0;
        int i11 = 4 & 0;
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
            String[] strArr = f57637l;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static String x0(String language) {
        if (language == null) {
            return null;
        }
        String strReplace = language.replace('_', org.apache.commons.codec.language.l.f335457d);
        if (f57626a >= 21) {
            strReplace = y0(strReplace);
        }
        if (!strReplace.isEmpty() && !"und".equals(strReplace)) {
            language = strReplace;
        }
        String strV0 = V0(language);
        String str = P0(strV0, "-")[0];
        if (str.length() != 3) {
            return strV0;
        }
        if (f57636k == null) {
            f57636k = x();
        }
        String str2 = f57636k.get(str);
        if (str2 == null) {
            return strV0;
        }
        String strValueOf = String.valueOf(strV0.substring(3));
        return strValueOf.length() != 0 ? str2.concat(strValueOf) : new String(str2);
    }

    public static File y(Context context, String prefix) throws IOException {
        File fileZ = z(context, prefix);
        fileZ.delete();
        fileZ.mkdir();
        return fileZ;
    }

    @e.b(21)
    private static String y0(String languageTag) {
        return Locale.forLanguageTag(languageTag).toLanguageTag();
    }

    public static File z(Context context, String prefix) throws IOException {
        return File.createTempFile(prefix, null, context.getCacheDir());
    }

    public static <T> T[] z0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }
}

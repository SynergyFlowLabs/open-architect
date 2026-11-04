package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import com.rabbitmq.client.k0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f68595k = "SsaStyle";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f68596l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f68597m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f68598n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f68599o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f68600p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f68601q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f68602r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f68603s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f68604t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f68605u = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f68606v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f68607w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f68608x = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    @p0
    public final Integer f68611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    @p0
    public final Integer f68612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f68613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f68614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f68616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f68617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f68618j;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f68622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f68623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f68624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f68625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f68626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f68627i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f68628j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f68629k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f68619a = i10;
            this.f68620b = i11;
            this.f68621c = i12;
            this.f68622d = i13;
            this.f68623e = i14;
            this.f68624f = i15;
            this.f68625g = i16;
            this.f68626h = i17;
            this.f68627i = i18;
            this.f68628j = i19;
            this.f68629k = i20;
        }

        @p0
        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strG = com.google.common.base.c.g(strArrSplit[i20].trim());
                strG.getClass();
                switch (strG) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f68630c = "SsaStyle.Overrides";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f68631d = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f68632e = "\\s*\\d+(?:\\.\\d+)?\\s*";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f68633f = Pattern.compile(k1.S("\\\\pos\\((%1$s),(%1$s)\\)", f68632e));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Pattern f68634g = Pattern.compile(k1.S("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", f68632e));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Pattern f68635h = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final PointF f68637b;

        private b(int i10, @p0 PointF pointF) {
            this.f68636a = i10;
            this.f68637b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f68635h.matcher(str);
            if (matcher.find()) {
                return c.e((String) androidx.media3.common.util.a.g(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f68631d.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) androidx.media3.common.util.a.g(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        @p0
        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f68633f.matcher(str);
            Matcher matcher2 = f68634g.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    z.h(f68630c, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) androidx.media3.common.util.a.g(strGroup)).trim()), Float.parseFloat(((String) androidx.media3.common.util.a.g(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f68631d.matcher(str).replaceAll("");
        }
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.text.ssa.c$c, reason: collision with other inner class name */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0617c {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private c(String str, int i10, @l @p0 Integer num, @l @p0 Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f68609a = str;
        this.f68610b = i10;
        this.f68611c = num;
        this.f68612d = num2;
        this.f68613e = f10;
        this.f68614f = z10;
        this.f68615g = z11;
        this.f68616h = z12;
        this.f68617i = z13;
        this.f68618j = i11;
    }

    @p0
    public static c b(String str, a aVar) {
        androidx.media3.common.util.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f68629k;
        if (length != i10) {
            z.n(f68595k, k1.S("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f68619a].trim();
            int i11 = aVar.f68620b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f68621c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f68622d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f68623e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f68624f;
            boolean z10 = false;
            boolean z11 = true;
            if (i15 != -1 && f(strArrSplit[i15].trim())) {
                z10 = true;
            }
            int i16 = aVar.f68625g;
            if (i16 == -1 || !f(strArrSplit[i16].trim())) {
                z11 = z10;
            }
            int i17 = aVar.f68626h;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z11 = false;
            }
            int i18 = aVar.f68627i;
            boolean z12 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f68628j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z11, z12, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            z.o(f68595k, "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        z.n(f68595k, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            z.o(f68595k, "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        z.n(f68595k, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @l
    @p0
    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            androidx.media3.common.util.a.a(j10 <= k0.f265952a);
            return Integer.valueOf(Color.argb(com.google.common.primitives.l.e(((j10 >> 24) & 255) ^ 255), com.google.common.primitives.l.e(j10 & 255), com.google.common.primitives.l.e((j10 >> 8) & 255), com.google.common.primitives.l.e((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            z.o(f68595k, "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            z.o(f68595k, "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}

package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.d;
import androidx.media3.extractor.text.r;
import com.google.common.collect.l6;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68638d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f68639e = 0.08f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f68640f = 0.92f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f68641g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f68642h = "SubripParser";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68643i = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f68644j = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f68645k = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f68646l = "\\{\\\\an[1-9]\\}";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f68647m = "{\\an1}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f68648n = "{\\an2}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f68649o = "{\\an3}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f68650p = "{\\an4}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f68651q = "{\\an5}";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f68652r = "{\\an6}";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f68653s = "{\\an7}";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f68654t = "{\\an8}";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f68655u = "{\\an9}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f68656a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f68657b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f68658c = new o0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    private androidx.media3.common.text.a e(Spanned spanned, @p0 String str) {
        byte b10;
        byte b11;
        androidx.media3.common.text.a.c cVarA = new androidx.media3.common.text.a.c().A(spanned);
        if (str == null) {
            return cVarA.a();
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            cVarA.x(0);
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            cVarA.x(2);
        } else {
            cVarA.x(1);
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            cVarA.u(2);
        } else if (b11 == 3 || b11 == 4 || b11 == 5) {
            cVarA.u(0);
        } else {
            cVarA.u(1);
        }
        return cVarA.w(g(cVarA.i())).t(g(cVarA.f()), 0).a();
    }

    private Charset f(o0 o0Var) {
        Charset charsetV = o0Var.V();
        return charsetV != null ? charsetV : StandardCharsets.UTF_8;
    }

    @l1(otherwise = 2)
    public static float g(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return f68640f;
        }
        throw new IllegalArgumentException();
    }

    private static long h(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String i(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f68645k.matcher(strTrim);
        int i10 = 0;
        int i11 = 2 >> 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<d> oVar) {
        long j10;
        String str;
        this.f68658c.Y(bArr, i10 + i11);
        this.f68658c.a0(i10);
        Charset charsetF = f(this.f68658c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f68572a == -9223372036854775807L || !bVar.f68573b) ? null : new ArrayList();
        while (true) {
            String strV = this.f68658c.v(charsetF);
            if (strV == null) {
                break;
            }
            if (strV.length() != 0) {
                try {
                    Integer.parseInt(strV);
                    String strV2 = this.f68658c.v(charsetF);
                    if (strV2 == null) {
                        z.n(f68642h, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f68644j.matcher(strV2);
                    if (matcher.matches()) {
                        long jH = h(matcher, 1);
                        long jH2 = h(matcher, 6);
                        int i12 = 0;
                        this.f68656a.setLength(0);
                        this.f68657b.clear();
                        String strV3 = this.f68658c.v(charsetF);
                        while (!TextUtils.isEmpty(strV3)) {
                            if (this.f68656a.length() > 0) {
                                this.f68656a.append("<br>");
                            }
                            this.f68656a.append(i(strV3, this.f68657b));
                            strV3 = this.f68658c.v(charsetF);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f68656a.toString());
                        while (true) {
                            if (i12 >= this.f68657b.size()) {
                                str = null;
                                break;
                            }
                            str = this.f68657b.get(i12);
                            if (str.matches(f68646l)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        j10 = j11;
                        long j12 = bVar.f68572a;
                        if (j12 == j10 || jH >= j12) {
                            oVar.accept(new d(l6.G(e(spannedFromHtml, str)), jH, jH2 - jH));
                        } else if (arrayList != null) {
                            arrayList.add(new d(l6.G(e(spannedFromHtml, str)), jH, jH2 - jH));
                        }
                    } else {
                        j10 = j11;
                        z.n(f68642h, "Skipping invalid timing: " + strV2);
                    }
                    j11 = j10;
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    z.n(f68642h, "Skipping invalid index: " + strV);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oVar.accept((d) it.next());
            }
        }
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 1;
    }
}

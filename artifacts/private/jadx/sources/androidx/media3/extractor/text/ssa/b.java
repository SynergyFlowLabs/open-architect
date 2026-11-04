package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.r;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68582g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f68583h = "SsaParser";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f68584i = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f68585j = "Format:";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f68586k = "Style:";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f68587l = "Dialogue:";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f68588m = 0.05f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f68589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final a f68590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f68591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, c> f68592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f68593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f68594f;

    public b() {
        this(null);
    }

    private static int e(long j10, List<Long> list, List<List<androidx.media3.common.text.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float f(int i10) {
        if (i10 == 0) {
            return f68588m;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static androidx.media3.common.text.a g(String str, @p0 c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        androidx.media3.common.text.a.c cVarA = new androidx.media3.common.text.a.c().A(spannableString);
        if (cVar != null) {
            if (cVar.f68611c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f68611c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f68618j == 3 && cVar.f68612d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f68612d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f68613e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                cVarA.C(f12 / f11, 1);
            }
            boolean z10 = cVar.f68614f;
            if (z10 && cVar.f68615g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f68615g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f68616h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f68617i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f68636a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f68610b : -1;
        }
        cVarA.B(q(i10)).x(p(i10)).u(o(i10));
        PointF pointF = bVar.f68637b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            cVarA.w(f(cVarA.i()));
            cVarA.t(f(cVarA.f()), 0);
        } else {
            cVarA.w(pointF.x / f10);
            cVarA.t(bVar.f68637b.y / f11, 0);
        }
        return cVarA.a();
    }

    private Charset h(o0 o0Var) {
        Charset charsetV = o0Var.V();
        return charsetV != null ? charsetV : StandardCharsets.UTF_8;
    }

    private void i(String str, a aVar, List<List<androidx.media3.common.text.a>> list, List<Long> list2) {
        int i10;
        androidx.media3.common.util.a.a(str.startsWith(f68587l));
        String[] strArrSplit = str.substring(9).split(",", aVar.f68581e);
        if (strArrSplit.length != aVar.f68581e) {
            z.n(f68583h, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jN = n(strArrSplit[aVar.f68577a]);
        if (jN == -9223372036854775807L) {
            z.n(f68583h, "Skipping invalid timing: " + str);
            return;
        }
        long jN2 = n(strArrSplit[aVar.f68578b]);
        if (jN2 == -9223372036854775807L || jN2 <= jN) {
            z.n(f68583h, "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f68592d;
        c cVar = (map == null || (i10 = aVar.f68579c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[aVar.f68580d];
        androidx.media3.common.text.a aVarG = g(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f68593e, this.f68594f);
        int iE = e(jN2, list2, list);
        for (int iE2 = e(jN, list2, list); iE2 < iE; iE2++) {
            list.get(iE2).add(aVarG);
        }
    }

    private void j(o0 o0Var, List<List<androidx.media3.common.text.a>> list, List<Long> list2, Charset charset) {
        a aVarA = this.f68589a ? this.f68590b : null;
        while (true) {
            String strV = o0Var.v(charset);
            if (strV == null) {
                return;
            }
            if (strV.startsWith(f68585j)) {
                aVarA = a.a(strV);
            } else if (strV.startsWith(f68587l)) {
                if (aVarA == null) {
                    z.n(f68583h, "Skipping dialogue line before complete format: " + strV);
                } else {
                    i(strV, aVarA, list, list2);
                }
            }
        }
    }

    private void k(o0 o0Var, Charset charset) {
        while (true) {
            String strV = o0Var.v(charset);
            if (strV == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strV)) {
                l(o0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strV)) {
                this.f68592d = m(o0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strV)) {
                z.h(f68583h, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strV)) {
                return;
            }
        }
    }

    private void l(o0 o0Var, Charset charset) {
        while (true) {
            String strV = o0Var.v(charset);
            if (strV == null || (o0Var.a() != 0 && o0Var.i(charset) == '[')) {
                break;
            }
            String[] strArrSplit = strV.split(":");
            if (strArrSplit.length == 2) {
                String strG = com.google.common.base.c.g(strArrSplit[0].trim());
                strG.getClass();
                if (strG.equals("playresx")) {
                    this.f68593e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strG.equals("playresy")) {
                    try {
                        this.f68594f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> m(o0 o0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strV = o0Var.v(charset);
            if (strV == null || (o0Var.a() != 0 && o0Var.i(charset) == '[')) {
                break;
            }
            if (strV.startsWith(f68585j)) {
                aVarA = c.a.a(strV);
            } else if (strV.startsWith(f68586k)) {
                if (aVarA == null) {
                    z.n(f68583h, "Skipping 'Style:' line before 'Format:' line: " + strV);
                } else {
                    c cVarB = c.b(strV, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f68609a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long n(String str) {
        Matcher matcher = f68584i.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) k1.o(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) k1.o(matcher.group(2))) * 60000000) + (Long.parseLong((String) k1.o(matcher.group(3))) * 1000000) + (Long.parseLong((String) k1.o(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                z.n(f68583h, "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int p(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                z.n(f68583h, "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @p0
    private static Layout.Alignment q(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                z.n(f68583h, "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<androidx.media3.extractor.text.d> oVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f68591c.Y(bArr, i11 + i10);
        this.f68591c.a0(i10);
        Charset charsetH = h(this.f68591c);
        if (!this.f68589a) {
            k(this.f68591c, charsetH);
        }
        j(this.f68591c, arrayList, arrayList2, charsetH);
        ArrayList arrayList3 = (bVar.f68572a == -9223372036854775807L || !bVar.f68573b) ? null : new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            List<androidx.media3.common.text.a> list = arrayList.get(i12);
            if (!list.isEmpty() || i12 == 0) {
                if (i12 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i12).longValue();
                long jLongValue2 = arrayList2.get(i12 + 1).longValue() - arrayList2.get(i12).longValue();
                long j10 = bVar.f68572a;
                if (j10 == -9223372036854775807L || jLongValue >= j10) {
                    oVar.accept(new androidx.media3.extractor.text.d(list, jLongValue, jLongValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new androidx.media3.extractor.text.d(list, jLongValue, jLongValue2));
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                oVar.accept((androidx.media3.extractor.text.d) it.next());
            }
        }
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 1;
    }

    public b(@p0 List<byte[]> list) {
        this.f68593e = -3.4028235E38f;
        this.f68594f = -3.4028235E38f;
        this.f68591c = new o0();
        if (list == null || list.isEmpty()) {
            this.f68589a = false;
            this.f68590b = null;
            return;
        }
        this.f68589a = true;
        String strT = k1.T(list.get(0));
        androidx.media3.common.util.a.a(strT.startsWith(f68585j));
        this.f68590b = (a) androidx.media3.common.util.a.g(a.a(strT));
        k(new o0(list.get(1)), StandardCharsets.UTF_8);
    }
}

package androidx.media2.exoplayer.external.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.text.c;
import androidx.media2.exoplayer.external.text.e;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends c {
    private static final String A = "{\\an3}";
    private static final String B = "{\\an4}";
    private static final String C = "{\\an5}";
    private static final String D = "{\\an6}";
    private static final String E = "{\\an7}";
    private static final String F = "{\\an8}";
    private static final String G = "{\\an9}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f56819q = 0.08f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f56820r = 0.92f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f56821s = 0.5f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f56822t = "SubripDecoder";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f56823u = "(?:(\\d+):)?(\\d+):(\\d+),(\\d+)";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f56824v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f56825w = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f56826x = "\\{\\\\an[1-9]\\}";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f56827y = "{\\an1}";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f56828z = "{\\an2}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f56829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<String> f56830p;

    public a() {
        super(f56822t);
        this.f56829o = new StringBuilder();
        this.f56830p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    private androidx.media2.exoplayer.external.text.b B(Spanned text, @p0 String alignmentTag) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        if (alignmentTag == null) {
            return new androidx.media2.exoplayer.external.text.b(text);
        }
        switch (alignmentTag) {
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
            i10 = 0;
        } else {
            i10 = (b10 == 3 || b10 == 4 || b10 == 5) ? 2 : 1;
        }
        switch (alignmentTag) {
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
            i11 = 2;
        } else {
            i11 = (b11 == 3 || b11 == 4 || b11 == 5) ? 0 : 1;
        }
        return new androidx.media2.exoplayer.external.text.b(text, null, C(i11), 0, i11, C(i10), i10, Float.MIN_VALUE);
    }

    static float C(int anchorType) {
        if (anchorType == 0) {
            return 0.08f;
        }
        if (anchorType == 1) {
            return 0.5f;
        }
        if (anchorType == 2) {
            return f56820r;
        }
        throw new IllegalArgumentException();
    }

    private static long D(Matcher matcher, int groupOffset) {
        return ((Long.parseLong(matcher.group(groupOffset + 1)) * 3600000) + (Long.parseLong(matcher.group(groupOffset + 2)) * 60000) + (Long.parseLong(matcher.group(groupOffset + 3)) * 1000) + Long.parseLong(matcher.group(groupOffset + 4))) * 1000;
    }

    private String E(String line, ArrayList<String> tags) {
        String strTrim = line.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f56825w.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            tags.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected e y(byte[] bytes, int length, boolean reset) {
        String str;
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        x xVar = new x(bytes, length);
        while (true) {
            String strN = xVar.n();
            if (strN == null) {
                break;
            }
            if (strN.length() != 0) {
                try {
                    Integer.parseInt(strN);
                    String strN2 = xVar.n();
                    if (strN2 == null) {
                        p.l(f56822t, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f56824v.matcher(strN2);
                    if (matcher.matches()) {
                        boolean z10 = true;
                        qVar.a(D(matcher, 1));
                        int i10 = 0;
                        if (TextUtils.isEmpty(matcher.group(6))) {
                            z10 = false;
                        } else {
                            qVar.a(D(matcher, 6));
                        }
                        this.f56829o.setLength(0);
                        this.f56830p.clear();
                        for (String strN3 = xVar.n(); !TextUtils.isEmpty(strN3); strN3 = xVar.n()) {
                            if (this.f56829o.length() > 0) {
                                this.f56829o.append("<br>");
                            }
                            this.f56829o.append(E(strN3, this.f56830p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f56829o.toString());
                        while (true) {
                            if (i10 >= this.f56830p.size()) {
                                str = null;
                                break;
                            }
                            str = this.f56830p.get(i10);
                            if (str.matches(f56826x)) {
                                break;
                            }
                            i10++;
                        }
                        arrayList.add(B(spannedFromHtml, str));
                        if (z10) {
                            arrayList.add(androidx.media2.exoplayer.external.text.b.f56537o);
                        }
                    } else {
                        p.l(f56822t, strN2.length() != 0 ? "Skipping invalid timing: ".concat(strN2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    p.l(f56822t, strN.length() != 0 ? "Skipping invalid index: ".concat(strN) : new String("Skipping invalid index: "));
                }
            }
        }
        androidx.media2.exoplayer.external.text.b[] bVarArr = new androidx.media2.exoplayer.external.text.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, qVar.d());
    }
}

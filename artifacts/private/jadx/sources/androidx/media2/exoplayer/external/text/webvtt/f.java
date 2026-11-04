package androidx.media2.exoplayer.external.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f56990b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f56991c = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f56992d = '<';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f56993e = '>';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f56994f = '/';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f56995g = '&';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f56996h = ';';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f56997i = ' ';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f56998j = "lt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f56999k = "gt";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f57000l = "amp";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f57001m = "nbsp";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f57002n = "b";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f57003o = "i";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f57004p = "u";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f57005q = "c";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f57006r = "v";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f57007s = "lang";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f57008t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f57009u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f57010v = "WebvttCueParser";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f57011a = new StringBuilder();

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String[] f57012e = new String[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f57013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f57015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String[] f57016d;

        private a(String name, int position, String voice, String[] classes) {
            this.f57014b = position;
            this.f57013a = name;
            this.f57015c = voice;
            this.f57016d = classes;
        }

        public static a a(String fullTagExpression, int position) {
            String str;
            String strTrim = fullTagExpression.trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str = strTrim2;
            }
            String[] strArrO0 = q0.O0(strTrim, "\\.");
            return new a(strArrO0[0], position, str, strArrO0.length > 1 ? (String[]) Arrays.copyOfRange(strArrO0, 1, strArrO0.length) : f57012e);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    private static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f57018b;

        public b(int score, d style) {
            this.f57017a = score;
            this.f57018b = style;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull b another) {
            return this.f57017a - another.f57017a;
        }
    }

    private static void a(String entity, SpannableStringBuilder spannedText) {
        entity.getClass();
        switch (entity) {
            case "gt":
                spannedText.append('>');
                break;
            case "lt":
                spannedText.append('<');
                break;
            case "amp":
                spannedText.append('&');
                break;
            case "nbsp":
                spannedText.append(f56997i);
                break;
            default:
                StringBuilder sb2 = new StringBuilder(entity.length() + 33);
                sb2.append("ignoring unsupported entity: '&");
                sb2.append(entity);
                sb2.append(";'");
                p.l(f57010v, sb2.toString());
                break;
        }
    }

    private static void b(String cueId, a startTag, SpannableStringBuilder text, List<d> styles, List<b> scratchStyleMatches) {
        int i10 = startTag.f57014b;
        int length = text.length();
        String str = startTag.f57013a;
        str.getClass();
        switch (str) {
            case "":
            case "c":
            case "v":
            case "lang":
                break;
            case "b":
                text.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "i":
                text.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                text.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            default:
                return;
        }
        scratchStyleMatches.clear();
        e(styles, cueId, startTag, scratchStyleMatches);
        int size = scratchStyleMatches.size();
        for (int i11 = 0; i11 < size; i11++) {
            c(text, scratchStyleMatches.get(i11).f57018b, i10, length);
        }
    }

    private static void c(SpannableStringBuilder spannedText, d style, int start, int end) {
        if (style == null) {
            return;
        }
        if (style.h() != -1) {
            spannedText.setSpan(new StyleSpan(style.h()), start, end, 33);
        }
        if (style.l()) {
            spannedText.setSpan(new StrikethroughSpan(), start, end, 33);
        }
        if (style.m()) {
            spannedText.setSpan(new UnderlineSpan(), start, end, 33);
        }
        if (style.k()) {
            spannedText.setSpan(new ForegroundColorSpan(style.c()), start, end, 33);
        }
        if (style.j()) {
            spannedText.setSpan(new BackgroundColorSpan(style.b()), start, end, 33);
        }
        if (style.d() != null) {
            spannedText.setSpan(new TypefaceSpan(style.d()), start, end, 33);
        }
        if (style.i() != null) {
            spannedText.setSpan(new AlignmentSpan.Standard(style.i()), start, end, 33);
        }
        int iF = style.f();
        if (iF == 1) {
            spannedText.setSpan(new AbsoluteSizeSpan((int) style.e(), true), start, end, 33);
        } else if (iF == 2) {
            spannedText.setSpan(new RelativeSizeSpan(style.e()), start, end, 33);
        } else {
            if (iF != 3) {
                return;
            }
            spannedText.setSpan(new RelativeSizeSpan(style.e() / 100.0f), start, end, 33);
        }
    }

    private static int d(String markup, int startPos) {
        int iIndexOf = markup.indexOf(62, startPos);
        return iIndexOf == -1 ? markup.length() : iIndexOf + 1;
    }

    private static void e(List<d> declaredStyles, String id2, a tag, List<b> output) {
        int size = declaredStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = declaredStyles.get(i10);
            int iG = dVar.g(id2, tag.f57013a, tag.f57016d, tag.f57015c);
            if (iG > 0) {
                output.add(new b(iG, dVar));
            }
        }
        Collections.sort(output);
    }

    private static String f(String tagExpression) {
        String strTrim = tagExpression.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return q0.P0(strTrim, "[ \\.]")[0];
    }

    private static boolean g(String tagName) {
        tagName.getClass();
        switch (tagName) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "lang":
                return true;
            default:
                return false;
        }
    }

    private static boolean i(String id2, Matcher cueHeaderMatcher, x webvttData, e.b builder, StringBuilder textBuilder, List<d> styles) {
        try {
            builder.j(h.d(cueHeaderMatcher.group(1))).d(h.d(cueHeaderMatcher.group(2)));
            j(cueHeaderMatcher.group(3), builder);
            textBuilder.setLength(0);
            while (true) {
                String strN = webvttData.n();
                if (TextUtils.isEmpty(strN)) {
                    k(id2, textBuilder.toString(), builder, styles);
                    return true;
                }
                if (textBuilder.length() > 0) {
                    textBuilder.append("\n");
                }
                textBuilder.append(strN.trim());
            }
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(cueHeaderMatcher.group());
            p.l(f57010v, strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return false;
        }
    }

    static void j(String cueSettingsList, e.b builder) {
        Matcher matcher = f56991c.matcher(cueSettingsList);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if ("line".equals(strGroup)) {
                    l(strGroup2, builder);
                } else if ("align".equals(strGroup)) {
                    builder.l(o(strGroup2));
                } else if ("position".equals(strGroup)) {
                    n(strGroup2, builder);
                } else if ("size".equals(strGroup)) {
                    builder.m(h.c(strGroup2));
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strGroup).length() + 21 + String.valueOf(strGroup2).length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(strGroup);
                    sb2.append(":");
                    sb2.append(strGroup2);
                    p.l(f57010v, sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                p.l(f57010v, strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    static void k(String id2, String markup, e.b builder, List<d> styles) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < markup.length()) {
            char cCharAt = markup.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = markup.indexOf(59, i10);
                int iIndexOf2 = markup.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(markup.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iD = i10 + 1;
                if (iD < markup.length()) {
                    boolean z10 = markup.charAt(iD) == '/';
                    iD = d(markup, iD);
                    int i11 = iD - 2;
                    boolean z11 = markup.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iD - 1;
                    }
                    String strSubstring = markup.substring(i12, i11);
                    String strF = f(strSubstring);
                    if (strF != null && g(strF)) {
                        if (z10) {
                            while (!arrayDeque.isEmpty()) {
                                a aVar = (a) arrayDeque.pop();
                                b(id2, aVar, spannableStringBuilder, styles, arrayList);
                                if (aVar.f57013a.equals(strF)) {
                                    break;
                                }
                            }
                        } else if (!z11) {
                            arrayDeque.push(a.a(strSubstring, spannableStringBuilder.length()));
                        }
                    }
                }
                i10 = iD;
            }
        }
        while (!arrayDeque.isEmpty()) {
            b(id2, (a) arrayDeque.pop(), spannableStringBuilder, styles, arrayList);
        }
        b(id2, a.b(), spannableStringBuilder, styles, arrayList);
        builder.k(spannableStringBuilder);
    }

    private static void l(String s10, e.b builder) throws NumberFormatException {
        int iIndexOf = s10.indexOf(44);
        if (iIndexOf != -1) {
            builder.f(m(s10.substring(iIndexOf + 1)));
            s10 = s10.substring(0, iIndexOf);
        } else {
            builder.f(Integer.MIN_VALUE);
        }
        if (s10.endsWith("%")) {
            builder.e(h.c(s10)).g(0);
            return;
        }
        int i10 = Integer.parseInt(s10);
        if (i10 < 0) {
            i10--;
        }
        builder.e(i10).g(1);
    }

    private static int m(String s10) {
        s10.getClass();
        switch (s10) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                p.l(f57010v, s10.length() != 0 ? "Invalid anchor value: ".concat(s10) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void n(String s10, e.b builder) throws NumberFormatException {
        int iIndexOf = s10.indexOf(44);
        if (iIndexOf != -1) {
            builder.i(m(s10.substring(iIndexOf + 1)));
            s10 = s10.substring(0, iIndexOf);
        } else {
            builder.i(Integer.MIN_VALUE);
        }
        builder.h(h.c(s10));
    }

    private static Layout.Alignment o(String s10) {
        s10.getClass();
        switch (s10) {
            case "center":
            case "middle":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                p.l(f57010v, s10.length() != 0 ? "Invalid alignment value: ".concat(s10) : new String("Invalid alignment value: "));
                return null;
        }
    }

    public boolean h(x webvttData, e.b builder, List<d> styles) {
        String strN = webvttData.n();
        if (strN == null) {
            return false;
        }
        Pattern pattern = f56990b;
        Matcher matcher = pattern.matcher(strN);
        if (matcher.matches()) {
            return i(null, matcher, webvttData, builder, this.f57011a, styles);
        }
        String strN2 = webvttData.n();
        if (strN2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(strN2);
        if (matcher2.matches()) {
            return i(strN.trim(), matcher2, webvttData, builder, this.f57011a, styles);
        }
        return false;
    }
}

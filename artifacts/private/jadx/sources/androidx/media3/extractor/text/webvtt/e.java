package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.text.l;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e {
    private static final int A = 2;
    static final float B = 0.5f;
    private static final String C = "WebvttCueParser";
    private static final Map<String, Integer> D;
    private static final Map<String, Integer> E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f68914a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f68915b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f68916c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f68917d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68918e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f68919f = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f68920g = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f68921h = '<';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f68922i = '>';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f68923j = '/';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f68924k = '&';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char f68925l = ';';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final char f68926m = ' ';

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f68927n = "lt";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f68928o = "gt";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f68929p = "amp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f68930q = "nbsp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f68931r = "b";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f68932s = "c";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f68933t = "i";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f68934u = "lang";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f68935v = "ruby";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f68936w = "rt";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f68937x = "u";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f68938y = "v";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f68939z = 1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f68940c = new Comparator() { // from class: androidx.media3.extractor.text.webvtt.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f68941a.f68944b, ((e.b) obj2).f68941a.f68944b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f68941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68942b;

        private b(c cVar, int i10) {
            this.f68941a = cVar;
            this.f68942b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f68945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f68946d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f68944b = i10;
            this.f68943a = str;
            this.f68945c = str2;
            this.f68946d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            androidx.media3.common.util.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrL2 = k1.l2(strTrim, "\\.");
            String str3 = strArrL2[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrL2.length; i11++) {
                hashSet.add(strArrL2[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.extractor.text.webvtt.c f68948b;

        public d(int i10, androidx.media3.extractor.text.webvtt.c cVar) {
            this.f68947a = i10;
            this.f68948b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f68947a, dVar.f68947a);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.text.webvtt.e$e, reason: collision with other inner class name */
    private static final class C0620e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f68951c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f68949a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f68950b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68952d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f68953e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f68954f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f68955g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f68956h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f68957i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f68958j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f68959k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            return i10 == 0 ? 1.0f : -3.4028235E38f;
        }

        @p0
        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                int i11 = 7 & 3;
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            z.n(e.C, "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return 1;
                        }
                    }
                }
                return 2;
            }
            return 0;
        }

        public androidx.media3.extractor.text.webvtt.d a() {
            return new androidx.media3.extractor.text.webvtt.d(g().a(), this.f68949a, this.f68950b);
        }

        public androidx.media3.common.text.a.c g() {
            float fE = this.f68956h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f68952d);
            }
            int iF = this.f68957i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f68952d);
            }
            androidx.media3.common.text.a.c cVarD = new androidx.media3.common.text.a.c().B(c(this.f68952d)).t(b(this.f68953e, this.f68954f), this.f68954f).u(this.f68955g).w(fE).x(iF).z(Math.min(this.f68958j, d(iF, fE))).D(this.f68959k);
            CharSequence charSequence = this.f68951c;
            if (charSequence != null) {
                cVarD.A(charSequence);
            }
            return cVarD;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        D = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        E = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = D;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = E;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(f68926m);
                break;
            default:
                z.n(C, "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, @p0 String str, c cVar, List<b> list, List<androidx.media3.extractor.text.webvtt.c> list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f68940c);
        int i10 = cVar.f68944b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (f68936w.equals(((b) arrayList.get(i11)).f68941a.f68943a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f68941a), iJ, 1);
                int i12 = bVar.f68941a.f68944b - length;
                int i13 = bVar.f68942b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new androidx.media3.common.text.h(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7 A[LOOP:0: B:47:0x00bf->B:49:0x00c7, LOOP_END] */
    private static void d(@p0 String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<androidx.media3.extractor.text.webvtt.c> list2) {
        List<d> listI;
        int i10 = cVar.f68944b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f68943a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                listI = i(list2, str, cVar);
                for (int i11 = 0; i11 < listI.size(); i11++) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                listI = i(list2, str, cVar);
                while (i11 < listI.size()) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
            case "c":
                a(spannableStringBuilder, cVar.f68946d, i10, length);
                listI = i(list2, str, cVar);
                while (i11 < listI.size()) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                listI = i(list2, str, cVar);
                while (i11 < listI.size()) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                listI = i(list2, str, cVar);
                while (i11 < listI.size()) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
            case "v":
                f(spannableStringBuilder, cVar.f68945c, i10, length);
                listI = i(list2, str, cVar);
                while (i11 < listI.size()) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                listI = i(list2, str, cVar);
                while (i11 < listI.size()) {
                    e(spannableStringBuilder, listI.get(i11).f68948b, i10, length);
                }
                break;
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, androidx.media3.extractor.text.webvtt.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            androidx.media3.common.text.i.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new androidx.media3.common.text.f(), i10, i11, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new l(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<androidx.media3.extractor.text.webvtt.c> list, @p0 String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            androidx.media3.extractor.text.webvtt.c cVar2 = list.get(i10);
            int iH = cVar2.h(str, cVar.f68943a, cVar.f68946d, cVar.f68945c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<androidx.media3.extractor.text.webvtt.c> list, @p0 String str, c cVar) {
        List<d> listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            androidx.media3.extractor.text.webvtt.c cVar2 = listI.get(i10).f68948b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        androidx.media3.common.util.a.a(!strTrim.isEmpty());
        return k1.m2(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    @l1(otherwise = 3)
    public static androidx.media3.common.text.a m(CharSequence charSequence) {
        C0620e c0620e = new C0620e();
        c0620e.f68951c = charSequence;
        return c0620e.g().a();
    }

    @p0
    public static androidx.media3.extractor.text.webvtt.d n(o0 o0Var, List<androidx.media3.extractor.text.webvtt.c> list) {
        String strU = o0Var.u();
        if (strU == null) {
            return null;
        }
        Pattern pattern = f68919f;
        Matcher matcher = pattern.matcher(strU);
        if (matcher.matches()) {
            return o(null, matcher, o0Var, list);
        }
        String strU2 = o0Var.u();
        if (strU2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strU2);
        if (matcher2.matches()) {
            return o(strU.trim(), matcher2, o0Var, list);
        }
        return null;
    }

    @p0
    private static androidx.media3.extractor.text.webvtt.d o(@p0 String str, Matcher matcher, o0 o0Var, List<androidx.media3.extractor.text.webvtt.c> list) {
        C0620e c0620e = new C0620e();
        try {
            c0620e.f68949a = h.d((String) androidx.media3.common.util.a.g(matcher.group(1)));
            int i10 = 5 & 2;
            c0620e.f68950b = h.d((String) androidx.media3.common.util.a.g(matcher.group(2)));
            q((String) androidx.media3.common.util.a.g(matcher.group(3)), c0620e);
            StringBuilder sb2 = new StringBuilder();
            String strU = o0Var.u();
            while (!TextUtils.isEmpty(strU)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strU.trim());
                strU = o0Var.u();
            }
            c0620e.f68951c = r(str, sb2.toString(), list);
            return c0620e.a();
        } catch (IllegalArgumentException unused) {
            z.n(C, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static androidx.media3.common.text.a.c p(String str) {
        C0620e c0620e = new C0620e();
        q(str, c0620e);
        return c0620e.g();
    }

    private static void q(String str, C0620e c0620e) {
        Matcher matcher = f68920g.matcher(str);
        while (matcher.find()) {
            String str2 = (String) androidx.media3.common.util.a.g(matcher.group(1));
            String str3 = (String) androidx.media3.common.util.a.g(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c0620e);
                } else if ("align".equals(str2)) {
                    c0620e.f68952d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0620e);
                } else if ("size".equals(str2)) {
                    c0620e.f68958j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0620e.f68959k = x(str3);
                } else {
                    z.n(C, "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                z.n(C, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(@p0 String str, String str2, List<androidx.media3.extractor.text.webvtt.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f68943a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                z.n(C, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0620e c0620e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0620e.f68955g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0620e.f68953e = h.c(str);
            c0620e.f68954f = 0;
        } else {
            c0620e.f68953e = Integer.parseInt(str);
            c0620e.f68954f = 1;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                z.n(C, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C0620e c0620e) {
        int iIndexOf = str.indexOf(44);
        int i10 = 0 | (-1);
        if (iIndexOf != -1) {
            c0620e.f68957i = u(str.substring(iIndexOf + 1));
            int i11 = 1 >> 0;
            str = str.substring(0, iIndexOf);
        }
        c0620e.f68956h = h.c(str);
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                z.n(C, "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        z.n(C, "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}

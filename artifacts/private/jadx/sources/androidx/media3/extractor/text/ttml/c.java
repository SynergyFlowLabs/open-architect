package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    public static final String A = "data";
    public static final String A0 = "circle";
    public static final String B = "information";
    public static final String B0 = "filled";
    public static final String C = "";
    public static final String C0 = "open";
    public static final String D = "id";
    public static final String E = "style";
    public static final String F = "origin";
    public static final String G = "extent";
    public static final String H = "displayAlign";
    public static final String I = "backgroundColor";
    public static final String J = "fontStyle";
    public static final String K = "fontSize";
    public static final String L = "fontFamily";
    public static final String M = "fontWeight";
    public static final String N = "color";
    public static final String O = "ruby";
    public static final String P = "rubyPosition";
    public static final String Q = "textDecoration";
    public static final String R = "textAlign";
    public static final String S = "textCombine";
    public static final String T = "textEmphasis";
    public static final String U = "writingMode";
    public static final String V = "shear";
    public static final String W = "multiRowAlign";
    public static final String X = "container";
    public static final String Y = "base";
    public static final String Z = "baseContainer";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f68673a0 = "text";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f68674b0 = "textContainer";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f68675c0 = "delimiter";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f68676d0 = "before";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f68677e0 = "after";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f68678f0 = "outside";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f68679g0 = "linethrough";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f68680h0 = "nolinethrough";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f68681i0 = "underline";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f68682j0 = "nounderline";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f68683k0 = "italic";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f68684l0 = "bold";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f68685m0 = "left";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f68686n = "tt";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f68687n0 = "center";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f68688o = "head";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f68689o0 = "right";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f68690p = "body";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f68691p0 = "start";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f68692q = "div";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f68693q0 = "end";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f68694r = "p";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f68695r0 = "none";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f68696s = "span";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f68697s0 = "all";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f68698t = "br";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f68699t0 = "tb";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f68700u = "style";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f68701u0 = "tblr";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f68702v = "styling";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f68703v0 = "tbrl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f68704w = "layout";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f68705w0 = "none";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f68706x = "region";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f68707x0 = "auto";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f68708y = "metadata";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f68709y0 = "dot";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f68710z = "image";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f68711z0 = "sesame";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f68712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f68713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final g f68717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final String[] f68718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f68719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final String f68720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final c f68721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f68722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f68723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<c> f68724m;

    private c(@p0 String str, @p0 String str2, long j10, long j11, @p0 g gVar, @p0 String[] strArr, String str3, @p0 String str4, @p0 c cVar) {
        this.f68712a = str;
        this.f68713b = str2;
        this.f68720i = str4;
        this.f68717f = gVar;
        this.f68718g = strArr;
        this.f68714c = str2 != null;
        this.f68715d = j10;
        this.f68716e = j11;
        this.f68719h = (String) androidx.media3.common.util.a.g(str3);
        this.f68721j = cVar;
        this.f68722k = new HashMap<>();
        this.f68723l = new HashMap<>();
    }

    private void b(Map<String, g> map, androidx.media3.common.text.a.c cVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f68717f, this.f68718g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) cVar.k();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            cVar.A(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f68721j, map, i12);
            if ("p".equals(this.f68712a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    cVar.y((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    cVar.B(gVarF.o());
                }
                if (gVarF.i() != null) {
                    cVar.v(gVarF.i());
                }
            }
        }
    }

    public static c c(@p0 String str, long j10, long j11, @p0 g gVar, @p0 String[] strArr, String str2, @p0 String str3, @p0 c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f68712a);
        boolean zEquals2 = "div".equals(this.f68712a);
        if (z10 || zEquals || (zEquals2 && this.f68720i != null)) {
            long j10 = this.f68715d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f68716e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f68724m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f68724m.size(); i10++) {
            this.f68724m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, androidx.media3.common.text.a.c> map) {
        if (!map.containsKey(str)) {
            androidx.media3.common.text.a.c cVar = new androidx.media3.common.text.a.c();
            cVar.A(new SpannableStringBuilder());
            map.put(str, cVar);
        }
        return (SpannableStringBuilder) androidx.media3.common.util.a.g(map.get(str).k());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f68719h)) {
            str = this.f68719h;
        }
        if (m(j10) && "div".equals(this.f68712a) && this.f68720i != null) {
            list.add(new Pair<>(str, this.f68720i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, androidx.media3.common.text.a.c> map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f68719h) ? str : this.f68719h;
            Iterator<Map.Entry<String, Integer>> it = this.f68723l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f68722k.containsKey(key) ? this.f68722k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (androidx.media3.common.text.a.c) androidx.media3.common.util.a.g(map3.get(key)), iIntValue, iIntValue2, ((e) androidx.media3.common.util.a.g(map2.get(str2))).f68759j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, androidx.media3.common.text.a.c> map) {
        this.f68722k.clear();
        this.f68723l.clear();
        if ("metadata".equals(this.f68712a)) {
            return;
        }
        if (!"".equals(this.f68719h)) {
            str = this.f68719h;
        }
        String str2 = str;
        if (this.f68714c && z10) {
            k(str2, map).append((CharSequence) androidx.media3.common.util.a.g(this.f68713b));
            return;
        }
        if ("br".equals(this.f68712a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, androidx.media3.common.text.a.c> entry : map.entrySet()) {
                this.f68722k.put(entry.getKey(), Integer.valueOf(((CharSequence) androidx.media3.common.util.a.g(entry.getValue().k())).length()));
            }
            boolean zEquals = "p".equals(this.f68712a);
            int i10 = 0;
            while (i10 < g()) {
                f(i10).p(j10, z10 || zEquals, str2, map);
                i10++;
                j10 = j10;
                map = map;
            }
            Map<String, androidx.media3.common.text.a.c> map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry<String, androidx.media3.common.text.a.c> entry2 : map2.entrySet()) {
                this.f68723l.put(entry2.getKey(), Integer.valueOf(((CharSequence) androidx.media3.common.util.a.g(entry2.getValue().k())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f68724m == null) {
            this.f68724m = new ArrayList();
        }
        this.f68724m.add(cVar);
    }

    public c f(int i10) {
        List<c> list = this.f68724m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.f68724m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<androidx.media3.common.text.a> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f68719h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f68719h, treeMap);
        o(j10, map, map2, this.f68719h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) androidx.media3.common.util.a.g(map2.get(pair.first));
                arrayList2.add(new androidx.media3.common.text.a.c().r(bitmapDecodeByteArray).w(eVar.f68751b).x(0).t(eVar.f68752c, 0).u(eVar.f68754e).z(eVar.f68755f).s(eVar.f68756g).D(eVar.f68759j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) androidx.media3.common.util.a.g(map2.get(entry.getKey()));
            androidx.media3.common.text.a.c cVar = (androidx.media3.common.text.a.c) entry.getValue();
            e((SpannableStringBuilder) androidx.media3.common.util.a.g(cVar.k()));
            cVar.t(eVar2.f68752c, eVar2.f68753d);
            cVar.u(eVar2.f68754e);
            cVar.w(eVar2.f68751b);
            cVar.z(eVar2.f68755f);
            cVar.C(eVar2.f68758i, eVar2.f68757h);
            cVar.D(eVar2.f68759j);
            arrayList2.add(cVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    @p0
    public String[] l() {
        return this.f68718g;
    }

    public boolean m(long j10) {
        long j11 = this.f68715d;
        if (j11 == -9223372036854775807L && this.f68716e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f68716e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f68716e) {
            return j11 <= j10 && j10 < this.f68716e;
        }
        return true;
    }
}

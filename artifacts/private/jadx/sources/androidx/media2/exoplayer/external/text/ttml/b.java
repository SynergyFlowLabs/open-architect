package androidx.media2.exoplayer.external.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b {
    public static final String A = "information";
    public static final String B = "";
    public static final String C = "id";
    public static final String D = "origin";
    public static final String E = "extent";
    public static final String F = "displayAlign";
    public static final String G = "backgroundColor";
    public static final String H = "fontStyle";
    public static final String I = "fontSize";
    public static final String J = "fontFamily";
    public static final String K = "fontWeight";
    public static final String L = "color";
    public static final String M = "textDecoration";
    public static final String N = "textAlign";
    public static final String O = "linethrough";
    public static final String P = "nolinethrough";
    public static final String Q = "underline";
    public static final String R = "nounderline";
    public static final String S = "italic";
    public static final String T = "bold";
    public static final String U = "left";
    public static final String V = "center";
    public static final String W = "right";
    public static final String X = "start";
    public static final String Y = "end";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f56852m = "tt";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f56853n = "head";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f56854o = "body";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f56855p = "div";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f56856q = "p";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f56857r = "span";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f56858s = "br";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f56859t = "style";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f56860u = "styling";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f56861v = "layout";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f56862w = "region";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f56863x = "metadata";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f56864y = "image";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f56865z = "data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f56866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f56867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f56870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final e f56871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final String[] f56872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final String f56874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap<String, Integer> f56875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f56876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<b> f56877l;

    private b(@p0 String tag, @p0 String text, long startTimeUs, long endTimeUs, @p0 e style, @p0 String[] styleIds, String regionId, @p0 String imageId) {
        this.f56866a = tag;
        this.f56867b = text;
        this.f56874i = imageId;
        this.f56871f = style;
        this.f56872g = styleIds;
        this.f56868c = text != null;
        this.f56869d = startTimeUs;
        this.f56870e = endTimeUs;
        this.f56873h = (String) androidx.media2.exoplayer.external.util.a.g(regionId);
        this.f56875j = new HashMap<>();
        this.f56876k = new HashMap<>();
    }

    private void b(Map<String, e> globalStyles, SpannableStringBuilder regionOutput, int start, int end) {
        e eVarD = d.d(this.f56871f, this.f56872g, globalStyles);
        if (eVarD != null) {
            d.a(regionOutput, start, end, eVarD);
        }
    }

    public static b c(@p0 String tag, long startTimeUs, long endTimeUs, @p0 e style, @p0 String[] styleIds, String regionId, @p0 String imageId) {
        return new b(tag, null, startTimeUs, endTimeUs, style, styleIds, regionId, imageId);
    }

    public static b d(String text) {
        return new b(null, d.b(text), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
    }

    private SpannableStringBuilder e(SpannableStringBuilder builder) {
        int i10;
        int i11;
        int length = builder.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (builder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < builder.length() && builder.charAt(i15) == ' ') {
                    i15++;
                }
                int i16 = i15 - i14;
                if (i16 > 0) {
                    builder.delete(i13, i13 + i16);
                    length -= i16;
                }
            }
        }
        if (length > 0 && builder.charAt(0) == ' ') {
            builder.delete(0, 1);
            length--;
        }
        int i17 = 0;
        while (true) {
            i10 = length - 1;
            if (i17 >= i10) {
                break;
            }
            if (builder.charAt(i17) == '\n') {
                int i18 = i17 + 1;
                if (builder.charAt(i18) == ' ') {
                    builder.delete(i18, i17 + 2);
                    length--;
                }
            }
            i17++;
        }
        if (length > 0 && builder.charAt(i10) == ' ') {
            builder.delete(i10, length);
            length--;
        }
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            if (builder.charAt(i12) == ' ') {
                int i19 = i12 + 1;
                if (builder.charAt(i19) == '\n') {
                    builder.delete(i12, i19);
                    length--;
                }
            }
            i12++;
        }
        if (length > 0 && builder.charAt(i11) == '\n') {
            builder.delete(i11, length);
        }
        return builder;
    }

    private void i(TreeSet<Long> out, boolean descendsPNode) {
        boolean zEquals = "p".equals(this.f56866a);
        boolean zEquals2 = "div".equals(this.f56866a);
        if (descendsPNode || zEquals || (zEquals2 && this.f56874i != null)) {
            long j10 = this.f56869d;
            if (j10 != -9223372036854775807L) {
                out.add(Long.valueOf(j10));
            }
            long j11 = this.f56870e;
            if (j11 != -9223372036854775807L) {
                out.add(Long.valueOf(j11));
            }
        }
        if (this.f56877l == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f56877l.size(); i10++) {
            this.f56877l.get(i10).i(out, descendsPNode || zEquals);
        }
    }

    private static SpannableStringBuilder k(String resolvedRegionId, Map<String, SpannableStringBuilder> regionOutputs) {
        if (!regionOutputs.containsKey(resolvedRegionId)) {
            regionOutputs.put(resolvedRegionId, new SpannableStringBuilder());
        }
        return regionOutputs.get(resolvedRegionId);
    }

    private void n(long timeUs, String inheritedRegion, List<Pair<String, String>> regionImageList) {
        if (!"".equals(this.f56873h)) {
            inheritedRegion = this.f56873h;
        }
        if (m(timeUs) && "div".equals(this.f56866a) && this.f56874i != null) {
            regionImageList.add(new Pair<>(inheritedRegion, this.f56874i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(timeUs, inheritedRegion, regionImageList);
        }
    }

    private void o(long timeUs, Map<String, e> globalStyles, Map<String, SpannableStringBuilder> regionOutputs) {
        int iIntValue;
        if (m(timeUs)) {
            Iterator<Map.Entry<String, Integer>> it = this.f56876k.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                iIntValue = this.f56875j.containsKey(key) ? this.f56875j.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(globalStyles, regionOutputs.get(key), iIntValue, iIntValue2);
                }
            }
            for (iIntValue = 0; iIntValue < g(); iIntValue++) {
                f(iIntValue).o(timeUs, globalStyles, regionOutputs);
            }
        }
    }

    private void p(long timeUs, boolean descendsPNode, String inheritedRegion, Map<String, SpannableStringBuilder> regionOutputs) {
        this.f56875j.clear();
        this.f56876k.clear();
        if ("metadata".equals(this.f56866a)) {
            return;
        }
        if (!"".equals(this.f56873h)) {
            inheritedRegion = this.f56873h;
        }
        String str = inheritedRegion;
        if (this.f56868c && descendsPNode) {
            k(str, regionOutputs).append((CharSequence) this.f56867b);
            return;
        }
        if ("br".equals(this.f56866a) && descendsPNode) {
            k(str, regionOutputs).append('\n');
            return;
        }
        if (m(timeUs)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : regionOutputs.entrySet()) {
                this.f56875j.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean zEquals = "p".equals(this.f56866a);
            int i10 = 0;
            while (i10 < g()) {
                f(i10).p(timeUs, descendsPNode || zEquals, str, regionOutputs);
                i10++;
                timeUs = timeUs;
                regionOutputs = regionOutputs;
            }
            Map<String, SpannableStringBuilder> map = regionOutputs;
            if (zEquals) {
                d.c(k(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.f56876k.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }

    public void a(b child) {
        if (this.f56877l == null) {
            this.f56877l = new ArrayList();
        }
        this.f56877l.add(child);
    }

    public b f(int index) {
        List<b> list = this.f56877l;
        if (list != null) {
            return list.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<b> list = this.f56877l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<androidx.media2.exoplayer.external.text.b> h(long timeUs, Map<String, e> globalStyles, Map<String, c> regionMap, Map<String, String> imageMap) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(timeUs, this.f56873h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(timeUs, false, this.f56873h, treeMap);
        o(timeUs, globalStyles, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = imageMap.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                c cVar = regionMap.get(pair.first);
                arrayList2.add(new androidx.media2.exoplayer.external.text.b(bitmapDecodeByteArray, cVar.f56879b, 0, cVar.f56880c, cVar.f56882e, cVar.f56883f, cVar.f56884g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            c cVar2 = regionMap.get(entry.getKey());
            arrayList2.add(new androidx.media2.exoplayer.external.text.b(e((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, cVar2.f56880c, cVar2.f56881d, cVar2.f56882e, cVar2.f56879b, Integer.MIN_VALUE, cVar2.f56883f, cVar2.f56885h, cVar2.f56886i));
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

    public String[] l() {
        return this.f56872g;
    }

    public boolean m(long timeUs) {
        long j10 = this.f56869d;
        return (j10 == -9223372036854775807L && this.f56870e == -9223372036854775807L) || (j10 <= timeUs && this.f56870e == -9223372036854775807L) || ((j10 == -9223372036854775807L && timeUs < this.f56870e) || (j10 <= timeUs && timeUs < this.f56870e));
    }
}

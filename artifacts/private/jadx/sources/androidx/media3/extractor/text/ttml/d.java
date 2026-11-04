package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.l1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.l;
import androidx.media3.extractor.text.r;
import io.sentry.rrweb.j;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68725b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f68726c = "TtmlParser";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f68727d = "http://www.w3.org/ns/ttml#parameter";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f68728e = "begin";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f68729f = "dur";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f68730g = "end";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f68731h = "style";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68732i = "region";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f68733j = "backgroundImage";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68741r = 30;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f68743t = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f68744a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f68734k = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f68735l = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f68736m = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Pattern f68737n = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Pattern f68738o = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f68739p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f68740q = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a f68742s = new a(30.0f, 1, 1);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f68745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f68746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f68747c;

        a(float f10, int i10, int i11) {
            this.f68745a = f10;
            this.f68746b = i10;
            this.f68747c = i11;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f68748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f68749b;

        b(int i10, int i11) {
            this.f68748a = i10;
            this.f68749b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f68744a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g e(@p0 g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean f(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @p0
    private static Layout.Alignment g(String str) {
        String strG = com.google.common.base.c.g(str);
        strG.getClass();
        int i10 = 4 ^ (-1);
        switch (strG) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int h(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(f68727d, "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f68740q.matcher(attributeValue);
        if (!matcher.matches()) {
            z.n(f68726c, "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) androidx.media3.common.util.a.g(matcher.group(1)));
            int i12 = Integer.parseInt((String) androidx.media3.common.util.a.g(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            androidx.media3.common.util.a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            z.n(f68726c, "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void i(String str, g gVar) throws l {
        Matcher matcher;
        String[] strArrL2 = k1.l2(str, "\\s+");
        if (strArrL2.length == 1) {
            matcher = f68736m.matcher(str);
        } else {
            if (strArrL2.length != 2) {
                throw new l("Invalid number of entries for fontSize: " + strArrL2.length + ".");
            }
            matcher = f68736m.matcher(strArrL2[1]);
            z.n(f68726c, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new l("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) androidx.media3.common.util.a.g(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.D(3);
                break;
            case "em":
                gVar.D(2);
                break;
            case "px":
                gVar.D(1);
                break;
            default:
                throw new l("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.C(Float.parseFloat((String) androidx.media3.common.util.a.g(matcher.group(1))));
    }

    private static a j(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue(f68727d, j.b.f306747l);
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(f68727d, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrL2 = k1.l2(attributeValue2, " ");
            androidx.media3.common.util.a.b(strArrL2.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(strArrL2[0]) / Integer.parseInt(strArrL2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f68742s;
        int i11 = aVar.f68746b;
        String attributeValue3 = xmlPullParser.getAttributeValue(f68727d, "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f68747c;
        String attributeValue4 = xmlPullParser.getAttributeValue(f68727d, "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static Map<String, g> k(XmlPullParser xmlPullParser, Map<String, g> map, int i10, @p0 b bVar, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (l1.f(xmlPullParser, "style")) {
                String strA = l1.a(xmlPullParser, "style");
                g gVarP = p(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : q(strA)) {
                        gVarP.a(map.get(str));
                    }
                }
                String strH = gVarP.h();
                if (strH != null) {
                    map.put(strH, gVarP);
                }
            } else if (l1.f(xmlPullParser, "region")) {
                e eVarN = n(xmlPullParser, i10, bVar, map);
                if (eVarN != null) {
                    map2.put(eVarN.f68750a, eVarN);
                }
            } else if (l1.f(xmlPullParser, "metadata")) {
                l(xmlPullParser, map3);
            }
        } while (!l1.d(xmlPullParser, "head"));
        return map;
    }

    private static void l(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (l1.f(xmlPullParser, "image") && (strA = l1.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!l1.d(xmlPullParser, "metadata"));
    }

    private static c m(XmlPullParser xmlPullParser, @p0 c cVar, Map<String, e> map, a aVar) throws l {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarP = p(xmlPullParser2, null);
        long jR = -9223372036854775807L;
        long jR2 = -9223372036854775807L;
        long jR3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i10++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i11;
                    break;
                case "dur":
                    jR3 = r(attributeValue, aVar);
                    break;
                case "end":
                    jR2 = r(attributeValue, aVar);
                    break;
                case "begin":
                    jR = r(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrQ = q(attributeValue);
                    if (strArrQ.length > 0) {
                        strArr = strArrQ;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (cVar != null) {
            long j10 = cVar.f68715d;
            if (j10 != -9223372036854775807L) {
                if (jR != -9223372036854775807L) {
                    jR += j10;
                }
                if (jR2 != -9223372036854775807L) {
                    jR2 += j10;
                }
            }
        }
        long j11 = jR;
        if (jR2 == -9223372036854775807L) {
            if (jR3 != -9223372036854775807L) {
                jR2 = j11 + jR3;
            } else if (cVar != null) {
                long j12 = cVar.f68716e;
                if (j12 != -9223372036854775807L) {
                    jR2 = j12;
                }
            }
        }
        return c.c(xmlPullParser.getName(), j11, jR2, gVarP, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0203  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @p0
    private static e n(XmlPullParser xmlPullParser, int i10, @p0 b bVar, Map<String, g> map) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        String strA;
        g gVar;
        String strA2;
        g gVar2;
        String strA3 = l1.a(xmlPullParser, "id");
        if (strA3 == null) {
            return null;
        }
        String strA4 = l1.a(xmlPullParser, "origin");
        if (strA4 == null && (strA2 = l1.a(xmlPullParser, "style")) != null && (gVar2 = map.get(strA2)) != null) {
            strA4 = gVar2.j();
        }
        int i12 = 2;
        if (strA4 != null) {
            Matcher matcher = f68738o.matcher(strA4);
            Matcher matcher2 = f68739p.matcher(strA4);
            if (matcher.matches()) {
                try {
                    f11 = Float.parseFloat((String) androidx.media3.common.util.a.g(matcher.group(1))) / 100.0f;
                    f10 = Float.parseFloat((String) androidx.media3.common.util.a.g(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    z.n(f68726c, "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    z.n(f68726c, "Ignoring region with unsupported origin: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    z.n(f68726c, "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i13 = Integer.parseInt((String) androidx.media3.common.util.a.g(matcher2.group(1)));
                    int i14 = Integer.parseInt((String) androidx.media3.common.util.a.g(matcher2.group(2)));
                    float f18 = i13 / bVar.f68748a;
                    float f19 = i14 / bVar.f68749b;
                    f11 = f18;
                    f10 = f19;
                } catch (NumberFormatException unused2) {
                    z.n(f68726c, "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        String strA5 = l1.a(xmlPullParser, "extent");
        if (strA5 == null && (strA = l1.a(xmlPullParser, "style")) != null && (gVar = map.get(strA)) != null) {
            strA5 = gVar.c();
        }
        if (strA5 != null) {
            Matcher matcher3 = f68738o.matcher(strA5);
            Matcher matcher4 = f68739p.matcher(strA5);
            f12 = 1.0f;
            if (matcher3.matches()) {
                try {
                    f13 = Float.parseFloat((String) androidx.media3.common.util.a.g(matcher3.group(1))) / 100.0f;
                    f17 = Float.parseFloat((String) androidx.media3.common.util.a.g(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    z.n(f68726c, "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    z.n(f68726c, "Ignoring region with unsupported extent: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    z.n(f68726c, "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i15 = Integer.parseInt((String) androidx.media3.common.util.a.g(matcher4.group(1)));
                    int i16 = Integer.parseInt((String) androidx.media3.common.util.a.g(matcher4.group(2)));
                    float f20 = i15 / bVar.f68748a;
                    f17 = i16 / bVar.f68749b;
                    f13 = f20;
                } catch (NumberFormatException unused4) {
                    z.n(f68726c, "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            }
            f14 = f17;
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
            f14 = 1.0f;
        }
        String strA6 = l1.a(xmlPullParser, "displayAlign");
        int i17 = 0;
        if (strA6 != null) {
            String strG = com.google.common.base.c.g(strA6);
            strG.getClass();
            if (strG.equals("center")) {
                f16 = f10 + (f14 / 2.0f);
                i12 = 1;
            } else if (strG.equals(c.f68677e0)) {
                f16 = f10 + f14;
            } else {
                i10 = i10;
                i12 = 2;
                f15 = f10;
                i12 = 0;
            }
            f15 = f16;
        } else {
            i10 = i10;
            i12 = 2;
            f15 = f10;
            i12 = 0;
        }
        float f21 = f12 / i10;
        String strA7 = l1.a(xmlPullParser, c.U);
        if (strA7 != null) {
            String strG2 = com.google.common.base.c.g(strA7);
            strG2.getClass();
            switch (strG2.hashCode()) {
                case 3694:
                    if (!strG2.equals("tb")) {
                        i17 = -1;
                    }
                    break;
                case 3553396:
                    i17 = !strG2.equals(c.f68701u0) ? -1 : 1;
                    break;
                case 3553576:
                    i17 = !strG2.equals(c.f68703v0) ? -1 : i12;
                    break;
                default:
                    i17 = -1;
                    break;
            }
            switch (i17) {
                case 0:
                case 1:
                    i11 = i12;
                    break;
                case 2:
                    i11 = 1;
                    break;
                default:
                    i11 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new e(strA3, f11, f15, 0, i12, f13, f14, 1, f21, i11);
    }

    private static float o(String str) {
        Matcher matcher = f68737n.matcher(str);
        if (!matcher.matches()) {
            z.n(f68726c, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) androidx.media3.common.util.a.g(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            z.o(f68726c, "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x0245  */
    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static g p(XmlPullParser xmlPullParser, g gVar) {
        byte b10;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        b10 = 4;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        b10 = 5;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        b10 = 6;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        b10 = 7;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals(c.O)) {
                        b10 = 8;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        b10 = 9;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals(c.V)) {
                        b10 = 10;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals(c.S)) {
                        b10 = 11;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        b10 = com.google.common.base.c.f116461n;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals(c.T)) {
                        b10 = com.google.common.base.c.f116462o;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals(c.P)) {
                        b10 = com.google.common.base.c.f116463p;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        b10 = com.google.common.base.c.f116464q;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals(c.W)) {
                        b10 = com.google.common.base.c.f116465r;
                    } else {
                        b10 = -1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    gVar = e(gVar).F("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    gVar = e(gVar).z(attributeValue);
                    break;
                case 2:
                    gVar = e(gVar).B(attributeValue);
                    break;
                case 3:
                    gVar = e(gVar).M(g(attributeValue));
                    break;
                case 4:
                    gVar = e(gVar).I(attributeValue);
                    break;
                case 5:
                    String strG = com.google.common.base.c.g(attributeValue);
                    strG.getClass();
                    switch (strG) {
                        case "nounderline":
                            gVar = e(gVar).P(false);
                            break;
                        case "underline":
                            gVar = e(gVar).P(true);
                            break;
                        case "nolinethrough":
                            gVar = e(gVar).G(false);
                            break;
                        case "linethrough":
                            gVar = e(gVar).G(true);
                            break;
                    }
                    break;
                case 6:
                    gVar = e(gVar).y("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = e(gVar).E(attributeValue);
                    }
                    break;
                case 8:
                    String strG2 = com.google.common.base.c.g(attributeValue);
                    strG2.getClass();
                    switch (strG2) {
                        case "baseContainer":
                        case "base":
                            gVar = e(gVar).K(2);
                            break;
                        case "container":
                            gVar = e(gVar).K(1);
                            break;
                        case "delimiter":
                            gVar = e(gVar).K(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = e(gVar).K(3);
                            break;
                    }
                    break;
                case 9:
                    gVar = e(gVar);
                    try {
                        gVar.A(androidx.media3.common.util.l.c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        z.n(f68726c, "Failed parsing color value: " + attributeValue);
                    }
                    break;
                case 10:
                    gVar = e(gVar).L(o(attributeValue));
                    break;
                case 11:
                    String strG3 = com.google.common.base.c.g(attributeValue);
                    strG3.getClass();
                    if (strG3.equals("all")) {
                        gVar = e(gVar).N(true);
                    } else if (strG3.equals("none")) {
                        gVar = e(gVar).N(false);
                    }
                    break;
                case 12:
                    try {
                        gVar = e(gVar);
                        i(attributeValue, gVar);
                    } catch (l unused2) {
                        z.n(f68726c, "Failed parsing fontSize value: " + attributeValue);
                    }
                    break;
                case 13:
                    gVar = e(gVar).O(androidx.media3.extractor.text.ttml.b.a(attributeValue));
                    break;
                case 14:
                    String strG4 = com.google.common.base.c.g(attributeValue);
                    strG4.getClass();
                    if (strG4.equals(c.f68676d0)) {
                        gVar = e(gVar).J(1);
                    } else if (strG4.equals(c.f68677e0)) {
                        gVar = e(gVar).J(2);
                    }
                    break;
                case 15:
                    gVar = e(gVar);
                    try {
                        gVar.x(androidx.media3.common.util.l.c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        z.n(f68726c, "Failed parsing background value: " + attributeValue);
                    }
                    break;
                case 16:
                    gVar = e(gVar).H(g(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] q(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : k1.l2(strTrim, "\\s+");
    }

    private static long r(String str, a aVar) throws l {
        double d10;
        double d11;
        Matcher matcher = f68734k.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(1))) * 3600) + (Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(2))) * 60) + Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / aVar.f68745a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) aVar.f68746b)) / ((double) aVar.f68745a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f68735l.matcher(str);
        if (!matcher2.matches()) {
            throw new l("Malformed time expression: " + str);
        }
        double d15 = Double.parseDouble((String) androidx.media3.common.util.a.g(matcher2.group(1)));
        String str2 = (String) androidx.media3.common.util.a.g(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d10 = aVar.f68745a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = aVar.f68747c;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d11;
        return (long) (d15 * 1000000.0d);
    }

    @p0
    private static b s(XmlPullParser xmlPullParser) {
        String strA = l1.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f68739p.matcher(strA);
        if (!matcher.matches()) {
            z.n(f68726c, "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) androidx.media3.common.util.a.g(matcher.group(1))), Integer.parseInt((String) androidx.media3.common.util.a.g(matcher.group(2))));
        } catch (NumberFormatException unused) {
            z.n(f68726c, "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<androidx.media3.extractor.text.d> oVar) {
        androidx.media3.extractor.text.h.c(d(bArr, i10, i11), bVar, oVar);
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.r
    public androidx.media3.extractor.text.j d(byte[] bArr, int i10, int i11) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f68744a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iH = 15;
            a aVarJ = f68742s;
            b bVarS = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarJ = j(xmlPullParserNewPullParser);
                            iH = h(xmlPullParserNewPullParser, 15);
                            bVarS = s(xmlPullParserNewPullParser);
                        }
                        a aVar = aVarJ;
                        b bVar = bVarS;
                        int i13 = iH;
                        if (f(name)) {
                            if ("head".equals(name)) {
                                k(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                try {
                                    c cVarM = m(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarM);
                                    if (cVar != null) {
                                        cVar.a(cVarM);
                                    }
                                } catch (l e10) {
                                    z.o(f68726c, "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iH = i13;
                            bVarS = bVar;
                            aVarJ = aVar;
                        } else {
                            z.h(f68726c, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iH = i13;
                        bVarS = bVar;
                        aVarJ = aVar;
                    } else if (eventType == 4) {
                        ((c) androidx.media3.common.util.a.g(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((c) androidx.media3.common.util.a.g((c) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (androidx.media3.extractor.text.j) androidx.media3.common.util.a.g(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }
}

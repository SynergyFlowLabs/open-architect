package androidx.media2.exoplayer.external.text.ttml;

import android.text.Layout;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.g;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.r0;
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

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends androidx.media2.exoplayer.external.text.c {
    private static final int D = 30;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f56833p = "TtmlDecoder";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f56834q = "http://www.w3.org/ns/ttml#parameter";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f56835r = "begin";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f56836s = "dur";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f56837t = "end";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f56838u = "style";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f56839v = "region";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f56840w = "backgroundImage";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f56844o;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f56841x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f56842y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f56843z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern A = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern B = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern C = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b E = new b(30.0f, 1, 1);
    private static final C0527a F = new C0527a(32, 15);

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.ttml.a$a, reason: collision with other inner class name */
    private static final class C0527a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f56845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f56846b;

        C0527a(int columns, int rows) {
            this.f56845a = columns;
            this.f56846b = rows;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f56847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f56848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f56849c;

        b(float effectiveFrameRate, int subFrameRate, int tickRate) {
            this.f56847a = effectiveFrameRate;
            this.f56848b = subFrameRate;
            this.f56849c = tickRate;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f56850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f56851b;

        c(int width, int height) {
            this.f56850a = width;
            this.f56851b = height;
        }
    }

    public a() {
        super(f56833p);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f56844o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private e B(e style) {
        return style == null ? new e() : style;
    }

    private static boolean C(String tag) {
        if (!tag.equals("tt") && !tag.equals("head") && !tag.equals("body") && !tag.equals("div") && !tag.equals("p") && !tag.equals("span") && !tag.equals("br") && !tag.equals("style") && !tag.equals("styling") && !tag.equals("layout") && !tag.equals("region") && !tag.equals("metadata") && !tag.equals("image") && !tag.equals("data") && !tag.equals("information")) {
            return false;
        }
        return true;
    }

    private C0527a D(XmlPullParser xmlParser, C0527a defaultValue) throws g {
        String attributeValue = xmlParser.getAttributeValue(f56834q, "cellResolution");
        if (attributeValue == null) {
            return defaultValue;
        }
        Matcher matcher = C.matcher(attributeValue);
        if (!matcher.matches()) {
            p.l(f56833p, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return defaultValue;
        }
        try {
            int i10 = Integer.parseInt(matcher.group(1));
            int i11 = Integer.parseInt(matcher.group(2));
            if (i10 != 0 && i11 != 0) {
                return new C0527a(i10, i11);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append(i11);
            throw new g(sb2.toString());
        } catch (NumberFormatException unused) {
            p.l(f56833p, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return defaultValue;
        }
    }

    private static void E(String expression, e out) throws g {
        Matcher matcher;
        String[] strArrO0 = q0.O0(expression, "\\s+");
        if (strArrO0.length == 1) {
            matcher = f56843z.matcher(expression);
        } else {
            if (strArrO0.length != 2) {
                int length = strArrO0.length;
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Invalid number of entries for fontSize: ");
                sb2.append(length);
                sb2.append(".");
                throw new g(sb2.toString());
            }
            matcher = f56843z.matcher(strArrO0[1]);
            p.l(f56833p, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(expression).length() + 36);
            sb3.append("Invalid expression for fontSize: '");
            sb3.append(expression);
            sb3.append("'.");
            throw new g(sb3.toString());
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        int i10 = 1 ^ (-1);
        switch (strGroup) {
            case "%":
                out.u(3);
                break;
            case "em":
                out.u(2);
                break;
            case "px":
                out.u(1);
                break;
            default:
                StringBuilder sb4 = new StringBuilder(strGroup.length() + 30);
                sb4.append("Invalid unit for fontSize: '");
                sb4.append(strGroup);
                sb4.append("'.");
                throw new g(sb4.toString());
        }
        out.t(Float.valueOf(matcher.group(1)).floatValue());
    }

    private b F(XmlPullParser xmlParser) throws g {
        float f10;
        String attributeValue = xmlParser.getAttributeValue(f56834q, j.b.f306747l);
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlParser.getAttributeValue(f56834q, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrO0 = q0.O0(attributeValue2, " ");
            if (strArrO0.length != 2) {
                throw new g("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrO0[0]) / Integer.parseInt(strArrO0[1]);
        } else {
            f10 = 1.0f;
        }
        b bVar = E;
        int i11 = bVar.f56848b;
        String attributeValue3 = xmlParser.getAttributeValue(f56834q, "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f56849c;
        String attributeValue4 = xmlParser.getAttributeValue(f56834q, "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    private Map<String, e> G(XmlPullParser xmlParser, Map<String, e> globalStyles, C0527a cellResolution, c ttsExtent, Map<String, androidx.media2.exoplayer.external.text.ttml.c> globalRegions, Map<String, String> imageMap) throws XmlPullParserException, IOException {
        do {
            xmlParser.next();
            if (r0.f(xmlParser, "style")) {
                String strA = r0.a(xmlParser, "style");
                e eVarK = K(xmlParser, new e());
                if (strA != null) {
                    for (String str : L(strA)) {
                        eVarK.a(globalStyles.get(str));
                    }
                }
                if (eVarK.g() != null) {
                    globalStyles.put(eVarK.g(), eVarK);
                }
            } else if (r0.f(xmlParser, "region")) {
                androidx.media2.exoplayer.external.text.ttml.c cVarJ = J(xmlParser, cellResolution, ttsExtent);
                if (cVarJ != null) {
                    globalRegions.put(cVarJ.f56878a, cVarJ);
                }
            } else if (r0.f(xmlParser, "metadata")) {
                H(xmlParser, imageMap);
            }
        } while (!r0.d(xmlParser, "head"));
        return globalStyles;
    }

    private void H(XmlPullParser xmlParser, Map<String, String> imageMap) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlParser.next();
            if (r0.f(xmlParser, "image") && (strA = r0.a(xmlParser, "id")) != null) {
                imageMap.put(strA, xmlParser.nextText());
            }
        } while (!r0.d(xmlParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x004e  */
    private androidx.media2.exoplayer.external.text.ttml.b I(XmlPullParser parser, androidx.media2.exoplayer.external.text.ttml.b parent, Map<String, androidx.media2.exoplayer.external.text.ttml.c> regionMap, b frameAndTickRate) throws g {
        long j10;
        int attributeCount = parser.getAttributeCount();
        e eVarK = K(parser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long jM = -9223372036854775807L;
        long jM2 = -9223372036854775807L;
        long jM3 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = parser.getAttributeName(i10);
            String attributeValue = parser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (regionMap.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jM3 = M(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    jM2 = M(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    jM = M(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] strArrL = L(attributeValue);
                    if (strArrL.length > 0) {
                        strArr = strArrL;
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
        }
        if (parent != null) {
            long j11 = parent.f56869d;
            if (j11 != -9223372036854775807L) {
                if (jM != -9223372036854775807L) {
                    jM += j11;
                }
                if (jM2 != -9223372036854775807L) {
                    jM2 += j11;
                }
            }
        }
        long j12 = jM;
        if (jM2 != -9223372036854775807L) {
            j10 = jM2;
        } else {
            if (jM3 != -9223372036854775807L) {
                jM2 = j12 + jM3;
            } else if (parent != null) {
                long j13 = parent.f56870e;
                if (j13 != -9223372036854775807L) {
                    j10 = j13;
                }
            }
            j10 = jM2;
        }
        return androidx.media2.exoplayer.external.text.ttml.b.c(parser.getName(), j12, j10, eVarK, strArr, str, strSubstring);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    private androidx.media2.exoplayer.external.text.ttml.c J(XmlPullParser xmlParser, C0527a cellResolution, c ttsExtent) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        String strA = r0.a(xmlParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = r0.a(xmlParser, "origin");
        if (strA2 == null) {
            p.l(f56833p, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = A;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = B;
        Matcher matcher2 = pattern2.matcher(strA2);
        int i11 = 2;
        if (matcher.matches()) {
            try {
                f10 = Float.parseFloat(matcher.group(1)) / 100.0f;
                f11 = Float.parseFloat(matcher.group(2)) / 100.0f;
            } catch (NumberFormatException unused) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with malformed origin: ".concat(strA2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with unsupported origin: ".concat(strA2) : new String("Ignoring region with unsupported origin: "));
                return null;
            }
            if (ttsExtent == null) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strA2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i12 = Integer.parseInt(matcher2.group(1));
                int i13 = Integer.parseInt(matcher2.group(2));
                float f15 = i12 / ttsExtent.f56850a;
                float f16 = i13 / ttsExtent.f56851b;
                f10 = f15;
                f11 = f16;
            } catch (NumberFormatException unused2) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with malformed origin: ".concat(strA2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        }
        String strA3 = r0.a(xmlParser, "extent");
        if (strA3 == null) {
            p.l(f56833p, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f12 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                f13 = Float.parseFloat(matcher3.group(2)) / 100.0f;
            } catch (NumberFormatException unused3) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with malformed extent: ".concat(strA2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with unsupported extent: ".concat(strA2) : new String("Ignoring region with unsupported extent: "));
                return null;
            }
            if (ttsExtent == null) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strA2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i14 = Integer.parseInt(matcher4.group(1));
                int i15 = Integer.parseInt(matcher4.group(2));
                float f17 = i14 / ttsExtent.f56850a;
                f13 = i15 / ttsExtent.f56851b;
                f12 = f17;
            } catch (NumberFormatException unused4) {
                p.l(f56833p, strA2.length() != 0 ? "Ignoring region with malformed extent: ".concat(strA2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        }
        float f18 = f13;
        String strA4 = r0.a(xmlParser, "displayAlign");
        if (strA4 != null) {
            String strV0 = q0.V0(strA4);
            strV0.getClass();
            if (strV0.equals("center")) {
                f14 = f11 + (f18 / 2.0f);
                i10 = 1;
            } else {
                if (strV0.equals(androidx.media3.extractor.text.ttml.c.f68677e0)) {
                    f11 += f18;
                } else {
                    i11 = 0;
                }
                f14 = f11;
                i10 = i11;
            }
        } else {
            i11 = 0;
            f14 = f11;
            i10 = i11;
        }
        return new androidx.media2.exoplayer.external.text.ttml.c(strA, f10, f14, 0, i10, f12, f18, 1, 1.0f / cellResolution.f56846b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    /* JADX WARN: Code duplicated, block: B:75:0x0170  */
    private e K(XmlPullParser parser, e style) {
        int attributeCount = parser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = parser.getAttributeValue(i10);
            String attributeName = parser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    style = B(style).w("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    style = B(style).s(attributeValue);
                    break;
                case "textAlign":
                    String strV0 = q0.V0(attributeValue);
                    strV0.getClass();
                    switch (strV0) {
                        case "center":
                            style = B(style).y(Layout.Alignment.ALIGN_CENTER);
                            break;
                        case "end":
                            style = B(style).y(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "left":
                            style = B(style).y(Layout.Alignment.ALIGN_NORMAL);
                            break;
                        case "right":
                            style = B(style).y(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "start":
                            style = B(style).y(Layout.Alignment.ALIGN_NORMAL);
                            break;
                    }
                    break;
                case "textDecoration":
                    String strV1 = q0.V0(attributeValue);
                    strV1.getClass();
                    switch (strV1) {
                        case "nounderline":
                            style = B(style).z(false);
                            break;
                        case "underline":
                            style = B(style).z(true);
                            break;
                        case "nolinethrough":
                            style = B(style).x(false);
                            break;
                        case "linethrough":
                            style = B(style).x(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    style = B(style).q("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if ("style".equals(parser.getName())) {
                        style = B(style).v(attributeValue);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "color":
                    style = B(style);
                    try {
                        style.r(androidx.media2.exoplayer.external.util.e.d(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        p.l(f56833p, strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        style = B(style);
                        E(attributeValue, style);
                        break;
                    } catch (g unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        p.l(f56833p, strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                        break;
                    }
                    break;
                case "backgroundColor":
                    style = B(style);
                    try {
                        style.p(androidx.media2.exoplayer.external.util.e.d(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        p.l(f56833p, strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                        break;
                    }
                    break;
            }
        }
        return style;
    }

    private String[] L(String parentStyleIds) {
        String strTrim = parentStyleIds.trim();
        return strTrim.isEmpty() ? new String[0] : q0.O0(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    private static long M(String time, b frameAndTickRate) throws g {
        double d10;
        double d11;
        Matcher matcher = f56841x.matcher(time);
        if (matcher.matches()) {
            double d12 = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.f56847a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.f56848b)) / ((double) frameAndTickRate.f56847a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f56842y.matcher(time);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(time);
            throw new g(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        double d15 = Double.parseDouble(matcher2.group(1));
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d10 = frameAndTickRate.f56847a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = frameAndTickRate.f56849c;
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

    private c N(XmlPullParser xmlParser) {
        String strA = r0.a(xmlParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = B.matcher(strA);
        if (!matcher.matches()) {
            p.l(f56833p, strA.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strA) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            p.l(f56833p, strA.length() != 0 ? "Ignoring malformed tts extent: ".concat(strA) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected androidx.media2.exoplayer.external.text.e y(byte[] bytes, int length, boolean reset) throws g {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f56844o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            c cVarN = null;
            map2.put("", new androidx.media2.exoplayer.external.text.ttml.c(null));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bytes, 0, length), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = 0;
            b bVarF = E;
            C0527a c0527aD = F;
            f fVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                androidx.media2.exoplayer.external.text.ttml.b bVar = (androidx.media2.exoplayer.external.text.ttml.b) arrayDeque.peek();
                if (i10 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarF = F(xmlPullParserNewPullParser);
                            c0527aD = D(xmlPullParserNewPullParser, F);
                            cVarN = N(xmlPullParserNewPullParser);
                        }
                        C0527a c0527a = c0527aD;
                        b bVar2 = bVarF;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                G(xmlPullParserNewPullParser, map, c0527a, cVarN, map2, map3);
                            } else {
                                try {
                                    androidx.media2.exoplayer.external.text.ttml.b bVarI = I(xmlPullParserNewPullParser, bVar, map2, bVar2);
                                    arrayDeque.push(bVarI);
                                    if (bVar != null) {
                                        bVar.a(bVarI);
                                    }
                                } catch (g e10) {
                                    p.m(f56833p, "Suppressing parser error", e10);
                                    i10++;
                                }
                            }
                            c0527aD = c0527a;
                            bVarF = bVar2;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            p.h(f56833p, strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                        }
                        i10++;
                        c0527aD = c0527a;
                        bVarF = bVar2;
                    } else if (eventType == 4) {
                        bVar.a(androidx.media2.exoplayer.external.text.ttml.b.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            fVar = new f((androidx.media2.exoplayer.external.text.ttml.b) arrayDeque.peek(), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                xmlPullParserNewPullParser.next();
            }
            return fVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new g("Unable to decode source", e12);
        }
    }
}

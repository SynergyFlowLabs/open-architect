package androidx.media3.extractor.jpeg;

import androidx.annotation.p0;
import androidx.compose.material3.internal.b4;
import androidx.media3.common.util.l1;
import androidx.media3.common.util.z;
import androidx.media3.common.v0;
import com.google.common.collect.l6;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f67419a = "MotionPhotoXmpParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f67420b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f67421c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f67422d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private f() {
    }

    @p0
    public static c a(String str) throws IOException {
        try {
            return b(str);
        } catch (v0 | NumberFormatException | XmlPullParserException unused) {
            z.n(f67419a, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @p0
    private static c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!l1.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw v0.a("Couldn't find xmp metadata", null);
        }
        l6<c.a> l6VarF = l6.F();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (l1.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                l6VarF = c(xmlPullParserNewPullParser);
            } else if (l1.f(xmlPullParserNewPullParser, "Container:Directory")) {
                l6VarF = f(xmlPullParserNewPullParser, b4.f28679i, "Item");
            } else if (l1.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                l6VarF = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!l1.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (l6VarF.isEmpty()) {
            return null;
        }
        return new c(jE, l6VarF);
    }

    private static l6<c.a> c(XmlPullParser xmlPullParser) {
        int i10 = 2 << 0;
        for (String str : f67422d) {
            String strA = l1.a(xmlPullParser, str);
            if (strA != null) {
                return l6.J(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return l6.F();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f67420b) {
            String strA = l1.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f67421c) {
            String strA = l1.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static l6<c.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        l6.a aVarS = l6.s();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (l1.f(xmlPullParser, str3)) {
                String strA = l1.a(xmlPullParser, str2 + ":Mime");
                String strA2 = l1.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = l1.a(xmlPullParser, str2 + ":Length");
                String strA4 = l1.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return l6.F();
                }
                aVarS.a(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!l1.d(xmlPullParser, str4));
        return aVarS.e();
    }
}

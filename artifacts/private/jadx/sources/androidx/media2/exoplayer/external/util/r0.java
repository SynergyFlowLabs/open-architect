package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class r0 {
    private r0() {
    }

    @androidx.annotation.p0
    public static String a(XmlPullParser xpp, String attributeName) {
        int attributeCount = xpp.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xpp.getAttributeName(i10).equals(attributeName)) {
                return xpp.getAttributeValue(i10);
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static String b(XmlPullParser xpp, String attributeName) {
        int attributeCount = xpp.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (h(xpp.getAttributeName(i10)).equals(attributeName)) {
                return xpp.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xpp) throws XmlPullParserException {
        if (xpp.getEventType() != 3) {
            return false;
        }
        int i10 = 7 | 1;
        return true;
    }

    public static boolean d(XmlPullParser xpp, String name) throws XmlPullParserException {
        return c(xpp) && xpp.getName().equals(name);
    }

    public static boolean e(XmlPullParser xpp) throws XmlPullParserException {
        return xpp.getEventType() == 2;
    }

    public static boolean f(XmlPullParser xpp, String name) throws XmlPullParserException {
        return e(xpp) && xpp.getName().equals(name);
    }

    public static boolean g(XmlPullParser xpp, String name) throws XmlPullParserException {
        return e(xpp) && h(xpp.getName()).equals(name);
    }

    private static String h(String name) {
        int iIndexOf = name.indexOf(58);
        return iIndexOf == -1 ? name : name.substring(iIndexOf + 1);
    }
}

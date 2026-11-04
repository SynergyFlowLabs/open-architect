package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f124686a = "entry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f124687b = "key";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f124688c = "value";

    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    public static Map<String, String> a(Context context, int i10) {
        byte b10;
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return map;
            }
            XmlResourceParser xml = resources.getXml(i10);
            String name = null;
            String text = null;
            String text2 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                int i11 = 5 << 2;
                if (eventType == 2) {
                    name = xml.getName();
                } else if (eventType == 3) {
                    if (xml.getName().equals(f124686a)) {
                        if (text != null && text2 != null) {
                            map.put(text, text2);
                        }
                        text = null;
                        text2 = null;
                    }
                    name = null;
                } else if (eventType == 4 && name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != 106079) {
                        if (iHashCode == 111972721 && name.equals("value")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (name.equals(f124687b)) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        text = xml.getText();
                    } else if (b10 == 1) {
                        text2 = xml.getText();
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return map;
    }
}

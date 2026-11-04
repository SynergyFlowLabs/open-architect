package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.m1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47609a = "ShortcutXmlParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47610b = "android.app.shortcuts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47611c = "shortcut";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47612d = "shortcutId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile ArrayList<String> f47613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f47614f = new Object();

    private l() {
    }

    private static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @NonNull
    @m1
    public static List<String> b(@NonNull Context context) {
        if (f47613e == null) {
            synchronized (f47614f) {
                try {
                    if (f47613e == null) {
                        f47613e = new ArrayList<>();
                        f47613e.addAll(e(context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47613e;
    }

    @NonNull
    private static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f47610b);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @NonNull
    @l1
    public static List<String> d(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f47611c.equals(name) && (strA = a(xmlPullParser, f47612d)) != null) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @NonNull
    private static Set<String> e(@NonNull Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f47610b)) {
                        XmlResourceParser xmlResourceParserC = c(context, activityInfo);
                        try {
                            hashSet.addAll(d(xmlResourceParserC));
                            if (xmlResourceParserC != null) {
                                xmlResourceParserC.close();
                            }
                        } catch (Throwable th2) {
                            if (xmlResourceParserC != null) {
                                try {
                                    xmlResourceParserC.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }
}

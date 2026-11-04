package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class<?>[] f73129e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Constructor<?>> f73130f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f73131g = "intent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f73132h = "extra";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f73133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f73134b = new Object[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f73135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f73136d;

    public r(@NonNull Context context, s sVar) {
        this.f73133a = context;
        g(sVar);
    }

    private Preference a(@NonNull String str, @p0 String[] strArr, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = f73130f.get(str);
        int i10 = 6 >> 1;
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f73133a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f73129e);
                    constructor.setAccessible(true);
                    f73130f.put(str, constructor);
                } catch (ClassNotFoundException e12) {
                    throw e12;
                }
            } catch (Exception e13) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e13);
                throw inflateException;
            }
        }
        Object[] objArr = this.f73134b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? h(str, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    private void g(s sVar) {
        this.f73135c = sVar;
        k(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    @NonNull
    private PreferenceGroup i(PreferenceGroup preferenceGroup, @NonNull PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.s0(this.f73135c);
        return preferenceGroup2;
    }

    private void j(@NonNull XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (f73131g.equals(name)) {
                    try {
                        preference.d1(Intent.parseIntent(c().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    c().getResources().parseBundleExtra("extra", attributeSet, preference.t());
                    try {
                        l(xmlPullParser);
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    ((PreferenceGroup) preference).D1(preferenceB);
                    j(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }

    private static void l(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int i10 = 7 & 3;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    @NonNull
    public Context c() {
        return this.f73133a;
    }

    public String[] d() {
        return this.f73136d;
    }

    @NonNull
    public Preference e(int i10, @p0 PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = c().getResources().getXml(i10);
        try {
            Preference preferenceF = f(xml, preferenceGroup);
            xml.close();
            return preferenceF;
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    @NonNull
    public Preference f(XmlPullParser xmlPullParser, @p0 PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupI;
        synchronized (this.f73134b) {
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                this.f73134b[0] = this.f73133a;
                do {
                    try {
                        try {
                            try {
                                next = xmlPullParser.next();
                                if (next == 2) {
                                    break;
                                }
                            } catch (InflateException e10) {
                                throw e10;
                            }
                        } catch (IOException e11) {
                            InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e11.getMessage());
                            inflateException.initCause(e11);
                            throw inflateException;
                        }
                    } catch (XmlPullParserException e12) {
                        InflateException inflateException2 = new InflateException(e12.getMessage());
                        inflateException2.initCause(e12);
                        throw inflateException2;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
                preferenceGroupI = i(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), attributeSetAsAttributeSet));
                j(xmlPullParser, preferenceGroupI, attributeSetAsAttributeSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return preferenceGroupI;
    }

    protected Preference h(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return a(str, this.f73136d, attributeSet);
    }

    public void k(String[] strArr) {
        this.f73136d = strArr;
    }
}

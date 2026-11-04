package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45199b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45200c = "CustomMethod";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45201d = "CustomAttribute";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static HashMap<String, Constructor<? extends f>> f45202e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45203f = "KeyFrames";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<f>> f45204a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends f>> map = new HashMap<>();
        f45202e = map;
        try {
            map.put("KeyAttribute", g.class.getConstructor(null));
            f45202e.put(androidx.constraintlayout.core.motion.utils.v.g.f44081a, j.class.getConstructor(null));
            f45202e.put(androidx.constraintlayout.core.motion.utils.v.c.f44000a, h.class.getConstructor(null));
            f45202e.put("KeyTimeCycle", l.class.getConstructor(null));
            f45202e.put(androidx.constraintlayout.core.motion.utils.v.i.f44118a, m.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public i() {
    }

    static String f(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10);
    }

    public void a(o oVar) {
        ArrayList<f> arrayList = this.f45204a.get(-1);
        if (arrayList != null) {
            oVar.b(arrayList);
        }
    }

    public void b(o oVar) {
        ArrayList<f> arrayList = this.f45204a.get(Integer.valueOf(oVar.f45324c));
        if (arrayList != null) {
            oVar.b(arrayList);
        }
        ArrayList<f> arrayList2 = this.f45204a.get(-1);
        if (arrayList2 != null) {
            for (f fVar : arrayList2) {
                if (fVar.g(((ConstraintLayout.b) oVar.f45323b.getLayoutParams()).f45678c0)) {
                    oVar.a(fVar);
                }
            }
        }
    }

    public void c(f fVar) {
        if (!this.f45204a.containsKey(Integer.valueOf(fVar.f45143b))) {
            this.f45204a.put(Integer.valueOf(fVar.f45143b), new ArrayList<>());
        }
        ArrayList<f> arrayList = this.f45204a.get(Integer.valueOf(fVar.f45143b));
        if (arrayList != null) {
            arrayList.add(fVar);
        }
    }

    public ArrayList<f> d(int i10) {
        return this.f45204a.get(Integer.valueOf(i10));
    }

    public Set<Integer> e() {
        return this.f45204a.keySet();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public i(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, androidx.constraintlayout.widget.a> map;
        HashMap<String, androidx.constraintlayout.widget.a> map2;
        byte b10;
        f gVar;
        try {
            int eventType = xmlPullParser.getEventType();
            f fVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f45202e.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case 540053991:
                                if (!name.equals(androidx.constraintlayout.core.motion.utils.v.c.f44000a)) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 1153397896:
                                if (!name.equals(androidx.constraintlayout.core.motion.utils.v.g.f44081a)) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            case 1308496505:
                                if (!name.equals(androidx.constraintlayout.core.motion.utils.v.i.f44118a)) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            gVar = new g();
                        } else if (b10 == 1) {
                            gVar = new j();
                        } else if (b10 == 2) {
                            gVar = new h();
                        } else if (b10 == 3) {
                            gVar = new l();
                        } else if (b10 == 4) {
                            gVar = new m();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        gVar.f(context, Xml.asAttributeSet(xmlPullParser));
                        c(gVar);
                        fVar = gVar;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (fVar != null && (map2 = fVar.f45146e) != null) {
                            androidx.constraintlayout.widget.a.q(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && fVar != null && (map = fVar.f45146e) != null) {
                        androidx.constraintlayout.widget.a.q(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && z.f45506z.equals(xmlPullParser.getName())) {
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}

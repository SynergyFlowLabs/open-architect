package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46795f = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f46796g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f46797a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f46798b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f46799c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray<a> f46800d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f46801e = null;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f46803b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f46804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f46805d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f46804c = -1;
            this.f46805d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.f46752xe);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46769ye) {
                    this.f46802a = typedArrayObtainStyledAttributes.getResourceId(index, this.f46802a);
                } else if (index == j.c.f46786ze) {
                    this.f46804c = typedArrayObtainStyledAttributes.getResourceId(index, this.f46804c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f46804c);
                    context.getResources().getResourceName(this.f46804c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f46805d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f46803b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f46803b.size(); i10++) {
                if (this.f46803b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f46807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f46808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f46809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f46810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f46812g;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f46807b = Float.NaN;
            this.f46808c = Float.NaN;
            this.f46809d = Float.NaN;
            this.f46810e = Float.NaN;
            this.f46811f = -1;
            this.f46812g = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.f46651rf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46668sf) {
                    this.f46811f = typedArrayObtainStyledAttributes.getResourceId(index, this.f46811f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f46811f);
                    context.getResources().getResourceName(this.f46811f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f46812g = true;
                    }
                } else if (index == j.c.f46685tf) {
                    this.f46810e = typedArrayObtainStyledAttributes.getDimension(index, this.f46810e);
                } else if (index == j.c.f46702uf) {
                    this.f46808c = typedArrayObtainStyledAttributes.getDimension(index, this.f46808c);
                } else if (index == j.c.f46719vf) {
                    this.f46809d = typedArrayObtainStyledAttributes.getDimension(index, this.f46809d);
                } else if (index == j.c.f46736wf) {
                    this.f46807b = typedArrayObtainStyledAttributes.getDimension(index, this.f46807b);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f46807b) && f10 < this.f46807b) {
                return false;
            }
            if (!Float.isNaN(this.f46808c) && f11 < this.f46808c) {
                return false;
            }
            if (Float.isNaN(this.f46809d) || f10 <= this.f46809d) {
                return Float.isNaN(this.f46810e) || f11 <= this.f46810e;
            }
            return false;
        }
    }

    public m(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.Ae);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == j.c.Be) {
                this.f46797a = typedArrayObtainStyledAttributes.getResourceId(index, this.f46797a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType != 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b10 = -1;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 2) {
                            aVar = new a(context, xmlPullParser);
                            this.f46800d.put(aVar.f46802a, aVar);
                        } else if (b10 == 3) {
                            b bVar = new b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        }
                    } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    }
                    eventType = xmlPullParser.next();
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = this.f46800d.get(i11);
        if (aVar == null) {
            return i11;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            b bVar = null;
            for (b bVar2 : aVar.f46803b) {
                if (bVar2.a(f10, f11)) {
                    if (i10 != bVar2.f46811f) {
                        bVar = bVar2;
                    }
                }
            }
            return bVar != null ? bVar.f46811f : aVar.f46804c;
        }
        if (aVar.f46804c != i10) {
            Iterator<b> it = aVar.f46803b.iterator();
            while (it.hasNext()) {
                if (i10 == it.next().f46811f) {
                }
            }
            return aVar.f46804c;
        }
        return i10;
    }

    public boolean c(int i10, float f10, float f11) {
        int i11 = this.f46798b;
        if (i11 != i10) {
            return true;
        }
        a aVarValueAt = i10 == -1 ? this.f46800d.valueAt(0) : this.f46800d.get(i11);
        int i12 = this.f46799c;
        return (i12 == -1 || !aVarValueAt.f46803b.get(i12).a(f10, f11)) && this.f46799c != aVarValueAt.b(f10, f11);
    }

    public void d(h hVar) {
        this.f46801e = hVar;
    }

    public int e(int i10, int i11, int i12) {
        return f(-1, i10, i11, i12);
    }

    public int f(int i10, int i11, float f10, float f11) {
        int iB;
        if (i10 != i11) {
            a aVar = this.f46800d.get(i11);
            if (aVar == null) {
                return -1;
            }
            int iB2 = aVar.b(f10, f11);
            return iB2 == -1 ? aVar.f46804c : aVar.f46803b.get(iB2).f46811f;
        }
        a aVarValueAt = i11 == -1 ? this.f46800d.valueAt(0) : this.f46800d.get(this.f46798b);
        if (aVarValueAt == null) {
            return -1;
        }
        if ((this.f46799c == -1 || !aVarValueAt.f46803b.get(i10).a(f10, f11)) && i10 != (iB = aVarValueAt.b(f10, f11))) {
            return iB == -1 ? aVarValueAt.f46804c : aVarValueAt.f46803b.get(iB).f46811f;
        }
        return i10;
    }
}

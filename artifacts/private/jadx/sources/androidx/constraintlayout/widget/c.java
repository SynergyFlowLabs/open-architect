package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45795h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f45796i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f45797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f45798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f45799c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f45800d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<a> f45801e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<f> f45802f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f45803g = null;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f45805b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        f f45807d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f45806c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.f46752xe);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46769ye) {
                    this.f45804a = typedArrayObtainStyledAttributes.getResourceId(index, this.f45804a);
                } else if (index == j.c.f46786ze) {
                    this.f45806c = typedArrayObtainStyledAttributes.getResourceId(index, this.f45806c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f45806c);
                    context.getResources().getResourceName(this.f45806c);
                    if ("layout".equals(resourceTypeName)) {
                        f fVar = new f();
                        this.f45807d = fVar;
                        fVar.G(context, this.f45806c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f45805b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f45805b.size(); i10++) {
                if (this.f45805b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f45809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f45810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f45811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f45812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        f f45814g;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f45809b = Float.NaN;
            this.f45810c = Float.NaN;
            this.f45811d = Float.NaN;
            this.f45812e = Float.NaN;
            this.f45813f = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.f46651rf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46668sf) {
                    this.f45813f = typedArrayObtainStyledAttributes.getResourceId(index, this.f45813f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f45813f);
                    context.getResources().getResourceName(this.f45813f);
                    if ("layout".equals(resourceTypeName)) {
                        f fVar = new f();
                        this.f45814g = fVar;
                        fVar.G(context, this.f45813f);
                    }
                } else if (index == j.c.f46685tf) {
                    this.f45812e = typedArrayObtainStyledAttributes.getDimension(index, this.f45812e);
                } else if (index == j.c.f46702uf) {
                    this.f45810c = typedArrayObtainStyledAttributes.getDimension(index, this.f45810c);
                } else if (index == j.c.f46719vf) {
                    this.f45811d = typedArrayObtainStyledAttributes.getDimension(index, this.f45811d);
                } else if (index == j.c.f46736wf) {
                    this.f45809b = typedArrayObtainStyledAttributes.getDimension(index, this.f45809b);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f45809b) && f10 < this.f45809b) {
                return false;
            }
            if (!Float.isNaN(this.f45810c) && f11 < this.f45810c) {
                return false;
            }
            if (Float.isNaN(this.f45811d) || f10 <= this.f45811d) {
                return Float.isNaN(this.f45812e) || f11 <= this.f45812e;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f45797a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        a aVar2 = new a(context, xml);
                        this.f45801e.put(aVar2.f45804a, aVar2);
                        aVar = aVar2;
                    } else if (b10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (b10 == 4) {
                        c(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    private void c(Context context, XmlPullParser xmlPullParser) {
        f fVar = new f();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                fVar.z0(context, xmlPullParser);
                this.f45802f.put(identifier, fVar);
                return;
            }
        }
    }

    public boolean b(int i10, float f10, float f11) {
        int i11 = this.f45799c;
        if (i11 != i10) {
            return true;
        }
        a aVarValueAt = i10 == -1 ? this.f45801e.valueAt(0) : this.f45801e.get(i11);
        int i12 = this.f45800d;
        return (i12 == -1 || !aVarValueAt.f45805b.get(i12).a(f10, f11)) && this.f45800d != aVarValueAt.b(f10, f11);
    }

    public void d(h hVar) {
        this.f45803g = hVar;
    }

    public void e(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f45799c;
        if (i11 != i10) {
            this.f45799c = i10;
            a aVar = this.f45801e.get(i10);
            int iB2 = aVar.b(f10, f11);
            f fVar = iB2 == -1 ? aVar.f45807d : aVar.f45805b.get(iB2).f45814g;
            int i12 = iB2 == -1 ? aVar.f45806c : aVar.f45805b.get(iB2).f45813f;
            if (fVar == null) {
                return;
            }
            this.f45800d = iB2;
            h hVar = this.f45803g;
            if (hVar != null) {
                hVar.b(i10, i12);
            }
            fVar.r(this.f45797a);
            h hVar2 = this.f45803g;
            if (hVar2 != null) {
                hVar2.a(i10, i12);
                return;
            }
            return;
        }
        a aVarValueAt = i10 == -1 ? this.f45801e.valueAt(0) : this.f45801e.get(i11);
        int i13 = this.f45800d;
        if ((i13 == -1 || !aVarValueAt.f45805b.get(i13).a(f10, f11)) && this.f45800d != (iB = aVarValueAt.b(f10, f11))) {
            f fVar2 = iB == -1 ? this.f45798b : aVarValueAt.f45805b.get(iB).f45814g;
            int i14 = iB == -1 ? aVarValueAt.f45806c : aVarValueAt.f45805b.get(iB).f45813f;
            if (fVar2 == null) {
                return;
            }
            this.f45800d = iB;
            h hVar3 = this.f45803g;
            if (hVar3 != null) {
                hVar3.b(-1, i14);
            }
            fVar2.r(this.f45797a);
            h hVar4 = this.f45803g;
            if (hVar4 != null) {
                hVar4.a(-1, i14);
            }
        }
    }
}

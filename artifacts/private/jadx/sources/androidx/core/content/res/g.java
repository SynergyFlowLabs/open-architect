package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f47656a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f47657b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47658c = 2;

    private g() {
    }

    private static a a(@p0 a aVar, @androidx.annotation.l int i10, @androidx.annotation.l int i11, boolean z10, @androidx.annotation.l int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static Shader c(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, i1.a.j.D);
        float fJ = n.j(typedArrayS, xmlPullParser, "startX", i1.a.j.M, 0.0f);
        float fJ2 = n.j(typedArrayS, xmlPullParser, "startY", i1.a.j.N, 0.0f);
        float fJ3 = n.j(typedArrayS, xmlPullParser, "endX", i1.a.j.O, 0.0f);
        float fJ4 = n.j(typedArrayS, xmlPullParser, "endY", i1.a.j.P, 0.0f);
        float fJ5 = n.j(typedArrayS, xmlPullParser, "centerX", i1.a.j.H, 0.0f);
        float fJ6 = n.j(typedArrayS, xmlPullParser, "centerY", i1.a.j.I, 0.0f);
        int iK = n.k(typedArrayS, xmlPullParser, "type", i1.a.j.G, 0);
        int iF = n.f(typedArrayS, xmlPullParser, "startColor", i1.a.j.E, 0);
        boolean zR = n.r(xmlPullParser, "centerColor");
        int iF2 = n.f(typedArrayS, xmlPullParser, "centerColor", i1.a.j.L, 0);
        int iF3 = n.f(typedArrayS, xmlPullParser, "endColor", i1.a.j.F, 0);
        int iK2 = n.k(typedArrayS, xmlPullParser, "tileMode", i1.a.j.K, 0);
        float fJ7 = n.j(typedArrayS, xmlPullParser, "gradientRadius", i1.a.j.J, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(d(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f47659a, aVarA.f47660b, e(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f47659a, aVarA.f47660b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f47659a, aVarA.f47660b, e(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a d(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = n.s(resources, theme, attributeSet, i1.a.j.Q);
                boolean zHasValue = typedArrayS.hasValue(i1.a.j.R);
                boolean zHasValue2 = typedArrayS.hasValue(i1.a.j.S);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayS.getColor(i1.a.j.R, 0);
                float f10 = typedArrayS.getFloat(i1.a.j.S, 0.0f);
                typedArrayS.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode e(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f47659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f47660b;

        a(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.f47659a = new int[size];
            this.f47660b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f47659a[i10] = list.get(i10).intValue();
                this.f47660b[i10] = list2.get(i10).floatValue();
            }
        }

        a(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
            this.f47659a = new int[]{i10, i11};
            this.f47660b = new float[]{0.0f, 1.0f};
        }

        a(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12) {
            this.f47659a = new int[]{i10, i11, i12};
            this.f47660b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

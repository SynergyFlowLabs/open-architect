package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.annotation.x;
import d0.i1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f47633a = new ThreadLocal<>();

    private c() {
    }

    @NonNull
    public static ColorStateList a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static ColorStateList b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @NonNull
    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f47633a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        return typedValue;
    }

    @p0
    public static ColorStateList d(@NonNull Resources resources, @n1 int i10, @p0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i10), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static ColorStateList e(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayH = h(resources, theme, attributeSet, i1.a.j.f286845d);
                int resourceId = typedArrayH.getResourceId(i1.a.j.f286846e, -1);
                if (resourceId == -1 || f(resources, resourceId)) {
                    color = typedArrayH.getColor(i1.a.j.f286846e, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayH.getColor(i1.a.j.f286846e, -65281);
                    }
                }
                float f10 = 1.0f;
                if (typedArrayH.hasValue(i1.a.j.f286847f)) {
                    f10 = typedArrayH.getFloat(i1.a.j.f286847f, 1.0f);
                } else if (typedArrayH.hasValue(i1.a.j.f286849h)) {
                    f10 = typedArrayH.getFloat(i1.a.j.f286849h, 1.0f);
                }
                float f11 = (Build.VERSION.SDK_INT < 31 || !typedArrayH.hasValue(i1.a.j.f286848g)) ? typedArrayH.getFloat(i1.a.j.f286850i, -1.0f) : typedArrayH.getFloat(i1.a.j.f286848g, -1.0f);
                typedArrayH.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i12 = 0;
                for (int i13 = 0; i13 < attributeCount; i13++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != i1.a.C1919a.f286704a && attributeNameResource != i1.a.C1919a.f286717n) {
                        int i14 = i12 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i12] = attributeNameResource;
                        i12 = i14;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i12);
                iArrA = h.a(iArrA, i11, g(color, f10, f11));
                iArr = (int[][]) h.c(iArr, i11, iArrTrimStateSet);
                i11++;
            }
            i10 = 1;
        }
        int[] iArr3 = new int[i11];
        int[][] iArr4 = new int[i11][];
        System.arraycopy(iArrA, 0, iArr3, 0, i11);
        System.arraycopy(iArr, 0, iArr4, 0, i11);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean f(@NonNull Resources resources, @androidx.annotation.n int i10) {
        TypedValue typedValueC = c();
        resources.getValue(i10, typedValueC, true);
        int i11 = typedValueC.type;
        return i11 >= 28 && i11 <= 31;
    }

    @androidx.annotation.l
    private static int g(@androidx.annotation.l int i10, @x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = i1.f268246o) float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int iE = n1.a.e((int) ((Color.alpha(i10) * f10) + 0.5f), 0, 255);
        if (z10) {
            a aVarC = a.c(i10);
            i10 = a.q(aVarC.j(), aVarC.i(), f11);
        }
        return (i10 & 16777215) | (iE << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

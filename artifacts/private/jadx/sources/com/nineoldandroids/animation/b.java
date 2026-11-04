package com.nineoldandroids.animation;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f131156b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f131158d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f131160f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f131161g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f131162h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f131163i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f131164j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f131165k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f131166l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f131167m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f131168n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f131169o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f131155a = {R.attr.ordering};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f131157c = {R.attr.propertyName};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f131159e = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    private static a a(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return b(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    private static a b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, d dVar, int i10) throws XmlPullParserException, IOException {
        int i11;
        q qVarD;
        l lVarE;
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = null;
        a aVar = null;
        while (true) {
            int next = xmlPullParser.next();
            i11 = 0;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    lVarE = e(context, attributeSet);
                } else if (name.equals("animator")) {
                    qVarD = d(context, attributeSet, null);
                } else {
                    if (!name.equals("set")) {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    d dVar2 = new d();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f131155a);
                    TypedValue typedValue = new TypedValue();
                    typedArrayObtainStyledAttributes.getValue(0, typedValue);
                    b(context, xmlPullParser, attributeSet, dVar2, typedValue.type == 16 ? typedValue.data : 0);
                    typedArrayObtainStyledAttributes.recycle();
                    aVar = dVar2;
                }
                if (dVar != null) {
                    aVar = qVarD;
                    if (arrayList == null) {
                        aVar = lVarE;
                        arrayList = new ArrayList();
                    }
                    aVar = lVarE;
                    arrayList.add(aVar);
                } else {
                    aVar = qVarD;
                    aVar = lVarE;
                }
            }
        }
        if (dVar != null && arrayList != null) {
            a[] aVarArr = new a[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVarArr[i11] = (a) it.next();
                i11++;
            }
            if (i10 == 0) {
                dVar.E(aVarArr);
                return aVar;
            }
            dVar.C(aVarArr);
        }
        return aVar;
    }

    public static a c(Context context, int i10) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                animation = context.getResources().getAnimation(i10);
                a aVarA = a(context, animation);
                if (animation != null) {
                    animation.close();
                }
                return aVarA;
            } catch (IOException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            } catch (XmlPullParserException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } catch (Throwable th2) {
            if (animation != null) {
                animation.close();
            }
            throw th2;
        }
    }

    private static q d(Context context, AttributeSet attributeSet, q qVar) throws Resources.NotFoundException {
        int i10;
        int i11;
        int i12;
        int color;
        int i13;
        int color2;
        int dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f131159e);
        long j10 = typedArrayObtainStyledAttributes.getInt(1, 0);
        long j11 = typedArrayObtainStyledAttributes.getInt(2, 0);
        int i14 = typedArrayObtainStyledAttributes.getInt(7, 0);
        q qVar2 = qVar == null ? new q() : qVar;
        int i15 = i14 == 0 ? 1 : 0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(5);
        boolean z10 = typedValuePeekValue != null;
        int i16 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        boolean z11 = typedValuePeekValue2 != null;
        if (z11) {
            i11 = typedValuePeekValue2.type;
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        if ((z10 && i16 >= 28 && i16 <= 31) || (z11 && i11 >= 28 && i11 <= 31)) {
            qVar2.g0(new e());
            i15 = i10;
        }
        if (i15 != 0) {
            if (z10) {
                float dimension2 = i16 == 5 ? typedArrayObtainStyledAttributes.getDimension(5, 0.0f) : typedArrayObtainStyledAttributes.getFloat(5, 0.0f);
                if (z11) {
                    float dimension3 = i11 == 5 ? typedArrayObtainStyledAttributes.getDimension(6, 0.0f) : typedArrayObtainStyledAttributes.getFloat(6, 0.0f);
                    float[] fArr = new float[2];
                    fArr[i10] = dimension2;
                    fArr[1] = dimension3;
                    qVar2.h0(fArr);
                } else {
                    float[] fArr2 = new float[1];
                    fArr2[i10] = dimension2;
                    qVar2.h0(fArr2);
                }
            } else {
                float[] fArr3 = new float[1];
                fArr3[i10] = i11 == 5 ? typedArrayObtainStyledAttributes.getDimension(6, 0.0f) : typedArrayObtainStyledAttributes.getFloat(6, 0.0f);
                qVar2.h0(fArr3);
            }
            i12 = i10;
        } else {
            if (z10) {
                if (i16 == 5) {
                    color2 = (int) typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
                    i13 = i10;
                } else if (i16 < 28 || i16 > 31) {
                    i13 = i10;
                    color2 = typedArrayObtainStyledAttributes.getInt(5, i13);
                } else {
                    i13 = i10;
                    color2 = typedArrayObtainStyledAttributes.getColor(5, i13);
                }
                if (z11) {
                    if (i11 == 5) {
                        dimension = (int) typedArrayObtainStyledAttributes.getDimension(6, 0.0f);
                    } else {
                        dimension = (i11 < 28 || i11 > 31) ? typedArrayObtainStyledAttributes.getInt(6, i13) : typedArrayObtainStyledAttributes.getColor(6, i13);
                    }
                    qVar2.j0(color2, dimension);
                } else {
                    qVar2.j0(color2);
                }
            } else if (z11) {
                if (i11 == 5) {
                    color = (int) typedArrayObtainStyledAttributes.getDimension(6, 0.0f);
                    i12 = 0;
                } else if (i11 < 28 || i11 > 31) {
                    i12 = 0;
                    color = typedArrayObtainStyledAttributes.getInt(6, 0);
                } else {
                    i12 = 0;
                    color = typedArrayObtainStyledAttributes.getColor(6, 0);
                }
                qVar2.j0(color);
            }
            i12 = 0;
        }
        qVar2.k(j10);
        qVar2.n(j11);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            qVar2.l0(typedArrayObtainStyledAttributes.getInt(3, i12));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            qVar2.m0(typedArrayObtainStyledAttributes.getInt(4, 1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, i12);
        if (resourceId > 0) {
            qVar2.l(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
        return qVar2;
    }

    private static l e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        l lVar = new l();
        d(context, attributeSet, lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f131157c);
        lVar.C0(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
        return lVar;
    }
}

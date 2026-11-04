package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.b1;
import androidx.core.content.res.n;
import androidx.core.graphics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f75885a = "AnimatorInflater";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f75886b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f75887c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f75888d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f75889e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f75890f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f75891g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f75892h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f75893i = false;

    private static class a implements TypeEvaluator<o.b[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b[] f75894a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o.b[] evaluate(float f10, o.b[] bVarArr, o.b[] bVarArr2) {
            if (!o.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!o.b(this.f75894a, bVarArr)) {
                this.f75894a = o.f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f75894a[i10].j(bVarArr[i10], bVarArr2[i10], f10);
            }
            return this.f75894a;
        }

        a(o.b[] bVarArr) {
            this.f75894a = bVarArr;
        }
    }

    private e() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10, float f10) throws XmlPullParserException, IOException {
        int i11;
        int depth = xmlPullParser.getDepth();
        Animator animatorM = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i11 = 0;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    animatorM = o(context, resources, theme, attributeSet, f10, xmlPullParser);
                } else if (name.equals("animator")) {
                    animatorM = m(context, resources, theme, attributeSet, null, f10, xmlPullParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75813a0);
                    b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, n.k(typedArrayS, xmlPullParser, "ordering", 0, 0), f10);
                    typedArrayS.recycle();
                    animatorM = animatorSet2;
                } else {
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    PropertyValuesHolder[] propertyValuesHolderArrQ = q(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                    if (propertyValuesHolderArrQ != null && (animatorM instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorM).setValues(propertyValuesHolderArrQ);
                    }
                    i11 = 1;
                }
                if (animatorSet != null && i11 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorM);
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i11] = (Animator) it.next();
                i11++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
                return animatorM;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animatorM;
    }

    private static Keyframe c(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        return keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    private static void d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    private static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        for (Object obj : objArr) {
            Keyframe keyframe = (Keyframe) obj;
            float fraction = keyframe.getFraction();
            Object value = AbstractJsonLexerKt.NULL;
            (fraction < 0.0f ? AbstractJsonLexerKt.NULL : Float.valueOf(keyframe.getFraction())).toString();
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            Objects.toString(value);
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && i(i13)) || (z11 && i(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            o.b[] bVarArrD = o.d(string);
            o.b[] bVarArrD2 = o.d(string2);
            if (bVarArrD != null || bVarArrD2 != null) {
                if (bVarArrD != null) {
                    a aVar = new a();
                    if (bVarArrD2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
                    }
                    if (o.b(bVarArrD, bVarArrD2)) {
                        return PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (bVarArrD2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
                }
            }
            return null;
        }
        f fVarA = i10 == 3 ? f.a() : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            if (i13 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = i(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = i(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z11) {
            if (i14 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = i(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && fVarA != null) {
            propertyValuesHolderOfInt.setEvaluator(fVarA);
        }
        return propertyValuesHolderOfInt;
    }

    private static int g(TypedArray typedArray, int i10, int i11) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        int i13 = z11 ? typedValuePeekValue2.type : 0;
        if (z10 && i(i12)) {
            return 3;
        }
        return (z11 && i(i13)) ? 3 : 0;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75827h0);
        int i10 = 0;
        TypedValue typedValueT = n.t(typedArrayS, xmlPullParser, "value", 0);
        if (typedValueT != null && i(typedValueT.type)) {
            i10 = 3;
        }
        typedArrayS.recycle();
        return i10;
    }

    private static boolean i(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator j(Context context, @androidx.annotation.b int i10) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i10);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i10) throws Resources.NotFoundException {
        return l(context, resources, theme, i10, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i10, float f10) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                animation = resources.getAnimation(i10);
                Animator animatorA = a(context, resources, theme, animation, f10);
                if (animation != null) {
                    animation.close();
                }
                return animatorA;
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

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.R);
        TypedArray typedArrayS2 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75837m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, typedArrayS, typedArrayS2, f10, xmlPullParser);
        int iL = n.l(typedArrayS, xmlPullParser, "interpolator", 0, 0);
        if (iL > 0) {
            valueAnimator.setInterpolator(d.b(context, iL));
        }
        typedArrayS.recycle();
        if (typedArrayS2 != null) {
            typedArrayS2.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframeOfFloat;
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75827h0);
        float fJ = n.j(typedArrayS, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueT = n.t(typedArrayS, xmlPullParser, "value", 0);
        boolean z10 = typedValueT != null;
        if (i10 == 4) {
            i10 = (z10 && i(typedValueT.type)) ? 3 : 0;
        }
        if (!z10) {
            keyframeOfFloat = i10 == 0 ? Keyframe.ofFloat(fJ) : Keyframe.ofInt(fJ);
        } else if (i10 != 0) {
            keyframeOfFloat = (i10 == 1 || i10 == 3) ? Keyframe.ofInt(fJ, n.k(typedArrayS, xmlPullParser, "value", 0, 0)) : null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(fJ, n.j(typedArrayS, xmlPullParser, "value", 0, 0.0f));
        }
        int iL = n.l(typedArrayS, xmlPullParser, "interpolator", 1, 0);
        if (iL > 0) {
            keyframeOfFloat.setInterpolator(d.b(context, iL));
        }
        typedArrayS.recycle();
        return keyframeOfFloat;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i11 = i10;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe keyframeN = n(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i11, xmlPullParser2);
                if (keyframeN != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeN);
                }
                xmlPullParser2.next();
                i10 = i11;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, c(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i12 = 0; i12 < size; i12++) {
            Keyframe keyframe3 = keyframeArr[i12];
            if (keyframe3.getFraction() < 0.0f) {
                if (i12 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i13 = size - 1;
                    if (i12 == i13) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i14 = i12;
                        for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                            i14 = i15;
                        }
                        d(keyframeArr, keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction(), i12, i14);
                    }
                }
            }
        }
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i10 == 3) {
            propertyValuesHolderOfKeyframe.setEvaluator(f.a());
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75817c0);
                    String strM = n.m(typedArrayS, xmlPullParser2, "propertyName", 3);
                    int iK = n.k(typedArrayS, xmlPullParser2, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderP = p(context, resources, theme, xmlPullParser2, strM, iK);
                    if (propertyValuesHolderP == null) {
                        propertyValuesHolderP = f(typedArrayS, iK, 0, 1, strM);
                    }
                    if (propertyValuesHolderP != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderP);
                    }
                    typedArrayS.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i10 = 0; i10 < size; i10++) {
            propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long jK = n.k(typedArray, xmlPullParser, "duration", 1, 300);
        long jK2 = n.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iK = n.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (n.r(xmlPullParser, "valueFrom") && n.r(xmlPullParser, "valueTo")) {
            if (iK == 4) {
                iK = g(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderF = f(typedArray, iK, 5, 6, "");
            if (propertyValuesHolderF != null) {
                valueAnimator.setValues(propertyValuesHolderF);
            }
        }
        valueAnimator.setDuration(jK);
        valueAnimator.setStartDelay(jK2);
        valueAnimator.setRepeatCount(n.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(n.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, iK, f10, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM = n.m(typedArray, xmlPullParser, "pathData", 1);
        if (strM == null) {
            objectAnimator.setPropertyName(n.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM2 = n.m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM3 = n.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (strM2 != null || strM3 != null) {
            t(o.e(strM), objectAnimator, f10 * 0.5f, strM2, strM3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        char c10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f10)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f12 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            char c11 = c10;
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[c11];
            fArr2[i10] = fArr3[1];
            f11 += f12;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
            c10 = c11;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}

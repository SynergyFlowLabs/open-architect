package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class t {
    private static final int A = -2;
    public static final int B = -1;
    private static final boolean C = false;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    private static final String G = "MotionScene";
    private static final String H = "Transition";
    private static final String I = "OnSwipe";
    private static final String J = "OnClick";
    private static final String K = "StateSet";
    private static final String L = "Include";
    private static final String M = "include";
    private static final String N = "KeyFrameSet";
    private static final String O = "ConstraintSet";
    private static final String P = "ViewTransition";
    static final int Q = 0;
    static final int R = 1;
    static final int S = 2;
    static final int T = 3;
    static final int U = 4;
    static final int V = 5;
    static final int W = 6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f45381u = "MotionScene";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f45382v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f45383w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f45384x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f45385y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f45386z = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f45387a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MotionEvent f45399m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MotionLayout.h f45402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f45403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final a0 f45404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f45405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f45406t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.m f45388b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f45389c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45390d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<b> f45391e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f45392f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<b> f45393g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.f> f45394h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap<String, Integer> f45395i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseIntArray f45396j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45397k = 400;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45398l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f45400n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f45401o = false;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f45407a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f45407a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f45407a.a(f10);
        }
    }

    public t(MotionLayout motionLayout) {
        this.f45387a = motionLayout;
        this.f45404r = new a0(motionLayout);
    }

    static String A(Context context, int i10, XmlPullParser xmlPullParser) {
        return ".(" + c.i(context, i10) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int H(int i10) {
        int iE;
        androidx.constraintlayout.widget.m mVar = this.f45388b;
        return (mVar == null || (iE = mVar.e(i10, -1, -1)) == -1) ? i10 : iE;
    }

    private boolean S(int i10) {
        int i11 = this.f45396j.get(i10);
        int size = this.f45396j.size();
        while (i11 > 0) {
            if (i11 == i10) {
                return true;
            }
            int i12 = size - 1;
            if (size < 0) {
                return true;
            }
            i11 = this.f45396j.get(i11);
            size = i12;
        }
        return false;
    }

    private boolean U() {
        return this.f45402p != null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    private void W(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    switch (xml.getName()) {
                        case "MotionScene":
                            d0(context, xml);
                            break;
                        case "Transition":
                            ArrayList<b> arrayList = this.f45391e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f45389c == null && !bVar.f45418b) {
                                this.f45389c = bVar;
                                if (bVar.f45428l != null) {
                                    this.f45389c.f45428l.D(this.f45403q);
                                }
                            }
                            if (!bVar.f45418b) {
                                break;
                            } else {
                                if (bVar.f45419c == -1) {
                                    this.f45392f = bVar;
                                } else {
                                    this.f45393g.add(bVar);
                                }
                                this.f45391e.remove(bVar);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (bVar == null) {
                                context.getResources().getResourceEntryName(i10);
                                xml.getLineNumber();
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f45428l = new v(context, this.f45387a, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (bVar != null && !this.f45387a.isInEditMode()) {
                                bVar.v(context, xml);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f45388b = new androidx.constraintlayout.widget.m(context, xml);
                            break;
                        case "ConstraintSet":
                            a0(context, xml);
                            break;
                        case "include":
                        case "Include":
                            c0(context, xml);
                            break;
                        case "KeyFrameSet":
                            i iVar = new i(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f45427k.add(iVar);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            this.f45404r.b(new z(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    private int a0(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.d1(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iV = -1;
        int iV2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iV2 = v(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        fVar.f45918e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                fVar.f45918e = 4;
                                break;
                            case "left":
                                fVar.f45918e = 2;
                                break;
                            case "none":
                                fVar.f45918e = 0;
                                break;
                            case "right":
                                fVar.f45918e = 1;
                                break;
                            case "x_right":
                                fVar.f45918e = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iV = v(context, attributeValue);
                    this.f45395i.put(r0(attributeValue), Integer.valueOf(iV));
                    fVar.f45915b = c.i(context, iV);
                    break;
                case "stateLabels":
                    fVar.u1(attributeValue);
                    break;
            }
        }
        if (iV != -1) {
            if (this.f45387a.f45006g3 != 0) {
                fVar.E1(true);
            }
            fVar.z0(context, xmlPullParser);
            if (iV2 != -1) {
                this.f45396j.put(iV, iV2);
            }
            this.f45394h.put(iV, fVar);
        }
        return iV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b0(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (eventType != 1) {
                String name = xml.getName();
                if (2 == eventType && O.equals(name)) {
                    return a0(context, xml);
                }
                eventType = xml.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return -1;
    }

    private void c0(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.c.Nf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == androidx.constraintlayout.widget.j.c.Of) {
                int i11 = 2 ^ (-1);
                b0(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d0(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.c.Nd);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == androidx.constraintlayout.widget.j.c.Od) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f45397k);
                this.f45397k = i11;
                if (i11 < 8) {
                    this.f45397k = 8;
                }
            } else if (index == androidx.constraintlayout.widget.j.c.Pd) {
                this.f45398l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void h0(int i10, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.f fVar = this.f45394h.get(i10);
        fVar.f45916c = fVar.f45915b;
        int i11 = this.f45396j.get(i10);
        if (i11 > 0) {
            h0(i11, motionLayout);
            androidx.constraintlayout.widget.f fVar2 = this.f45394h.get(i11);
            if (fVar2 == null) {
                c.i(this.f45387a.getContext(), i11);
                return;
            }
            fVar.f45916c += "/" + fVar2.f45916c;
            fVar.M0(fVar2);
        } else {
            fVar.f45916c += "  layout";
            fVar.L0(motionLayout);
        }
        fVar.q(fVar);
    }

    public static String r0(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private int v(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    private int w(b bVar) {
        int i10 = bVar.f45417a;
        if (i10 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i11 = 0; i11 < this.f45391e.size(); i11++) {
            if (this.f45391e.get(i11).f45417a == i10) {
                return i11;
            }
        }
        return -1;
    }

    public int[] B(String... strArr) {
        int size = this.f45394h.size();
        int[] iArr = new int[size];
        int i10 = 3 | 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.constraintlayout.widget.f fVarValueAt = this.f45394h.valueAt(i12);
            int iKeyAt = this.f45394h.keyAt(i12);
            if (fVarValueAt.B0(strArr)) {
                fVarValueAt.s0();
                iArr[i11] = iKeyAt;
                i11++;
            }
        }
        return Arrays.copyOf(iArr, i11);
    }

    float C() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.i();
    }

    float D() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.j();
    }

    boolean E() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return false;
        }
        return this.f45389c.f45428l.k();
    }

    public float F(View view, int i10) {
        return 0.0f;
    }

    float G(float f10, float f11) {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.l(f10, f11);
    }

    int I() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0;
        }
        return this.f45389c.f45428l.m();
    }

    float J() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.n();
    }

    float K() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.o();
    }

    float L() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.p();
    }

    float M() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0.0f;
        }
        return this.f45389c.f45428l.q();
    }

    public float N() {
        b bVar = this.f45389c;
        if (bVar != null) {
            return bVar.f45425i;
        }
        return 0.0f;
    }

    int O() {
        b bVar = this.f45389c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f45420d;
    }

    public b P(int i10) {
        for (b bVar : this.f45391e) {
            if (bVar.f45417a == i10) {
                return bVar;
            }
        }
        return null;
    }

    int Q(int i10) {
        Iterator<b> it = this.f45391e.iterator();
        while (it.hasNext()) {
            if (it.next().f45420d == i10) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> R(int i10) {
        int iH = H(i10);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f45391e) {
            if (bVar.f45420d == iH || bVar.f45419c == iH) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    boolean T(View view, int i10) {
        b bVar = this.f45389c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f45427k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f45142a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean V(int i10) {
        return this.f45404r.h(i10);
    }

    public int X(String str) {
        Integer num = this.f45395i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String Y(int i10) {
        for (Map.Entry<String, Integer> entry : this.f45395i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i10) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void Z(boolean z10, int i10, int i11, int i12, int i13) {
    }

    void e0(float f10, float f11) {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return;
        }
        this.f45389c.f45428l.w(f10, f11);
    }

    public void f(MotionLayout motionLayout, int i10) {
        for (b bVar : this.f45391e) {
            if (bVar.f45429m.size() > 0) {
                Iterator it = bVar.f45429m.iterator();
                while (it.hasNext()) {
                    ((b.a) it.next()).c(motionLayout);
                }
            }
        }
        for (b bVar2 : this.f45393g) {
            if (bVar2.f45429m.size() > 0) {
                Iterator it2 = bVar2.f45429m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        for (b bVar3 : this.f45391e) {
            if (bVar3.f45429m.size() > 0) {
                Iterator it3 = bVar3.f45429m.iterator();
                while (it3.hasNext()) {
                    ((b.a) it3.next()).a(motionLayout, i10, bVar3);
                }
            }
        }
        for (b bVar4 : this.f45393g) {
            if (bVar4.f45429m.size() > 0) {
                Iterator it4 = bVar4.f45429m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).a(motionLayout, i10, bVar4);
                }
            }
        }
    }

    void f0(float f10, float f11) {
        b bVar = this.f45389c;
        if (bVar != null && bVar.f45428l != null) {
            this.f45389c.f45428l.x(f10, f11);
        }
    }

    public void g(b bVar) {
        int iW = w(bVar);
        if (iW == -1) {
            this.f45391e.add(bVar);
        } else {
            this.f45391e.set(iW, bVar);
        }
    }

    void g0(MotionEvent motionEvent, int i10, MotionLayout motionLayout) {
        MotionLayout.h hVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f45402p == null) {
            this.f45402p = this.f45387a.D0();
        }
        this.f45402p.c(motionEvent);
        if (i10 != -1) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f45405s = motionEvent.getRawX();
                this.f45406t = motionEvent.getRawY();
                this.f45399m = motionEvent;
                this.f45400n = false;
                if (this.f45389c.f45428l != null) {
                    RectF rectFG = this.f45389c.f45428l.g(this.f45387a, rectF);
                    if (rectFG != null && !rectFG.contains(this.f45399m.getX(), this.f45399m.getY())) {
                        this.f45399m = null;
                        this.f45400n = true;
                        return;
                    }
                    RectF rectFR = this.f45389c.f45428l.r(this.f45387a, rectF);
                    if (rectFR == null || rectFR.contains(this.f45399m.getX(), this.f45399m.getY())) {
                        this.f45401o = false;
                    } else {
                        this.f45401o = true;
                    }
                    this.f45389c.f45428l.A(this.f45405s, this.f45406t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f45400n) {
                float rawY = motionEvent.getRawY() - this.f45406t;
                float rawX = motionEvent.getRawX() - this.f45405s;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f45399m) == null) {
                    return;
                }
                b bVarJ = j(i10, rawX, rawY, motionEvent2);
                if (bVarJ != null) {
                    motionLayout.setTransition(bVarJ);
                    RectF rectFR2 = this.f45389c.f45428l.r(this.f45387a, rectF);
                    if (rectFR2 != null && !rectFR2.contains(this.f45399m.getX(), this.f45399m.getY())) {
                        z10 = true;
                    }
                    this.f45401o = z10;
                    this.f45389c.f45428l.G(this.f45405s, this.f45406t);
                }
            }
        }
        if (this.f45400n) {
            return;
        }
        b bVar = this.f45389c;
        if (bVar != null && bVar.f45428l != null && !this.f45401o) {
            this.f45389c.f45428l.u(motionEvent, this.f45402p, i10, this);
        }
        this.f45405s = motionEvent.getRawX();
        this.f45406t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (hVar = this.f45402p) == null) {
            return;
        }
        hVar.a();
        this.f45402p = null;
        int i11 = motionLayout.f45003f;
        if (i11 != -1) {
            i(motionLayout, i11);
        }
    }

    public boolean h(int i10, o oVar) {
        return this.f45404r.e(i10, oVar);
    }

    boolean i(MotionLayout motionLayout, int i10) {
        b bVar;
        if (U() || this.f45390d) {
            return false;
        }
        for (b bVar2 : this.f45391e) {
            if (bVar2.f45430n != 0 && ((bVar = this.f45389c) != bVar2 || !bVar.L(2))) {
                if (i10 == bVar2.f45420d && (bVar2.f45430n == 4 || bVar2.f45430n == 2)) {
                    MotionLayout.l lVar = MotionLayout.l.FINISHED;
                    motionLayout.setState(lVar);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f45430n == 4) {
                        motionLayout.R0();
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.i0(true);
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                        motionLayout.setState(lVar);
                        motionLayout.E0();
                    }
                    return true;
                }
                if (i10 == bVar2.f45419c && (bVar2.f45430n == 3 || bVar2.f45430n == 1)) {
                    MotionLayout.l lVar2 = MotionLayout.l.FINISHED;
                    motionLayout.setState(lVar2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f45430n == 3) {
                        motionLayout.T0();
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.i0(true);
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                        motionLayout.setState(lVar2);
                        motionLayout.E0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    void i0(MotionLayout motionLayout) {
        for (int i10 = 0; i10 < this.f45394h.size(); i10++) {
            int iKeyAt = this.f45394h.keyAt(i10);
            if (S(iKeyAt)) {
                return;
            }
            h0(iKeyAt, motionLayout);
        }
    }

    public b j(int i10, float f10, float f11, MotionEvent motionEvent) {
        if (i10 == -1) {
            return this.f45389c;
        }
        List<b> listR = R(i10);
        RectF rectF = new RectF();
        float f12 = 0.0f;
        b bVar = null;
        for (b bVar2 : listR) {
            if (!bVar2.f45431o && bVar2.f45428l != null) {
                bVar2.f45428l.D(this.f45403q);
                RectF rectFR = bVar2.f45428l.r(this.f45387a, rectF);
                if (rectFR == null || motionEvent == null || rectFR.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFG = bVar2.f45428l.g(this.f45387a, rectF);
                    if (rectFG == null || motionEvent == null || rectFG.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f45428l.a(f10, f11);
                        if (bVar2.f45428l.f45484l && motionEvent != null) {
                            float x10 = motionEvent.getX() - bVar2.f45428l.f45481i;
                            float y10 = motionEvent.getY() - bVar2.f45428l.f45482j;
                            fA = ((float) (Math.atan2(f11 + y10, f10 + x10) - Math.atan2(x10, y10))) * 10.0f;
                        }
                        float f13 = fA * (bVar2.f45419c == i10 ? -1.0f : 1.1f);
                        if (f13 > f12) {
                            bVar = bVar2;
                            f12 = f13;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public void j0(b bVar) {
        int iW = w(bVar);
        if (iW != -1) {
            this.f45391e.remove(iW);
        }
    }

    public void k(boolean z10) {
        this.f45390d = z10;
    }

    public void k0(int i10, androidx.constraintlayout.widget.f fVar) {
        this.f45394h.put(i10, fVar);
    }

    public void l(int i10, boolean z10) {
        this.f45404r.f(i10, z10);
    }

    public void l0(int i10) {
        b bVar = this.f45389c;
        if (bVar != null) {
            bVar.O(i10);
        } else {
            this.f45397k = i10;
        }
    }

    public int m() {
        b bVar = this.f45389c;
        if (bVar != null) {
            return bVar.f45432p;
        }
        return -1;
    }

    public void m0(View view, int i10, String str, Object obj) {
        b bVar = this.f45389c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f45427k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f45142a == i10 && obj != null) {
                }
            }
        }
    }

    int n() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return 0;
        }
        return this.f45389c.f45428l.e();
    }

    public void n0(boolean z10) {
        this.f45403q = z10;
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return;
        }
        this.f45389c.f45428l.D(this.f45403q);
    }

    androidx.constraintlayout.widget.f o(int i10) {
        return p(i10, -1, -1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0083 A[SYNTHETIC] */
    void o0(int i10, int i11) {
        int iE;
        int iE2;
        b bVar;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        androidx.constraintlayout.widget.m mVar = this.f45388b;
        if (mVar != null) {
            iE = mVar.e(i10, -1, -1);
            if (iE == -1) {
                iE = i10;
            }
            iE2 = this.f45388b.e(i11, -1, -1);
            if (iE2 == -1) {
            }
            bVar = this.f45389c;
            if (bVar == null && bVar.f45419c == i11 && this.f45389c.f45420d == i10) {
                return;
            }
            it = this.f45391e.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f45392f;
                    for (b bVar4 : this.f45393g) {
                        if (bVar4.f45419c == i11) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f45420d = iE;
                    bVar3.f45419c = iE2;
                    if (iE != -1) {
                        this.f45391e.add(bVar3);
                    }
                    this.f45389c = bVar3;
                    return;
                }
                next = it.next();
                if ((next.f45419c != iE2 && next.f45420d == iE) || (next.f45419c == i11 && next.f45420d == i10)) {
                    break;
                }
            }
            this.f45389c = next;
            if (next != null || next.f45428l == null) {
            }
            this.f45389c.f45428l.D(this.f45403q);
            return;
        }
        iE = i10;
        iE2 = i11;
        bVar = this.f45389c;
        if (bVar == null) {
        }
        it = this.f45391e.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f45392f;
                while (r3.hasNext()) {
                    if (bVar4.f45419c == i11) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f45420d = iE;
                bVar3.f45419c = iE2;
                if (iE != -1) {
                    this.f45391e.add(bVar3);
                }
                this.f45389c = bVar3;
                return;
            }
            next = it.next();
            if (next.f45419c != iE2) {
            }
        }
        this.f45389c = next;
        if (next != null) {
        }
    }

    androidx.constraintlayout.widget.f p(int i10, int i11, int i12) {
        int iE;
        androidx.constraintlayout.widget.m mVar = this.f45388b;
        if (mVar != null && (iE = mVar.e(i10, i11, i12)) != -1) {
            i10 = iE;
        }
        if (this.f45394h.get(i10) != null) {
            return this.f45394h.get(i10);
        }
        c.i(this.f45387a.getContext(), i10);
        SparseArray<androidx.constraintlayout.widget.f> sparseArray = this.f45394h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public void p0(b bVar) {
        this.f45389c = bVar;
        if (bVar != null && bVar.f45428l != null) {
            this.f45389c.f45428l.D(this.f45403q);
        }
    }

    public androidx.constraintlayout.widget.f q(Context context, String str) {
        for (int i10 = 0; i10 < this.f45394h.size(); i10++) {
            int iKeyAt = this.f45394h.keyAt(i10);
            if (str.equals(context.getResources().getResourceName(iKeyAt))) {
                return this.f45394h.get(iKeyAt);
            }
        }
        return null;
    }

    void q0() {
        b bVar = this.f45389c;
        if (bVar == null || bVar.f45428l == null) {
            return;
        }
        this.f45389c.f45428l.H();
    }

    public int[] r() {
        int size = this.f45394h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f45394h.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList<b> s() {
        return this.f45391e;
    }

    boolean s0() {
        Iterator<b> it = this.f45391e.iterator();
        while (it.hasNext()) {
            if (it.next().f45428l != null) {
                return true;
            }
        }
        b bVar = this.f45389c;
        return (bVar == null || bVar.f45428l == null) ? false : true;
    }

    public int t() {
        b bVar = this.f45389c;
        return bVar != null ? bVar.f45424h : this.f45397k;
    }

    public boolean t0(MotionLayout motionLayout) {
        return motionLayout == this.f45387a && motionLayout.f44993a == this;
    }

    int u() {
        b bVar = this.f45389c;
        if (bVar != null) {
            return bVar.f45419c;
        }
        int i10 = 5 & (-1);
        return -1;
    }

    public void u0(int i10, View... viewArr) {
        this.f45404r.m(i10, viewArr);
    }

    public Interpolator x() {
        int i10 = this.f45389c.f45421e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f45387a.getContext(), this.f45389c.f45423g);
        }
        if (i10 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(this.f45389c.f45422f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        int i11 = 0 & 4;
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    f y(Context context, int i10, int i11, int i12) {
        b bVar = this.f45389c;
        if (bVar == null) {
            return null;
        }
        for (i iVar : bVar.f45427k) {
            for (Integer num : iVar.e()) {
                if (i11 == num.intValue()) {
                    for (f fVar : iVar.d(num.intValue())) {
                        if (fVar.f45142a == i12 && fVar.f45145d == i10) {
                            return fVar;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void z(o oVar) {
        b bVar = this.f45389c;
        if (bVar != null) {
            Iterator it = bVar.f45427k.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(oVar);
            }
        } else {
            b bVar2 = this.f45392f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f45427k.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).b(oVar);
                }
            }
        }
    }

    public static class b {
        public static final int A = -2;
        public static final int B = -1;
        public static final int C = 0;
        public static final int D = 1;
        public static final int E = 2;
        public static final int F = 3;
        public static final int G = 4;
        public static final int H = 5;
        public static final int I = 6;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f45409s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f45410t = 1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f45411u = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f45412v = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f45413w = 4;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        static final int f45414x = 1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        static final int f45415y = 2;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        static final int f45416z = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f45418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f45422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f45423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45424h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f45425i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final t f45426j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ArrayList<i> f45427k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private v f45428l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ArrayList<a> f45429m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f45430n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f45431o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f45432p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f45433q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f45434r;

        b(t tVar, b bVar) {
            this.f45417a = -1;
            this.f45418b = false;
            this.f45419c = -1;
            this.f45420d = -1;
            this.f45421e = 0;
            this.f45422f = null;
            this.f45423g = -1;
            this.f45424h = 400;
            this.f45425i = 0.0f;
            this.f45427k = new ArrayList<>();
            this.f45428l = null;
            this.f45429m = new ArrayList<>();
            this.f45430n = 0;
            this.f45431o = false;
            this.f45432p = -1;
            this.f45433q = 0;
            this.f45434r = 0;
            this.f45426j = tVar;
            this.f45424h = tVar.f45397k;
            if (bVar != null) {
                this.f45432p = bVar.f45432p;
                this.f45421e = bVar.f45421e;
                this.f45422f = bVar.f45422f;
                this.f45423g = bVar.f45423g;
                this.f45424h = bVar.f45424h;
                this.f45427k = bVar.f45427k;
                this.f45425i = bVar.f45425i;
                this.f45433q = bVar.f45433q;
            }
        }

        private void x(t tVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                if (index == androidx.constraintlayout.widget.j.c.f46482hf) {
                    this.f45419c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f45419c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
                        fVar.y0(context, this.f45419c);
                        tVar.f45394h.append(this.f45419c, fVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f45419c = tVar.b0(context, this.f45419c);
                    }
                } else if (index == androidx.constraintlayout.widget.j.c.f46515jf) {
                    this.f45420d = typedArray.getResourceId(index, this.f45420d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f45420d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.f fVar2 = new androidx.constraintlayout.widget.f();
                        fVar2.y0(context, this.f45420d);
                        tVar.f45394h.append(this.f45420d, fVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f45420d = tVar.b0(context, this.f45420d);
                    }
                } else if (index == androidx.constraintlayout.widget.j.c.f46566mf) {
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f45423g = resourceId;
                        if (resourceId != -1) {
                            this.f45421e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        this.f45422f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f45423g = typedArray.getResourceId(index, -1);
                                this.f45421e = -2;
                            } else {
                                this.f45421e = -1;
                            }
                        }
                    } else {
                        this.f45421e = typedArray.getInteger(index, this.f45421e);
                    }
                } else if (index == androidx.constraintlayout.widget.j.c.f46532kf) {
                    int i12 = typedArray.getInt(index, this.f45424h);
                    this.f45424h = i12;
                    if (i12 < 8) {
                        this.f45424h = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.j.c.f46600of) {
                    this.f45425i = typedArray.getFloat(index, this.f45425i);
                } else if (index == androidx.constraintlayout.widget.j.c.f46465gf) {
                    this.f45430n = typedArray.getInteger(index, this.f45430n);
                } else if (index == androidx.constraintlayout.widget.j.c.f46448ff) {
                    this.f45417a = typedArray.getResourceId(index, this.f45417a);
                } else if (index == androidx.constraintlayout.widget.j.c.f46617pf) {
                    this.f45431o = typedArray.getBoolean(index, this.f45431o);
                } else if (index == androidx.constraintlayout.widget.j.c.f46583nf) {
                    this.f45432p = typedArray.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.j.c.f46549lf) {
                    this.f45433q = typedArray.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.j.c.f46634qf) {
                    this.f45434r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f45420d == -1) {
                this.f45418b = true;
            }
        }

        private void y(t tVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.f46431ef);
            x(tVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f45424h;
        }

        public int B() {
            return this.f45419c;
        }

        public int C() {
            return this.f45417a;
        }

        public List<i> D() {
            return this.f45427k;
        }

        public int E() {
            return this.f45433q;
        }

        public List<a> F() {
            return this.f45429m;
        }

        public int G() {
            return this.f45432p;
        }

        public float H() {
            return this.f45425i;
        }

        public int I() {
            return this.f45420d;
        }

        public v J() {
            return this.f45428l;
        }

        public boolean K() {
            return !this.f45431o;
        }

        public boolean L(int i10) {
            return (this.f45434r & i10) != 0;
        }

        public void M(int i10) {
            a next;
            Iterator<a> it = this.f45429m.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f45441b != i10);
            if (next != null) {
                this.f45429m.remove(next);
            }
        }

        public void N(int i10) {
            this.f45430n = i10;
        }

        public void O(int i10) {
            this.f45424h = Math.max(i10, 8);
        }

        public void P(boolean z10) {
            this.f45431o = !z10;
        }

        public void Q(int i10, String str, int i11) {
            this.f45421e = i10;
            this.f45422f = str;
            this.f45423g = i11;
        }

        public void R(int i10) {
            this.f45433q = i10;
        }

        public void S(u uVar) {
            this.f45428l = uVar == null ? null : new v(this.f45426j.f45387a, uVar);
        }

        public void T(int i10) {
            v vVarJ = J();
            if (vVarJ != null) {
                vVarJ.F(i10);
            }
        }

        public void U(int i10) {
            this.f45432p = i10;
        }

        public void V(float f10) {
            this.f45425i = f10;
        }

        public void W(int i10) {
            this.f45434r = i10;
        }

        public void t(i iVar) {
            this.f45427k.add(iVar);
        }

        public void u(int i10, int i11) {
            for (a aVar : this.f45429m) {
                if (aVar.f45441b == i10) {
                    aVar.f45442c = i11;
                    return;
                }
            }
            this.f45429m.add(new a(this, i10, i11));
        }

        public void v(Context context, XmlPullParser xmlPullParser) {
            this.f45429m.add(new a(context, this, xmlPullParser));
        }

        public String w(Context context) {
            String resourceEntryName = this.f45420d == -1 ? AbstractJsonLexerKt.NULL : context.getResources().getResourceEntryName(this.f45420d);
            if (this.f45419c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f45419c);
        }

        public int z() {
            return this.f45430n;
        }

        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f45435d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f45436e = 17;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f45437f = 16;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f45438g = 256;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f45439h = 4096;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f45440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f45441b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f45442c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f45441b = -1;
                this.f45442c = 17;
                this.f45440a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.c.Ud);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == androidx.constraintlayout.widget.j.c.Wd) {
                        this.f45441b = typedArrayObtainStyledAttributes.getResourceId(index, this.f45441b);
                    } else if (index == androidx.constraintlayout.widget.j.c.Vd) {
                        this.f45442c = typedArrayObtainStyledAttributes.getInt(index, this.f45442c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i10, b bVar) {
                int i11 = this.f45441b;
                View viewFindViewById = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (viewFindViewById == null) {
                    return;
                }
                int i12 = bVar.f45420d;
                int i13 = bVar.f45419c;
                if (i12 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i14 = this.f45442c;
                boolean z10 = false;
                boolean z11 = ((i14 & 1) != 0 && i10 == i12) | ((i14 & 1) != 0 && i10 == i12) | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z10 = true;
                }
                if (z11 || z10) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f45440a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i10 = bVar2.f45419c;
                int i11 = this.f45440a.f45420d;
                if (i11 == -1) {
                    return motionLayout.f45003f != i10;
                }
                int i12 = motionLayout.f45003f;
                return i12 == i11 || i12 == i10;
            }

            public void c(MotionLayout motionLayout) {
                View viewFindViewById;
                int i10 = this.f45441b;
                if (i10 != -1 && (viewFindViewById = motionLayout.findViewById(i10)) != null) {
                    viewFindViewById.setOnClickListener(null);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f45440a.f45426j.f45387a;
                if (motionLayout.z0()) {
                    if (this.f45440a.f45420d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.V0(this.f45440a.f45419c);
                            return;
                        }
                        b bVar = new b(this.f45440a.f45426j, this.f45440a);
                        bVar.f45420d = currentState;
                        bVar.f45419c = this.f45440a.f45419c;
                        motionLayout.setTransition(bVar);
                        motionLayout.R0();
                        return;
                    }
                    b bVar2 = this.f45440a.f45426j.f45389c;
                    int i10 = this.f45442c;
                    boolean z10 = false;
                    boolean z11 = true | false;
                    boolean z12 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z13 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z12 && z13) {
                        b bVar3 = this.f45440a.f45426j.f45389c;
                        b bVar4 = this.f45440a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z13 = false;
                            z10 = z12;
                        }
                    } else {
                        z10 = z12;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z10 && (this.f45442c & 1) != 0) {
                            motionLayout.setTransition(this.f45440a);
                            motionLayout.R0();
                            return;
                        }
                        if (z13 && (this.f45442c & 16) != 0) {
                            motionLayout.setTransition(this.f45440a);
                            motionLayout.T0();
                        } else if (z10 && (this.f45442c & 256) != 0) {
                            motionLayout.setTransition(this.f45440a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z13 || (this.f45442c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f45440a);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            public a(b bVar, int i10, int i11) {
                this.f45440a = bVar;
                this.f45441b = i10;
                this.f45442c = i11;
            }
        }

        public b(int i10, t tVar, int i11, int i12) {
            this.f45417a = -1;
            this.f45418b = false;
            this.f45419c = -1;
            this.f45420d = -1;
            this.f45421e = 0;
            this.f45422f = null;
            this.f45423g = -1;
            this.f45424h = 400;
            this.f45425i = 0.0f;
            this.f45427k = new ArrayList<>();
            this.f45428l = null;
            this.f45429m = new ArrayList<>();
            this.f45430n = 0;
            this.f45431o = false;
            this.f45432p = -1;
            this.f45433q = 0;
            this.f45434r = 0;
            this.f45417a = i10;
            this.f45426j = tVar;
            this.f45420d = i11;
            this.f45419c = i12;
            this.f45424h = tVar.f45397k;
            this.f45433q = tVar.f45398l;
        }

        b(t tVar, Context context, XmlPullParser xmlPullParser) {
            this.f45417a = -1;
            this.f45418b = false;
            this.f45419c = -1;
            this.f45420d = -1;
            this.f45421e = 0;
            this.f45422f = null;
            this.f45423g = -1;
            this.f45424h = 400;
            this.f45425i = 0.0f;
            this.f45427k = new ArrayList<>();
            this.f45428l = null;
            this.f45429m = new ArrayList<>();
            this.f45430n = 0;
            this.f45431o = false;
            this.f45432p = -1;
            this.f45433q = 0;
            this.f45434r = 0;
            this.f45424h = tVar.f45397k;
            this.f45433q = tVar.f45398l;
            this.f45426j = tVar;
            y(tVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    t(Context context, MotionLayout motionLayout, int i10) {
        this.f45387a = motionLayout;
        this.f45404r = new a0(motionLayout);
        W(context, i10);
        this.f45394h.put(androidx.constraintlayout.widget.j.b.f46336u0, new androidx.constraintlayout.widget.f());
        this.f45395i.put("motion_base", Integer.valueOf(androidx.constraintlayout.widget.j.b.f46336u0));
    }
}

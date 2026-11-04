package androidx.transition;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f75732b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.collection.a<String, Constructor<?>> f75733c = new androidx.collection.a<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f75734a;

    private n0(@NonNull Context context) {
        this.f75734a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            androidx.collection.a<String, Constructor<?>> aVar = f75733c;
            synchronized (aVar) {
                try {
                    Constructor<?> constructor = aVar.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f75734a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(f75732b);
                        constructor.setAccessible(true);
                        aVar.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.f75734a, attributeSet);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return objNewInstance;
        } catch (Exception e10) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e10);
        }
    }

    @androidx.annotation.p0
    private g0 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, g0 g0Var) throws XmlPullParserException, IOException {
        g0 s0Var;
        int depth = xmlPullParser.getDepth();
        s0 s0Var2 = g0Var instanceof s0 ? (s0) g0Var : null;
        loop0: while (true) {
            s0Var = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                    break loop0;
                }
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("fade".equals(name)) {
                        s0Var = new k(this.f75734a, attributeSet);
                    } else if ("changeBounds".equals(name)) {
                        s0Var = new d(this.f75734a, attributeSet);
                    } else if ("slide".equals(name)) {
                        s0Var = new e0(this.f75734a, attributeSet);
                    } else if ("explode".equals(name)) {
                        s0Var = new j(this.f75734a, attributeSet);
                    } else if ("changeImageTransform".equals(name)) {
                        s0Var = new f(this.f75734a, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        s0Var = new h(this.f75734a, attributeSet);
                    } else if ("changeClipBounds".equals(name)) {
                        s0Var = new e(this.f75734a, attributeSet);
                    } else if (androidx.constraintlayout.core.motion.utils.v.h.f44105f.equals(name)) {
                        s0Var = new b(this.f75734a, attributeSet);
                    } else if ("changeScroll".equals(name)) {
                        s0Var = new g(this.f75734a, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        s0Var = new s0(this.f75734a, attributeSet);
                    } else if ("transition".equals(name)) {
                        s0Var = (g0) a(attributeSet, g0.class, "transition");
                    } else if ("targets".equals(name)) {
                        e(xmlPullParser, attributeSet, g0Var);
                    } else if ("arcMotion".equals(name)) {
                        if (g0Var == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        g0Var.I0(new a(this.f75734a, attributeSet));
                    } else if ("pathMotion".equals(name)) {
                        if (g0Var == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        g0Var.I0((w) a(attributeSet, w.class, "pathMotion"));
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        }
                        if (g0Var == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        g0Var.I0(new y(this.f75734a, attributeSet));
                    }
                    if (s0Var == null) {
                        continue;
                    } else {
                        if (!xmlPullParser.isEmptyElementTag()) {
                            b(xmlPullParser, attributeSet, s0Var);
                        }
                        if (s0Var2 != null) {
                            break;
                        }
                        if (g0Var != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            s0Var2.S0(s0Var);
        }
        return s0Var;
    }

    @androidx.annotation.p0
    private p0 c(XmlPullParser xmlPullParser, AttributeSet attributeSet, @NonNull ViewGroup viewGroup) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        p0 p0Var = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("transitionManager")) {
                    p0Var = new p0();
                } else {
                    if (!name.equals("transition") || p0Var == null) {
                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                    }
                    h(attributeSet, xmlPullParser, viewGroup, p0Var);
                }
            }
        }
        return p0Var;
    }

    @NonNull
    public static n0 d(@NonNull Context context) {
        return new n0(context);
    }

    private void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, @NonNull g0 g0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals(androidx.constraintlayout.core.motion.utils.v.a.M)) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray typedArrayObtainStyledAttributes = this.f75734a.obtainStyledAttributes(attributeSet, f0.f75564a);
                int iL = androidx.core.content.res.n.l(typedArrayObtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (iL != 0) {
                    g0Var.d(iL);
                } else {
                    int iL2 = androidx.core.content.res.n.l(typedArrayObtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (iL2 != 0) {
                        g0Var.D(iL2, true);
                    } else {
                        String strM = androidx.core.content.res.n.m(typedArrayObtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (strM != null) {
                            g0Var.g(strM);
                        } else {
                            String strM2 = androidx.core.content.res.n.m(typedArrayObtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (strM2 != null) {
                                g0Var.G(strM2, true);
                            } else {
                                String strM3 = androidx.core.content.res.n.m(typedArrayObtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (strM3 != null) {
                                    try {
                                        g0Var.F(Class.forName(strM3), true);
                                    } catch (ClassNotFoundException e10) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw new RuntimeException("Could not create " + strM3, e10);
                                    }
                                } else {
                                    String strM4 = androidx.core.content.res.n.m(typedArrayObtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (strM4 != null) {
                                        g0Var.f(Class.forName(strM4));
                                    }
                                }
                            }
                        }
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, @NonNull ViewGroup viewGroup, p0 p0Var) throws Resources.NotFoundException {
        g0 g0VarF;
        TypedArray typedArrayObtainStyledAttributes = this.f75734a.obtainStyledAttributes(attributeSet, f0.f75565b);
        int iL = androidx.core.content.res.n.l(typedArrayObtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int iL2 = androidx.core.content.res.n.l(typedArrayObtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        c0 c0VarD = iL2 < 0 ? null : c0.d(viewGroup, iL2, this.f75734a);
        int iL3 = androidx.core.content.res.n.l(typedArrayObtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        c0 c0VarD2 = iL3 >= 0 ? c0.d(viewGroup, iL3, this.f75734a) : null;
        if (iL >= 0 && (g0VarF = f(iL)) != null) {
            if (c0VarD2 == null) {
                throw new RuntimeException("No toScene for transition ID " + iL);
            }
            if (c0VarD == null) {
                p0Var.n(c0VarD2, g0VarF);
            } else {
                p0Var.m(c0VarD, c0VarD2, g0VarF);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @androidx.annotation.p0
    public g0 f(int i10) {
        XmlResourceParser xml = this.f75734a.getResources().getXml(i10);
        try {
            try {
                g0 g0VarB = b(xml, Xml.asAttributeSet(xml), null);
                xml.close();
                return g0VarB;
            } catch (IOException e10) {
                throw new InflateException(xml.getPositionDescription() + ": " + e10.getMessage(), e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    @androidx.annotation.p0
    public p0 g(int i10, @NonNull ViewGroup viewGroup) {
        XmlResourceParser xml = this.f75734a.getResources().getXml(i10);
        try {
            try {
                p0 p0VarC = c(xml, Xml.asAttributeSet(xml), viewGroup);
                xml.close();
                return p0VarC;
            } catch (IOException e10) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e10.getMessage());
                inflateException.initCause(e10);
                throw inflateException;
            } catch (XmlPullParserException e11) {
                InflateException inflateException2 = new InflateException(e11.getMessage());
                inflateException2.initCause(e11);
                throw inflateException2;
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}

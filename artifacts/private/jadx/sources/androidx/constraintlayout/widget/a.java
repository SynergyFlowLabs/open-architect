package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45766i = "TransitionLayout";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f45767j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f45769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0369a f45770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f45772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f45773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f45774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45775h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public enum EnumC0369a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0369a enumC0369a) {
        this.f45768a = false;
        this.f45769b = str;
        this.f45770c = enumC0369a;
    }

    private static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, a> d(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return map2;
    }

    public static void q(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        EnumC0369a enumC0369a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.A8);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0369a enumC0369a2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == j.c.B8) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == j.c.L8) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == j.c.C8) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0369a2 = EnumC0369a.BOOLEAN_TYPE;
            } else {
                if (index == j.c.E8) {
                    enumC0369a = EnumC0369a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == j.c.D8) {
                    enumC0369a = EnumC0369a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == j.c.I8) {
                    enumC0369a = EnumC0369a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == j.c.F8) {
                    enumC0369a = EnumC0369a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.G8) {
                    enumC0369a = EnumC0369a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == j.c.H8) {
                    enumC0369a = EnumC0369a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == j.c.K8) {
                    enumC0369a = EnumC0369a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.J8) {
                    enumC0369a = EnumC0369a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0369a2 = enumC0369a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0369a2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = map.get(next);
            if (!aVar.f45768a) {
                next = "set" + next;
            }
            try {
                int iOrdinal = aVar.f45770c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(next, cls3).invoke(view, Integer.valueOf(aVar.f45771d));
                        break;
                    case 1:
                        cls.getMethod(next, cls2).invoke(view, Float.valueOf(aVar.f45772e));
                        break;
                    case 2:
                        cls.getMethod(next, cls3).invoke(view, Integer.valueOf(aVar.f45775h));
                        break;
                    case 3:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f45775h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(next, CharSequence.class).invoke(view, aVar.f45773f);
                        break;
                    case 5:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f45774g));
                        break;
                    case 6:
                        cls.getMethod(next, cls2).invoke(view, Float.valueOf(aVar.f45772e));
                        break;
                    case 7:
                        cls.getMethod(next, cls3).invoke(view, Integer.valueOf(aVar.f45771d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public void a(View view) {
        Class<?> cls = view.getClass();
        String str = this.f45769b;
        if (!this.f45768a) {
            str = "set" + str;
        }
        try {
            int iOrdinal = this.f45770c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f45771d));
                    break;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f45772e));
                    break;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f45775h));
                    break;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f45775h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f45773f);
                    break;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f45774g));
                    break;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f45772e));
                    break;
                default:
                    break;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public boolean c(a aVar) {
        EnumC0369a enumC0369a;
        if (aVar != null && (enumC0369a = this.f45770c) == aVar.f45770c) {
            switch (enumC0369a) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.f45771d == aVar.f45771d) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.f45772e == aVar.f45772e;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.f45775h == aVar.f45775h;
                case STRING_TYPE:
                    return this.f45771d == aVar.f45771d;
                case BOOLEAN_TYPE:
                    return this.f45774g == aVar.f45774g;
                case DIMENSION_TYPE:
                    return this.f45772e == aVar.f45772e;
                default:
                    return false;
            }
        }
        return false;
    }

    public int e() {
        return this.f45775h;
    }

    public float f() {
        return this.f45772e;
    }

    public int g() {
        return this.f45771d;
    }

    public String h() {
        return this.f45769b;
    }

    public String i() {
        return this.f45773f;
    }

    public EnumC0369a j() {
        return this.f45770c;
    }

    public float k() {
        switch (this.f45770c) {
            case INT_TYPE:
                return this.f45771d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f45772e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f45774g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] fArr) {
        switch (this.f45770c) {
            case INT_TYPE:
                fArr[0] = this.f45771d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f45772e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i10 = this.f45775h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f45774g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f45772e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.f45774g;
    }

    public boolean n() {
        int iOrdinal = this.f45770c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public boolean o() {
        return this.f45768a;
    }

    public int p() {
        int iOrdinal = this.f45770c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void s(int i10) {
        this.f45775h = i10;
    }

    public void t(float f10) {
        this.f45772e = f10;
    }

    public void u(int i10) {
        this.f45771d = i10;
    }

    public void v(String str) {
        this.f45773f = str;
    }

    public void w(Object obj) {
        switch (this.f45770c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f45771d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f45772e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f45775h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f45773f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f45774g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f45772e = ((Float) obj).floatValue();
                break;
        }
    }

    public void x(float[] fArr) {
        switch (this.f45770c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f45771d = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.f45772e = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f45775h = iHSVToColor;
                this.f45775h = (b((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & 16777215);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.f45774g = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.f45772e = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, EnumC0369a enumC0369a, Object obj, boolean z10) {
        this.f45769b = str;
        this.f45770c = enumC0369a;
        this.f45768a = z10;
        w(obj);
    }

    public a(a aVar, Object obj) {
        this.f45768a = false;
        this.f45769b = aVar.f45769b;
        this.f45770c = aVar.f45770c;
        w(obj);
    }
}

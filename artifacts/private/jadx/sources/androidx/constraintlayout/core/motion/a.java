package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f43470i = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f43472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0356a f43473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f43475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f43476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f43477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43478h;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.a$a, reason: collision with other inner class name */
    public enum EnumC0356a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0356a enumC0356a) {
        this.f43471a = false;
        this.f43472b = str;
        this.f43473c = enumC0356a;
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static int f(float f10, float f11, float f12) {
        float f13 = f10 * 6.0f;
        int i10 = (int) f13;
        float f14 = f13 - i10;
        float f15 = f12 * 255.0f;
        int i11 = (int) (((1.0f - f11) * f15) + 0.5f);
        int i12 = (int) (((1.0f - (f14 * f11)) * f15) + 0.5f);
        int i13 = (int) (((1.0f - ((1.0f - f14) * f11)) * f15) + 0.5f);
        int i14 = (int) (f15 + 0.5f);
        if (i10 == 0) {
            return ((i14 << 16) + (i13 << 8) + i11) | (-16777216);
        }
        if (i10 == 1) {
            return ((i12 << 16) + (i14 << 8) + i11) | (-16777216);
        }
        if (i10 == 2) {
            return ((i11 << 16) + (i14 << 8) + i13) | (-16777216);
        }
        if (i10 == 3) {
            return ((i11 << 16) + (i12 << 8) + i14) | (-16777216);
        }
        if (i10 == 4) {
            return ((i13 << 16) + (i11 << 8) + i14) | (-16777216);
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i14 << 16) + (i11 << 8) + i12) | (-16777216);
    }

    public boolean b(a aVar) {
        EnumC0356a enumC0356a;
        if (aVar != null && (enumC0356a = this.f43473c) == aVar.f43473c) {
            switch (enumC0356a) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.f43474d == aVar.f43474d) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.f43475e == aVar.f43475e;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.f43478h == aVar.f43478h;
                case STRING_TYPE:
                    return this.f43474d == aVar.f43474d;
                case BOOLEAN_TYPE:
                    return this.f43477g == aVar.f43477g;
                case DIMENSION_TYPE:
                    return this.f43475e == aVar.f43475e;
                default:
                    return false;
            }
        }
        return false;
    }

    public EnumC0356a c() {
        return this.f43473c;
    }

    public float d() {
        switch (this.f43473c) {
            case INT_TYPE:
                return this.f43474d;
            case FLOAT_TYPE:
                return this.f43475e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f43477g ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.f43475e;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        switch (this.f43473c) {
            case INT_TYPE:
                fArr[0] = this.f43474d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f43475e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i10 = this.f43478h;
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
                fArr[0] = this.f43477g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f43475e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int iOrdinal = this.f43473c.ordinal();
        if (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) {
            return false;
        }
        int i10 = 6 >> 1;
        return true;
    }

    public int h() {
        int iOrdinal = this.f43473c.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            return 4;
        }
        int i10 = 4 >> 1;
        return 1;
    }

    public void i(int i10) {
        this.f43478h = i10;
    }

    public void j(float f10) {
        this.f43475e = f10;
    }

    public void k(int i10) {
        this.f43474d = i10;
    }

    public void l(String str) {
        this.f43476f = str;
    }

    public void m(Object obj) {
        switch (this.f43473c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f43474d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f43475e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f43478h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f43476f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f43477g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f43475e = ((Float) obj).floatValue();
                break;
        }
    }

    public void n(float[] fArr) {
        boolean z10 = true;
        switch (this.f43473c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f43474d = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.f43475e = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int iF = f(fArr[0], fArr[1], fArr[2]);
                this.f43478h = iF;
                this.f43478h = (a((int) (fArr[3] * 255.0f)) << 24) | (iF & 16777215);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                if (fArr[0] <= 0.5d) {
                    z10 = false;
                }
                this.f43477g = z10;
                return;
            case DIMENSION_TYPE:
                this.f43475e = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, EnumC0356a enumC0356a, Object obj, boolean z10) {
        this.f43472b = str;
        this.f43473c = enumC0356a;
        this.f43471a = z10;
        m(obj);
    }

    public a(a aVar, Object obj) {
        this.f43471a = false;
        this.f43472b = aVar.f43472b;
        this.f43473c = aVar.f43473c;
        m(obj);
    }
}

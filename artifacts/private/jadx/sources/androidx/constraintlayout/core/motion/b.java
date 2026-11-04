package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.v;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f43488g = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f43489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f43494f;

    public b(b bVar) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43493e = null;
        this.f43489a = bVar.f43489a;
        this.f43490b = bVar.f43490b;
        this.f43491c = bVar.f43491c;
        this.f43492d = bVar.f43492d;
        this.f43493e = bVar.f43493e;
        this.f43494f = bVar.f43494f;
    }

    private static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String c(int i10) {
        String str = "00000000" + Integer.toHexString(i10);
        return "#" + str.substring(str.length() - 8);
    }

    public static int p(float f10, float f11, float f12) {
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
        int i15 = 2 & 2;
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

    public static int s(float f10, float f11, float f12, float f13) {
        int iB = b((int) (f10 * 255.0f));
        int iB2 = b((int) (f11 * 255.0f));
        return (iB << 16) | (b((int) (f13 * 255.0f)) << 24) | (iB2 << 8) | b((int) (f12 * 255.0f));
    }

    public void a(f fVar) {
        int i10 = this.f43490b;
        switch (i10) {
            case 900:
            case 902:
            case v.b.f43999p /* 906 */:
                fVar.J(this.f43489a, i10, this.f43491c);
                break;
            case 901:
            case v.b.f43998o /* 905 */:
                fVar.I(this.f43489a, i10, this.f43492d);
                break;
            case v.b.f43996m /* 903 */:
                fVar.K(this.f43489a, i10, this.f43493e);
                break;
            case v.b.f43997n /* 904 */:
                fVar.L(this.f43489a, i10, this.f43494f);
                break;
        }
    }

    public b d() {
        return new b(this);
    }

    public boolean e(b bVar) {
        int i10;
        if (bVar != null && (i10 = this.f43490b) == bVar.f43490b) {
            switch (i10) {
                case 900:
                case v.b.f43999p /* 906 */:
                    if (this.f43491c == bVar.f43491c) {
                        return true;
                    }
                    break;
                case 901:
                    return this.f43492d == bVar.f43492d;
                case 902:
                    return this.f43491c == bVar.f43491c;
                case v.b.f43996m /* 903 */:
                    return this.f43491c == bVar.f43491c;
                case v.b.f43997n /* 904 */:
                    return this.f43494f == bVar.f43494f;
                case v.b.f43998o /* 905 */:
                    return this.f43492d == bVar.f43492d;
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f43494f;
    }

    public int g() {
        return this.f43491c;
    }

    public float h() {
        return this.f43492d;
    }

    public int i() {
        return this.f43491c;
    }

    public int j(float[] fArr) {
        return (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f43489a;
    }

    public String l() {
        return this.f43493e;
    }

    public int m() {
        return this.f43490b;
    }

    public float n() {
        switch (this.f43490b) {
            case 900:
                return this.f43491c;
            case 901:
                return this.f43492d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case v.b.f43996m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f43997n /* 904 */:
                return this.f43494f ? 1.0f : 0.0f;
            case v.b.f43998o /* 905 */:
                return this.f43492d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.f43490b) {
            case 900:
                fArr[0] = this.f43491c;
                return;
            case 901:
                fArr[0] = this.f43492d;
                return;
            case 902:
                int i10 = this.f43491c;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case v.b.f43996m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f43997n /* 904 */:
                fArr[0] = this.f43494f ? 1.0f : 0.0f;
                return;
            case v.b.f43998o /* 905 */:
                fArr[0] = this.f43492d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i10 = this.f43490b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int r() {
        return this.f43490b != 902 ? 1 : 4;
    }

    public void t(boolean z10) {
        this.f43494f = z10;
    }

    public String toString() {
        String str = this.f43489a + AbstractJsonLexerKt.COLON;
        switch (this.f43490b) {
            case 900:
                return str + this.f43491c;
            case 901:
                return str + this.f43492d;
            case 902:
                return str + c(this.f43491c);
            case v.b.f43996m /* 903 */:
                return str + this.f43493e;
            case v.b.f43997n /* 904 */:
                return str + Boolean.valueOf(this.f43494f);
            case v.b.f43998o /* 905 */:
                return str + this.f43492d;
            default:
                return str + "????";
        }
    }

    public void u(float f10) {
        this.f43492d = f10;
    }

    public void v(int i10) {
        this.f43491c = i10;
    }

    public void w(f fVar, float[] fArr) {
        int i10 = this.f43490b;
        switch (i10) {
            case 900:
                fVar.J(this.f43489a, i10, (int) fArr[0]);
                return;
            case 901:
            case v.b.f43998o /* 905 */:
                fVar.I(this.f43489a, i10, fArr[0]);
                return;
            case 902:
                fVar.J(this.f43489a, this.f43490b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case v.b.f43996m /* 903 */:
            case v.b.f43999p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f43489a);
            case v.b.f43997n /* 904 */:
                fVar.L(this.f43489a, i10, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f43493e = str;
    }

    public void y(Object obj) {
        switch (this.f43490b) {
            case 900:
            case v.b.f43999p /* 906 */:
                this.f43491c = ((Integer) obj).intValue();
                break;
            case 901:
                this.f43492d = ((Float) obj).floatValue();
                break;
            case 902:
                this.f43491c = ((Integer) obj).intValue();
                break;
            case v.b.f43996m /* 903 */:
                this.f43493e = (String) obj;
                break;
            case v.b.f43997n /* 904 */:
                this.f43494f = ((Boolean) obj).booleanValue();
                break;
            case v.b.f43998o /* 905 */:
                this.f43492d = ((Float) obj).floatValue();
                break;
        }
    }

    public void z(float[] fArr) {
        switch (this.f43490b) {
            case 900:
            case v.b.f43999p /* 906 */:
                this.f43491c = (int) fArr[0];
                return;
            case 901:
            case v.b.f43998o /* 905 */:
                this.f43492d = fArr[0];
                return;
            case 902:
                this.f43491c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case v.b.f43996m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f43997n /* 904 */:
                this.f43494f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public b(String str, int i10, String str2) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43489a = str;
        this.f43490b = i10;
        this.f43493e = str2;
    }

    public b(String str, int i10, int i11) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43493e = null;
        this.f43489a = str;
        this.f43490b = i10;
        if (i10 == 901) {
            this.f43492d = i11;
        } else {
            this.f43491c = i11;
        }
    }

    public b(String str, int i10, float f10) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43493e = null;
        this.f43489a = str;
        this.f43490b = i10;
        this.f43492d = f10;
    }

    public b(String str, int i10, boolean z10) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43493e = null;
        this.f43489a = str;
        this.f43490b = i10;
        this.f43494f = z10;
    }

    public b(String str, int i10) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43493e = null;
        this.f43489a = str;
        this.f43490b = i10;
    }

    public b(String str, int i10, Object obj) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43493e = null;
        this.f43489a = str;
        this.f43490b = i10;
        y(obj);
    }

    public b(b bVar, Object obj) {
        this.f43491c = Integer.MIN_VALUE;
        this.f43492d = Float.NaN;
        this.f43493e = null;
        this.f43489a = bVar.f43489a;
        this.f43490b = bVar.f43490b;
        y(obj);
    }
}

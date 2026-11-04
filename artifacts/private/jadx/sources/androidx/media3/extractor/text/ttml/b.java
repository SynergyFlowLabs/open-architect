package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.common.collect.o7;
import com.google.common.collect.z6;
import com.google.common.collect.z9;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68663d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68664e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f68665f = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final z6<String> f68666g = z6.K("auto", "none");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final z6<String> f68667h = z6.L(c.f68709y0, c.f68711z0, c.A0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final z6<String> f68668i = z6.K(c.B0, "open");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final z6<String> f68669j = z6.L(c.f68677e0, c.f68676d0, c.f68678f0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68672c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private b(int i10, int i11, int i12) {
        this.f68670a = i10;
        this.f68671b = i11;
        this.f68672c = i12;
    }

    @p0
    public static b a(@p0 String str) {
        if (str == null) {
            return null;
        }
        String strG = com.google.common.base.c.g(str.trim());
        if (strG.isEmpty()) {
            return null;
        }
        return b(z6.C(TextUtils.split(strG, f68665f)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    private static b b(z6<String> z6Var) {
        byte b10;
        int i10;
        int i11;
        String str;
        int iHashCode;
        String str2 = (String) o7.v(z9.n(f68669j, z6Var), c.f68678f0);
        int iHashCode2 = str2.hashCode();
        int i12 = 2;
        byte b11 = 0;
        int i13 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(c.f68677e0)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals(c.f68678f0)) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str2.equals(c.f68676d0)) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        z9.m mVarN = z9.n(f68666g, z6Var);
        if (!mVarN.isEmpty()) {
            String str3 = (String) mVarN.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i13 = 0;
            }
            return new b(i13, 0, i10);
        }
        z9.m mVarN2 = z9.n(f68668i, z6Var);
        z9.m mVarN3 = z9.n(f68667h, z6Var);
        if (mVarN2.isEmpty() && mVarN3.isEmpty()) {
            return new b(-1, 0, i10);
        }
        String str4 = (String) o7.v(mVarN2, c.B0);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals("open")) {
                i11 = 2;
            }
            str = (String) o7.v(mVarN3, c.A0);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals(c.f68709y0)) {
                        b11 = -1;
                    }
                } else if (str.equals(c.f68711z0)) {
                    b11 = 1;
                } else {
                    b11 = -1;
                }
            } else if (str.equals(c.A0)) {
                b11 = 2;
            } else {
                b11 = -1;
            }
            if (b11 != 0) {
                if (b11 != 1) {
                    i12 = 1;
                } else {
                    i12 = 3;
                }
            }
            return new b(i12, i11, i10);
        }
        str4.equals(c.B0);
        i11 = 1;
        str = (String) o7.v(mVarN3, c.A0);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b11 = -1;
                }
            } else if (str.equals(c.f68711z0)) {
                b11 = 1;
            } else {
                b11 = -1;
            }
        } else if (str.equals(c.A0)) {
            b11 = 2;
        } else {
            b11 = -1;
        }
        if (b11 != 0) {
            if (b11 != 1) {
                i12 = 1;
            } else {
                i12 = 3;
            }
        }
        return new b(i12, i11, i10);
    }
}

package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.b1;
import kotlin.c1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f48026a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @androidx.annotation.k(extension = 30)
    public static final int f48027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @androidx.annotation.k(extension = 31)
    public static final int f48028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @androidx.annotation.k(extension = 33)
    public static final int f48029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @androidx.annotation.k(extension = 1000000)
    public static final int f48030e;

    @w0(30)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f48031a = new a();

        private a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.b$b, reason: collision with other inner class name */
    @c1
    @Retention(RetentionPolicy.CLASS)
    @jj.e(jj.a.BINARY)
    public @interface InterfaceC0396b {
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f48027b = i10 >= 30 ? a.f48031a.a(30) : 0;
        f48028c = i10 >= 30 ? a.f48031a.a(31) : 0;
        f48029d = i10 >= 30 ? a.f48031a.a(33) : 0;
        f48030e = i10 >= 30 ? a.f48031a.a(1000000) : 0;
    }

    private b() {
    }

    @oj.n
    @kotlin.l(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @androidx.annotation.k(api = 24)
    public static final boolean a() {
        return true;
    }

    @oj.n
    @kotlin.l(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @androidx.annotation.k(api = 25)
    public static final boolean b() {
        return true;
    }

    @oj.n
    @kotlin.l(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @androidx.annotation.k(api = 26)
    public static final boolean c() {
        return true;
    }

    @oj.n
    @kotlin.l(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @androidx.annotation.k(api = 27)
    public static final boolean d() {
        return true;
    }

    @oj.n
    @kotlin.l(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @androidx.annotation.k(api = 28)
    public static final boolean e() {
        return true;
    }

    @oj.n
    @l1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final boolean f(@NotNull String codename, @NotNull String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @oj.n
    @kotlin.l(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @androidx.annotation.k(api = 29)
    public static final boolean g() {
        return true;
    }

    @oj.n
    @kotlin.l(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @androidx.annotation.k(api = 30)
    public static final boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @oj.n
    @kotlin.l(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @androidx.annotation.k(api = 31, codename = androidx.exifinterface.media.a.S4)
    public static final boolean i() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 >= 30) {
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (f(androidx.exifinterface.media.a.S4, CODENAME)) {
                return true;
            }
        }
        return false;
    }

    @oj.n
    @kotlin.l(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @androidx.annotation.k(api = 32, codename = "Sv2")
    public static final boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 32) {
            if (i10 < 31) {
                return false;
            }
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (!f("Sv2", CODENAME)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (f("Tiramisu", r0) != false) goto L11;
     */
    @oj.n
    @kotlin.l(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @kotlin.b1(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @androidx.annotation.k(api = 33, codename = "Tiramisu")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 3
            r1 = 33
            if (r0 >= r1) goto L22
            r2 = 6
            r1 = 32
            if (r0 < r1) goto L1f
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "OAENDbEM"
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Tiramisu"
            boolean r0 = f(r1, r0)
            r2 = 4
            if (r0 == 0) goto L1f
            goto L22
        L1f:
            r2 = 7
            r0 = 0
            return r0
        L22:
            r0 = 1
            r2 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.b.k():boolean");
    }

    @oj.n
    @kotlin.l(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @b1(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @androidx.annotation.k(api = 34, codename = "UpsideDownCake")
    public static final boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 34) {
            if (i10 < 33) {
                return false;
            }
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (!f("UpsideDownCake", CODENAME)) {
                return false;
            }
        }
        return true;
    }

    @oj.n
    @androidx.annotation.k(api = 35, codename = "VanillaIceCream")
    public static final boolean m() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return true;
        }
        if (i10 >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (f("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }
}

package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.annotation.p0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
final class g {
    public static final int A = 3;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    private static final int E = 0;
    private static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f68761v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f68762w = Float.MAX_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f68763x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f68764y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f68765z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private String f68766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68770e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f68776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private String f68777l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Layout.Alignment f68780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private Layout.Alignment f68781p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private androidx.media3.extractor.text.ttml.b f68783r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private String f68785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private String f68786u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68771f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68772g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68773h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68774i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68775j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68778m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68779n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68782q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f68784s = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @z7.a
    private g u(@p0 g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f68768c && gVar.f68768c) {
                A(gVar.f68767b);
            }
            if (this.f68773h == -1) {
                this.f68773h = gVar.f68773h;
            }
            if (this.f68774i == -1) {
                this.f68774i = gVar.f68774i;
            }
            if (this.f68766a == null && (str = gVar.f68766a) != null) {
                this.f68766a = str;
            }
            if (this.f68771f == -1) {
                this.f68771f = gVar.f68771f;
            }
            if (this.f68772g == -1) {
                this.f68772g = gVar.f68772g;
            }
            if (this.f68779n == -1) {
                this.f68779n = gVar.f68779n;
            }
            if (this.f68780o == null && (alignment2 = gVar.f68780o) != null) {
                this.f68780o = alignment2;
            }
            if (this.f68781p == null && (alignment = gVar.f68781p) != null) {
                this.f68781p = alignment;
            }
            if (this.f68782q == -1) {
                this.f68782q = gVar.f68782q;
            }
            if (this.f68775j == -1) {
                this.f68775j = gVar.f68775j;
                this.f68776k = gVar.f68776k;
            }
            if (this.f68783r == null) {
                this.f68783r = gVar.f68783r;
            }
            if (this.f68784s == Float.MAX_VALUE) {
                this.f68784s = gVar.f68784s;
            }
            if (this.f68785t == null) {
                this.f68785t = gVar.f68785t;
            }
            if (this.f68786u == null) {
                this.f68786u = gVar.f68786u;
            }
            if (z10 && !this.f68770e && gVar.f68770e) {
                x(gVar.f68769d);
            }
            if (z10 && this.f68778m == -1 && (i10 = gVar.f68778m) != -1) {
                this.f68778m = i10;
            }
        }
        return this;
    }

    @z7.a
    public g A(int i10) {
        this.f68767b = i10;
        this.f68768c = true;
        return this;
    }

    @z7.a
    public g B(@p0 String str) {
        this.f68766a = str;
        return this;
    }

    @z7.a
    public g C(float f10) {
        this.f68776k = f10;
        return this;
    }

    @z7.a
    public g D(int i10) {
        this.f68775j = i10;
        return this;
    }

    @z7.a
    public g E(@p0 String str) {
        this.f68777l = str;
        return this;
    }

    @z7.a
    public g F(boolean z10) {
        this.f68774i = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public g G(boolean z10) {
        this.f68771f = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public g H(@p0 Layout.Alignment alignment) {
        this.f68781p = alignment;
        return this;
    }

    @z7.a
    public g I(@p0 String str) {
        this.f68785t = str;
        return this;
    }

    @z7.a
    public g J(int i10) {
        this.f68779n = i10;
        return this;
    }

    @z7.a
    public g K(int i10) {
        this.f68778m = i10;
        return this;
    }

    @z7.a
    public g L(float f10) {
        this.f68784s = f10;
        return this;
    }

    @z7.a
    public g M(@p0 Layout.Alignment alignment) {
        this.f68780o = alignment;
        return this;
    }

    @z7.a
    public g N(boolean z10) {
        this.f68782q = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public g O(@p0 androidx.media3.extractor.text.ttml.b bVar) {
        this.f68783r = bVar;
        return this;
    }

    @z7.a
    public g P(boolean z10) {
        this.f68772g = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public g a(@p0 g gVar) {
        return u(gVar, true);
    }

    public int b() {
        if (this.f68770e) {
            return this.f68769d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    @p0
    public String c() {
        return this.f68786u;
    }

    public int d() {
        if (this.f68768c) {
            return this.f68767b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @p0
    public String e() {
        return this.f68766a;
    }

    public float f() {
        return this.f68776k;
    }

    public int g() {
        return this.f68775j;
    }

    @p0
    public String h() {
        return this.f68777l;
    }

    @p0
    public Layout.Alignment i() {
        return this.f68781p;
    }

    @p0
    public String j() {
        return this.f68785t;
    }

    public int k() {
        return this.f68779n;
    }

    public int l() {
        return this.f68778m;
    }

    public float m() {
        return this.f68784s;
    }

    public int n() {
        int i10 = this.f68773h;
        if (i10 == -1 && this.f68774i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f68774i == 1 ? 2 : 0);
    }

    @p0
    public Layout.Alignment o() {
        return this.f68780o;
    }

    public boolean p() {
        return this.f68782q == 1;
    }

    @p0
    public androidx.media3.extractor.text.ttml.b q() {
        return this.f68783r;
    }

    public boolean r() {
        return this.f68770e;
    }

    public boolean s() {
        return this.f68768c;
    }

    @z7.a
    public g t(@p0 g gVar) {
        return u(gVar, false);
    }

    public boolean v() {
        return this.f68771f == 1;
    }

    public boolean w() {
        return this.f68772g == 1;
    }

    @z7.a
    public g x(int i10) {
        this.f68769d = i10;
        this.f68770e = true;
        return this;
    }

    @z7.a
    public g y(boolean z10) {
        this.f68773h = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public g z(@p0 String str) {
        this.f68786u = str;
        return this;
    }
}

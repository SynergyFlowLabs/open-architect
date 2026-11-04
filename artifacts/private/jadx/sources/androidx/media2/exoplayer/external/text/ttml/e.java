package androidx.media2.exoplayer.external.text.ttml;

import android.text.Layout;
import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f56887o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f56888p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56889q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f56890r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f56891s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f56892t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f56893u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f56894v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f56895w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f56896x = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f56897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f56900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f56901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56902f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56903g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f56904h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f56905i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56906j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f56907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f56908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f56909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Layout.Alignment f56910n;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface b {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private e m(e ancestor, boolean chaining) {
        if (ancestor != null) {
            if (!this.f56899c && ancestor.f56899c) {
                r(ancestor.f56898b);
            }
            if (this.f56904h == -1) {
                this.f56904h = ancestor.f56904h;
            }
            if (this.f56905i == -1) {
                this.f56905i = ancestor.f56905i;
            }
            if (this.f56897a == null) {
                this.f56897a = ancestor.f56897a;
            }
            if (this.f56902f == -1) {
                this.f56902f = ancestor.f56902f;
            }
            if (this.f56903g == -1) {
                this.f56903g = ancestor.f56903g;
            }
            if (this.f56910n == null) {
                this.f56910n = ancestor.f56910n;
            }
            if (this.f56906j == -1) {
                this.f56906j = ancestor.f56906j;
                this.f56907k = ancestor.f56907k;
            }
            if (chaining && !this.f56901e && ancestor.f56901e) {
                p(ancestor.f56900d);
            }
        }
        return this;
    }

    public e a(e ancestor) {
        return m(ancestor, true);
    }

    public int b() {
        if (this.f56901e) {
            return this.f56900d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f56899c) {
            return this.f56898b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f56897a;
    }

    public float e() {
        return this.f56907k;
    }

    public int f() {
        return this.f56906j;
    }

    public String g() {
        return this.f56908l;
    }

    public int h() {
        int i10 = this.f56904h;
        if (i10 == -1 && this.f56905i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f56905i == 1 ? 2 : 0);
    }

    public Layout.Alignment i() {
        return this.f56910n;
    }

    public boolean j() {
        return this.f56901e;
    }

    public boolean k() {
        return this.f56899c;
    }

    public e l(e ancestor) {
        return m(ancestor, false);
    }

    public boolean n() {
        return this.f56902f == 1;
    }

    public boolean o() {
        return this.f56903g == 1;
    }

    public e p(int backgroundColor) {
        this.f56900d = backgroundColor;
        this.f56901e = true;
        return this;
    }

    public e q(boolean z10) {
        androidx.media2.exoplayer.external.util.a.i(this.f56909m == null);
        this.f56904h = z10 ? 1 : 0;
        return this;
    }

    public e r(int fontColor) {
        androidx.media2.exoplayer.external.util.a.i(this.f56909m == null);
        this.f56898b = fontColor;
        this.f56899c = true;
        return this;
    }

    public e s(String fontFamily) {
        androidx.media2.exoplayer.external.util.a.i(this.f56909m == null);
        this.f56897a = fontFamily;
        return this;
    }

    public e t(float fontSize) {
        this.f56907k = fontSize;
        return this;
    }

    public e u(int fontSizeUnit) {
        this.f56906j = fontSizeUnit;
        return this;
    }

    public e v(String id2) {
        this.f56908l = id2;
        return this;
    }

    public e w(boolean z10) {
        androidx.media2.exoplayer.external.util.a.i(this.f56909m == null);
        this.f56905i = z10 ? 1 : 0;
        return this;
    }

    public e x(boolean z10) {
        androidx.media2.exoplayer.external.util.a.i(this.f56909m == null);
        this.f56902f = z10 ? 1 : 0;
        return this;
    }

    public e y(Layout.Alignment textAlign) {
        this.f56910n = textAlign;
        return this;
    }

    public e z(boolean z10) {
        androidx.media2.exoplayer.external.util.a.i(this.f56909m == null);
        this.f56903g = z10 ? 1 : 0;
        return this;
    }
}

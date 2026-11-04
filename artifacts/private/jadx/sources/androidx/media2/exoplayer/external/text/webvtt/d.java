package androidx.media2.exoplayer.external.text.webvtt;

import android.text.Layout;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56950q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f56951r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f56952s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f56953t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f56954u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f56955v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f56956w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f56957x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f56958y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f56959z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f56960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f56961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f56962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f56963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f56964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f56966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f56967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f56968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f56970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f56971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f56972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f56973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f56974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f56975p;

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

    public d() {
        n();
    }

    private static int C(int currentScore, String target, String actual, int score) {
        if (!target.isEmpty() && currentScore != -1) {
            if (target.equals(actual)) {
                return currentScore + score;
            }
            return -1;
        }
        return currentScore;
    }

    public d A(Layout.Alignment textAlign) {
        this.f56975p = textAlign;
        return this;
    }

    public d B(boolean z10) {
        this.f56970k = z10 ? 1 : 0;
        return this;
    }

    public void a(d style) {
        if (style.f56966g) {
            q(style.f56965f);
        }
        int i10 = style.f56971l;
        if (i10 != -1) {
            this.f56971l = i10;
        }
        int i11 = style.f56972m;
        if (i11 != -1) {
            this.f56972m = i11;
        }
        String str = style.f56964e;
        if (str != null) {
            this.f56964e = str;
        }
        if (this.f56969j == -1) {
            this.f56969j = style.f56969j;
        }
        if (this.f56970k == -1) {
            this.f56970k = style.f56970k;
        }
        if (this.f56975p == null) {
            this.f56975p = style.f56975p;
        }
        if (this.f56973n == -1) {
            this.f56973n = style.f56973n;
            this.f56974o = style.f56974o;
        }
        if (style.f56968i) {
            o(style.f56967h);
        }
    }

    public int b() {
        if (this.f56968i) {
            return this.f56967h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int c() {
        if (this.f56966g) {
            return this.f56965f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f56964e;
    }

    public float e() {
        return this.f56974o;
    }

    public int f() {
        return this.f56973n;
    }

    public int g(String str, String str2, String[] strArr, String str3) {
        if (this.f56960a.isEmpty() && this.f56961b.isEmpty() && this.f56962c.isEmpty() && this.f56963d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int iC = C(C(C(0, this.f56960a, str, 1073741824), this.f56961b, str2, 2), this.f56963d, str3, 4);
        if (iC == -1 || !Arrays.asList(strArr).containsAll(this.f56962c)) {
            return 0;
        }
        return iC + (this.f56962c.size() * 4);
    }

    public int h() {
        int i10 = this.f56971l;
        if (i10 == -1 && this.f56972m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f56972m == 1 ? 2 : 0);
    }

    public Layout.Alignment i() {
        return this.f56975p;
    }

    public boolean j() {
        return this.f56968i;
    }

    public boolean k() {
        return this.f56966g;
    }

    public boolean l() {
        return this.f56969j == 1;
    }

    public boolean m() {
        return this.f56970k == 1;
    }

    public void n() {
        this.f56960a = "";
        this.f56961b = "";
        this.f56962c = Collections.EMPTY_LIST;
        this.f56963d = "";
        this.f56964e = null;
        this.f56966g = false;
        this.f56968i = false;
        this.f56969j = -1;
        this.f56970k = -1;
        this.f56971l = -1;
        this.f56972m = -1;
        this.f56973n = -1;
        this.f56975p = null;
    }

    public d o(int backgroundColor) {
        this.f56967h = backgroundColor;
        this.f56968i = true;
        return this;
    }

    public d p(boolean z10) {
        this.f56971l = z10 ? 1 : 0;
        return this;
    }

    public d q(int color) {
        this.f56965f = color;
        this.f56966g = true;
        return this;
    }

    public d r(String fontFamily) {
        this.f56964e = q0.V0(fontFamily);
        return this;
    }

    public d s(float fontSize) {
        this.f56974o = fontSize;
        return this;
    }

    public d t(short unit) {
        this.f56973n = unit;
        return this;
    }

    public d u(boolean z10) {
        this.f56972m = z10 ? 1 : 0;
        return this;
    }

    public d v(boolean z10) {
        this.f56969j = z10 ? 1 : 0;
        return this;
    }

    public void w(String[] targetClasses) {
        this.f56962c = Arrays.asList(targetClasses);
    }

    public void x(String targetId) {
        this.f56960a = targetId;
    }

    public void y(String targetTag) {
        this.f56961b = targetTag;
    }

    public void z(String targetVoice) {
        this.f56963d = targetVoice;
    }
}

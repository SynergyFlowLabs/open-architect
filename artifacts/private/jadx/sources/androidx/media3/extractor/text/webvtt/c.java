package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c {
    private static final int A = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f68885r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f68886s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f68887t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f68888u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f68889v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f68890w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f68891x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f68892y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f68893z = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    private int f68899f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68901h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f68908o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f68894a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f68895b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f68896c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f68897d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private String f68898e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68900g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f68902i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68903j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f68904k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68905l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68906m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68907n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68909p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f68910q = false;

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

    private static int C(int i10, String str, @p0 String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public void A(String str) {
        this.f68897d = str;
    }

    @z7.a
    public c B(boolean z10) {
        this.f68904k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f68902i) {
            return this.f68901h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f68910q;
    }

    public int c() {
        if (this.f68900g) {
            return this.f68899f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @p0
    public String d() {
        return this.f68898e;
    }

    public float e() {
        return this.f68908o;
    }

    public int f() {
        return this.f68907n;
    }

    public int g() {
        return this.f68909p;
    }

    public int h(@p0 String str, @p0 String str2, Set<String> set, @p0 String str3) {
        if (this.f68894a.isEmpty() && this.f68895b.isEmpty() && this.f68896c.isEmpty() && this.f68897d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iC = C(C(C(0, this.f68894a, str, 1073741824), this.f68895b, str2, 2), this.f68897d, str3, 4);
        if (iC == -1 || !set.containsAll(this.f68896c)) {
            return 0;
        }
        return iC + (this.f68896c.size() * 4);
    }

    public int i() {
        int i10 = this.f68905l;
        if (i10 == -1 && this.f68906m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f68906m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f68902i;
    }

    public boolean k() {
        return this.f68900g;
    }

    public boolean l() {
        return this.f68903j == 1;
    }

    public boolean m() {
        return this.f68904k == 1;
    }

    @z7.a
    public c n(int i10) {
        this.f68901h = i10;
        this.f68902i = true;
        return this;
    }

    @z7.a
    public c o(boolean z10) {
        this.f68905l = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public c p(boolean z10) {
        this.f68910q = z10;
        return this;
    }

    @z7.a
    public c q(int i10) {
        this.f68899f = i10;
        this.f68900g = true;
        return this;
    }

    @z7.a
    public c r(@p0 String str) {
        this.f68898e = str == null ? null : com.google.common.base.c.g(str);
        return this;
    }

    @z7.a
    public c s(float f10) {
        this.f68908o = f10;
        return this;
    }

    @z7.a
    public c t(int i10) {
        this.f68907n = i10;
        return this;
    }

    @z7.a
    public c u(boolean z10) {
        this.f68906m = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public c v(boolean z10) {
        this.f68903j = z10 ? 1 : 0;
        return this;
    }

    @z7.a
    public c w(int i10) {
        this.f68909p = i10;
        return this;
    }

    public void x(String[] strArr) {
        this.f68896c = new HashSet(Arrays.asList(strArr));
    }

    public void y(String str) {
        this.f68894a = str;
    }

    public void z(String str) {
        this.f68895b = str;
    }
}

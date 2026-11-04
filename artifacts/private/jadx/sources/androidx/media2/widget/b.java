package androidx.media2.widget;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f59588l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f59589m = 16777215;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f59590n = new b(-1, -16777216, 0, -16777216, 255, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f59591o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f59592p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f59593q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f59594r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f59595s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f59596t = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f59602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f59603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f59604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f59605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f59606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Typeface f59607k;

    @w0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Typeface a(CaptioningManager.CaptionStyle captionStyle) {
            return captionStyle.getTypeface();
        }
    }

    @w0(19)
    b(CaptioningManager.CaptionStyle captionStyle) {
        this(captionStyle.foregroundColor, captionStyle.backgroundColor, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.windowColor, a.a(captionStyle));
    }

    static boolean c(int i10) {
        return (i10 >>> 24) != 0 || (i10 & 16776960) == 0;
    }

    @p0
    public Typeface a() {
        return this.f59607k;
    }

    boolean b() {
        return this.f59603g;
    }

    boolean d() {
        return this.f59605i;
    }

    boolean e() {
        return this.f59604h;
    }

    boolean f() {
        return this.f59602f;
    }

    boolean g() {
        return this.f59606j;
    }

    b(int i10, int i11, int i12, int i13, int i14, @p0 Typeface typeface) {
        boolean zC = c(i10);
        this.f59602f = zC;
        boolean zC2 = c(i11);
        this.f59603g = zC2;
        boolean z10 = i12 != -1;
        this.f59604h = z10;
        boolean zC3 = c(i13);
        this.f59605i = zC3;
        boolean zC4 = c(i14);
        this.f59606j = zC4;
        this.f59597a = zC ? i10 : -1;
        this.f59598b = zC2 ? i11 : -16777216;
        this.f59599c = z10 ? i12 : 0;
        this.f59600d = zC3 ? i13 : -16777216;
        if (!zC4) {
            i14 = 255;
        }
        this.f59601e = i14;
        this.f59607k = typeface;
    }
}

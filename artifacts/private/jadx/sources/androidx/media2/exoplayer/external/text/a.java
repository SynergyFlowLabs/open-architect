package androidx.media2.exoplayer.external.text;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56524g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f56525h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f56526i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f56527j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f56528k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f56529l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f56530m = new a(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final Typeface f56536f;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.a$a, reason: collision with other inner class name */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0521a {
    }

    public a(int foregroundColor, int backgroundColor, int windowColor, int edgeType, int edgeColor, @p0 Typeface typeface) {
        this.f56531a = foregroundColor;
        this.f56532b = backgroundColor;
        this.f56533c = windowColor;
        this.f56534d = edgeType;
        this.f56535e = edgeColor;
        this.f56536f = typeface;
    }

    @e.b(19)
    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return q0.f57626a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @e.b(19)
    private static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @e.b(21)
    private static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f56530m.f56531a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f56530m.f56532b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f56530m.f56533c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f56530m.f56534d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f56530m.f56535e, captionStyle.getTypeface());
    }
}

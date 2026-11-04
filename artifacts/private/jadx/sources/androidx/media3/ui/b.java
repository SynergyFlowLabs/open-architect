package androidx.media3.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f69767g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f69768h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f69769i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f69770j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f69771k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f69772l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f69773m = new b(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f69777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f69778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final Typeface f69779f;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b(int i10, int i11, int i12, int i13, int i14, @androidx.annotation.p0 Typeface typeface) {
        this.f69774a = i10;
        this.f69775b = i11;
        this.f69776c = i12;
        this.f69777d = i13;
        this.f69778e = i14;
        this.f69779f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f69773m.f69774a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f69773m.f69775b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f69773m.f69776c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f69773m.f69777d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f69773m.f69778e, captionStyle.getTypeface());
    }
}

package androidx.media2.exoplayer.external.text;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b {
    public static final int H1 = 2;
    public static final int X = 2;
    public static final int Y = 0;
    public static final int Z = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f56537o = new b("");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f56538p0 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f56539p1 = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f56540s = Float.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f56541t = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f56542v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f56543w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final CharSequence f56544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final Layout.Alignment f56545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final Bitmap f56546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f56547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f56550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f56552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f56553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f56554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f56555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f56556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f56557n;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.b$b, reason: collision with other inner class name */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0522b {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public b(Bitmap bitmap, float horizontalPosition, int horizontalPositionAnchor, float verticalPosition, int verticalPositionAnchor, float width, float height) {
        this(null, null, bitmap, verticalPosition, 0, verticalPositionAnchor, horizontalPosition, horizontalPositionAnchor, Integer.MIN_VALUE, Float.MIN_VALUE, width, height, false, -16777216);
    }

    public b(CharSequence text) {
        this(text, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public b(CharSequence text, @p0 Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size) {
        this(text, textAlignment, line, lineType, lineAnchor, position, positionAnchor, size, false, -16777216);
    }

    public b(CharSequence text, Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, int textSizeType, float textSize) {
        this(text, textAlignment, null, line, lineType, lineAnchor, position, positionAnchor, textSizeType, textSize, size, Float.MIN_VALUE, false, -16777216);
    }

    public b(CharSequence text, @p0 Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, boolean windowColorSet, int windowColor) {
        this(text, textAlignment, null, line, lineType, lineAnchor, position, positionAnchor, Integer.MIN_VALUE, Float.MIN_VALUE, size, Float.MIN_VALUE, windowColorSet, windowColor);
    }

    private b(@p0 CharSequence text, @p0 Layout.Alignment textAlignment, @p0 Bitmap bitmap, float line, int lineType, int lineAnchor, float position, int positionAnchor, int textSizeType, float textSize, float size, float bitmapHeight, boolean windowColorSet, int windowColor) {
        this.f56544a = text;
        this.f56545b = textAlignment;
        this.f56546c = bitmap;
        this.f56547d = line;
        this.f56548e = lineType;
        this.f56549f = lineAnchor;
        this.f56550g = position;
        this.f56551h = positionAnchor;
        this.f56552i = size;
        this.f56553j = bitmapHeight;
        this.f56554k = windowColorSet;
        this.f56555l = windowColor;
        this.f56556m = textSizeType;
        this.f56557n = textSize;
    }
}

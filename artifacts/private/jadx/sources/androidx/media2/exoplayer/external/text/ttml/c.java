package androidx.media2.exoplayer.external.text.ttml;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f56883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f56884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f56886i;

    public c(String id2) {
        this(id2, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public c(String id2, float position, float line, int lineType, int lineAnchor, float width, float height, int textSizeType, float textSize) {
        this.f56878a = id2;
        this.f56879b = position;
        this.f56880c = line;
        this.f56881d = lineType;
        this.f56882e = lineAnchor;
        this.f56883f = width;
        this.f56884g = height;
        this.f56885h = textSizeType;
        this.f56886i = textSize;
    }
}

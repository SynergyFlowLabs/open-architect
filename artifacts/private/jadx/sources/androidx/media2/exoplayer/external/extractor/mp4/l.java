package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f54512l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f54513m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f54518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Format f54519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final long[] f54521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final long[] f54522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final m[] f54524k;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public l(int id2, int type, long timescale, long movieTimescale, long durationUs, Format format, int sampleTransformation, @p0 m[] sampleDescriptionEncryptionBoxes, int nalUnitLengthFieldLength, @p0 long[] editListDurations, @p0 long[] editListMediaTimes) {
        this.f54514a = id2;
        this.f54515b = type;
        this.f54516c = timescale;
        this.f54517d = movieTimescale;
        this.f54518e = durationUs;
        this.f54519f = format;
        this.f54520g = sampleTransformation;
        this.f54524k = sampleDescriptionEncryptionBoxes;
        this.f54523j = nalUnitLengthFieldLength;
        this.f54521h = editListDurations;
        this.f54522i = editListMediaTimes;
    }

    public l a(Format format) {
        return new l(this.f54514a, this.f54515b, this.f54516c, this.f54517d, this.f54518e, format, this.f54520g, this.f54524k, this.f54523j, this.f54521h, this.f54522i);
    }

    @p0
    public m b(int sampleDescriptionIndex) {
        m[] mVarArr = this.f54524k;
        if (mVarArr == null) {
            return null;
        }
        return mVarArr[sampleDescriptionIndex];
    }
}

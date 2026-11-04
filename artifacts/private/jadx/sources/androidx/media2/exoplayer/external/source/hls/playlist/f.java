package androidx.media2.exoplayer.external.source.hls.playlist;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.offline.StreamKey;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f extends g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56132q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f56133r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f56134s = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f56136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f56137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f56138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f56140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f56142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f56143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f56144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    public final DrmInitData f56145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<b> f56146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f56147p;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b implements Comparable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f56148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final b f56149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f56150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f56151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f56153f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        public final DrmInitData f56154g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        public final String f56155h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        public final String f56156i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f56157j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f56158k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f56159l;

        public b(String uri, long byterangeOffset, long byterangeLength, @p0 String fullSegmentEncryptionKeyUri, @p0 String encryptionIV) {
            this(uri, null, "", 0L, -1, -9223372036854775807L, null, fullSegmentEncryptionKeyUri, encryptionIV, byterangeOffset, byterangeLength, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long relativeStartTimeUs) {
            if (this.f56153f > relativeStartTimeUs.longValue()) {
                return 1;
            }
            return this.f56153f < relativeStartTimeUs.longValue() ? -1 : 0;
        }

        public b(String url, @p0 b initializationSegment, String title, long durationUs, int relativeDiscontinuitySequence, long relativeStartTimeUs, @p0 DrmInitData drmInitData, @p0 String fullSegmentEncryptionKeyUri, @p0 String encryptionIV, long byterangeOffset, long byterangeLength, boolean hasGapTag) {
            this.f56148a = url;
            this.f56149b = initializationSegment;
            this.f56151d = title;
            this.f56150c = durationUs;
            this.f56152e = relativeDiscontinuitySequence;
            this.f56153f = relativeStartTimeUs;
            this.f56154g = drmInitData;
            this.f56155h = fullSegmentEncryptionKeyUri;
            this.f56156i = encryptionIV;
            this.f56157j = byterangeOffset;
            this.f56158k = byterangeLength;
            this.f56159l = hasGapTag;
        }
    }

    public f(int playlistType, String baseUri, List<String> tags, long startOffsetUs, long startTimeUs, boolean hasDiscontinuitySequence, int discontinuitySequence, long mediaSequence, int version, long targetDurationUs, boolean hasIndependentSegments, boolean hasEndTag, boolean hasProgramDateTime, @p0 DrmInitData protectionSchemes, List<b> segments) {
        super(baseUri, tags, hasIndependentSegments);
        this.f56135d = playlistType;
        this.f56137f = startTimeUs;
        this.f56138g = hasDiscontinuitySequence;
        this.f56139h = discontinuitySequence;
        this.f56140i = mediaSequence;
        this.f56141j = version;
        this.f56142k = targetDurationUs;
        this.f56143l = hasEndTag;
        this.f56144m = hasProgramDateTime;
        this.f56145n = protectionSchemes;
        this.f56146o = Collections.unmodifiableList(segments);
        if (segments.isEmpty()) {
            this.f56147p = 0L;
        } else {
            b bVar = segments.get(segments.size() - 1);
            this.f56147p = bVar.f56153f + bVar.f56150c;
        }
        if (startOffsetUs == -9223372036854775807L) {
            startOffsetUs = -9223372036854775807L;
        } else if (startOffsetUs < 0) {
            startOffsetUs += this.f56147p;
        }
        this.f56136e = startOffsetUs;
    }

    @Override // androidx.media2.exoplayer.external.offline.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List<StreamKey> streamKeys) {
        return this;
    }

    public f c(long startTimeUs, int discontinuitySequence) {
        return new f(this.f56135d, this.f56160a, this.f56161b, this.f56136e, startTimeUs, true, discontinuitySequence, this.f56140i, this.f56141j, this.f56142k, this.f56162c, this.f56143l, this.f56144m, this.f56145n, this.f56146o);
    }

    public f d() {
        return this.f56143l ? this : new f(this.f56135d, this.f56160a, this.f56161b, this.f56136e, this.f56137f, this.f56138g, this.f56139h, this.f56140i, this.f56141j, this.f56142k, this.f56162c, true, this.f56144m, this.f56145n, this.f56146o);
    }

    public long e() {
        return this.f56137f + this.f56147p;
    }

    public boolean f(f other) {
        if (other != null) {
            long j10 = this.f56140i;
            long j11 = other.f56140i;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f56146o.size();
                int size2 = other.f56146o.size();
                if (size <= size2 && (size != size2 || !this.f56143l || other.f56143l)) {
                    return false;
                }
            }
        }
        return true;
    }
}

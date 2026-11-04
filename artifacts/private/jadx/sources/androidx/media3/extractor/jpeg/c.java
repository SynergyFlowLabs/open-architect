package androidx.media3.extractor.jpeg;

import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f67409b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f67411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f67412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f67413d;

        public a(String str, String str2, long j10, long j11) {
            this.f67410a = str;
            this.f67411b = str2;
            this.f67412c = j10;
            this.f67413d = j11;
        }
    }

    public c(long j10, List<a> list) {
        this.f67408a = j10;
        this.f67409b = list;
    }

    @p0
    public androidx.media3.extractor.metadata.mp4.a a(long j10) {
        long j11;
        if (this.f67409b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f67409b.size() - 1; size >= 0; size--) {
            a aVar = this.f67409b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f67410a) | z10;
            if (size == 0) {
                j12 -= aVar.f67413d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f67412c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new androidx.media3.extractor.metadata.mp4.a(j13, j14, this.f67408a, j15, j16);
    }
}

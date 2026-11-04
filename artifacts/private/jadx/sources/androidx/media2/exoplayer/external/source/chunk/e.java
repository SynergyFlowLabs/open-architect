package androidx.media2.exoplayer.external.source.chunk;

import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e implements androidx.media2.exoplayer.external.extractor.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.extractor.i f55782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Format f55784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f55785d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f55787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f55788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f55789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Format[] f55790i;

    private static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f55791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f55792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Format f55793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.extractor.h f55794d = new androidx.media2.exoplayer.external.extractor.h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Format f55795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s f55796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f55797g;

        public a(int id2, int type, Format manifestFormat) {
            this.f55791a = id2;
            this.f55792b = type;
            this.f55793c = manifestFormat;
        }

        @Override // androidx.media2.exoplayer.external.extractor.s
        public int a(androidx.media2.exoplayer.external.extractor.j input, int length, boolean allowEndOfInput) throws InterruptedException, IOException {
            return this.f55796f.a(input, length, allowEndOfInput);
        }

        @Override // androidx.media2.exoplayer.external.extractor.s
        public void b(long timeUs, int flags, int size, int offset, s.a cryptoData) {
            long j10 = this.f55797g;
            if (j10 != -9223372036854775807L && timeUs >= j10) {
                this.f55796f = this.f55794d;
            }
            this.f55796f.b(timeUs, flags, size, offset, cryptoData);
        }

        @Override // androidx.media2.exoplayer.external.extractor.s
        public void c(Format format) {
            Format format2 = this.f55793c;
            if (format2 != null) {
                format = format.i(format2);
            }
            this.f55795e = format;
            this.f55796f.c(format);
        }

        @Override // androidx.media2.exoplayer.external.extractor.s
        public void d(x data, int length) {
            this.f55796f.d(data, length);
        }

        public void e(b trackOutputProvider, long endTimeUs) {
            if (trackOutputProvider == null) {
                this.f55796f = this.f55794d;
                return;
            }
            this.f55797g = endTimeUs;
            s sVarA = trackOutputProvider.a(this.f55791a, this.f55792b);
            this.f55796f = sVarA;
            Format format = this.f55795e;
            if (format != null) {
                sVarA.c(format);
            }
        }
    }

    public interface b {
        s a(int id2, int type);
    }

    public e(androidx.media2.exoplayer.external.extractor.i extractor, int primaryTrackType, Format primaryTrackManifestFormat) {
        this.f55782a = extractor;
        this.f55783b = primaryTrackType;
        this.f55784c = primaryTrackManifestFormat;
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public s a(int id2, int type) {
        boolean z10;
        a aVar = this.f55785d.get(id2);
        if (aVar == null) {
            if (this.f55790i == null) {
                z10 = true;
                int i10 = 3 | 1;
            } else {
                z10 = false;
            }
            androidx.media2.exoplayer.external.util.a.i(z10);
            aVar = new a(id2, type, type == this.f55783b ? this.f55784c : null);
            aVar.e(this.f55787f, this.f55788g);
            this.f55785d.put(id2, aVar);
        }
        return aVar;
    }

    public Format[] b() {
        return this.f55790i;
    }

    public q c() {
        return this.f55789h;
    }

    public void d(@p0 b trackOutputProvider, long startTimeUs, long endTimeUs) {
        this.f55787f = trackOutputProvider;
        this.f55788g = endTimeUs;
        if (!this.f55786e) {
            this.f55782a.c(this);
            if (startTimeUs != -9223372036854775807L) {
                this.f55782a.a(0L, startTimeUs);
            }
            this.f55786e = true;
            return;
        }
        androidx.media2.exoplayer.external.extractor.i iVar = this.f55782a;
        if (startTimeUs == -9223372036854775807L) {
            startTimeUs = 0;
        }
        iVar.a(0L, startTimeUs);
        for (int i10 = 0; i10 < this.f55785d.size(); i10++) {
            this.f55785d.valueAt(i10).e(trackOutputProvider, endTimeUs);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public void l() {
        Format[] formatArr = new Format[this.f55785d.size()];
        for (int i10 = 0; i10 < this.f55785d.size(); i10++) {
            formatArr[i10] = this.f55785d.valueAt(i10).f55795e;
        }
        this.f55790i = formatArr;
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public void q(q seekMap) {
        this.f55789h = seekMap;
    }
}

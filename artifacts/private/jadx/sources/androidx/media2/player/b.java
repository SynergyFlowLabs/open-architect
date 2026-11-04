package androidx.media2.player;

import android.net.Uri;
import androidx.annotation.p0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class b extends androidx.media2.exoplayer.external.upstream.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.common.c f58176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Uri f58177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f58178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f58179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f58180j;

    class a implements androidx.media2.exoplayer.external.upstream.l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media2.common.c f58181a;

        a(androidx.media2.common.c cVar) {
            this.f58181a = cVar;
        }

        @Override // androidx.media2.exoplayer.external.upstream.l.a
        public androidx.media2.exoplayer.external.upstream.l a() {
            return new b(this.f58181a);
        }
    }

    b(androidx.media2.common.c cVar) {
        super(false);
        this.f58176f = (androidx.media2.common.c) androidx.core.util.t.l(cVar);
    }

    static androidx.media2.exoplayer.external.upstream.l.a k(androidx.media2.common.c cVar) {
        return new a(cVar);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(androidx.media2.exoplayer.external.upstream.o oVar) throws IOException {
        this.f58177g = oVar.f57370a;
        this.f58178h = oVar.f57375f;
        g(oVar);
        long jA = this.f58176f.a();
        long j10 = oVar.f57376g;
        if (j10 != -1) {
            this.f58179i = j10;
        } else if (jA != -1) {
            this.f58179i = jA - this.f58178h;
        } else {
            this.f58179i = -1L;
        }
        this.f58180j = true;
        i(oVar);
        return this.f58179i;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() {
        this.f58177g = null;
        if (this.f58180j) {
            this.f58180j = false;
            e();
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Uri getUri() {
        return this.f58177g;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f58179i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            i11 = (int) Math.min(j10, i11);
        }
        int iB = this.f58176f.b(this.f58178h, bArr, i10, i11);
        if (iB < 0) {
            if (this.f58179i == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j11 = iB;
        this.f58178h += j11;
        long j12 = this.f58179i;
        if (j12 != -1) {
            this.f58179i = j12 - j11;
        }
        d(iB);
        return iB;
    }
}

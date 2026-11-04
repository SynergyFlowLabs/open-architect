package androidx.media2.player;

import android.net.Uri;
import androidx.annotation.p0;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
class g extends androidx.media2.exoplayer.external.upstream.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FileDescriptor f58325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f58326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f58327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f58328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Uri f58329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private InputStream f58330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f58331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f58332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f58333n;

    class a implements androidx.media2.exoplayer.external.upstream.l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FileDescriptor f58334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f58335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f58336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f58337d;

        a(FileDescriptor fileDescriptor, long j10, long j11, Object obj) {
            this.f58334a = fileDescriptor;
            this.f58335b = j10;
            this.f58336c = j11;
            this.f58337d = obj;
        }

        @Override // androidx.media2.exoplayer.external.upstream.l.a
        public androidx.media2.exoplayer.external.upstream.l a() {
            return new g(this.f58334a, this.f58335b, this.f58336c, this.f58337d);
        }
    }

    g(FileDescriptor fileDescriptor, long j10, long j11, Object obj) {
        super(false);
        this.f58325f = fileDescriptor;
        this.f58326g = j10;
        this.f58327h = j11;
        this.f58328i = obj;
    }

    static androidx.media2.exoplayer.external.upstream.l.a k(FileDescriptor fileDescriptor, long j10, long j11, Object obj) {
        return new a(fileDescriptor, j10, j11, obj);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(androidx.media2.exoplayer.external.upstream.o oVar) {
        this.f58329j = oVar.f57370a;
        g(oVar);
        this.f58330k = new FileInputStream(this.f58325f);
        long j10 = oVar.f57376g;
        if (j10 != -1) {
            this.f58331l = j10;
        } else {
            long j11 = this.f58327h;
            if (j11 != -1) {
                this.f58331l = j11 - oVar.f57375f;
            } else {
                this.f58331l = -1L;
            }
        }
        this.f58333n = this.f58326g + oVar.f57375f;
        this.f58332m = true;
        i(oVar);
        return this.f58331l;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        this.f58329j = null;
        try {
            InputStream inputStream = this.f58330k;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f58330k = null;
            if (this.f58332m) {
                this.f58332m = false;
            }
        } finally {
            this.f58330k = null;
            if (this.f58332m) {
                this.f58332m = false;
                e();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Uri getUri() {
        return (Uri) androidx.core.util.t.l(this.f58329j);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f58331l;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            i11 = (int) Math.min(j10, i11);
        }
        synchronized (this.f58328i) {
            try {
                h.h(this.f58325f, this.f58333n);
                int i12 = ((InputStream) androidx.core.util.t.l(this.f58330k)).read(bArr, i10, i11);
                if (i12 == -1) {
                    if (this.f58331l == -1) {
                        return -1;
                    }
                    throw new EOFException();
                }
                long j11 = i12;
                this.f58333n += j11;
                long j12 = this.f58331l;
                if (j12 != -1) {
                    this.f58331l = j12 - j11;
                }
                d(i12);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package coil.fetch;

import android.media.MediaDataSource;
import androidx.annotation.w0;
import coil.decode.a0;
import coil.decode.v;
import coil.request.n;
import java.io.IOException;
import okio.b1;
import okio.e1;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(23)
public final class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final MediaDataSource f87378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87379b;

    public static final class a implements h.a<MediaDataSource> {
        @Override // coil.fetch.h.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull MediaDataSource mediaDataSource, @NotNull n nVar, @NotNull coil.j jVar) {
            return new k(mediaDataSource, nVar);
        }
    }

    public static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final MediaDataSource f87380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f87381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f87382c;

        public b(@NotNull MediaDataSource mediaDataSource) {
            this.f87380a = mediaDataSource;
            this.f87381b = mediaDataSource.getSize();
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f87380a.close();
        }

        @Override // okio.b1
        public long read(@NotNull okio.l lVar, long j10) throws IOException {
            long j11 = this.f87382c;
            long j12 = this.f87381b;
            if (j11 >= j12) {
                return -1L;
            }
            int iMin = (int) Math.min(j10, j12 - j11);
            byte[] bArr = new byte[iMin];
            int at = this.f87380a.readAt(this.f87382c, bArr, 0, iMin);
            long j13 = at;
            this.f87382c += j13;
            lVar.write(bArr, 0, at);
            return j13;
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return e1.f334887f;
        }
    }

    @w0(23)
    public static final class c extends v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final MediaDataSource f87383a;

        public c(@NotNull MediaDataSource mediaDataSource) {
            this.f87383a = mediaDataSource;
        }

        @NotNull
        public final MediaDataSource a() {
            return this.f87383a;
        }
    }

    public k(@NotNull MediaDataSource mediaDataSource, @NotNull n nVar) {
        this.f87378a = mediaDataSource;
        this.f87379b = nVar;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        return new m(a0.j(l0.e(new b(this.f87378a)), this.f87379b.g(), new c(this.f87378a)), null, coil.decode.e.DISK);
    }
}

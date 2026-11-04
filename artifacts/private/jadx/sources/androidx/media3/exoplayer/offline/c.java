package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class c implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends x>> f64399c = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.cache.c.d f64400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f64401b;

    @Deprecated
    public c(androidx.media3.datasource.cache.c.d dVar) {
        this(dVar, new b());
    }

    private x b(DownloadRequest downloadRequest, int i10) {
        Constructor<? extends x> constructor = f64399c.get(i10);
        if (constructor == null) {
            throw new IllegalStateException("Module missing for content type " + i10);
        }
        try {
            return constructor.newInstance(new k0.c().M(downloadRequest.f64352b).I(downloadRequest.f64354d).l(downloadRequest.f64356f).a(), this.f64400a, this.f64401b);
        } catch (Exception e10) {
            throw new IllegalStateException("Failed to instantiate downloader for content type " + i10, e10);
        }
    }

    private static SparseArray<Constructor<? extends x>> c() {
        SparseArray<Constructor<? extends x>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, d(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, d(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, d(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends x> d(Class<?> cls) {
        try {
            return cls.asSubclass(x.class).getConstructor(k0.class, androidx.media3.datasource.cache.c.d.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    @Override // androidx.media3.exoplayer.offline.y
    public x a(DownloadRequest downloadRequest) {
        int iA1 = k1.a1(downloadRequest.f64352b, downloadRequest.f64353c);
        if (iA1 == 0 || iA1 == 1 || iA1 == 2) {
            return b(downloadRequest, iA1);
        }
        if (iA1 == 4) {
            return new c0(new k0.c().M(downloadRequest.f64352b).l(downloadRequest.f64356f).a(), this.f64400a, this.f64401b);
        }
        throw new IllegalArgumentException("Unsupported type: " + iA1);
    }

    public c(androidx.media3.datasource.cache.c.d dVar, Executor executor) {
        this.f64400a = (androidx.media3.datasource.cache.c.d) androidx.media3.common.util.a.g(dVar);
        this.f64401b = (Executor) androidx.media3.common.util.a.g(executor);
    }
}

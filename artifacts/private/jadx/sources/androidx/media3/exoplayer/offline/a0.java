package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.offline.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a0<T extends z<T>> implements androidx.media3.exoplayer.upstream.q.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.q.a<? extends T> f64396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final List<StreamKey> f64397b;

    public a0(androidx.media3.exoplayer.upstream.q.a<? extends T> aVar, @p0 List<StreamKey> list) {
        this.f64396a = aVar;
        this.f64397b = list;
    }

    @Override // androidx.media3.exoplayer.upstream.q.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T tA = this.f64396a.a(uri, inputStream);
        List<StreamKey> list = this.f64397b;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f64397b);
    }
}

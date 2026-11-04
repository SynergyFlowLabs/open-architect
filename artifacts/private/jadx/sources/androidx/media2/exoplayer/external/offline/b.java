package androidx.media2.exoplayer.external.offline;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.offline.a;
import androidx.media2.exoplayer.external.upstream.i0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b<T extends a<T>> implements i0.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0.a<? extends T> f55610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final List<StreamKey> f55611b;

    public b(i0.a<? extends T> parser, @p0 List<StreamKey> streamKeys) {
        this.f55610a = parser;
        this.f55611b = streamKeys;
    }

    @Override // androidx.media2.exoplayer.external.upstream.i0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T tA = this.f55610a.a(uri, inputStream);
        List<StreamKey> list = this.f55611b;
        if (list != null && !list.isEmpty()) {
            return (T) tA.a(this.f55611b);
        }
        return tA;
    }
}

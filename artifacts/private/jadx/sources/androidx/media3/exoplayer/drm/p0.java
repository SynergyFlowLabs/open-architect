package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.b1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class p0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.datasource.x f63710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f63711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f63712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63713d;

    public p0(androidx.media3.datasource.x xVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f63710a = xVar;
        this.f63711b = uri;
        this.f63712c = map;
        this.f63713d = j10;
    }
}

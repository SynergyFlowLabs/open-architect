package androidx.media2.exoplayer.external.source.hls.playlist;

import androidx.annotation.b1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class g implements androidx.media2.exoplayer.external.offline.a<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f56161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56162c;

    protected g(String baseUri, List<String> tags, boolean hasIndependentSegments) {
        this.f56160a = baseUri;
        this.f56161b = Collections.unmodifiableList(tags);
        this.f56162c = hasIndependentSegments;
    }
}

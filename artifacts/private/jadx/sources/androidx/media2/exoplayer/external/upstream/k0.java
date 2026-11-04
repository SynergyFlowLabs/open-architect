package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k0 implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l.a f57340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.a0 f57341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f57342c;

    public k0(l.a upstreamFactory, androidx.media2.exoplayer.external.util.a0 priorityTaskManager, int priority) {
        this.f57340a = upstreamFactory;
        this.f57341b = priorityTaskManager;
        this.f57342c = priority;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return new j0(this.f57340a.a(), this.f57341b, this.f57342c);
    }
}

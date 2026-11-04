package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f55768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f55769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55770d;

    public b(long fromIndex, long toIndex) {
        this.f55768b = fromIndex;
        this.f55769c = toIndex;
        reset();
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.m
    public boolean a() {
        return this.f55770d > this.f55769c;
    }

    protected final void e() {
        long j10 = this.f55770d;
        if (j10 < this.f55768b || j10 > this.f55769c) {
            throw new NoSuchElementException();
        }
    }

    protected final long f() {
        return this.f55770d;
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.m
    public boolean next() {
        this.f55770d++;
        return !a();
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.m
    public void reset() {
        this.f55770d = this.f55768b - 1;
    }
}

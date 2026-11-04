package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.b1;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f64853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f64854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f64855d;

    public b(long j10, long j11) {
        this.f64853b = j10;
        this.f64854c = j11;
        reset();
    }

    @Override // androidx.media3.exoplayer.source.chunk.n
    public boolean a() {
        return this.f64855d > this.f64854c;
    }

    protected final void e() {
        long j10 = this.f64855d;
        if (j10 < this.f64853b || j10 > this.f64854c) {
            throw new NoSuchElementException();
        }
    }

    protected final long f() {
        return this.f64855d;
    }

    @Override // androidx.media3.exoplayer.source.chunk.n
    public boolean next() {
        this.f64855d++;
        return !a();
    }

    @Override // androidx.media3.exoplayer.source.chunk.n
    public void reset() {
        this.f64855d = this.f64853b - 1;
    }
}

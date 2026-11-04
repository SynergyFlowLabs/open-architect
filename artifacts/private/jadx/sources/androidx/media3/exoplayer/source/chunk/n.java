package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.b1;
import androidx.media3.datasource.x;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f64933a = new a();

    class a implements n {
        a() {
        }

        @Override // androidx.media3.exoplayer.source.chunk.n
        public boolean a() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.chunk.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.n
        public long c() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.n
        public x d() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.n
        public boolean next() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.chunk.n
        public void reset() {
        }
    }

    boolean a();

    long b();

    long c();

    x d();

    boolean next();

    void reset();
}

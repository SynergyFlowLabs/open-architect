package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f55841a = new a();

    class a implements m {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public boolean a() {
            return true;
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public long c() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public androidx.media2.exoplayer.external.upstream.o d() {
            throw new NoSuchElementException();
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public boolean next() {
            return false;
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public void reset() {
        }
    }

    boolean a();

    long b();

    long c();

    androidx.media2.exoplayer.external.upstream.o d();

    boolean next();

    void reset();
}

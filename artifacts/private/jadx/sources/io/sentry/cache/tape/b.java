package io.sentry.cache.tape;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class b<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f305220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f305221b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c.a<T> f305222c;

    private static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    private final class C2222b implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<byte[]> f305223a;

        C2222b(Iterator<byte[]> it) {
            this.f305223a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f305223a.hasNext();
        }

        @Override // java.util.Iterator
        @Nullable
        public T next() {
            try {
                return b.this.f305222c.b(this.f305223a.next());
            } catch (IOException e10) {
                throw ((Error) d.r(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f305223a.remove();
        }
    }

    b(d dVar, c.a<T> aVar) {
        this.f305220a = dVar;
        this.f305222c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void R() throws IOException {
        this.f305220a.u1();
    }

    @Override // io.sentry.cache.tape.c
    public void T(int i10) throws IOException {
        this.f305220a.B1(i10);
    }

    @Override // io.sentry.cache.tape.c
    public void c(T t10) throws IOException {
        this.f305221b.reset();
        this.f305222c.a(t10, this.f305221b);
        this.f305220a.P0(this.f305221b.a(), 0, this.f305221b.size());
    }

    @Override // io.sentry.cache.tape.c
    public void clear() throws IOException {
        this.f305220a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f305220a.close();
    }

    @Override // io.sentry.cache.tape.c
    public boolean isEmpty() {
        return this.f305220a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C2222b(this.f305220a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    @Nullable
    public T peek() throws IOException {
        byte[] bArrT = this.f305220a.T();
        if (bArrT == null) {
            return null;
        }
        return this.f305222c.b(bArrT);
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f305220a.size();
    }

    @Override // io.sentry.cache.tape.c
    @NotNull
    public d t() {
        return this.f305220a;
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f305220a + AbstractJsonLexerKt.END_OBJ;
    }
}

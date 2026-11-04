package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class a<T> extends c<T> {

    private static final class b<T> implements Iterator<T> {
        private b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    a() {
    }

    @Override // io.sentry.cache.tape.c
    public void T(int i10) throws IOException {
    }

    @Override // io.sentry.cache.tape.c
    public void c(T t10) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new b();
    }

    @Override // io.sentry.cache.tape.c
    @Nullable
    public T peek() throws IOException {
        return null;
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return 0;
    }

    @Override // io.sentry.cache.tape.c
    @Nullable
    public d t() {
        return null;
    }
}

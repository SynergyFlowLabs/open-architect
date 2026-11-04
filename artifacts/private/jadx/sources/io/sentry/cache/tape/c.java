package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public abstract class c<T> implements Iterable<T>, Closeable {

    public interface a<T> {
        void a(T t10, OutputStream outputStream) throws IOException;

        @Nullable
        T b(byte[] bArr) throws IOException;
    }

    public static <T> c<T> m(d dVar, a<T> aVar) {
        return new b(dVar, aVar);
    }

    public static <T> c<T> r() {
        return new io.sentry.cache.tape.a();
    }

    public List<T> N(int i10) throws IOException {
        int iMin = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void R() throws IOException {
        T(1);
    }

    public abstract void T(int i10) throws IOException;

    public abstract void c(T t10) throws IOException;

    public void clear() throws IOException {
        T(size());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public List<T> l() throws IOException {
        return N(size());
    }

    @Nullable
    public abstract T peek() throws IOException;

    public abstract int size();

    @Nullable
    public abstract d t();
}

package m8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void b(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void d(Class<T> cls, b<? super T> bVar);
}

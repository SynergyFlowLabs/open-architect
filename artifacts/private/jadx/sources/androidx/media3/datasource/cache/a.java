package androidx.media3.datasource.cache;

import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f62301a = -1;

    /* JADX INFO: renamed from: androidx.media3.datasource.cache.a$a, reason: collision with other inner class name */
    public static class C0574a extends IOException {
        public C0574a(String str) {
            super(str);
        }

        public C0574a(Throwable th2) {
            super(th2);
        }

        public C0574a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public interface b {
        void d(a aVar, i iVar, i iVar2);

        void e(a aVar, i iVar);

        void f(a aVar, i iVar);
    }

    long a();

    m b(String str);

    @m1
    void c(i iVar);

    NavigableSet<i> d(String str, b bVar);

    @m1
    i e(String str, long j10, long j11) throws InterruptedException, C0574a;

    @m1
    void f(String str);

    boolean g(String str, long j10, long j11);

    @m1
    File h(String str, long j10, long j11) throws C0574a;

    long i(String str, long j10, long j11);

    void j(String str, b bVar);

    @m1
    @p0
    i k(String str, long j10, long j11) throws C0574a;

    long l(String str, long j10, long j11);

    long m();

    void n(i iVar);

    @m1
    void o(File file, long j10) throws C0574a;

    @m1
    void p(String str, n nVar) throws C0574a;

    NavigableSet<i> q(String str);

    Set<String> r();

    @m1
    void release();
}

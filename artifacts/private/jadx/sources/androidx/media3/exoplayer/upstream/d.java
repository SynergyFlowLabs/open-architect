package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.datasource.r1;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface d {

    public interface a {

        /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.d$a$a, reason: collision with other inner class name */
        public static final class C0595a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0596a> f65845a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.d$a$a$a, reason: collision with other inner class name */
            static final class C0596a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f65846a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f65847b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f65848c;

                public C0596a(Handler handler, a aVar) {
                    this.f65846a = handler;
                    this.f65847b = aVar;
                }

                public void d() {
                    this.f65848c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                androidx.media3.common.util.a.g(handler);
                androidx.media3.common.util.a.g(aVar);
                d(aVar);
                this.f65845a.add(new C0596a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C0596a c0596a : this.f65845a) {
                    if (c0596a.f65848c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0596a.f65846a.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0596a.f65847b.l(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0596a c0596a : this.f65845a) {
                    if (c0596a.f65847b == aVar) {
                        c0596a.d();
                        this.f65845a.remove(c0596a);
                    }
                }
            }
        }

        void l(int i10, long j10, long j11);
    }

    void a(a aVar);

    long b();

    default long c() {
        return -9223372036854775807L;
    }

    void d(Handler handler, a aVar);

    @p0
    r1 e();
}

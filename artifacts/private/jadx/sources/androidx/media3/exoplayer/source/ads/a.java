package androidx.media3.exoplayer.source.ads;

import androidx.annotation.p0;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.z0;
import androidx.media3.common.z3;
import androidx.media3.datasource.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.source.ads.a$a, reason: collision with other inner class name */
    @b1
    public interface InterfaceC0590a {
        default void a() {
        }

        default void b() {
        }

        default void c(androidx.media3.common.b bVar) {
        }

        default void d(e.a aVar, x xVar) {
        }
    }

    public interface b {
        @p0
        a a(k0.b bVar);
    }

    @b1
    void a(int... iArr);

    @b1
    void b(e eVar, x xVar, Object obj, androidx.media3.common.c cVar, InterfaceC0590a interfaceC0590a);

    @b1
    void c(e eVar, InterfaceC0590a interfaceC0590a);

    @b1
    void d(e eVar, int i10, int i11);

    void e(@p0 z0 z0Var);

    @b1
    default void f(e eVar, z3 z3Var) {
    }

    @b1
    void g(e eVar, int i10, int i11, IOException iOException);

    void release();
}

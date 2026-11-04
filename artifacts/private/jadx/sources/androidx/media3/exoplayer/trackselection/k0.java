package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import androidx.annotation.p0;
import androidx.media3.common.e4;
import androidx.media3.common.util.b1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.source.h2;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.z4;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private b f65713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private androidx.media3.exoplayer.upstream.d f65714b;

    public interface a {
        k0 a(Context context);
    }

    public interface b {
        default void a(z4 z4Var) {
        }

        void b();
    }

    protected final androidx.media3.exoplayer.upstream.d b() {
        return (androidx.media3.exoplayer.upstream.d) androidx.media3.common.util.a.k(this.f65714b);
    }

    public e4 c() {
        return e4.F;
    }

    @p0
    public a5.f d() {
        return null;
    }

    @androidx.annotation.i
    public void e(b bVar, androidx.media3.exoplayer.upstream.d dVar) {
        this.f65713a = bVar;
        this.f65714b = dVar;
    }

    protected final void f() {
        b bVar = this.f65713a;
        if (bVar != null) {
            bVar.b();
        }
    }

    protected final void g(z4 z4Var) {
        b bVar = this.f65713a;
        if (bVar != null) {
            bVar.a(z4Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(@p0 Object obj);

    @androidx.annotation.i
    public void j() {
        this.f65713a = null;
        this.f65714b = null;
    }

    public abstract l0 k(a5[] a5VarArr, h2 h2Var, t0.b bVar, z3 z3Var) throws s0;

    public void l(androidx.media3.common.d dVar) {
    }

    public void m(e4 e4Var) {
    }
}

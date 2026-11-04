package coil.network;

import coil.util.l;
import java.io.IOException;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import okhttp3.u;
import okhttp3.x;
import okio.m;
import okio.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f87580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f87581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f87582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f87583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u f87585f;

    public c(@NotNull n nVar) {
        j0 j0Var = j0.NONE;
        this.f87580a = g0.b(j0Var, new Function0() { // from class: coil.network.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.c(this.f87578a);
            }
        });
        this.f87581b = g0.b(j0Var, new Function0() { // from class: coil.network.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.d(this.f87579a);
            }
        });
        this.f87582c = Long.parseLong(nVar.lb());
        this.f87583d = Long.parseLong(nVar.lb());
        this.f87584e = Integer.parseInt(nVar.lb()) > 0;
        int i10 = Integer.parseInt(nVar.lb());
        u.a aVar = new u.a();
        for (int i11 = 0; i11 < i10; i11++) {
            l.d(aVar, nVar.lb());
        }
        this.f87585f = aVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.d c(c cVar) {
        return okhttp3.d.f333769n.c(cVar.f87585f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x d(c cVar) {
        String strK = cVar.f87585f.k("Content-Type");
        if (strK != null) {
            return x.f334808e.d(strK);
        }
        return null;
    }

    @NotNull
    public final okhttp3.d e() {
        return (okhttp3.d) this.f87580a.getValue();
    }

    @Nullable
    public final x f() {
        return (x) this.f87581b.getValue();
    }

    public final long g() {
        return this.f87583d;
    }

    @NotNull
    public final u h() {
        return this.f87585f;
    }

    public final long i() {
        return this.f87582c;
    }

    public final boolean j() {
        return this.f87584e;
    }

    public final void k(@NotNull m mVar) throws IOException {
        mVar.h5(this.f87582c).writeByte(10);
        mVar.h5(this.f87583d).writeByte(10);
        mVar.h5(this.f87584e ? 1L : 0L).writeByte(10);
        mVar.h5(this.f87585f.size()).writeByte(10);
        int size = this.f87585f.size();
        for (int i10 = 0; i10 < size; i10++) {
            mVar.pa(this.f87585f.n(i10)).pa(": ").pa(this.f87585f.w(i10)).writeByte(10);
        }
    }

    public c(@NotNull okhttp3.f0 f0Var) {
        j0 j0Var = j0.NONE;
        this.f87580a = g0.b(j0Var, new Function0() { // from class: coil.network.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.c(this.f87578a);
            }
        });
        this.f87581b = g0.b(j0Var, new Function0() { // from class: coil.network.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.d(this.f87579a);
            }
        });
        this.f87582c = f0Var.y0();
        this.f87583d = f0Var.w0();
        this.f87584e = f0Var.I() != null;
        this.f87585f = f0Var.Y();
    }
}

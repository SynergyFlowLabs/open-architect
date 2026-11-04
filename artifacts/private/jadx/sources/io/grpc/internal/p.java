package io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
final class p extends io.grpc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f289673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n3 f289674b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f289675a;

        static {
            int[] iArr = new int[io.grpc.h.a.values().length];
            f289675a = iArr;
            try {
                iArr[io.grpc.h.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289675a[io.grpc.h.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f289675a[io.grpc.h.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    p(q qVar, n3 n3Var) {
        this.f289673a = (q) com.google.common.base.j0.F(qVar, "tracer");
        this.f289674b = (n3) com.google.common.base.j0.F(n3Var, "time");
    }

    private boolean c(io.grpc.h.a aVar) {
        return aVar != io.grpc.h.a.DEBUG && this.f289673a.c();
    }

    static void d(io.grpc.c1 c1Var, io.grpc.h.a aVar, String str) {
        Level levelF = f(aVar);
        if (q.f289696f.isLoggable(levelF)) {
            q.d(c1Var, levelF, str);
        }
    }

    static void e(io.grpc.c1 c1Var, io.grpc.h.a aVar, String str, Object... objArr) {
        Level levelF = f(aVar);
        if (q.f289696f.isLoggable(levelF)) {
            q.d(c1Var, levelF, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(io.grpc.h.a aVar) {
        int i10 = a.f289675a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return Level.FINE;
        }
        return i10 != 3 ? Level.FINEST : Level.FINER;
    }

    private static io.grpc.v0.c.b.EnumC1995b g(io.grpc.h.a aVar) {
        int i10 = a.f289675a[aVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? io.grpc.v0.c.b.EnumC1995b.CT_INFO : io.grpc.v0.c.b.EnumC1995b.CT_WARNING;
        }
        return io.grpc.v0.c.b.EnumC1995b.CT_ERROR;
    }

    private void h(io.grpc.h.a aVar, String str) {
        if (aVar == io.grpc.h.a.DEBUG) {
            return;
        }
        this.f289673a.f(new io.grpc.v0.c.b.a().c(str).d(g(aVar)).f(this.f289674b.a()).a());
    }

    @Override // io.grpc.h
    public void a(io.grpc.h.a aVar, String str) {
        d(this.f289673a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // io.grpc.h
    public void b(io.grpc.h.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || q.f289696f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}

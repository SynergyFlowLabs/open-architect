package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Logger f289696f = Logger.getLogger(io.grpc.h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f289697a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.c1 f289698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private final Collection<io.grpc.v0.c.b> f289699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f289700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @gj.a(io.sentry.protocol.z.b.f306551r)
    private int f289701e;

    class a extends ArrayDeque<io.grpc.v0.c.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f289702a;

        a(int i10) {
            this.f289702a = i10;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        @gj.a(io.sentry.protocol.z.b.f306551r)
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(io.grpc.v0.c.b bVar) {
            if (size() == this.f289702a) {
                removeFirst();
            }
            q.a(q.this);
            return super.add(bVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f289704a;

        static {
            int[] iArr = new int[io.grpc.v0.c.b.EnumC1995b.values().length];
            f289704a = iArr;
            try {
                iArr[io.grpc.v0.c.b.EnumC1995b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289704a[io.grpc.v0.c.b.EnumC1995b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    q(io.grpc.c1 c1Var, int i10, long j10, String str) {
        com.google.common.base.j0.F(str, "description");
        this.f289698b = (io.grpc.c1) com.google.common.base.j0.F(c1Var, "logId");
        if (i10 > 0) {
            this.f289699c = new a(i10);
        } else {
            this.f289699c = null;
        }
        this.f289700d = j10;
        e(new io.grpc.v0.c.b.a().c(str + " created").d(io.grpc.v0.c.b.EnumC1995b.CT_INFO).f(j10).a());
    }

    static /* synthetic */ int a(q qVar) {
        int i10 = qVar.f289701e;
        qVar.f289701e = i10 + 1;
        return i10;
    }

    static void d(io.grpc.c1 c1Var, Level level, String str) {
        Logger logger = f289696f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c1Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    io.grpc.c1 b() {
        return this.f289698b;
    }

    boolean c() {
        boolean z10;
        synchronized (this.f289697a) {
            z10 = this.f289699c != null;
        }
        return z10;
    }

    void e(io.grpc.v0.c.b bVar) {
        Level level;
        int i10 = b.f289704a[bVar.f291205b.ordinal()];
        if (i10 != 1) {
            level = i10 != 2 ? Level.FINEST : Level.FINER;
        } else {
            level = Level.FINE;
        }
        f(bVar);
        d(this.f289698b, level, bVar.f291204a);
    }

    void f(io.grpc.v0.c.b bVar) {
        synchronized (this.f289697a) {
            try {
                Collection<io.grpc.v0.c.b> collection = this.f289699c;
                if (collection != null) {
                    collection.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void g(io.grpc.v0.b.a aVar) {
        synchronized (this.f289697a) {
            try {
                if (this.f289699c == null) {
                    return;
                }
                aVar.e(new io.grpc.v0.c.a().d(this.f289701e).b(this.f289700d).c(new ArrayList(this.f289699c)).a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

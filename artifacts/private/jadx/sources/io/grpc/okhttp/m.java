package io.grpc.okhttp;

import io.sentry.o7;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f290728c = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Logger f290729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Level f290730b;

    enum a {
        INBOUND,
        OUTBOUND
    }

    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f290741a;

        b(int i10) {
            this.f290741a = i10;
        }

        public int k() {
            return this.f290741a;
        }
    }

    m(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean a() {
        return this.f290729a.isLoggable(this.f290730b);
    }

    private static String m(io.grpc.okhttp.internal.framed.i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.r(bVar.k())) {
                enumMap.put(bVar, Integer.valueOf(iVar.c(bVar.k())));
            }
        }
        return enumMap.toString();
    }

    private static String n(okio.l lVar) {
        if (lVar.size() <= 64) {
            return lVar.Q0().N();
        }
        return lVar.R0((int) Math.min(lVar.size(), 64L)).N() + "...";
    }

    void b(a aVar, int i10, okio.l lVar, int i11, boolean z10) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + n(lVar));
        }
    }

    void c(a aVar, int i10, io.grpc.okhttp.internal.framed.a aVar2, okio.o oVar) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + aVar2 + " length=" + oVar.v0() + " bytes=" + n(new okio.l().U7(oVar)));
        }
    }

    void d(a aVar, int i10, List<io.grpc.okhttp.internal.framed.d> list, boolean z10) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    void e(a aVar, long j10) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " PING: ack=false bytes=" + j10);
        }
    }

    void f(a aVar, long j10) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " PING: ack=true bytes=" + j10);
        }
    }

    public void g(a aVar, int i10, int i11, int i12, boolean z10) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " PRIORITY: streamId=" + i10 + " streamDependency=" + i11 + " weight=" + i12 + " exclusive=" + z10);
        }
    }

    void h(a aVar, int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    void i(a aVar, int i10, io.grpc.okhttp.internal.framed.a aVar2) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar2);
        }
    }

    void j(a aVar, io.grpc.okhttp.internal.framed.i iVar) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " SETTINGS: ack=false settings=" + m(iVar));
        }
    }

    void k(a aVar) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " SETTINGS: ack=true");
        }
    }

    void l(a aVar, int i10, long j10) {
        if (a()) {
            this.f290729a.log(this.f290730b, aVar + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }

    @com.google.common.annotations.e
    m(Level level, Logger logger) {
        this.f290730b = (Level) com.google.common.base.j0.F(level, "level");
        this.f290729a = (Logger) com.google.common.base.j0.F(logger, o7.b.f305962c);
    }
}

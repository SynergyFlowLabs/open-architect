package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.b1;
import okio.e1;
import okio.l0;
import okio.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class z implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f334837i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final p0 f334838j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.n f334839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f334840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final okio.o f334841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final okio.o f334842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f334843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f334844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f334845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private c f334846h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p0 a() {
            return z.f334838j;
        }

        private a() {
        }
    }

    public static final class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final u f334847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final okio.n f334848b;

        public b(@NotNull u headers, @NotNull okio.n body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f334847a = headers;
            this.f334848b = body;
        }

        @oj.i(name = "body")
        @NotNull
        public final okio.n a() {
            return this.f334848b;
        }

        @oj.i(name = "headers")
        @NotNull
        public final u b() {
            return this.f334847a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f334848b.close();
        }
    }

    @SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    private final class c implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final e1 f334849a = new e1();

        public c() {
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(z.this.f334846h, this)) {
                z.this.f334846h = null;
            }
        }

        @Override // okio.b1
        public long read(@NotNull okio.l sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (!Intrinsics.areEqual(z.this.f334846h, this)) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            e1 e1VarTimeout = z.this.f334839a.timeout();
            e1 e1Var = this.f334849a;
            z zVar = z.this;
            long jL = e1VarTimeout.l();
            e1VarTimeout.k(e1.f334886e.a(e1Var.l(), e1VarTimeout.l()), TimeUnit.NANOSECONDS);
            if (!e1VarTimeout.h()) {
                if (e1Var.h()) {
                    e1VarTimeout.g(e1Var.f());
                }
                try {
                    long jG = zVar.g(j10);
                    return jG == 0 ? -1L : zVar.f334839a.read(sink, jG);
                } finally {
                    e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                    if (e1Var.h()) {
                        e1VarTimeout.c();
                    }
                }
            }
            long jF = e1VarTimeout.f();
            if (e1Var.h()) {
                e1VarTimeout.g(Math.min(e1VarTimeout.f(), e1Var.f()));
            }
            try {
                long jG2 = zVar.g(j10);
                return jG2 == 0 ? -1L : zVar.f334839a.read(sink, jG2);
            } finally {
                e1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                if (e1Var.h()) {
                    e1VarTimeout.g(jF);
                }
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return this.f334849a;
        }
    }

    static {
        p0.a aVar = p0.f335056c;
        okio.o.a aVar2 = okio.o.f335046d;
        f334838j = aVar.d(aVar2.l("\r\n"), aVar2.l("--"), aVar2.l(" "), aVar2.l("\t"));
    }

    public z(@NotNull okio.n source, @NotNull String boundary) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.f334839a = source;
        this.f334840b = boundary;
        this.f334841c = new okio.l().pa("--").pa(boundary).r7();
        this.f334842d = new okio.l().pa("\r\n--").pa(boundary).r7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g(long j10) throws IOException {
        this.f334839a.q1(this.f334842d.v0());
        long jX2 = this.f334839a.n().x2(this.f334842d);
        return jX2 == -1 ? Math.min(j10, (this.f334839a.n().size() - ((long) this.f334842d.v0())) + 1) : Math.min(j10, jX2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f334844f) {
            return;
        }
        this.f334844f = true;
        this.f334846h = null;
        this.f334839a.close();
    }

    @oj.i(name = "boundary")
    @NotNull
    public final String f() {
        return this.f334840b;
    }

    @Nullable
    public final b h() throws IOException {
        if (this.f334844f) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (this.f334845g) {
            return null;
        }
        if (this.f334843e == 0 && this.f334839a.u3(0L, this.f334841c)) {
            this.f334839a.skip(this.f334841c.v0());
        } else {
            while (true) {
                long jG = g(PlaybackStateCompat.f9665p2);
                if (jG == 0) {
                    break;
                }
                this.f334839a.skip(jG);
            }
            this.f334839a.skip(this.f334842d.v0());
        }
        boolean z10 = false;
        while (true) {
            int iXf = this.f334839a.xf(f334838j);
            if (iXf == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            int i10 = 6 << 1;
            if (iXf == 0) {
                this.f334843e++;
                u uVarB = new okhttp3.internal.http1.a(this.f334839a).b();
                c cVar = new c();
                this.f334846h = cVar;
                return new b(uVarB, l0.e(cVar));
            }
            if (iXf == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f334843e == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.f334845g = true;
                return null;
            }
            if (iXf == 2 || iXf == 3) {
                z10 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(@NotNull g0 response) throws IOException {
        String strI;
        Intrinsics.checkNotNullParameter(response, "response");
        okio.n nVarSource = response.source();
        x xVarContentType = response.contentType();
        if (xVarContentType == null || (strI = xVarContentType.i("boundary")) == null) {
            throw new ProtocolException("expected the Content-Type to have a boundary parameter");
        }
        this(nVarSource, strI);
    }
}

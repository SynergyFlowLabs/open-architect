package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import okio.b1;
import okio.e1;
import okio.l;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f334024k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f334025l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f334026m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @f
    @NotNull
    public static final o f334027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @f
    @NotNull
    public static final o f334028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f334029p = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private RandomAccessFile f334030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private b1 f334031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f334032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final o f334033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f334034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Thread f334035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final l f334036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f334037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final l f334038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f334039j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a(@NotNull File file, @NotNull b1 upstream, @NotNull o metadata, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            b bVar = new b(randomAccessFile, upstream, 0L, metadata, j10, null);
            randomAccessFile.setLength(0L);
            bVar.u(b.f334028o, -1L, -1L);
            return bVar;
        }

        @NotNull
        public final b b(@NotNull File file) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            okhttp3.internal.cache2.a aVar = new okhttp3.internal.cache2.a(channel);
            l lVar = new l();
            aVar.a(0L, lVar, 32L);
            o oVar = b.f334027n;
            if (!Intrinsics.areEqual(lVar.E5(oVar.v0()), oVar)) {
                throw new IOException("unreadable cache file");
            }
            long j10 = lVar.readLong();
            long j11 = lVar.readLong();
            l lVar2 = new l();
            aVar.a(32 + j10, lVar2, j11);
            return new b(randomAccessFile, null, j10, lVar2.r7(), 0L, null);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache2.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class C2357b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final e1 f334040a = new e1();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private okhttp3.internal.cache2.a f334041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f334042c;

        public C2357b() {
            RandomAccessFile randomAccessFileF = b.this.f();
            Intrinsics.checkNotNull(randomAccessFileF);
            FileChannel channel = randomAccessFileF.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            this.f334041b = new okhttp3.internal.cache2.a(channel);
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f334041b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f334041b = null;
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    bVar.q(bVar.g() - 1);
                    if (bVar.g() == 0) {
                        RandomAccessFile randomAccessFileF = bVar.f();
                        bVar.p(null);
                        randomAccessFile = randomAccessFileF;
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (randomAccessFile != null) {
                jk.f.o(randomAccessFile);
            }
        }

        @Override // okio.b1
        public long read(@NotNull l sink, long j10) throws IOException {
            char c10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f334041b == null) {
                throw new IllegalStateException("Check failed.");
            }
            b bVar = b.this;
            synchronized (bVar) {
                while (true) {
                    try {
                        if (this.f334042c != bVar.j()) {
                            long j11 = bVar.j() - bVar.c().size();
                            if (this.f334042c < j11) {
                                c10 = 2;
                                break;
                            }
                            long jMin = Math.min(j10, bVar.j() - this.f334042c);
                            bVar.c().o(sink, this.f334042c - j11, jMin);
                            this.f334042c += jMin;
                            return jMin;
                        }
                        if (!bVar.e()) {
                            if (bVar.k() == null) {
                                bVar.t(Thread.currentThread());
                                c10 = 1;
                                break;
                            }
                            this.f334040a.m(bVar);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c10 == 2) {
                    long jMin2 = Math.min(j10, b.this.j() - this.f334042c);
                    okhttp3.internal.cache2.a aVar = this.f334041b;
                    Intrinsics.checkNotNull(aVar);
                    aVar.a(this.f334042c + 32, sink, jMin2);
                    this.f334042c += jMin2;
                    return jMin2;
                }
                try {
                    b1 b1VarH = b.this.h();
                    Intrinsics.checkNotNull(b1VarH);
                    long j12 = b1VarH.read(b.this.i(), b.this.d());
                    if (j12 == -1) {
                        b bVar2 = b.this;
                        bVar2.b(bVar2.j());
                        b bVar3 = b.this;
                        synchronized (bVar3) {
                            bVar3.t(null);
                            Intrinsics.checkNotNull(bVar3, "null cannot be cast to non-null type java.lang.Object");
                            bVar3.notifyAll();
                            Unit unit = Unit.f312394a;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j12, j10);
                    b.this.i().o(sink, 0L, jMin3);
                    this.f334042c += jMin3;
                    okhttp3.internal.cache2.a aVar2 = this.f334041b;
                    Intrinsics.checkNotNull(aVar2);
                    aVar2.b(b.this.j() + 32, b.this.i().clone(), j12);
                    b bVar4 = b.this;
                    synchronized (bVar4) {
                        try {
                            bVar4.c().Ga(bVar4.i(), j12);
                            if (bVar4.c().size() > bVar4.d()) {
                                bVar4.c().skip(bVar4.c().size() - bVar4.d());
                            }
                            bVar4.s(bVar4.j() + j12);
                            Unit unit2 = Unit.f312394a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    b bVar5 = b.this;
                    synchronized (bVar5) {
                        bVar5.t(null);
                        Intrinsics.checkNotNull(bVar5, "null cannot be cast to non-null type java.lang.Object");
                        bVar5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th4) {
                    b bVar6 = b.this;
                    synchronized (bVar6) {
                        bVar6.t(null);
                        Intrinsics.checkNotNull(bVar6, "null cannot be cast to non-null type java.lang.Object");
                        bVar6.notifyAll();
                        Unit unit3 = Unit.f312394a;
                        throw th4;
                    }
                }
            }
        }

        @Override // okio.b1
        @NotNull
        public e1 timeout() {
            return this.f334040a;
        }
    }

    static {
        o.a aVar = o.f335046d;
        f334027n = aVar.l("OkHttp cache v1\n");
        f334028o = aVar.l("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ b(RandomAccessFile randomAccessFile, b1 b1Var, long j10, o oVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, b1Var, j10, oVar, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(o oVar, long j10, long j11) throws IOException {
        l lVar = new l();
        lVar.U7(oVar);
        lVar.writeLong(j10);
        lVar.writeLong(j11);
        if (lVar.size() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.f334030a;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new okhttp3.internal.cache2.a(channel).b(0L, lVar, 32L);
    }

    private final void v(long j10) throws IOException {
        l lVar = new l();
        lVar.U7(this.f334033d);
        RandomAccessFile randomAccessFile = this.f334030a;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new okhttp3.internal.cache2.a(channel).b(32 + j10, lVar, this.f334033d.v0());
    }

    public final void b(long j10) throws IOException {
        v(j10);
        RandomAccessFile randomAccessFile = this.f334030a;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        u(f334027n, j10, this.f334033d.v0());
        RandomAccessFile randomAccessFile2 = this.f334030a;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            try {
                this.f334037h = true;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b1 b1Var = this.f334031b;
        if (b1Var != null) {
            jk.f.o(b1Var);
        }
        this.f334031b = null;
    }

    @NotNull
    public final l c() {
        return this.f334038i;
    }

    public final long d() {
        return this.f334034e;
    }

    public final boolean e() {
        return this.f334037h;
    }

    @Nullable
    public final RandomAccessFile f() {
        return this.f334030a;
    }

    public final int g() {
        return this.f334039j;
    }

    @Nullable
    public final b1 h() {
        return this.f334031b;
    }

    @NotNull
    public final l i() {
        return this.f334036g;
    }

    public final long j() {
        return this.f334032c;
    }

    @Nullable
    public final Thread k() {
        return this.f334035f;
    }

    public final boolean l() {
        return this.f334030a == null;
    }

    @NotNull
    public final o m() {
        return this.f334033d;
    }

    @Nullable
    public final b1 n() {
        synchronized (this) {
            try {
                if (this.f334030a == null) {
                    return null;
                }
                this.f334039j++;
                return new C2357b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(boolean z10) {
        this.f334037h = z10;
    }

    public final void p(@Nullable RandomAccessFile randomAccessFile) {
        this.f334030a = randomAccessFile;
    }

    public final void q(int i10) {
        this.f334039j = i10;
    }

    public final void r(@Nullable b1 b1Var) {
        this.f334031b = b1Var;
    }

    public final void s(long j10) {
        this.f334032c = j10;
    }

    public final void t(@Nullable Thread thread) {
        this.f334035f = thread;
    }

    private b(RandomAccessFile randomAccessFile, b1 b1Var, long j10, o oVar, long j11) {
        this.f334030a = randomAccessFile;
        this.f334031b = b1Var;
        this.f334032c = j10;
        this.f334033d = oVar;
        this.f334034e = j11;
        this.f334036g = new l();
        this.f334037h = this.f334031b == null;
        this.f334038i = new l();
    }
}

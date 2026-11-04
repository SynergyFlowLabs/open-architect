package okhttp3.internal.ws;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.l;
import okio.n;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f334657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f334658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f334659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f334660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f334661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f334662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f334663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f334664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f334665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f334666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f334667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final l f334668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final l f334669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private c f334670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final byte[] f334671o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final l.a f334672s;

    public interface a {
        void a(@NotNull o oVar);

        void b(@NotNull o oVar);

        void c(int i10, @NotNull String str);

        void d(@NotNull o oVar) throws IOException;

        void e(@NotNull String str) throws IOException;
    }

    public h(boolean z10, @NotNull n source, @NotNull a frameCallback, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f334657a = z10;
        this.f334658b = source;
        this.f334659c = frameCallback;
        this.f334660d = z11;
        this.f334661e = z12;
        this.f334668l = new l();
        this.f334669m = new l();
        l.a aVar = null;
        this.f334671o = z10 ? null : new byte[4];
        if (!z10) {
            aVar = new l.a();
        }
        this.f334672s = aVar;
    }

    private final void c() throws IOException {
        short s10;
        String strO7;
        long j10 = this.f334664h;
        if (j10 > 0) {
            this.f334658b.H9(this.f334668l, j10);
            if (!this.f334657a) {
                l lVar = this.f334668l;
                l.a aVar = this.f334672s;
                Intrinsics.checkNotNull(aVar);
                lVar.g0(aVar);
                this.f334672s.e(0L);
                g gVar = g.f334634a;
                l.a aVar2 = this.f334672s;
                byte[] bArr = this.f334671o;
                Intrinsics.checkNotNull(bArr);
                gVar.c(aVar2, bArr);
                this.f334672s.close();
            }
        }
        switch (this.f334663g) {
            case 8:
                long size = this.f334668l.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.f334668l.readShort();
                    strO7 = this.f334668l.O7();
                    String strB = g.f334634a.b(s10);
                    if (strB != null) {
                        throw new ProtocolException(strB);
                    }
                } else {
                    s10 = 1005;
                    strO7 = "";
                }
                this.f334659c.c(s10, strO7);
                this.f334662f = true;
                return;
            case 9:
                this.f334659c.a(this.f334668l.r7());
                return;
            case 10:
                this.f334659c.b(this.f334668l.r7());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + jk.f.d0(this.f334663g));
        }
    }

    private final void d() throws IOException {
        boolean z10;
        if (this.f334662f) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        long jL = this.f334658b.timeout().l();
        this.f334658b.timeout().d();
        try {
            int iD = jk.f.d(this.f334658b.readByte(), 255);
            this.f334658b.timeout().k(jL, TimeUnit.NANOSECONDS);
            int i10 = iD & 15;
            this.f334663g = i10;
            boolean z11 = (iD & 128) != 0;
            this.f334665i = z11;
            boolean z12 = (iD & 8) != 0;
            this.f334666j = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iD & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f334660d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f334667k = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iD & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iD & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iD2 = jk.f.d(this.f334658b.readByte(), 255);
            boolean z14 = (iD2 & 128) != 0;
            if (z14 == this.f334657a) {
                throw new ProtocolException(this.f334657a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iD2 & 127;
            this.f334664h = j10;
            if (j10 == 126) {
                this.f334664h = jk.f.e(this.f334658b.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = this.f334658b.readLong();
                this.f334664h = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + jk.f.e0(this.f334664h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f334666j && this.f334664h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                n nVar = this.f334658b;
                byte[] bArr = this.f334671o;
                Intrinsics.checkNotNull(bArr);
                nVar.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.f334658b.timeout().k(jL, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    private final void e() throws IOException {
        while (!this.f334662f) {
            long j10 = this.f334664h;
            if (j10 > 0) {
                this.f334658b.H9(this.f334669m, j10);
                if (!this.f334657a) {
                    l lVar = this.f334669m;
                    l.a aVar = this.f334672s;
                    Intrinsics.checkNotNull(aVar);
                    lVar.g0(aVar);
                    this.f334672s.e(this.f334669m.size() - this.f334664h);
                    g gVar = g.f334634a;
                    l.a aVar2 = this.f334672s;
                    byte[] bArr = this.f334671o;
                    Intrinsics.checkNotNull(bArr);
                    gVar.c(aVar2, bArr);
                    this.f334672s.close();
                }
            }
            if (this.f334665i) {
                return;
            }
            g();
            if (this.f334663g != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + jk.f.d0(this.f334663g));
            }
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    private final void f() throws IOException {
        int i10 = this.f334663g;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + jk.f.d0(i10));
        }
        e();
        if (this.f334667k) {
            c cVar = this.f334670n;
            if (cVar == null) {
                cVar = new c(this.f334661e);
                this.f334670n = cVar;
            }
            cVar.a(this.f334669m);
        }
        if (i10 == 1) {
            this.f334659c.e(this.f334669m.O7());
        } else {
            this.f334659c.d(this.f334669m.r7());
        }
    }

    private final void g() throws IOException {
        while (!this.f334662f) {
            d();
            if (!this.f334666j) {
                return;
            } else {
                c();
            }
        }
    }

    @NotNull
    public final n a() {
        return this.f334658b;
    }

    public final void b() throws IOException {
        d();
        if (this.f334666j) {
            c();
        } else {
            f();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.f334670n;
        if (cVar != null) {
            cVar.close();
        }
    }
}

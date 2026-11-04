package okhttp3.internal.ws;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.l;
import okio.m;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f334673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f334674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Random f334675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f334676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f334677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f334678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final l f334679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final l f334680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f334681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private a f334682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final byte[] f334683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final l.a f334684l;

    public i(boolean z10, @NotNull m sink, @NotNull Random random, boolean z11, boolean z12, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f334673a = z10;
        this.f334674b = sink;
        this.f334675c = random;
        this.f334676d = z11;
        this.f334677e = z12;
        this.f334678f = j10;
        this.f334679g = new l();
        this.f334680h = sink.n();
        this.f334683k = z10 ? new byte[4] : null;
        this.f334684l = z10 ? new l.a() : null;
    }

    private final void d(int i10, o oVar) throws IOException {
        if (this.f334681i) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        int iV0 = oVar.v0();
        if (iV0 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f334680h.writeByte(i10 | 128);
        if (this.f334673a) {
            this.f334680h.writeByte(iV0 | 128);
            Random random = this.f334675c;
            byte[] bArr = this.f334683k;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f334680h.write(this.f334683k);
            if (iV0 > 0) {
                long size = this.f334680h.size();
                this.f334680h.U7(oVar);
                l lVar = this.f334680h;
                l.a aVar = this.f334684l;
                Intrinsics.checkNotNull(aVar);
                lVar.g0(aVar);
                this.f334684l.e(size);
                g.f334634a.c(this.f334684l, this.f334683k);
                this.f334684l.close();
            }
        } else {
            this.f334680h.writeByte(iV0);
            this.f334680h.U7(oVar);
        }
        this.f334674b.flush();
    }

    @NotNull
    public final Random a() {
        return this.f334675c;
    }

    @NotNull
    public final m b() {
        return this.f334674b;
    }

    public final void c(int i10, @Nullable o oVar) throws IOException {
        o oVarR7 = o.f335048f;
        if (i10 != 0 || oVar != null) {
            if (i10 != 0) {
                g.f334634a.d(i10);
            }
            l lVar = new l();
            lVar.writeShort(i10);
            if (oVar != null) {
                lVar.U7(oVar);
            }
            oVarR7 = lVar.r7();
        }
        try {
            d(8, oVarR7);
            this.f334681i = true;
        } catch (Throwable th2) {
            this.f334681i = true;
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f334682j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e(int i10, @NotNull o data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f334681i) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        this.f334679g.U7(data);
        int i11 = i10 | 128;
        if (this.f334676d && data.v0() >= this.f334678f) {
            a aVar = this.f334682j;
            if (aVar == null) {
                aVar = new a(this.f334677e);
                this.f334682j = aVar;
            }
            aVar.a(this.f334679g);
            i11 = i10 | 192;
        }
        long size = this.f334679g.size();
        this.f334680h.writeByte(i11);
        int i12 = this.f334673a ? 128 : 0;
        if (size <= 125) {
            this.f334680h.writeByte(i12 | ((int) size));
        } else if (size <= g.f334653t) {
            this.f334680h.writeByte(i12 | g.f334652s);
            this.f334680h.writeShort((int) size);
        } else {
            this.f334680h.writeByte(i12 | 127);
            this.f334680h.writeLong(size);
        }
        if (this.f334673a) {
            Random random = this.f334675c;
            byte[] bArr = this.f334683k;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f334680h.write(this.f334683k);
            if (size > 0) {
                l lVar = this.f334679g;
                l.a aVar2 = this.f334684l;
                Intrinsics.checkNotNull(aVar2);
                lVar.g0(aVar2);
                this.f334684l.e(0L);
                g.f334634a.c(this.f334684l, this.f334683k);
                this.f334684l.close();
            }
        }
        this.f334680h.Ga(this.f334679g, size);
        this.f334674b.f1();
    }

    public final void f(@NotNull o payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        d(9, payload);
    }

    public final void g(@NotNull o payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        d(10, payload);
    }
}

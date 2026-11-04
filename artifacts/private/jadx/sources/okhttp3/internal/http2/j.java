package okhttp3.internal.http2;

import androidx.collection.g3;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f334467g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f334468h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.m f334469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final okio.l f334471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f334472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f334473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final d.b f334474f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(@NotNull okio.m sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f334469a = sink;
        this.f334470b = z10;
        okio.l lVar = new okio.l();
        this.f334471c = lVar;
        this.f334472d = 16384;
        this.f334474f = new d.b(0, false, lVar, 3, null);
    }

    private final void j(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.f334472d, j10);
            j10 -= jMin;
            c(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f334469a.Ga(this.f334471c, jMin);
        }
    }

    public final synchronized void A2() throws IOException {
        try {
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (this.f334470b) {
                Logger logger = f334468h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(jk.f.y(">> CONNECTION " + e.f334307b.N(), new Object[0]));
                }
                this.f334469a.U7(e.f334307b);
                this.f334469a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void F9(boolean z10, int i10, @Nullable okio.l lVar, int i11) throws IOException {
        try {
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            b(i10, z10 ? 1 : 0, lVar, i11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void Q(int i10, int i11, @NotNull List<c> requestHeaders) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f334473e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        this.f334474f.g(requestHeaders);
        long size = this.f334471c.size();
        int iMin = (int) Math.min(((long) this.f334472d) - 4, size);
        long j10 = iMin;
        c(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f334469a.writeInt(i11 & Integer.MAX_VALUE);
        this.f334469a.Ga(this.f334471c, j10);
        if (size > j10) {
            j(i10, size - j10);
        }
    }

    public final int Tb() {
        return this.f334472d;
    }

    public final synchronized void W(boolean z10, int i10, int i11) throws IOException {
        if (this.f334473e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        c(0, 8, 6, z10 ? 1 : 0);
        this.f334469a.writeInt(i10);
        this.f334469a.writeInt(i11);
        this.f334469a.flush();
    }

    public final synchronized void a(@NotNull m peerSettings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.f334472d = peerSettings.g(this.f334472d);
            if (peerSettings.d() != -1) {
                this.f334474f.e(peerSettings.d());
            }
            c(0, 0, 4, 1);
            this.f334469a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(int i10, int i11, @Nullable okio.l lVar, int i12) throws IOException {
        c(i10, i12, 0, i11);
        if (i12 > 0) {
            okio.m mVar = this.f334469a;
            Intrinsics.checkNotNull(lVar);
            mVar.Ga(lVar, i12);
        }
    }

    public final void c(int i10, int i11, int i12, int i13) throws IOException {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f334468h;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(e.f334306a.c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f334472d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f334472d + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        jk.f.p0(this.f334469a, i15);
        this.f334469a.writeByte(i16 & 255);
        this.f334469a.writeByte(i17 & 255);
        this.f334469a.writeInt(Integer.MAX_VALUE & i14);
    }

    public final synchronized void c0(int i10, long j10) throws IOException {
        if (this.f334473e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        if (j10 == 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        c(i10, 4, 8, 0);
        this.f334469a.writeInt((int) j10);
        this.f334469a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f334473e = true;
        this.f334469a.close();
    }

    @NotNull
    public final d.b d() {
        return this.f334474f;
    }

    public final synchronized void e(int i10, @NotNull b errorCode, @NotNull byte[] debugData) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (errorCode.l() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            c(0, debugData.length + 8, 7, 0);
            this.f334469a.writeInt(i10);
            this.f334469a.writeInt(errorCode.l());
            if (!(debugData.length == 0)) {
                this.f334469a.write(debugData);
            }
            this.f334469a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(boolean z10, int i10, @NotNull List<c> headerBlock) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.f334474f.g(headerBlock);
            long size = this.f334471c.size();
            long jMin = Math.min(this.f334472d, size);
            int i11 = size == jMin ? 4 : 0;
            if (z10) {
                i11 |= 1;
            }
            c(i10, (int) jMin, 1, i11);
            this.f334469a.Ga(this.f334471c, jMin);
            if (size > jMin) {
                j(i10, size - jMin);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.f334473e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        this.f334469a.flush();
    }

    public final synchronized void g(int i10, @NotNull b errorCode) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (errorCode.l() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c(i10, 4, 3, 0);
            this.f334469a.writeInt(errorCode.l());
            this.f334469a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void h(@NotNull m settings) throws IOException {
        int i10;
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f334473e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            int i11 = 0;
            c(0, settings.l() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.i(i11)) {
                    if (i11 != 4) {
                        i10 = i11 != 7 ? i11 : 4;
                    } else {
                        i10 = 3;
                    }
                    this.f334469a.writeShort(i10);
                    this.f334469a.writeInt(settings.b(i11));
                }
                i11++;
            }
            this.f334469a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

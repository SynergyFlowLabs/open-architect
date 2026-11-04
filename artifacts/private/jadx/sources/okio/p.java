package okio;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class p implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f335052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Cipher f335053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f335054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335055d;

    public p(@NotNull m sink, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f335052a = sink;
        this.f335053b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f335054c = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final Throwable a() {
        int outputSize = this.f335053b.getOutputSize(0);
        Throwable th2 = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                m mVar = this.f335052a;
                byte[] bArrDoFinal = this.f335053b.doFinal();
                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                mVar.write(bArrDoFinal);
                return null;
            } catch (Throwable th3) {
                return th3;
            }
        }
        l lVarN = this.f335052a.n();
        w0 w0VarT0 = lVarN.T0(outputSize);
        try {
            int iDoFinal = this.f335053b.doFinal(w0VarT0.f335128a, w0VarT0.f335130c);
            w0VarT0.f335130c += iDoFinal;
            lVarN.B0(lVarN.size() + ((long) iDoFinal));
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (w0VarT0.f335129b == w0VarT0.f335130c) {
            lVarN.f335034a = w0VarT0.b();
            x0.d(w0VarT0);
        }
        return th2;
    }

    private final int c(l lVar, long j10) throws IOException, ShortBufferException {
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int iMin = (int) Math.min(j10, w0Var.f335130c - w0Var.f335129b);
        l lVarN = this.f335052a.n();
        int outputSize = this.f335053b.getOutputSize(iMin);
        int i10 = iMin;
        while (outputSize > 8192) {
            int i11 = this.f335054c;
            if (i10 <= i11) {
                m mVar = this.f335052a;
                byte[] bArrUpdate = this.f335053b.update(lVar.tb(j10));
                Intrinsics.checkNotNullExpressionValue(bArrUpdate, "update(...)");
                mVar.write(bArrUpdate);
                return (int) j10;
            }
            i10 -= i11;
            outputSize = this.f335053b.getOutputSize(i10);
        }
        w0 w0VarT0 = lVarN.T0(outputSize);
        int iUpdate = this.f335053b.update(w0Var.f335128a, w0Var.f335129b, i10, w0VarT0.f335128a, w0VarT0.f335130c);
        w0VarT0.f335130c += iUpdate;
        lVarN.B0(lVarN.size() + ((long) iUpdate));
        if (w0VarT0.f335129b == w0VarT0.f335130c) {
            lVarN.f335034a = w0VarT0.b();
            x0.d(w0VarT0);
        }
        this.f335052a.L9();
        lVar.B0(lVar.size() - ((long) i10));
        int i12 = w0Var.f335129b + i10;
        w0Var.f335129b = i12;
        if (i12 == w0Var.f335130c) {
            lVar.f335034a = w0Var.b();
            x0.d(w0Var);
        }
        return i10;
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        i.e(source.size(), 0L, j10);
        if (this.f335055d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long jC = j10;
        while (jC > 0) {
            jC -= (long) c(source, jC);
        }
    }

    @NotNull
    public final Cipher b() {
        return this.f335053b;
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f335055d) {
            return;
        }
        this.f335055d = true;
        Throwable thA = a();
        try {
            this.f335052a.close();
        } catch (Throwable th2) {
            if (thA == null) {
                thA = th2;
            }
        }
        if (thA != null) {
            throw thA;
        }
    }

    @Override // okio.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f335052a.flush();
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return this.f335052a.timeout();
    }
}

package okio;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class q implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f335059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Cipher f335060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f335061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l f335062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f335063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f335064f;

    public q(@NotNull n source, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f335059a = source;
        this.f335060b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f335061c = blockSize;
        this.f335062d = new l();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final void L1() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        w0 w0Var = this.f335059a.n().f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335130c - w0Var.f335129b;
        int outputSize = this.f335060b.getOutputSize(i10);
        int i11 = i10;
        while (outputSize > 8192) {
            int i12 = this.f335061c;
            if (i11 <= i12) {
                this.f335063e = true;
                l lVar = this.f335062d;
                byte[] bArrDoFinal = this.f335060b.doFinal(this.f335059a.Y5());
                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                lVar.write(bArrDoFinal);
                return;
            }
            i11 -= i12;
            outputSize = this.f335060b.getOutputSize(i11);
        }
        w0 w0VarT0 = this.f335062d.T0(outputSize);
        int iUpdate = this.f335060b.update(w0Var.f335128a, w0Var.f335129b, i11, w0VarT0.f335128a, w0VarT0.f335129b);
        this.f335059a.skip(i11);
        w0VarT0.f335130c += iUpdate;
        l lVar2 = this.f335062d;
        lVar2.B0(lVar2.size() + ((long) iUpdate));
        if (w0VarT0.f335129b == w0VarT0.f335130c) {
            this.f335062d.f335034a = w0VarT0.b();
            x0.d(w0VarT0);
        }
    }

    private final void a() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int outputSize = this.f335060b.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        w0 w0VarT0 = this.f335062d.T0(outputSize);
        int iDoFinal = this.f335060b.doFinal(w0VarT0.f335128a, w0VarT0.f335129b);
        w0VarT0.f335130c += iDoFinal;
        l lVar = this.f335062d;
        lVar.B0(lVar.size() + ((long) iDoFinal));
        if (w0VarT0.f335129b == w0VarT0.f335130c) {
            this.f335062d.f335034a = w0VarT0.b();
            x0.d(w0VarT0);
        }
    }

    private final void c() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        while (this.f335062d.size() == 0 && !this.f335063e) {
            if (this.f335059a.y1()) {
                this.f335063e = true;
                a();
                return;
            }
            L1();
        }
    }

    @NotNull
    public final Cipher b() {
        return this.f335060b;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f335064f = true;
        this.f335059a.close();
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f335064f) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j10 == 0) {
            return 0L;
        }
        c();
        return this.f335062d.read(sink, j10);
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.f335059a.timeout();
    }
}

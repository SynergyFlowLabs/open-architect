package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.b1;
import okio.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f334956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f334958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull b1 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f334956a = j10;
        this.f334957b = z10;
    }

    private final void a(okio.l lVar, long j10) throws IOException {
        okio.l lVar2 = new okio.l();
        lVar2.Ma(lVar);
        lVar.Ga(lVar2, j10);
        lVar2.c();
    }

    @Override // okio.y, okio.b1
    public long read(@NotNull okio.l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f334958c;
        long j12 = this.f334956a;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f334957b) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long j14 = super.read(sink, j10);
        if (j14 != -1) {
            this.f334958c += j14;
        }
        long j15 = this.f334958c;
        long j16 = this.f334956a;
        if ((j15 >= j16 || j14 != -1) && j15 <= j16) {
            return j14;
        }
        if (j14 > 0 && j15 > j16) {
            a(sink, sink.size() - (this.f334958c - this.f334956a));
        }
        throw new IOException("expected " + this.f334956a + " bytes but got " + this.f334958c);
    }
}

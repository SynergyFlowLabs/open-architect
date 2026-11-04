package coil.decode;

import java.io.EOFException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.q1;
import okio.b1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends okio.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f87185b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final okio.o f87186c = okio.o.f335046d.i("0021F904");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f87187d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f87188e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f87189f = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.l f87190a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(@NotNull b1 b1Var) {
        super(b1Var);
        this.f87190a = new okio.l();
    }

    private final long a(okio.l lVar, long j10) {
        return kotlin.ranges.r.v(this.f87190a.read(lVar, j10), 0L);
    }

    private final boolean request(long j10) {
        if (this.f87190a.size() >= j10) {
            return true;
        }
        long size = j10 - this.f87190a.size();
        return super.read(this.f87190a, size) == size;
    }

    private final long x2(okio.o oVar) {
        long jM2 = -1;
        while (true) {
            jM2 = this.f87190a.M2(oVar.E(0), jM2 + 1);
            if (jM2 == -1 || (request(oVar.v0()) && this.f87190a.u3(jM2, oVar))) {
                break;
            }
        }
        return jM2;
    }

    @Override // okio.y, okio.b1
    public long read(@NotNull okio.l lVar, long j10) throws EOFException {
        request(j10);
        if (this.f87190a.size() == 0) {
            return j10 == 0 ? 0L : -1L;
        }
        long jA = 0;
        while (true) {
            long jX2 = x2(f87186c);
            if (jX2 == -1) {
                break;
            }
            jA += a(lVar, jX2 + ((long) 4));
            if (request(5L) && this.f87190a.I(4L) == 0 && (((q1.n(this.f87190a.I(2L)) & 255) << 8) | (q1.n(this.f87190a.I(1L)) & 255)) < 2) {
                lVar.writeByte(this.f87190a.I(0L));
                lVar.writeByte(10);
                lVar.writeByte(0);
                this.f87190a.skip(3L);
            }
        }
        if (jA < j10) {
            jA += a(lVar, j10 - jA);
        }
        if (jA == 0) {
            return -1L;
        }
        return jA;
    }
}

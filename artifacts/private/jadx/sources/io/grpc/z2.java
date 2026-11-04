package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public class z2 extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f291501d = -660954903976144640L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f291502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f291503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f291504c;

    public z2(y2 y2Var) {
        this(y2Var, null);
    }

    public final y2 a() {
        return this.f291502a;
    }

    public final v1 b() {
        return this.f291503b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f291504c ? super.fillInStackTrace() : this;
    }

    public z2(y2 y2Var, @fj.h v1 v1Var) {
        this(y2Var, v1Var, true);
    }

    z2(y2 y2Var, @fj.h v1 v1Var, boolean z10) {
        super(y2.i(y2Var), y2Var.o());
        this.f291502a = y2Var;
        this.f291503b = v1Var;
        this.f291504c = z10;
        fillInStackTrace();
    }
}

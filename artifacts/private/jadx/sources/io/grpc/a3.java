package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
public class a3 extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f288686d = 1950934672280720624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f288687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f288688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f288689c;

    public a3(y2 y2Var) {
        this(y2Var, null);
    }

    public final y2 a() {
        return this.f288687a;
    }

    @fj.h
    public final v1 b() {
        return this.f288688b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f288689c ? super.fillInStackTrace() : this;
    }

    public a3(y2 y2Var, @fj.h v1 v1Var) {
        this(y2Var, v1Var, true);
    }

    a3(y2 y2Var, @fj.h v1 v1Var, boolean z10) {
        super(y2.i(y2Var), y2Var.o());
        this.f288687a = y2Var;
        this.f288688b = v1Var;
        this.f288689c = z10;
        fillInStackTrace();
    }
}

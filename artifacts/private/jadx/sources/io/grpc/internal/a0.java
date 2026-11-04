package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
abstract class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.w f288838a;

    protected a0(io.grpc.w wVar) {
        this.f288838a = wVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        io.grpc.w wVarB = this.f288838a.b();
        try {
            a();
            io.grpc.w wVar = this.f288838a;
        } finally {
            this.f288838a.j(wVarB);
        }
    }
}

package androidx.media2.exoplayer.external.source.ads;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55705a;

    private e(b bVar) {
        this.f55705a = bVar;
    }

    static Runnable a(b bVar) {
        return new e(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f55705a.stop();
    }
}

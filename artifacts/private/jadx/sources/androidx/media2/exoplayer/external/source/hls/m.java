package androidx.media2.exoplayer.external.source.hls;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.a f56031a;

    private m(n.a aVar) {
        this.f56031a = aVar;
    }

    static Runnable a(n.a aVar) {
        return new m(aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f56031a.a();
    }
}

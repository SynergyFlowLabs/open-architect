package dagger.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class q<T> implements ij.c<fg.e<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f269726b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<T> f269727a;

    private q(ij.c<T> cVar) {
        this.f269727a = cVar;
    }

    public static <T> ij.c<fg.e<T>> a(ij.c<T> cVar) {
        return new q((ij.c) p.b(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fg.e<T> get() {
        return g.a(this.f269727a);
    }
}

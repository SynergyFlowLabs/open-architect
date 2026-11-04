package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public interface i<T> {

    public static abstract class a<T, U> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i<U> f288037a;

        public a(i<U> iVar) {
            this.f288037a = iVar;
        }

        @Override // io.ably.lib.types.i
        public void a(r rVar) {
            this.f288037a.a(rVar);
        }

        @Override // io.ably.lib.types.i
        public void b(T t10) {
            this.f288037a.b(c(t10));
        }

        public abstract U c(T t10);
    }

    void a(r rVar);

    void b(T t10);
}

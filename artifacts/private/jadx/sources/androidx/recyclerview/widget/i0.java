package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
interface i0<T> {

    public interface a<T> {
        void a(int i10, int i11, int i12, int i13, int i14);

        void b(int i10, int i11);

        void c(int i10);

        @e.a({"UnknownNullness"})
        void d(j0.a<T> aVar);
    }

    public interface b<T> {
        void a(int i10, int i11);

        void b(int i10, int i11);

        @e.a({"UnknownNullness"})
        void c(int i10, j0.a<T> aVar);
    }

    b<T> a(b<T> bVar);

    a<T> b(a<T> aVar);
}

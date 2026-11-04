package androidx.paging;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m3<K, A, B> extends o1<K, B> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final o1<K, A> f72372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n.a<List<A>, List<B>> f72373h;

    public static final class a extends o1.a<K, A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1.a<K, B> f72374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m3<K, A, B> f72375b;

        a(o1.a<K, B> aVar, m3<K, A, B> m3Var) {
            this.f72374a = aVar;
            this.f72375b = m3Var;
        }

        @Override // androidx.paging.o1.a
        public void a(@NotNull List<? extends A> data, @Nullable K k10) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72374a.a(u.f72617e.a(((m3) this.f72375b).f72373h, data), k10);
        }
    }

    public static final class b extends o1.a<K, A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1.a<K, B> f72376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m3<K, A, B> f72377b;

        b(o1.a<K, B> aVar, m3<K, A, B> m3Var) {
            this.f72376a = aVar;
            this.f72377b = m3Var;
        }

        @Override // androidx.paging.o1.a
        public void a(@NotNull List<? extends A> data, @Nullable K k10) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72376a.a(u.f72617e.a(((m3) this.f72377b).f72373h, data), k10);
        }
    }

    public static final class c extends o1.b<K, A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m3<K, A, B> f72378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o1.b<K, B> f72379b;

        c(m3<K, A, B> m3Var, o1.b<K, B> bVar) {
            this.f72378a = m3Var;
            this.f72379b = bVar;
        }

        @Override // androidx.paging.o1.b
        public void a(@NotNull List<? extends A> data, int i10, int i11, @Nullable K k10, @Nullable K k11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72379b.a(u.f72617e.a(((m3) this.f72378a).f72373h, data), i10, i11, k10, k11);
        }

        @Override // androidx.paging.o1.b
        public void b(@NotNull List<? extends A> data, @Nullable K k10, @Nullable K k11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72379b.b(u.f72617e.a(((m3) this.f72378a).f72373h, data), k10, k11);
        }
    }

    public m3(@NotNull o1<K, A> source, @NotNull n.a<List<A>, List<B>> listFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.f72372g = source;
        this.f72373h = listFunction;
    }

    @Override // androidx.paging.o1
    public void C(@NotNull o1.d<K> params, @NotNull o1.a<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72372g.C(params, new a(callback, this));
    }

    @Override // androidx.paging.o1
    public void E(@NotNull o1.d<K> params, @NotNull o1.a<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72372g.E(params, new b(callback, this));
    }

    @Override // androidx.paging.o1
    public void G(@NotNull o1.c<K> params, @NotNull o1.b<K, B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72372g.G(params, new c(this, callback));
    }

    @Override // androidx.paging.u
    public void c(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72372g.c(onInvalidatedCallback);
    }

    @Override // androidx.paging.u
    public void h() {
        this.f72372g.h();
    }

    @Override // androidx.paging.u
    public boolean j() {
        return this.f72372g.j();
    }

    @Override // androidx.paging.u
    public void r(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72372g.r(onInvalidatedCallback);
    }
}

package androidx.paging;

import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l3<K, A, B> extends p0<K, B> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final p0<K, A> f72352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n.a<List<A>, List<B>> f72353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final IdentityHashMap<B, K> f72354h;

    public static final class a extends p0.a<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0.a<B> f72355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3<K, A, B> f72356b;

        a(p0.a<B> aVar, l3<K, A, B> l3Var) {
            this.f72355a = aVar;
            this.f72356b = l3Var;
        }

        @Override // androidx.paging.p0.a
        public void a(@NotNull List<? extends A> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72355a.a(this.f72356b.N(data));
        }
    }

    public static final class b extends p0.a<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0.a<B> f72357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3<K, A, B> f72358b;

        b(p0.a<B> aVar, l3<K, A, B> l3Var) {
            this.f72357a = aVar;
            this.f72358b = l3Var;
        }

        @Override // androidx.paging.p0.a
        public void a(@NotNull List<? extends A> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72357a.a(this.f72358b.N(data));
        }
    }

    public static final class c extends p0.b<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0.b<B> f72359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3<K, A, B> f72360b;

        c(p0.b<B> bVar, l3<K, A, B> l3Var) {
            this.f72359a = bVar;
            this.f72360b = l3Var;
        }

        @Override // androidx.paging.p0.a
        public void a(@NotNull List<? extends A> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72359a.a(this.f72360b.N(data));
        }

        @Override // androidx.paging.p0.b
        public void b(@NotNull List<? extends A> data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72359a.b(this.f72360b.N(data), i10, i11);
        }
    }

    public l3(@NotNull p0<K, A> source, @NotNull n.a<List<A>, List<B>> listFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.f72352f = source;
        this.f72353g = listFunction;
        this.f72354h = new IdentityHashMap<>();
    }

    @Override // androidx.paging.p0
    public void A(@NotNull p0.d<K> params, @NotNull p0.a<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72352f.A(params, new a(callback, this));
    }

    @Override // androidx.paging.p0
    public void C(@NotNull p0.d<K> params, @NotNull p0.a<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72352f.C(params, new b(callback, this));
    }

    @Override // androidx.paging.p0
    public void E(@NotNull p0.c<K> params, @NotNull p0.b<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72352f.E(params, new c(callback, this));
    }

    @NotNull
    public final List<B> N(@NotNull List<? extends A> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        List<B> listA = u.f72617e.a(this.f72353g, source);
        synchronized (this.f72354h) {
            try {
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f72354h.put(listA.get(i10), this.f72352f.x(source.get(i10)));
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listA;
    }

    @Override // androidx.paging.u
    public void c(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72352f.c(onInvalidatedCallback);
    }

    @Override // androidx.paging.u
    public void h() {
        this.f72352f.h();
    }

    @Override // androidx.paging.u
    public boolean j() {
        return this.f72352f.j();
    }

    @Override // androidx.paging.u
    public void r(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72352f.r(onInvalidatedCallback);
    }

    @Override // androidx.paging.p0
    @NotNull
    public K x(@NotNull B item) {
        K k10;
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this.f72354h) {
            try {
                k10 = this.f72354h.get(item);
                Intrinsics.checkNotNull(k10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k10;
    }
}

package androidx.paging;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n3<A, B> extends q2<B> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final q2<A> f72390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n.a<List<A>, List<B>> f72391i;

    public static final class a extends q2.b<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q2.b<B> f72392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n3<A, B> f72393b;

        a(q2.b<B> bVar, n3<A, B> n3Var) {
            this.f72392a = bVar;
            this.f72393b = n3Var;
        }

        @Override // androidx.paging.q2.b
        public void a(@NotNull List<? extends A> data, int i10) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72392a.a(u.f72617e.a(this.f72393b.L(), data), i10);
        }

        @Override // androidx.paging.q2.b
        public void b(@NotNull List<? extends A> data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72392a.b(u.f72617e.a(this.f72393b.L(), data), i10, i11);
        }
    }

    public static final class b extends q2.d<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q2.d<B> f72394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n3<A, B> f72395b;

        b(q2.d<B> dVar, n3<A, B> n3Var) {
            this.f72394a = dVar;
            this.f72395b = n3Var;
        }

        @Override // androidx.paging.q2.d
        public void a(@NotNull List<? extends A> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72394a.a(u.f72617e.a(this.f72395b.L(), data));
        }
    }

    public n3(@NotNull q2<A> source, @NotNull n.a<List<A>, List<B>> listFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.f72390h = source;
        this.f72391i = listFunction;
    }

    @Override // androidx.paging.q2
    public void A(@NotNull q2.c params, @NotNull q2.b<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72390h.A(params, new a(callback, this));
    }

    @Override // androidx.paging.q2
    public void D(@NotNull q2.e params, @NotNull q2.d<B> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f72390h.D(params, new b(callback, this));
    }

    @NotNull
    public final n.a<List<A>, List<B>> L() {
        return this.f72391i;
    }

    @Override // androidx.paging.u
    public void c(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72390h.c(onInvalidatedCallback);
    }

    @Override // androidx.paging.u
    public void h() {
        this.f72390h.h();
    }

    @Override // androidx.paging.u
    public boolean j() {
        return this.f72390h.j();
    }

    @Override // androidx.paging.u
    public void r(@NotNull u.d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72390h.r(onInvalidatedCallback);
    }
}

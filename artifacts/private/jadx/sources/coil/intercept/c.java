package coil.intercept;

import coil.d;
import coil.request.i;
import coil.request.j;
import coil.request.k;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f87471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f87472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f87474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final coil.size.i f87475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final d f87476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87477g;

    @f(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {32}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87480c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87482e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87480c = obj;
            this.f87482e |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull i iVar, @NotNull List<? extends b> list, int i10, @NotNull i iVar2, @NotNull coil.size.i iVar3, @NotNull d dVar, boolean z10) {
        this.f87471a = iVar;
        this.f87472b = list;
        this.f87473c = i10;
        this.f87474d = iVar2;
        this.f87475e = iVar3;
        this.f87476f = dVar;
        this.f87477g = z10;
    }

    private final void d(i iVar, b bVar) {
        if (iVar.l() != this.f87471a.l()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        }
        if (iVar.m() == k.f87717a) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        if (iVar.M() != this.f87471a.M()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        }
        if (iVar.z() != this.f87471a.z()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.K() == this.f87471a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final c e(int i10, i iVar, coil.size.i iVar2) {
        return new c(this.f87471a, this.f87472b, i10, iVar, iVar2, this.f87476f, this.f87477g);
    }

    static /* synthetic */ c f(c cVar, int i10, i iVar, coil.size.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f87473c;
        }
        if ((i11 & 2) != 0) {
            iVar = cVar.getRequest();
        }
        if ((i11 & 4) != 0) {
            iVar2 = cVar.getSize();
        }
        return cVar.e(i10, iVar, iVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // coil.intercept.b.a
    @Nullable
    public Object a(@NotNull i iVar, @NotNull kotlin.coroutines.d<? super j> dVar) {
        a aVar;
        b bVar;
        Object obj;
        c cVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f87482e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f87482e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj2 = aVar.f87480c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f87482e;
        if (i11 == 0) {
            ResultKt.m(obj2);
            int i12 = this.f87473c;
            if (i12 > 0) {
                d(iVar, this.f87472b.get(i12 - 1));
            }
            bVar = this.f87472b.get(this.f87473c);
            int i13 = 4 << 4;
            c cVarF = f(this, this.f87473c + 1, iVar, null, 4, null);
            aVar.f87478a = this;
            aVar.f87479b = bVar;
            aVar.f87482e = 1;
            Object objA = bVar.a(cVarF, aVar);
            if (objA == objL) {
                return objL;
            }
            obj = objA;
            cVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar2 = (b) aVar.f87479b;
            c cVar2 = (c) aVar.f87478a;
            ResultKt.m(obj2);
            bVar = bVar2;
            cVar = cVar2;
            obj = obj2;
        }
        j jVar = (j) obj;
        cVar.d(jVar.b(), bVar);
        return jVar;
    }

    @Override // coil.intercept.b.a
    @NotNull
    public b.a b(@NotNull i iVar) {
        int i10 = this.f87473c;
        if (i10 > 0) {
            d(iVar, this.f87472b.get(i10 - 1));
        }
        return f(this, 0, iVar, null, 5, null);
    }

    @Override // coil.intercept.b.a
    @NotNull
    public b.a c(@NotNull coil.size.i iVar) {
        return f(this, 0, null, iVar, 3, null);
    }

    @NotNull
    public final d g() {
        return this.f87476f;
    }

    @Override // coil.intercept.b.a
    @NotNull
    public i getRequest() {
        return this.f87474d;
    }

    @Override // coil.intercept.b.a
    @NotNull
    public coil.size.i getSize() {
        return this.f87475e;
    }

    public final int h() {
        return this.f87473c;
    }

    @NotNull
    public final i i() {
        return this.f87471a;
    }

    @NotNull
    public final List<b> j() {
        return this.f87472b;
    }

    public final boolean k() {
        return this.f87477g;
    }
}

package kotlinx.coroutines.reactive;

import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.channels.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveSubscriber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,270:1\n1#2:271\n994#3:272\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveSubscriber\n*L\n127#1:272\n*E\n"})
final class p<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f315296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w f315297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<T> f315298c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", i = {}, l = {125}, m = "takeNextOrNull", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f315299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<T> f315300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315301c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f315300b = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315299a = obj;
            this.f315301c |= Integer.MIN_VALUE;
            return this.f315300b.c(this);
        }
    }

    public p(int i10, @NotNull kotlinx.coroutines.channels.j jVar, long j10) {
        this.f315296a = j10;
        this.f315298c = s.d(i10 == 0 ? 1 : i10, jVar, null, 4, null);
    }

    public final void a() {
        w wVar = this.f315297b;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscription");
            wVar = null;
        }
        wVar.cancel();
    }

    public final void b() {
        w wVar = this.f315297b;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscription");
            wVar = null;
        }
        wVar.request(this.f315296a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        a aVar;
        Object objA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f315301c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f315301c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f315299a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f315301c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.channels.p<T> pVar = this.f315298c;
            aVar.f315301c = 1;
            objA = pVar.A(aVar);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            objA = ((t) obj).o();
        }
        Throwable thF = t.f(objA);
        if (thF != null) {
            throw thF;
        }
        if (!(objA instanceof t.c)) {
            return objA;
        }
        t.f(objA);
        return null;
    }

    @Override // org.reactivestreams.v
    public void l(@NotNull w wVar) {
        this.f315297b = wVar;
        b();
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        o0.a.a(this.f315298c, null, 1, null);
    }

    @Override // org.reactivestreams.v
    public void onError(@Nullable Throwable th2) {
        this.f315298c.F(th2);
    }

    @Override // org.reactivestreams.v
    public void onNext(@NotNull T t10) {
        if (t.m(this.f315298c.p(t10))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + t10 + " was not added to channel because it was full, " + this.f315298c).toString());
    }
}

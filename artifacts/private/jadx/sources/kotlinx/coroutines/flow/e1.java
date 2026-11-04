package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class e1<T> implements o0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o0<T> f314193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<j<? super T>, kotlin.coroutines.d<? super Unit>, Object> f314194b;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {412}, m = "collect", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f314195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1<T> f314196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e1<T> e1Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f314196b = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314195a = obj;
            this.f314197c |= Integer.MIN_VALUE;
            return this.f314196b.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1(@NotNull o0<? extends T> o0Var, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f314193a = o0Var;
        this.f314194b = function2;
    }

    @Override // kotlinx.coroutines.flow.o0
    @NotNull
    public List<T> a() {
        return this.f314193a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // kotlinx.coroutines.flow.o0, kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f314197c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f314197c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f314195a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f314197c;
        if (i11 == 0) {
            ResultKt.m(obj);
            o0<T> o0Var = this.f314193a;
            d1 d1Var = new d1(jVar, this.f314194b);
            aVar.f314197c = 1;
            if (o0Var.collect(d1Var, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }
}

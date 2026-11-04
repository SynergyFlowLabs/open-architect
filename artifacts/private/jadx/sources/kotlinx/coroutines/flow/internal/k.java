package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n91#1:97,2\n*E\n"})
public final class k<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Iterable<kotlinx.coroutines.flow.i<T>> f314543d;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f314545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0<T> f314546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T> iVar, a0<T> a0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314545b = iVar;
            this.f314546c = a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f314545b, this.f314546c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314544a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.f314545b;
                a0<T> a0Var = this.f314546c;
                this.f314544a = 1;
                if (iVar.collect(a0Var, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ k(Iterable iterable, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a0 a0Var = new a0(l0Var);
        Iterator<kotlinx.coroutines.flow.i<T>> it = this.f314543d.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.k.f(l0Var, null, null, new a(it.next(), a0Var, null), 3, null);
        }
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new k(this.f314543d, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public n0<T> m(@NotNull s0 s0Var) {
        return j0.e(s0Var, this.f314495a, this.f314496b, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(coroutineContext, i10, jVar);
        this.f314543d = iterable;
    }
}

package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<T> f314098a;

    @SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,288:1\n375#2:289\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n277#1:289\n*E\n"})
    static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j<T> f314099a;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {278}, m = "emit", n = {}, s = {})
        static final class C2278a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314100a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f314101b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314102c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2278a(a<? super T> aVar, kotlin.coroutines.d<? super C2278a> dVar) {
                super(dVar);
                this.f314101b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314100a = obj;
                this.f314102c |= Integer.MIN_VALUE;
                return this.f314101b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(j<? super T> jVar) {
            this.f314099a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            C2278a c2278a;
            if (dVar instanceof C2278a) {
                c2278a = (C2278a) dVar;
                int i10 = c2278a.f314102c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2278a.f314102c = i10 - Integer.MIN_VALUE;
                } else {
                    c2278a = new C2278a(this, dVar);
                }
            } else {
                c2278a = new C2278a(this, dVar);
            }
            Object obj = c2278a.f314100a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2278a.f314102c;
            if (i11 == 0) {
                ResultKt.m(obj);
                s2.y(c2278a.getContext());
                j<T> jVar = this.f314099a;
                c2278a.f314102c = 1;
                if (jVar.emit(t10, c2278a) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull i<? extends T> iVar) {
        this.f314098a = iVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f314098a.collect(new a(jVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }
}

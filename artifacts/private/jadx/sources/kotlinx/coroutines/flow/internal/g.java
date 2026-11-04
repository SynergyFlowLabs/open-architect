package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> f314505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f314506e;

    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p2 f314507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.h f314508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<T> f314509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0<T> f314510d;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.g$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        static final class C2287a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314511a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f314512b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a0<T> f314513c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.h f314514d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2287a(kotlinx.coroutines.flow.i<? extends T> iVar, a0<T> a0Var, kotlinx.coroutines.sync.h hVar, kotlin.coroutines.d<? super C2287a> dVar) {
                super(2, dVar);
                this.f314512b = iVar;
                this.f314513c = a0Var;
                this.f314514d = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2287a(this.f314512b, this.f314513c, this.f314514d, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314511a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.f314512b;
                        a0<T> a0Var = this.f314513c;
                        this.f314511a = 1;
                        if (iVar.collect(a0Var, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    this.f314514d.release();
                    this = Unit.f312394a;
                    return this;
                } catch (Throwable th2) {
                    this.f314514d.release();
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2287a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f314516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314517c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a<T> f314518d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f314519e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.f314518d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314517c = obj;
                this.f314519e |= Integer.MIN_VALUE;
                return this.f314518d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(p2 p2Var, kotlinx.coroutines.sync.h hVar, l0<? super T> l0Var, a0<T> a0Var) {
            this.f314507a = p2Var;
            this.f314508b = hVar;
            this.f314509c = l0Var;
            this.f314510d = a0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f314519e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f314519e = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, dVar);
                }
            } else {
                bVar = new b(this, dVar);
            }
            Object obj = bVar.f314517c;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f314519e;
            if (i11 == 0) {
                ResultKt.m(obj);
                p2 p2Var = this.f314507a;
                if (p2Var != null) {
                    s2.z(p2Var);
                }
                kotlinx.coroutines.sync.h hVar = this.f314508b;
                bVar.f314515a = this;
                bVar.f314516b = iVar;
                bVar.f314519e = 1;
                if (hVar.g(bVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (kotlinx.coroutines.flow.i) bVar.f314516b;
                this = (a) bVar.f314515a;
                ResultKt.m(obj);
            }
            kotlinx.coroutines.k.f(this.f314509c, null, null, new C2287a(iVar, this.f314510d, this.f314508b, null), 3, null);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ g(kotlinx.coroutines.flow.i iVar, int i10, CoroutineContext coroutineContext, int i11, kotlinx.coroutines.channels.j jVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, i10, (i12 & 4) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected String c() {
        return "concurrency=" + this.f314506e;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f314505d.collect(new a((p2) dVar.getContext().get(p2.M2), kotlinx.coroutines.sync.l.b(this.f314506e, 0, 2, null), l0Var, new a0(l0Var)), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new g(this.f314505d, this.f314506e, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public n0<T> m(@NotNull s0 s0Var) {
        return j0.e(s0Var, this.f314495a, this.f314496b, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> iVar, int i10, @NotNull CoroutineContext coroutineContext, int i11, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(coroutineContext, i11, jVar);
        this.f314505d = iVar;
        this.f314506e = i10;
    }
}

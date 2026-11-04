package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.x0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class e<T> implements r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final CoroutineContext f314495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final int f314496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlinx.coroutines.channels.j f314497c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f314500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<T> f314501d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.j<? super T> jVar, e<T> eVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314500c = jVar;
            this.f314501d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f314500c, this.f314501d, dVar);
            aVar.f314499b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314498a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f314499b;
                kotlinx.coroutines.flow.j<T> jVar = this.f314500c;
                n0<T> n0VarM = this.f314501d.m(s0Var);
                this.f314498a = 1;
                if (kotlinx.coroutines.flow.k.n0(jVar, n0VarM, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<T> f314504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f314504c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f314504c, dVar);
            bVar.f314503b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314502a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0<? super T> l0Var = (l0) this.f314503b;
                e<T> eVar = this.f314504c;
                this.f314502a = 1;
                if (eVar.g(l0Var, this) == objL) {
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
        public final Object invoke(l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public e(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        this.f314495a = coroutineContext;
        this.f314496b = i10;
        this.f314497c = jVar;
    }

    static /* synthetic */ <T> Object e(e<T> eVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new a(jVar, eVar, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.r
    @NotNull
    public kotlinx.coroutines.flow.i<T> b(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        CoroutineContext coroutineContextPlus = coroutineContext.plus(this.f314495a);
        if (jVar == kotlinx.coroutines.channels.j.SUSPEND) {
            int i11 = this.f314496b;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            jVar = this.f314497c;
        }
        return (Intrinsics.areEqual(coroutineContextPlus, this.f314495a) && i10 == this.f314496b && jVar == this.f314497c) ? this : h(coroutineContextPlus, i10, jVar);
    }

    @Nullable
    protected String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return e(this, jVar, dVar);
    }

    @Nullable
    protected abstract Object g(@NotNull l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    protected abstract e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar);

    @Nullable
    public kotlinx.coroutines.flow.i<T> j() {
        return null;
    }

    @NotNull
    public final Function2<l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i10 = this.f314496b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @NotNull
    public n0<T> m(@NotNull s0 s0Var) {
        return j0.j(s0Var, this.f314495a, l(), this.f314497c, u0.ATOMIC, null, k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f314495a != kotlin.coroutines.h.f312451a) {
            arrayList.add("context=" + this.f314495a);
        }
        if (this.f314496b != -3) {
            arrayList.add("capacity=" + this.f314496b);
        }
        if (this.f314497c != kotlinx.coroutines.channels.j.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f314497c);
        }
        return x0.a(this) + AbstractJsonLexerKt.BEGIN_LIST + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + AbstractJsonLexerKt.END_LIST;
    }
}

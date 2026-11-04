package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
final class e<T> extends kotlinx.coroutines.flow.internal.e<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f314123f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.n0<T> f314124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f314125e;

    public /* synthetic */ e(kotlinx.coroutines.channels.n0 n0Var, boolean z10, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(n0Var, z10, (i11 & 4) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    private final /* synthetic */ int n() {
        return this.consumed$volatile;
    }

    private final void p() {
        if (this.f314125e && f314123f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    private final /* synthetic */ void q(int i10) {
        this.consumed$volatile = i10;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected String c() {
        return "channel=" + this.f314124d;
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.f314496b != -3) {
            Object objCollect = super.collect(jVar, dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
        p();
        Object objD = m.d(jVar, this.f314124d, this.f314125e, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull kotlinx.coroutines.channels.l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = m.d(new kotlinx.coroutines.flow.internal.a0(l0Var), this.f314124d, this.f314125e, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    protected kotlinx.coroutines.flow.internal.e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new e(this.f314124d, this.f314125e, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public i<T> j() {
        return new e(this.f314124d, this.f314125e, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public kotlinx.coroutines.channels.n0<T> m(@NotNull kotlinx.coroutines.s0 s0Var) {
        p();
        return this.f314496b == -3 ? this.f314124d : super.m(s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var, boolean z10, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(coroutineContext, i10, jVar);
        this.f314124d = n0Var;
        this.f314125e = z10;
    }
}

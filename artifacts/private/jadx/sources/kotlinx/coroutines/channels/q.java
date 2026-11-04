package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
public class q<E> extends kotlinx.coroutines.a<Unit> implements p<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p<E> f313884d;

    public q(@NotNull CoroutineContext coroutineContext, @NotNull p<E> pVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this.f313884d = pVar;
    }

    @Override // kotlinx.coroutines.channels.n0
    @Nullable
    public Object A(@NotNull kotlin.coroutines.d<? super t<? extends E>> dVar) {
        Object objA = this.f313884d.A(dVar);
        kotlin.coroutines.intrinsics.b.l();
        return objA;
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return this.f313884d.B();
    }

    @Override // kotlinx.coroutines.channels.n0
    public boolean C() {
        return this.f313884d.C();
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public kotlinx.coroutines.selects.h<E> D() {
        return this.f313884d.D();
    }

    public boolean F(@Nullable Throwable th2) {
        return this.f313884d.F(th2);
    }

    @Nullable
    public Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f313884d.G(e10, dVar);
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean c(Throwable th2) {
        s0(new q2(z0(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        s0(new q2(z0(), null, this));
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    public final void e(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new q2(z0(), null, this);
        }
        s0(cancellationException);
    }

    @NotNull
    public kotlinx.coroutines.selects.j<E, o0<E>> i() {
        return this.f313884d.i();
    }

    @NotNull
    protected final p<E> i2() {
        return this.f313884d;
    }

    @Override // kotlinx.coroutines.channels.n0
    public boolean isEmpty() {
        return this.f313884d.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public r<E> iterator() {
        return this.f313884d.iterator();
    }

    @Override // kotlinx.coroutines.channels.n0
    @Nullable
    public Object j(@NotNull kotlin.coroutines.d<? super E> dVar) {
        return this.f313884d.j(dVar);
    }

    @Override // kotlinx.coroutines.channels.o0
    public void n(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f313884d.n(function1);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return this.f313884d.offer(e10);
    }

    @NotNull
    public Object p(E e10) {
        return this.f313884d.p(e10);
    }

    @Override // kotlinx.coroutines.channels.n0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return this.f313884d.poll();
    }

    @NotNull
    public final p<E> s() {
        return this;
    }

    @Override // kotlinx.coroutines.w2
    public void s0(@NotNull Throwable th2) {
        CancellationException cancellationExceptionV1 = w2.V1(this, th2, null, 1, null);
        this.f313884d.e(cancellationExceptionV1);
        m0(cancellationExceptionV1);
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public kotlinx.coroutines.selects.h<t<E>> u() {
        return this.f313884d.u();
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public kotlinx.coroutines.selects.h<E> v() {
        return this.f313884d.v();
    }

    @Override // kotlinx.coroutines.channels.n0
    @NotNull
    public Object w() {
        return this.f313884d.w();
    }

    @Override // kotlinx.coroutines.channels.n0
    @kotlin.internal.h
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object z(@NotNull kotlin.coroutines.d<? super E> dVar) {
        return this.f313884d.z(dVar);
    }
}

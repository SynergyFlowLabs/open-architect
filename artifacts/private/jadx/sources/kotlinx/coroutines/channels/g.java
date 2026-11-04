package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,124:1\n732#2,3:125\n732#2,3:128\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n73#1:125,3\n79#1:128,3\n*E\n"})
class g<E> extends kotlinx.coroutines.a<Unit> implements l0<E>, d<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d<E> f313769d;

    public g(@NotNull CoroutineContext coroutineContext, @NotNull d<E> dVar, boolean z10) {
        super(coroutineContext, false, z10);
        this.f313769d = dVar;
        q1((p2) coroutineContext.get(p2.M2));
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return this.f313769d.B();
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        boolean zF = this.f313769d.F(th2);
        start();
        return zF;
    }

    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f313769d.G(e10, dVar);
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean c(Throwable th2) {
        if (th2 == null) {
            th2 = new q2(z0(), null, this);
        }
        s0(th2);
        return true;
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    public final void e(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new q2(z0(), null, this);
        }
        s0(cancellationException);
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        if (this.f313769d.F(th2) || z10) {
            return;
        }
        kotlinx.coroutines.p0.b(getContext(), th2);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<E, o0<E>> i() {
        return this.f313769d.i();
    }

    @NotNull
    protected final d<E> i2() {
        return this.f313769d;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.w2, kotlinx.coroutines.p2
    public boolean isActive() {
        return super.isActive();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: j2, reason: merged with bridge method [inline-methods] */
    public void g2(@NotNull Unit unit) {
        o0.a.a(this.f313769d, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.d
    @NotNull
    public n0<E> k() {
        return this.f313769d.k();
    }

    @Override // kotlinx.coroutines.channels.o0
    public void n(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f313769d.n(function1);
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return this.f313769d.offer(e10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(E e10) {
        return this.f313769d.p(e10);
    }

    @Override // kotlinx.coroutines.channels.l0
    @NotNull
    public o0<E> s() {
        return this;
    }

    @Override // kotlinx.coroutines.w2
    public void s0(@NotNull Throwable th2) {
        CancellationException cancellationExceptionV1 = w2.V1(this, th2, null, 1, null);
        this.f313769d.e(cancellationExceptionV1);
        m0(cancellationExceptionV1);
    }
}

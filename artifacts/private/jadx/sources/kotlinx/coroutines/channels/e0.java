package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.f3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.l(level = kotlin.n.ERROR, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@f3
public final class e0<E> implements d<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e<E> f313765a;

    private e0(e<E> eVar) {
        this.f313765a = eVar;
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return this.f313765a.B();
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        return this.f313765a.F(th2);
    }

    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f313765a.G(e10, dVar);
    }

    public final E a() {
        return this.f313765a.J2();
    }

    @Nullable
    public final E b() {
        return this.f313765a.L2();
    }

    @Override // kotlinx.coroutines.channels.d
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility only")
    public /* synthetic */ boolean c(Throwable th2) {
        return this.f313765a.c(th2);
    }

    @Override // kotlinx.coroutines.channels.d
    public void e(@Nullable CancellationException cancellationException) {
        this.f313765a.e(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<E, o0<E>> i() {
        return this.f313765a.i();
    }

    @Override // kotlinx.coroutines.channels.d
    @NotNull
    public n0<E> k() {
        return this.f313765a.k();
    }

    @Override // kotlinx.coroutines.channels.o0
    public void n(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f313765a.n(function1);
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return this.f313765a.offer(e10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(E e10) {
        return this.f313765a.p(e10);
    }

    public e0() {
        this(new e(-1));
    }

    public e0(E e10) {
        this();
        p(e10);
    }
}

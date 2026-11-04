package io.ktor.network.sockets;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSocketBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketBase.kt\nio/ktor/network/sockets/SocketBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n64#1,27:127\n64#1,27:154\n120#1:181\n123#1,2:183\n123#1,2:186\n1#2:182\n1#2:185\n1#2:188\n1#2:189\n*S KotlinDebug\n*F\n+ 1 SocketBase.kt\nio/ktor/network/sockets/SocketBase\n*L\n44#1:127,27\n50#1:154,27\n96#1:181\n99#1:183,2\n100#1:186,2\n96#1:182\n99#1:185\n100#1:188\n*E\n"})
public abstract class m0 extends io.ktor.network.selector.i implements e0, kotlinx.coroutines.s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f296286e = AtomicIntegerFieldUpdater.newUpdater(m0.class, "closeFlag");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f296287f = AtomicIntegerFieldUpdater.newUpdater(m0.class, "actualCloseFlag");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296288g = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "readerJob");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296289h = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "writerJob");

    @NotNull
    private volatile /* synthetic */ int actualCloseFlag;

    @NotNull
    private volatile /* synthetic */ int closeFlag;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f296290d;

    @NotNull
    private volatile /* synthetic */ Object readerJob;

    @NotNull
    private volatile /* synthetic */ Object writerJob;

    public m0(@NotNull CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.closeFlag = 0;
        this.actualCloseFlag = 0;
        this.readerJob = null;
        this.writerJob = null;
        this.f296290d = s2.a((p2) parent.get(p2.M2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    public final void t() {
        Throwable cause;
        CancellationException cancellationExceptionG;
        CancellationException cancellationExceptionG2;
        if (this.closeFlag != 0) {
            io.ktor.utils.io.x xVar = (io.ktor.utils.io.x) this.readerJob;
            if (xVar != null && !io.ktor.utils.io.t.k(xVar)) {
                return;
            }
            io.ktor.utils.io.x xVar2 = (io.ktor.utils.io.x) this.writerJob;
            if (xVar2 != null && !io.ktor.utils.io.t.k(xVar2)) {
                return;
            }
            if (f296287f.compareAndSet(this, 0, 1)) {
                io.ktor.utils.io.x xVar3 = (io.ktor.utils.io.x) this.readerJob;
                Throwable cause2 = null;
                if (xVar3 == null) {
                    cause = null;
                } else {
                    if (!io.ktor.utils.io.t.j(xVar3)) {
                        xVar3 = null;
                    }
                    if (xVar3 == null || (cancellationExceptionG2 = io.ktor.utils.io.t.g(xVar3)) == null) {
                        cause = null;
                    } else {
                        cause = cancellationExceptionG2.getCause();
                    }
                }
                io.ktor.utils.io.x xVar4 = (io.ktor.utils.io.x) this.writerJob;
                if (xVar4 != null) {
                    if (!io.ktor.utils.io.t.j(xVar4)) {
                        xVar4 = null;
                    }
                    if (xVar4 != null && (cancellationExceptionG = io.ktor.utils.io.t.g(xVar4)) != null) {
                        cause2 = cancellationExceptionG.getCause();
                    }
                }
                Throwable thX = x(x(cause, cause2), o());
                kotlinx.coroutines.a0 a0VarB8 = b8();
                if (thX == null) {
                    a0VarB8.complete();
                    return;
                }
                a0VarB8.f(thX);
            }
        }
    }

    private final Throwable x(Throwable th2, Throwable th3) {
        if (th2 == null) {
            return th3;
        }
        if (th3 == null || th2 == th3) {
            return th2;
        }
        kotlin.p.a(th2, th3);
        return th2;
    }

    @Override // io.ktor.network.selector.i, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.p pVarB;
        if (f296286e.compareAndSet(this, 0, 1)) {
            io.ktor.utils.io.y0 y0Var = (io.ktor.utils.io.y0) this.readerJob;
            if (y0Var != null && (pVarB = y0Var.b()) != null) {
                io.ktor.utils.io.q.c(pVarB);
            }
            io.ktor.utils.io.d1 d1Var = (io.ktor.utils.io.d1) this.writerJob;
            if (d1Var != null) {
                io.ktor.utils.io.t.d(d1Var);
            }
            t();
        }
    }

    @Override // kotlinx.coroutines.o1
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.sockets.e
    @NotNull
    public final io.ktor.utils.io.y0 e(@NotNull io.ktor.utils.io.b channel) throws IOException {
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            io.ktor.utils.io.t.e(channel, iOException);
            throw iOException;
        }
        io.ktor.utils.io.y0 y0VarR = r(channel);
        if (!androidx.concurrent.futures.b.a(f296288g, this, null, y0VarR)) {
            IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
            io.ktor.utils.io.t.d(y0VarR);
            throw illegalStateException;
        }
        if (this.closeFlag == 0) {
            io.ktor.utils.io.f.b(channel, y0VarR);
            io.ktor.utils.io.t.h(y0VarR, new l0(this));
            return y0VarR;
        }
        IOException iOException2 = new IOException("Socket closed");
        io.ktor.utils.io.t.d(y0VarR);
        io.ktor.utils.io.t.e(channel, iOException2);
        throw iOException2;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return b8();
    }

    @Override // io.ktor.network.sockets.c
    @NotNull
    public final io.ktor.utils.io.d1 l(@NotNull io.ktor.utils.io.b channel) throws IOException {
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            io.ktor.utils.io.t.e(channel, iOException);
            throw iOException;
        }
        io.ktor.utils.io.d1 d1VarQ = q(channel);
        if (!androidx.concurrent.futures.b.a(f296289h, this, null, d1VarQ)) {
            IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
            io.ktor.utils.io.t.d(d1VarQ);
            throw illegalStateException;
        }
        if (this.closeFlag == 0) {
            io.ktor.utils.io.f.b(channel, d1VarQ);
            io.ktor.utils.io.t.h(d1VarQ, new l0(this));
            return d1VarQ;
        }
        IOException iOException2 = new IOException("Socket closed");
        io.ktor.utils.io.t.d(d1VarQ);
        io.ktor.utils.io.t.e(channel, iOException2);
        throw iOException2;
    }

    @Nullable
    public abstract Throwable o();

    @NotNull
    public abstract io.ktor.utils.io.d1 q(@NotNull io.ktor.utils.io.b bVar);

    @NotNull
    public abstract io.ktor.utils.io.y0 r(@NotNull io.ktor.utils.io.b bVar);

    @Override // io.ktor.network.sockets.d
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.a0 b8() {
        return this.f296290d;
    }
}

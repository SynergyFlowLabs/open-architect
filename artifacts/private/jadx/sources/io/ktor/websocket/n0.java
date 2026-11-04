package io.ktor.websocket;

import androidx.collection.g3;
import io.ktor.util.a1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.h f297361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f297362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f297363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private a f297364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f297365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t f297366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<io.ktor.websocket.e> f297367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final p2 f297368h;

    private enum a {
        HEADER,
        BODY,
        CLOSED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f297373e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f297373e;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f297374a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f297374a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {}, l = {120}, m = "handleFrameIfProduced", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f297375a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297377c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297375a = obj;
            this.f297377c |= Integer.MIN_VALUE;
            return n0.this.j(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.f160715o1, 105}, m = "parseLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297379b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297381d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297379b = obj;
            this.f297381d |= Integer.MIN_VALUE;
            return n0.this.k(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.f160725s, com.planner5d.library.engine.input.f.b.X}, m = "readLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297383b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297385d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297383b = obj;
            this.f297385d |= Integer.MIN_VALUE;
            return n0.this.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f297387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.pool.h<ByteBuffer> f297388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0 f297389d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(io.ktor.utils.io.pool.h<ByteBuffer> hVar, n0 n0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f297388c = hVar;
            this.f297389d = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f297388c, this.f297389d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            ByteBuffer byteBuffer;
            m e10;
            h e11;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f297387b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ByteBuffer byteBufferJc = this.f297388c.Jc();
                    try {
                        n0 n0Var = this.f297389d;
                        this.f297386a = byteBufferJc;
                        this.f297387b = 1;
                        if (n0Var.l(byteBufferJc, this) == objL) {
                            return objL;
                        }
                    } catch (h e12) {
                        byteBuffer = byteBufferJc;
                        e11 = e12;
                        this.f297389d.f297367g.F(e11);
                        this.f297388c.h8(byteBuffer);
                        kotlinx.coroutines.channels.o0.a.a(this.f297389d.f297367g, null, 1, null);
                        return Unit.f312394a;
                    } catch (m e13) {
                        byteBuffer = byteBufferJc;
                        e10 = e13;
                        this.f297389d.f297367g.F(e10);
                        this.f297388c.h8(byteBuffer);
                        kotlinx.coroutines.channels.o0.a.a(this.f297389d.f297367g, null, 1, null);
                        return Unit.f312394a;
                    } catch (ClosedChannelException | CancellationException unused) {
                    } catch (IOException unused2) {
                        byteBuffer = byteBufferJc;
                        kotlinx.coroutines.channels.n0.a.b(this.f297389d.f297367g, null, 1, null);
                        this.f297388c.h8(byteBuffer);
                        kotlinx.coroutines.channels.o0.a.a(this.f297389d.f297367g, null, 1, null);
                        return Unit.f312394a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                    byteBuffer = byteBufferJc;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (ByteBuffer) this.f297386a;
                    try {
                        ResultKt.m(obj);
                    } catch (h e14) {
                        e11 = e14;
                        this.f297389d.f297367g.F(e11);
                    } catch (m e15) {
                        e10 = e15;
                        this.f297389d.f297367g.F(e10);
                    } catch (ClosedChannelException | CancellationException unused3) {
                    } catch (IOException unused4) {
                        kotlinx.coroutines.channels.n0.a.b(this.f297389d.f297367g, null, 1, null);
                    } catch (Throwable th4) {
                        th2 = th4;
                        throw th2;
                    }
                }
                this.f297388c.h8(byteBuffer);
                kotlinx.coroutines.channels.o0.a.a(this.f297389d.f297367g, null, 1, null);
                return Unit.f312394a;
            } catch (Throwable th5) {
                this.f297388c.h8((ByteBuffer) objL);
                kotlinx.coroutines.channels.o0.a.a(this.f297389d.f297367g, null, 1, null);
                throw th5;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n0(@NotNull io.ktor.utils.io.h byteChannel, @NotNull CoroutineContext coroutineContext, long j10, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(byteChannel, "byteChannel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f297361a = byteChannel;
        this.f297362b = coroutineContext;
        this.f297363c = j10;
        this.f297364d = a.HEADER;
        this.f297365e = new g();
        this.f297366f = new t();
        this.f297367g = kotlinx.coroutines.channels.s.d(8, null, null, 6, null);
        this.f297368h = kotlinx.coroutines.i.d(this, new r0("ws-reader"), u0.ATOMIC, new f(pool, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object j(kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f297377c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f297377c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f297375a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f297377c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!this.f297366f.a()) {
                this.f297364d = this.f297365e.e() == i.CLOSE ? a.CLOSED : a.HEADER;
                g gVar = this.f297365e;
                io.ktor.websocket.e eVarA = io.ktor.websocket.e.f297265i.a(gVar.d(), gVar.e(), a1.i(this.f297366f.d(gVar.h())), gVar.i(), gVar.j(), gVar.k());
                kotlinx.coroutines.channels.p<io.ktor.websocket.e> pVar = this.f297367g;
                cVar.f297377c = 1;
                if (pVar.G(eVarA, cVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.f297365e.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object k(ByteBuffer byteBuffer, kotlin.coroutines.d<? super Unit> dVar) throws h {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f297381d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f297381d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f297379b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f297381d;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) dVar2.f297378a;
        }
        ResultKt.m(obj);
        while (byteBuffer.hasRemaining()) {
            int i12 = b.f297374a[this.f297364d.ordinal()];
            if (i12 == 1) {
                this.f297365e.b(byteBuffer);
                if (!this.f297365e.c()) {
                    return Unit.f312394a;
                }
                this.f297364d = a.BODY;
                if (this.f297365e.f() > g3.f12256c || this.f297365e.f() > this.f297363c) {
                    throw new h(this.f297365e.f());
                }
                this.f297366f.c((int) this.f297365e.f(), byteBuffer);
                dVar2.f297378a = byteBuffer;
                dVar2.f297381d = 1;
                if (j(dVar2) == objL) {
                    return objL;
                }
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        return Unit.f312394a;
                    }
                    throw new kotlin.k0();
                }
                this.f297366f.b(byteBuffer);
                dVar2.f297378a = byteBuffer;
                dVar2.f297381d = 2;
                if (j(dVar2) == objL) {
                    return objL;
                }
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[PHI: r7 r8
      0x0067: PHI (r7v1 java.nio.ByteBuffer) = (r7v3 java.nio.ByteBuffer), (r7v6 java.nio.ByteBuffer) binds: [B:20:0x0064, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r8v2 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:20:0x0064, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (k(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:28:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.nio.ByteBuffer r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.websocket.n0.e
            if (r0 == 0) goto L17
            r0 = r8
            r0 = r8
            io.ktor.websocket.n0$e r0 = (io.ktor.websocket.n0.e) r0
            r5 = 0
            int r1 = r0.f297385d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            r3 = r1 & r2
            r5 = 0
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f297385d = r1
            goto L1d
        L17:
            r5 = 6
            io.ktor.websocket.n0$e r0 = new io.ktor.websocket.n0$e
            r0.<init>(r8)
        L1d:
            java.lang.Object r8 = r0.f297383b
            r5 = 2
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297385d
            r3 = 2
            r5 = r5 ^ r3
            r4 = 1
            r5 = 6
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L42
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f297382a
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            r5 = 5
            kotlin.ResultKt.m(r8)
            goto L86
        L39:
            r5 = 6
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r7 = r0.f297382a
            r5 = 6
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            kotlin.ResultKt.m(r8)
            goto L67
        L4b:
            kotlin.ResultKt.m(r8)
            r5 = 6
            r7.clear()
        L52:
            r5 = 4
            io.ktor.websocket.n0$a r8 = r6.f297364d
            io.ktor.websocket.n0$a r2 = io.ktor.websocket.n0.a.CLOSED
            if (r8 == r2) goto L8a
            io.ktor.utils.io.h r8 = r6.f297361a
            r0.f297382a = r7
            r5 = 2
            r0.f297385d = r4
            java.lang.Object r8 = io.ktor.utils.io.m.k(r8, r7, r0)
            if (r8 != r1) goto L67
            goto L85
        L67:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r2 = -1
            if (r8 != r2) goto L76
            io.ktor.websocket.n0$a r7 = io.ktor.websocket.n0.a.CLOSED
            r6.f297364d = r7
            r5 = 6
            goto L8a
        L76:
            r7.flip()
            r0.f297382a = r7
            r5 = 2
            r0.f297385d = r3
            java.lang.Object r8 = r6.k(r7, r0)
            r5 = 0
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            r7.compact()
            goto L52
        L8a:
            r5 = 0
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.n0.l(java.nio.ByteBuffer, kotlin.coroutines.d):java.lang.Object");
    }

    public final void R0(long j10) {
        this.f297363c = j10;
    }

    public final long T() {
        return this.f297363c;
    }

    @NotNull
    public final kotlinx.coroutines.channels.n0<io.ktor.websocket.e> a() {
        return this.f297367g;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f297362b;
    }

    public /* synthetic */ n0(io.ktor.utils.io.h hVar, CoroutineContext coroutineContext, long j10, io.ktor.utils.io.pool.h hVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, coroutineContext, j10, (i10 & 8) != 0 ? io.ktor.util.cio.a.a() : hVar2);
    }
}

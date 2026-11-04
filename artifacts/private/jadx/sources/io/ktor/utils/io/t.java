package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteWriteChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannelOperations.kt\nio/ktor/utils/io/ByteWriteChannelOperationsKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,236:1\n195#2,28:237\n*S KotlinDebug\n*F\n+ 1 ByteWriteChannelOperations.kt\nio/ktor/utils/io/ByteWriteChannelOperationsKt\n*L\n215#1:237,28\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f297143a = new a();

    public static final class a implements kotlin.coroutines.d<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoroutineContext f297144a = kotlin.coroutines.h.f312451a;

        a() {
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            return this.f297144a;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        b(Object obj) {
            super(1, obj, p.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) this.receiver).g(dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0}, l = {218}, m = "write", n = {"written"}, s = {"I$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297147c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297146b = obj;
            this.f297147c |= Integer.MIN_VALUE;
            return t.m(null, 0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0, 0}, l = {114}, m = "writePacket", n = {"$this$writePacket", "source"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297151d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297150c = obj;
            this.f297151d |= Integer.MIN_VALUE;
            return t.y(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", i = {0, 0, 1, 3, 5}, l = {173, 183, 184, 183, 184, 183, 184}, m = "invokeSuspend", n = {"$this$launch", "nested", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nByteWriteChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannelOperations.kt\nio/ktor/utils/io/ByteWriteChannelOperationsKt$writer$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f297153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f297154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<e1, kotlin.coroutines.d<? super Unit>, Object> f297155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f297156e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super e1, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, io.ktor.utils.io.b bVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f297155d = function2;
            this.f297156e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f297155d, this.f297156e, dVar);
            eVar.f297154c = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:19:0x0060, B:27:0x00a4, B:29:0x00b7, B:24:0x007f), top: B:70:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:48:0x0131  */
        /* JADX WARN: Code duplicated, block: B:61:0x0164  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.p2] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.a0, kotlinx.coroutines.p2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.utils.io.b bVar;
            io.ktor.utils.io.b bVar2;
            Throwable th2;
            Throwable th3;
            kotlinx.coroutines.s0 s0Var;
            io.ktor.utils.io.b bVar3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f297153b;
            try {
                try {
                    switch (r10) {
                        case 0:
                            ResultKt.m(obj);
                            s0Var = (kotlinx.coroutines.s0) this.f297154c;
                            kotlinx.coroutines.a0 a0VarA = s2.a(s2.A(s0Var.getCoroutineContext()));
                            Function2<e1, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f297155d;
                            e1 e1Var = new e1(this.f297156e, s0Var.getCoroutineContext().plus(a0VarA));
                            this.f297154c = s0Var;
                            this.f297152a = a0VarA;
                            this.f297153b = 1;
                            r10 = a0VarA;
                            if (function2.invoke(e1Var, this) != objL) {
                                r10.complete();
                                if (s2.A(s0Var.getCoroutineContext()).isCancelled()) {
                                    this.f297156e.c(s2.A(s0Var.getCoroutineContext()).y0());
                                }
                                this.f297154c = s0Var;
                                this.f297152a = null;
                                this.f297153b = 2;
                                if (r10.d1(this) != objL) {
                                    bVar3 = this.f297156e;
                                    Result.a aVar = Result.Companion;
                                    this.f297154c = null;
                                    this.f297153b = 3;
                                    if (bVar3.g(this) == objL) {
                                    }
                                    Result.m785constructorimpl(Unit.f312394a);
                                    return Unit.f312394a;
                                }
                                break;
                            }
                            return objL;
                        case 1:
                            kotlinx.coroutines.a0 a0Var = (kotlinx.coroutines.a0) this.f297152a;
                            s0Var = (kotlinx.coroutines.s0) this.f297154c;
                            ResultKt.m(obj);
                            r10 = a0Var;
                            r10.complete();
                            if (s2.A(s0Var.getCoroutineContext()).isCancelled()) {
                                this.f297156e.c(s2.A(s0Var.getCoroutineContext()).y0());
                                break;
                            }
                            this.f297154c = s0Var;
                            this.f297152a = null;
                            this.f297153b = 2;
                            if (r10.d1(this) != objL) {
                                bVar3 = this.f297156e;
                                Result.a aVar2 = Result.Companion;
                                this.f297154c = null;
                                this.f297153b = 3;
                                if (bVar3.g(this) == objL) {
                                }
                                Result.m785constructorimpl(Unit.f312394a);
                                return Unit.f312394a;
                            }
                            return objL;
                        case 2:
                            ResultKt.m(obj);
                            bVar3 = this.f297156e;
                            Result.a aVar3 = Result.Companion;
                            this.f297154c = null;
                            this.f297153b = 3;
                            if (bVar3.g(this) == objL) {
                                return objL;
                            }
                            Result.m785constructorimpl(Unit.f312394a);
                            return Unit.f312394a;
                        case 3:
                            ResultKt.m(obj);
                            Result.m785constructorimpl(Unit.f312394a);
                            return Unit.f312394a;
                        case 4:
                            ResultKt.m(obj);
                            bVar = this.f297156e;
                            Result.a aVar4 = Result.Companion;
                            this.f297154c = null;
                            this.f297153b = 5;
                            if (bVar.g(this) == objL) {
                                return objL;
                            }
                            Result.m785constructorimpl(Unit.f312394a);
                            return Unit.f312394a;
                        case 5:
                            ResultKt.m(obj);
                            Result.m785constructorimpl(Unit.f312394a);
                            return Unit.f312394a;
                        case 6:
                            Throwable th4 = (Throwable) this.f297152a;
                            ResultKt.m(obj);
                            th = th4;
                            bVar2 = this.f297156e;
                            try {
                                Result.a aVar5 = Result.Companion;
                                this.f297154c = th;
                                this.f297152a = null;
                                this.f297153b = 7;
                                if (bVar2.g(this) != objL) {
                                    th3 = th;
                                    Result.m785constructorimpl(Unit.f312394a);
                                    throw th3;
                                }
                                return objL;
                            } catch (Throwable th5) {
                                Throwable th6 = th;
                                th2 = th5;
                                th3 = th6;
                                Result.a aVar6 = Result.Companion;
                                Result.m785constructorimpl(ResultKt.createFailure(th2));
                                throw th3;
                            }
                        case 7:
                            th3 = (Throwable) this.f297154c;
                            try {
                                ResultKt.m(obj);
                                Result.m785constructorimpl(Unit.f312394a);
                                throw th3;
                            } catch (Throwable th7) {
                                th2 = th7;
                                Result.a aVar7 = Result.Companion;
                                Result.m785constructorimpl(ResultKt.createFailure(th2));
                                throw th3;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th8) {
                    try {
                        s2.g(r10, "Exception thrown while writing to channel", th8);
                        this.f297156e.c(th8);
                        this.f297154c = s0Var;
                        this.f297152a = null;
                        this.f297153b = 4;
                        if (r10.d1(this) != objL) {
                            bVar = this.f297156e;
                            Result.a aVar8 = Result.Companion;
                            this.f297154c = null;
                            this.f297153b = 5;
                            if (bVar.g(this) == objL) {
                            }
                            Result.m785constructorimpl(Unit.f312394a);
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        this.f297154c = s0Var;
                        this.f297152a = th;
                        this.f297153b = 6;
                        if (r10.d1(this) != objL) {
                            bVar2 = this.f297156e;
                            Result.a aVar9 = Result.Companion;
                            this.f297154c = th;
                            this.f297152a = null;
                            this.f297153b = 7;
                            if (bVar2.g(this) != objL) {
                                th3 = th;
                                Result.m785constructorimpl(Unit.f312394a);
                                throw th3;
                            }
                        }
                    }
                    return objL;
                }
            } catch (Throwable th10) {
                Result.a aVar10 = Result.Companion;
                Result.m785constructorimpl(ResultKt.createFailure(th10));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object A(@NotNull p pVar, @NotNull kotlinx.io.c0 c0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objY = y(pVar, c0Var, dVar);
        return objY == kotlin.coroutines.intrinsics.b.l() ? objY : Unit.f312394a;
    }

    @Nullable
    public static final Object B(@NotNull p pVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        ui.u.p(pVar.i(), str, 0, 0, null, 14, null);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object C(@NotNull p pVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        ui.u.p(pVar.i(), str, 0, 0, null, 14, null);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @NotNull
    public static final d1 D(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull final io.ktor.utils.io.b channel, @NotNull Function2<? super e1, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        p2 p2VarF = kotlinx.coroutines.k.f(s0Var, coroutineContext, null, new e(block, channel, null), 2, null);
        p2VarF.E(new Function1() { // from class: io.ktor.utils.io.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.H(channel, (Throwable) obj);
            }
        });
        return new d1(channel, p2VarF);
    }

    @NotNull
    public static final d1 E(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull CoroutineContext coroutineContext, boolean z10, @NotNull Function2<? super e1, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return D(s0Var, coroutineContext, new io.ktor.utils.io.b(false, 1, null), block);
    }

    public static /* synthetic */ d1 F(kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, io.ktor.utils.io.b bVar, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return D(s0Var, coroutineContext, bVar, function2);
    }

    public static /* synthetic */ d1 G(kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(s0Var, coroutineContext, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(io.ktor.utils.io.b bVar, Throwable th2) {
        if (th2 != null && !bVar.h()) {
            bVar.c(th2);
        }
        return Unit.f312394a;
    }

    @Nullable
    public static final Object c(@NotNull p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = pVar.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    public static final void d(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        p2.a.b(xVar.a(), null, 1, null);
    }

    public static final void e(@NotNull p pVar, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (th2 == null) {
            f(new b(pVar));
        } else {
            pVar.c(th2);
        }
    }

    public static final <R> void f(@NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        bk.a.d(function1, f297143a);
    }

    @NotNull
    public static final CancellationException g(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return xVar.a().y0();
    }

    public static final void h(@NotNull x xVar, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        xVar.a().E(new Function1() { // from class: io.ktor.utils.io.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.i(block, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0, Throwable th2) {
        function0.invoke();
        return Unit.f312394a;
    }

    public static final boolean j(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return xVar.a().isCancelled();
    }

    public static final boolean k(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return xVar.a().x();
    }

    @Nullable
    public static final Object l(@NotNull x xVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD1 = xVar.a().d1(dVar);
        return objD1 == kotlin.coroutines.intrinsics.b.l() ? objD1 : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object m(@NotNull p pVar, int i10, @NotNull pj.n<? super byte[], ? super Integer, ? super Integer, Integer> nVar, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        c cVar;
        int i11;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.f297147c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f297147c = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f297146b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = cVar.f297147c;
        if (i13 == 0) {
            ResultKt.m(obj);
            int iF = ui.j.f(pVar.i());
            kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
            kotlinx.io.b bVarN = pVar.i().n();
            kotlinx.io.t tVarR = bVarN.R(i10);
            byte[] bArrB = tVarR.b(false);
            int iIntValue = nVar.invoke(bArrB, kotlin.coroutines.jvm.internal.b.f(tVarR.d()), kotlin.coroutines.jvm.internal.b.f(bArrB.length)).intValue();
            if (iIntValue == i10) {
                tVarR.I(bArrB, iIntValue);
                tVarR.x(tVarR.d() + iIntValue);
                bVarN.H(bVarN.l() + ((long) iIntValue));
            } else {
                if (iIntValue < 0 || iIntValue > tVarR.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + iIntValue + ". Should be in 0.." + tVarR.l()).toString());
                }
                if (iIntValue != 0) {
                    tVarR.I(bArrB, iIntValue);
                    tVarR.x(tVarR.d() + iIntValue);
                    bVarN.H(bVarN.l() + ((long) iIntValue));
                } else if (kotlinx.io.v.d(tVarR)) {
                    bVarN.y();
                }
            }
            int iF2 = ui.j.f(pVar.i()) - iF;
            cVar.f297145a = iF2;
            cVar.f297147c = 1;
            if (q.d(pVar, cVar) == objL) {
                return objL;
            }
            i11 = iF2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = cVar.f297145a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(i11);
    }

    public static /* synthetic */ Object n(p pVar, int i10, pj.n nVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return m(pVar, i10, nVar, dVar);
    }

    @Nullable
    public static final Object o(@NotNull p pVar, @NotNull kotlinx.io.p pVar2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objY = y(pVar, kotlinx.io.g.b(pVar2), dVar);
        return objY == kotlin.coroutines.intrinsics.b.l() ? objY : Unit.f312394a;
    }

    @Nullable
    public static final Object p(@NotNull p pVar, byte b10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        pVar.i().m6(b10);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object q(@NotNull p pVar, @NotNull byte[] bArr, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.io.x.X3(pVar.i(), bArr, 0, 0, 6, null);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object r(@NotNull p pVar, double d10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.io.b0.b(pVar.i(), d10);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object s(@NotNull p pVar, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.io.b0.d(pVar.i(), f10);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object t(@NotNull p pVar, @NotNull byte[] bArr, int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        pVar.i().write(bArr, i10, i11);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    public static /* synthetic */ Object u(p pVar, byte[] bArr, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return t(pVar, bArr, i10, i11, dVar);
    }

    @Nullable
    public static final Object v(@NotNull p pVar, int i10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        pVar.i().writeInt(i10);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object w(@NotNull p pVar, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        pVar.i().writeLong(j10);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object x(@NotNull p pVar, @NotNull kotlinx.io.b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        pVar.i().la(bVar);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object y(@NotNull p pVar, @NotNull kotlinx.io.c0 c0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f297151d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f297151d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f297150c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f297151d;
        if (i11 == 0) {
            ResultKt.m(obj);
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.io.c0 c0Var2 = (kotlinx.io.c0) dVar2.f297149b;
            p pVar2 = (p) dVar2.f297148a;
            ResultKt.m(obj);
            c0Var = c0Var2;
            pVar = pVar2;
        }
        while (!c0Var.y1()) {
            pVar.i().Rd(c0Var, ui.l.j(c0Var));
            dVar2.f297148a = pVar;
            dVar2.f297149b = c0Var;
            dVar2.f297151d = 1;
            if (q.d(pVar, dVar2) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @Nullable
    public static final Object z(@NotNull p pVar, short s10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        pVar.i().oc(s10);
        Object objD = q.d(pVar, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }
}

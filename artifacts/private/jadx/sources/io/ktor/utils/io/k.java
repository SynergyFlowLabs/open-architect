package io.ktor.utils.io;

import com.appsflyer.AppsFlyerProperties;
import io.sentry.n7;
import java.io.EOFException;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteReadChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,677:1\n1#2:678\n1#2:683\n21#3,3:679\n99#4:682\n100#4,8:684\n*S KotlinDebug\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n*L\n492#1:683\n212#1:679,3\n492#1:682\n492#1:684,8\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte f296941a = 13;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f296942b = 10;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160706l1, 96}, m = "awaitUntilReadable", n = {"$this$awaitUntilReadable", "numberOfBytes", "$this$awaitUntilReadable", "numberOfBytes"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296946d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296945c = obj;
            this.f296946d |= Integer.MIN_VALUE;
            return k.d(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {577}, m = "readUntil$appendPartialMatch", n = {"matchIndex", "rc"}, s = {"L$0", "L$1"})
    static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296950d;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296949c = obj;
            this.f296950d |= Integer.MIN_VALUE;
            return k.S(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {androidx.media2.widget.f.i.f59767c0, 138, com.planner5d.library.engine.input.f.b.F1, com.planner5d.library.engine.input.f.b.F1}, m = "copyAndClose", n = {"$this$copyAndClose", AppsFlyerProperties.CHANNEL, "result", "$this$copyAndClose", AppsFlyerProperties.CHANNEL, "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f296953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296955e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296954d = obj;
            this.f296955e |= Integer.MIN_VALUE;
            return k.f(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    static final class b0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p2 f296957b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(p2 p2Var, kotlin.coroutines.d<? super b0> dVar) {
            super(1, dVar);
            this.f296957b = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b0(this.f296957b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296956a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p2 p2Var = this.f296957b;
                this.f296956a = 1;
                if (p2Var.d1(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {176, 177, 184, 184}, m = "copyTo", n = {"$this$copyTo", AppsFlyerProperties.CHANNEL, "result", "$this$copyTo", AppsFlyerProperties.CHANNEL, "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f296960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296962e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296961d = obj;
            this.f296962e |= Integer.MIN_VALUE;
            return k.h(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {322, 332, 332, 332}, m = "invokeSuspend", n = {"$this$launch", "nested"}, s = {"L$0", "L$1"})
    static final class c0 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f296965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<z0, kotlin.coroutines.d<? super Unit>, Object> f296966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f296967e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c0(Function2<? super z0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, io.ktor.utils.io.b bVar, kotlin.coroutines.d<? super c0> dVar) {
            super(2, dVar);
            this.f296966d = function2;
            this.f296967e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c0 c0Var = new c0(this.f296966d, this.f296967e, dVar);
            c0Var.f296965c = obj;
            return c0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.p2] */
        /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.a0, kotlinx.coroutines.p2] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            kotlinx.coroutines.s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            ?? r10 = this.f296964b;
            try {
                if (r10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) this.f296965c;
                    kotlinx.coroutines.a0 a0VarA = s2.a(s2.A(s0Var2.getCoroutineContext()));
                    Function2<z0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f296966d;
                    z0 z0Var = new z0(this.f296967e, s0Var2.getCoroutineContext().plus(a0VarA));
                    this.f296965c = s0Var2;
                    this.f296963a = a0VarA;
                    this.f296964b = 1;
                    if (function2.invoke(z0Var, this) != objL) {
                        s0Var = s0Var2;
                        r10 = a0VarA;
                    }
                    return objL;
                }
                if (r10 == 1) {
                    kotlinx.coroutines.a0 a0Var = (kotlinx.coroutines.a0) this.f296963a;
                    s0Var = (kotlinx.coroutines.s0) this.f296965c;
                    ResultKt.m(obj);
                    r10 = a0Var;
                } else {
                    if (r10 != 2 && r10 != 3) {
                        if (r10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f296965c;
                        ResultKt.m(obj);
                        throw th2;
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
                r10.complete();
                if (s2.A(s0Var.getCoroutineContext()).isCancelled()) {
                    this.f296967e.c(s2.A(s0Var.getCoroutineContext()).y0());
                }
                this.f296965c = null;
                this.f296963a = null;
                this.f296964b = 2;
                if (r10.d1(this) == objL) {
                    return objL;
                }
            } catch (Throwable th3) {
                try {
                    s2.g(r10, "Exception thrown while reading from channel", th3);
                    io.ktor.utils.io.t.e(this.f296967e, th3);
                    this.f296965c = null;
                    this.f296963a = null;
                    this.f296964b = 3;
                    if (r10.d1(this) == objL) {
                        return objL;
                    }
                    return Unit.f312394a;
                } catch (Throwable th4) {
                    this.f296965c = th4;
                    this.f296963a = null;
                    this.f296964b = 4;
                    if (r10.d1(this) != objL) {
                        th2 = th4;
                        throw th2;
                    }
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {195, 199, 206, 206}, m = "copyTo", n = {"$this$copyTo", AppsFlyerProperties.CHANNEL, "limit", "remaining", "$this$copyTo", AppsFlyerProperties.CHANNEL, "limit", "remaining", "limit", "remaining"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$0", "J$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f296970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f296971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f296972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f296973f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296972e = obj;
            this.f296973f |= Integer.MIN_VALUE;
            return k.g(null, null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {654, 655}, m = "skipIfFound", n = {"$this$skipIfFound", "byteString"}, s = {"L$0", "L$1"})
    static final class d0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296977d;

        d0(kotlin.coroutines.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296976c = obj;
            this.f296977d |= Integer.MIN_VALUE;
            return k.c0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {382}, m = "discard", n = {"$this$discard", "max", "remaining"}, s = {"L$0", "J$0", "J$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f296979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f296980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296982e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296981d = obj;
            this.f296982e |= Integer.MIN_VALUE;
            return k.i(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {}, l = {38}, m = "toByteArray", n = {}, s = {})
    static final class e0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296984b;

        e0(kotlin.coroutines.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296983a = obj;
            this.f296984b |= Integer.MIN_VALUE;
            return k.d0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {374}, m = "discardExact", n = {"value"}, s = {"J$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f296985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296987c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296986b = obj;
            this.f296987c |= Integer.MIN_VALUE;
            return k.k(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {33}, m = "exhausted", n = {"$this$exhausted"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296990c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296989b = obj;
            this.f296990c |= Integer.MIN_VALUE;
            return k.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {674}, m = "peek", n = {"$this$peek", "count"}, s = {"L$0", "I$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296994d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296993c = obj;
            this.f296994d |= Integer.MIN_VALUE;
            return k.q(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 1, 1}, l = {488, com.facebook.internal.p.f100033q}, m = "read", n = {"$this$read", "block", "result", "buffer$iv", "head$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f296999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297000f;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296999e = obj;
            this.f297000f |= Integer.MIN_VALUE;
            return k.r(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {264}, m = "readAvailable", n = {"$this$readAvailable", "buffer", androidx.constraintlayout.core.motion.utils.v.c.R, n7.b.f305917e}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f297005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297006f;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297005e = obj;
            this.f297006f |= Integer.MIN_VALUE;
            return k.u(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.k$k, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "readBuffer", n = {"$this$readBuffer", "result"}, s = {"L$0", "L$1"})
    static final class C2104k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297010d;

        C2104k(kotlin.coroutines.d<? super C2104k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297009c = obj;
            this.f297010d |= Integer.MIN_VALUE;
            return k.x(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {121}, m = "readBuffer", n = {"$this$readBuffer", "result", "remaining"}, s = {"L$0", "L$1", "I$0"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f297014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297015e;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297014d = obj;
            this.f297015e |= Integer.MIN_VALUE;
            int i10 = 3 << 0;
            return k.w(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {44}, m = "readByte", n = {"$this$readByte"}, s = {"L$0"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297018c;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297017b = obj;
            this.f297018c |= Integer.MIN_VALUE;
            return k.y(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {214}, m = "readByteArray", n = {"$this$readByteArray", "builder$iv", "$this$readByteArray_u24lambda_u242", "count"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f297023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297024f;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297023e = obj;
            this.f297024f |= Integer.MIN_VALUE;
            int i10 = 2 >> 0;
            return k.z(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {90}, m = "readDouble", n = {"$this$readDouble"}, s = {"L$0"})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297027c;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297026b = obj;
            this.f297027c |= Integer.MIN_VALUE;
            int i10 = 0 >> 0;
            return k.A(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "readFloat", n = {"$this$readFloat"}, s = {"L$0"})
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297030c;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297029b = obj;
            this.f297030c |= Integer.MIN_VALUE;
            return k.B(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {522}, m = "readFully", n = {"$this$readFully", "out", "end", androidx.constraintlayout.core.motion.utils.v.c.R}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f297035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297036f;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297035e = obj;
            this.f297036f |= Integer.MIN_VALUE;
            return k.C(null, null, 0, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "readInt", n = {"$this$readInt"}, s = {"L$0"})
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297039c;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297038b = obj;
            this.f297039c |= Integer.MIN_VALUE;
            return k.E(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.X}, m = "readLong", n = {"$this$readLong"}, s = {"L$0"})
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297042c;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297041b = obj;
            this.f297042c |= Integer.MIN_VALUE;
            return k.F(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {357}, m = "readPacket", n = {"$this$readPacket", "result", "packet"}, s = {"L$0", "L$1", "I$0"})
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f297046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297047e;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297046d = obj;
            this.f297047e |= Integer.MIN_VALUE;
            return k.G(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {224}, m = "readRemaining", n = {"$this$readRemaining", "result"}, s = {"L$0", "L$1"})
    static final class u extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297051d;

        u(kotlin.coroutines.d<? super u> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297050c = obj;
            this.f297051d |= Integer.MIN_VALUE;
            int i10 = 3 | 0;
            return k.I(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {244}, m = "readRemaining", n = {"$this$readRemaining", "result", "remaining"}, s = {"L$0", "L$1", "J$0"})
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f297054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f297055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297056e;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297055d = obj;
            this.f297056e |= Integer.MIN_VALUE;
            return k.H(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "readShort", n = {"$this$readShort"}, s = {"L$0"})
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297059c;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297058b = obj;
            this.f297059c |= Integer.MIN_VALUE;
            int i10 = 1 >> 0;
            return k.J(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {166}, m = "readUTF8Line", n = {"result"}, s = {"L$0"})
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297062c;

        x(kotlin.coroutines.d<? super x> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297061b = obj;
            this.f297062c |= Integer.MIN_VALUE;
            return k.K(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {435, 450, 474}, m = "readUTF8LineTo-RRvyBJ8", n = {"$this$readUTF8LineTo_u2dRRvyBJ8", "out", "max", "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "max", "lineEnding"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0", "I$1"})
    static final class y extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f297066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f297069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f297070h;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297069g = obj;
            this.f297070h |= Integer.MIN_VALUE;
            return k.O(null, null, 0, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4}, l = {589, 592, androidx.constraintlayout.core.motion.utils.v.e.f44049r, androidx.constraintlayout.core.motion.utils.v.e.B, 613}, m = "readUntil", n = {"$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", io.sentry.profilemeasurements.a.f306070m, "$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "writeChannel", "rc", "rc"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "B$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$0"})
    static final class z extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f297074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f297075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f297076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f297077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f297078h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f297079i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        byte f297080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f297081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f297082l;

        z(kotlin.coroutines.d<? super z> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297081k = obj;
            this.f297082l |= Integer.MIN_VALUE;
            int i10 = 4 | 0;
            return k.R(null, null, null, 0L, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public static final Object A(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Double> dVar) {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f297027c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f297027c = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object obj = oVar.f297026b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f297027c;
        if (i11 == 0) {
            ResultKt.m(obj);
            oVar.f297025a = hVar;
            oVar.f297027c = 1;
            if (d(hVar, 8, oVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) oVar.f297025a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.d(kotlinx.io.g0.g(hVar.j()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object B(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        p pVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.f297030c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f297030c = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.f297029b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = pVar.f297030c;
        if (i11 == 0) {
            ResultKt.m(obj);
            pVar.f297028a = hVar;
            pVar.f297030c = 1;
            if (d(hVar, 4, pVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) pVar.f297028a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.e(kotlinx.io.g0.i(hVar.j()));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0067 -> B:29:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0080 -> B:28:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object C(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r9, @org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            r8 = 7
            boolean r0 = r13 instanceof io.ktor.utils.io.k.q
            if (r0 == 0) goto L16
            r0 = r13
            io.ktor.utils.io.k$q r0 = (io.ktor.utils.io.k.q) r0
            int r1 = r0.f297036f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            r8 = 6
            int r1 = r1 - r2
            r8 = 3
            r0.f297036f = r1
            goto L1b
        L16:
            io.ktor.utils.io.k$q r0 = new io.ktor.utils.io.k$q
            r0.<init>(r13)
        L1b:
            java.lang.Object r13 = r0.f297035e
            r8 = 2
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297036f
            r8 = 1
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 != r4) goto L3d
            int r9 = r0.f297034d
            int r10 = r0.f297033c
            r8 = 3
            java.lang.Object r11 = r0.f297032b
            byte[] r11 = (byte[]) r11
            java.lang.Object r12 = r0.f297031a
            io.ktor.utils.io.h r12 = (io.ktor.utils.io.h) r12
            kotlin.ResultKt.m(r13)
            goto L87
        L3d:
            r8 = 1
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L46:
            kotlin.ResultKt.m(r13)
            if (r12 <= r11) goto L5c
            r8 = 1
            boolean r13 = r9.k()
            r8 = 2
            if (r13 != 0) goto L54
            goto L5c
        L54:
            r8 = 4
            java.io.EOFException r9 = new java.io.EOFException
            r8 = 0
            r9.<init>(r3)
            throw r9
        L5c:
            if (r11 >= r12) goto Lb7
            kotlinx.io.c0 r13 = r9.j()
            r8 = 6
            boolean r13 = r13.y1()
            if (r13 == 0) goto L8c
            r0.f297031a = r9
            r8 = 3
            r0.f297032b = r10
            r8 = 1
            r0.f297033c = r12
            r0.f297034d = r11
            r0.f297036f = r4
            r8 = 4
            r13 = 0
            r2 = 0
            r8 = r8 ^ r2
            java.lang.Object r13 = io.ktor.utils.io.h.b.a(r9, r13, r0, r4, r2)
            if (r13 != r1) goto L80
            return r1
        L80:
            r7 = r12
            r12 = r9
            r12 = r9
            r9 = r11
            r11 = r10
            r11 = r10
            r10 = r7
        L87:
            r7 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r7
        L8c:
            r8 = 0
            boolean r13 = r9.k()
            r8 = 2
            if (r13 != 0) goto Lb0
            int r13 = r12 - r11
            kotlinx.io.c0 r2 = r9.j()
            r8 = 1
            long r5 = ui.l.j(r2)
            int r2 = (int) r5
            int r13 = java.lang.Math.min(r13, r2)
            kotlinx.io.c0 r2 = r9.j()
            int r13 = r13 + r11
            r8 = 1
            kotlinx.io.g0.o(r2, r10, r11, r13)
            r11 = r13
            r8 = 6
            goto L5c
        Lb0:
            java.io.EOFException r9 = new java.io.EOFException
            r8 = 3
            r9.<init>(r3)
            throw r9
        Lb7:
            r8 = 3
            kotlin.Unit r9 = kotlin.Unit.f312394a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.C(io.ktor.utils.io.h, byte[], int, int, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object D(io.ktor.utils.io.h hVar, byte[] bArr, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return C(hVar, bArr, i10, i11, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object E(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        r rVar;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f297039c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f297039c = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object obj = rVar.f297038b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = rVar.f297039c;
        if (i11 == 0) {
            ResultKt.m(obj);
            rVar.f297037a = hVar;
            rVar.f297039c = 1;
            if (d(hVar, 4, rVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) rVar.f297037a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(hVar.j().readInt());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object F(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        s sVar;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i10 = sVar.f297042c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f297042c = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        Object obj = sVar.f297041b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = sVar.f297042c;
        if (i11 == 0) {
            ResultKt.m(obj);
            sVar.f297040a = hVar;
            sVar.f297042c = 1;
            if (d(hVar, 8, sVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) sVar.f297040a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.g(hVar.j().readLong());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[PHI: r12 r13 r14
      0x0082: PHI (r12v5 io.ktor.utils.io.h) = (r12v3 io.ktor.utils.io.h), (r12v7 io.ktor.utils.io.h) binds: [B:18:0x0067, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r13v8 kotlinx.io.b) = (r13v7 kotlinx.io.b), (r13v9 kotlinx.io.b) binds: [B:18:0x0067, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:18:0x0067, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:24:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:23:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object G(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r12, int r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlinx.io.c0> r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.G(io.ktor.utils.io.h, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final Object H(@NotNull io.ktor.utils.io.h hVar, long j10, @NotNull kotlin.coroutines.d<? super kotlinx.io.c0> dVar) {
        v vVar;
        kotlinx.io.x xVarA;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i10 = vVar.f297056e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f297056e = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(dVar);
            }
        } else {
            vVar = new v(dVar);
        }
        Object obj = vVar.f297055d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = vVar.f297056e;
        if (i11 == 0) {
            ResultKt.m(obj);
            xVarA = ui.j.a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j11 = vVar.f297054c;
            kotlinx.io.x xVar = (kotlinx.io.x) vVar.f297053b;
            io.ktor.utils.io.h hVar2 = (io.ktor.utils.io.h) vVar.f297052a;
            ResultKt.m(obj);
            xVarA = xVar;
            j10 = j11;
            hVar = hVar2;
        }
        while (!hVar.k()) {
            long j12 = 0;
            if (j10 <= 0) {
                break;
            }
            if (j10 >= ui.l.j(hVar.j())) {
                j12 = j10 - ui.l.j(hVar.j());
                kotlin.coroutines.jvm.internal.b.g(hVar.j().T8(xVarA));
            } else {
                hVar.j().ic(xVarA, j10);
            }
            vVar.f297052a = hVar;
            vVar.f297053b = xVarA;
            vVar.f297054c = j12;
            vVar.f297056e = 1;
            if (io.ktor.utils.io.h.b.a(hVar, 0, vVar, 1, null) == objL) {
                return objL;
            }
            j10 = j12;
        }
        return xVarA.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object I(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super kotlinx.io.c0> dVar) throws Throwable {
        u uVar;
        kotlinx.io.x xVarA;
        if (dVar instanceof u) {
            uVar = (u) dVar;
            int i10 = uVar.f297051d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f297051d = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(dVar);
            }
        } else {
            uVar = new u(dVar);
        }
        Object obj = uVar.f297050c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = uVar.f297051d;
        if (i11 == 0) {
            ResultKt.m(obj);
            xVarA = ui.j.a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.io.x xVar = (kotlinx.io.x) uVar.f297049b;
            io.ktor.utils.io.h hVar2 = (io.ktor.utils.io.h) uVar.f297048a;
            ResultKt.m(obj);
            xVarA = xVar;
            hVar = hVar2;
        }
        while (!hVar.k()) {
            xVarA.la(hVar.j());
            uVar.f297048a = hVar;
            uVar.f297049b = xVarA;
            uVar.f297051d = 1;
            if (io.ktor.utils.io.h.b.a(hVar, 0, uVar, 1, null) == objL) {
                return objL;
            }
        }
        a0(hVar);
        return xVarA.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object J(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Short> dVar) {
        w wVar;
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i10 = wVar.f297059c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f297059c = i10 - Integer.MIN_VALUE;
            } else {
                wVar = new w(dVar);
            }
        } else {
            wVar = new w(dVar);
        }
        Object obj = wVar.f297058b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = wVar.f297059c;
        if (i11 == 0) {
            ResultKt.m(obj);
            wVar.f297057a = hVar;
            wVar.f297059c = 1;
            if (d(hVar, 2, wVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) wVar.f297057a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.h(hVar.j().readShort());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object K(@NotNull io.ktor.utils.io.h hVar, int i10, @NotNull kotlin.coroutines.d<? super String> dVar) {
        x xVar;
        StringBuilder sb2;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i11 = xVar.f297062c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f297062c = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(dVar);
            }
        } else {
            xVar = new x(dVar);
        }
        Object obj = xVar.f297061b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = xVar.f297062c;
        if (i12 == 0) {
            ResultKt.m(obj);
            StringBuilder sb3 = new StringBuilder();
            xVar.f297060a = sb3;
            xVar.f297062c = 1;
            Object objM = M(hVar, sb3, i10, xVar);
            if (objM == objL) {
                return objL;
            }
            obj = objM;
            sb2 = sb3;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb2 = (StringBuilder) xVar.f297060a;
            ResultKt.m(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb2.toString();
        }
        return null;
    }

    public static /* synthetic */ Object L(io.ktor.utils.io.h hVar, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return K(hVar, i10, dVar);
    }

    @Nullable
    public static final Object M(@NotNull io.ktor.utils.io.h hVar, @NotNull Appendable appendable, int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return O(hVar, appendable, i10, t0.f297157b.a(), dVar);
    }

    public static /* synthetic */ Object N(io.ktor.utils.io.h hVar, Appendable appendable, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return M(hVar, appendable, i10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[Catch: all -> 0x0051, LOOP:0: B:38:0x00d0->B:62:0x0167, LOOP_START, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00da A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0132 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0193 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01af A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0049, B:36:0x00ca, B:38:0x00d0, B:40:0x00da, B:42:0x00e6, B:44:0x00f0, B:49:0x010b, B:51:0x011b, B:53:0x013b, B:52:0x0132, B:58:0x014e, B:62:0x0167, B:63:0x016c, B:65:0x0179, B:69:0x0193, B:70:0x01ae, B:71:0x01af, B:74:0x01ba, B:76:0x01c4, B:21:0x0071), top: B:85:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (io.ktor.utils.io.h.b.a(r20, 0, r2, 1, null) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018c, code lost:
    
        if (io.ktor.utils.io.h.b.a(r8, 0, r2, 1, null) == r3) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0193, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01d1: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: kotlin.jdk7.a.c(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void throws java.lang.Exception (m)], block:B:81:0x01d1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlinx.io.b] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, kotlinx.io.b] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x018c -> B:68:0x018f). Please report as a decompilation issue!!! */
    @io.ktor.utils.io.o0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r20, @org.jetbrains.annotations.NotNull java.lang.Appendable r21, int r22, int r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.O(io.ktor.utils.io.h, java.lang.Appendable, int, int, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object P(io.ktor.utils.io.h hVar, Appendable appendable, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 4) != 0) {
            i11 = t0.f297157b.a();
        }
        return O(hVar, appendable, i10, i11, dVar);
    }

    private static final void Q(int i10, int i11) throws IOException {
        if (t0.g(i10, i11)) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) t0.l(i11)) + ", while expected " + ((Object) t0.l(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x010b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0127  */
    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
    /* JADX WARN: Code duplicated, block: B:41:0x017d  */
    /* JADX WARN: Code duplicated, block: B:43:0x018b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0192  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0192 -> B:46:0x01a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01c2 -> B:51:0x01c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object R(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r21, @org.jetbrains.annotations.NotNull kotlinx.io.bytestring.c r22, @org.jetbrains.annotations.NotNull io.ktor.utils.io.p r23, long r24, boolean r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Long> r27) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.R(io.ktor.utils.io.h, kotlinx.io.bytestring.c, io.ktor.utils.io.p, long, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object S(io.ktor.utils.io.p pVar, byte[] bArr, i1.f fVar, i1.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
        a0 a0Var;
        if (dVar instanceof a0) {
            a0Var = (a0) dVar;
            int i10 = a0Var.f296950d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f296950d = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(dVar);
            }
        } else {
            a0Var = new a0(dVar);
        }
        Object obj = a0Var.f296949c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = a0Var.f296950d;
        if (i11 == 0) {
            ResultKt.m(obj);
            int i12 = fVar.f312749a;
            a0Var.f296947a = fVar;
            a0Var.f296948b = gVar;
            a0Var.f296950d = 1;
            if (io.ktor.utils.io.t.t(pVar, bArr, 0, i12, a0Var) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (i1.g) a0Var.f296948b;
            fVar = (i1.f) a0Var.f296947a;
            ResultKt.m(obj);
        }
        gVar.f312750a += (long) fVar.f312749a;
        fVar.f312749a = 0;
        return Unit.f312394a;
    }

    public static /* synthetic */ Object T(io.ktor.utils.io.h hVar, kotlinx.io.bytestring.c cVar, io.ktor.utils.io.p pVar, long j10, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = Long.MAX_VALUE;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return R(hVar, cVar, pVar, j11, z10, dVar);
    }

    private static final void U(i1.f fVar, kotlinx.io.bytestring.c cVar, int[] iArr, byte b10) {
        while (true) {
            int i10 = fVar.f312749a;
            if (i10 <= 0 || b10 == cVar.p(i10)) {
                break;
            } else {
                fVar.f312749a = iArr[fVar.f312749a - 1];
            }
        }
    }

    @NotNull
    public static final y0 V(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull CoroutineContext coroutineContext, @NotNull final io.ktor.utils.io.b channel, @NotNull Function2<? super z0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        p2 p2VarF = kotlinx.coroutines.k.f(s0Var, coroutineContext, null, new c0(block, channel, null), 2, null);
        p2VarF.E(new Function1() { // from class: io.ktor.utils.io.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.Y(channel, (Throwable) obj);
            }
        });
        return new y0(io.ktor.utils.io.z.a(channel, new b0(p2VarF, null)), p2VarF);
    }

    @NotNull
    public static final y0 W(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull CoroutineContext coroutineContext, boolean z10, @NotNull Function2<? super z0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return V(s0Var, coroutineContext, new io.ktor.utils.io.b(false, 1, null), block);
    }

    public static /* synthetic */ y0 X(kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return W(s0Var, coroutineContext, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(io.ktor.utils.io.b bVar, Throwable th2) {
        if (th2 != null && !bVar.k()) {
            bVar.c(th2);
        }
        return Unit.f312394a;
    }

    @o0
    public static final void Z(@NotNull io.ktor.utils.io.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Throwable thE = bVar.e();
        if (thE != null) {
            throw thE;
        }
    }

    @o0
    public static final void a0(@NotNull io.ktor.utils.io.h hVar) throws Throwable {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Throwable thE = hVar.e();
        if (thE != null) {
            throw thE;
        }
    }

    @o0
    public static final void b0(@NotNull io.ktor.utils.io.p pVar) throws Throwable {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Throwable thE = pVar.e();
        if (thE != null) {
            throw thE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (i(r6, r7, r0) == r1) goto L23;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c0(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r6, @org.jetbrains.annotations.NotNull kotlinx.io.bytestring.c r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.k.d0
            r5 = 5
            if (r0 == 0) goto L15
            r0 = r8
            r5 = 2
            io.ktor.utils.io.k$d0 r0 = (io.ktor.utils.io.k.d0) r0
            int r1 = r0.f296977d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f296977d = r1
            goto L1a
        L15:
            io.ktor.utils.io.k$d0 r0 = new io.ktor.utils.io.k$d0
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f296976c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f296977d
            r5 = 7
            r3 = 2
            r5 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            r5 = 3
            kotlin.ResultKt.m(r8)
            r5 = 6
            goto L7e
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            r5 = 1
            java.lang.Object r6 = r0.f296975b
            r7 = r6
            r5 = 2
            kotlinx.io.bytestring.c r7 = (kotlinx.io.bytestring.c) r7
            java.lang.Object r6 = r0.f296974a
            io.ktor.utils.io.h r6 = (io.ktor.utils.io.h) r6
            kotlin.ResultKt.m(r8)
            goto L61
        L4a:
            r5 = 7
            kotlin.ResultKt.m(r8)
            int r8 = r7.r()
            r0.f296974a = r6
            r0.f296975b = r7
            r0.f296977d = r4
            java.lang.Object r8 = q(r6, r8, r0)
            r5 = 0
            if (r8 != r1) goto L61
            r5 = 7
            goto L7d
        L61:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r7)
            r5 = 0
            if (r8 == 0) goto L83
            r5 = 3
            int r7 = r7.r()
            r5 = 3
            long r7 = (long) r7
            r2 = 0
            r0.f296974a = r2
            r0.f296975b = r2
            r0.f296977d = r3
            java.lang.Object r6 = i(r6, r7, r0)
            r5 = 1
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L83:
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.c0(io.ktor.utils.io.h, kotlinx.io.bytestring.c, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (kotlinx.coroutines.h4.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.h r7, int r8, kotlin.coroutines.d<? super kotlin.Unit> r9) throws java.io.EOFException {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.k.a
            if (r0 == 0) goto L16
            r0 = r9
            r6 = 3
            io.ktor.utils.io.k$a r0 = (io.ktor.utils.io.k.a) r0
            r6 = 0
            int r1 = r0.f296946d
            r6 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f296946d = r1
            goto L1c
        L16:
            io.ktor.utils.io.k$a r0 = new io.ktor.utils.io.k$a
            r6 = 2
            r0.<init>(r9)
        L1c:
            r6 = 4
            java.lang.Object r9 = r0.f296945c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 4
            int r2 = r0.f296946d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L4a
            r6 = 5
            if (r2 != r3) goto L3f
            r6 = 6
            int r7 = r0.f296944b
            java.lang.Object r8 = r0.f296943a
            r6 = 0
            io.ktor.utils.io.h r8 = (io.ktor.utils.io.h) r8
            kotlin.ResultKt.m(r9)
        L3a:
            r5 = r8
            r6 = 7
            r8 = r7
            r7 = r5
            goto L59
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 0
            java.lang.String r8 = "t/ kvbnowoclerf/ra/e/ebote oes utlri  /mhon/ii/ u/c"
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4a:
            int r7 = r0.f296944b
            r6 = 2
            java.lang.Object r8 = r0.f296943a
            io.ktor.utils.io.h r8 = (io.ktor.utils.io.h) r8
            kotlin.ResultKt.m(r9)
            goto L74
        L55:
            r6 = 1
            kotlin.ResultKt.m(r9)
        L59:
            r6 = 3
            int r9 = m(r7)
            if (r9 >= r8) goto L90
            r6 = 7
            r0.f296943a = r7
            r0.f296944b = r8
            r6 = 1
            r0.f296946d = r4
            java.lang.Object r9 = r7.f(r8, r0)
            if (r9 != r1) goto L70
            r6 = 4
            goto L8a
        L70:
            r5 = r8
            r5 = r8
            r8 = r7
            r7 = r5
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8b
            r0.f296943a = r8
            r6 = 1
            r0.f296944b = r7
            r0.f296946d = r3
            java.lang.Object r9 = kotlinx.coroutines.h4.a(r0)
            r6 = 7
            if (r9 != r1) goto L3a
        L8a:
            return r1
        L8b:
            r5 = r8
            r5 = r8
            r6 = 5
            r8 = r7
            r7 = r5
        L90:
            int r7 = m(r7)
            r6 = 4
            if (r7 < r8) goto L9b
            r6 = 5
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        L9b:
            r6 = 4
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "Not enough data available"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.d(io.ktor.utils.io.h, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final Object d0(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super byte[]> dVar) throws Throwable {
        e0 e0Var;
        if (dVar instanceof e0) {
            e0Var = (e0) dVar;
            int i10 = e0Var.f296984b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e0Var.f296984b = i10 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(dVar);
            }
        } else {
            e0Var = new e0(dVar);
        }
        Object objX = e0Var.f296983a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = e0Var.f296984b;
        if (i11 == 0) {
            ResultKt.m(objX);
            e0Var.f296984b = 1;
            objX = x(hVar, e0Var);
            if (objX == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objX);
        }
        return ui.e.c((kotlinx.io.b) objX, 0, 1, null);
    }

    private static final int[] e(kotlinx.io.bytestring.c cVar) {
        int[] iArr = new int[cVar.r()];
        int iR = cVar.r();
        int i10 = 0;
        for (int i11 = 1; i11 < iR; i11++) {
            while (i10 > 0 && cVar.p(i11) != cVar.p(i10)) {
                i10 = iArr[i10 - 1];
            }
            if (cVar.p(i11) == cVar.p(i10)) {
                i10++;
            }
            iArr[i11] = i10;
        }
        return iArr;
    }

    private static final String e0(kotlinx.io.bytestring.c cVar) {
        return StringsKt.k2(kotlinx.io.bytestring.g.e(cVar), "\n", "\\n", false, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:27:0x0075, B:29:0x007b, B:38:0x00b5, B:46:0x00d0), top: B:59:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:27:0x0075, B:29:0x007b, B:38:0x00b5, B:46:0x00d0), top: B:59:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[Catch: all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:27:0x0075, B:29:0x007b, B:38:0x00b5, B:46:0x00d0), top: B:59:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r0 == r2) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.ktor.utils.io.h] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [io.ktor.utils.io.p] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [io.ktor.utils.io.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.ktor.utils.io.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.h] */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00aa -> B:20:0x0056). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r14, @org.jetbrains.annotations.NotNull io.ktor.utils.io.p r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Long> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.f(io.ktor.utils.io.h, io.ktor.utils.io.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (io.ktor.utils.io.h.b.a(r1, 0, r13, r7, null) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (r0 == r2) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.p] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00dc -> B:20:0x005c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r17, @org.jetbrains.annotations.NotNull io.ktor.utils.io.p r18, long r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Long> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.g(io.ktor.utils.io.h, io.ktor.utils.io.p, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:27:0x007d, B:29:0x0083), top: B:52:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if (io.ktor.utils.io.h.b.a(r11, 0, r1, 1, null) == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.p] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b0 -> B:20:0x0059). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r16, @org.jetbrains.annotations.NotNull io.ktor.utils.io.p r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Long> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.h(io.ktor.utils.io.h, io.ktor.utils.io.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:26:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:25:0x0075). Please report as a decompilation issue!!! */
    @Nullable
    public static final Object i(@NotNull io.ktor.utils.io.h hVar, long j10, @NotNull kotlin.coroutines.d<? super Long> dVar) throws EOFException {
        e eVar;
        long j11;
        io.ktor.utils.io.h hVar2;
        long j12;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f296982e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f296982e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f296981d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f296982e;
        if (i11 == 0) {
            ResultKt.m(obj);
            j11 = j10;
            if (j10 > 0 || hVar.k()) {
                return kotlin.coroutines.jvm.internal.b.g(j11 - j10);
            }
            if (m(hVar) == 0) {
                eVar.f296978a = hVar;
                eVar.f296979b = j11;
                eVar.f296980c = j10;
                eVar.f296982e = 1;
                if (io.ktor.utils.io.h.b.a(hVar, 0, eVar, 1, null) == objL) {
                    return objL;
                }
                hVar2 = hVar;
                j12 = j10;
            }
            long jMin = Math.min(j10, ui.l.j(hVar.j()));
            ui.l.g(hVar.j(), jMin);
            j10 -= jMin;
            if (j10 > 0) {
            }
            return kotlin.coroutines.jvm.internal.b.g(j11 - j10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j12 = eVar.f296980c;
        j11 = eVar.f296979b;
        hVar2 = (io.ktor.utils.io.h) eVar.f296978a;
        ResultKt.m(obj);
        long j13 = j12;
        hVar = hVar2;
        j10 = j13;
        long jMin2 = Math.min(j10, ui.l.j(hVar.j()));
        ui.l.g(hVar.j(), jMin2);
        j10 -= jMin2;
        if (j10 > 0) {
        }
        return kotlin.coroutines.jvm.internal.b.g(j11 - j10);
    }

    public static /* synthetic */ Object j(io.ktor.utils.io.h hVar, long j10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return i(hVar, j10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object k(@NotNull io.ktor.utils.io.h hVar, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws EOFException {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f296987c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f296987c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objI = fVar.f296986b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f296987c;
        if (i11 == 0) {
            ResultKt.m(objI);
            fVar.f296985a = j10;
            fVar.f296987c = 1;
            objI = i(hVar, j10, fVar);
            if (objI == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = fVar.f296985a;
            ResultKt.m(objI);
        }
        if (((Number) objI).longValue() >= j10) {
            return Unit.f312394a;
        }
        throw new EOFException("Unable to discard " + j10 + " bytes");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public static final Object l(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f296990c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f296990c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f296989b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f296990c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (hVar.j().y1()) {
                gVar.f296988a = hVar;
                gVar.f296990c = 1;
                int i12 = 6 ^ 0;
                if (io.ktor.utils.io.h.b.a(hVar, 0, gVar, 1, null) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) gVar.f296988a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.a(hVar.j().y1());
    }

    public static final int m(@NotNull io.ktor.utils.io.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return (int) hVar.j().n().j();
    }

    public static /* synthetic */ void n(io.ktor.utils.io.h hVar) {
    }

    public static final int o(@NotNull io.ktor.utils.io.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return 1048576 - ui.j.f(pVar.i());
    }

    public static /* synthetic */ void p(io.ktor.utils.io.p pVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object q(@NotNull io.ktor.utils.io.h hVar, int i10, @NotNull kotlin.coroutines.d<? super kotlinx.io.bytestring.c> dVar) {
        h hVar2;
        if (dVar instanceof h) {
            hVar2 = (h) dVar;
            int i11 = hVar2.f296994d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar2.f296994d = i11 - Integer.MIN_VALUE;
            } else {
                hVar2 = new h(dVar);
            }
        } else {
            hVar2 = new h(dVar);
        }
        Object objF = hVar2.f296993c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = hVar2.f296994d;
        if (i12 == 0) {
            ResultKt.m(objF);
            if (hVar.k()) {
                return null;
            }
            hVar2.f296991a = hVar;
            hVar2.f296992b = i10;
            hVar2.f296994d = 1;
            objF = hVar.f(i10, hVar2);
            if (objF == objL) {
                return objL;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = hVar2.f296992b;
            hVar = (io.ktor.utils.io.h) hVar2.f296991a;
            ResultKt.m(objF);
        }
        if (((Boolean) objF).booleanValue()) {
            return kotlinx.io.f.f(hVar.j().peek(), i10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object r(@NotNull io.ktor.utils.io.h hVar, @NotNull pj.o<? super byte[], ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super Integer>, ? extends Object> oVar, @NotNull kotlin.coroutines.d<? super Integer> dVar) throws EOFException {
        i iVar;
        kotlinx.io.b bVar;
        i1.f fVar;
        i1.f fVar2;
        kotlinx.io.t tVar;
        int i10;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i11 = iVar.f297000f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f297000f = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f296999e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = iVar.f297000f;
        int i13 = (7 ^ 2) << 1;
        if (i12 == 0) {
            ResultKt.m(obj);
            if (hVar.k()) {
                return kotlin.coroutines.jvm.internal.b.f(-1);
            }
            if (hVar.j().y1()) {
                iVar.f296995a = hVar;
                iVar.f296996b = oVar;
                iVar.f297000f = 1;
                if (io.ktor.utils.io.h.b.a(hVar, 0, iVar, 1, null) != objL) {
                }
            }
            return objL;
        }
        if (i12 == 1) {
            oVar = (pj.o) iVar.f296996b;
            hVar = (io.ktor.utils.io.h) iVar.f296995a;
            ResultKt.m(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (i1.f) iVar.f296998d;
            tVar = (kotlinx.io.t) iVar.f296997c;
            bVar = (kotlinx.io.b) iVar.f296996b;
            fVar2 = (i1.f) iVar.f296995a;
            ResultKt.m(obj);
        }
        fVar.f312749a = ((Number) obj).intValue();
        i10 = fVar2.f312749a;
        if (i10 != 0) {
            if (i10 >= 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (i10 <= tVar.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bVar.skip(i10);
        }
        return kotlin.coroutines.jvm.internal.b.f(fVar2.f312749a);
        if (hVar.k()) {
            return kotlin.coroutines.jvm.internal.b.f(-1);
        }
        i1.f fVar3 = new i1.f();
        kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = hVar.j().n();
        if (bVarN.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        kotlinx.io.t tVarG = bVarN.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        int iD = tVarG.d();
        Integer numF = kotlin.coroutines.jvm.internal.b.f(iH);
        Integer numF2 = kotlin.coroutines.jvm.internal.b.f(iD);
        iVar.f296995a = fVar3;
        iVar.f296996b = bVarN;
        iVar.f296997c = tVarG;
        iVar.f296998d = fVar3;
        iVar.f297000f = 2;
        Object objInvoke = oVar.invoke(bArrB, numF, numF2, iVar);
        if (objInvoke != objL) {
            bVar = bVarN;
            fVar = fVar3;
            fVar2 = fVar;
            obj = objInvoke;
            tVar = tVarG;
            fVar.f312749a = ((Number) obj).intValue();
            i10 = fVar2.f312749a;
            if (i10 != 0) {
                if (i10 >= 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (i10 <= tVar.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                bVar.skip(i10);
            }
            return kotlin.coroutines.jvm.internal.b.f(fVar2.f312749a);
        }
        return objL;
    }

    private static final Object s(io.ktor.utils.io.h hVar, pj.o<? super byte[], ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super Integer>, ? extends Object> oVar, kotlin.coroutines.d<? super Integer> dVar) throws EOFException {
        if (hVar.k()) {
            return -1;
        }
        if (hVar.j().y1()) {
            kotlin.jvm.internal.h0.e(0);
            io.ktor.utils.io.h.b.a(hVar, 0, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
        }
        if (hVar.k()) {
            return -1;
        }
        i1.f fVar = new i1.f();
        kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = hVar.j().n();
        if (bVarN.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        kotlinx.io.t tVarG = bVarN.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        Integer numValueOf = Integer.valueOf(tVarG.h());
        int iIntValue = Integer.valueOf(tVarG.d()).intValue();
        Integer numValueOf2 = Integer.valueOf(numValueOf.intValue());
        Integer numValueOf3 = Integer.valueOf(iIntValue);
        kotlin.jvm.internal.h0.e(3);
        int iIntValue2 = ((Number) oVar.invoke(bArrB, numValueOf2, numValueOf3, null)).intValue();
        fVar.f312749a = iIntValue2;
        int iIntValue3 = Integer.valueOf(iIntValue2).intValue();
        if (iIntValue3 != 0) {
            if (iIntValue3 < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iIntValue3 > tVarG.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bVarN.skip(iIntValue3);
        }
        return Integer.valueOf(fVar.f312749a);
    }

    public static final int t(@NotNull io.ktor.utils.io.h hVar, int i10, @NotNull Function1<? super kotlinx.io.b, Integer> block) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i10 <= 1048576) {
            if (m(hVar) < i10) {
                return -1;
            }
            return block.invoke(hVar.j().n()).intValue();
        }
        throw new IllegalArgumentException(("Min(" + i10 + ") shouldn't be greater than 1048576").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object u(@NotNull io.ktor.utils.io.h hVar, @NotNull byte[] bArr, int i10, int i11, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i12 = jVar.f297006f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f297006f = i12 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f297005e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = jVar.f297006f;
        if (i13 == 0) {
            ResultKt.m(obj);
            if (hVar.k()) {
                return kotlin.coroutines.jvm.internal.b.f(-1);
            }
            if (hVar.j().y1()) {
                jVar.f297001a = hVar;
                jVar.f297002b = bArr;
                jVar.f297003c = i10;
                jVar.f297004d = i11;
                jVar.f297006f = 1;
                if (io.ktor.utils.io.h.b.a(hVar, 0, jVar, 1, null) == objL) {
                    return objL;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = jVar.f297004d;
            i10 = jVar.f297003c;
            bArr = (byte[]) jVar.f297002b;
            hVar = (io.ktor.utils.io.h) jVar.f297001a;
            ResultKt.m(obj);
        }
        return hVar.k() ? kotlin.coroutines.jvm.internal.b.f(-1) : kotlin.coroutines.jvm.internal.b.f(ui.p.b(hVar.j(), bArr, i10, i11));
    }

    public static /* synthetic */ Object v(io.ktor.utils.io.h hVar, byte[] bArr, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
            int i13 = 4 >> 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        return u(hVar, bArr, i10, i11, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:27:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:26:0x007e). Please report as a decompilation issue!!! */
    @Nullable
    public static final Object w(@NotNull io.ktor.utils.io.h hVar, int i10, @NotNull kotlin.coroutines.d<? super kotlinx.io.b> dVar) {
        l lVar;
        kotlinx.io.b bVar;
        io.ktor.utils.io.h hVar2;
        int i11;
        kotlinx.io.b bVar2;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i12 = lVar.f297015e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.f297015e = i12 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f297014d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = lVar.f297015e;
        if (i13 == 0) {
            ResultKt.m(obj);
            bVar = new kotlinx.io.b();
            if (i10 > 0 || hVar.k()) {
                return bVar;
            }
            if (hVar.j().y1()) {
                lVar.f297011a = hVar;
                lVar.f297012b = bVar;
                lVar.f297013c = i10;
                lVar.f297015e = 1;
                if (io.ktor.utils.io.h.b.a(hVar, 0, lVar, 1, null) == objL) {
                    return objL;
                }
                hVar2 = hVar;
                i11 = i10;
                bVar2 = bVar;
            }
            long jMin = Math.min(i10, ui.l.j(hVar.j()));
            hVar.j().ic(bVar, jMin);
            i10 -= (int) jMin;
            if (i10 > 0) {
            }
            return bVar;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = lVar.f297013c;
        bVar2 = (kotlinx.io.b) lVar.f297012b;
        hVar2 = (io.ktor.utils.io.h) lVar.f297011a;
        ResultKt.m(obj);
        bVar = bVar2;
        i10 = i11;
        hVar = hVar2;
        long jMin2 = Math.min(i10, ui.l.j(hVar.j()));
        hVar.j().ic(bVar, jMin2);
        i10 -= (int) jMin2;
        if (i10 > 0) {
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object x(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super kotlinx.io.b> dVar) throws Throwable {
        C2104k c2104k;
        kotlinx.io.b bVar;
        if (dVar instanceof C2104k) {
            c2104k = (C2104k) dVar;
            int i10 = c2104k.f297010d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2104k.f297010d = i10 - Integer.MIN_VALUE;
            } else {
                c2104k = new C2104k(dVar);
            }
        } else {
            c2104k = new C2104k(dVar);
        }
        Object obj = c2104k.f297009c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2104k.f297010d;
        if (i11 == 0) {
            ResultKt.m(obj);
            bVar = new kotlinx.io.b();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.io.b bVar2 = (kotlinx.io.b) c2104k.f297008b;
            io.ktor.utils.io.h hVar2 = (io.ktor.utils.io.h) c2104k.f297007a;
            ResultKt.m(obj);
            bVar = bVar2;
            hVar = hVar2;
        }
        while (!hVar.k()) {
            bVar.la(hVar.j());
            c2104k.f297007a = hVar;
            c2104k.f297008b = bVar;
            c2104k.f297010d = 1;
            if (io.ktor.utils.io.h.b.a(hVar, 0, c2104k, 1, null) == objL) {
                return objL;
            }
        }
        Throwable thE = hVar.e();
        if (thE == null) {
            return bVar;
        }
        throw thE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object y(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<? super Byte> dVar) throws EOFException {
        m mVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f297018c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f297018c = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f297017b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f297018c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (hVar.j().y1()) {
                mVar.f297016a = hVar;
                mVar.f297018c = 1;
                if (io.ktor.utils.io.h.b.a(hVar, 0, mVar, 1, null) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (io.ktor.utils.io.h) mVar.f297016a;
            ResultKt.m(obj);
        }
        if (hVar.j().y1()) {
            throw new EOFException("Not enough data available");
        }
        return kotlin.coroutines.jvm.internal.b.b(hVar.j().readByte());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007e -> B:12:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object z(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r7, int r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super byte[]> r9) {
        /*
            r6 = 7
            boolean r0 = r9 instanceof io.ktor.utils.io.k.n
            if (r0 == 0) goto L17
            r0 = r9
            r0 = r9
            io.ktor.utils.io.k$n r0 = (io.ktor.utils.io.k.n) r0
            int r1 = r0.f297024f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r6 = 5
            int r1 = r1 - r2
            r0.f297024f = r1
            goto L1d
        L17:
            r6 = 6
            io.ktor.utils.io.k$n r0 = new io.ktor.utils.io.k$n
            r0.<init>(r9)
        L1d:
            r6 = 5
            java.lang.Object r9 = r0.f297023e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297024f
            r3 = 1
            if (r2 == 0) goto L50
            if (r2 != r3) goto L48
            int r7 = r0.f297022d
            java.lang.Object r8 = r0.f297021c
            r6 = 5
            kotlinx.io.x r8 = (kotlinx.io.x) r8
            java.lang.Object r2 = r0.f297020b
            kotlinx.io.b r2 = (kotlinx.io.b) r2
            r6 = 0
            java.lang.Object r4 = r0.f297019a
            io.ktor.utils.io.h r4 = (io.ktor.utils.io.h) r4
            kotlin.ResultKt.m(r9)
            r5 = r0
            r6 = 2
            r0 = r7
            r7 = r4
            r7 = r4
        L43:
            r4 = r2
            r4 = r2
            r2 = r5
            r6 = 6
            goto L85
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L50:
            r6 = 7
            kotlin.ResultKt.m(r9)
            r6 = 7
            kotlinx.io.b r9 = new kotlinx.io.b
            r9.<init>()
            r2 = r9
            r6 = 7
            r9 = r8
            r8 = r2
        L5e:
            r6 = 6
            int r4 = ui.j.f(r8)
            if (r4 >= r9) goto L92
            int r4 = ui.j.f(r8)
            int r4 = r9 - r4
            r0.f297019a = r7
            r6 = 3
            r0.f297020b = r2
            r0.f297021c = r8
            r0.f297022d = r9
            r0.f297024f = r3
            java.lang.Object r4 = G(r7, r4, r0)
            r6 = 2
            if (r4 != r1) goto L7e
            return r1
        L7e:
            r5 = r0
            r5 = r0
            r6 = 5
            r0 = r9
            r0 = r9
            r9 = r4
            goto L43
        L85:
            kotlinx.io.c0 r9 = (kotlinx.io.c0) r9
            ui.j.j(r8, r9)
            r6 = 2
            r9 = r0
            r9 = r0
            r0 = r2
            r0 = r2
            r2 = r4
            r6 = 1
            goto L5e
        L92:
            r6 = 2
            byte[] r7 = kotlinx.io.g0.c(r2)
            r6 = 7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.z(io.ktor.utils.io.h, int, kotlin.coroutines.d):java.lang.Object");
    }
}

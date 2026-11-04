package io.ktor.http.content;

import io.ktor.http.d1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.util.w1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCompressedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,89:1\n1#2:90\n30#3:91\n*S KotlinDebug\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse\n*L\n67#1:91\n*E\n"})
final class o extends w.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w.f f295738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.z f295739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f295740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295741e;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nCompressedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse$writeTo$2\n+ 2 Readers.kt\nio/ktor/util/cio/ReadersKt\n*L\n1#1,89:1\n33#2,10:90\n*S KotlinDebug\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse$writeTo$2\n*L\n83#1:90,10\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295743b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.p f295745d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.p pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f295745d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = o.this.new a(this.f295745d, dVar);
            aVar.f295743b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            io.ktor.utils.io.p pVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295742a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (io.ktor.utils.io.p) this.f295743b;
                try {
                    ResultKt.m(obj);
                    io.ktor.utils.io.q.c(pVar);
                    return Unit.f312394a;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        io.ktor.utils.io.t.e(pVar, th2);
                        throw th2;
                    } catch (Throwable th4) {
                        io.ktor.utils.io.q.c(pVar);
                        throw th4;
                    }
                }
            }
            ResultKt.m(obj);
            io.ktor.utils.io.p pVarC = o.this.l().c(this.f295745d, ((s0) this.f295743b).getCoroutineContext());
            try {
                w.f fVarM = o.this.m();
                this.f295743b = pVarC;
                this.f295742a = 1;
                if (fVarM.h(pVarC, this) == objL) {
                    return objL;
                }
                pVar = pVarC;
                io.ktor.utils.io.q.c(pVar);
                return Unit.f312394a;
            } catch (Throwable th5) {
                th2 = th5;
                pVar = pVarC;
                io.ktor.utils.io.t.e(pVar, th2);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public o(@NotNull w.f original, @NotNull io.ktor.util.z encoder, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f295738b = original;
        this.f295739c = encoder;
        this.f295740d = coroutineContext;
        this.f295741e = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: io.ktor.http.content.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.n(this.f295737a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 n(o oVar) {
        v0.a aVar = v0.f296123a;
        w0 w0Var = new w0(0, 1, null);
        w1.g(w0Var, oVar.f295738b.c(), false, new Function2() { // from class: io.ktor.http.content.m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(o.o((String) obj, (String) obj2));
            }
        }, 2, null);
        w0Var.l(d1.f295782a.x(), oVar.f295739c.getName());
        return w0Var.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return !StringsKt.N1(name, d1.f295782a.z(), true);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        Long lA = this.f295738b.a();
        if (lA != null) {
            Long lD = this.f295739c.d(lA.longValue());
            if (lD != null && lD.longValue() >= 0) {
                return lD;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public io.ktor.http.m b() {
        return this.f295738b.b();
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public v0 c() {
        return (v0) this.f295741e.getValue();
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public <T> T d(@NotNull io.ktor.util.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.f295738b.d(key);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f295738b.e();
    }

    @Override // io.ktor.http.content.w
    public <T> void f(@NotNull io.ktor.util.a<T> key, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f295738b.f(key, t10);
    }

    @Override // io.ktor.http.content.w.f
    @Nullable
    public Object h(@NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f295740d, new a(pVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @NotNull
    public final CoroutineContext k() {
        return this.f295740d;
    }

    @NotNull
    public final io.ktor.util.z l() {
        return this.f295739c;
    }

    @NotNull
    public final w.f m() {
        return this.f295738b;
    }
}

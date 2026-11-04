package io.ktor.http.cio;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.utils.io.d1;
import io.ktor.utils.io.e1;
import io.ktor.utils.io.y0;
import io.ktor.utils.io.z0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nChunkedTransferEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkedTransferEncoding.kt\nio/ktor/http/cio/ChunkedTransferEncodingKt\n+ 2 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n487#2,6:177\n493#2,2:187\n497#2:195\n99#3:183\n100#3,2:185\n102#3,6:189\n1#4:184\n*S KotlinDebug\n*F\n+ 1 ChunkedTransferEncoding.kt\nio/ktor/http/cio/ChunkedTransferEncodingKt\n*L\n136#1:177,6\n136#1:187,2\n136#1:195\n136#1:183\n136#1:185,2\n136#1:189,6\n136#1:184\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f295511a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f295512b = 2048;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f295514d = 3338;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.utils.io.pool.h<StringBuilder> f295513c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final byte[] f295515e = ui.u.m("\r\n", null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final byte[] f295516f = ui.u.m("0\r\n\r\n", null, 1, null);

    @SourceDebugExtension({"SMAP\nChunkedTransferEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkedTransferEncoding.kt\nio/ktor/http/cio/ChunkedTransferEncodingKt$ChunkSizeBufferPool$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a extends io.ktor.utils.io.pool.d<StringBuilder> {
        a() {
            super(2048);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuilder a(StringBuilder instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            StringsKt.a0(instance);
            return instance;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.d
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public StringBuilder d() {
            return new StringBuilder(128);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1", f = "ChunkedTransferEncoding.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f295519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.utils.io.h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f295519c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f295519c, dVar);
            bVar.f295518b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295517a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = (e1) this.f295518b;
                io.ktor.utils.io.h hVar = this.f295519c;
                io.ktor.utils.io.p pVarC = e1Var.c();
                this.f295517a = 1;
                if (i.d(hVar, pVarC, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {com.planner5d.library.engine.input.f.b.C0, com.planner5d.library.engine.input.f.b.B0, 85, 90, 104, 104}, m = "decodeChunked", n = {MetricTracker.Object.INPUT, "out", "chunkSizeBuffer", "totalBytesCopied", MetricTracker.Object.INPUT, "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", MetricTracker.Object.INPUT, "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", MetricTracker.Object.INPUT, "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f295523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f295524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f295525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f295526g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295525f = obj;
            this.f295526g |= Integer.MIN_VALUE;
            return i.d(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1", f = "ChunkedTransferEncoding.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<z0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.p f295529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(io.ktor.utils.io.p pVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f295529c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f295529c, dVar);
            dVar2.f295528b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295527a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0 z0Var = (z0) this.f295528b;
                io.ktor.utils.io.p pVar = this.f295529c;
                io.ktor.utils.io.h hVarC = z0Var.c();
                this.f295527a = 1;
                if (i.f(pVar, hVarC, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z0 z0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(z0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {178, 138, 143, com.planner5d.library.engine.input.f.b.H1, com.planner5d.library.engine.input.f.b.H1}, m = "encodeChunked", n = {"output", MetricTracker.Object.INPUT, "$this$read$iv", "output", MetricTracker.Object.INPUT, "result$iv", "buffer$iv$iv", "head$iv$iv", "output", MetricTracker.Object.INPUT}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f295534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f295535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f295536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f295537h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295536g = obj;
            this.f295537h |= Integer.MIN_VALUE;
            return i.f(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}, l = {167, 168, 170, 171, 172}, m = "writeChunk", n = {"$this$writeChunk", "memory", "startIndex", "endIndex", "size", "$this$writeChunk", "memory", "startIndex", "endIndex", "size", "$this$writeChunk", "size", "$this$writeChunk", "size", "size"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "I$0", "L$0", "I$0", "I$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f295542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f295543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f295544g;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295543f = obj;
            this.f295544g |= Integer.MIN_VALUE;
            return i.h(null, null, 0, 0, this);
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Specify content length if known or pass -1L", replaceWith = @b1(expression = "decodeChunked(input, -1L)", imports = {}))
    @NotNull
    public static final d1 b(@NotNull s0 s0Var, @NotNull io.ktor.utils.io.h input) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        return c(s0Var, input, -1L);
    }

    @NotNull
    public static final d1 c(@NotNull s0 s0Var, @NotNull io.ktor.utils.io.h input, long j10) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        return io.ktor.utils.io.t.G(s0Var, s0Var.getCoroutineContext(), false, new b(input, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #3 {all -> 0x019c, blocks: (B:59:0x0163, B:61:0x016b, B:30:0x00b7, B:71:0x0192, B:72:0x019b, B:75:0x01a1, B:76:0x01c0), top: B:96:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:70:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0192 A[Catch: all -> 0x019c, TRY_ENTER, TryCatch #3 {all -> 0x019c, blocks: (B:59:0x0163, B:61:0x016b, B:30:0x00b7, B:71:0x0192, B:72:0x019b, B:75:0x01a1, B:76:0x01c0), top: B:96:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1 A[Catch: all -> 0x019c, TryCatch #3 {all -> 0x019c, blocks: (B:59:0x0163, B:61:0x016b, B:30:0x00b7, B:71:0x0192, B:72:0x019b, B:75:0x01a1, B:76:0x01c0), top: B:96:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:15:0x0054, B:34:0x00d8, B:36:0x00e0, B:38:0x00e6, B:40:0x00ec, B:46:0x00ff, B:50:0x0119, B:43:0x00f7, B:79:0x01c4, B:80:0x01cd, B:81:0x01ce, B:82:0x01d5, B:21:0x0074, B:24:0x0089, B:27:0x009e), top: B:93:0x002b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Appendable, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.CharSequence, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Appendable, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x015a -> B:17:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r18, @org.jetbrains.annotations.NotNull io.ktor.utils.io.p r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.i.d(io.ktor.utils.io.h, io.ktor.utils.io.p, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public static final y0 e(@NotNull io.ktor.utils.io.p output, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.k.W(f2.f314023a, coroutineContext, false, new d(output, null));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[LOOP:0: B:107:0x009f->B:123:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #3 {all -> 0x00d9, blocks: (B:37:0x00a5, B:39:0x00ab, B:41:0x00b5), top: B:109:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:50:0x00e3, B:52:0x00e9, B:54:0x00fe, B:56:0x0115, B:59:0x0121, B:77:0x017a, B:78:0x0183), top: B:115:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:50:0x00e3, B:52:0x00e9, B:54:0x00fe, B:56:0x0115, B:59:0x0121, B:77:0x017a, B:78:0x0183), top: B:115:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:50:0x00e3, B:52:0x00e9, B:54:0x00fe, B:56:0x0115, B:59:0x0121, B:77:0x017a, B:78:0x0183), top: B:115:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #6 {all -> 0x011d, blocks: (B:50:0x00e3, B:52:0x00e9, B:54:0x00fe, B:56:0x0115, B:59:0x0121, B:77:0x017a, B:78:0x0183), top: B:115:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154 A[Catch: all -> 0x015f, TryCatch #8 {all -> 0x015f, blocks: (B:64:0x0146, B:67:0x0154, B:69:0x015a, B:72:0x0163, B:73:0x016a, B:74:0x016b, B:75:0x0172), top: B:119:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015a A[Catch: all -> 0x015f, TryCatch #8 {all -> 0x015f, blocks: (B:64:0x0146, B:67:0x0154, B:69:0x015a, B:72:0x0163, B:73:0x016a, B:74:0x016b, B:75:0x0172), top: B:119:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0163 A[Catch: all -> 0x015f, TryCatch #8 {all -> 0x015f, blocks: (B:64:0x0146, B:67:0x0154, B:69:0x015a, B:72:0x0163, B:73:0x016a, B:74:0x016b, B:75:0x0172), top: B:119:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x016b A[Catch: all -> 0x015f, TryCatch #8 {all -> 0x015f, blocks: (B:64:0x0146, B:67:0x0154, B:69:0x015a, B:72:0x0163, B:73:0x016a, B:74:0x016b, B:75:0x0172), top: B:119:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017a A[Catch: all -> 0x011d, TRY_ENTER, TryCatch #6 {all -> 0x011d, blocks: (B:50:0x00e3, B:52:0x00e9, B:54:0x00fe, B:56:0x0115, B:59:0x0121, B:77:0x017a, B:78:0x0183), top: B:115:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0115 -> B:119:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0137 -> B:63:0x0140). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0184 -> B:107:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:69:0x015a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object f(@org.jetbrains.annotations.NotNull io.ktor.utils.io.p r20, @org.jetbrains.annotations.NotNull io.ktor.utils.io.h r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.i.f(io.ktor.utils.io.p, io.ktor.utils.io.h, kotlin.coroutines.d):java.lang.Object");
    }

    private static final void g(io.ktor.utils.io.h hVar) throws Throwable {
        Throwable thE = hVar instanceof io.ktor.utils.io.b ? ((io.ktor.utils.io.b) hVar).e() : null;
        if (thE != null) {
            throw thE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[PHI: r11 r12
      0x0059: PHI (r11v4 int) = (r11v3 int), (r11v11 int) binds: [B:32:0x00c7, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r12v5 io.ktor.utils.io.p) = (r12v4 io.ktor.utils.io.p), (r12v17 io.ktor.utils.io.p) binds: [B:32:0x00c7, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r12.d(r5) == r0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(io.ktor.utils.io.p r11, byte[] r12, int r13, int r14, kotlin.coroutines.d<? super java.lang.Integer> r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.i.h(io.ktor.utils.io.p, byte[], int, int, kotlin.coroutines.d):java.lang.Object");
    }
}

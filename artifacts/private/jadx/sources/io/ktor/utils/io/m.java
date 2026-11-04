package io.ktor.utils.io;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteReadChannelOperations.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannelOperations.jvm.kt\nio/ktor/utils/io/ByteReadChannelOperations_jvmKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,200:1\n190#1:205\n191#1,9:207\n21#2,3:201\n1#3:204\n1#3:206\n1#3:217\n99#4:216\n100#4,8:218\n*S KotlinDebug\n*F\n+ 1 ByteReadChannelOperations.jvm.kt\nio/ktor/utils/io/ByteReadChannelOperations_jvmKt\n*L\n100#1:205\n100#1:207,9\n20#1:201,3\n100#1:206\n153#1:217\n153#1:216\n153#1:218,8\n*E\n"})
public final class m {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {205, 209}, m = "copyTo", n = {"$this$copyTo", "copied", "copy", "$this$read$iv", "limit", "min$iv", "$this$copyTo", "copied", "copy", "$this$read$iv", "limit"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f297094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f297095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f297097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f297098h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297097g = obj;
            this.f297098h |= Integer.MIN_VALUE;
            return m.d(null, null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0, 1, 1}, l = {192, 196}, m = "read", n = {"$this$read", "consumer", "min", "$this$read", "consumer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f297102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297103e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297102d = obj;
            this.f297103e |= Integer.MIN_VALUE;
            return m.g(null, 0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0}, l = {40}, m = "readAvailable", n = {"$this$readAvailable", "buffer"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297107d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297106c = obj;
            this.f297107d |= Integer.MIN_VALUE;
            return m.k(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0}, l = {125}, m = "readFully", n = {"$this$readFully", "buffer"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f297110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297111d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297110c = obj;
            this.f297111d |= Integer.MIN_VALUE;
            return m.l(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {114}, m = "skipDelimiter", n = {"$this$skipDelimiter", androidx.media3.extractor.text.ttml.c.f68675c0, androidx.media3.exoplayer.upstream.h.f65997k}, s = {"L$0", "L$1", "I$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f297116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297117f;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297116e = obj;
            this.f297117f |= Integer.MIN_VALUE;
            return m.n(null, null, this);
        }
    }

    @NotNull
    public static final h b(@NotNull ByteBuffer content) {
        Intrinsics.checkNotNullParameter(content, "content");
        kotlinx.io.b bVar = new kotlinx.io.b();
        ui.i.a(bVar, content);
        return io.ktor.utils.io.c.b(bVar);
    }

    @NotNull
    public static final kotlinx.io.bytestring.c c(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        byte[] bArr = new byte[buffer.remaining()];
        buffer.mark();
        buffer.get(bArr);
        buffer.reset();
        return new kotlinx.io.bytestring.c(bArr, 0, 0, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x011c -> B:45:0x0124). Please report as a decompilation issue!!! */
    @Nullable
    public static final Object d(@NotNull h hVar, @NotNull final WritableByteChannel writableByteChannel, final long j10, @NotNull kotlin.coroutines.d<? super Long> dVar) throws Throwable {
        a aVar;
        final i1.g gVar;
        Function1 function1;
        Throwable thE;
        h hVar2;
        h hVar3;
        Function1 function2;
        i1.g gVar2;
        long j11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f297098h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f297098h = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f297097g;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f297098h;
        if (i11 != 0) {
            if (i11 == 1) {
                int i12 = aVar.f297096f;
                long j12 = aVar.f297095e;
                h hVar4 = (h) aVar.f297094d;
                function1 = (Function1) aVar.f297093c;
                i1.g gVar3 = (i1.g) aVar.f297092b;
                h hVar5 = (h) aVar.f297091a;
                ResultKt.m(obj);
                if (!((Boolean) obj).booleanValue()) {
                    throw new EOFException("Not enough bytes available: required " + i12 + " but " + k.m(hVar4) + " available");
                }
                ui.k.b(hVar4.j(), function1);
                j10 = j12;
                gVar = gVar3;
                hVar = hVar5;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = aVar.f297095e;
                hVar3 = (h) aVar.f297094d;
                function2 = (Function1) aVar.f297093c;
                gVar2 = (i1.g) aVar.f297092b;
                hVar2 = (h) aVar.f297091a;
                ResultKt.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ui.k.b(hVar3.j(), function2);
            }
            gVar = gVar2;
            function1 = function2;
            j10 = j11;
            hVar = hVar2;
        } else {
            ResultKt.m(obj);
            if (j10 < 0) {
                throw new IllegalArgumentException(("Limit shouldn't be negative: " + j10).toString());
            }
            if ((writableByteChannel instanceof SelectableChannel) && !((SelectableChannel) writableByteChannel).isBlocking()) {
                throw new IllegalArgumentException("Non-blocking channels are not supported");
            }
            if (hVar.k()) {
                Throwable thE2 = hVar.e();
                if (thE2 == null) {
                    return kotlin.coroutines.jvm.internal.b.g(0L);
                }
                throw thE2;
            }
            gVar = new i1.g();
            function1 = new Function1() { // from class: io.ktor.utils.io.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return m.f(j10, gVar, writableByteChannel, (ByteBuffer) obj2);
                }
            };
        }
        if (gVar.f312750a < j10 || hVar.k()) {
            thE = hVar.e();
            if (thE == null) {
                return kotlin.coroutines.jvm.internal.b.g(gVar.f312750a);
            }
            throw thE;
        }
        aVar.f297091a = hVar;
        aVar.f297092b = gVar;
        aVar.f297093c = function1;
        aVar.f297094d = hVar;
        aVar.f297095e = j10;
        aVar.f297098h = 2;
        Object objA = h.b.a(hVar, 0, aVar, 1, null);
        if (objA == objL) {
            return objL;
        }
        hVar2 = hVar;
        long j13 = j10;
        hVar3 = hVar2;
        function2 = function1;
        gVar2 = gVar;
        obj = objA;
        j11 = j13;
        if (((Boolean) obj).booleanValue()) {
            ui.k.b(hVar3.j(), function2);
        }
        gVar = gVar2;
        function1 = function2;
        j10 = j11;
        hVar = hVar2;
        if (gVar.f312750a < j10) {
        }
        thE = hVar.e();
        if (thE == null) {
            return kotlin.coroutines.jvm.internal.b.g(gVar.f312750a);
        }
        throw thE;
    }

    public static /* synthetic */ Object e(h hVar, WritableByteChannel writableByteChannel, long j10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return d(hVar, writableByteChannel, j10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(long j10, i1.g gVar, WritableByteChannel writableByteChannel, ByteBuffer bb2) throws IOException {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        long j11 = j10 - gVar.f312750a;
        if (j11 < bb2.remaining()) {
            int iLimit = bb2.limit();
            bb2.limit(bb2.position() + ((int) j11));
            while (bb2.hasRemaining()) {
                writableByteChannel.write(bb2);
            }
            bb2.limit(iLimit);
            gVar.f312750a += j11;
        } else {
            long jWrite = 0;
            while (bb2.hasRemaining()) {
                jWrite += (long) writableByteChannel.write(bb2);
            }
            gVar.f312750a += jWrite;
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r9 == r1) goto L30;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r6, int r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.m.g(io.ktor.utils.io.h, int, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object h(h hVar, int i10, Function1<? super ByteBuffer, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) throws EOFException {
        if (i10 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        if (i10 > 0) {
            kotlin.jvm.internal.h0.e(0);
            Object objF = hVar.f(i10, dVar);
            kotlin.jvm.internal.h0.e(1);
            if (!((Boolean) objF).booleanValue()) {
                throw new EOFException("Not enough bytes available: required " + i10 + " but " + k.m(hVar) + " available");
            }
            ui.k.b(hVar.j(), function1);
        } else {
            kotlin.jvm.internal.h0.e(0);
            Object objA = h.b.a(hVar, 0, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
            if (((Boolean) objA).booleanValue()) {
                ui.k.b(hVar.j(), function1);
            }
        }
        return Unit.f312394a;
    }

    public static /* synthetic */ Object i(h hVar, int i10, Function1 function1, kotlin.coroutines.d dVar, int i11, Object obj) throws EOFException {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        if (i10 > 0) {
            kotlin.jvm.internal.h0.e(0);
            Object objF = hVar.f(i10, dVar);
            kotlin.jvm.internal.h0.e(1);
            if (!((Boolean) objF).booleanValue()) {
                throw new EOFException("Not enough bytes available: required " + i10 + " but " + k.m(hVar) + " available");
            }
            ui.k.b(hVar.j(), function1);
        } else {
            kotlin.jvm.internal.h0.e(0);
            Object objA = h.b.a(hVar, 0, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
            if (((Boolean) objA).booleanValue()) {
                ui.k.b(hVar.j(), function1);
            }
        }
        return Unit.f312394a;
    }

    public static final int j(@NotNull h hVar, @NotNull Function1<? super ByteBuffer, Integer> block) throws EOFException {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (hVar.k() || hVar.j().y1()) {
            return -1;
        }
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = hVar.j().n();
        if (bVarN.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        kotlinx.io.t tVarG = bVarN.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iH, tVarG.d() - iH);
        Intrinsics.checkNotNull(byteBufferWrap);
        int iIntValue = block.invoke(byteBufferWrap).intValue();
        if (iIntValue == 0) {
            return iIntValue;
        }
        if (iIntValue < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (iIntValue > tVarG.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        bVarN.skip(iIntValue);
        return iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object k(@NotNull h hVar, @NotNull ByteBuffer byteBuffer, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f297107d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f297107d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f297106c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f297107d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (hVar.k()) {
                return kotlin.coroutines.jvm.internal.b.f(-1);
            }
            if (hVar.j().y1()) {
                cVar.f297104a = hVar;
                cVar.f297105b = byteBuffer;
                cVar.f297107d = 1;
                if (h.b.a(hVar, 0, cVar, 1, null) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) cVar.f297105b;
            hVar = (h) cVar.f297104a;
            ResultKt.m(obj);
        }
        return hVar.k() ? kotlin.coroutines.jvm.internal.b.f(-1) : kotlin.coroutines.jvm.internal.b.f(kotlinx.io.f0.g(hVar.j(), byteBuffer));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:25:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:24:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0049
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object l(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r6, @org.jetbrains.annotations.NotNull java.nio.ByteBuffer r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.m.d
            if (r0 == 0) goto L14
            r0 = r8
            r0 = r8
            io.ktor.utils.io.m$d r0 = (io.ktor.utils.io.m.d) r0
            int r1 = r0.f297111d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f297111d = r1
            goto L19
        L14:
            io.ktor.utils.io.m$d r0 = new io.ktor.utils.io.m$d
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.f297110c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297111d
            r3 = 1
            r5 = r3
            if (r2 == 0) goto L3e
            r5 = 6
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f297109b
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            r5 = 6
            java.lang.Object r7 = r0.f297108a
            io.ktor.utils.io.h r7 = (io.ktor.utils.io.h) r7
            kotlin.ResultKt.m(r8)
            goto L65
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 0
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            r5 = 5
            kotlin.ResultKt.m(r8)
        L42:
            r5 = 5
            boolean r8 = r7.hasRemaining()
            if (r8 == 0) goto L71
            int r8 = io.ktor.utils.io.k.m(r6)
            r5 = 1
            if (r8 != 0) goto L68
            r5 = 4
            r0.f297108a = r6
            r0.f297109b = r7
            r0.f297111d = r3
            r5 = 4
            r8 = 0
            r5 = 1
            r2 = 0
            java.lang.Object r8 = io.ktor.utils.io.h.b.a(r6, r8, r0, r3, r2)
            if (r8 != r1) goto L62
            return r1
        L62:
            r4 = r7
            r7 = r6
            r6 = r4
        L65:
            r4 = r7
            r7 = r6
            r6 = r4
        L68:
            r5 = 3
            kotlinx.io.c0 r8 = r6.j()
            kotlinx.io.f0.g(r8, r7)
            goto L42
        L71:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.m.l(io.ktor.utils.io.h, java.nio.ByteBuffer, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object m(@NotNull h hVar, @NotNull ByteBuffer byteBuffer, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws EOFException {
        Object objN = n(hVar, c(byteBuffer), dVar);
        return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:20:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object n(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r8, @org.jetbrains.annotations.NotNull kotlinx.io.bytestring.c r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) throws java.io.EOFException {
        /*
            r7 = 3
            boolean r0 = r10 instanceof io.ktor.utils.io.m.e
            r7 = 6
            if (r0 == 0) goto L19
            r0 = r10
            r0 = r10
            io.ktor.utils.io.m$e r0 = (io.ktor.utils.io.m.e) r0
            int r1 = r0.f297117f
            r7 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 3
            r3 = r1 & r2
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r7 = 3
            r0.f297117f = r1
            goto L1f
        L19:
            io.ktor.utils.io.m$e r0 = new io.ktor.utils.io.m$e
            r7 = 0
            r0.<init>(r10)
        L1f:
            java.lang.Object r10 = r0.f297116e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297117f
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L3e
            int r8 = r0.f297115d
            int r9 = r0.f297114c
            java.lang.Object r2 = r0.f297113b
            kotlinx.io.bytestring.c r2 = (kotlinx.io.bytestring.c) r2
            java.lang.Object r4 = r0.f297112a
            io.ktor.utils.io.h r4 = (io.ktor.utils.io.h) r4
            r7 = 5
            kotlin.ResultKt.m(r10)
            r7 = 5
            goto L72
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 3
            r8.<init>(r9)
            r7 = 5
            throw r8
        L48:
            kotlin.ResultKt.m(r10)
            int r10 = r9.r()
            r7 = 6
            r2 = 0
            r6 = r9
            r9 = r8
            r7 = 2
            r8 = r10
            r10 = r6
            r10 = r6
        L57:
            if (r2 >= r8) goto L90
            r0.f297112a = r9
            r0.f297113b = r10
            r0.f297114c = r2
            r7 = 7
            r0.f297115d = r8
            r0.f297117f = r3
            java.lang.Object r4 = io.ktor.utils.io.k.y(r9, r0)
            r7 = 2
            if (r4 != r1) goto L6c
            return r1
        L6c:
            r6 = r4
            r4 = r9
            r7 = 7
            r9 = r2
            r2 = r10
            r10 = r6
        L72:
            java.lang.Number r10 = (java.lang.Number) r10
            byte r10 = r10.byteValue()
            byte r5 = r2.p(r9)
            r7 = 3
            if (r10 != r5) goto L87
            int r9 = r9 + 1
            r10 = r2
            r2 = r9
            r2 = r9
            r9 = r4
            r7 = 3
            goto L57
        L87:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Delimiter is not found"
            r8.<init>(r9)
            r7 = 3
            throw r8
        L90:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.m.n(io.ktor.utils.io.h, kotlinx.io.bytestring.c, kotlin.coroutines.d):java.lang.Object");
    }
}

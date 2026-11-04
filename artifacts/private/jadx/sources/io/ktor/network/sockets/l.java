package io.ktor.network.sockets;

import io.sentry.k4;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {33, 75, com.planner5d.library.engine.input.f.b.X, 50}, m = "invokeSuspend", n = {k4.f305718l3, k4.f305718l3, "rc", "$this$read_u24default$iv", "consumer$iv", "min$iv", k4.f305718l3, "rc", "$this$read_u24default$iv", "consumer$iv", k4.f305718l3}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
    @SourceDebugExtension({"SMAP\nCIOWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOWriter.kt\nio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1\n+ 2 ByteReadChannelOperations.jvm.kt\nio/ktor/utils/io/ByteReadChannelOperations_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utils.kt\nio/ktor/network/util/UtilsKt\n*L\n1#1,69:1\n188#2,3:70\n191#2,9:74\n1#3:73\n80#4,10:83\n*S KotlinDebug\n*F\n+ 1 CIOWriter.kt\nio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1\n*L\n38#1:70,3\n38#1:74,9\n38#1:73\n40#1:83,10\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.z0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f296277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ io.ktor.network.selector.h f296278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p0.e f296279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f296280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ io.ktor.network.selector.j f296281j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ WritableByteChannel f296282k;

        /* JADX INFO: renamed from: io.ktor.network.sockets.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$timeout$1", f = "CIOWriter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2081a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.b f296284b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2081a(io.ktor.utils.io.b bVar, kotlin.coroutines.d<? super C2081a> dVar) {
                super(1, dVar);
                this.f296284b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new C2081a(this.f296284b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f296283a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                io.ktor.utils.io.t.e(this.f296284b, new SocketTimeoutException());
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2081a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.network.selector.h hVar, p0.e eVar, io.ktor.utils.io.b bVar, io.ktor.network.selector.j jVar, WritableByteChannel writableByteChannel, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f296278g = hVar;
            this.f296279h = eVar;
            this.f296280i = bVar;
            this.f296281j = jVar;
            this.f296282k = writableByteChannel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(io.ktor.network.util.b bVar, i1.f fVar, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
            while (byteBuffer.hasRemaining()) {
                if (bVar == null) {
                    do {
                        fVar.f312749a = writableByteChannel.write(byteBuffer);
                        if (!byteBuffer.hasRemaining()) {
                            break;
                        }
                    } while (fVar.f312749a > 0);
                } else {
                    bVar.f();
                    do {
                        try {
                            fVar.f312749a = writableByteChannel.write(byteBuffer);
                            if (!byteBuffer.hasRemaining()) {
                                break;
                            }
                        } catch (Throwable th2) {
                            bVar.g();
                            throw th2;
                        }
                    } while (fVar.f312749a > 0);
                    Unit unit = Unit.f312394a;
                    bVar.g();
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f296278g, this.f296279h, this.f296280i, this.f296281j, this.f296282k, dVar);
            aVar.f296277f = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b6 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x001c, B:34:0x00ae, B:36:0x00b6, B:38:0x00be, B:41:0x00d1, B:45:0x00f6, B:47:0x00fe, B:48:0x0107, B:50:0x010b, B:53:0x0127, B:54:0x014e, B:56:0x0151, B:17:0x003c, B:19:0x0049, B:22:0x0066, B:26:0x0084, B:28:0x0088, B:31:0x0094), top: B:74:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00be A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x001c, B:34:0x00ae, B:36:0x00b6, B:38:0x00be, B:41:0x00d1, B:45:0x00f6, B:47:0x00fe, B:48:0x0107, B:50:0x010b, B:53:0x0127, B:54:0x014e, B:56:0x0151, B:17:0x003c, B:19:0x0049, B:22:0x0066, B:26:0x0084, B:28:0x0088, B:31:0x0094), top: B:74:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00f1 A[EDGE_INSN: B:43:0x00f1->B:52:0x0126 BREAK  A[LOOP:0: B:34:0x00ae->B:85:?]] */
        /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00fe A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x001c, B:34:0x00ae, B:36:0x00b6, B:38:0x00be, B:41:0x00d1, B:45:0x00f6, B:47:0x00fe, B:48:0x0107, B:50:0x010b, B:53:0x0127, B:54:0x014e, B:56:0x0151, B:17:0x003c, B:19:0x0049, B:22:0x0066, B:26:0x0084, B:28:0x0088, B:31:0x0094), top: B:74:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:50:0x010b A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x001c, B:34:0x00ae, B:36:0x00b6, B:38:0x00be, B:41:0x00d1, B:45:0x00f6, B:47:0x00fe, B:48:0x0107, B:50:0x010b, B:53:0x0127, B:54:0x014e, B:56:0x0151, B:17:0x003c, B:19:0x0049, B:22:0x0066, B:26:0x0084, B:28:0x0088, B:31:0x0094), top: B:74:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0151 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x001c, B:34:0x00ae, B:36:0x00b6, B:38:0x00be, B:41:0x00d1, B:45:0x00f6, B:47:0x00fe, B:48:0x0107, B:50:0x010b, B:53:0x0127, B:54:0x014e, B:56:0x0151, B:17:0x003c, B:19:0x0049, B:22:0x0066, B:26:0x0084, B:28:0x0088, B:31:0x0094), top: B:74:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0167 A[Catch: ClosedChannelException -> 0x017a, TryCatch #1 {ClosedChannelException -> 0x017a, blocks: (B:59:0x0161, B:61:0x0167, B:62:0x016f), top: B:76:0x0161 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x016f A[Catch: ClosedChannelException -> 0x017a, TRY_LEAVE, TryCatch #1 {ClosedChannelException -> 0x017a, blocks: (B:59:0x0161, B:61:0x0167, B:62:0x016f), top: B:76:0x0161 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x014f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:? A[PHI: r11
          PHI (r11v3 io.ktor.network.util.b) = (r11v0 io.ktor.network.util.b), (r11v0 io.ktor.network.util.b), (r11v5 io.ktor.network.util.b) binds: [B:49:0x0109, B:51:0x0124, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0109 -> B:34:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0124 -> B:34:0x00ae). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.z0 z0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(z0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final io.ktor.utils.io.y0 a(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull io.ktor.utils.io.b channel, @NotNull WritableByteChannel nioChannel, @NotNull io.ktor.network.selector.h selectable, @NotNull io.ktor.network.selector.j selector, @Nullable p0.e eVar) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return io.ktor.utils.io.k.V(s0Var, l1.c().plus(new kotlinx.coroutines.r0("cio-to-nio-writer")), channel, new a(selectable, eVar, channel, selector, nioChannel, null));
    }

    public static /* synthetic */ io.ktor.utils.io.y0 b(kotlinx.coroutines.s0 s0Var, io.ktor.utils.io.b bVar, WritableByteChannel writableByteChannel, io.ktor.network.selector.h hVar, io.ktor.network.selector.j jVar, p0.e eVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            eVar = null;
        }
        return a(s0Var, bVar, writableByteChannel, hVar, jVar, eVar);
    }
}

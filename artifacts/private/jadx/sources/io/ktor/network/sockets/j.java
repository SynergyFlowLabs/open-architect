package io.ktor.network.sockets;

import io.sentry.k4;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
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
public final class j {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", f = "CIOReader.kt", i = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7}, l = {96, 105, 108, 109, 96, 105, 108, 109}, m = "invokeSuspend", n = {k4.f305718l3, k4.f305718l3, k4.f305718l3, k4.f305718l3, k4.f305718l3, "$this$withTimeout$iv", k4.f305718l3, "$this$withTimeout$iv", k4.f305718l3, "$this$withTimeout$iv", k4.f305718l3, "$this$withTimeout$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nCIOReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1\n+ 2 Utils.kt\nio/ktor/network/util/UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n80#2,10:145\n1#3:155\n*S KotlinDebug\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1\n*L\n95#1:145,10\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f296238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f296239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ io.ktor.network.selector.h f296240h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p0.e f296241i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f296242j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ReadableByteChannel f296243k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ io.ktor.network.selector.j f296244l;

        /* JADX INFO: renamed from: io.ktor.network.sockets.j$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1$timeout$1", f = "CIOReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2080a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.b f296246b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2080a(io.ktor.utils.io.b bVar, kotlin.coroutines.d<? super C2080a> dVar) {
                super(1, dVar);
                this.f296246b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new C2080a(this.f296246b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f296245a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                io.ktor.utils.io.t.e(this.f296246b, new SocketTimeoutException());
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2080a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.network.selector.h hVar, p0.e eVar, io.ktor.utils.io.b bVar, ReadableByteChannel readableByteChannel, io.ktor.network.selector.j jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f296240h = hVar;
            this.f296241i = eVar;
            this.f296242j = bVar;
            this.f296243k = readableByteChannel;
            this.f296244l = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f296240h, this.f296241i, this.f296242j, this.f296243k, this.f296244l, dVar);
            aVar.f296239g = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:59:0x01b1 A[Catch: all -> 0x00b6, PHI: r1 r4 r5 r6 r7
          0x01b1: PHI (r1v19 io.ktor.network.selector.j) = (r1v5 io.ktor.network.selector.j), (r1v17 io.ktor.network.selector.j), (r1v20 io.ktor.network.selector.j) binds: [B:30:0x00f0, B:66:0x01e8, B:57:0x01ad] A[DONT_GENERATE, DONT_INLINE]
          0x01b1: PHI (r4v19 io.ktor.network.selector.h) = (r4v5 io.ktor.network.selector.h), (r4v17 io.ktor.network.selector.h), (r4v20 io.ktor.network.selector.h) binds: [B:30:0x00f0, B:66:0x01e8, B:57:0x01ad] A[DONT_GENERATE, DONT_INLINE]
          0x01b1: PHI (r5v20 java.nio.channels.ReadableByteChannel) = 
          (r5v6 java.nio.channels.ReadableByteChannel)
          (r5v18 java.nio.channels.ReadableByteChannel)
          (r5v21 java.nio.channels.ReadableByteChannel)
         binds: [B:30:0x00f0, B:66:0x01e8, B:57:0x01ad] A[DONT_GENERATE, DONT_INLINE]
          0x01b1: PHI (r6v18 io.ktor.utils.io.b) = (r6v4 io.ktor.utils.io.b), (r6v16 io.ktor.utils.io.b), (r6v19 io.ktor.utils.io.b) binds: [B:30:0x00f0, B:66:0x01e8, B:57:0x01ad] A[DONT_GENERATE, DONT_INLINE]
          0x01b1: PHI (r7v19 io.ktor.network.util.b) = (r7v5 io.ktor.network.util.b), (r7v17 io.ktor.network.util.b), (r7v20 io.ktor.network.util.b) binds: [B:30:0x00f0, B:66:0x01e8, B:57:0x01ad] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x00b6, blocks: (B:89:0x027d, B:44:0x0150, B:46:0x0159, B:48:0x0165, B:52:0x0188, B:54:0x0191, B:56:0x0197, B:59:0x01b1, B:62:0x01c9, B:65:0x01e0, B:68:0x01ec, B:94:0x028c, B:95:0x028f, B:97:0x0298, B:106:0x02c4, B:90:0x0285, B:91:0x0288, B:21:0x00b1, B:26:0x00d1, B:29:0x00ed, B:32:0x0109, B:35:0x0118, B:37:0x0126, B:41:0x0134, B:7:0x002e, B:86:0x0271, B:80:0x023e, B:83:0x0259, B:88:0x027a, B:69:0x01ef, B:73:0x0213, B:75:0x021d, B:77:0x0225, B:12:0x0051, B:15:0x0073, B:18:0x0095), top: B:116:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:62:0x01c9 A[Catch: all -> 0x00b6, PHI: r1 r4 r5 r6 r7
          0x01c9: PHI (r1v18 io.ktor.network.selector.j) = (r1v7 io.ktor.network.selector.j), (r1v19 io.ktor.network.selector.j) binds: [B:26:0x00d1, B:60:0x01c5] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r4v18 io.ktor.network.selector.h) = (r4v7 io.ktor.network.selector.h), (r4v19 io.ktor.network.selector.h) binds: [B:26:0x00d1, B:60:0x01c5] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r5v19 java.nio.channels.ReadableByteChannel) = (r5v8 java.nio.channels.ReadableByteChannel), (r5v20 java.nio.channels.ReadableByteChannel) binds: [B:26:0x00d1, B:60:0x01c5] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r6v17 io.ktor.utils.io.b) = (r6v6 io.ktor.utils.io.b), (r6v18 io.ktor.utils.io.b) binds: [B:26:0x00d1, B:60:0x01c5] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r7v18 io.ktor.network.util.b) = (r7v7 io.ktor.network.util.b), (r7v19 io.ktor.network.util.b) binds: [B:26:0x00d1, B:60:0x01c5] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x00b6, blocks: (B:89:0x027d, B:44:0x0150, B:46:0x0159, B:48:0x0165, B:52:0x0188, B:54:0x0191, B:56:0x0197, B:59:0x01b1, B:62:0x01c9, B:65:0x01e0, B:68:0x01ec, B:94:0x028c, B:95:0x028f, B:97:0x0298, B:106:0x02c4, B:90:0x0285, B:91:0x0288, B:21:0x00b1, B:26:0x00d1, B:29:0x00ed, B:32:0x0109, B:35:0x0118, B:37:0x0126, B:41:0x0134, B:7:0x002e, B:86:0x0271, B:80:0x023e, B:83:0x0259, B:88:0x027a, B:69:0x01ef, B:73:0x0213, B:75:0x021d, B:77:0x0225, B:12:0x0051, B:15:0x0073, B:18:0x0095), top: B:116:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x01de  */
        /* JADX WARN: Code duplicated, block: B:65:0x01e0 A[Catch: all -> 0x00b6, PHI: r1 r4 r5 r6 r7 r15
          0x01e0: PHI (r1v17 io.ktor.network.selector.j) = (r1v9 io.ktor.network.selector.j), (r1v18 io.ktor.network.selector.j) binds: [B:21:0x00b1, B:63:0x01dc] A[DONT_GENERATE, DONT_INLINE]
          0x01e0: PHI (r4v17 io.ktor.network.selector.h) = (r4v9 io.ktor.network.selector.h), (r4v18 io.ktor.network.selector.h) binds: [B:21:0x00b1, B:63:0x01dc] A[DONT_GENERATE, DONT_INLINE]
          0x01e0: PHI (r5v18 java.nio.channels.ReadableByteChannel) = (r5v10 java.nio.channels.ReadableByteChannel), (r5v19 java.nio.channels.ReadableByteChannel) binds: [B:21:0x00b1, B:63:0x01dc] A[DONT_GENERATE, DONT_INLINE]
          0x01e0: PHI (r6v16 io.ktor.utils.io.b) = (r6v8 io.ktor.utils.io.b), (r6v17 io.ktor.utils.io.b) binds: [B:21:0x00b1, B:63:0x01dc] A[DONT_GENERATE, DONT_INLINE]
          0x01e0: PHI (r7v17 io.ktor.network.util.b) = (r7v9 io.ktor.network.util.b), (r7v18 io.ktor.network.util.b) binds: [B:21:0x00b1, B:63:0x01dc] A[DONT_GENERATE, DONT_INLINE]
          0x01e0: PHI (r15v20 java.lang.Object) = (r15v0 java.lang.Object), (r15v24 java.lang.Object) binds: [B:21:0x00b1, B:63:0x01dc] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x00b6, blocks: (B:89:0x027d, B:44:0x0150, B:46:0x0159, B:48:0x0165, B:52:0x0188, B:54:0x0191, B:56:0x0197, B:59:0x01b1, B:62:0x01c9, B:65:0x01e0, B:68:0x01ec, B:94:0x028c, B:95:0x028f, B:97:0x0298, B:106:0x02c4, B:90:0x0285, B:91:0x0288, B:21:0x00b1, B:26:0x00d1, B:29:0x00ed, B:32:0x0109, B:35:0x0118, B:37:0x0126, B:41:0x0134, B:7:0x002e, B:86:0x0271, B:80:0x023e, B:83:0x0259, B:88:0x027a, B:69:0x01ef, B:73:0x0213, B:75:0x021d, B:77:0x0225, B:12:0x0051, B:15:0x0073, B:18:0x0095), top: B:116:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x01ea  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0191 -> B:44:0x0150). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0195 -> B:44:0x0150). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01e8 -> B:59:0x01b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01ea -> B:44:0x0150). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x021d -> B:88:0x027a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0223 -> B:88:0x027a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x026e -> B:86:0x0271). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {42, 44, 42, 44, 55}, m = "invokeSuspend", n = {k4.f305718l3, "rc", k4.f305718l3, "rc", k4.f305718l3, "rc", "$this$withTimeout$iv", k4.f305718l3, "rc", "$this$withTimeout$iv", k4.f305718l3}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nCIOReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1\n+ 2 Utils.kt\nio/ktor/network/util/UtilsKt\n*L\n1#1,144:1\n80#2,10:145\n*S KotlinDebug\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1\n*L\n38#1:145,10\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f296252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f296253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f296254h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f296255i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p0.e f296256j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f296257k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ io.ktor.network.selector.h f296258l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f296259m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.pool.h<ByteBuffer> f296260n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ReadableByteChannel f296261o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ io.ktor.network.selector.j f296262s;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1$timeout$1", f = "CIOReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.b f296264b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(io.ktor.utils.io.b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f296264b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f296264b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f296263a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                io.ktor.utils.io.t.e(this.f296264b, new SocketTimeoutException());
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p0.e eVar, io.ktor.utils.io.b bVar, io.ktor.network.selector.h hVar, ByteBuffer byteBuffer, io.ktor.utils.io.pool.h<ByteBuffer> hVar2, ReadableByteChannel readableByteChannel, io.ktor.network.selector.j jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f296256j = eVar;
            this.f296257k = bVar;
            this.f296258l = hVar;
            this.f296259m = byteBuffer;
            this.f296260n = hVar2;
            this.f296261o = readableByteChannel;
            this.f296262s = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f296256j, this.f296257k, this.f296258l, this.f296259m, this.f296260n, this.f296261o, this.f296262s, dVar);
            bVar.f296255i = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:55:0x0170 A[Catch: all -> 0x0055, PHI: r2 r9 r10 r11 r12 r13 r14 r15
          0x0170: PHI (r2v19 io.ktor.network.util.b) = (r2v15 io.ktor.network.util.b), (r2v30 io.ktor.network.util.b) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r9v8 kotlin.jvm.internal.i1$f) = (r9v3 kotlin.jvm.internal.i1$f), (r9v21 kotlin.jvm.internal.i1$f) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r10v7 java.nio.channels.ReadableByteChannel) = (r10v2 java.nio.channels.ReadableByteChannel), (r10v16 java.nio.channels.ReadableByteChannel) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r11v4 java.nio.ByteBuffer) = (r11v1 java.nio.ByteBuffer), (r11v9 java.nio.ByteBuffer) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r12v4 io.ktor.utils.io.b) = (r12v0 io.ktor.utils.io.b), (r12v13 io.ktor.utils.io.b) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r13v5 io.ktor.network.util.b) = (r13v2 io.ktor.network.util.b), (r13v14 io.ktor.network.util.b) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r14v6 io.ktor.network.selector.h) = (r14v1 io.ktor.network.selector.h), (r14v16 io.ktor.network.selector.h) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE]
          0x0170: PHI (r15v6 io.ktor.network.selector.j) = (r15v1 io.ktor.network.selector.j), (r15v15 io.ktor.network.selector.j) binds: [B:66:0x01e0, B:54:0x016c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #3 {all -> 0x0055, blocks: (B:55:0x0170, B:57:0x0178, B:61:0x01aa, B:65:0x01de, B:67:0x01e2, B:17:0x0050, B:22:0x0078), top: B:103:0x000e, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0178 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:55:0x0170, B:57:0x0178, B:61:0x01aa, B:65:0x01de, B:67:0x01e2, B:17:0x0050, B:22:0x0078), top: B:103:0x000e, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0190  */
        /* JADX WARN: Code duplicated, block: B:60:0x0192  */
        /* JADX WARN: Code duplicated, block: B:63:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:64:0x01c9 A[PHI: r2 r9 r10 r11 r12 r13 r14 r15
          0x01c9: PHI (r2v16 io.ktor.network.selector.j) = (r2v18 io.ktor.network.selector.j), (r2v39 io.ktor.network.selector.j) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r9v4 io.ktor.network.selector.h) = (r9v7 io.ktor.network.selector.h), (r9v29 io.ktor.network.selector.h) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r10v3 io.ktor.utils.io.b) = (r10v6 io.ktor.utils.io.b), (r10v24 io.ktor.utils.io.b) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r11v2 java.nio.ByteBuffer) = (r11v3 java.nio.ByteBuffer), (r11v17 java.nio.ByteBuffer) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r12v1 java.nio.channels.ReadableByteChannel) = (r12v3 java.nio.channels.ReadableByteChannel), (r12v21 java.nio.channels.ReadableByteChannel) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r13v3 io.ktor.network.util.b) = (r13v4 io.ktor.network.util.b), (r13v22 io.ktor.network.util.b) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r14v2 kotlin.jvm.internal.i1$f) = (r14v5 kotlin.jvm.internal.i1$f), (r14v24 kotlin.jvm.internal.i1$f) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r15v2 io.ktor.network.util.b) = (r15v5 io.ktor.network.util.b), (r15v19 io.ktor.network.util.b) binds: [B:62:0x01c5, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x01e2 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:55:0x0170, B:57:0x0178, B:61:0x01aa, B:65:0x01de, B:67:0x01e2, B:17:0x0050, B:22:0x0078), top: B:103:0x000e, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01ec A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:10:0x001e, B:85:0x0249, B:38:0x00f2, B:40:0x0103, B:42:0x010b, B:46:0x0137, B:50:0x0163, B:69:0x01e7, B:71:0x01ec, B:73:0x01f3, B:82:0x021f, B:53:0x0169, B:68:0x01e4, B:86:0x0251, B:87:0x0254, B:25:0x0099, B:28:0x00ba, B:31:0x00c8, B:33:0x00cc, B:36:0x00d8, B:55:0x0170, B:57:0x0178, B:61:0x01aa, B:65:0x01de, B:67:0x01e2, B:17:0x0050, B:22:0x0078), top: B:103:0x000e, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x01f3 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:10:0x001e, B:85:0x0249, B:38:0x00f2, B:40:0x0103, B:42:0x010b, B:46:0x0137, B:50:0x0163, B:69:0x01e7, B:71:0x01ec, B:73:0x01f3, B:82:0x021f, B:53:0x0169, B:68:0x01e4, B:86:0x0251, B:87:0x0254, B:25:0x0099, B:28:0x00ba, B:31:0x00c8, B:33:0x00cc, B:36:0x00d8, B:55:0x0170, B:57:0x0178, B:61:0x01aa, B:65:0x01de, B:67:0x01e2, B:17:0x0050, B:22:0x0078), top: B:103:0x000e, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x0209 A[Catch: ClosedChannelException -> 0x021c, TryCatch #0 {ClosedChannelException -> 0x021c, blocks: (B:76:0x0203, B:78:0x0209, B:79:0x0211), top: B:98:0x0203 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x0211 A[Catch: ClosedChannelException -> 0x021c, TRY_LEAVE, TryCatch #0 {ClosedChannelException -> 0x021c, blocks: (B:76:0x0203, B:78:0x0209, B:79:0x0211), top: B:98:0x0203 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x021f A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #2 {all -> 0x0023, blocks: (B:10:0x001e, B:85:0x0249, B:38:0x00f2, B:40:0x0103, B:42:0x010b, B:46:0x0137, B:50:0x0163, B:69:0x01e7, B:71:0x01ec, B:73:0x01f3, B:82:0x021f, B:53:0x0169, B:68:0x01e4, B:86:0x0251, B:87:0x0254, B:25:0x0099, B:28:0x00ba, B:31:0x00c8, B:33:0x00cc, B:36:0x00d8, B:55:0x0170, B:57:0x0178, B:61:0x01aa, B:65:0x01de, B:67:0x01e2, B:17:0x0050, B:22:0x0078), top: B:103:0x000e, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0165 -> B:40:0x0103). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01e0 -> B:55:0x0170). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0246 -> B:85:0x0249). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 636
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", i = {0}, l = {133}, m = "readFrom", n = {"count"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296267c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296266b = obj;
            this.f296267c |= Integer.MIN_VALUE;
            return j.h(null, null, this);
        }
    }

    @NotNull
    public static final io.ktor.utils.io.d1 d(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull io.ktor.utils.io.b channel, @NotNull ReadableByteChannel nioChannel, @NotNull io.ktor.network.selector.h selectable, @NotNull io.ktor.network.selector.j selector, @Nullable p0.e eVar) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return io.ktor.utils.io.t.D(s0Var, l1.c().plus(new kotlinx.coroutines.r0("cio-from-nio-reader")), channel, new a(selectable, eVar, channel, nioChannel, selector, null));
    }

    public static /* synthetic */ io.ktor.utils.io.d1 e(kotlinx.coroutines.s0 s0Var, io.ktor.utils.io.b bVar, ReadableByteChannel readableByteChannel, io.ktor.network.selector.h hVar, io.ktor.network.selector.j jVar, p0.e eVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            eVar = null;
        }
        return d(s0Var, bVar, readableByteChannel, hVar, jVar, eVar);
    }

    @NotNull
    public static final io.ktor.utils.io.d1 f(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull io.ktor.utils.io.b channel, @NotNull ReadableByteChannel nioChannel, @NotNull io.ktor.network.selector.h selectable, @NotNull io.ktor.network.selector.j selector, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool, @Nullable p0.e eVar) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return io.ktor.utils.io.t.D(s0Var, l1.c().plus(new kotlinx.coroutines.r0("cio-from-nio-reader")), channel, new b(eVar, channel, selectable, pool.Jc(), pool, nioChannel, selector, null));
    }

    public static /* synthetic */ io.ktor.utils.io.d1 g(kotlinx.coroutines.s0 s0Var, io.ktor.utils.io.b bVar, ReadableByteChannel readableByteChannel, io.ktor.network.selector.h hVar, io.ktor.network.selector.j jVar, io.ktor.utils.io.pool.h hVar2, p0.e eVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            eVar = null;
        }
        return f(s0Var, bVar, readableByteChannel, hVar, jVar, hVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object h(io.ktor.utils.io.p pVar, final ReadableByteChannel readableByteChannel, kotlin.coroutines.d<? super Integer> dVar) {
        c cVar;
        i1.f fVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f296267c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f296267c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f296266b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f296267c;
        if (i11 == 0) {
            ResultKt.m(obj);
            final i1.f fVar2 = new i1.f();
            Function1 function1 = new Function1() { // from class: io.ktor.network.sockets.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return j.i(fVar2, readableByteChannel, (ByteBuffer) obj2);
                }
            };
            cVar2.f296265a = fVar2;
            cVar2.f296267c = 1;
            if (io.ktor.utils.io.u.b(pVar, 0, function1, cVar2, 1, null) == objL) {
                return objL;
            }
            fVar = fVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (i1.f) cVar2.f296265a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(fVar.f312749a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(i1.f fVar, ReadableByteChannel readableByteChannel, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        fVar.f312749a = readableByteChannel.read(buffer);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(io.ktor.network.selector.h hVar, io.ktor.network.selector.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
        io.ktor.network.selector.g gVar = io.ktor.network.selector.g.READ;
        hVar.W3(gVar, true);
        Object objI3 = jVar.i3(hVar, gVar, dVar);
        return objI3 == kotlin.coroutines.intrinsics.b.l() ? objI3 : Unit.f312394a;
    }
}

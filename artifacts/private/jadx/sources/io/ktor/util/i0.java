package io.ktor.util;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDeflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deflater.kt\nio/ktor/util/DeflaterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,129:1\n1#2:130\n11#3:131\n19#3:132\n19#3:133\n*S KotlinDebug\n*F\n+ 1 Deflater.kt\nio/ktor/util/DeflaterKt\n*L\n37#1:131\n43#1:132\n44#1:133\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final short f296612a = -29921;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final byte[] f296613b = new byte[7];

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {72, com.planner5d.library.engine.input.f.b.f160716p, com.planner5d.library.engine.input.f.b.f160705l0, com.planner5d.library.engine.input.f.b.f160696i0, com.planner5d.library.engine.input.f.b.f160711n0}, m = "deflateTo", n = {"$this$deflateTo", "destination", "pool", "crc", "deflater", MetricTracker.Object.INPUT, "compressed", "gzip", "$this$deflateTo", "destination", "pool", "crc", "deflater", MetricTracker.Object.INPUT, "compressed", "gzip", "$this$deflateTo", "destination", "pool", "crc", "deflater", MetricTracker.Object.INPUT, "compressed", "gzip", "destination", "pool", "crc", "deflater", MetricTracker.Object.INPUT, "compressed", "gzip", "pool", "deflater", MetricTracker.Object.INPUT, "compressed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f296619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f296620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f296621h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f296622i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f296623j;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296622i = obj;
            this.f296623j |= Integer.MIN_VALUE;
            return i0.g(null, null, false, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0}, l = {52}, m = "deflateWhile", n = {"$this$deflateWhile", "deflater", "buffer", "predicate"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f296628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f296629f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296628e = obj;
            this.f296629f |= Integer.MIN_VALUE;
            return i0.l(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.DeflaterKt$deflated$1", f = "Deflater.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f296633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.pool.h<ByteBuffer> f296634e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(io.ktor.utils.io.h hVar, boolean z10, io.ktor.utils.io.pool.h<ByteBuffer> hVar2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f296632c = hVar;
            this.f296633d = z10;
            this.f296634e = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f296632c, this.f296633d, this.f296634e, dVar);
            cVar.f296631b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296630a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.utils.io.e1 e1Var = (io.ktor.utils.io.e1) this.f296631b;
                io.ktor.utils.io.h hVar = this.f296632c;
                io.ktor.utils.io.p pVarC = e1Var.c();
                boolean z10 = this.f296633d;
                io.ktor.utils.io.pool.h<ByteBuffer> hVar2 = this.f296634e;
                this.f296630a = 1;
                if (i0.g(hVar, pVarC, z10, hVar2, this) == objL) {
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
        public final Object invoke(io.ktor.utils.io.e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.z0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.p f296637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f296638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.pool.h<ByteBuffer> f296639e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(io.ktor.utils.io.p pVar, boolean z10, io.ktor.utils.io.pool.h<ByteBuffer> hVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f296637c = pVar;
            this.f296638d = z10;
            this.f296639e = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f296637c, this.f296638d, this.f296639e, dVar);
            dVar2.f296636b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296635a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.utils.io.h hVarC = ((io.ktor.utils.io.z0) this.f296636b).c();
                io.ktor.utils.io.p pVar = this.f296637c;
                boolean z10 = this.f296638d;
                io.ktor.utils.io.pool.h<ByteBuffer> hVar = this.f296639e;
                this.f296635a = 1;
                if (i0.g(hVarC, pVar, z10, hVar, this) == objL) {
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
        public final Object invoke(io.ktor.utils.io.z0 z0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(z0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 1}, l = {37, 38, 39}, m = "putGzipHeader", n = {"$this$putGzipHeader", "$this$putGzipHeader"}, s = {"L$0", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296642c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296641b = obj;
            this.f296642c |= Integer.MIN_VALUE;
            return i0.r(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0}, l = {43, 44}, m = "putGzipTrailer", n = {"$this$putGzipTrailer", "deflater"}, s = {"L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296646d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296645c = obj;
            this.f296646d |= Integer.MIN_VALUE;
            return i0.s(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x0163 A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #0 {all -> 0x01d1, blocks: (B:51:0x015d, B:53:0x0163, B:68:0x01d5, B:70:0x01db, B:82:0x022b), top: B:85:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0180  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196 A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #5 {all -> 0x01be, blocks: (B:57:0x018e, B:59:0x0196), top: B:94:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(io.ktor.utils.io.h r17, io.ktor.utils.io.p r18, boolean r19, io.ktor.utils.io.pool.h<java.nio.ByteBuffer> r20, kotlin.coroutines.d<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.i0.g(io.ktor.utils.io.h, io.ktor.utils.io.p, boolean, io.ktor.utils.io.pool.h, kotlin.coroutines.d):java.lang.Object");
    }

    private static final void h(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()));
        }
    }

    static /* synthetic */ Object i(io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, boolean z10, io.ktor.utils.io.pool.h hVar2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            hVar2 = io.ktor.util.cio.a.a();
        }
        return g(hVar, pVar, z10, hVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(Deflater deflater) {
        return !deflater.needsInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(Deflater deflater) {
        return !deflater.finished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object l(io.ktor.utils.io.p pVar, Deflater deflater, ByteBuffer byteBuffer, Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f296629f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f296629f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f296628e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f296629f;
        if (i11 == 0) {
            ResultKt.m(obj);
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Boolean> function1 = (Function0) bVar.f296627d;
            ByteBuffer byteBuffer2 = (ByteBuffer) bVar.f296626c;
            Deflater deflater2 = (Deflater) bVar.f296625b;
            io.ktor.utils.io.p pVar2 = (io.ktor.utils.io.p) bVar.f296624a;
            ResultKt.m(obj);
            function0 = function1;
            pVar = pVar2;
            byteBuffer = byteBuffer2;
            deflater = deflater2;
        }
        while (function0.invoke().booleanValue()) {
            byteBuffer.clear();
            h(deflater, byteBuffer);
            byteBuffer.flip();
            bVar.f296624a = pVar;
            bVar.f296625b = deflater;
            bVar.f296626c = byteBuffer;
            bVar.f296627d = function0;
            bVar.f296629f = 1;
            if (io.ktor.utils.io.u.g(pVar, byteBuffer, bVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.utils.io.h m(@NotNull io.ktor.utils.io.h hVar, boolean z10, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.t.E(f2.f314023a, coroutineContext, true, new c(hVar, z10, pool, null)).b();
    }

    @NotNull
    public static final io.ktor.utils.io.p n(@NotNull io.ktor.utils.io.p pVar, boolean z10, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.k.W(f2.f314023a, coroutineContext, true, new d(pVar, z10, pool, null)).b();
    }

    public static /* synthetic */ io.ktor.utils.io.h o(io.ktor.utils.io.h hVar, boolean z10, io.ktor.utils.io.pool.h hVar2, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            hVar2 = io.ktor.util.cio.a.a();
        }
        if ((i10 & 4) != 0) {
            coroutineContext = kotlinx.coroutines.l1.g();
        }
        return m(hVar, z10, hVar2, coroutineContext);
    }

    public static /* synthetic */ io.ktor.utils.io.p p(io.ktor.utils.io.p pVar, boolean z10, io.ktor.utils.io.pool.h hVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            hVar = io.ktor.util.cio.a.a();
        }
        if ((i10 & 4) != 0) {
            coroutineContext = kotlinx.coroutines.l1.g();
        }
        return n(pVar, z10, hVar, coroutineContext);
    }

    @NotNull
    public static final byte[] q() {
        return f296613b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (io.ktor.utils.io.t.u(r1, r2, 0, 0, r5, 6, null) == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(io.ktor.utils.io.p r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.util.i0.e
            if (r0 == 0) goto L19
            r0 = r10
            io.ktor.util.i0$e r0 = (io.ktor.util.i0.e) r0
            r8 = 4
            int r1 = r0.f296642c
            r8 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r8 = 2
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r8 = 5
            r0.f296642c = r1
        L16:
            r5 = r0
            r8 = 3
            goto L20
        L19:
            r8 = 0
            io.ktor.util.i0$e r0 = new io.ktor.util.i0$e
            r0.<init>(r10)
            goto L16
        L20:
            java.lang.Object r10 = r5.f296641b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            r8 = 1
            int r1 = r5.f296642c
            r8 = 5
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L5c
            r8 = 2
            if (r1 == r4) goto L53
            if (r1 == r3) goto L47
            if (r1 != r2) goto L3c
            r8 = 2
            kotlin.ResultKt.m(r10)
            r8 = 7
            goto L9c
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = " icefbu/t/owe o/ c /nnvikeeor /bs//eou aimlrehl/tot"
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 2
            r9.<init>(r10)
            throw r9
        L47:
            java.lang.Object r9 = r5.f296640a
            io.ktor.utils.io.p r9 = (io.ktor.utils.io.p) r9
            kotlin.ResultKt.m(r10)
        L4e:
            r1 = r9
            r1 = r9
            r8 = 6
            r9 = r2
            goto L85
        L53:
            java.lang.Object r9 = r5.f296640a
            io.ktor.utils.io.p r9 = (io.ktor.utils.io.p) r9
            r8 = 2
            kotlin.ResultKt.m(r10)
            goto L75
        L5c:
            r8 = 4
            kotlin.ResultKt.m(r10)
            r8 = 3
            r10 = -29921(0xffffffffffff8b1f, float:NaN)
            short r10 = (short) r10
            short r10 = java.lang.Short.reverseBytes(r10)
            r8 = 7
            r5.f296640a = r9
            r8 = 0
            r5.f296642c = r4
            java.lang.Object r10 = io.ktor.utils.io.t.z(r9, r10, r5)
            if (r10 != r0) goto L75
            goto L9a
        L75:
            r5.f296640a = r9
            r8 = 3
            r5.f296642c = r3
            r8 = 4
            r10 = 8
            java.lang.Object r10 = io.ktor.utils.io.t.p(r9, r10, r5)
            r8 = 4
            if (r10 != r0) goto L4e
            goto L9a
        L85:
            byte[] r2 = io.ktor.util.i0.f296613b
            r10 = 0
            r8 = r10
            r5.f296640a = r10
            r5.f296642c = r9
            r3 = 0
            r8 = 1
            r4 = 0
            r6 = 6
            r8 = 1
            r7 = 0
            r8 = 6
            java.lang.Object r9 = io.ktor.utils.io.t.u(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L9c
        L9a:
            r8 = 3
            return r0
        L9c:
            r8 = 6
            kotlin.Unit r9 = kotlin.Unit.f312394a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.i0.r(io.ktor.utils.io.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (io.ktor.utils.io.t.v(r8, r9, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(io.ktor.utils.io.p r8, java.util.zip.Checksum r9, java.util.zip.Deflater r10, kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            r7 = 3
            boolean r0 = r11 instanceof io.ktor.util.i0.f
            r7 = 4
            if (r0 == 0) goto L18
            r0 = r11
            io.ktor.util.i0$f r0 = (io.ktor.util.i0.f) r0
            r7 = 1
            int r1 = r0.f296646d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r7 = 6
            r0.f296646d = r1
            goto L1f
        L18:
            r7 = 4
            io.ktor.util.i0$f r0 = new io.ktor.util.i0$f
            r7 = 2
            r0.<init>(r11)
        L1f:
            r7 = 0
            java.lang.Object r11 = r0.f296645c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 3
            int r2 = r0.f296646d
            r3 = 2
            r7 = 0
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L41
            r7 = 4
            if (r2 != r3) goto L38
            kotlin.ResultKt.m(r11)
            r7 = 4
            goto L88
        L38:
            r7 = 6
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.f296644b
            r10 = r8
            r10 = r8
            java.util.zip.Deflater r10 = (java.util.zip.Deflater) r10
            java.lang.Object r8 = r0.f296643a
            io.ktor.utils.io.p r8 = (io.ktor.utils.io.p) r8
            r7 = 3
            kotlin.ResultKt.m(r11)
            goto L6d
        L50:
            kotlin.ResultKt.m(r11)
            long r5 = r9.getValue()
            r7 = 3
            int r9 = (int) r5
            r7 = 0
            int r9 = java.lang.Integer.reverseBytes(r9)
            r7 = 4
            r0.f296643a = r8
            r7 = 7
            r0.f296644b = r10
            r0.f296646d = r4
            java.lang.Object r9 = io.ktor.utils.io.t.v(r8, r9, r0)
            if (r9 != r1) goto L6d
            goto L87
        L6d:
            r7 = 6
            int r9 = r10.getTotalIn()
            int r9 = java.lang.Integer.reverseBytes(r9)
            r10 = 3
            r10 = 0
            r7 = 5
            r0.f296643a = r10
            r0.f296644b = r10
            r7 = 4
            r0.f296646d = r3
            java.lang.Object r8 = io.ktor.utils.io.t.v(r8, r9, r0)
            r7 = 2
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.i0.s(io.ktor.utils.io.p, java.util.zip.Checksum, java.util.zip.Deflater, kotlin.coroutines.d):java.lang.Object");
    }

    private static final void t(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static final void u(@NotNull Checksum checksum, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(checksum, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        checksum.update(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }
}

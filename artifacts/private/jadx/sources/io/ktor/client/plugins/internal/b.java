package io.ktor.client.plugins.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.io.d1;
import io.ktor.utils.io.e1;
import io.ktor.utils.io.h;
import io.ktor.utils.io.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f294845b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, FirebaseAnalytics.d.P);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f294846a;

    @NotNull
    private volatile /* synthetic */ Object content;

    /* JADX INFO: renamed from: io.ktor.client.plugins.internal.b$b, reason: collision with other inner class name */
    @f(c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", f = "ByteChannelReplay.kt", i = {0}, l = {35, 36}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
    static final class C2065b extends o implements Function2<e1, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h<a> f294858c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2065b(i1.h<a> hVar, d<? super C2065b> dVar) {
            super(2, dVar);
            this.f294858c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C2065b c2065b = new C2065b(this.f294858c, dVar);
            c2065b.f294857b = obj;
            return c2065b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        
            if (io.ktor.utils.io.t.u(r3, (byte[]) r12, 0, 0, r11, 6, null) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f294856a
                r10 = 7
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                r10 = 7
                if (r1 == r3) goto L20
                if (r1 != r2) goto L16
                r10 = 2
                kotlin.ResultKt.m(r12)
                r10 = 6
                goto L63
            L16:
                r10 = 0
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r10 = 1
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L20:
                r10 = 7
                java.lang.Object r1 = r11.f294857b
                io.ktor.utils.io.e1 r1 = (io.ktor.utils.io.e1) r1
                kotlin.ResultKt.m(r12)
                r10 = 0
                goto L47
            L2a:
                r10 = 2
                kotlin.ResultKt.m(r12)
                java.lang.Object r12 = r11.f294857b
                r1 = r12
                r1 = r12
                r10 = 3
                io.ktor.utils.io.e1 r1 = (io.ktor.utils.io.e1) r1
                kotlin.jvm.internal.i1$h<io.ktor.client.plugins.internal.b$a> r12 = r11.f294858c
                T r12 = r12.f312751a
                io.ktor.client.plugins.internal.b$a r12 = (io.ktor.client.plugins.internal.b.a) r12
                r10 = 4
                r11.f294857b = r1
                r11.f294856a = r3
                java.lang.Object r12 = r12.b(r11)
                if (r12 != r0) goto L47
                goto L62
            L47:
                r4 = r12
                byte[] r4 = (byte[]) r4
                io.ktor.utils.io.p r3 = r1.c()
                r10 = 1
                r12 = 0
                r11.f294857b = r12
                r11.f294856a = r2
                r10 = 4
                r5 = 0
                r6 = 0
                r10 = r6
                r8 = 6
                r9 = 0
                r7 = r11
                r10 = 2
                java.lang.Object r11 = io.ktor.utils.io.t.u(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L63
            L62:
                return r0
            L63:
                r10 = 2
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.internal.b.C2065b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, d<? super Unit> dVar) {
            return ((C2065b) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b(@NotNull h origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f294846a = origin;
        this.content = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, io.ktor.client.plugins.internal.b$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, java.lang.Object] */
    @NotNull
    public final h b() throws Throwable {
        if (this.f294846a.e() != null) {
            Throwable thE = this.f294846a.e();
            Intrinsics.checkNotNull(thE);
            throw thE;
        }
        i1.h hVar = new i1.h();
        ?? r10 = this.content;
        hVar.f312751a = r10;
        x xVar = null;
        Object[] objArr = 0;
        if (r10 == 0) {
            ?? aVar = new a(this, xVar, 1, objArr == true ? 1 : 0);
            hVar.f312751a = aVar;
            if (androidx.concurrent.futures.b.a(f294845b, this, null, aVar)) {
                return ((a) hVar.f312751a).f();
            }
            ?? r11 = this.content;
            Intrinsics.checkNotNull(r11);
            hVar.f312751a = r11;
        }
        return t.G(f2.f314023a, null, false, new C2065b(hVar, null), 3, null).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final x<byte[]> f294847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final f0 f294848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f294849c;

        /* JADX INFO: renamed from: io.ktor.client.plugins.internal.b$a$a, reason: collision with other inner class name */
        @f(c = "io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1", f = "ByteChannelReplay.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, l = {com.planner5d.library.engine.input.f.b.f160710n, com.planner5d.library.engine.input.f.b.D0, 63, 64}, m = "invokeSuspend", n = {"$this$writer", "body", "$this$writer", "body", "$this$writer", "body", "packet", "$this$writer", "body", "packet"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
        @SourceDebugExtension({"SMAP\nByteChannelReplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelReplay.kt\nio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
        static final class C2064a extends o implements Function2<e1, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f294850a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f294851b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f294852c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f294853d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f294854e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f294855f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2064a(b bVar, a aVar, d<? super C2064a> dVar) {
                super(2, dVar);
                this.f294854e = bVar;
                this.f294855f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C2064a c2064a = new C2064a(this.f294854e, this.f294855f, dVar);
                c2064a.f294853d = obj;
                return c2064a;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0058 A[PHI: r1 r7 r12
              0x0058: PHI (r1v2 io.ktor.utils.io.e1) = (r1v5 io.ktor.utils.io.e1), (r1v18 io.ktor.utils.io.e1) binds: [B:33:0x00cd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
              0x0058: PHI (r7v2 kotlinx.io.x) = (r7v3 kotlinx.io.x), (r7v10 kotlinx.io.x) binds: [B:33:0x00cd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
              0x0058: PHI (r12v4 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:33:0x00cd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:27:0x0088 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:9:0x0025, B:44:0x010e, B:25:0x007a, B:27:0x0088, B:29:0x0096, B:32:0x00ae, B:35:0x00d1, B:36:0x00d4, B:38:0x00df, B:41:0x00f8, B:45:0x0115, B:47:0x0122, B:50:0x0137, B:16:0x0044, B:19:0x0054, B:22:0x0067), top: B:54:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:29:0x0096 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:9:0x0025, B:44:0x010e, B:25:0x007a, B:27:0x0088, B:29:0x0096, B:32:0x00ae, B:35:0x00d1, B:36:0x00d4, B:38:0x00df, B:41:0x00f8, B:45:0x0115, B:47:0x0122, B:50:0x0137, B:16:0x0044, B:19:0x0054, B:22:0x0067), top: B:54:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:32:0x00ae A[Catch: all -> 0x002a, PHI: r1 r7
              0x00ae: PHI (r1v5 io.ktor.utils.io.e1) = (r1v6 io.ktor.utils.io.e1), (r1v6 io.ktor.utils.io.e1), (r1v15 io.ktor.utils.io.e1) binds: [B:28:0x0094, B:30:0x00ab, B:23:0x006a] A[DONT_GENERATE, DONT_INLINE]
              0x00ae: PHI (r7v3 kotlinx.io.x) = (r7v4 kotlinx.io.x), (r7v4 kotlinx.io.x), (r7v8 kotlinx.io.x) binds: [B:28:0x0094, B:30:0x00ab, B:23:0x006a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x002a, blocks: (B:9:0x0025, B:44:0x010e, B:25:0x007a, B:27:0x0088, B:29:0x0096, B:32:0x00ae, B:35:0x00d1, B:36:0x00d4, B:38:0x00df, B:41:0x00f8, B:45:0x0115, B:47:0x0122, B:50:0x0137, B:16:0x0044, B:19:0x0054, B:22:0x0067), top: B:54:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:38:0x00df A[Catch: all -> 0x002a, Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:9:0x0025, B:36:0x00d4, B:38:0x00df, B:41:0x00f8, B:16:0x0044), top: B:54:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:41:0x00f8 A[Catch: all -> 0x002a, Exception -> 0x010e, PHI: r1 r7 r8
              0x00f8: PHI (r1v1 ??) = (r1v23 ??), (r1v24 ??) binds: [B:39:0x00f5, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
              0x00f8: PHI (r7v1 kotlinx.io.x) = (r7v2 kotlinx.io.x), (r7v12 kotlinx.io.x) binds: [B:39:0x00f5, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
              0x00f8: PHI (r8v0 io.ktor.utils.io.e1) = (r8v1 io.ktor.utils.io.e1), (r8v8 io.ktor.utils.io.e1) binds: [B:39:0x00f5, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x010e, blocks: (B:9:0x0025, B:36:0x00d4, B:38:0x00df, B:41:0x00f8, B:16:0x0044), top: B:54:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:44:0x010e A[Catch: all -> 0x002a, PHI: r1 r7 r8
              0x010e: PHI (r1v7 ??) = (r1v0 ??), (r1v1 ??), (r1v4 ??), (r1v4 ??), (r1v22 ??) binds: [B:56:0x010e, B:42:0x010b, B:53:0x010e, B:37:0x00dd, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
              0x010e: PHI (r7v5 kotlinx.io.x) = (r7v1 kotlinx.io.x), (r7v2 kotlinx.io.x), (r7v2 kotlinx.io.x), (r7v14 kotlinx.io.x) binds: [B:42:0x010b, B:53:0x010e, B:37:0x00dd, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
              0x010e: PHI (r8v6 io.ktor.utils.io.e1) = (r8v0 io.ktor.utils.io.e1), (r8v1 io.ktor.utils.io.e1), (r8v1 io.ktor.utils.io.e1), (r8v10 io.ktor.utils.io.e1) binds: [B:42:0x010b, B:53:0x010e, B:37:0x00dd, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x002a, blocks: (B:9:0x0025, B:44:0x010e, B:25:0x007a, B:27:0x0088, B:29:0x0096, B:32:0x00ae, B:35:0x00d1, B:36:0x00d4, B:38:0x00df, B:41:0x00f8, B:45:0x0115, B:47:0x0122, B:50:0x0137, B:16:0x0044, B:19:0x0054, B:22:0x0067), top: B:54:0x000d }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Not initialized variable reg: 7, insn: 0x0138: INVOKE (r7 I:kotlinx.io.o) INTERFACE call: kotlinx.io.o.close():void A[MD:():void (m)], block:B:51:0x0138 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v22, types: [kotlinx.io.c0] */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r1v24 */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.io.c0] */
            /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.io.c0] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00dd -> B:44:0x010e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010b -> B:44:0x010e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.internal.b.a.C2064a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e1 e1Var, d<? super Unit> dVar) {
                return ((C2064a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(@NotNull b bVar, x<byte[]> savedResponse) {
            Intrinsics.checkNotNullParameter(savedResponse, "savedResponse");
            this.f294849c = bVar;
            this.f294847a = savedResponse;
            this.f294848b = g0.c(new Function0() { // from class: io.ktor.client.plugins.internal.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a.g(this.f294844a);
                }
            });
        }

        private final d1 d() {
            return (d1) this.f294848b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d1 g(a aVar) {
            return aVar.e();
        }

        @Nullable
        public final Object b(@NotNull d<? super byte[]> dVar) {
            if (!t.k(d())) {
                d().b().c(new c());
            }
            return this.f294847a.q(dVar);
        }

        @NotNull
        public final x<byte[]> c() {
            return this.f294847a;
        }

        @NotNull
        public final d1 e() {
            return t.G(f2.f314023a, l1.g(), false, new C2064a(this.f294849c, this, null), 2, null);
        }

        @NotNull
        public final h f() {
            return d().b();
        }

        public /* synthetic */ a(b bVar, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 1) != 0 ? z.c(null, 1, null) : xVar);
        }
    }
}

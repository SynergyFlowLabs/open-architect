package io.ktor.websocket;

import androidx.collection.g3;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRawWebSocketJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,103:1\n33#2,3:104\n33#2,3:107\n*S KotlinDebug\n*F\n+ 1 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n56#1:104,3\n60#1:107,3\n*E\n"})
public final class q implements o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f297412h = {j1.k(new v0(q.class, "maxFrameSize", "getMaxFrameSize()J", 0)), j1.k(new v0(q.class, "masking", "getMasking()Z", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f297413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<e> f297414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f297415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f297416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.properties.f f297417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q0 f297418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n0 f297419g;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {2, 3}, l = {70, 71, com.planner5d.library.engine.input.f.b.C0, com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f297421b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new a(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x007d  */
        /* JADX WARN: Code duplicated, block: B:42:0x0088 A[Catch: all -> 0x0048, CancellationException -> 0x004a, m -> 0x004d, h -> 0x0050, TRY_LEAVE, TryCatch #3 {h -> 0x0050, blocks: (B:21:0x0042, B:36:0x006f, B:40:0x0080, B:42:0x0088, B:32:0x0059, B:35:0x0060), top: B:65:0x000d, outer: #1 }] */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
        
            if (r7.G(r12, r11) == r0) goto L56;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x009f -> B:22:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 323
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n1#1,34:1\n57#2,2:35\n*E\n"})
    public static final class b extends kotlin.properties.c<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f297423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, q qVar) {
            super(obj);
            this.f297423b = qVar;
        }

        @Override // kotlin.properties.c
        protected void a(kotlin.reflect.o<?> property, Long l10, Long l11) {
            Intrinsics.checkNotNullParameter(property, "property");
            long jLongValue = l11.longValue();
            l10.longValue();
            this.f297423b.e().R0(jLongValue);
        }
    }

    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n1#1,34:1\n61#2,2:35\n*E\n"})
    public static final class c extends kotlin.properties.c<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f297424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, q qVar) {
            super(obj);
            this.f297424b = qVar;
        }

        @Override // kotlin.properties.c
        protected void a(kotlin.reflect.o<?> property, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(property, "property");
            boolean zBooleanValue = bool2.booleanValue();
            bool.getClass();
            this.f297424b.f().Y(zBooleanValue);
        }
    }

    static {
        int i10 = 5 >> 2;
    }

    public q(@NotNull io.ktor.utils.io.h input, @NotNull io.ktor.utils.io.p output, long j10, boolean z10, @NotNull CoroutineContext coroutineContext, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        kotlinx.coroutines.a0 a0VarA = s2.a((p2) coroutineContext.get(p2.M2));
        this.f297413a = a0VarA;
        this.f297414b = kotlinx.coroutines.channels.s.d(0, null, null, 6, null);
        this.f297415c = coroutineContext.plus(a0VarA).plus(new r0("raw-ws"));
        kotlin.properties.a aVar = kotlin.properties.a.f312873a;
        this.f297416d = new b(Long.valueOf(j10), this);
        this.f297417e = new c(Boolean.valueOf(z10), this);
        this.f297418f = new q0(output, getCoroutineContext(), z10, pool);
        this.f297419g = new n0(input, getCoroutineContext(), j10, pool);
        kotlinx.coroutines.k.f(this, null, null, new a(null), 3, null);
        a0VarA.complete();
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public List<e0<?>> O0() {
        return CollectionsKt.emptyList();
    }

    @Override // io.ktor.websocket.o0
    public void R0(long j10) {
        this.f297416d.setValue(this, f297412h[0], Long.valueOf(j10));
    }

    @Override // io.ktor.websocket.o0
    public long T() {
        return ((Number) this.f297416d.getValue(this, f297412h[0])).longValue();
    }

    @Override // io.ktor.websocket.o0
    public void Y(boolean z10) {
        this.f297417e.setValue(this, f297412h[1], Boolean.valueOf(z10));
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.n0<e> a() {
        return this.f297414b;
    }

    @Override // io.ktor.websocket.o0
    @NotNull
    public kotlinx.coroutines.channels.o0<e> b() {
        return this.f297418f.b();
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f297418f.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @NotNull
    public final n0 e() {
        return this.f297419g;
    }

    @NotNull
    public final q0 f() {
        return this.f297418f;
    }

    @Override // io.ktor.websocket.o0
    @Nullable
    public Object g1(@NotNull e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return o0.a.a(this, eVar, dVar);
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f297415c;
    }

    @Override // io.ktor.websocket.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Use cancel() instead.", replaceWith = @b1(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void o0() {
        kotlinx.coroutines.channels.o0.a.a(b(), null, 1, null);
        this.f297413a.complete();
    }

    @Override // io.ktor.websocket.o0
    public boolean o1() {
        return ((Boolean) this.f297417e.getValue(this, f297412h[1])).booleanValue();
    }

    public /* synthetic */ q(io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, long j10, boolean z10, CoroutineContext coroutineContext, io.ktor.utils.io.pool.h hVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, pVar, (i10 & 4) != 0 ? g3.f12256c : j10, (i10 & 8) != 0 ? false : z10, coroutineContext, (i10 & 32) != 0 ? io.ktor.util.cio.a.a() : hVar2);
    }
}

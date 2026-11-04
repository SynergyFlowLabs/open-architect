package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
final class y0 implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f314930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f314931c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<j<? super s0>, Integer, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ int f314934c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(j<? super s0> jVar, Integer num, kotlin.coroutines.d<? super Unit> dVar) {
            return k(jVar, num.intValue(), dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0084  */
        /* JADX WARN: Code duplicated, block: B:30:0x0091 A[PHI: r1
          0x0091: PHI (r1v5 kotlinx.coroutines.flow.j) = (r1v4 kotlinx.coroutines.flow.j), (r1v10 kotlinx.coroutines.flow.j) binds: [B:28:0x008e, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[PHI: r1
          0x00a3: PHI (r1v6 kotlinx.coroutines.flow.j) = (r1v4 kotlinx.coroutines.flow.j), (r1v5 kotlinx.coroutines.flow.j), (r1v12 kotlinx.coroutines.flow.j) binds: [B:26:0x0082, B:31:0x009f, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f314932a
                r9 = 0
                r2 = 5
                r9 = 0
                r3 = 4
                r9 = 6
                r4 = 3
                r5 = 2
                r6 = 1
                int r9 = r9 << r6
                if (r1 == 0) goto L46
                r9 = 4
                if (r1 == r6) goto L42
                if (r1 == r5) goto L39
                if (r1 == r4) goto L31
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1d
                goto L42
            L1d:
                r9 = 5
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r9 = 3
                r10.<init>(r11)
                throw r10
            L27:
                java.lang.Object r1 = r10.f314933b
                r9 = 5
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r11)
                r9 = 5
                goto La3
            L31:
                java.lang.Object r1 = r10.f314933b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r11)
                goto L91
            L39:
                java.lang.Object r1 = r10.f314933b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r9 = 2
                kotlin.ResultKt.m(r11)
                goto L76
            L42:
                kotlin.ResultKt.m(r11)
                goto Lb2
            L46:
                kotlin.ResultKt.m(r11)
                java.lang.Object r11 = r10.f314933b
                r1 = r11
                r1 = r11
                r9 = 7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r9 = 2
                int r11 = r10.f314934c
                if (r11 <= 0) goto L63
                r9 = 6
                kotlinx.coroutines.flow.s0 r11 = kotlinx.coroutines.flow.s0.START
                r10.f314932a = r6
                r9 = 6
                java.lang.Object r10 = r1.emit(r11, r10)
                r9 = 7
                if (r10 != r0) goto Lb2
                goto Lb1
            L63:
                kotlinx.coroutines.flow.y0 r11 = kotlinx.coroutines.flow.y0.this
                long r6 = kotlinx.coroutines.flow.y0.c(r11)
                r9 = 5
                r10.f314933b = r1
                r10.f314932a = r5
                java.lang.Object r11 = kotlinx.coroutines.d1.b(r6, r10)
                r9 = 3
                if (r11 != r0) goto L76
                goto Lb1
            L76:
                kotlinx.coroutines.flow.y0 r11 = kotlinx.coroutines.flow.y0.this
                r9 = 4
                long r5 = kotlinx.coroutines.flow.y0.b(r11)
                r9 = 7
                r7 = 0
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 <= 0) goto La3
                kotlinx.coroutines.flow.s0 r11 = kotlinx.coroutines.flow.s0.STOP
                r10.f314933b = r1
                r10.f314932a = r4
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L91
                goto Lb1
            L91:
                kotlinx.coroutines.flow.y0 r11 = kotlinx.coroutines.flow.y0.this
                long r4 = kotlinx.coroutines.flow.y0.b(r11)
                r10.f314933b = r1
                r10.f314932a = r3
                java.lang.Object r11 = kotlinx.coroutines.d1.b(r4, r10)
                if (r11 != r0) goto La3
                r9 = 2
                goto Lb1
            La3:
                kotlinx.coroutines.flow.s0 r11 = kotlinx.coroutines.flow.s0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r10.f314933b = r3
                r10.f314932a = r2
                java.lang.Object r10 = r1.emit(r11, r10)
                r9 = 3
                if (r10 != r0) goto Lb2
            Lb1:
                return r0
            Lb2:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                r9 = 1
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object k(j<? super s0> jVar, int i10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = y0.this.new a(dVar);
            aVar.f314933b = jVar;
            aVar.f314934c = i10;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314937b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f314937b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f314936a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(((s0) this.f314937b) != s0.START);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public y0(long j10, long j11) {
        this.f314930b = j10;
        this.f314931c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.u0
    @NotNull
    public i<s0> a(@NotNull z0<Integer> z0Var) {
        return k.i0(k.m0(k.f2(z0Var, new a(null)), new b(null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f314930b == y0Var.f314930b && this.f314931c == y0Var.f314931c) {
                return true;
            }
        }
        return false;
    }

    @zl.a
    public int hashCode() {
        return (Long.hashCode(this.f314930b) * 31) + Long.hashCode(this.f314931c);
    }

    @NotNull
    public String toString() {
        List listCreateListBuilder = CollectionsKt.createListBuilder(2);
        if (this.f314930b > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.f314930b + "ms");
        }
        if (this.f314931c < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.f314931c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }
}

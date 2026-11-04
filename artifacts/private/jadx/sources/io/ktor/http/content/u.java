package io.ktor.http.content;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", i = {0, 1}, l = {144, 145}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super c0>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f295757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f295757c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f295757c, dVar);
            aVar.f295756b = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0044  */
        /* JADX WARN: Code duplicated, block: B:19:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0050  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:8:0x0018). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 4
                int r1 = r6.f295755a
                r5 = 5
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L23
                r5 = 0
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f295756b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
            L18:
                r7 = r1
                r7 = r1
                goto L35
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                r5 = 5
                java.lang.Object r1 = r6.f295756b
                r5 = 2
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L48
            L2d:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f295756b
                r5 = 2
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
            L35:
                io.ktor.http.content.r r1 = r6.f295757c
                r5 = 4
                r6.f295756b = r7
                r6.f295755a = r3
                java.lang.Object r1 = r1.c(r6)
                r5 = 4
                if (r1 != r0) goto L44
                goto L5b
            L44:
                r4 = r1
                r4 = r1
                r1 = r7
                r7 = r4
            L48:
                r5 = 1
                io.ktor.http.content.c0 r7 = (io.ktor.http.content.c0) r7
                if (r7 != 0) goto L50
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L50:
                r6.f295756b = r1
                r6.f295755a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                r5 = 7
                if (r7 != r0) goto L18
            L5b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super c0> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 1, 1}, l = {168, 173}, m = "readAllParts", n = {"$this$readAllParts", "$this$readAllParts", "parts"}, s = {"L$0", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295761d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295760c = obj;
            this.f295761d |= Integer.MIN_VALUE;
            return u.c(null, this);
        }
    }

    static final class c implements kotlinx.coroutines.flow.j, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f295762a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f295762a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f295762a;
        }

        @Override // kotlinx.coroutines.flow.j
        public final /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return this.f295762a.invoke(obj, dVar);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<c0> a(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return kotlinx.coroutines.flow.k.K0(new a(rVar, null));
    }

    @Nullable
    public static final Object b(@NotNull r rVar, @NotNull Function2<? super c0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = a(rVar).collect(new c(function2), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:27:0x0084). Please report as a decompilation issue!!! */
    @kotlin.l(level = kotlin.n.ERROR, message = "This method can deadlock on large requests. Use `forEachPart` instead.")
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull io.ktor.http.content.r r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<? extends io.ktor.http.content.c0>> r8) {
        /*
            r6 = 1
            boolean r0 = r8 instanceof io.ktor.http.content.u.b
            if (r0 == 0) goto L17
            r0 = r8
            r0 = r8
            r6 = 1
            io.ktor.http.content.u$b r0 = (io.ktor.http.content.u.b) r0
            int r1 = r0.f295761d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r6 = 7
            r0.f295761d = r1
            goto L1d
        L17:
            io.ktor.http.content.u$b r0 = new io.ktor.http.content.u$b
            r6 = 1
            r0.<init>(r8)
        L1d:
            java.lang.Object r8 = r0.f295760c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 1
            int r2 = r0.f295761d
            r3 = 2
            r6 = r3
            r4 = 1
            r6 = r4
            if (r2 == 0) goto L50
            if (r2 == r4) goto L48
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.f295759b
            r6 = 2
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6 = 0
            java.lang.Object r2 = r0.f295758a
            io.ktor.http.content.r r2 = (io.ktor.http.content.r) r2
            r6 = 2
            kotlin.ResultKt.m(r8)
            goto L84
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            r6 = 6
            throw r7
        L48:
            java.lang.Object r7 = r0.f295758a
            io.ktor.http.content.r r7 = (io.ktor.http.content.r) r7
            kotlin.ResultKt.m(r8)
            goto L5f
        L50:
            kotlin.ResultKt.m(r8)
            r0.f295758a = r7
            r6 = 3
            r0.f295761d = r4
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L5f
            goto L83
        L5f:
            io.ktor.http.content.c0 r8 = (io.ktor.http.content.c0) r8
            if (r8 != 0) goto L68
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            return r7
        L68:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r8)
            r5 = r2
            r5 = r2
            r2 = r7
            r7 = r5
            r7 = r5
        L75:
            r6 = 7
            r0.f295758a = r2
            r0.f295759b = r7
            r0.f295761d = r3
            r6 = 3
            java.lang.Object r8 = r2.c(r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            r6 = 4
            io.ktor.http.content.c0 r8 = (io.ktor.http.content.c0) r8
            if (r8 != 0) goto L8a
            return r7
        L8a:
            r7.add(r8)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.u.c(io.ktor.http.content.r, kotlin.coroutines.d):java.lang.Object");
    }
}

package androidx.paging.compose;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.paging.x0;
import androidx.paging.x1;
import androidx.paging.z0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,230:1\n1097#2,6:231\n1097#2,6:237\n1097#2,6:243\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n*L\n206#1:231,6\n208#1:237,6\n218#1:243,6\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final x0.c f71659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final z0 f71660b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", i = {}, l = {210, 212}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f71662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.paging.compose.b<T> f71663c;

        /* JADX INFO: renamed from: androidx.paging.compose.c$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", f = "LazyPagingItems.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
        static final class C0642a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.paging.compose.b<T> f71665b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0642a(androidx.paging.compose.b<T> bVar, kotlin.coroutines.d<? super C0642a> dVar) {
                super(2, dVar);
                this.f71665b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0642a(this.f71665b, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.compose.c$a$a for r4v4 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    r3 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f71664a
                    r2 = 1
                    if (r1 == 0) goto L18
                    if (r1 != r2) goto L10
                    kotlin.ResultKt.m(r5)
                    goto L29
                L10:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L18:
                    kotlin.ResultKt.m(r5)
                    r3 = 7
                    androidx.paging.compose.b<T> r5 = r4.f71665b
                    r4.f71664a = r2
                    java.lang.Object r4 = r5.e(r4)
                    r3 = 4
                    if (r4 != r0) goto L29
                    r3 = 2
                    return r0
                L29:
                    r3 = 2
                    kotlin.Unit r4 = kotlin.Unit.f312394a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.c.a.C0642a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0642a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineContext coroutineContext, androidx.paging.compose.b<T> bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f71662b = coroutineContext;
            this.f71663c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f71662b, this.f71663c, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.compose.c$a for r6v5 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 3
                int r1 = r6.f71661a
                r5 = 0
                r2 = 2
                r3 = 1
                r5 = 4
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L12
                goto L1b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 3
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                r5 = 2
                kotlin.ResultKt.m(r7)
                goto L4e
            L20:
                r5 = 1
                kotlin.ResultKt.m(r7)
                kotlin.coroutines.CoroutineContext r7 = r6.f71662b
                r5 = 2
                kotlin.coroutines.h r1 = kotlin.coroutines.h.f312451a
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
                if (r7 == 0) goto L3b
                r5 = 5
                androidx.paging.compose.b<T> r7 = r6.f71663c
                r6.f71661a = r3
                java.lang.Object r6 = r7.e(r6)
                if (r6 != r0) goto L4e
                goto L4d
            L3b:
                kotlin.coroutines.CoroutineContext r7 = r6.f71662b
                androidx.paging.compose.c$a$a r1 = new androidx.paging.compose.c$a$a
                androidx.paging.compose.b<T> r3 = r6.f71663c
                r4 = 0
                r1.<init>(r3, r4)
                r6.f71661a = r2
                java.lang.Object r6 = kotlinx.coroutines.i.h(r7, r1, r6)
                if (r6 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", i = {}, l = {220, 222}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f71667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.paging.compose.b<T> f71668c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1", f = "LazyPagingItems.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71669a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.paging.compose.b<T> f71670b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.paging.compose.b<T> bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f71670b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f71670b, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.compose.c$b$a for r4v4 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    r3 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f71669a
                    r3 = 0
                    r2 = 1
                    r3 = 4
                    if (r1 == 0) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.m(r5)
                    goto L2b
                L12:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L1a:
                    r3 = 4
                    kotlin.ResultKt.m(r5)
                    r3 = 1
                    androidx.paging.compose.b<T> r5 = r4.f71670b
                    r4.f71669a = r2
                    java.lang.Object r4 = r5.d(r4)
                    r3 = 6
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    kotlin.Unit r4 = kotlin.Unit.f312394a
                    r3 = 0
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.c.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CoroutineContext coroutineContext, androidx.paging.compose.b<T> bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f71667b = coroutineContext;
            this.f71668c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f71667b, this.f71668c, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.compose.c$b for r6v5 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f71666a
                r2 = 2
                r5 = 6
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L11
                r5 = 1
                goto L1b
            L11:
                r5 = 2
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 1
                throw r6
            L1b:
                kotlin.ResultKt.m(r7)
                goto L4f
            L1f:
                kotlin.ResultKt.m(r7)
                kotlin.coroutines.CoroutineContext r7 = r6.f71667b
                kotlin.coroutines.h r1 = kotlin.coroutines.h.f312451a
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
                if (r7 == 0) goto L38
                androidx.paging.compose.b<T> r7 = r6.f71668c
                r6.f71666a = r3
                r5 = 7
                java.lang.Object r6 = r7.d(r6)
                if (r6 != r0) goto L4f
                goto L4d
            L38:
                r5 = 1
                kotlin.coroutines.CoroutineContext r7 = r6.f71667b
                r5 = 4
                androidx.paging.compose.c$b$a r1 = new androidx.paging.compose.c$b$a
                androidx.paging.compose.b<T> r3 = r6.f71668c
                r4 = 0
                r5 = r5 ^ r4
                r1.<init>(r3, r4)
                r6.f71666a = r2
                java.lang.Object r6 = kotlinx.coroutines.i.h(r7, r1, r6)
                if (r6 != r0) goto L4f
            L4d:
                r5 = 1
                return r0
            L4f:
                r5 = 0
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        x0.c cVar = new x0.c(false);
        f71659a = cVar;
        f71660b = new z0(x0.b.f72692b, cVar, cVar);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> androidx.paging.compose.b<T> b(@NotNull i<x1<T>> iVar, @Nullable CoroutineContext coroutineContext, @Nullable c0 c0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        c0Var.h0(388053246);
        if ((i11 & 1) != 0) {
            coroutineContext = h.f312451a;
        }
        if (m0.l0()) {
            m0.A0(388053246, i10, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        c0Var.h0(1046463091);
        boolean zD = c0Var.D(iVar);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new androidx.paging.compose.b(iVar);
            c0Var.Y(objI0);
        }
        androidx.paging.compose.b<T> bVar = (androidx.paging.compose.b) objI0;
        c0Var.w0();
        c0Var.h0(1046463169);
        boolean zK0 = c0Var.k0(coroutineContext) | c0Var.k0(bVar);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == c0.f35327a.a()) {
            objI1 = new a(coroutineContext, bVar, null);
            c0Var.Y(objI1);
        }
        c0Var.w0();
        b2.i(bVar, (Function2) objI1, c0Var, 0);
        c0Var.h0(1046463438);
        boolean zK1 = c0Var.k0(coroutineContext) | c0Var.k0(bVar);
        Object objI2 = c0Var.i0();
        if (zK1 || objI2 == c0.f35327a.a()) {
            objI2 = new b(coroutineContext, bVar, null);
            c0Var.Y(objI2);
        }
        c0Var.w0();
        b2.i(bVar, (Function2) objI2, c0Var, 0);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.w0();
        return bVar;
    }
}

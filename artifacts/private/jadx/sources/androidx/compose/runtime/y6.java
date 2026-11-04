package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,207:1\n1282#2,6:208\n1282#2,6:214\n1282#2,6:220\n1282#2,6:226\n1282#2,6:232\n1282#2,6:238\n1282#2,6:244\n1282#2,6:250\n1282#2,6:256\n1282#2,6:262\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n79#1:208,6\n80#1:214,6\n109#1:220,6\n110#1:226,6\n140#1:232,6\n141#1:238,6\n172#1:244,6\n173#1:250,6\n202#1:256,6\n204#1:262,6\n*E\n"})
final /* synthetic */ class y6 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<k4<T>, kotlin.coroutines.d<? super Unit>, Object> f36838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n3<T> f36839d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, n3<T> n3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f36838c = function2;
            this.f36839d = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f36838c, this.f36839d, dVar);
            aVar.f36837b = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.y6$a for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f36836a
                r2 = 1
                if (r1 == 0) goto L1e
                r5 = 2
                if (r1 != r2) goto L11
                r5 = 7
                kotlin.ResultKt.m(r7)
                goto L40
            L11:
                r5 = 3
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 6
                java.lang.String r7 = "etseutv n/e roairec//oiw/nt/ h e//bsmiukoer/cfol  l"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 6
                r6.<init>(r7)
                throw r6
            L1e:
                kotlin.ResultKt.m(r7)
                r5 = 3
                java.lang.Object r7 = r6.f36837b
                kotlinx.coroutines.s0 r7 = (kotlinx.coroutines.s0) r7
                kotlin.jvm.functions.Function2<androidx.compose.runtime.k4<T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f36838c
                androidx.compose.runtime.l4 r3 = new androidx.compose.runtime.l4
                r5 = 1
                androidx.compose.runtime.n3<T> r4 = r6.f36839d
                kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
                r5 = 7
                r3.<init>(r4, r7)
                r5 = 7
                r6.f36836a = r2
                java.lang.Object r6 = r1.invoke(r3, r6)
                r5 = 4
                if (r6 != r0) goto L40
                return r0
            L40:
                r5 = 1
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.y6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2$1", f = "ProduceState.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<k4<T>, kotlin.coroutines.d<? super Unit>, Object> f36842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n3<T> f36843d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, n3<T> n3Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f36842c = function2;
            this.f36843d = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f36842c, this.f36843d, dVar);
            bVar.f36841b = obj;
            return bVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.y6$b for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f36840a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.ResultKt.m(r7)
                r5 = 2
                goto L3b
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L19:
                r5 = 1
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f36841b
                r5 = 5
                kotlinx.coroutines.s0 r7 = (kotlinx.coroutines.s0) r7
                r5 = 4
                kotlin.jvm.functions.Function2<androidx.compose.runtime.k4<T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f36842c
                androidx.compose.runtime.l4 r3 = new androidx.compose.runtime.l4
                androidx.compose.runtime.n3<T> r4 = r6.f36843d
                kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
                r5 = 4
                r3.<init>(r4, r7)
                r6.f36840a = r2
                java.lang.Object r6 = r1.invoke(r3, r6)
                r5 = 4
                if (r6 != r0) goto L3b
                return r0
            L3b:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.y6.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<k4<T>, kotlin.coroutines.d<? super Unit>, Object> f36846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n3<T> f36847d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, n3<T> n3Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f36846c = function2;
            this.f36847d = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f36846c, this.f36847d, dVar);
            cVar.f36845b = obj;
            return cVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.y6$c for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 0
                int r1 = r6.f36844a
                r2 = 1
                if (r1 == 0) goto L1a
                if (r1 != r2) goto L11
                kotlin.ResultKt.m(r7)
                goto L3b
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 1
                throw r6
            L1a:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f36845b
                kotlinx.coroutines.s0 r7 = (kotlinx.coroutines.s0) r7
                kotlin.jvm.functions.Function2<androidx.compose.runtime.k4<T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f36846c
                androidx.compose.runtime.l4 r3 = new androidx.compose.runtime.l4
                r5 = 2
                androidx.compose.runtime.n3<T> r4 = r6.f36847d
                r5 = 0
                kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
                r3.<init>(r4, r7)
                r6.f36844a = r2
                java.lang.Object r6 = r1.invoke(r3, r6)
                r5 = 6
                if (r6 != r0) goto L3b
                r5 = 0
                return r0
            L3b:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.y6.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4$1", f = "ProduceState.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<k4<T>, kotlin.coroutines.d<? super Unit>, Object> f36850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n3<T> f36851d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, n3<T> n3Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f36850c = function2;
            this.f36851d = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f36850c, this.f36851d, dVar);
            dVar2.f36849b = obj;
            return dVar2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.y6$d for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 5
                int r1 = r6.f36848a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L10
                kotlin.ResultKt.m(r7)
                goto L3c
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 7
                r6.<init>(r7)
                throw r6
            L19:
                kotlin.ResultKt.m(r7)
                r5 = 5
                java.lang.Object r7 = r6.f36849b
                kotlinx.coroutines.s0 r7 = (kotlinx.coroutines.s0) r7
                kotlin.jvm.functions.Function2<androidx.compose.runtime.k4<T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f36850c
                r5 = 2
                androidx.compose.runtime.l4 r3 = new androidx.compose.runtime.l4
                r5 = 2
                androidx.compose.runtime.n3<T> r4 = r6.f36851d
                kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
                r5 = 3
                r3.<init>(r4, r7)
                r5 = 7
                r6.f36848a = r2
                java.lang.Object r6 = r1.invoke(r3, r6)
                r5 = 5
                if (r6 != r0) goto L3c
                return r0
            L3c:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.y6.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<k4<T>, kotlin.coroutines.d<? super Unit>, Object> f36854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n3<T> f36855d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, n3<T> n3Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f36854c = function2;
            this.f36855d = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f36854c, this.f36855d, dVar);
            eVar.f36853b = obj;
            return eVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.y6$e for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f36852a
                r2 = 1
                if (r1 == 0) goto L1d
                r5 = 5
                if (r1 != r2) goto L10
                kotlin.ResultKt.m(r7)
                goto L3c
            L10:
                r5 = 5
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "tos/ceorllbcn ai oo ith e/u/nfet erwkuve/m/is/r //e"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 3
                r6.<init>(r7)
                r5 = 1
                throw r6
            L1d:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f36853b
                kotlinx.coroutines.s0 r7 = (kotlinx.coroutines.s0) r7
                kotlin.jvm.functions.Function2<androidx.compose.runtime.k4<T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f36854c
                androidx.compose.runtime.l4 r3 = new androidx.compose.runtime.l4
                androidx.compose.runtime.n3<T> r4 = r6.f36855d
                kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
                r3.<init>(r4, r7)
                r6.f36852a = r2
                r5 = 0
                java.lang.Object r6 = r1.invoke(r3, r6)
                if (r6 != r0) goto L3c
                r5 = 4
                return r0
            L3c:
                r5 = 2
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.y6.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @o
    @NotNull
    public static final <T> n7<T> a(T t10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1807205155, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:170)");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(t10, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        boolean zK0 = c0Var.k0(function2);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new d(function2, n3Var, null);
            c0Var.Y(objI1);
        }
        b2.g(obj, obj2, obj3, (Function2) objI1, c0Var, (i10 >> 3) & androidx.media3.exoplayer.analytics.b.f62802b0);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    @o
    @NotNull
    public static final <T> n7<T> b(T t10, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(t10, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        boolean zK0 = c0Var.k0(function2);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new c(function2, n3Var, null);
            c0Var.Y(objI1);
        }
        b2.h(obj, obj2, (Function2) objI1, c0Var, (i10 >> 3) & okhttp3.internal.ws.g.f334652s);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    @o
    @NotNull
    public static final <T> n7<T> c(T t10, @Nullable Object obj, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:107)");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(t10, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        boolean zK0 = c0Var.k0(function2);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new b(function2, n3Var, null);
            c0Var.Y(objI1);
        }
        b2.i(obj, (Function2) objI1, c0Var, (i10 >> 3) & 14);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    @o
    @NotNull
    public static final <T> n7<T> d(T t10, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(t10, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        Unit unit = Unit.f312394a;
        boolean zK0 = c0Var.k0(function2);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new a(function2, n3Var, null);
            c0Var.Y(objI1);
        }
        b2.i(unit, (Function2) objI1, c0Var, 6);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    @o
    @NotNull
    public static final <T> n7<T> e(T t10, @NotNull Object[] objArr, @NotNull Function2<? super k4<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(t10, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zK0 = c0Var.k0(function2);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new e(function2, n3Var, null);
            c0Var.Y(objI1);
        }
        b2.k(objArrCopyOf, (Function2) objI1, c0Var, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }
}

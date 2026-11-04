package io.ktor.util.pipeline;

import androidx.constraintlayout.core.motion.utils.v;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", i = {}, l = {v.g.f44098r}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d<Unit, TContext> f296776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TContext f296777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<Unit, TContext> dVar, TContext tcontext, kotlin.coroutines.d<? super a> dVar2) {
            super(1, dVar2);
            this.f296776b = dVar;
            this.f296777c = tcontext;
            boolean z10 = true & true;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f296776b, this.f296777c, dVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296775a;
            if (i10 == 0) {
                ResultKt.m(obj);
                d<Unit, TContext> dVar = this.f296776b;
                TContext tcontext = this.f296777c;
                Unit unit = Unit.f312394a;
                this.f296775a = 1;
                if (dVar.e(tcontext, unit, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContext] */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", i = {}, l = {528}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<TContext> extends kotlin.coroutines.jvm.internal.o implements pj.n<e<? extends Object, TContext>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object> f296781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f296781d = nVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.util.pipeline.i$b<TContext> for r6v5 'this'  java.lang.Object
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
                int r1 = r6.f296778a
                r2 = 2
                r2 = 1
                if (r1 == 0) goto L1b
                r5 = 4
                if (r1 != r2) goto L11
                kotlin.ResultKt.m(r7)
                goto L46
            L11:
                r5 = 6
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 4
                throw r6
            L1b:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f296779b
                io.ktor.util.pipeline.e r7 = (io.ktor.util.pipeline.e) r7
                java.lang.Object r1 = r6.f296780c
                r3 = 3
                java.lang.String r4 = "TSubject"
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r4)
                r5 = 4
                if (r1 != 0) goto L30
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L30:
                r3 = 0
                if (r7 == 0) goto L35
                r5 = 4
                goto L36
            L35:
                r7 = r3
            L36:
                if (r7 == 0) goto L46
                pj.n<io.ktor.util.pipeline.e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r4 = r6.f296781d
                r6.f296779b = r3
                r6.f296778a = r2
                java.lang.Object r6 = r4.invoke(r7, r1, r6)
                r5 = 0
                if (r6 != r0) goto L46
                return r0
            L46:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e<? extends Object, TContext> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f296781d, dVar);
            bVar.f296779b = eVar;
            bVar.f296780c = obj;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <TContext> Object a(@NotNull d<Unit, TContext> dVar, @NotNull TContext tcontext, @NotNull kotlin.coroutines.d<? super Unit> dVar2) {
        Object objB = io.ktor.util.debug.a.b(new a(dVar, tcontext, null), dVar2);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    private static final <TContext> Object b(d<Unit, TContext> dVar, TContext tcontext, kotlin.coroutines.d<? super Unit> dVar2) {
        a aVar = new a(dVar, tcontext, null);
        h0.e(0);
        io.ktor.util.debug.a.b(aVar, dVar2);
        h0.e(1);
        return Unit.f312394a;
    }

    public static final /* synthetic */ <TSubject, TContext> void c(d<?, TContext> dVar, j phase, pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.needClassReification();
        dVar.q(phase, new b(block, null));
    }
}

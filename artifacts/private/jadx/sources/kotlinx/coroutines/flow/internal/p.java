package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,59:1\n105#2:60\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n46#1:60\n*E\n"})
public final class p {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,108:1\n47#2,2:109\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n f314611a;

        public a(pj.n nVar) {
            this.f314611a = nVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objA = p.a(new b(this.f314611a, jVar, null), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<s0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> f314614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f314615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super s0, ? super kotlinx.coroutines.flow.j<? super R>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f314614c = nVar;
            this.f314615d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f314614c, this.f314615d, dVar);
            bVar.f314613b = obj;
            return bVar;
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
            int i10 = this.f314612a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f314613b;
                pj.n<s0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314614c;
                Object obj2 = this.f314615d;
                this.f314612a = 1;
                if (nVar.invoke(s0Var, obj2, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <R> Object a(@kotlin.b @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        o oVar = new o(dVar.getContext(), dVar);
        Object objD = bk.b.d(oVar, oVar, function2);
        if (objD == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objD;
    }

    @NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> b(@kotlin.b @NotNull pj.n<? super s0, ? super kotlinx.coroutines.flow.j<? super R>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return new a(nVar);
    }
}

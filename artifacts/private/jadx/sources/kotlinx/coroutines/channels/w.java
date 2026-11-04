package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n1009#2,2:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,2\n*E\n"})
final /* synthetic */ class w {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0<Object> f313901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f313902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0<Object> o0Var, Object obj, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f313901b = o0Var;
            this.f313902c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f313901b, this.f313902c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313900a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<Object> o0Var = this.f313901b;
                Object obj2 = this.f313902c;
                this.f313900a = 1;
                if (o0Var.G(obj2, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super t<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f313904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0<E> f313905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ E f313906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o0<? super E> o0Var, E e10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f313905c = o0Var;
            this.f313906d = e10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f313905c, this.f313906d, dVar);
            bVar.f313904b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super t<? extends Unit>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super t<Unit>>) dVar);
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
            Object objM785constructorimpl;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313903a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    o0<E> o0Var = this.f313905c;
                    E e10 = this.f313906d;
                    Result.a aVar = Result.Companion;
                    this.f313903a = 1;
                    if (o0Var.G(e10, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            return t.b(Result.h(objM785constructorimpl) ? t.f313893b.c(Unit.f312394a) : t.f313893b.a(Result.d(objM785constructorimpl)));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super t<Unit>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @b1(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void a(o0 o0Var, Object obj) throws InterruptedException {
        if (t.m(o0Var.p(obj))) {
            return;
        }
        kotlinx.coroutines.j.b(null, new a(o0Var, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object b(@NotNull o0<? super E> o0Var, E e10) {
        Object objP = o0Var.p(e10);
        if (objP instanceof t.c) {
            return ((t) kotlinx.coroutines.j.b(null, new b(o0Var, e10, null), 1, null)).o();
        }
        return t.f313893b.c(Unit.f312394a);
    }
}

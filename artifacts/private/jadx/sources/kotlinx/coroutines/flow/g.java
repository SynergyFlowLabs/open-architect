package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class g<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<T> f314222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Function1<T, Object> f314223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Function2<Object, Object, Boolean> f314224c;

    static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g<T> f314225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h<Object> f314226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f314227c;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "emit", n = {}, s = {})
        static final class C2281a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314228a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f314229b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314230c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2281a(a<? super T> aVar, kotlin.coroutines.d<? super C2281a> dVar) {
                super(dVar);
                this.f314229b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314228a = obj;
                this.f314230c |= Integer.MIN_VALUE;
                return this.f314229b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(g<T> gVar, i1.h<Object> hVar, j<? super T> jVar) {
            this.f314225a = gVar;
            this.f314226b = hVar;
            this.f314227c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
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
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            C2281a c2281a;
            if (dVar instanceof C2281a) {
                c2281a = (C2281a) dVar;
                int i10 = c2281a.f314230c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2281a.f314230c = i10 - Integer.MIN_VALUE;
                } else {
                    c2281a = new C2281a(this, dVar);
                }
            } else {
                c2281a = new C2281a(this, dVar);
            }
            Object obj = c2281a.f314228a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2281a.f314230c;
            int i12 = 0 >> 1;
            if (i11 == 0) {
                ResultKt.m(obj);
                T t11 = (T) this.f314225a.f314223b.invoke(t10);
                Object obj2 = this.f314226b.f312751a;
                if (obj2 != kotlinx.coroutines.flow.internal.u.f314619a && this.f314225a.f314224c.invoke(obj2, t11).booleanValue()) {
                    return Unit.f312394a;
                }
                this.f314226b.f312751a = t11;
                j<T> jVar = this.f314227c;
                c2281a.f314230c = 1;
                if (jVar.emit(t10, c2281a) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.f314222a = iVar;
        this.f314223b = function1;
        this.f314224c = function2;
    }

    @Override // kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        i1.h hVar = new i1.h();
        hVar.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
        Object objCollect = this.f314222a.collect(new a(this, hVar, jVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }
}

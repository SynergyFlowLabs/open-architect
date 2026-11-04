package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n124#2,17:109\n124#2,17:126\n*S KotlinDebug\n*F\n+ 1 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n*L\n36#1:109,17\n73#1:126,17\n*E\n"})
final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n*L\n1#1,131:1\n74#2,3:132\n*E\n"})
    public static final class a<T> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f314028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.a f314029b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.a0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1", f = "Logic.kt", i = {0}, l = {132}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class C2274a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314031b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314032c;

            public C2274a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314031b = obj;
                this.f314032c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(Function2 function2, i1.a aVar) {
            this.f314028a = function2;
            this.f314029b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            C2274a c2274a;
            if (dVar instanceof C2274a) {
                c2274a = (C2274a) dVar;
                int i10 = c2274a.f314032c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2274a.f314032c = i10 - Integer.MIN_VALUE;
                } else {
                    c2274a = new C2274a(dVar);
                }
            } else {
                c2274a = new C2274a(dVar);
            }
            Object objInvoke = c2274a.f314031b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2274a.f314032c;
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                Function2 function2 = this.f314028a;
                c2274a.f314030a = this;
                c2274a.f314032c = 1;
                kotlin.jvm.internal.h0.e(6);
                objInvoke = function2.invoke(t10, c2274a);
                kotlin.jvm.internal.h0.e(7);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (a) c2274a.f314030a;
                ResultKt.m(objInvoke);
            }
            boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
            if (!zBooleanValue) {
                this.f314029b.f312744a = true;
            }
            if (zBooleanValue) {
                return Unit.f312394a;
            }
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = "all", n = {"foundCounterExample", "collector$iv"}, s = {"L$0", "L$1"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314037d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314036c = obj;
            this.f314037d |= Integer.MIN_VALUE;
            return k.a(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Logic.kt\nkotlinx/coroutines/flow/FlowKt__LogicKt\n*L\n1#1,131:1\n37#2,3:132\n*E\n"})
    public static final class c<T> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f314038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.a f314039b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1", f = "Logic.kt", i = {0}, l = {132}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314041b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314042c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314041b = obj;
                this.f314042c |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        public c(Function2 function2, i1.a aVar) {
            this.f314038a = function2;
            this.f314039b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314042c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314042c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f314041b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314042c;
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                Function2 function2 = this.f314038a;
                aVar.f314040a = this;
                aVar.f314042c = 1;
                kotlin.jvm.internal.h0.e(6);
                objInvoke = function2.invoke(t10, aVar);
                kotlin.jvm.internal.h0.e(7);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (c) aVar.f314040a;
                ResultKt.m(objInvoke);
            }
            boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
            if (zBooleanValue) {
                this.f314039b.f312744a = true;
            }
            if (zBooleanValue) {
                throw new kotlinx.coroutines.flow.internal.a(this);
            }
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = org.apache.commons.codec.language.bm.c.f335307b, n = {"found", "collector$iv"}, s = {"L$0", "L$1"})
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314047d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314046c = obj;
            this.f314047d |= Integer.MIN_VALUE;
            return k.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "none", n = {}, s = {})
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f314048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f314049b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314048a = obj;
            this.f314049b |= Integer.MIN_VALUE;
            return k.e1(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object a(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        i1.a aVar;
        kotlinx.coroutines.flow.internal.a e10;
        j<? super Object> jVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f314037d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f314037d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f314036c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f314037d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.a aVar2 = new i1.a();
            j<? super Object> aVar3 = new a<>(function2, aVar2);
            try {
                bVar.f314034a = aVar2;
                bVar.f314035b = aVar3;
                bVar.f314037d = 1;
                if (iVar.collect(aVar3, bVar) == objL) {
                    return objL;
                }
                aVar = aVar2;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                aVar = aVar2;
                e10 = e11;
                jVar = aVar3;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(bVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (a) bVar.f314035b;
            aVar = (i1.a) bVar.f314034a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(bVar.getContext());
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(!aVar.f312744a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final <T> Object b(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        i1.a aVar;
        kotlinx.coroutines.flow.internal.a e10;
        j<? super Object> jVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f314047d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f314047d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f314046c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f314047d;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.a aVar2 = new i1.a();
            j<? super Object> cVar = new c<>(function2, aVar2);
            try {
                dVar2.f314044a = aVar2;
                dVar2.f314045b = cVar;
                dVar2.f314047d = 1;
                if (iVar.collect(cVar, dVar2) == objL) {
                    return objL;
                }
                aVar = aVar2;
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                aVar = aVar2;
                e10 = e11;
                jVar = cVar;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(dVar2.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (c) dVar2.f314045b;
            aVar = (i1.a) dVar2.f314044a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.q.b(e10, jVar);
                s2.y(dVar2.getContext());
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(aVar.f312744a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object c(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f314049b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f314049b = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objB = eVar.f314048a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f314049b;
        if (i11 == 0) {
            ResultKt.m(objB);
            eVar.f314049b = 1;
            objB = k.b(iVar, function2, eVar);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objB);
        }
        return kotlin.coroutines.jvm.internal.b.a(!((Boolean) objB).booleanValue());
    }
}

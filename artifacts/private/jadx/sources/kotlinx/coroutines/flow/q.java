package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class q {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {13}, m = "count", n = {androidx.media3.exoplayer.upstream.h.f65997k}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314752c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314751b = obj;
            this.f314752c |= Integer.MIN_VALUE;
            return k.a0(null, this);
        }
    }

    static final class b<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.f f314753a;

        b(i1.f fVar) {
            this.f314753a = fVar;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            this.f314753a.f312749a++;
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {25}, m = "count", n = {androidx.media3.exoplayer.upstream.h.f65997k}, s = {"L$0"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314756c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314755b = obj;
            this.f314756c |= Integer.MIN_VALUE;
            return k.b0(null, null, this);
        }
    }

    static final class d<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super Boolean>, Object> f314757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.f f314758b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {26}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314760b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d<T> f314761c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f314762d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f314761c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314760b = obj;
                this.f314762d |= Integer.MIN_VALUE;
                return this.f314761c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, i1.f fVar) {
            this.f314757a = function2;
            this.f314758b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314762d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314762d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object objInvoke = aVar.f314760b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314762d;
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                Function2<T, kotlin.coroutines.d<? super Boolean>, Object> function2 = this.f314757a;
                aVar.f314759a = this;
                aVar.f314762d = 1;
                objInvoke = function2.invoke(t10, aVar);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (d) aVar.f314759a;
                ResultKt.m(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                this.f314758b.f312749a++;
            }
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public static final <T> Object a(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        a aVar;
        i1.f fVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f314752c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f314752c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f314751b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f314752c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.f fVar2 = new i1.f();
            j<? super Object> bVar = new b<>(fVar2);
            aVar.f314750a = fVar2;
            aVar.f314752c = 1;
            if (iVar.collect(bVar, aVar) == objL) {
                return objL;
            }
            fVar = fVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (i1.f) aVar.f314750a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(fVar.f312749a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final <T> Object b(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        c cVar;
        i1.f fVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f314756c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f314756c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f314755b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f314756c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.f fVar2 = new i1.f();
            j<? super Object> dVar2 = new d<>(function2, fVar2);
            cVar.f314754a = fVar2;
            cVar.f314756c = 1;
            if (iVar.collect(dVar2, cVar) == objL) {
                return objL;
            }
            fVar = fVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (i1.f) cVar.f314754a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(fVar.f312749a);
    }
}

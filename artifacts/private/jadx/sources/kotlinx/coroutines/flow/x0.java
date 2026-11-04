package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class x0 implements u0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<j<? super s0>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<Integer> f314892c;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x0$a$a, reason: collision with other inner class name */
        static final class C2307a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.a f314893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j<s0> f314894b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.x0$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {androidx.media2.widget.f.i.f59793p0}, m = "emit", n = {}, s = {})
            static final class C2308a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314895a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2307a<T> f314896b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f314897c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2308a(C2307a<? super T> c2307a, kotlin.coroutines.d<? super C2308a> dVar) {
                    super(dVar);
                    this.f314896b = c2307a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314895a = obj;
                    this.f314897c |= Integer.MIN_VALUE;
                    return this.f314896b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2307a(i1.a aVar, j<? super s0> jVar) {
                this.f314893a = aVar;
                this.f314894b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            public final Object a(int i10, kotlin.coroutines.d<? super Unit> dVar) {
                C2308a c2308a;
                if (dVar instanceof C2308a) {
                    c2308a = (C2308a) dVar;
                    int i11 = c2308a.f314897c;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2308a.f314897c = i11 - Integer.MIN_VALUE;
                    } else {
                        c2308a = new C2308a(this, dVar);
                    }
                } else {
                    c2308a = new C2308a(this, dVar);
                }
                Object obj = c2308a.f314895a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i12 = c2308a.f314897c;
                if (i12 == 0) {
                    ResultKt.m(obj);
                    if (i10 > 0) {
                        i1.a aVar = this.f314893a;
                        if (!aVar.f312744a) {
                            aVar.f312744a = true;
                            j<s0> jVar = this.f314894b;
                            s0 s0Var = s0.START;
                            c2308a.f314897c = 1;
                            if (jVar.emit(s0Var, c2308a) == objL) {
                                return objL;
                            }
                        }
                    }
                    return Unit.f312394a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0<Integer> z0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314892c = z0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f314892c, dVar);
            aVar.f314891b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314890a;
            if (i10 == 0) {
                ResultKt.m(obj);
                j jVar = (j) this.f314891b;
                i1.a aVar = new i1.a();
                z0<Integer> z0Var = this.f314892c;
                C2307a c2307a = new C2307a(aVar, jVar);
                this.f314890a = 1;
                if (z0Var.collect(c2307a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j<? super s0> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Override // kotlinx.coroutines.flow.u0
    @NotNull
    public i<s0> a(@NotNull z0<Integer> z0Var) {
        return k.K0(new a(z0Var, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}

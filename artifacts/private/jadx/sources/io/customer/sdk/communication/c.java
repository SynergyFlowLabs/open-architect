package io.customer.sdk.communication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.e;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEventBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventBus.kt\nio/customer/sdk/communication/EventBusImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1869#2,2:81\n*S KotlinDebug\n*F\n+ 1 EventBus.kt\nio/customer/sdk/communication/EventBusImpl\n*L\n63#1:81,2\n*E\n"})
public final class c implements io.customer.sdk.communication.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j0<io.customer.sdk.communication.a> f288498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<p2> f288499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s0 f288500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p<io.customer.sdk.communication.a> f288501d;

    @f(c = "io.customer.sdk.communication.EventBusImpl$1", f = "EventBus.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288502a;

        /* JADX INFO: renamed from: io.customer.sdk.communication.c$a$a, reason: collision with other inner class name */
        static final class C1961a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f288504a;

            C1961a(c cVar) {
                this.f288504a = cVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(io.customer.sdk.communication.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
                this.f288504a.f288498a.f(aVar);
                return Unit.f312394a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288502a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarZ = k.Z(c.this.f288501d);
                C1961a c1961a = new C1961a(c.this);
                this.f288502a = 1;
                if (iVarZ.collect(c1961a, this) == objL) {
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

    @f(c = "io.customer.sdk.communication.EventBusImpl$subscribe$job$1", f = "EventBus.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEventBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventBus.kt\nio/customer/sdk/communication/EventBusImpl$subscribe$job$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,80:1\n56#2:81\n59#2:85\n46#3:82\n51#3:84\n105#4:83\n*S KotlinDebug\n*F\n+ 1 EventBus.kt\nio/customer/sdk/communication/EventBusImpl$subscribe$job$1\n*L\n70#1:81\n70#1:85\n70#1:82\n70#1:84\n70#1:83\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288505a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d<T> f288507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super Unit>, Object> f288508d;

        static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<T, kotlin.coroutines.d<? super Unit>, Object> f288509a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
                this.f288509a = function2;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/coroutines/d<-Lkotlin/Unit;>;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(io.customer.sdk.communication.a aVar, kotlin.coroutines.d dVar) {
                Object objInvoke = this.f288509a.invoke(aVar, dVar);
                return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: io.customer.sdk.communication.c$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
        public static final class C1962b<T> implements i<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f288510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.d f288511b;

            /* JADX INFO: renamed from: io.customer.sdk.communication.c$b$b$a */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 EventBus.kt\nio/customer/sdk/communication/EventBusImpl$subscribe$job$1\n*L\n1#1,49:1\n57#2:50\n58#2:52\n70#3:51\n*E\n"})
            public static final class a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f288512a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.reflect.d f288513b;

                /* JADX INFO: renamed from: io.customer.sdk.communication.c$b$b$a$a, reason: collision with other inner class name */
                @f(c = "io.customer.sdk.communication.EventBusImpl$subscribe$job$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "EventBus.kt", i = {}, l = {52}, m = "emit", n = {}, s = {})
                public static final class C1963a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f288514a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f288515b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f288516c;

                    public C1963a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f288514a = obj;
                        this.f288515b |= Integer.MIN_VALUE;
                        int i10 = 7 ^ 0;
                        return a.this.emit(null, this);
                    }
                }

                public a(j jVar, kotlin.reflect.d dVar) {
                    this.f288512a = jVar;
                    this.f288513b = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C1963a c1963a;
                    if (dVar instanceof C1963a) {
                        c1963a = (C1963a) dVar;
                        int i10 = c1963a.f288515b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c1963a.f288515b = i10 - Integer.MIN_VALUE;
                        } else {
                            c1963a = new C1963a(dVar);
                        }
                    } else {
                        c1963a = new C1963a(dVar);
                    }
                    Object obj2 = c1963a.f288514a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c1963a.f288515b;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        j jVar = this.f288512a;
                        Object objB = e.b(this.f288513b, (io.customer.sdk.communication.a) obj);
                        if (objB != null) {
                            c1963a.f288515b = 1;
                            if (jVar.emit(objB, c1963a) == objL) {
                                return objL;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            public C1962b(i iVar, kotlin.reflect.d dVar) {
                this.f288510a = iVar;
                this.f288511b = dVar;
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j jVar, kotlin.coroutines.d dVar) {
                Object objCollect = this.f288510a.collect(new a(jVar, this.f288511b), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.reflect.d<T> dVar, Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar2) {
            super(2, dVar2);
            this.f288507c = dVar;
            this.f288508d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(this.f288507c, this.f288508d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288505a;
            if (i10 == 0) {
                ResultKt.m(obj);
                C1962b c1962b = new C1962b(c.this.a(), this.f288507c);
                a aVar = new a(this.f288508d);
                this.f288505a = 1;
                if (c1962b.collect(aVar, this) == objL) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.customer.sdk.communication.b
    @NotNull
    public o0<io.customer.sdk.communication.a> a() {
        return this.f288498a;
    }

    @Override // io.customer.sdk.communication.b
    public void b() {
        synchronized (this.f288499b) {
            try {
                Iterator<T> it = this.f288499b.iterator();
                while (it.hasNext()) {
                    p2.a.b((p2) it.next(), null, 1, null);
                }
                this.f288499b.clear();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.customer.sdk.communication.b
    @NotNull
    public <T extends io.customer.sdk.communication.a> p2 c(@NotNull kotlin.reflect.d<T> type, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        p2 p2VarF = kotlinx.coroutines.k.f(this.f288500c, null, null, new b(type, action, null), 3, null);
        synchronized (this.f288499b) {
            try {
                this.f288499b.add(p2VarF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p2VarF;
    }

    @Override // io.customer.sdk.communication.b
    public void d(@NotNull io.customer.sdk.communication.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f288501d.p(event);
    }

    @NotNull
    public final List<p2> g() {
        return this.f288499b;
    }

    @NotNull
    public final s0 h() {
        return this.f288500c;
    }

    public final /* synthetic */ <T extends io.customer.sdk.communication.a> p2 i(io.customer.sdk.communication.b bVar, Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return bVar.c(j1.d(io.customer.sdk.communication.a.class), action);
    }

    public c(@NotNull j0<io.customer.sdk.communication.a> sharedFlow) {
        Intrinsics.checkNotNullParameter(sharedFlow, "sharedFlow");
        this.f288498a = sharedFlow;
        this.f288499b = new ArrayList();
        s0 s0VarA = eh.d.f274883c.y().a();
        this.f288500c = s0VarA;
        this.f288501d = s.d(Integer.MAX_VALUE, null, null, 6, null);
        int i10 = 1 << 3;
        kotlinx.coroutines.k.f(s0VarA, null, null, new a(null), 3, null);
    }

    public /* synthetic */ c(j0 j0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q0.b(100, 0, null, 6, null) : j0Var);
    }
}

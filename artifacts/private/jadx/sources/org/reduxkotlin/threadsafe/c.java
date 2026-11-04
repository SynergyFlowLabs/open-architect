package org.reduxkotlin.threadsafe;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.reduxkotlin.j;

/* JADX INFO: loaded from: classes14.dex */
public final class c<State> implements j<State, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j<State, Object> f339533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Function1<Object, ? extends Object> f339534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<State> f339535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Function2<? super State, Object, ? extends State>, Unit> f339536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Function0<Unit>, Function0<Unit>> f339537e;

    @SourceDebugExtension({"SMAP\nThreadSafeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeStore.kt\norg/reduxkotlin/threadsafe/ThreadSafeStore$dispatch$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
    static final class a extends l0 implements Function1<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<State> f339538a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<State> cVar) {
            super(1);
            this.f339538a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Object invoke(@NotNull Object action) {
            Object objInvoke;
            Intrinsics.checkNotNullParameter(action, "action");
            c<State> cVar = this.f339538a;
            synchronized (cVar) {
                try {
                    objInvoke = cVar.a().c().invoke(action);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return objInvoke;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadSafeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeStore.kt\norg/reduxkotlin/threadsafe/ThreadSafeStore$getState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
    static final class b extends l0 implements Function0<State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<State> f339539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<State> cVar) {
            super(0);
            this.f339539a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final State invoke() {
            State stateInvoke;
            c<State> cVar = this.f339539a;
            synchronized (cVar) {
                try {
                    stateInvoke = cVar.a().d().invoke();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return stateInvoke;
        }
    }

    /* JADX INFO: renamed from: org.reduxkotlin.threadsafe.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nThreadSafeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeStore.kt\norg/reduxkotlin/threadsafe/ThreadSafeStore$replaceReducer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
    static final class C2442c extends l0 implements Function1<Function2<? super State, ? super Object, ? extends State>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<State> f339540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2442c(c<State> cVar) {
            super(1);
            this.f339540a = cVar;
        }

        public final void c(@NotNull Function2<? super State, Object, ? extends State> reducer) {
            Intrinsics.checkNotNullParameter(reducer, "reducer");
            c<State> cVar = this.f339540a;
            synchronized (cVar) {
                try {
                    cVar.a().f().invoke(reducer);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c((Function2) obj);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadSafeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeStore.kt\norg/reduxkotlin/threadsafe/ThreadSafeStore$subscribe$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
    static final class d extends l0 implements Function1<Function0<? extends Unit>, Function0<? extends Unit>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<State> f339541a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c<State> cVar) {
            super(1);
            this.f339541a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Function0<Unit> invoke(@NotNull Function0<Unit> storeSubscriber) {
            Function0<Unit> function0Invoke;
            Intrinsics.checkNotNullParameter(storeSubscriber, "storeSubscriber");
            c<State> cVar = this.f339541a;
            synchronized (cVar) {
                try {
                    function0Invoke = cVar.a().b().invoke(storeSubscriber);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return function0Invoke;
        }
    }

    public c(@NotNull j<State, Object> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f339533a = store;
        this.f339534b = new a(this);
        this.f339535c = new b(this);
        this.f339536d = new C2442c(this);
        this.f339537e = new d(this);
    }

    @Override // org.reduxkotlin.j
    @NotNull
    public j<State, Object> a() {
        return this.f339533a;
    }

    @Override // org.reduxkotlin.j
    @NotNull
    public Function1<Function0<Unit>, Function0<Unit>> b() {
        return this.f339537e;
    }

    @Override // org.reduxkotlin.j
    @NotNull
    public Function1<Object, Object> c() {
        return this.f339534b;
    }

    @Override // org.reduxkotlin.j
    @NotNull
    public Function0<State> d() {
        return this.f339535c;
    }

    @Override // org.reduxkotlin.j
    public void e(@NotNull Function1<? super Object, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f339534b = function1;
    }

    @Override // org.reduxkotlin.j
    @NotNull
    public Function1<Function2<? super State, Object, ? extends State>, Unit> f() {
        return this.f339536d;
    }

    @Override // org.reduxkotlin.j
    public State getState() {
        return (State) j.a.a(this);
    }
}

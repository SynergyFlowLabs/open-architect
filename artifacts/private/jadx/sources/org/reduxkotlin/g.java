package org.reduxkotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes14.dex */
@SourceDebugExtension({"SMAP\nCreateStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateStore.kt\norg/reduxkotlin/CreateStoreKt\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n146#2,6:263\n56#2,9:269\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 CreateStore.kt\norg/reduxkotlin/CreateStoreKt\n*L\n258#1:263,6\n261#1:269,9\n202#1:278,2\n*E\n"})
public final class g {

    /* JADX INFO: Add missing generic type declarations: [State] */
    static final class a<State> extends l0 implements n<Function2<? super State, ? super Object, ? extends State>, State, Object, j<State, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f339474a = new a();

        a() {
            super(3);
        }

        @Override // pj.n
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j<State, Object> invoke(@NotNull Function2<? super State, Object, ? extends State> r10, State state, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(r10, "r");
            return g.g(r10, state, null, 4, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    public static final class b<State> implements j<State, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f339475a = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.i<State> f339476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function1<Object, ? extends Object> f339477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.i<Function0<Unit>> f339478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.i<Unit> f339479e;

        /* synthetic */ class a extends g0 implements Function1<Object, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.a f339480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.h<State> f339481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<Function2<State, Object, State>> f339482c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Function0<Unit>>> f339483d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Function0<Unit>>> f339484e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1.a aVar, i1.h<State> hVar, i1.h<Function2<State, Object, State>> hVar2, i1.h<List<Function0<Unit>>> hVar3, i1.h<List<Function0<Unit>>> hVar4) {
                super(1, Intrinsics.a.class, "dispatch", "createStore$dispatch(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/Object;)Ljava/lang/Object;", 0);
                this.f339480a = aVar;
                this.f339481b = hVar;
                this.f339482c = hVar2;
                this.f339483d = hVar3;
                this.f339484e = hVar4;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Object invoke(@NotNull Object p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return g.h(this.f339480a, this.f339481b, this.f339482c, this.f339483d, this.f339484e, p10);
            }
        }

        /* JADX INFO: renamed from: org.reduxkotlin.g$b$b, reason: collision with other inner class name */
        /* synthetic */ class C2433b extends g0 implements Function0<State> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.a f339485a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.h<State> f339486b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2433b(i1.a aVar, i1.h<State> hVar) {
                super(0, Intrinsics.a.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
                this.f339485a = aVar;
                this.f339486b = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final State invoke() {
                return (State) g.j(this.f339485a, this.f339486b);
            }
        }

        /* synthetic */ class c extends g0 implements Function1<Function2<? super State, ? super Object, ? extends State>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.h<Function2<State, Object, State>> f339487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.a f339488b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<State> f339489c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Function0<Unit>>> f339490d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Function0<Unit>>> f339491e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(i1.h<Function2<State, Object, State>> hVar, i1.a aVar, i1.h<State> hVar2, i1.h<List<Function0<Unit>>> hVar3, i1.h<List<Function0<Unit>>> hVar4) {
                super(1, Intrinsics.a.class, "replaceReducer", "createStore$replaceReducer(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function2;)V", 0);
                this.f339487a = hVar;
                this.f339488b = aVar;
                this.f339489c = hVar2;
                this.f339490d = hVar3;
                this.f339491e = hVar4;
            }

            public final void X(@NotNull Function2<? super State, Object, ? extends State> p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                g.k(this.f339487a, this.f339488b, this.f339489c, this.f339490d, this.f339491e, p10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                X((Function2) obj);
                return Unit.f312394a;
            }
        }

        /* synthetic */ class d extends g0 implements Function1<Function0<? extends Unit>, Function0<? extends Unit>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.a f339492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Function0<Unit>>> f339493b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<List<Function0<Unit>>> f339494c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(i1.a aVar, i1.h<List<Function0<Unit>>> hVar, i1.h<List<Function0<Unit>>> hVar2) {
                super(1, Intrinsics.a.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
                this.f339492a = aVar;
                this.f339493b = hVar;
                this.f339494c = hVar2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Function0<Unit> invoke(@NotNull Function0<Unit> p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return g.l(this.f339492a, this.f339493b, this.f339494c, p10);
            }
        }

        b(i1.a aVar, i1.h<State> hVar, i1.h<Function2<State, Object, State>> hVar2, i1.h<List<Function0<Unit>>> hVar3, i1.h<List<Function0<Unit>>> hVar4) {
            this.f339476b = new C2433b(aVar, hVar);
            this.f339477c = new a(aVar, hVar, hVar2, hVar3, hVar4);
            this.f339478d = new d(aVar, hVar3, hVar4);
            this.f339479e = new c(hVar2, aVar, hVar, hVar3, hVar4);
        }

        @Override // org.reduxkotlin.j
        public /* bridge */ /* synthetic */ Function1 b() {
            return (Function1) j();
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Object, Object> c() {
            return this.f339477c;
        }

        @Override // org.reduxkotlin.j
        public /* bridge */ /* synthetic */ Function0 d() {
            return (Function0) g();
        }

        @Override // org.reduxkotlin.j
        public void e(@NotNull Function1<? super Object, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f339477c = function1;
        }

        @Override // org.reduxkotlin.j
        public /* bridge */ /* synthetic */ Function1 f() {
            return (Function1) h();
        }

        @NotNull
        public kotlin.reflect.i<State> g() {
            return this.f339476b;
        }

        @Override // org.reduxkotlin.j
        public State getState() {
            return (State) j.a.a(this);
        }

        @NotNull
        public kotlin.reflect.i<Unit> h() {
            return this.f339479e;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b a() {
            return this.f339475a;
        }

        @NotNull
        public kotlin.reflect.i<Function0<Unit>> j() {
            return this.f339478d;
        }
    }

    static final class c extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f339495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.a f339496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h<List<Function0<Unit>>> f339497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f339498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1.h<List<Function0<Unit>>> f339499e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i1.a aVar, i1.a aVar2, i1.h<List<Function0<Unit>>> hVar, Function0<Unit> function0, i1.h<List<Function0<Unit>>> hVar2) {
            super(0);
            this.f339495a = aVar;
            this.f339496b = aVar2;
            this.f339497c = hVar;
            this.f339498d = function0;
            this.f339499e = hVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            i1.a aVar = this.f339495a;
            boolean z10 = aVar.f312744a;
            if (this.f339496b.f312744a) {
                throw new IllegalStateException("You may not unsubscribe from a store listener while the reducer\nis executing. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.");
            }
            aVar.f312744a = false;
            g.i(this.f339497c, this.f339499e);
            this.f339497c.f312751a.remove(this.f339497c.f312751a.indexOf(this.f339498d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Action, State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1\n*L\n1#1,163:1\n*E\n"})
    public static final class d<Action, State> implements j<State, Action> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j<State, Object> f339500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<State> f339501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function1<? super Action, ? extends Object> f339502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Function0<Unit>, Function0<Unit>> f339503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f339504e;

        @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,163:1\n146#2,6:164\n*S KotlinDebug\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n*L\n62#1:164,6\n*E\n"})
        public static final class a extends l0 implements Function1<Function2<? super State, ? super Action, ? extends State>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f339505a;

            /* JADX INFO: renamed from: org.reduxkotlin.g$d$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
            public static final class C2434a extends l0 implements Function2<State, Object, State> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2 f339506a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2434a(Function2 function2) {
                    super(2);
                    this.f339506a = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final State invoke(State state, @NotNull Object action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.reifiedOperationMarker(3, "Action");
                    return action != null ? (State) this.f339506a.invoke(state, action) : state;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar) {
                super(1);
                this.f339505a = jVar;
            }

            public final void c(@NotNull Function2<? super State, ? super Action, ? extends State> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<Function2<? super State, ? super Action, ? extends State>, Unit> function1F = this.f339505a.f();
                Intrinsics.needClassReification();
                function1F.invoke(new C2434a(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                c((Function2) obj);
                return Unit.f312394a;
            }
        }

        public d(j jVar) {
            this.f339500a = jVar;
            this.f339501b = jVar.d();
            this.f339502c = jVar.c();
            this.f339503d = jVar.b();
            Intrinsics.needClassReification();
            this.f339504e = new a(jVar);
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public j<State, Object> a() {
            return this.f339500a;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function0<Unit>, Function0<Unit>> b() {
            return this.f339503d;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Action, Object> c() {
            return this.f339502c;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function0<State> d() {
            return this.f339501b;
        }

        @Override // org.reduxkotlin.j
        public void e(@NotNull Function1<? super Action, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f339502c = function1;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f() {
            return this.f339504e;
        }

        @Override // org.reduxkotlin.j
        public State getState() {
            return (State) j.a.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
    public static final class e<State> extends l0 implements Function2<State, Object, State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f339507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function2 function2) {
            super(2);
            this.f339507a = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final State invoke(State state, @NotNull Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.reifiedOperationMarker(3, "Action");
            return action != null ? (State) this.f339507a.invoke(state, action) : state;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.ArrayList] */
    @NotNull
    public static final <State> j<State, Object> f(@NotNull Function2<? super State, Object, ? extends State> reducer, State state, @Nullable Function1<? super n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, ? extends n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>> function1) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        if (function1 != null) {
            return function1.invoke(a.f339474a).invoke(reducer, state, null);
        }
        i1.h hVar = new i1.h();
        hVar.f312751a = reducer;
        i1.h hVar2 = new i1.h();
        hVar2.f312751a = state;
        i1.h hVar3 = new i1.h();
        hVar3.f312751a = new ArrayList();
        i1.h hVar4 = new i1.h();
        hVar4.f312751a = hVar3.f312751a;
        i1.a aVar = new i1.a();
        h(aVar, hVar2, hVar, hVar4, hVar3, org.reduxkotlin.a.C2428a.f339439a);
        return new b(aVar, hVar2, hVar, hVar4, hVar3);
    }

    public static /* synthetic */ j g(Function2 function2, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return f(function2, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v2, types: [T] */
    public static final <State> Object h(i1.a aVar, i1.h<State> hVar, i1.h<Function2<State, Object, State>> hVar2, i1.h<List<Function0<Unit>>> hVar3, i1.h<List<Function0<Unit>>> hVar4, Object obj) {
        if (!zm.a.a(obj)) {
            throw new IllegalArgumentException("Actions must be plain objects. Use custom middleware for async \nactions.");
        }
        try {
            aVar.f312744a = true;
            hVar.f312751a = hVar2.f312751a.invoke(hVar.f312751a, obj);
            aVar.f312744a = false;
            ?? r10 = hVar3.f312751a;
            hVar4.f312751a = r10;
            Iterator it = ((List) r10).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            return obj;
        } catch (Throwable th2) {
            aVar.f312744a = false;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.List] */
    public static final void i(i1.h<List<Function0<Unit>>> hVar, i1.h<List<Function0<Unit>>> hVar2) {
        List<Function0<Unit>> list = hVar.f312751a;
        List<Function0<Unit>> list2 = hVar2.f312751a;
        if (list == list2) {
            hVar.f312751a = CollectionsKt.toMutableList((Collection) list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <State> State j(i1.a aVar, i1.h<State> hVar) {
        if (aVar.f312744a) {
            throw new IllegalStateException("You may not call store.getState() while the reducer is executing.\nThe reducer has already received the state as an argument.\nPass it down from the top reducer instead of reading it from the \nstore.\nYou may be accessing getState while dispatching from another thread.\nTry createThreadSafeStore().\nhttps://reduxkotlin.org/introduction/threading");
        }
        return hVar.f312751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <State> void k(i1.h<Function2<State, Object, State>> hVar, i1.a aVar, i1.h<State> hVar2, i1.h<List<Function0<Unit>>> hVar3, i1.h<List<Function0<Unit>>> hVar4, Function2<? super State, Object, ? extends State> function2) {
        hVar.f312751a = function2;
        h(aVar, hVar2, hVar, hVar3, hVar4, org.reduxkotlin.a.b.f339440a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> l(i1.a aVar, i1.h<List<Function0<Unit>>> hVar, i1.h<List<Function0<Unit>>> hVar2, Function0<Unit> function0) {
        if (aVar.f312744a) {
            throw new IllegalStateException("You may not call store.subscribe() while the reducer is executing.\nIf you would like to be notified after the store has been updated, \nsubscribe from a component and invoke store.getState() in the \ncallback to access the latest state. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.\nYou may be seeing this due accessing the store from multiplethreads.\nTry createThreadSafeStore()\nhttps://reduxkotlin.org/introduction/threading");
        }
        i1.a aVar2 = new i1.a();
        aVar2.f312744a = true;
        i(hVar, hVar2);
        hVar.f312751a.add(function0);
        return new c(aVar2, aVar, hVar, function0, hVar2);
    }

    public static final /* synthetic */ <State, Action> j<State, Action> m(Function2<? super State, ? super Action, ? extends State> reducer, State state, Function1<? super n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, ? extends n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>> function1) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        j jVarF = f(new e(reducer), state, function1);
        Intrinsics.needClassReification();
        return new d(jVarF);
    }

    public static /* synthetic */ j n(Function2 reducer, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        j jVarF = f(new e(reducer), obj, function1);
        Intrinsics.needClassReification();
        return new d(jVarF);
    }
}

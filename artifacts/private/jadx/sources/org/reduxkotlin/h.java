package org.reduxkotlin;

import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes14.dex */
@SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,163:1\n146#1,6:164\n*S KotlinDebug\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n162#1:164,6\n*E\n"})
public final class h {

    /* JADX INFO: Add missing generic type declarations: [Action, State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1\n*L\n1#1,163:1\n*E\n"})
    public static final class a<Action, State> implements j<State, Action> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j<State, Object> f339508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<State> f339509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function1<? super Action, ? extends Object> f339510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Function0<Unit>, Function0<Unit>> f339511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f339512e;

        /* JADX INFO: renamed from: org.reduxkotlin.h$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,163:1\n146#2,6:164\n*S KotlinDebug\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n*L\n62#1:164,6\n*E\n"})
        public static final class C2435a extends l0 implements Function1<Function2<? super State, ? super Action, ? extends State>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j<State, Object> f339513a;

            /* JADX INFO: renamed from: org.reduxkotlin.h$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
            public static final class C2436a extends l0 implements Function2<State, Object, State> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2 f339514a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2436a(Function2 function2) {
                    super(2);
                    this.f339514a = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final State invoke(State state, @NotNull Object action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.reifiedOperationMarker(3, "Action");
                    return action != null ? (State) this.f339514a.invoke(state, action) : state;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2435a(j<State, Object> jVar) {
                super(1);
                this.f339513a = jVar;
            }

            public final void c(@NotNull Function2<? super State, ? super Action, ? extends State> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<Function2<? super State, ? super Object, ? extends State>, Unit> function1F = this.f339513a.f();
                Intrinsics.needClassReification();
                function1F.invoke(new C2436a(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                c((Function2) obj);
                return Unit.f312394a;
            }
        }

        public a(j<State, Object> jVar) {
            this.f339508a = jVar;
            this.f339509b = jVar.d();
            this.f339510c = jVar.c();
            this.f339511d = jVar.b();
            this.f339512e = new C2435a(jVar);
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public j<State, Object> a() {
            return this.f339508a;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function0<Unit>, Function0<Unit>> b() {
            return this.f339511d;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Action, Object> c() {
            return this.f339510c;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function0<State> d() {
            return this.f339509b;
        }

        @Override // org.reduxkotlin.j
        public void e(@NotNull Function1<? super Action, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f339510c = function1;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f() {
            return this.f339512e;
        }

        @Override // org.reduxkotlin.j
        public State getState() {
            return (State) j.a.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    static final class b<State> extends l0 implements Function1<j<State, Object>, Function1<? super Function1<? super Object, ? extends Object>, ? extends Function1<? super Object, ? extends Object>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<j<State, Object>, Function1<Object, ? extends Object>, Object, Object> f339515a;

        static final class a extends l0 implements Function1<Function1<? super Object, ? extends Object>, Function1<? super Object, ? extends Object>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<j<State, Object>, Function1<Object, ? extends Object>, Object, Object> f339516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j<State, Object> f339517b;

            /* JADX INFO: renamed from: org.reduxkotlin.h$b$a$a, reason: collision with other inner class name */
            static final class C2437a extends l0 implements Function1<Object, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ n<j<State, Object>, Function1<Object, ? extends Object>, Object, Object> f339518a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j<State, Object> f339519b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1<Object, Object> f339520c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2437a(n<? super j<State, Object>, ? super Function1<Object, ? extends Object>, Object, ? extends Object> nVar, j<State, Object> jVar, Function1<Object, ? extends Object> function1) {
                    super(1);
                    this.f339518a = nVar;
                    this.f339519b = jVar;
                    this.f339520c = function1;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Object invoke(@NotNull Object action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    return this.f339518a.invoke(this.f339519b, this.f339520c, action);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n<? super j<State, Object>, ? super Function1<Object, ? extends Object>, Object, ? extends Object> nVar, j<State, Object> jVar) {
                super(1);
                this.f339516a = nVar;
                this.f339517b = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Function1<Object, Object> invoke(@NotNull Function1<Object, ? extends Object> next) {
                Intrinsics.checkNotNullParameter(next, "next");
                return new C2437a(this.f339516a, this.f339517b, next);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(n<? super j<State, Object>, ? super Function1<Object, ? extends Object>, Object, ? extends Object> nVar) {
            super(1);
            this.f339515a = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Function1<Function1<Object, ? extends Object>, Function1<Object, Object>> invoke(@NotNull j<State, Object> store) {
            Intrinsics.checkNotNullParameter(store, "store");
            return new a(this.f339515a, store);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TState] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
    public static final class c<TState> extends l0 implements Function2<TState, Object, TState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f339521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function2 function2) {
            super(2);
            this.f339521a = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final TState invoke(TState tstate, @NotNull Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            int i10 = 3 << 3;
            Intrinsics.reifiedOperationMarker(3, "TAction");
            return action != null ? (TState) this.f339521a.invoke(tstate, action) : tstate;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
    public static final class d<State> extends l0 implements Function2<State, Object, State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<State, Action, State> f339522a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super State, ? super Action, ? extends State> function2) {
            super(2);
            this.f339522a = function2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final State invoke(State state, @NotNull Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            int i10 = 5 << 3;
            Intrinsics.reifiedOperationMarker(3, "Action");
            return action != null ? this.f339522a.invoke(state, (Action) action) : state;
        }
    }

    @l(message = "Renamed to TypedReducer", replaceWith = @b1(expression = "TypedReducer", imports = {"org.reduxkotlin.TypedReducer"}))
    public static /* synthetic */ void a() {
    }

    public static final /* synthetic */ <State, Action> j<State, Action> b(j<State, Object> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.needClassReification();
        return new a(jVar);
    }

    @NotNull
    public static final <State> Function1<j<State, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> c(@NotNull n<? super j<State, Object>, ? super Function1<Object, ? extends Object>, Object, ? extends Object> dispatch) {
        Intrinsics.checkNotNullParameter(dispatch, "dispatch");
        return new b(dispatch);
    }

    @l(message = "Replaced with typedReducer", replaceWith = @b1(expression = "typedReducer", imports = {"org.reduxkotlin.typedReducer"}))
    public static final /* synthetic */ <TState, TAction> Function2<TState, Object, TState> d(Function2<? super TState, ? super TAction, ? extends TState> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        return new c(reducer);
    }

    public static final /* synthetic */ <State, Action> Function2<State, Object, State> e(Function2<? super State, ? super Action, ? extends State> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        return new d(reducer);
    }
}

package org.reduxkotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes14.dex */
@SourceDebugExtension({"SMAP\nCreateSameThreadEnforcedStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSameThreadEnforcedStore.kt\norg/reduxkotlin/CreateSameThreadEnforcedStoreKt\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,69:1\n146#2,6:70\n56#2,9:76\n*S KotlinDebug\n*F\n+ 1 CreateSameThreadEnforcedStore.kt\norg/reduxkotlin/CreateSameThreadEnforcedStoreKt\n*L\n65#1:70,6\n68#1:76,9\n*E\n"})
public final class f {

    /* JADX INFO: Add missing generic type declarations: [State] */
    public static final class a<State> implements j<State, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f339453a = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<State> f339454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function1<Object, ? extends Object> f339455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Function0<Unit>, Function0<Unit>> f339456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<Function2<? super State, Object, ? extends State>, Unit> f339457e;

        /* JADX INFO: renamed from: org.reduxkotlin.f$a$a, reason: collision with other inner class name */
        static final class C2431a extends l0 implements Function1<Object, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j<State, Object> f339458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f339459b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2431a(j<State, Object> jVar, String str) {
                super(1);
                this.f339458a = jVar;
                this.f339459b = str;
                int i10 = 7 ^ 1;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Object invoke(@NotNull Object action) {
                Intrinsics.checkNotNullParameter(action, "action");
                f.c(this.f339459b);
                return this.f339458a.c().invoke(action);
            }
        }

        static final class b extends l0 implements Function0<State> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j<State, Object> f339460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f339461b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j<State, Object> jVar, String str) {
                super(0);
                this.f339460a = jVar;
                this.f339461b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final State invoke() {
                f.c(this.f339461b);
                return this.f339460a.d().invoke();
            }
        }

        static final class c extends l0 implements Function1<Function2<? super State, ? super Object, ? extends State>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j<State, Object> f339462a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f339463b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j<State, Object> jVar, String str) {
                super(1);
                this.f339462a = jVar;
                this.f339463b = str;
                int i10 = 7 & 1;
            }

            public final void c(@NotNull Function2<? super State, Object, ? extends State> reducer) {
                Intrinsics.checkNotNullParameter(reducer, "reducer");
                f.c(this.f339463b);
                this.f339462a.f().invoke(reducer);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                c((Function2) obj);
                return Unit.f312394a;
            }
        }

        static final class d extends l0 implements Function1<Function0<? extends Unit>, Function0<? extends Unit>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j<State, Object> f339464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f339465b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(j<State, Object> jVar, String str) {
                super(1);
                this.f339464a = jVar;
                this.f339465b = str;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Function0<Unit> invoke(@NotNull Function0<Unit> storeSubscriber) {
                Intrinsics.checkNotNullParameter(storeSubscriber, "storeSubscriber");
                f.c(this.f339465b);
                return this.f339464a.b().invoke(storeSubscriber);
            }
        }

        a(j<State, Object> jVar, String str) {
            this.f339454b = new b(jVar, str);
            this.f339455c = new C2431a(jVar, str);
            this.f339456d = new d(jVar, str);
            this.f339457e = new c(jVar, str);
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function0<Unit>, Function0<Unit>> b() {
            return this.f339456d;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Object, Object> c() {
            return this.f339455c;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function0<State> d() {
            return this.f339454b;
        }

        @Override // org.reduxkotlin.j
        public void e(@NotNull Function1<? super Object, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f339455c = function1;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function2<? super State, Object, ? extends State>, Unit> f() {
            return this.f339457e;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return this.f339453a;
        }

        @Override // org.reduxkotlin.j
        public State getState() {
            return (State) j.a.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Action, State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1\n*L\n1#1,163:1\n*E\n"})
    public static final class b<Action, State> implements j<State, Action> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j<State, Object> f339466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<State> f339467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function1<? super Action, ? extends Object> f339468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Function0<Unit>, Function0<Unit>> f339469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f339470e;

        @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,163:1\n146#2,6:164\n*S KotlinDebug\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n*L\n62#1:164,6\n*E\n"})
        public static final class a extends l0 implements Function1<Function2<? super State, ? super Action, ? extends State>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f339471a;

            /* JADX INFO: renamed from: org.reduxkotlin.f$b$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
            public static final class C2432a extends l0 implements Function2<State, Object, State> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2 f339472a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2432a(Function2 function2) {
                    super(2);
                    this.f339472a = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final State invoke(State state, @NotNull Object action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.reifiedOperationMarker(3, "Action");
                    return action != null ? (State) this.f339472a.invoke(state, action) : state;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar) {
                super(1);
                this.f339471a = jVar;
            }

            public final void c(@NotNull Function2<? super State, ? super Action, ? extends State> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<Function2<? super State, ? super Action, ? extends State>, Unit> function1F = this.f339471a.f();
                Intrinsics.needClassReification();
                function1F.invoke(new C2432a(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                c((Function2) obj);
                return Unit.f312394a;
            }
        }

        public b(j jVar) {
            this.f339466a = jVar;
            this.f339467b = jVar.d();
            this.f339468c = jVar.c();
            this.f339469d = jVar.b();
            Intrinsics.needClassReification();
            this.f339470e = new a(jVar);
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public j<State, Object> a() {
            return this.f339466a;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function0<Unit>, Function0<Unit>> b() {
            return this.f339469d;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Action, Object> c() {
            return this.f339468c;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function0<State> d() {
            return this.f339467b;
        }

        @Override // org.reduxkotlin.j
        public void e(@NotNull Function1<? super Action, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f339468c = function1;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f() {
            return this.f339470e;
        }

        @Override // org.reduxkotlin.j
        public State getState() {
            return (State) j.a.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
    public static final class c<State> extends l0 implements Function2<State, Object, State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f339473a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function2 function2) {
            super(2);
            this.f339473a = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final State invoke(State state, @NotNull Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.reifiedOperationMarker(3, "Action");
            return action != null ? (State) this.f339473a.invoke(state, action) : state;
        }
    }

    @NotNull
    public static final <State> j<State, Object> b(@NotNull Function2<? super State, Object, ? extends State> reducer, State state, @Nullable Function1<? super n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, ? extends n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>> function1) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return new a(g.f(reducer, state, function1), zm.c.a(zm.b.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str) {
        if (e(str)) {
            return;
        }
        throw new IllegalStateException(StringsKt.r("\n      |You may not call the store from a thread other than the thread on which it was created.\n      |This includes: getState(), dispatch(), subscribe(), and replaceReducer()\n      |This store was created on: '" + str + "' and current\n      |thread is '" + zm.b.a() + "'\n        ", null, 1, null).toString());
    }

    public static /* synthetic */ j d(Function2 function2, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return b(function2, obj, function1);
    }

    private static final boolean e(String str) {
        return Intrinsics.areEqual(zm.c.a(zm.b.a()), str);
    }

    public static final /* synthetic */ <State, Action> j<State, Action> f(Function2<? super State, ? super Action, ? extends State> reducer, State state, Function1<? super n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, ? extends n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>> function1) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        j jVarB = b(new c(reducer), state, function1);
        Intrinsics.needClassReification();
        return new b(jVarB);
    }

    public static /* synthetic */ j g(Function2 reducer, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        j jVarB = b(new c(reducer), obj, function1);
        Intrinsics.needClassReification();
        return new b(jVarB);
    }
}

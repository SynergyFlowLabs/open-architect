package org.reduxkotlin.threadsafe;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reduxkotlin.g;
import org.reduxkotlin.j;
import pj.n;

/* JADX INFO: loaded from: classes14.dex */
@SourceDebugExtension({"SMAP\nCreateThreadSafeStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateThreadSafeStore.kt\norg/reduxkotlin/threadsafe/CreateThreadSafeStoreKt\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,56:1\n146#2,6:57\n56#2,9:63\n*S KotlinDebug\n*F\n+ 1 CreateThreadSafeStore.kt\norg/reduxkotlin/threadsafe/CreateThreadSafeStoreKt\n*L\n49#1:57,6\n49#1:63,9\n*E\n"})
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Action, State] */
    /* JADX INFO: renamed from: org.reduxkotlin.threadsafe.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1\n*L\n1#1,163:1\n*E\n"})
    public static final class C2438a<Action, State> implements j<State, Action> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j<State, Object> f339523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<State> f339524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Function1<? super Action, ? extends Object> f339525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Function1<Function0<Unit>, Function0<Unit>> f339526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f339527e;

        /* JADX INFO: renamed from: org.reduxkotlin.threadsafe.a$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n+ 2 Definitions.kt\norg/reduxkotlin/DefinitionsKt\n*L\n1#1,163:1\n146#2,6:164\n*S KotlinDebug\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$asTyped$1$replaceReducer$1\n*L\n62#1:164,6\n*E\n"})
        public static final class C2439a extends l0 implements Function1<Function2<? super State, ? super Action, ? extends State>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f339528a;

            /* JADX INFO: renamed from: org.reduxkotlin.threadsafe.a$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
            public static final class C2440a extends l0 implements Function2<State, Object, State> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2 f339529a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2440a(Function2 function2) {
                    super(2);
                    this.f339529a = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final State invoke(State state, @NotNull Object action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.reifiedOperationMarker(3, "Action");
                    return action != null ? (State) this.f339529a.invoke(state, action) : state;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2439a(j jVar) {
                super(1);
                this.f339528a = jVar;
            }

            public final void c(@NotNull Function2<? super State, ? super Action, ? extends State> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<Function2<? super State, ? super Action, ? extends State>, Unit> function1F = this.f339528a.f();
                Intrinsics.needClassReification();
                function1F.invoke(new C2440a(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                c((Function2) obj);
                return Unit.f312394a;
            }
        }

        public C2438a(j jVar) {
            this.f339523a = jVar;
            this.f339524b = jVar.d();
            this.f339525c = jVar.c();
            this.f339526d = jVar.b();
            Intrinsics.needClassReification();
            this.f339527e = new C2439a(jVar);
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public j<State, Object> a() {
            return this.f339523a;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function0<Unit>, Function0<Unit>> b() {
            return this.f339526d;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Action, Object> c() {
            return this.f339525c;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function0<State> d() {
            return this.f339524b;
        }

        @Override // org.reduxkotlin.j
        public void e(@NotNull Function1<? super Action, ? extends Object> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.f339525c = function1;
        }

        @Override // org.reduxkotlin.j
        @NotNull
        public Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f() {
            return this.f339527e;
        }

        @Override // org.reduxkotlin.j
        public State getState() {
            return (State) j.a.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    @SourceDebugExtension({"SMAP\nDefinitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Definitions.kt\norg/reduxkotlin/DefinitionsKt$typedReducer$1\n*L\n1#1,163:1\n*E\n"})
    public static final class b<State> extends l0 implements Function2<State, Object, State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f339530a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function2 function2) {
            super(2);
            this.f339530a = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final State invoke(State state, @NotNull Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.reifiedOperationMarker(3, "Action");
            return action != null ? (State) this.f339530a.invoke(state, action) : state;
        }
    }

    @NotNull
    public static final <State> c<State> a(@NotNull j<State, Object> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new c<>(jVar.a());
    }

    @NotNull
    public static final <State> j<State, Object> b(@NotNull Function2<? super State, Object, ? extends State> reducer, State state, @Nullable Function1<? super n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, ? extends n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>> function1) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return new c(g.f(reducer, state, function1));
    }

    public static /* synthetic */ j c(Function2 function2, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return b(function2, obj, function1);
    }

    public static final /* synthetic */ <State, Action> j<State, Action> d(Function2<? super State, ? super Action, ? extends State> reducer, State state, Function1<? super n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, ? extends n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>> function1) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        j jVarB = b(new b(reducer), state, function1);
        Intrinsics.needClassReification();
        return new C2438a(jVarB);
    }

    public static /* synthetic */ j e(Function2 reducer, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.needClassReification();
        j jVarB = b(new b(reducer), obj, function1);
        Intrinsics.needClassReification();
        return new C2438a(jVarB);
    }
}

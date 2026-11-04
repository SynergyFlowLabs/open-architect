package org.reduxkotlin;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [State] */
    static final class a<State> extends l0 implements Function1<n<? super Function2<? super State, ? super Object, ? extends State>, ? super State, ? super Object, ? extends j<State, Object>>, n<? super Function2<? super State, ? super Object, ? extends State>, ? super State, ? super Object, ? extends j<State, Object>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<j<State, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>>[] f339441a;

        /* JADX INFO: renamed from: org.reduxkotlin.b$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nApplyMiddleware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplyMiddleware.kt\norg/reduxkotlin/ApplyMiddlewareKt$applyMiddleware$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n11335#2:38\n11670#2,3:39\n*S KotlinDebug\n*F\n+ 1 ApplyMiddleware.kt\norg/reduxkotlin/ApplyMiddlewareKt$applyMiddleware$1$1\n*L\n31#1:38\n31#1:39,3\n*E\n"})
        static final class C2429a extends l0 implements n<Function2<? super State, ? super Object, ? extends State>, State, Object, j<State, Object>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<Function2<? super State, Object, ? extends State>, State, Object, j<State, Object>> f339442a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<j<State, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>>[] f339443b;

            /* JADX INFO: renamed from: org.reduxkotlin.b$a$a$a, reason: collision with other inner class name */
            static final class C2430a extends l0 implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C2430a f339444a = new C2430a();

                C2430a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Void invoke(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    throw new IllegalStateException("Dispatching while constructing your middleware is not allowed.\n                    Other middleware would not be applied to this dispatch.");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2429a(n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>> nVar, Function1<? super j<State, Object>, ? extends Function1<? super Function1<Object, ? extends Object>, ? extends Function1<Object, ? extends Object>>>[] function1Arr) {
                super(3);
                this.f339442a = nVar;
                this.f339443b = function1Arr;
            }

            @Override // pj.n
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final j<State, Object> invoke(@NotNull Function2<? super State, Object, ? extends State> reducer, State state, @Nullable Object obj) {
                Intrinsics.checkNotNullParameter(reducer, "reducer");
                j<State, Object> jVarInvoke = this.f339442a.invoke(reducer, state, obj);
                Function1<Object, Object> function1C = jVarInvoke.c();
                jVarInvoke.e(C2430a.f339444a);
                Function1<j<State, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>>[] function1Arr = this.f339443b;
                ArrayList arrayList = new ArrayList(function1Arr.length);
                for (Function1<j<State, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> function1 : function1Arr) {
                    arrayList.add(function1.invoke(jVarInvoke));
                }
                jVarInvoke.e((Function1) e.a(arrayList).invoke(function1C));
                return jVarInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super j<State, Object>, ? extends Function1<? super Function1<Object, ? extends Object>, ? extends Function1<Object, ? extends Object>>>[] function1Arr) {
            super(1);
            this.f339441a = function1Arr;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n<Function2<? super State, Object, ? extends State>, State, Object, j<State, Object>> invoke(@NotNull n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>> storeCreator) {
            Intrinsics.checkNotNullParameter(storeCreator, "storeCreator");
            return new C2429a(storeCreator, this.f339441a);
        }
    }

    @NotNull
    public static final <State> Function1<n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, n<Function2<? super State, Object, ? extends State>, State, Object, j<State, Object>>> a(@NotNull Function1<? super j<State, Object>, ? extends Function1<? super Function1<Object, ? extends Object>, ? extends Function1<Object, ? extends Object>>>... middlewares) {
        Intrinsics.checkNotNullParameter(middlewares, "middlewares");
        return new a(middlewares);
    }
}

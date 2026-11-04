package org.reduxkotlin;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [State] */
    @SourceDebugExtension({"SMAP\nCombineReducers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombineReducers.kt\norg/reduxkotlin/CombineReducersKt$combineReducers$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,16:1\n12990#2,3:17\n*S KotlinDebug\n*F\n+ 1 CombineReducers.kt\norg/reduxkotlin/CombineReducersKt$combineReducers$1\n*L\n7#1:17,3\n*E\n"})
    static final class a<State> extends l0 implements Function2<State, Object, State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<State, Object, State>[] f339448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super State, Object, ? extends State>[] function2Arr) {
            super(2);
            this.f339448a = function2Arr;
        }

        @Override // kotlin.jvm.functions.Function2
        public final State invoke(State state, @NotNull Object action) {
            Intrinsics.checkNotNullParameter(action, "action");
            for (Function2<State, Object, State> function2 : this.f339448a) {
                state = function2.invoke(state, action);
            }
            return state;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    static final class b<State> extends l0 implements Function2<State, Object, State> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<State, Object, State> f339449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<State, Object, State> f339450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super State, Object, ? extends State> function2, Function2<? super State, Object, ? extends State> function3) {
            super(2);
            this.f339449a = function2;
            this.f339450b = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final State invoke(State state, @NotNull Object a10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            return (State) this.f339449a.invoke(this.f339450b.invoke(state, a10), a10);
        }
    }

    @NotNull
    public static final <State> Function2<State, Object, State> a(@NotNull Function2<? super State, Object, ? extends State>... reducers) {
        Intrinsics.checkNotNullParameter(reducers, "reducers");
        return new a(reducers);
    }

    @NotNull
    public static final <State> Function2<State, Object, State> b(@NotNull Function2<? super State, Object, ? extends State> function2, @NotNull Function2<? super State, Object, ? extends State> other) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new b(other, function2);
    }
}

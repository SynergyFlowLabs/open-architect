package org.reduxkotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface j<State, Action> {

    public static final class a {
        public static <State, Action> State a(@NotNull j<State, Action> jVar) {
            return jVar.d().invoke();
        }
    }

    @NotNull
    j<State, Object> a();

    @NotNull
    Function1<Function0<Unit>, Function0<Unit>> b();

    @NotNull
    Function1<Action, Object> c();

    @NotNull
    Function0<State> d();

    void e(@NotNull Function1<? super Action, ? extends Object> function1);

    @NotNull
    Function1<Function2<? super State, ? super Action, ? extends State>, Unit> f();

    State getState();
}

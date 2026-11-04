package org.reduxkotlin.threadsafe;

import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reduxkotlin.j;
import pj.n;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [State] */
    static final class a<State> extends l0 implements Function1<n<? super Function2<? super State, ? super Object, ? extends State>, ? super State, ? super Object, ? extends j<State, Object>>, n<? super Function2<? super State, ? super Object, ? extends State>, ? super State, ? super Object, ? extends c<State>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f339531a = new a();

        /* JADX INFO: renamed from: org.reduxkotlin.threadsafe.b$a$a, reason: collision with other inner class name */
        static final class C2441a extends l0 implements n<Function2<? super State, ? super Object, ? extends State>, State, Object, c<State>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<Function2<? super State, Object, ? extends State>, State, Object, j<State, Object>> f339532a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2441a(n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>> nVar) {
                super(3);
                this.f339532a = nVar;
            }

            @Override // pj.n
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final c<State> invoke(@NotNull Function2<? super State, Object, ? extends State> reducer, State state, @Nullable Object obj) {
                Intrinsics.checkNotNullParameter(reducer, "reducer");
                return new c<>(this.f339532a.invoke(reducer, state, obj));
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n<Function2<? super State, Object, ? extends State>, State, Object, c<State>> invoke(@NotNull n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>> storeCreator) {
            Intrinsics.checkNotNullParameter(storeCreator, "storeCreator");
            return new C2441a(storeCreator);
        }
    }

    @l(message = "Renamed to createThreadSafeStoreEnhancer", replaceWith = @b1(expression = "createThreadSafeStoreEnhancer", imports = {"org.reduxkotlin.threadsafe.createThreadSafeStoreEnhancer"}))
    @NotNull
    public static final <State> Function1<n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, n<Function2<? super State, Object, ? extends State>, State, Object, j<State, Object>>> a() {
        return b();
    }

    @NotNull
    public static final <State> Function1<n<? super Function2<? super State, Object, ? extends State>, ? super State, Object, ? extends j<State, Object>>, n<Function2<? super State, Object, ? extends State>, State, Object, j<State, Object>>> b() {
        return a.f339531a;
    }
}

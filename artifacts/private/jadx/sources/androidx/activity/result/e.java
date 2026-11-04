package androidx.activity.result;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    @NotNull
    public static final <I, O> h<Unit> c(@NotNull b bVar, @NotNull g.a<I, O> contract, I i10, @NotNull k registry, @NotNull final Function1<O, Unit> callback) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new f(bVar.registerForActivityResult(contract, registry, new a() { // from class: androidx.activity.result.c
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                e.e(callback, obj);
            }
        }), contract, i10);
    }

    @NotNull
    public static final <I, O> h<Unit> d(@NotNull b bVar, @NotNull g.a<I, O> contract, I i10, @NotNull final Function1<O, Unit> callback) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new f(bVar.registerForActivityResult(contract, new a() { // from class: androidx.activity.result.d
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                e.f(callback, obj);
            }
        }), contract, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}

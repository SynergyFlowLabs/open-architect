package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final c0<Object, Object> f36390a = e(new Function2() { // from class: androidx.compose.runtime.saveable.d0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return f0.c((g0) obj, obj2);
        }
    }, new Function1() { // from class: androidx.compose.runtime.saveable.e0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return f0.d(obj);
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    public static final class a<Original, Saveable> implements c0<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<g0, Original, Saveable> f36391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Saveable, Original> f36392b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super g0, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f36391a = function2;
            this.f36392b = function1;
        }

        @Override // androidx.compose.runtime.saveable.c0
        public Saveable a(g0 g0Var, Original original) {
            return this.f36391a.invoke(g0Var, original);
        }

        @Override // androidx.compose.runtime.saveable.c0
        public Original b(Saveable saveable) {
            return this.f36392b.invoke(saveable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(g0 g0Var, Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    @NotNull
    public static final <Original, Saveable> c0<Original, Saveable> e(@NotNull Function2<? super g0, ? super Original, ? extends Saveable> function2, @NotNull Function1<? super Saveable, ? extends Original> function1) {
        return new a(function2, function1);
    }

    @NotNull
    public static final <T> c0<T, Object> f() {
        c0<T, Object> c0Var = (c0<T, Object>) f36390a;
        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return c0Var;
    }
}

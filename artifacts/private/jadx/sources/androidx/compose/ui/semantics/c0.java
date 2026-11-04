package androidx.compose.ui.semantics;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.v0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f41086a = {j1.k(new v0(c0.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(c0.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    static final class a extends l0 implements Function2<Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41087a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return obj;
        }
    }

    static {
        a0 a0Var = a0.f41069a;
        a0Var.b();
        a0Var.a();
    }

    @NotNull
    public static final <T> d0<T> a(@NotNull String str, @NotNull String str2, @NotNull Function2<? super T, ? super T, ? extends T> function2) {
        return new d0<>(str, false, (Function2) function2, str2);
    }

    public static /* synthetic */ d0 b(String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function2 = a.f41087a;
        }
        return a(str, str2, function2);
    }

    @NotNull
    public static final String c(@NotNull e0 e0Var) {
        return a0.f41069a.a().d(e0Var, f41086a[1]);
    }

    private static Object d(e0 e0Var) {
        return a0.f41069a.a();
    }

    public static final boolean e(@NotNull e0 e0Var) {
        return a0.f41069a.b().d(e0Var, f41086a[0]).booleanValue();
    }

    private static Object f(e0 e0Var) {
        return a0.f41069a.b();
    }

    public static final void g(@NotNull e0 e0Var, @NotNull String str) {
        a0.f41069a.a().h(e0Var, f41086a[1], str);
    }

    public static final void h(@NotNull e0 e0Var, boolean z10) {
        a0.f41069a.b().h(e0Var, f41086a[0], Boolean.valueOf(z10));
    }
}

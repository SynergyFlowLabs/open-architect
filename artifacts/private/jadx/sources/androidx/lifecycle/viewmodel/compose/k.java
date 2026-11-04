package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.f0;
import androidx.compose.runtime.snapshots.g0;
import androidx.compose.runtime.u6;
import androidx.compose.runtime.w6;
import androidx.lifecycle.l1;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.o;
import kotlin.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandleSaver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
@oj.i(name = "SavedStateHandleSaverKt")
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> implements Function1<n3<Object>, n3<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0<T, Object> f52556a;

        a(c0<T, Object> c0Var) {
            this.f52556a = c0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n3<T> invoke(n3<Object> n3Var) {
            T tB;
            if (!(n3Var instanceof g0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g0 g0Var = (g0) n3Var;
            if (g0Var.getValue() != null) {
                c0<T, Object> c0Var = this.f52556a;
                T value = g0Var.getValue();
                Intrinsics.checkNotNull(value);
                tB = c0Var.b(value);
            } else {
                tB = null;
            }
            u6<T> u6VarC = g0Var.c();
            Intrinsics.checkNotNull(u6VarC, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
            n3<T> n3VarK = w6.k(tB, u6VarC);
            Intrinsics.checkNotNull(n3VarK, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver>");
            return n3VarK;
        }
    }

    /* synthetic */ class b implements androidx.compose.runtime.saveable.g0, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l1.a f52557a;

        b(l1.a aVar) {
            this.f52557a = aVar;
        }

        @Override // androidx.compose.runtime.saveable.g0
        public final boolean a(Object obj) {
            return this.f52557a.b(obj);
        }

        @Override // kotlin.jvm.internal.c0
        public final x<?> b() {
            return new kotlin.jvm.internal.g0(1, this.f52557a, l1.a.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.compose.runtime.saveable.g0) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSavedStateHandleSaver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,183:1\n85#2:184\n117#2,2:185\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$1\n*L\n153#1:184\n156#1:185,2\n*E\n"})
    public static final class c<T> implements kotlin.properties.f<Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n3<T> f52558a;

        c(n3<T> n3Var) {
            this.f52558a = n3Var;
        }

        @Override // kotlin.properties.f, kotlin.properties.e
        public T getValue(Object obj, o<?> oVar) {
            return this.f52558a.getValue();
        }

        @Override // kotlin.properties.f
        public void setValue(Object obj, o<?> oVar, T t10) {
            this.f52558a.setValue(t10);
        }
    }

    private static final <T> c0<n3<T>, n3<Object>> f(final c0<T, ? extends Object> c0Var) {
        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return f0.e(new Function2() { // from class: androidx.lifecycle.viewmodel.compose.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return k.g(c0Var, (androidx.compose.runtime.saveable.g0) obj, (n3) obj2);
            }
        }, new a(c0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 g(c0 c0Var, androidx.compose.runtime.saveable.g0 g0Var, n3 n3Var) {
        if (!(n3Var instanceof g0)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        g0 g0Var2 = (g0) n3Var;
        Object objA = c0Var.a(g0Var, g0Var2.getValue());
        u6 u6VarC = g0Var2.c();
        Intrinsics.checkNotNull(u6VarC, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return w6.k(objA, u6VarC);
    }

    @e
    @NotNull
    public static final <T> n3<T> h(@NotNull l1 l1Var, @NotNull String str, @NotNull c0<T, ? extends Object> c0Var, @NotNull Function0<? extends n3<T>> function0) {
        return (n3) i(l1Var, str, f(c0Var), function0);
    }

    @e
    @NotNull
    public static final <T> T i(@NotNull l1 l1Var, @NotNull String str, @NotNull final c0<T, ? extends Object> c0Var, @NotNull Function0<? extends T> function0) {
        final T tInvoke;
        Object obj;
        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>");
        Bundle bundle = (Bundle) l1Var.e(str);
        if (bundle == null || (obj = bundle.get("value")) == null || (tInvoke = c0Var.b(obj)) == null) {
            tInvoke = function0.invoke();
        }
        l1Var.o(str, new androidx.savedstate.j.b() { // from class: androidx.lifecycle.viewmodel.compose.h
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return k.m(c0Var, tInvoke);
            }
        });
        return tInvoke;
    }

    @e
    @NotNull
    public static final <T> kotlin.properties.d<Object, kotlin.properties.e<Object, T>> j(@NotNull final l1 l1Var, @NotNull final c0<T, ? extends Object> c0Var, @NotNull final Function0<? extends T> function0) {
        return new kotlin.properties.d() { // from class: androidx.lifecycle.viewmodel.compose.g
            @Override // kotlin.properties.d
            public final Object a(Object obj, o oVar) {
                return k.n(l1Var, c0Var, function0, obj, oVar);
            }
        };
    }

    public static /* synthetic */ Object k(l1 l1Var, String str, c0 c0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = f0.f();
        }
        return i(l1Var, str, c0Var, function0);
    }

    public static /* synthetic */ kotlin.properties.d l(l1 l1Var, c0 c0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = f0.f();
        }
        return j(l1Var, c0Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle m(c0 c0Var, Object obj) {
        return androidx.core.os.e.b(TuplesKt.to("value", c0Var.a(new b(l1.f52428c), obj)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.properties.e n(l1 l1Var, c0 c0Var, Function0 function0, Object obj, o oVar) {
        String str;
        if (obj != null) {
            str = j1.d(obj.getClass()).m() + '.';
        } else {
            str = "";
        }
        final Object objI = i(l1Var, str + oVar.getName(), c0Var, function0);
        return new kotlin.properties.e() { // from class: androidx.lifecycle.viewmodel.compose.j
            @Override // kotlin.properties.e
            public final Object getValue(Object obj2, o oVar2) {
                return k.o(objI, obj2, oVar2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Object obj, Object obj2, o oVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.properties.f p(l1 l1Var, c0 c0Var, Function0 function0, Object obj, o oVar) {
        String str;
        if (obj != null) {
            str = j1.d(obj.getClass()).m() + '.';
        } else {
            str = "";
        }
        return new c(h(l1Var, str + oVar.getName(), c0Var, function0));
    }

    @e
    @oj.i(name = "saveableMutableState")
    @NotNull
    public static final <T, M extends n3<T>> kotlin.properties.d<Object, kotlin.properties.f<Object, T>> q(@NotNull final l1 l1Var, @NotNull final c0<T, ? extends Object> c0Var, @NotNull final Function0<? extends M> function0) {
        return new kotlin.properties.d() { // from class: androidx.lifecycle.viewmodel.compose.i
            @Override // kotlin.properties.d
            public final Object a(Object obj, o oVar) {
                return k.p(l1Var, c0Var, function0, obj, oVar);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.d r(l1 l1Var, c0 c0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = f0.f();
        }
        return q(l1Var, c0Var, function0);
    }
}

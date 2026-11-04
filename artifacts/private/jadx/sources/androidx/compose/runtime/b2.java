package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,611:1\n1282#2,6:612\n1282#2,6:618\n1282#2,6:624\n1282#2,6:634\n1282#2,6:640\n1282#2,6:646\n1282#2,6:652\n1282#2,6:662\n1282#2,6:668\n85#3,4:630\n85#3,4:658\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n155#1:612,6\n192#1:618,6\n230#1:624,6\n266#1:634,6\n344#1:640,6\n363#1:646,6\n387#1:652,6\n410#1:662,6\n609#1:668,6\n266#1:630,4\n410#1:658,4\n*E\n"})
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final v1 f35307a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f35308b = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f35309c = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public static final class a implements Function0<kotlin.coroutines.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35310a = new a();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final kotlin.coroutines.h invoke() {
            return kotlin.coroutines.h.f312451a;
        }
    }

    @o
    public static final void b(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super v1, ? extends u1> function1, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:228)");
        }
        boolean zD = c0Var.D(obj) | c0Var.D(obj2) | c0Var.D(obj3);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new t1(function1);
            c0Var.Y(objI0);
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    public static final void c(@Nullable Object obj, @Nullable Object obj2, @NotNull Function1<? super v1, ? extends u1> function1, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean zD = c0Var.D(obj) | c0Var.D(obj2);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new t1(function1);
            c0Var.Y(objI0);
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    public static final void d(@Nullable Object obj, @NotNull Function1<? super v1, ? extends u1> function1, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zD = c0Var.D(obj);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new t1(function1);
            c0Var.Y(objI0);
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    @kotlin.l(level = kotlin.n.ERROR, message = f35308b)
    public static final void e(@NotNull Function1<? super v1, ? extends u1> function1, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-904483903, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:120)");
        }
        throw new IllegalStateException(f35308b);
    }

    @o
    public static final void f(@NotNull Object[] objArr, @NotNull Function1<? super v1, ? extends u1> function1, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean zD = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zD |= c0Var.D(obj);
        }
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            c0Var.Y(new t1(function1));
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    public static final void g(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext coroutineContextX = c0Var.X();
        boolean zD = c0Var.D(obj) | c0Var.D(obj2) | c0Var.D(obj3);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new y2(coroutineContextX, function2);
            c0Var.Y(objI0);
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    public static final void h(@Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext coroutineContextX = c0Var.X();
        boolean zD = c0Var.D(obj) | c0Var.D(obj2);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new y2(coroutineContextX, function2);
            c0Var.Y(objI0);
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    public static final void i(@Nullable Object obj, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            int i11 = 7 ^ (-1);
            m0.A0(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        CoroutineContext coroutineContextX = c0Var.X();
        boolean zD = c0Var.D(obj);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new y2(coroutineContextX, function2);
            c0Var.Y(objI0);
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    @o
    @kotlin.l(level = kotlin.n.ERROR, message = f35309c)
    public static final void j(@NotNull final Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-805415771);
        int i11 = i10 & 1;
        if (c0VarR.h(i11 != 0, i11)) {
            if (m0.l0()) {
                int i12 = 7 & (-1);
                m0.A0(-805415771, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:325)");
            }
            throw new IllegalStateException(f35309c);
        }
        c0VarR.u();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.a2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b2.l(function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @o
    public static final void k(@NotNull Object[] objArr, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        CoroutineContext coroutineContextX = c0Var.X();
        boolean zD = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zD |= c0Var.D(obj);
        }
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            c0Var.Y(new y2(coroutineContextX, function2));
        }
        if (m0.l0()) {
            m0.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function2 function2, int i10, c0 c0Var, int i11) {
        j(function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    public static final void m(@NotNull Function0<Unit> function0, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        c0Var.p(function0);
        if (m0.l0()) {
            m0.z0();
        }
    }

    @kotlin.a1
    @NotNull
    public static final kotlinx.coroutines.s0 o(@NotNull CoroutineContext coroutineContext, @NotNull c0 c0Var) {
        if (coroutineContext.get(kotlinx.coroutines.p2.M2) == null) {
            return new o5(c0Var.X(), coroutineContext);
        }
        kotlinx.coroutines.a0 a0VarC = kotlinx.coroutines.u2.c(null, 1, null);
        a0VarC.f(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return kotlinx.coroutines.t0.a(a0VarC);
    }

    @o
    @NotNull
    public static final kotlinx.coroutines.s0 p(@Nullable Function0<? extends CoroutineContext> function0, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function0 = a.f35310a;
        }
        Object objI0 = c0Var.i0();
        if (objI0 == c0.f35327a.a()) {
            objI0 = o(function0.invoke(), c0Var);
            c0Var.Y(objI0);
        }
        return (kotlinx.coroutines.s0) objI0;
    }
}

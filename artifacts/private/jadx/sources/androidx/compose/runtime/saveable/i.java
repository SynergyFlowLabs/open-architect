package androidx.compose.runtime.saveable;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.u6;
import androidx.compose.runtime.w6;
import androidx.media3.exoplayer.a5;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n28#2:392\n75#3:393\n1282#4,3:394\n1285#4,3:398\n1282#4,6:401\n1#5:397\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n87#1:392\n91#1:393\n93#1:394,3\n93#1:398,3\n101#1:401,6\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f36400a = 36;

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> implements Function1<n3<Object>, n3<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0<T, Object> f36401a;

        a(c0<T, Object> c0Var) {
            this.f36401a = c0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n3<T> invoke(n3<Object> n3Var) {
            T tB;
            if (!(n3Var instanceof androidx.compose.runtime.snapshots.g0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            androidx.compose.runtime.snapshots.g0 g0Var = (androidx.compose.runtime.snapshots.g0) n3Var;
            if (g0Var.getValue() != null) {
                c0<T, Object> c0Var = this.f36401a;
                T value = g0Var.getValue();
                Intrinsics.checkNotNull(value);
                tB = c0Var.b(value);
            } else {
                tB = null;
            }
            u6<T> u6VarC = g0Var.c();
            Intrinsics.checkNotNull(u6VarC, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
            n3<T> n3VarK = w6.k(tB, u6VarC);
            Intrinsics.checkNotNull(n3VarK, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
            return n3VarK;
        }
    }

    @NotNull
    public static final String d(@NotNull Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    @NotNull
    public static final <T> c0<n3<T>, n3<Object>> e(@NotNull final c0<T, ? extends Object> c0Var) {
        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return f0.e(new Function2() { // from class: androidx.compose.runtime.saveable.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i.f(c0Var, (g0) obj, (n3) obj2);
            }
        }, new a(c0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 f(c0 c0Var, g0 g0Var, n3 n3Var) {
        if (!(n3Var instanceof androidx.compose.runtime.snapshots.g0)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        androidx.compose.runtime.snapshots.g0 g0Var2 = (androidx.compose.runtime.snapshots.g0) n3Var;
        Object objA = c0Var.a(g0Var, g0Var2.getValue());
        if (objA == null) {
            return null;
        }
        u6 u6VarC = g0Var2.c();
        Intrinsics.checkNotNull(u6VarC, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return w6.k(objA, u6VarC);
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = " 'rememberSaveable' with a custom 'key' is no longer supported. It bypasses positional scoping, leading to state bugs and inconsistent behavior (e.g., unintentional state sharing or loss, issues in nested LazyLayouts). Please remove the 'key' parameter to use positional scoping for consistent, locally-scoped state. See https://r.android.com/3610053 for details.")
    @NotNull
    public static final <T> n3<T> g(@NotNull Object[] objArr, @NotNull c0<T, ? extends Object> c0Var, @Nullable String str, @NotNull Function0<? extends n3<T>> function0, @Nullable androidx.compose.runtime.c0 c0Var2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (m0.l0()) {
            m0.A0(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:248)");
        }
        n3<T> n3Var = (n3) i(Arrays.copyOf(objArr, objArr.length), e(c0Var), str2, function0, c0Var2, i10 & 8064, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> n3<T> h(@NotNull Object[] objArr, @NotNull c0<T, ? extends Object> c0Var, @NotNull Function0<? extends n3<T>> function0, @Nullable androidx.compose.runtime.c0 c0Var2, int i10) {
        if (m0.l0()) {
            m0.A0(-746165481, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:208)");
        }
        n3<T> n3Var = (n3) i(Arrays.copyOf(objArr, objArr.length), e(c0Var), null, function0, c0Var2, ((i10 << 3) & 7168) | a5.S0, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = " 'rememberSaveable' with a custom 'key' is no longer supported. It bypasses positional scoping, leading to state bugs and inconsistent behavior (e.g., unintentional state sharing or loss, issues in nested LazyLayouts). Please remove the 'key' parameter to use positional scoping for consistent, locally-scoped state. See https://r.android.com/3610053 for details.")
    @NotNull
    public static final <T> T i(@NotNull Object[] objArr, @Nullable c0<T, ? extends Object> c0Var, @Nullable String str, @NotNull Function0<? extends T> function0, @Nullable androidx.compose.runtime.c0 c0Var2, int i10, int i11) {
        Object[] objArr2;
        final T t10;
        Object objF;
        if ((i11 & 2) != 0) {
            c0Var = f0.f();
        }
        final c0<T, ? extends Object> c0Var3 = c0Var;
        int i12 = i11 & 4;
        T tInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (m0.l0()) {
            m0.A0(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jL = androidx.compose.runtime.v.l(c0Var2, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(jL, CharsKt.checkRadix(f36400a));
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        final String str2 = str;
        Intrinsics.checkNotNull(c0Var3, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final v vVar = (v) c0Var2.W(y.g());
        Object objI0 = c0Var2.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            if (vVar != null && (objF = vVar.f(str2)) != null) {
                tInvoke = c0Var3.b(objF);
            }
            if (tInvoke == null) {
                tInvoke = function0.invoke();
            }
            objArr2 = objArr;
            Object lVar = new l(c0Var3, vVar, str2, tInvoke, objArr2);
            c0Var2.Y(lVar);
            objI0 = lVar;
        } else {
            objArr2 = objArr;
        }
        final l lVar2 = (l) objI0;
        Object objC = lVar2.c(objArr2);
        if (objC == null) {
            objC = function0.invoke();
        }
        boolean zK0 = c0Var2.k0(lVar2) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var2.k0(c0Var3)) || (i10 & 48) == 32) | c0Var2.k0(vVar) | c0Var2.D(str2) | c0Var2.k0(objC) | c0Var2.k0(objArr2);
        Object objI1 = c0Var2.i0();
        if (zK0 || objI1 == aVar.a()) {
            final Object[] objArr3 = objArr2;
            t10 = (T) objC;
            Object obj = new Function0() { // from class: androidx.compose.runtime.saveable.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.l(lVar2, c0Var3, vVar, str2, t10, objArr3);
                }
            };
            c0Var2.Y(obj);
            objI1 = obj;
        } else {
            t10 = (T) objC;
        }
        b2.m((Function0) objI1, c0Var2, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return t10;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> T j(@NotNull Object[] objArr, @NotNull c0<T, ? extends Object> c0Var, @NotNull Function0<? extends T> function0, @Nullable androidx.compose.runtime.c0 c0Var2, int i10) {
        if (m0.l0()) {
            m0.A0(674689872, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        T t10 = (T) i(Arrays.copyOf(objArr, objArr.length), c0Var, null, function0, c0Var2, (i10 & com.planner5d.library.engine.input.f.b.B) | a5.S0 | ((i10 << 3) & 7168), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return t10;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> T k(@NotNull Object[] objArr, @NotNull Function0<? extends T> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1564532345, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t10 = (T) i(Arrays.copyOf(objArr, objArr.length), f0.f(), null, function0, c0Var, ((i10 << 6) & 7168) | a5.S0, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(l lVar, c0 c0Var, v vVar, String str, Object obj, Object[] objArr) {
        lVar.e(c0Var, vVar, str, obj, objArr);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(v vVar, Object obj) {
        String strD;
        if (obj == null || vVar.a(obj)) {
            return;
        }
        if (obj instanceof androidx.compose.runtime.snapshots.g0) {
            androidx.compose.runtime.snapshots.g0 g0Var = (androidx.compose.runtime.snapshots.g0) obj;
            if (g0Var.c() == w6.o() || g0Var.c() == w6.z() || g0Var.c() == w6.v()) {
                strD = "MutableState containing " + g0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strD = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strD = d(obj);
        }
        throw new IllegalArgumentException(strD);
    }
}

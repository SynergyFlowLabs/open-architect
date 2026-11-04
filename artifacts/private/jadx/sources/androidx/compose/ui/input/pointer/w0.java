package androidx.compose.ui.input.pointer;

import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f39138a = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final q f39139b = new q(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f39140c = 8;

    static final class a implements PointerInputEventHandler, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f39141a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2) {
            this.f39141a = function2;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f39141a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof PointerInputEventHandler) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(l0 l0Var, kotlin.coroutines.d dVar) {
            return this.f39141a.invoke(l0Var, dVar);
        }
    }

    @NotNull
    public static final y0 a(@NotNull PointerInputEventHandler pointerInputEventHandler) {
        return new z0((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This function is deprecated. Use 'SuspendingPointerInputModifierNode' with thePointerInputEventHandler instead.", replaceWith = @b1(expression = "SuspendingPointerInputModifierNode { pointerInputEventHandler }", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode"}))
    public static final /* synthetic */ y0 b(Function2 function2) {
        return new z0((Object) null, (Object) null, (Object[]) null, (Function2<? super l0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>) function2);
    }

    private static /* synthetic */ void d() {
    }

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @Nullable Object obj, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        return a0Var.B2(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    @NotNull
    public static final androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, @Nullable Object obj, @Nullable Object obj2, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        return a0Var.B2(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This function is deprecated. Use the PointerInputEventHandler block variation instead", replaceWith = @b1(expression = "pointerInput(key1 = key1, pointerInputEventHandler = block)", imports = {"androidx.compose.ui.input.pointer.Modifier.pointerInput"}))
    public static final /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, Object obj, Function2 function2) {
        int i10 = 1 << 0;
        return a0Var.B2(new SuspendPointerInputElement(obj, null, null, new a(function2), 6, null));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = f39138a)
    @NotNull
    public static final androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function2<? super l0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        throw new IllegalStateException(f39138a);
    }

    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Object[] objArr, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        return a0Var.B2(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3, null));
    }
}

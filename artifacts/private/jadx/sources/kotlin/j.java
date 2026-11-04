package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.i
@m2(markerClass = {s.class})
@e1(version = "1.7")
public abstract class j<T, R> {
    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract Object a(T t10, @NotNull kotlin.coroutines.d<? super R> dVar);

    @Nullable
    public abstract <U, S> Object b(@NotNull h<U, S> hVar, U u10, @NotNull kotlin.coroutines.d<? super S> dVar);

    @l(level = n.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @b1(expression = "this.callRecursive(value)", imports = {}))
    @NotNull
    public final Void d(@NotNull h<?, ?> hVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    private j() {
    }
}

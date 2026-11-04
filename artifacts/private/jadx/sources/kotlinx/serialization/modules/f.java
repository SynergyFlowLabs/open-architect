package kotlinx.serialization.modules;

import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer d(f fVar, kotlin.reflect.d dVar, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return fVar.c(dVar, list);
    }

    @kotlinx.serialization.i
    public static /* synthetic */ void f() {
    }

    @kotlinx.serialization.g
    public abstract void a(@NotNull j jVar);

    @l(level = n.HIDDEN, message = "Deprecated in favor of overload with default parameter", replaceWith = @b1(expression = "getContextual(kclass)", imports = {}))
    @kotlinx.serialization.g
    public final /* synthetic */ KSerializer b(kotlin.reflect.d kclass) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        return c(kclass, CollectionsKt.emptyList());
    }

    @kotlinx.serialization.g
    @Nullable
    public abstract <T> KSerializer<T> c(@NotNull kotlin.reflect.d<T> dVar, @NotNull List<? extends KSerializer<?>> list);

    public abstract boolean e();

    @kotlinx.serialization.g
    @Nullable
    public abstract <T> kotlinx.serialization.e<T> g(@NotNull kotlin.reflect.d<? super T> dVar, @Nullable String str);

    @kotlinx.serialization.g
    @Nullable
    public abstract <T> d0<T> h(@NotNull kotlin.reflect.d<? super T> dVar, @NotNull T t10);

    private f() {
    }
}

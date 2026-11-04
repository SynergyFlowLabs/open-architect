package ri;

import java.lang.reflect.Type;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.reflect.a0;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    @l(message = "Not used anymore in common code as it was needed only for JVM target.")
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Type b(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return a0.f(sVar);
    }

    @l(message = "Use KType.javaType instead.", replaceWith = @b1(expression = "this.javaType", imports = {"kotlin.reflect.javaType"}))
    public static /* synthetic */ void c(s sVar) {
    }

    @NotNull
    public static final Type d(@NotNull b bVar) {
        Type typeF;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        s sVarA = bVar.a();
        return (sVarA == null || (typeF = a0.f(sVarA)) == null) ? oj.b.e(bVar.b()) : typeF;
    }

    public static /* synthetic */ void e(b bVar) {
    }

    public static final boolean f(@NotNull Object obj, @NotNull kotlin.reflect.d<?> type) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return oj.b.e(type).isInstance(obj);
    }

    @l(message = "Use TypeInfo constructor instead.", replaceWith = @b1(expression = "TypeInfo(kClass, kType)", imports = {}))
    @NotNull
    public static final b g(@NotNull Type reifiedType, @NotNull kotlin.reflect.d<?> kClass, @Nullable s sVar) {
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new b(kClass, sVar);
    }
}

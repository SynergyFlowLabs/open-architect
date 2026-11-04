package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    @oj.i(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void a(@Nullable String str, @NotNull kotlin.reflect.d<?> baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.Q() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.Q() + "' has to be sealed and '@Serializable'.";
        }
        throw new kotlinx.serialization.c0(str2);
    }

    @oj.i(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void b(@NotNull kotlin.reflect.d<?> subClass, @NotNull kotlin.reflect.d<?> baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String strQ = subClass.Q();
        if (strQ == null) {
            strQ = String.valueOf(subClass);
        }
        a(strQ, baseClass);
        throw new kotlin.a0();
    }
}

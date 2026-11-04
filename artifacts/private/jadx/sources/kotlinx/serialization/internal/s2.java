package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Map<kotlin.reflect.d<?>, KSerializer<?>> f316007a = e2.k();

    @NotNull
    public static final SerialDescriptor a(@NotNull String serialName, @NotNull kotlinx.serialization.descriptors.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        d(serialName);
        return new r2(serialName, kind);
    }

    @Nullable
    public static final <T> KSerializer<T> b(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return (KSerializer) f316007a.get(dVar);
    }

    private static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 2 << 0;
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.M(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static final void d(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (KSerializer<?> kSerializer : f316007a.values()) {
            if (Intrinsics.areEqual(serialName, kSerializer.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(StringsKt.p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + kotlin.jvm.internal.j1.d(kSerializer.getClass()).Q() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}

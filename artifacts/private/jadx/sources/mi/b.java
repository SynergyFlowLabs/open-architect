package mi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nConversionServiceJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversionServiceJvm.kt\nio/ktor/util/converters/ConversionServiceJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,61:1\n1310#2,2:62\n*S KotlinDebug\n*F\n+ 1 ConversionServiceJvm.kt\nio/ktor/util/converters/ConversionServiceJvmKt\n*L\n18#1:62,2\n*E\n"})
public final class b {
    private static final Object a(String str, kotlin.reflect.d<?> dVar) {
        if (Intrinsics.areEqual(dVar, j1.d(Integer.class))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Float.class))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Double.class))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Long.class))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Short.class))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Boolean.class))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(String.class))) {
            return str;
        }
        if (Intrinsics.areEqual(dVar, j1.d(Character.class))) {
            return Character.valueOf(str.charAt(0));
        }
        if (Intrinsics.areEqual(dVar, j1.d(BigDecimal.class))) {
            return new BigDecimal(str);
        }
        if (Intrinsics.areEqual(dVar, j1.d(BigInteger.class))) {
            return new BigInteger(str);
        }
        if (Intrinsics.areEqual(dVar, j1.d(UUID.class))) {
            return UUID.fromString(str);
        }
        return null;
    }

    @Nullable
    public static final Object b(@NotNull String value, @NotNull kotlin.reflect.d<?> klass) throws d {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object objA = a(value, klass);
        if (objA != null) {
            return objA;
        }
        Object obj = null;
        if (!oj.b.e(klass).isEnum()) {
            return null;
        }
        Object[] enumConstants = oj.b.e(klass).getEnumConstants();
        if (enumConstants != null) {
            for (Object obj2 : enumConstants) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (Intrinsics.areEqual(((Enum) obj2).name(), value)) {
                    obj = obj2;
                    break;
                }
            }
            if (obj != null) {
                return obj;
            }
        }
        throw new d("Value " + value + " is not a enum member name of " + klass);
    }

    @Nullable
    public static final List<String> c(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Enum) {
            return CollectionsKt.listOf(((Enum) value).name());
        }
        if (value instanceof Integer) {
            return CollectionsKt.listOf(((Integer) value).toString());
        }
        if (value instanceof Float) {
            return CollectionsKt.listOf(((Float) value).toString());
        }
        if (value instanceof Double) {
            return CollectionsKt.listOf(((Double) value).toString());
        }
        if (value instanceof Long) {
            return CollectionsKt.listOf(((Long) value).toString());
        }
        if (value instanceof Boolean) {
            return CollectionsKt.listOf(((Boolean) value).toString());
        }
        if (value instanceof Short) {
            return CollectionsKt.listOf(((Short) value).toString());
        }
        if (value instanceof String) {
            return CollectionsKt.listOf(((String) value).toString());
        }
        if (value instanceof Character) {
            return CollectionsKt.listOf(((Character) value).toString());
        }
        if (value instanceof BigDecimal) {
            return CollectionsKt.listOf(((BigDecimal) value).toString());
        }
        if (value instanceof BigInteger) {
            return CollectionsKt.listOf(((BigInteger) value).toString());
        }
        if (value instanceof UUID) {
            return CollectionsKt.listOf(((UUID) value).toString());
        }
        return null;
    }
}

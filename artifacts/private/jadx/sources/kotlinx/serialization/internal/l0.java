package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13537#2,2:149\n13472#2,2:151\n13539#2:153\n13472#2,2:154\n13537#2,2:156\n13472#2,2:158\n13539#2:160\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n68#1:149,2\n71#1:151,2\n68#1:153\n88#1:154,2\n91#1:156,2\n94#1:158,2\n91#1:160\n*E\n"})
public final class l0 {
    @kotlin.a1
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> a(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] entryAnnotations, @Nullable Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        i0 i0Var = new i0(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                i0Var.q(annotation);
            }
        }
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.j(i0Var, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, i11);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    i0Var.p(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new k0(serialName, values, i0Var);
    }

    @kotlin.a1
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> b(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] annotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        i0 i0Var = new i0(serialName, values.length);
        int length = values.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = values[i10];
            int i12 = i11 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i11);
            if (strName == null) {
                strName = t10.name();
            }
            PluginGeneratedSerialDescriptor.j(i0Var, strName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) ArraysKt.getOrNull(annotations, i11);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    i0Var.p(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        return new k0(serialName, values, i0Var);
    }

    @kotlin.a1
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> c(@NotNull String serialName, @NotNull T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new k0(serialName, values);
    }
}

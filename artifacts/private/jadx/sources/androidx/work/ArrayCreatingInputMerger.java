package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayCreatingInputMerger extends p {
    private final Object b(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newArray, 0, length);
        Array.set(newArray, length, obj2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final Object c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newArray, 0, length);
        System.arraycopy(obj2, 0, newArray, length, length2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final Object d(Object obj, Class<?> cls) {
        Object newArray = Array.newInstance(cls, 1);
        Array.set(newArray, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    @Override // androidx.work.p
    @NotNull
    public h a(@NotNull List<h> inputs) throws Throwable {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        h.a aVar = new h.a();
        HashMap map = new HashMap();
        Iterator<h> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapX = it.next().x();
            Intrinsics.checkNotNullExpressionValue(mapX, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : mapX.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.areEqual(cls2, cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = c(obj, value);
                    } else {
                        if (!Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = b(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = d(value, cls);
                }
                Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        aVar.d(map);
        h hVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "output.build()");
        return hVarA;
    }
}

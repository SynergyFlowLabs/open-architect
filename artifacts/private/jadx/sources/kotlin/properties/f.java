package kotlin.properties;

import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface f<T, V> extends e<T, V> {
    @Override // kotlin.properties.e
    V getValue(T t10, @NotNull o<?> oVar);

    void setValue(T t10, @NotNull o<?> oVar, V v10);
}

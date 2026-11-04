package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface l<T, V> extends q<T, V>, j<V> {

    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    public interface b<T, V> extends j.a<V>, Function2<T, V, Unit> {
    }

    @Override // kotlin.reflect.j
    @NotNull
    b<T, V> a();

    void set(T t10, V v10);
}

package kotlin.reflect;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface m<D, E, V> extends r<D, E, V>, j<V> {

    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    public interface b<D, E, V> extends j.a<V>, pj.n<D, E, V, Unit> {
    }

    @Override // kotlin.reflect.j
    @NotNull
    b<D, E, V> a();

    void o(D d10, E e10, V v10);
}

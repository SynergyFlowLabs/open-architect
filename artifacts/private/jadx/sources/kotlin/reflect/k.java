package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface k<V> extends p<V>, j<V> {

    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    public interface b<V> extends j.a<V>, Function1<V, Unit> {
    }

    @Override // kotlin.reflect.j
    @NotNull
    b<V> a();

    void set(V v10);
}

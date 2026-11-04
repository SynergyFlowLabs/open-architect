package kotlin.reflect;

import kotlin.e1;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface q<T, V> extends o<V>, Function1<T, V> {

    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    public interface b<T, V> extends o.c<V>, Function1<T, V> {
    }

    @Override // kotlin.reflect.o
    @NotNull
    b<T, V> b();

    V get(T t10);

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    Object h(T t10);
}

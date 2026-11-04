package kotlin.reflect;

import kotlin.e1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface r<D, E, V> extends o<V>, Function2<D, E, V> {

    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    public interface b<D, E, V> extends o.c<V>, Function2<D, E, V> {
    }

    @Override // kotlin.reflect.o
    @NotNull
    b<D, E, V> b();

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    Object u(D d10, E e10);

    V w(D d10, E e10);
}

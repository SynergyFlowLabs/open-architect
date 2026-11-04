package kotlin.reflect;

import kotlin.e1;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface p<V> extends o<V>, Function0<V> {

    public static final class a {
        public static /* synthetic */ void a() {
        }
    }

    public interface b<V> extends o.c<V>, Function0<V> {
    }

    @Override // kotlin.reflect.o
    @NotNull
    b<V> b();

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    Object e();

    V get();
}

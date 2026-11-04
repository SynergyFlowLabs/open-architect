package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface c<R> extends b {

    public static final class a {
        @kotlin.internal.g
        public static /* synthetic */ void a() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void b() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void c() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void d() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void e() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void f() {
        }

        @e1(version = "1.3")
        public static /* synthetic */ void g() {
        }
    }

    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<n, ? extends Object> map);

    @NotNull
    String getName();

    @NotNull
    List<n> getParameters();

    @NotNull
    s getReturnType();

    @NotNull
    List<t> getTypeParameters();

    @Nullable
    v getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}

package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface d<T> extends h, b, g {

    public static final class a {
        @e1(version = "1.3")
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

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void g() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void h() {
        }

        @e1(version = "1.4")
        public static /* synthetic */ void i() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void j() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void k() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void l() {
        }

        @e1(version = "1.5")
        public static /* synthetic */ void m() {
        }
    }

    @NotNull
    List<d<? extends T>> B();

    @Nullable
    T C();

    boolean E();

    boolean G();

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    boolean K(@Nullable Object obj);

    boolean M();

    boolean P();

    @Nullable
    String Q();

    @NotNull
    List<s> T();

    boolean W();

    boolean equals(@Nullable Object obj);

    @Override // kotlin.reflect.h
    @NotNull
    Collection<c<?>> f();

    @NotNull
    List<t> getTypeParameters();

    @Nullable
    v getVisibility();

    int hashCode();

    boolean i();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    @Nullable
    String m();

    @NotNull
    Collection<d<?>> y();

    @NotNull
    Collection<i<T>> z();
}

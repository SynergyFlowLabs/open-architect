package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE})
@e1(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.CLASS})
@jj.e(jj.a.RUNTIME)
public @interface Metadata {

    public static final class a {
        @l(level = n.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @e1(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void c() {
        }
    }

    @oj.i(name = "bv")
    int[] bv() default {1, 0, 3};

    @oj.i(name = "d1")
    String[] d1() default {};

    @oj.i(name = "d2")
    String[] d2() default {};

    @oj.i(name = "k")
    int k() default 1;

    @oj.i(name = "mv")
    int[] mv() default {};

    @oj.i(name = "pn")
    String pn() default "";

    @oj.i(name = "xi")
    int xi() default 0;

    @oj.i(name = "xs")
    String xs() default "";
}

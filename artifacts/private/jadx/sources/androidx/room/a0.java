package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {})
@jj.e(jj.a.BINARY)
public @interface a0 {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final b f74634x = b.f74637a;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f74635y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f74636z = 2;

    @Retention(RetentionPolicy.CLASS)
    @jj.e(jj.a.BINARY)
    public @interface a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f74637a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f74638b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f74639c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f74640d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f74641e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f74642f = 5;

        private b() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}

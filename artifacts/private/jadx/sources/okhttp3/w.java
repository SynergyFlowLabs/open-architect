package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f334805a = b.f334806a;

    public interface a {
        int a();

        @NotNull
        a b(int i10, @NotNull TimeUnit timeUnit);

        @NotNull
        f0 c(@NotNull d0 d0Var) throws IOException;

        @NotNull
        e call();

        @Nullable
        j d();

        @NotNull
        a e(int i10, @NotNull TimeUnit timeUnit);

        @NotNull
        a f(int i10, @NotNull TimeUnit timeUnit);

        int g();

        int h();

        @NotNull
        d0 request();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f334806a = new b();

        @SourceDebugExtension({"SMAP\nInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interceptor.kt\nokhttp3/Interceptor$Companion$invoke$1\n*L\n1#1,105:1\n*E\n"})
        public static final class a implements w {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<a, f0> f334807b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super a, f0> function1) {
                this.f334807b = function1;
            }

            @Override // okhttp3.w
            @NotNull
            public final f0 intercept(@NotNull a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f334807b.invoke(it);
            }
        }

        private b() {
        }

        @NotNull
        public final w a(@NotNull Function1<? super a, f0> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new a(block);
        }
    }

    @NotNull
    f0 intercept(@NotNull a aVar) throws IOException;
}

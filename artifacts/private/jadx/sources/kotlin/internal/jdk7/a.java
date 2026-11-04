package kotlin.internal.jdk7;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.internal.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class a extends l {

    /* JADX INFO: renamed from: kotlin.internal.jdk7.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    private static final class C2254a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2254a f312506a = new C2254a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @f
        @Nullable
        public static final Integer f312507b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f312507b = num2;
        }

        private C2254a() {
        }
    }

    private final boolean e(int i10) {
        Integer num = C2254a.f312507b;
        if (num != null && num.intValue() < i10) {
            return false;
        }
        return true;
    }

    @Override // kotlin.internal.l
    public void a(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (e(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // kotlin.internal.l
    @NotNull
    public List<Throwable> d(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!e(19)) {
            return super.d(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return ArraysKt.asList(suppressed);
    }
}

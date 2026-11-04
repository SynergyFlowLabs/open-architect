package s5;

import android.os.Looper;
import androidx.annotation.b1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import o5.c;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f366973a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f366974b = a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f366975c;

    private a() {
    }

    @n
    public static final void a() {
        f366975c = true;
    }

    private final void b(String str, Class<?> cls, String str2, String str3) {
        if (f366975c) {
            q1 q1Var = q1.f312784a;
            Intrinsics.checkNotNullExpressionValue(String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", Arrays.copyOf(new Object[]{str, cls.getName(), str2, str3, Looper.myLooper(), Looper.getMainLooper()}, 6)), "java.lang.String.format(locale, format, *args)");
            Exception exc = new Exception();
            c.a aVar = c.a.f333560a;
            c.a.b(exc, c.EnumC2344c.ThreadCheck).g();
        }
    }

    @n
    public static final void c(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull String methodDesc) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(methodDesc, "methodDesc");
        f366973a.b("@UiThread", clazz, methodName, methodDesc);
    }

    @n
    public static final void d(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull String methodDesc) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(methodDesc, "methodDesc");
        f366973a.b("@WorkerThread", clazz, methodName, methodDesc);
    }
}

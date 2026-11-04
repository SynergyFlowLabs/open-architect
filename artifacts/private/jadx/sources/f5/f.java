package f5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f275002a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f275003b = f.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f275004c = "com.unity3d.player.UnityPlayer";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f275005d = "UnitySendMessage";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f275006e = "UnityFacebookSDKPlugin";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f275007f = "CaptureViewHierarchy";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f275008g = "OnReceiveMapping";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class<?> f275009h;

    private f() {
    }

    @n
    public static final void a() {
        d(f275006e, f275007f, "");
    }

    private final Class<?> b() throws ClassNotFoundException {
        Class<?> cls = Class.forName(f275004c);
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    @n
    public static final void c(@Nullable String str) {
        d(f275006e, f275008g, str);
    }

    @n
    public static final void d(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        try {
            if (f275009h == null) {
                f275009h = f275002a.b();
            }
            Class<?> cls = f275009h;
            if (cls == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod(f275005d, String.class, String.class, String.class);
            Class<?> cls2 = f275009h;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}

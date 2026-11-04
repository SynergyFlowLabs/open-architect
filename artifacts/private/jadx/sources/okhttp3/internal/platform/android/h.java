package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f334522d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Method f334523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Method f334524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Method f334525c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new h(method3, method2, method);
        }

        private a() {
        }
    }

    public h(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f334523a = method;
        this.f334524b = method2;
        this.f334525c = method3;
    }

    @Nullable
    public final Object a(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.f334523a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f334524b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(@Nullable Object obj) {
        if (obj != null) {
            try {
                Method method = this.f334525c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

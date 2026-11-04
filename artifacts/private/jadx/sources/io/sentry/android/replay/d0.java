package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import java.lang.reflect.Field;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@e.a({"PrivateApi"})
@SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/WindowSpy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f304894a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f304895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f0 f304896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f304897d;

    static final class a extends l0 implements Function0<Class<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f304898a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/WindowSpy$windowField$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
    static final class b extends l0 implements Function0<Field> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f304899a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class clsB = d0.f304894a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                clsB.toString();
                return null;
            }
        }
    }

    static {
        j0 j0Var = j0.NONE;
        f304895b = g0.b(j0Var, a.f304898a);
        f304896c = g0.b(j0Var, b.f304899a);
        f304897d = 8;
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> b() {
        return (Class) f304895b.getValue();
    }

    private final Field c() {
        return (Field) f304896c.getValue();
    }

    @Nullable
    public final Window d(@NotNull View maybeDecorView) throws IllegalAccessException {
        Field fieldC;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class<?> clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f304894a.c()) == null) {
            return null;
        }
        Object obj = fieldC.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}

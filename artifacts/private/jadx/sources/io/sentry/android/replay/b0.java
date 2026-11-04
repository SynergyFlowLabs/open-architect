package io.sentry.android.replay;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f304698a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f304699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f0 f304700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final f0 f304701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f304702e;

    @SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/WindowManagerSpy$mViewsField$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
    static final class a extends l0 implements Function0<Field> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f304703a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Field invoke() throws NoSuchFieldException {
            Class clsC = b0.f304698a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    static final class b extends l0 implements Function0<Class<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f304704a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    static final class c extends l0 implements Function0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f304705a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class clsC = b0.f304698a.c();
            if (clsC == null || (method = clsC.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        j0 j0Var = j0.NONE;
        f304699b = g0.b(j0Var, b.f304704a);
        f304700c = g0.b(j0Var, c.f304705a);
        f304701d = g0.b(j0Var, a.f304703a);
        f304702e = 8;
    }

    private b0() {
    }

    private final Field b() {
        return (Field) f304701d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> c() {
        return (Class) f304699b.getValue();
    }

    private final Object d() {
        return f304700c.getValue();
    }

    @e.a({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void e(@NotNull Function1<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field fieldB;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object objD = d();
            if (objD == null || (fieldB = f304698a.b()) == null) {
                return;
            }
            Object obj = fieldB.get(objD);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            fieldB.set(objD, swap.invoke((ArrayList) obj));
        } catch (Throwable unused) {
        }
    }
}

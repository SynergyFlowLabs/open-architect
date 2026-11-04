package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.w0;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f76411a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f76412b = g0.c(e.f76417a);

    static final class a extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f76413a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f76413a = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:15:0x006c  */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z10;
            o oVar = o.f76411a;
            Class clsL = oVar.l(this.f76413a);
            Method getBoundsMethod = clsL.getMethod("getBounds", null);
            Method getTypeMethod = clsL.getMethod("getType", null);
            Method getStateMethod = clsL.getMethod("getState", null);
            Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
            if (oVar.k(getBoundsMethod, j1.d(Rect.class)) && oVar.o(getBoundsMethod)) {
                Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (oVar.k(getTypeMethod, j1.d(cls)) && oVar.o(getTypeMethod)) {
                    Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                    if (oVar.k(getStateMethod, j1.d(cls)) && oVar.o(getStateMethod)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f76414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f76414a = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:7:0x003a  */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z10;
            o oVar = o.f76411a;
            Method getWindowLayoutComponentMethod = oVar.t(this.f76414a).getMethod("getWindowLayoutComponent", null);
            Class windowLayoutComponentClass = oVar.v(this.f76414a);
            Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (oVar.o(getWindowLayoutComponentMethod)) {
                Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
                if (oVar.j(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f76415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f76415a = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:7:0x0042  */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z10;
            o oVar = o.f76411a;
            Class clsV = oVar.v(this.f76415a);
            Method addListenerMethod = clsV.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method removeListenerMethod = clsV.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
            if (oVar.o(addListenerMethod)) {
                Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                if (oVar.o(removeListenerMethod)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class d extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f76416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f76416a = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() throws NoSuchMethodException {
            o oVar = o.f76411a;
            Method getWindowExtensionsMethod = oVar.u(this.f76416a).getDeclaredMethod("getWindowExtensions", null);
            Class windowExtensionsClass = oVar.t(this.f76416a);
            Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
            return Boolean.valueOf(oVar.j(getWindowExtensionsMethod, windowExtensionsClass) && oVar.o(getWindowExtensionsMethod));
        }
    }

    static final class e extends l0 implements Function0<WindowLayoutComponent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f76417a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = o.class.getClassLoader();
            if (classLoader == null || !o.f76411a.i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        return r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(Method method, kotlin.reflect.d<?> dVar) {
        return j(method, oj.b.e(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    @w0(24)
    private final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    private final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    private final boolean s(Function0<Boolean> function0) {
        try {
            return function0.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @Nullable
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f76412b.getValue();
    }
}

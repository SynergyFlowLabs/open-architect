package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<Class<?>> f52529a = CollectionsKt.listOf((Object[]) new Class[]{Application.class, l1.class});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final List<Class<?>> f52530b = CollectionsKt.listOf(l1.class);

    @Nullable
    public static final <T> Constructor<T> c(@NotNull Class<T> modelClass, @NotNull List<? extends Class<?>> signature) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Iterator itA = kotlin.jvm.internal.i.a(modelClass.getConstructors());
        while (itA.hasNext()) {
            Constructor<T> constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            List list = ArraysKt.toList(parameterTypes);
            if (Intrinsics.areEqual(signature, list)) {
                Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == list.size() && list.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends f2> T d(@NotNull Class<T> modelClass, @NotNull Constructor<T> constructor, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}

package androidx.savedstate.serialization;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class q<T> implements kotlin.properties.f<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.j f75212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f75213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f75214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f75215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<T> f75216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f75217f;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull androidx.savedstate.j registry, @NotNull KSerializer<T> serializer, @Nullable String str, @NotNull h configuration, @NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        this.f75212a = registry;
        this.f75213b = serializer;
        this.f75214c = str;
        this.f75215d = configuration;
        this.f75216e = init;
    }

    private final String b(Object obj, kotlin.reflect.o<?> oVar) {
        String str;
        if (obj != null) {
            str = androidx.savedstate.internal.a.a(j1.d(obj.getClass())) + '.';
        } else {
            str = "";
        }
        return str + oVar.getName();
    }

    private final T c(String str) {
        Bundle bundleA = this.f75212a.a(str);
        if (bundleA != null) {
            return (T) k.c(this.f75213b, bundleA, this.f75215d);
        }
        return null;
    }

    private final void d(String str) {
        this.f75212a.d(str, new androidx.savedstate.j.b() { // from class: androidx.savedstate.serialization.p
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return q.e(this.f75211a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(q qVar) {
        KSerializer<T> kSerializer = qVar.f75213b;
        Object obj = qVar.f75217f;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            obj = Unit.f312394a;
        }
        return n.c(kSerializer, obj, qVar.f75215d);
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f75217f == null) {
            String strB = this.f75214c;
            if (strB == null) {
                strB = b(obj, property);
            }
            d(strB);
            T tC = c(strB);
            if (tC == null) {
                tC = this.f75216e.invoke();
            }
            this.f75217f = tC;
        }
        T t10 = this.f75217f;
        if (t10 != null) {
            return t10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return (T) Unit.f312394a;
    }

    @Override // kotlin.properties.f
    public void setValue(@Nullable Object obj, @NotNull kotlin.reflect.o<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f75217f == null) {
            String strB = this.f75214c;
            if (strB == null) {
                strB = b(obj, property);
            }
            d(strB);
        }
        this.f75217f = value;
    }
}

package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.lifecycle.l1;
import androidx.savedstate.j;
import androidx.savedstate.serialization.h;
import androidx.savedstate.serialization.k;
import androidx.savedstate.serialization.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.properties.f;
import kotlin.reflect.o;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class b<T> implements f<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l1 f52508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f52509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f52510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f52511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<T> f52512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f52513f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull l1 savedStateHandle, @NotNull KSerializer<T> serializer, @Nullable String str, @NotNull h configuration, @NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        this.f52508a = savedStateHandle;
        this.f52509b = serializer;
        this.f52510c = str;
        this.f52511d = configuration;
        this.f52512e = init;
    }

    private final String b(Object obj, o<?> oVar) {
        String str;
        if (obj != null) {
            str = k2.a.a(j1.d(obj.getClass())) + '.';
        } else {
            str = "";
        }
        return str + oVar.getName();
    }

    private final T c(String str) {
        Bundle bundle = (Bundle) this.f52508a.e(str);
        if (bundle != null) {
            return (T) k.c(this.f52509b, bundle, this.f52511d);
        }
        return null;
    }

    private final void d(String str) {
        this.f52508a.o(str, new j.b() { // from class: androidx.lifecycle.serialization.a
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return b.e(this.f52507a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(b bVar) {
        KSerializer<T> kSerializer = bVar.f52509b;
        Object obj = bVar.f52513f;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            obj = Unit.f312394a;
        }
        return n.c(kSerializer, obj, bVar.f52511d);
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f52513f == null) {
            String strB = this.f52510c;
            if (strB == null) {
                strB = b(obj, property);
            }
            d(strB);
            T tC = c(strB);
            if (tC == null) {
                tC = this.f52512e.invoke();
            }
            this.f52513f = tC;
        }
        T t10 = this.f52513f;
        if (t10 != null) {
            return t10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return (T) Unit.f312394a;
    }

    @Override // kotlin.properties.f
    public void setValue(@Nullable Object obj, @NotNull o<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f52513f == null) {
            String strB = this.f52510c;
            if (strB == null) {
                strB = b(obj, property);
            }
            d(strB);
        }
        this.f52513f = value;
    }
}

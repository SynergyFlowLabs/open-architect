package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class b<T> implements f<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private T f312876a;

    @Override // kotlin.properties.f, kotlin.properties.e
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t10 = this.f312876a;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.f
    public void setValue(@Nullable Object obj, @NotNull o<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f312876a = value;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotNullProperty(");
        if (this.f312876a != null) {
            str = "value=" + this.f312876a;
        } else {
            str = "value not initialized yet";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}

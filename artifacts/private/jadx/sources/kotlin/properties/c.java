package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c<V> implements f<Object, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V f312877a;

    public c(V v10) {
        this.f312877a = v10;
    }

    protected void a(@NotNull o<?> property, V v10, V v11) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean b(@NotNull o<?> property, V v10, V v11) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    public V getValue(@Nullable Object obj, @NotNull o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f312877a;
    }

    @Override // kotlin.properties.f
    public void setValue(@Nullable Object obj, @NotNull o<?> property, V v10) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v11 = this.f312877a;
        if (b(property, v11, v10)) {
            this.f312877a = v10;
            a(property, v11, v10);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.f312877a + ')';
    }
}

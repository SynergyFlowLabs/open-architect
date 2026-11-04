package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.s
final class a implements GenericArrayType, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f312974a;

    public a(@NotNull Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f312974a = elementType;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.f312974a;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.x
    @NotNull
    public String getTypeName() {
        return a0.j(this.f312974a) + okhttp3.v.f334777p;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}

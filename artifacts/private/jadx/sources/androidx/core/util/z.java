package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"UnknownNullness"})
public interface z<T> {
    static /* synthetic */ boolean a(z zVar, Object obj) {
        return !zVar.test(obj);
    }

    static /* synthetic */ boolean b(z zVar, z zVar2, Object obj) {
        return zVar.test(obj) && zVar2.test(obj);
    }

    @e.a({"MissingNullability"})
    static <T> z<T> c(@e.a({"MissingNullability"}) z<? super T> zVar) {
        Objects.requireNonNull(zVar);
        return zVar.negate();
    }

    static /* synthetic */ boolean e(z zVar, z zVar2, Object obj) {
        return zVar.test(obj) || zVar2.test(obj);
    }

    @e.a({"MissingNullability"})
    static <T> z<T> isEqual(@e.a({"MissingNullability"}) final Object obj) {
        return obj == null ? new z() { // from class: androidx.core.util.v
            @Override // androidx.core.util.z
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new z() { // from class: androidx.core.util.w
            @Override // androidx.core.util.z
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    @e.a({"MissingNullability"})
    default z<T> g(@e.a({"MissingNullability"}) final z<? super T> zVar) {
        Objects.requireNonNull(zVar);
        return new z() { // from class: androidx.core.util.x
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return z.b(this.f48445a, zVar, obj);
            }
        };
    }

    @e.a({"MissingNullability"})
    default z<T> h(@e.a({"MissingNullability"}) final z<? super T> zVar) {
        Objects.requireNonNull(zVar);
        return new z() { // from class: androidx.core.util.u
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return z.e(this.f48442a, zVar, obj);
            }
        };
    }

    @e.a({"MissingNullability"})
    default z<T> negate() {
        return new z() { // from class: androidx.core.util.y
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return z.a(this.f48447a, obj);
            }
        };
    }

    boolean test(T t10);
}

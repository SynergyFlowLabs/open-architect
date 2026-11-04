package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class b1 implements kotlin.reflect.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.s f315895a;

    public b1(@NotNull kotlin.reflect.s origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f315895a = origin;
    }

    @Override // kotlin.reflect.s
    public boolean A() {
        return this.f315895a.A();
    }

    @Override // kotlin.reflect.s
    @Nullable
    public kotlin.reflect.g J() {
        return this.f315895a.J();
    }

    @Override // kotlin.reflect.s
    @NotNull
    public List<KTypeProjection> d() {
        return this.f315895a.d();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        kotlin.reflect.s sVar = this.f315895a;
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        if (!Intrinsics.areEqual(sVar, b1Var != null ? b1Var.f315895a : null)) {
            return false;
        }
        kotlin.reflect.g gVarJ = J();
        if (gVarJ instanceof kotlin.reflect.d) {
            kotlin.reflect.s sVar2 = obj instanceof kotlin.reflect.s ? (kotlin.reflect.s) obj : null;
            kotlin.reflect.g gVarJ2 = sVar2 != null ? sVar2.J() : null;
            if (gVarJ2 != null && (gVarJ2 instanceof kotlin.reflect.d)) {
                return Intrinsics.areEqual(oj.b.e((kotlin.reflect.d) gVarJ), oj.b.e((kotlin.reflect.d) gVarJ2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f315895a.getAnnotations();
    }

    public int hashCode() {
        return this.f315895a.hashCode();
    }

    @NotNull
    public String toString() {
        return "KTypeWrapper: " + this.f315895a;
    }
}

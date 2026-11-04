package io.ktor.client.request.forms;

import io.ktor.http.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f295295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v0 f295296c;

    public q(@NotNull String key, @NotNull T value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f295294a = key;
        this.f295295b = value;
        this.f295296c = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q e(q qVar, String str, Object obj, v0 v0Var, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = qVar.f295294a;
        }
        if ((i10 & 2) != 0) {
            obj = qVar.f295295b;
        }
        if ((i10 & 4) != 0) {
            v0Var = qVar.f295296c;
        }
        return qVar.d(str, obj, v0Var);
    }

    @NotNull
    public final String a() {
        return this.f295294a;
    }

    @NotNull
    public final T b() {
        return this.f295295b;
    }

    @NotNull
    public final v0 c() {
        return this.f295296c;
    }

    @NotNull
    public final q<T> d(@NotNull String key, @NotNull T value, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new q<>(key, value, headers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f295294a, qVar.f295294a) && Intrinsics.areEqual(this.f295295b, qVar.f295295b) && Intrinsics.areEqual(this.f295296c, qVar.f295296c);
    }

    @NotNull
    public final v0 f() {
        return this.f295296c;
    }

    @NotNull
    public final String g() {
        return this.f295294a;
    }

    @NotNull
    public final T h() {
        return this.f295295b;
    }

    public int hashCode() {
        return (((this.f295294a.hashCode() * 31) + this.f295295b.hashCode()) * 31) + this.f295296c.hashCode();
    }

    @NotNull
    public String toString() {
        return "FormPart(key=" + this.f295294a + ", value=" + this.f295295b + ", headers=" + this.f295296c + ')';
    }

    public /* synthetic */ q(String str, Object obj, v0 v0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i10 & 4) != 0 ? v0.f296123a.b() : v0Var);
    }
}

package h0;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f280065c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f280066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f280067b;

    public a(@Nullable Object obj, @Nullable Object obj2) {
        this.f280066a = obj;
        this.f280067b = obj2;
    }

    public final boolean a() {
        return this.f280067b != i0.c.f286699a;
    }

    public final boolean b() {
        return this.f280066a != i0.c.f286699a;
    }

    @Nullable
    public final Object c() {
        return this.f280067b;
    }

    @Nullable
    public final Object d() {
        return this.f280066a;
    }

    @NotNull
    public final a e(@Nullable Object obj) {
        return new a(this.f280066a, obj);
    }

    @NotNull
    public final a f(@Nullable Object obj) {
        return new a(obj, this.f280067b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        i0.c cVar = i0.c.f286699a;
        this(cVar, cVar);
    }

    public a(@Nullable Object obj) {
        this(obj, i0.c.f286699a);
    }
}

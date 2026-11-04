package coil.request;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f87750b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final s f87751c = new s(MapsKt.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, Object> f87752a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final s a(@NotNull Map<Class<?>, ? extends Object> map) {
            return new s(coil.util.c.h(map), null);
        }

        private a() {
        }
    }

    public /* synthetic */ s(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @oj.n
    @NotNull
    public static final s b(@NotNull Map<Class<?>, ? extends Object> map) {
        return f87750b.a(map);
    }

    @NotNull
    public final Map<Class<?>, Object> a() {
        return this.f87752a;
    }

    public final /* synthetic */ <T> T c() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) d(Object.class);
    }

    @Nullable
    public final <T> T d(@NotNull Class<? extends T> cls) {
        return cls.cast(this.f87752a.get(cls));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.areEqual(this.f87752a, ((s) obj).f87752a);
    }

    public int hashCode() {
        return this.f87752a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Tags(tags=" + this.f87752a + ')';
    }

    private s(Map<Class<?>, ? extends Object> map) {
        this.f87752a = map;
    }
}

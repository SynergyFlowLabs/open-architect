package v2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2518a f381325b = new C2518a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<c<?>, Object> f381326a = new LinkedHashMap();

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    public static final class C2518a {

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: v2.a$a$a, reason: collision with other inner class name */
        public static final class C2519a<T> implements c<T> {
        }

        public /* synthetic */ C2518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        public final /* synthetic */ <T> c<T> a() {
            Intrinsics.needClassReification();
            return new C2519a();
        }

        private C2518a() {
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f381327c = new b();

        private b() {
        }

        @Override // v2.a
        @Nullable
        public <T> T a(@NotNull c<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public interface c<T> {
    }

    @Nullable
    public abstract <T> T a(@NotNull c<T> cVar);

    @NotNull
    public final Map<c<?>, Object> b() {
        return this.f381326a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof a) && Intrinsics.areEqual(this.f381326a, ((a) obj).f381326a);
    }

    public int hashCode() {
        return this.f381326a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CreationExtras(extras=" + this.f381326a + ')';
    }
}

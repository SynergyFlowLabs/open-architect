package w;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f385794c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f385800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2522a f385793b = new C2522a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f385795d = new a("text/*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f385796e = new a("text/plain");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final a f385797f = new a("text/html");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a f385798g = new a("image/*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f385799h = new a("*/*");

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    public static final class C2522a {
        public /* synthetic */ C2522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            return a.f385799h;
        }

        @NotNull
        public final a b() {
            return a.f385797f;
        }

        @NotNull
        public final a c() {
            return a.f385798g;
        }

        @NotNull
        public final a d() {
            return a.f385796e;
        }

        @NotNull
        public final a e() {
            return a.f385795d;
        }

        private C2522a() {
        }
    }

    public a(@NotNull String str) {
        this.f385800a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f385800a, ((a) obj).f385800a);
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f385800a;
    }

    public int hashCode() {
        return this.f385800a.hashCode();
    }

    @NotNull
    public String toString() {
        return "MediaType(representation='" + this.f385800a + "')";
    }
}

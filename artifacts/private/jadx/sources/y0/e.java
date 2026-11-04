package y0;

import androidx.compose.runtime.o2;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f390671b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f390672c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Locale f390673a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e a() {
            return h.a().a().k(0);
        }

        private a() {
        }
    }

    public e(@NotNull Locale locale) {
        this.f390673a = locale;
    }

    @NotNull
    public final String a() {
        return i.a(this.f390673a);
    }

    @NotNull
    public final Locale b() {
        return this.f390673a;
    }

    @NotNull
    public final String c() {
        return i.c(this.f390673a);
    }

    @NotNull
    public final String d() {
        return i.d(this.f390673a);
    }

    @NotNull
    public final String e() {
        return i.b(this.f390673a);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(e(), ((e) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @NotNull
    public String toString() {
        return e();
    }

    public e(@NotNull String str) {
        this(h.a().b(str));
    }
}

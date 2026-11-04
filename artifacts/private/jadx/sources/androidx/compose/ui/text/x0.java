package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42337d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f42336c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final x0 f42338e = new x0();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final x0 a() {
            return x0.f42338e;
        }

        private a() {
        }
    }

    public /* synthetic */ x0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ void d() {
    }

    public final int b() {
        return this.f42340b;
    }

    public final boolean c() {
        return this.f42339a;
    }

    @NotNull
    public final x0 e(@Nullable x0 x0Var) {
        return x0Var == null ? this : x0Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f42339a == x0Var.f42339a && u.g(this.f42340b, x0Var.f42340b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f42339a) * 31) + u.h(this.f42340b);
    }

    @NotNull
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f42339a + ", emojiSupportMatch=" + ((Object) u.i(this.f42340b)) + ')';
    }

    public /* synthetic */ x0(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public x0(boolean z10) {
        this.f42339a = z10;
        this.f42340b = u.f42278b.b();
    }

    public /* synthetic */ x0(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public /* synthetic */ x0(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? u.f42278b.b() : i10, (i11 & 2) != 0 ? false : z10, (DefaultConstructorMarker) null);
    }

    private x0(int i10, boolean z10) {
        this.f42339a = z10;
        this.f42340b = i10;
    }

    private x0(int i10) {
        this.f42339a = false;
        this.f42340b = i10;
    }

    public /* synthetic */ x0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? u.f42278b.b() : i10, (DefaultConstructorMarker) null);
    }

    public x0() {
        this(u.f42278b.b(), false, (DefaultConstructorMarker) null);
    }
}

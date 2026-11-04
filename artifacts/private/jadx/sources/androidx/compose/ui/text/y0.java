package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42346b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f42345a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final y0 f42347c = new y0();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final y0 a() {
            return y0.f42347c;
        }

        private a() {
        }
    }

    @NotNull
    public final y0 b(@Nullable y0 y0Var) {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof y0);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlatformSpanStyle()";
    }
}

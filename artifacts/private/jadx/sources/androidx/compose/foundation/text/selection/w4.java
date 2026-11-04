package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class w4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21497c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21499b;

    public /* synthetic */ w4(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a() {
        return this.f21499b;
    }

    public final long b() {
        return this.f21498a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return androidx.compose.ui.graphics.q0.y(this.f21498a, w4Var.f21498a) && androidx.compose.ui.graphics.q0.y(this.f21499b, w4Var.f21499b);
    }

    public int hashCode() {
        return (androidx.compose.ui.graphics.q0.K(this.f21498a) * 31) + androidx.compose.ui.graphics.q0.K(this.f21499b);
    }

    @NotNull
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) androidx.compose.ui.graphics.q0.L(this.f21498a)) + ", selectionBackgroundColor=" + ((Object) androidx.compose.ui.graphics.q0.L(this.f21499b)) + ')';
    }

    private w4(long j10, long j11) {
        this.f21498a = j10;
        this.f21499b = j11;
    }
}

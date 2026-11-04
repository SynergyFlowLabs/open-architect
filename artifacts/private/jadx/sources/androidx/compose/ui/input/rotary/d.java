package androidx.compose.ui.input.rotary;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRotaryScrollEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.android.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39185e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39189d;

    public d(float f10, float f11, long j10, int i10) {
        this.f39186a = f10;
        this.f39187b = f11;
        this.f39188c = j10;
        this.f39189d = i10;
    }

    public final float a() {
        return this.f39187b;
    }

    public final int b() {
        return this.f39189d;
    }

    public final long c() {
        return this.f39188c;
    }

    public final float d() {
        return this.f39186a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f39186a == this.f39186a && dVar.f39187b == this.f39187b && dVar.f39188c == this.f39188c && dVar.f39189d == this.f39189d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f39186a) * 31) + Float.hashCode(this.f39187b)) * 31) + Long.hashCode(this.f39188c)) * 31) + Integer.hashCode(this.f39189d);
    }

    @NotNull
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f39186a + ",horizontalScrollPixels=" + this.f39187b + ",uptimeMillis=" + this.f39188c + ",deviceId=" + this.f39189d + ')';
    }
}

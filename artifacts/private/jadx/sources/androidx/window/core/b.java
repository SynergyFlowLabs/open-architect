package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f76261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f76262d;

    public b(int i10, int i11, int i12, int i13) {
        this.f76259a = i10;
        this.f76260b = i11;
        this.f76261c = i12;
        this.f76262d = i13;
    }

    public final int a() {
        return this.f76262d;
    }

    public final int b() {
        return this.f76262d - this.f76260b;
    }

    public final int c() {
        return this.f76259a;
    }

    public final int d() {
        return this.f76261c;
    }

    public final int e() {
        return this.f76260b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) obj;
        return this.f76259a == bVar.f76259a && this.f76260b == bVar.f76260b && this.f76261c == bVar.f76261c && this.f76262d == bVar.f76262d;
    }

    public final int f() {
        return this.f76261c - this.f76259a;
    }

    public final boolean g() {
        return b() == 0 || f() == 0;
    }

    public final boolean h() {
        return b() == 0 && f() == 0;
    }

    public int hashCode() {
        return (((((this.f76259a * 31) + this.f76260b) * 31) + this.f76261c) * 31) + this.f76262d;
    }

    @NotNull
    public final Rect i() {
        return new Rect(this.f76259a, this.f76260b, this.f76261c, this.f76262d);
    }

    @NotNull
    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.f76259a + AbstractJsonLexerKt.COMMA + this.f76260b + AbstractJsonLexerKt.COMMA + this.f76261c + AbstractJsonLexerKt.COMMA + this.f76262d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}

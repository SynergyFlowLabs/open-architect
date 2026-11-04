package androidx.compose.ui.text.style;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import androidx.compose.ui.unit.a0;
import androidx.compose.ui.unit.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42241d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f42240c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final s f42242e = new s(0, 0, 3, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final s a() {
            return s.f42242e;
        }

        private a() {
        }
    }

    public /* synthetic */ s(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public static /* synthetic */ s c(s sVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sVar.f42243a;
        }
        if ((i10 & 2) != 0) {
            j11 = sVar.f42244b;
        }
        return sVar.b(j10, j11);
    }

    @NotNull
    public final s b(long j10, long j11) {
        return new s(j10, j11, null);
    }

    public final long d() {
        return this.f42243a;
    }

    public final long e() {
        return this.f42244b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return z.j(this.f42243a, sVar.f42243a) && z.j(this.f42244b, sVar.f42244b);
    }

    public int hashCode() {
        return (z.o(this.f42243a) * 31) + z.o(this.f42244b);
    }

    @NotNull
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) z.u(this.f42243a)) + ", restLine=" + ((Object) z.u(this.f42244b)) + ')';
    }

    private s(long j10, long j11) {
        this.f42243a = j10;
        this.f42244b = j11;
    }

    public /* synthetic */ s(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a0.m(0) : j10, (i10 & 2) != 0 ? a0.m(0) : j11, null);
    }
}

package vf;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f385757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f385758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Date f385759c;

    public c(@NotNull b kind, @NotNull String message, @NotNull Date dateTime) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        this.f385757a = kind;
        this.f385758b = message;
        this.f385759c = dateTime;
    }

    public static /* synthetic */ c e(c cVar, b bVar, String str, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = cVar.f385757a;
        }
        if ((i10 & 2) != 0) {
            str = cVar.f385758b;
        }
        if ((i10 & 4) != 0) {
            date = cVar.f385759c;
        }
        return cVar.d(bVar, str, date);
    }

    @NotNull
    public final b a() {
        return this.f385757a;
    }

    @NotNull
    public final String b() {
        return this.f385758b;
    }

    @NotNull
    public final Date c() {
        return this.f385759c;
    }

    @NotNull
    public final c d(@NotNull b kind, @NotNull String message, @NotNull Date dateTime) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return new c(kind, message, dateTime);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f385757a == cVar.f385757a && Intrinsics.areEqual(this.f385758b, cVar.f385758b) && Intrinsics.areEqual(this.f385759c, cVar.f385759c);
    }

    @NotNull
    public final Date f() {
        return this.f385759c;
    }

    @NotNull
    public final b g() {
        return this.f385757a;
    }

    @NotNull
    public final String h() {
        return this.f385758b;
    }

    public int hashCode() {
        return (((this.f385757a.hashCode() * 31) + this.f385758b.hashCode()) * 31) + this.f385759c.hashCode();
    }

    @NotNull
    public String toString() {
        return "LogMessage(kind=" + this.f385757a + ", message=" + this.f385758b + ", dateTime=" + this.f385759c + ')';
    }

    public /* synthetic */ c(b bVar, String str, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, (i10 & 4) != 0 ? new Date() : date);
    }
}

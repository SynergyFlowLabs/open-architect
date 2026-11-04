package eb;

import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f274749d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f274750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f274751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<c> f274752c;

    public d(@NotNull String id2, @NotNull List<b> items, @NotNull List<c> result) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f274750a = id2;
        this.f274751b = items;
        this.f274752c = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d e(d dVar, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.f274750a;
        }
        if ((i10 & 2) != 0) {
            list = dVar.f274751b;
        }
        if ((i10 & 4) != 0) {
            list2 = dVar.f274752c;
        }
        return dVar.d(str, list, list2);
    }

    @NotNull
    public final String a() {
        return this.f274750a;
    }

    @NotNull
    public final List<b> b() {
        return this.f274751b;
    }

    @NotNull
    public final List<c> c() {
        return this.f274752c;
    }

    @NotNull
    public final d d(@NotNull String id2, @NotNull List<b> items, @NotNull List<c> result) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(result, "result");
        return new d(id2, items, result);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f274750a, dVar.f274750a) && Intrinsics.areEqual(this.f274751b, dVar.f274751b) && Intrinsics.areEqual(this.f274752c, dVar.f274752c);
    }

    @NotNull
    public final String f() {
        return this.f274750a;
    }

    @NotNull
    public final List<b> g() {
        return this.f274751b;
    }

    @NotNull
    public final List<c> h() {
        return this.f274752c;
    }

    public int hashCode() {
        return (((this.f274750a.hashCode() * 31) + this.f274751b.hashCode()) * 31) + this.f274752c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ContestVotingTuple(id=" + this.f274750a + ", items=" + this.f274751b + ", result=" + this.f274752c + ")";
    }

    public /* synthetic */ d(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? new ArrayList() : list2);
    }
}

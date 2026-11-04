package androidx.window.embedding;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f76295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<a> f76296b;

    public /* synthetic */ b(Set set, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean a() {
        return this.f76295a;
    }

    @NotNull
    public final Set<a> b() {
        return this.f76296b;
    }

    @NotNull
    public final b c(@NotNull a filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f76296b);
        linkedHashSet.add(filter);
        return new b(CollectionsKt.toSet(linkedHashSet), this.f76295a);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f76296b, bVar.f76296b) && this.f76295a == bVar.f76295a;
    }

    public int hashCode() {
        return (this.f76296b.hashCode() * 31) + Boolean.hashCode(this.f76295a);
    }

    public b(@NotNull Set<a> filters, boolean z10) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f76295a = z10;
        this.f76296b = CollectionsKt.toSet(filters);
    }
}

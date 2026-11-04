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
public final class v extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f76344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f76345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f76346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Set<u> f76347h;

    public /* synthetic */ v(Set set, boolean z10, boolean z11, boolean z12, int i10, int i11, float f10, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? 0 : i10, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0.5f : f10, (i13 & 128) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f76347h, vVar.f76347h) && this.f76344e == vVar.f76344e && this.f76345f == vVar.f76345f && this.f76346g == vVar.f76346g;
    }

    public final boolean f() {
        return this.f76346g;
    }

    @NotNull
    public final Set<u> g() {
        return this.f76347h;
    }

    public final boolean h() {
        return this.f76344e;
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.f76347h.hashCode()) * 31) + Boolean.hashCode(this.f76344e)) * 31) + Boolean.hashCode(this.f76345f)) * 31) + Boolean.hashCode(this.f76346g);
    }

    public final boolean i() {
        return this.f76345f;
    }

    @NotNull
    public final v j(@NotNull u filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f76347h);
        linkedHashSet.add(filter);
        return new v(CollectionsKt.toSet(linkedHashSet), this.f76344e, this.f76345f, this.f76346g, d(), c(), e(), b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Set<u> filters, boolean z10, boolean z11, boolean z12, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f76344e = z10;
        this.f76345f = z11;
        this.f76346g = z12;
        this.f76347h = CollectionsKt.toSet(filters);
    }
}

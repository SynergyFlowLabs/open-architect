package androidx.window.embedding;

import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class w extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Intent f76348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Set<a> f76349f;

    public /* synthetic */ w(Set set, Intent intent, int i10, int i11, float f10, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, intent, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0.5f : f10, (i13 & 32) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && super.equals(obj) && super.equals(obj)) {
            w wVar = (w) obj;
            if (Intrinsics.areEqual(this.f76349f, wVar.f76349f) && Intrinsics.areEqual(this.f76348e, wVar.f76348e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final Set<a> f() {
        return this.f76349f;
    }

    @NotNull
    public final Intent g() {
        return this.f76348e;
    }

    @NotNull
    public final w h(@NotNull a filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f76349f);
        linkedHashSet.add(filter);
        return new w(CollectionsKt.toSet(linkedHashSet), this.f76348e, d(), c(), e(), b());
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f76349f.hashCode()) * 31) + this.f76348e.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull Set<a> filters, @NotNull Intent placeholderIntent, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(placeholderIntent, "placeholderIntent");
        this.f76348e = placeholderIntent;
        this.f76349f = CollectionsKt.toSet(filters);
    }
}

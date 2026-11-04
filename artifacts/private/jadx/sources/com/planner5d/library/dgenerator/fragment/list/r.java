package com.planner5d.library.dgenerator.fragment.list;

import com.planner5d.library.database.model.AutoStyle;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AutoStyle> f160407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f160408b;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r d(r rVar, List list, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rVar.f160407a;
        }
        if ((i10 & 2) != 0) {
            num = rVar.f160408b;
        }
        return rVar.c(list, num);
    }

    @NotNull
    public final List<AutoStyle> a() {
        return this.f160407a;
    }

    @Nullable
    public final Integer b() {
        return this.f160408b;
    }

    @NotNull
    public final r c(@NotNull List<AutoStyle> items, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new r(items, num);
    }

    @Nullable
    public final Integer e() {
        return this.f160408b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f160407a, rVar.f160407a) && Intrinsics.areEqual(this.f160408b, rVar.f160408b);
    }

    @NotNull
    public final List<AutoStyle> f() {
        return this.f160407a;
    }

    public int hashCode() {
        int iHashCode = this.f160407a.hashCode() * 31;
        Integer num = this.f160408b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ListState(items=" + this.f160407a + ", changedItemIndex=" + this.f160408b + ")";
    }

    public r(@NotNull List<AutoStyle> items, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f160407a = items;
        this.f160408b = num;
    }

    public /* synthetic */ r(List list, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? null : num);
    }
}

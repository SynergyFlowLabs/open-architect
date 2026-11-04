package com.planner5d.library.model;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class g<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180735d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.model.j f180736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f180737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<T> f180738c;

    public interface a<T> {
        @NotNull
        g<T> a(@Nullable id.a aVar, @NotNull Folder folder, boolean z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull com.planner5d.library.database.model.j folder, int i10, @NotNull List<? extends T> topItems) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(topItems, "topItems");
        this.f180736a = folder;
        this.f180737b = i10;
        this.f180738c = topItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g e(g gVar, com.planner5d.library.database.model.j jVar, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = gVar.f180736a;
        }
        if ((i11 & 2) != 0) {
            i10 = gVar.f180737b;
        }
        if ((i11 & 4) != 0) {
            list = gVar.f180738c;
        }
        return gVar.d(jVar, i10, list);
    }

    @NotNull
    public final com.planner5d.library.database.model.j a() {
        return this.f180736a;
    }

    public final int b() {
        return this.f180737b;
    }

    @NotNull
    public final List<T> c() {
        return this.f180738c;
    }

    @NotNull
    public final g<T> d(@NotNull com.planner5d.library.database.model.j folder, int i10, @NotNull List<? extends T> topItems) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(topItems, "topItems");
        return new g<>(folder, i10, topItems);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f180736a, gVar.f180736a) && this.f180737b == gVar.f180737b && Intrinsics.areEqual(this.f180738c, gVar.f180738c);
    }

    @NotNull
    public final com.planner5d.library.database.model.j f() {
        return this.f180736a;
    }

    @NotNull
    public final List<T> g() {
        return this.f180738c;
    }

    public final int h() {
        return this.f180737b;
    }

    public int hashCode() {
        return (((this.f180736a.hashCode() * 31) + Integer.hashCode(this.f180737b)) * 31) + this.f180738c.hashCode();
    }

    @NotNull
    public String toString() {
        return "FolderForList(folder=" + this.f180736a + ", totalItems=" + this.f180737b + ", topItems=" + this.f180738c + ")";
    }

    public /* synthetic */ g(com.planner5d.library.database.model.j jVar, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, i10, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}

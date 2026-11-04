package ze;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f413496e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Project f413497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ItemProject f413498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Item f413499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f413500d;

    public b(@NotNull Project project, @NotNull ItemProject itemProject, @NotNull Item item, boolean z10) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f413497a = project;
        this.f413498b = itemProject;
        this.f413499c = item;
        this.f413500d = z10;
    }

    public static /* synthetic */ b f(b bVar, Project project, ItemProject itemProject, Item item, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            project = bVar.f413497a;
        }
        if ((i10 & 2) != 0) {
            itemProject = bVar.f413498b;
        }
        if ((i10 & 4) != 0) {
            item = bVar.f413499c;
        }
        if ((i10 & 8) != 0) {
            z10 = bVar.f413500d;
        }
        return bVar.e(project, itemProject, item, z10);
    }

    @NotNull
    public final Project a() {
        return this.f413497a;
    }

    @NotNull
    public final ItemProject b() {
        return this.f413498b;
    }

    @NotNull
    public final Item c() {
        return this.f413499c;
    }

    public final boolean d() {
        return this.f413500d;
    }

    @NotNull
    public final b e(@NotNull Project project, @NotNull ItemProject itemProject, @NotNull Item item, boolean z10) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        Intrinsics.checkNotNullParameter(item, "item");
        return new b(project, itemProject, item, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f413497a, bVar.f413497a) && Intrinsics.areEqual(this.f413498b, bVar.f413498b) && Intrinsics.areEqual(this.f413499c, bVar.f413499c) && this.f413500d == bVar.f413500d;
    }

    public final boolean g() {
        return this.f413500d;
    }

    @NotNull
    public final Item h() {
        return this.f413499c;
    }

    public int hashCode() {
        return (((((this.f413497a.hashCode() * 31) + this.f413498b.hashCode()) * 31) + this.f413499c.hashCode()) * 31) + Boolean.hashCode(this.f413500d);
    }

    @NotNull
    public final ItemProject i() {
        return this.f413498b;
    }

    @NotNull
    public final Project j() {
        return this.f413497a;
    }

    @NotNull
    public String toString() {
        return "SelectedItem(project=" + this.f413497a + ", itemProject=" + this.f413498b + ", item=" + this.f413499c + ", in3D=" + this.f413500d + ")";
    }

    public /* synthetic */ b(Project project, ItemProject itemProject, Item item, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(project, itemProject, item, (i10 & 8) != 0 ? false : z10);
    }
}

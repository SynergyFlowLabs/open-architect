package wc;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.catalog.CatalogItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f390562g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] f390563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f390564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<Integer, com.planner5d.library.services.bitmaploader.target.a, Unit> f390565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<CatalogItem, com.planner5d.library.services.bitmaploader.target.a, Unit> f390566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f390567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f390568f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] items, boolean z10, @NotNull Function2<? super Integer, ? super com.planner5d.library.services.bitmaploader.target.a, Unit> categoryIconProvider, @NotNull Function2<? super CatalogItem, ? super com.planner5d.library.services.bitmaploader.target.a, Unit> itemIconProvider, @NotNull String[] userFreeModels, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(categoryIconProvider, "categoryIconProvider");
        Intrinsics.checkNotNullParameter(itemIconProvider, "itemIconProvider");
        Intrinsics.checkNotNullParameter(userFreeModels, "userFreeModels");
        this.f390563a = items;
        this.f390564b = z10;
        this.f390565c = categoryIconProvider;
        this.f390566d = itemIconProvider;
        this.f390567e = userFreeModels;
        this.f390568f = z11;
    }

    @NotNull
    public final Function2<Integer, com.planner5d.library.services.bitmaploader.target.a, Unit> a() {
        return this.f390565c;
    }

    public final boolean b() {
        return this.f390564b;
    }

    @NotNull
    public final Function2<CatalogItem, com.planner5d.library.services.bitmaploader.target.a, Unit> c() {
        return this.f390566d;
    }

    @NotNull
    public final com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] d() {
        return this.f390563a;
    }

    public final boolean e() {
        return this.f390568f;
    }

    @NotNull
    public final String[] f() {
        return this.f390567e;
    }
}

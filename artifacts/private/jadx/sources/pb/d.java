package pb;

import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f340837a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<qb.a> f340838b = new LinkedHashSet();

    public final void a() {
        this.f340837a.clear();
        this.f340838b.clear();
    }

    public final void b(float f10, @NotNull k start, @NotNull k end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f340837a.add(new a(new com.planner5d.library.math.c(start, end), f10));
    }

    @NotNull
    public final Set<qb.a> c() {
        return this.f340838b;
    }

    @NotNull
    public final List<a> d() {
        return this.f340837a;
    }

    public final void e(@NotNull qb.a item, boolean z10) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (z10) {
            this.f340838b.add(item);
        } else {
            this.f340838b.remove(item);
        }
    }
}

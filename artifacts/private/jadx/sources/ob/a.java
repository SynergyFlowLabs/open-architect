package ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qb.g;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<g> f333610a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<qb.a> f333611b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f333612c;

    @Override // ob.c
    @NotNull
    public List<g> a() {
        return this.f333610a;
    }

    @Override // ob.c
    @NotNull
    public List<qb.a> b() {
        return this.f333611b;
    }

    @Override // ob.c
    public boolean c() {
        return this.f333612c;
    }

    public final boolean d() {
        return this.f333612c;
    }

    public final void e(boolean z10) {
        this.f333612c = z10;
    }

    public final void f(@NotNull List<? extends qb.a> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f333610a.clear();
        this.f333611b.clear();
        for (qb.a aVar : items) {
            if (aVar instanceof g) {
                this.f333610a.add((g) aVar);
            } else {
                this.f333611b.add(aVar);
            }
        }
    }
}

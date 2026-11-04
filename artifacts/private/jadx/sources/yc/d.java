package yc;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yc.b;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nListItemWithBlocker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemWithBlocker.kt\ncom/planner5d/library/model/listitem/ListItemWithBlocker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final class d<T extends b> implements b, b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f395370c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f395371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f395372b;

    public d(@NotNull T item, boolean z10) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f395371a = item;
        this.f395372b = z10;
    }

    private final d<?> b(Object obj) {
        if (!Intrinsics.areEqual(obj != null ? obj.getClass() : null, d.class)) {
            return null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.planner5d.library.model.listitem.ListItemWithBlocker<*>");
        return (d) obj;
    }

    @Override // com.planner5d.library.widget.b0
    public boolean a() {
        return this.f395372b;
    }

    @NotNull
    public final T c() {
        return this.f395371a;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        d<?> dVarB;
        return this == obj || ((dVarB = b(obj)) != null && dVarB.a() == a() && Intrinsics.areEqual(dVarB.f395371a, this.f395371a));
    }

    public int hashCode() {
        return (this.f395371a.hashCode() * 31) + Boolean.hashCode(a());
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        d<?> dVarB;
        T t10;
        return this == obj || !((dVarB = b(obj)) == null || (t10 = dVarB.f395371a) == null || !t10.n(this.f395371a));
    }
}

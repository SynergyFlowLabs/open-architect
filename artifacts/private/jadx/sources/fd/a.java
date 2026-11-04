package fd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nOrderList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderList.kt\ncom/planner5d/library/model/payments/OrderList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,29:1\n1#2:30\n37#3,2:31\n*S KotlinDebug\n*F\n+ 1 OrderList.kt\ncom/planner5d/library/model/payments/OrderList\n*L\n27#1:31,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.model.payments.a> f275110a;

    public a() {
        this.f275110a = new ArrayList();
    }

    public final void a(@NotNull com.planner5d.library.model.payments.a order) {
        Intrinsics.checkNotNullParameter(order, "order");
        if (this.f275110a.contains(order)) {
            return;
        }
        this.f275110a.add(order);
    }

    public final void b(@NotNull Collection<com.planner5d.library.model.payments.a> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f275110a.addAll(collection);
    }

    public final void c(@NotNull com.planner5d.library.model.payments.a[] list) {
        Intrinsics.checkNotNullParameter(list, "list");
        CollectionsKt.addAll(this.f275110a, list);
    }

    @Nullable
    public final com.planner5d.library.model.payments.a d(@NotNull com.planner5d.library.model.payments.a order) {
        Object next;
        Intrinsics.checkNotNullParameter(order, "order");
        Iterator<T> it = this.f275110a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual((com.planner5d.library.model.payments.a) next, order)) {
                return (com.planner5d.library.model.payments.a) next;
            }
        }
        next = null;
        return (com.planner5d.library.model.payments.a) next;
    }

    @NotNull
    public final List<com.planner5d.library.model.payments.a> e() {
        return this.f275110a;
    }

    @NotNull
    public final com.planner5d.library.model.payments.a[] f() {
        return (com.planner5d.library.model.payments.a[]) this.f275110a.toArray(new com.planner5d.library.model.payments.a[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Collection<com.planner5d.library.model.payments.a> collection) {
        this();
        Intrinsics.checkNotNullParameter(collection, "collection");
        b(collection);
    }
}

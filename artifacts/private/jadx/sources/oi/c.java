package oi;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f333642b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b> f333643a;

    public static final class a implements CoroutineContext.b<c> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c N(c cVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = cVar.f333643a;
        }
        return cVar.j(list);
    }

    @NotNull
    public final List<b> T() {
        return this.f333643a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f333643a, ((c) obj).f333643a);
    }

    @NotNull
    public final List<b> h() {
        return this.f333643a;
    }

    public int hashCode() {
        return this.f333643a.hashCode();
    }

    @NotNull
    public final c j(@NotNull List<b> eventOrder) {
        Intrinsics.checkNotNullParameter(eventOrder, "eventOrder");
        return new c(eventOrder);
    }

    @NotNull
    public String toString() {
        return "PluginsTrace(" + CollectionsKt.joinToString$default(this.f333643a, null, null, null, 0, null, null, 63, null) + ')';
    }

    public /* synthetic */ c(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull List<b> eventOrder) {
        super(f333642b);
        Intrinsics.checkNotNullParameter(eventOrder, "eventOrder");
        this.f333643a = eventOrder;
    }
}

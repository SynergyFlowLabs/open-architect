package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d3<T> extends q1<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final q1<T> f71814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f71815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f71816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(@NotNull q1<T> pagedList) {
        super(pagedList.L(), pagedList.C(), pagedList.K(), pagedList.R().N(), pagedList.B());
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        this.f71814k = pagedList;
        this.f71815l = true;
        this.f71816m = true;
    }

    @Override // androidx.paging.q1
    @Nullable
    public Object G() {
        return this.f71814k.G();
    }

    @Override // androidx.paging.q1
    public boolean S() {
        return this.f71816m;
    }

    @Override // androidx.paging.q1
    public boolean T() {
        return this.f71815l;
    }

    @Override // androidx.paging.q1
    public void W(int i10) {
    }

    @Override // androidx.paging.q1
    public void v() {
    }

    @Override // androidx.paging.q1
    public void w(@NotNull Function2<? super a1, ? super x0, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}

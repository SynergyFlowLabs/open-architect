package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDimensionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimensionsAdapter.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/DimensionsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1#2:94\n1872#3,3:95\n*S KotlinDebug\n*F\n+ 1 DimensionsAdapter.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/DimensionsAdapter\n*L\n47#1:95,3\n*E\n"})
public final class p extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135540d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private List<w> f135541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f135542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<f> f135543c;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f135541a.size();
    }

    @NotNull
    public final int[] h() {
        int itemCount = getItemCount();
        int[] iArr = new int[itemCount];
        for (int i10 = 0; i10 < itemCount; i10++) {
            iArr[i10] = this.f135541a.get(i10).b();
        }
        return iArr;
    }

    @e.a({"NotifyDataSetChanged"})
    public final void i(@NotNull List<w> walls, @NotNull x listener) {
        Intrinsics.checkNotNullParameter(walls, "walls");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f135541a.clear();
        this.f135541a.addAll(walls);
        this.f135542b = listener;
        notifyDataSetChanged();
    }

    @e.a({"NotifyDataSetChanged"})
    public final void j(@Nullable int[] iArr) {
        if (iArr != null && iArr.length == getItemCount()) {
            int i10 = 0;
            for (Object obj : this.f135541a) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                w wVar = (w) obj;
                wVar.h(iArr[i10]);
                x xVar = this.f135542b;
                if (xVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(z.a.f106673a);
                    xVar = null;
                }
                xVar.a(iArr[i10], wVar, true);
                i10 = i11;
            }
            notifyDataSetChanged();
        }
    }

    public final void k(int i10, @NotNull w wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        if (i10 < 0 || i10 >= this.f135541a.size()) {
            return;
        }
        this.f135541a.set(i10, wall);
        notifyItemChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        b bVar = (b) holder;
        w wVar = this.f135541a.get(i10);
        x xVar = this.f135542b;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(z.a.f106673a);
            xVar = null;
        }
        bVar.j(wVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f fVar = new f(context, null, 0, 6, null);
        this.f135543c.add(fVar);
        return new b(fVar, this.f135543c);
    }

    public /* synthetic */ p(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    public p(@NotNull List<w> walls) {
        Intrinsics.checkNotNullParameter(walls, "walls");
        this.f135541a = walls;
        this.f135543c = new ArrayList();
    }
}

package com.planner5d.library.services.utility;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class j2 extends k3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.s0
    private final int f225287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f225288e;

    public j2(@androidx.annotation.s0 int i10, int i11) {
        super(0, new Object[0]);
        this.f225287d = i10;
        this.f225288e = i11;
        h(null);
    }

    @Override // com.planner5d.library.services.utility.k3
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        j2 j2Var = obj instanceof j2 ? (j2) obj : null;
        return j2Var != null && Intrinsics.areEqual(b(), j2Var.b()) && this.f225287d == j2Var.f225287d && Arrays.equals(a(), j2Var.a());
    }

    @Override // com.planner5d.library.services.utility.k3
    public int hashCode() {
        String strB = b();
        return ((((strB != null ? strB.hashCode() : 0) * 31) + this.f225287d) * 31) + Arrays.hashCode(a());
    }

    @Override // com.planner5d.library.services.utility.k3
    @NotNull
    public CharSequence i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strB = b();
        if (strB != null) {
            return strB;
        }
        Resources resources = context.getResources();
        int i10 = this.f225287d;
        int i11 = this.f225288e;
        String quantityString = resources.getQuantityString(i10, i11, Integer.valueOf(i11));
        h(quantityString);
        return quantityString;
    }
}

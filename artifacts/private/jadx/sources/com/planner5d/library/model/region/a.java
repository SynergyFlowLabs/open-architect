package com.planner5d.library.model.region;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
public final class a implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222774b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e0[] f222775a;

    public a(@NotNull e0... providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f222775a = providers;
    }

    @Override // com.planner5d.library.services.e0
    @Nullable
    public String a() {
        for (e0 e0Var : this.f222775a) {
            String strA = e0Var.a();
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }
}

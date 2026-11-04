package com.planner5d.library.spaces.view.survey.style;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class l extends f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230624b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.a f230625a;

    @ij.a
    public l(@NotNull com.planner5d.library.spaces.data.a addressRepository) {
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        this.f230625a = addressRepository;
    }

    @Nullable
    public final SpacesProjectData U() {
        return this.f230625a.r();
    }

    public final boolean V() {
        return this.f230625a.t();
    }

    @NotNull
    public final SpacesProjectData W() {
        return this.f230625a.w();
    }
}

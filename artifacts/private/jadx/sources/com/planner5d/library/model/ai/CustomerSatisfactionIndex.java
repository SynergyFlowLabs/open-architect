package com.planner5d.library.model.ai;

import androidx.compose.runtime.internal.w0;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@Table(name = "customer_satisfaction_index")
public final class CustomerSatisfactionIndex extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f180556a = 8;

    @Column(index = true, name = "project_external_id")
    @Nullable
    private Long projectExternalId;

    @Column(name = "rated")
    @Nullable
    private Boolean rated;

    @Nullable
    public final Long s() {
        return this.projectExternalId;
    }

    @Nullable
    public final Boolean u() {
        return this.rated;
    }

    public final boolean v() {
        return Intrinsics.areEqual(this.rated, Boolean.TRUE);
    }

    public final void w(@Nullable Long l10) {
        this.projectExternalId = l10;
    }

    public final void x(@Nullable Boolean bool) {
        this.rated = bool;
    }
}

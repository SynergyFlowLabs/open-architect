package com.planner5d.library.contest.helper;

import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.synchronization.k;
import com.planner5d.library.services.m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f153306b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f153307a;

    @ij.a
    public e(@NotNull k synchronizationManager) {
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        this.f153307a = synchronizationManager;
    }

    @m1
    public final void a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (new j(uri).c() != null) {
            this.f153307a.a();
            m0.f224432e.t();
        }
    }
}

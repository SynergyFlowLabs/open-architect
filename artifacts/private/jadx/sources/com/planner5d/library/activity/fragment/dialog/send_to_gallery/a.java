package com.planner5d.library.activity.fragment.dialog.send_to_gallery;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132859d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f132860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<x> f132861c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull String title, @NotNull List<? extends x> tags) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f132860b = title;
        this.f132861c = tags;
    }

    @NotNull
    public final List<x> a() {
        return this.f132861c;
    }

    @NotNull
    public final String b() {
        return this.f132860b;
    }
}

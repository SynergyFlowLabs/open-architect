package com.planner5d.library.model.manager.builtin.materialsmetadataloading;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f181104a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final g f181105b = new g("materials.json", "materials", "datafile/materials/materials.json");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final g f181106c = new g("materials_hashes.json.gz", "materials_hashes", null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f181107d = 0;

    private a() {
    }

    @NotNull
    public final g a() {
        return f181106c;
    }

    @NotNull
    public final g b() {
        return f181105b;
    }
}

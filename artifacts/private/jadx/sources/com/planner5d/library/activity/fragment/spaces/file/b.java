package com.planner5d.library.activity.fragment.spaces.file;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136254f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<com.planner5d.library.database.model.spaces.documents.c> f136255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bitmap f136256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.database.model.spaces.documents.c f136257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f136258e;

    public b() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final String a() {
        return this.f136258e;
    }

    @Nullable
    public final Bitmap b() {
        return this.f136256c;
    }

    @Nullable
    public final List<com.planner5d.library.database.model.spaces.documents.c> c() {
        return this.f136255b;
    }

    @Nullable
    public final com.planner5d.library.database.model.spaces.documents.c d() {
        return this.f136257d;
    }

    public /* synthetic */ b(List list, Bitmap bitmap, com.planner5d.library.database.model.spaces.documents.c cVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : bitmap, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : str);
    }

    public b(@Nullable List<com.planner5d.library.database.model.spaces.documents.c> list, @Nullable Bitmap bitmap, @Nullable com.planner5d.library.database.model.spaces.documents.c cVar, @Nullable String str) {
        this.f136255b = list;
        this.f136256c = bitmap;
        this.f136257d = cVar;
        this.f136258e = str;
    }
}

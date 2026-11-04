package com.planner5d.library.activity.fragment.gallery;

import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nGalleryPageCategoryPickerData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPageCategoryPickerData.kt\ncom/planner5d/library/activity/fragment/gallery/GalleryPageCategoryPickerData\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,46:1\n37#2,2:47\n*S KotlinDebug\n*F\n+ 1 GalleryPageCategoryPickerData.kt\ncom/planner5d/library/activity/fragment/gallery/GalleryPageCategoryPickerData\n*L\n29#1:47,2\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f133905c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f133906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f133907b;

    @ij.a
    public v(@NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.application.b application) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f133906a = userAuthorization;
        this.f133907b = application;
    }

    @NotNull
    public final ue.b[] a(@NotNull com.planner5d.library.model.x[] tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        ArrayList arrayList = new ArrayList();
        if (this.f133906a.b()) {
            arrayList.add(new ue.b(777, this.f133907b.getString(com.planner5d.library.f.s.Ub)));
        }
        arrayList.add(new ue.b(-1, this.f133907b.getString(com.planner5d.library.f.s.D1)));
        for (com.planner5d.library.model.x xVar : tags) {
            arrayList.add(new ue.b(Integer.valueOf((int) xVar.f222847a), xVar.f222848b));
        }
        return (ue.b[]) arrayList.toArray(new ue.b[0]);
    }

    public final int b(@NotNull com.planner5d.library.model.x[] tags, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (l10 != null && l10.longValue() == 777) {
            return 777;
        }
        if (l10 == null) {
            return -1;
        }
        int length = tags.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (tags[i10].f222847a == l10.longValue()) {
                return i10;
            }
        }
        return -1;
    }
}

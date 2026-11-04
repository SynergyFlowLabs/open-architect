package com.planner5d.library.activity.fragment.feed.interactor;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.u1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSaveGalleryRecordsUseCaseInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveGalleryRecordsUseCaseInteractor.kt\ncom/planner5d/library/activity/fragment/feed/interactor/SaveGalleryRecordsUseCaseInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1863#2,2:43\n*S KotlinDebug\n*F\n+ 1 SaveGalleryRecordsUseCaseInteractor.kt\ncom/planner5d/library/activity/fragment/feed/interactor/SaveGalleryRecordsUseCaseInteractor\n*L\n22#1:43,2\n*E\n"})
public final class g implements ka.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f133493c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u1 f133494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.feed.data.g f133495b;

    @ij.a
    public g(@NotNull u1 logRecordManager, @NotNull com.planner5d.library.feed.data.g storage) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f133494a = logRecordManager;
        this.f133495b = storage;
    }

    private final JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException e10) {
                this.f133494a.b("bundle_to_json", null, e10);
            }
        }
        return jSONObject;
    }

    @Override // ka.c
    public void a(@NotNull Context context, @NotNull List<? extends com.planner5d.library.model.h> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Bundle bundleF = ((com.planner5d.library.model.h) it.next()).f();
                Intrinsics.checkNotNullExpressionValue(bundleF, "toBundle(...)");
                jSONArray.put(b(bundleF));
            }
            this.f133495b.b(jSONArray);
        } catch (IOException e10) {
            this.f133494a.b("save_gallery", null, e10);
        }
    }
}

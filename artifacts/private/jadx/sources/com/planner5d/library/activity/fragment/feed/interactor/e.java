package com.planner5d.library.activity.fragment.feed.interactor;

import android.content.Context;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.u1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class e implements ka.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f133486d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u1 f133487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.i f133488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.feed.data.g f133489c;

    @ij.a
    public e(@NotNull u1 logRecordManager, @NotNull com.planner5d.library.model.i galleryRecordFactory, @NotNull com.planner5d.library.feed.data.g storage) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(galleryRecordFactory, "galleryRecordFactory");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f133487a = logRecordManager;
        this.f133488b = galleryRecordFactory;
        this.f133489c = storage;
    }

    @Override // ka.b
    @m1
    @NotNull
    public List<com.planner5d.library.model.h> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayA = this.f133489c.a();
            int length = jSONArrayA.length();
            for (int i10 = 0; i10 < length; i10++) {
                com.planner5d.library.feed.data.f fVar = com.planner5d.library.feed.data.f.f175279a;
                Object obj = jSONArrayA.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList.add(this.f133488b.a(fVar.a((JSONObject) obj, this.f133487a)));
            }
            return arrayList;
        } catch (Throwable th2) {
            this.f133487a.b("read_gallery", null, th2);
            return arrayList;
        }
    }
}

package io.customer.tracking.migration.queue;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final rh.a f288669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final th.a f288670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih.e f288671c;

    public l(@NotNull rh.a fileStorage, @NotNull th.a jsonAdapter, @NotNull ih.e logger) {
        Intrinsics.checkNotNullParameter(fileStorage, "fileStorage");
        Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f288669a = fileStorage;
        this.f288670b = jsonAdapter;
        this.f288671c = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String str, JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(a.a(it), str);
    }

    @Override // io.customer.tracking.migration.queue.j
    public synchronized boolean a(@NotNull final String taskStorageId) {
        Intrinsics.checkNotNullParameter(taskStorageId, "taskStorageId");
        CollectionsKt.removeAll(CollectionsKt.toMutableList((Collection) b()), new Function1() { // from class: io.customer.tracking.migration.queue.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l.d(taskStorageId, (JSONObject) obj));
            }
        });
        if (this.f288669a.a(new rh.b.C2473b(taskStorageId))) {
            return true;
        }
        ih.e.a.b(this.f288671c, "error trying to delete task with storage id: " + taskStorageId + " from queue", null, null, 6, null);
        return false;
    }

    @Override // io.customer.tracking.migration.queue.j
    @NotNull
    public synchronized List<JSONObject> b() {
        List<JSONObject> listEmptyList;
        try {
            String strD = this.f288669a.d(new rh.b.a());
            if (strD == null) {
                return CollectionsKt.emptyList();
            }
            JSONArray jSONArrayB = this.f288670b.b(strD);
            if (jSONArrayB == null || (listEmptyList = oh.a.e(jSONArrayB)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return listEmptyList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.customer.tracking.migration.queue.j
    @Nullable
    public synchronized JSONObject get(@NotNull String taskStorageId) {
        try {
            Intrinsics.checkNotNullParameter(taskStorageId, "taskStorageId");
            String strD = this.f288669a.d(new rh.b.C2473b(taskStorageId));
            if (strD == null) {
                return null;
            }
            return this.f288670b.a(strD);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

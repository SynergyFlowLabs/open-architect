package com.planner5d.library.model.manager.synchronization;

import androidx.compose.runtime.internal.w0;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.services.utility.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUploadRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadRequest.kt\ncom/planner5d/library/model/manager/synchronization/UploadRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1557#2:70\n1628#2,3:71\n1863#2,2:74\n774#2:77\n865#2,2:78\n774#2:82\n865#2,2:83\n774#2:85\n865#2,2:86\n1557#2:88\n1628#2,3:89\n13409#3:76\n13410#3:81\n1#4:80\n*S KotlinDebug\n*F\n+ 1 UploadRequest.kt\ncom/planner5d/library/model/manager/synchronization/UploadRequest\n*L\n16#1:70\n16#1:71,3\n30#1:74,2\n48#1:77\n48#1:78,2\n58#1:82\n58#1:83,2\n59#1:85\n59#1:86,2\n62#1:88\n62#1:89,3\n46#1:76\n46#1:81\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222216b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b> f222217a;

    public enum a {
        Create("post"),
        Update("put"),
        Delete("delete");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f222222f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f222223a;

        a(String str) {
            this.f222223a = str;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f222222f;
        }

        @NotNull
        public final String n() {
            return this.f222223a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f222224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final SynchronizedModel f222225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final JSONObject f222226c;

        public b(@NotNull a action, @NotNull SynchronizedModel model, @NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(json, "json");
            this.f222224a = action;
            this.f222225b = model;
            this.f222226c = json;
        }

        @NotNull
        public final a a() {
            return this.f222224a;
        }

        @NotNull
        public final JSONObject b() {
            return this.f222226c;
        }

        @NotNull
        public final SynchronizedModel c() {
            return this.f222225b;
        }
    }

    public n() {
        this.f222217a = new ArrayList();
    }

    private final JSONObject b(JSONObject jSONObject, String str, List<b> list) throws JSONException {
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            List<b> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((b) it.next()).b());
            }
            jSONObject.put(str, k1.D(arrayList));
        }
        return jSONObject;
    }

    private final JSONObject c(List<b> list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((b) obj).c() instanceof Project) {
                arrayList.add(obj);
            }
        }
        JSONObject jSONObjectB = b(jSONObject, ProjectEntry.tableName, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((b) obj2).c() instanceof Folder) {
                arrayList2.add(obj2);
            }
        }
        return b(jSONObjectB, "folders", arrayList2);
    }

    public final void a(@NotNull a action, @NotNull SynchronizedModel model, @NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f222217a.add(new b(action, model, json));
    }

    @NotNull
    public final List<SynchronizedModel> d() {
        List<b> list = this.f222217a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).c());
        }
        return arrayList;
    }

    @NotNull
    public final List<n> e(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = 0;
        for (b bVar : this.f222217a) {
            if (length > j10) {
                arrayList.add(new n(arrayList2));
                arrayList2.clear();
            }
            arrayList2.add(bVar);
            length += bVar.b().toString().length();
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new n(arrayList2));
        }
        return arrayList;
    }

    @NotNull
    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : a.values()) {
            try {
                List<b> list = this.f222217a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((b) obj).a() == aVar) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    jSONObject.put(aVar.n(), c(arrayList));
                }
            } catch (JSONException e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        return jSONObject;
    }

    private n(List<b> list) {
        this();
        this.f222217a.addAll(list);
    }
}

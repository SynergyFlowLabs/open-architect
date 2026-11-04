package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.user.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public abstract class t implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180726c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final id.a f180727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f180728b;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nStorageUserBased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageUserBased.kt\ncom/planner5d/library/model/editorcollection/StorageUserBased$Backend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1#2:54\n1863#3,2:55\n774#3:57\n865#3,2:58\n*S KotlinDebug\n*F\n+ 1 StorageUserBased.kt\ncom/planner5d/library/model/editorcollection/StorageUserBased$Backend\n*L\n38#1:55,2\n48#1:57\n48#1:58,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f180729c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f180730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final f0 f180731b;

        public a(@NotNull String group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f180730a = com.planner5d.library.services.r.editorCollection.f224891a + "_" + group;
            this.f180731b = g0.c(new Function0() { // from class: com.planner5d.library.model.editorcollection.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t.a.e();
                }
            });
        }

        private final com.planner5d.library.model.manager.config.p c() {
            return (com.planner5d.library.model.manager.config.p) this.f180731b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.model.manager.config.p e() {
            return com.planner5d.library.application.b.f142455c.a().n2();
        }

        public final void b(@NotNull g.b record) {
            Intrinsics.checkNotNullParameter(record, "record");
            List<g.b> mutableList = CollectionsKt.toMutableList((Collection) d());
            mutableList.add(record);
            g(mutableList);
        }

        @NotNull
        public final List<g.b> d() throws JSONException {
            JSONArray jSONArray;
            ArrayList arrayList = new ArrayList();
            synchronized (this.f180730a) {
                try {
                    jSONArray = new JSONArray(c().D(this.f180730a, v.f334777p));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                arrayList.add(new g.b(jSONObject));
            }
            return CollectionsKt.toList(arrayList);
        }

        public final void f(@NotNull g.b record) {
            Intrinsics.checkNotNullParameter(record, "record");
            List mutableList = CollectionsKt.toMutableList((Collection) d());
            ArrayList arrayList = new ArrayList();
            for (Object obj : mutableList) {
                if (!Intrinsics.areEqual(((g.b) obj).a(), record.a())) {
                    arrayList.add(obj);
                }
            }
            g(arrayList);
        }

        public final void g(@NotNull List<g.b> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            synchronized (this.f180730a) {
                try {
                    com.planner5d.library.model.manager.config.p pVarC = c();
                    String str = this.f180730a;
                    JSONArray jSONArray = new JSONArray();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((g.b) it.next()).c());
                    }
                    Unit unit = Unit.f312394a;
                    pVarC.B(str, jSONArray.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @w0(parameters = 2)
    public static abstract class b<S extends t> extends k<S, id.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f180732d = 0;

        @Override // com.planner5d.library.model.editorcollection.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(@NotNull S storage, @Nullable id.a aVar) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            id.a aVarE = storage.e();
            return Intrinsics.areEqual(aVarE != null ? Long.valueOf(aVarE.f287075a) : null, aVar != null ? Long.valueOf(aVar.f287075a) : null);
        }
    }

    public t(@NotNull String storageGroup, @Nullable id.a aVar) {
        Intrinsics.checkNotNullParameter(storageGroup, "storageGroup");
        this.f180727a = aVar;
        this.f180728b = new a(storageGroup + "_" + x.a(aVar));
    }

    @NotNull
    public final a d() {
        return this.f180728b;
    }

    @Nullable
    public final id.a e() {
        return this.f180727a;
    }
}

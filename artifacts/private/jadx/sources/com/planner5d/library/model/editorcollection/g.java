package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 2)
@SourceDebugExtension({"SMAP\nEditorCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorCollection.kt\ncom/planner5d/library/model/editorcollection/EditorCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n1863#3,2:67\n*S KotlinDebug\n*F\n+ 1 EditorCollection.kt\ncom/planner5d/library/model/editorcollection/EditorCollection\n*L\n47#1:67,2\n*E\n"})
public final class g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f180693c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180694d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f180695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.editorcollection.a<T> f180696b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.planner5d.library.model.editorcollection.i] */
        @NotNull
        public final g<y> a(@Nullable id.a aVar) {
            return new g<>(j.f180707d.b(aVar), d.f180686a);
        }

        @NotNull
        public final g<com.planner5d.library.model.b> b(@Nullable ItemProject itemProject) {
            return new g<>(l.f180712c.b(TuplesKt.to(itemProject, null)), com.planner5d.library.model.editorcollection.b.f180684a);
        }

        @NotNull
        public final g<y> c(@Nullable ItemProject itemProject, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
            Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
            return new g<>(l.f180712c.b(TuplesKt.to(itemProject, builtInDataManager)), d.f180686a);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.planner5d.library.model.editorcollection.i] */
        @NotNull
        public final g<com.planner5d.library.model.b> d(@Nullable id.a aVar) {
            return new g<>(n.f180719d.b(aVar), com.planner5d.library.model.editorcollection.b.f180684a);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.planner5d.library.model.editorcollection.i] */
        @NotNull
        public final g<y> e(@Nullable id.a aVar) {
            return new g<>(n.f180719d.b(aVar), d.f180686a);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.planner5d.library.model.editorcollection.i] */
        @NotNull
        public final g<y> f(@Nullable id.a aVar) {
            return new g<>(r.f180722f.b(aVar), d.f180686a);
        }

        private a() {
        }
    }

    @w0(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f180697c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f180698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f180699b;

        public b(@NotNull c type, @NotNull String id2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f180698a = type;
            this.f180699b = id2;
        }

        @NotNull
        public final String a() {
            return this.f180699b;
        }

        @NotNull
        public final c b() {
            return this.f180698a;
        }

        @NotNull
        public final JSONObject c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.planner5d.library.services.r.type.f224891a, this.f180698a.name());
            jSONObject.put(com.planner5d.library.services.r.id.f224891a, this.f180699b);
            return jSONObject;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull JSONObject data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            String string = data.getString(com.planner5d.library.services.r.type.f224891a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c cVarValueOf = c.valueOf(string);
            String string2 = data.getString(com.planner5d.library.services.r.id.f224891a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this(cVarValueOf, string2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull c type, @NotNull JSONObject id2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id2, "id");
            String string = id2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this(type, string);
        }
    }

    public enum c {
        Texture(0),
        Color(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f180703e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f180704a;

        c(int i10) {
            this.f180704a = i10;
        }

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f180703e;
        }

        public final int n() {
            return this.f180704a;
        }
    }

    public g(@NotNull i storage, @NotNull com.planner5d.library.model.editorcollection.a<T> converter) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f180695a = storage;
        this.f180696b = converter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(g gVar, Object obj, i.a modify) {
        Intrinsics.checkNotNullParameter(modify, "$this$modify");
        modify.c(gVar.f180696b.a(obj));
        return Unit.f312394a;
    }

    private final void g(Function1<? super i.a, Unit> function1) {
        i iVar = this.f180695a;
        if (iVar instanceof i.a) {
            function1.invoke(iVar);
        }
    }

    private final T h(b bVar) {
        if (bVar == null) {
            return null;
        }
        return this.f180696b.b(bVar);
    }

    private final List<T> i(List<b> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tH = h((b) it.next());
            if (tH != null) {
                arrayList.add(tH);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(g gVar, Object obj, i.a modify) {
        Intrinsics.checkNotNullParameter(modify, "$this$modify");
        modify.b(gVar.f180696b.a(obj));
        return Unit.f312394a;
    }

    public final void c(final T t10) {
        g(new Function1() { // from class: com.planner5d.library.model.editorcollection.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.d(this.f180691a, t10, (i.a) obj);
            }
        });
    }

    @NotNull
    public final List<T> e() {
        return i(this.f180695a.a(false));
    }

    @NotNull
    public final List<T> f() {
        return i(this.f180695a.a(true));
    }

    public final void j(final T t10) {
        g(new Function1() { // from class: com.planner5d.library.model.editorcollection.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.k(this.f180689a, t10, (i.a) obj);
            }
        });
    }
}

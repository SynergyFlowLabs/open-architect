package com.planner5d.library.project.interactor;

import android.app.Application;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nGetRoomTypesInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRoomTypesInteractor.kt\ncom/planner5d/library/project/interactor/GetRoomTypesInteractor\n*L\n1#1,35:1\n21#1:36\n*S KotlinDebug\n*F\n+ 1 GetRoomTypesInteractor.kt\ncom/planner5d/library/project/interactor/GetRoomTypesInteractor\n*L\n23#1:36\n*E\n"})
public final class c implements pd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f223900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f223902c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.interactor.GetRoomTypesInteractor$getRoomTypes$2", f = "GetRoomTypesInteractor.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGetRoomTypesInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRoomTypesInteractor.kt\ncom/planner5d/library/project/interactor/GetRoomTypesInteractor$getRoomTypes$2\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n163#2,3:36\n167#2:40\n1#3:39\n774#4:41\n865#4,2:42\n*S KotlinDebug\n*F\n+ 1 GetRoomTypesInteractor.kt\ncom/planner5d/library/project/interactor/GetRoomTypesInteractor$getRoomTypes$2\n*L\n31#1:36,3\n31#1:40\n31#1:39\n31#1:41\n31#1:42,2\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super List<? extends od.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223903a;

        /* JADX INFO: renamed from: com.planner5d.library.project.interactor.c$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.interactor.GetRoomTypesInteractor$getRoomTypes$2$response$1", f = "GetRoomTypesInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1658a extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f223906b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f223907c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f223908d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1658a(c cVar, kotlin.coroutines.d<? super C1658a> dVar) {
                super(3, dVar);
                this.f223908d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f223905a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f223906b).i0((id.a) this.f223907c, 1, this.f223908d.f223900a.getPackageName(), h3.j(this.f223908d.f223900a), h3.a());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1658a c1658a = new C1658a(this.f223908d, dVar);
                c1658a.f223906b = bVar;
                c1658a.f223907c = aVar;
                return c1658a.invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends od.a>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<od.a>>) dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            JSONArray jSONArrayB;
            ?? EmptyList;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223903a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = c.this.f223901b;
                id.a aVarA = c.this.f223902c.a();
                C1658a c1658a = new C1658a(c.this, null);
                this.f223903a = 1;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1658a, this, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
            if (cVar2 == null || (jSONArrayB = cVar2.b()) == null) {
                return CollectionsKt.emptyList();
            }
            int length = jSONArrayB.length();
            if (length > 0) {
                EmptyList = new ArrayList(length);
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArrayB.getJSONObject(i11);
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                    EmptyList.add(od.a.f333624e.a(jSONObject));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) EmptyList) {
                if (((od.a) obj2).j()) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<od.a>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull Application application, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f223900a = application;
        this.f223901b = userApiRequester;
        this.f223902c = userAuthorization;
    }

    private final n0 e() {
        return s.f229729a.b();
    }

    @Override // pd.b
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<od.a>> dVar) {
        return i.h(s.f229729a.b(), new a(null), dVar);
    }
}

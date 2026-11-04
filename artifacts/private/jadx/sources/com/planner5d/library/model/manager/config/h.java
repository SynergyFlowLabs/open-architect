package com.planner5d.library.model.manager.config;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
@SourceDebugExtension({"SMAP\nFeatureConfigJsonSerialization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureConfigJsonSerialization.kt\ncom/planner5d/library/model/manager/config/FeatureConfigJsonSerialization\n*L\n1#1,42:1\n14#1:43\n14#1:44\n*S KotlinDebug\n*F\n+ 1 FeatureConfigJsonSerialization.kt\ncom/planner5d/library/model/manager/config/FeatureConfigJsonSerialization\n*L\n18#1:43\n30#1:44\n*E\n"})
public final class h {

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigJsonSerialization$extractFromJson$3", f = "FeatureConfigJsonSerialization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f181538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f181539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f181538b = jSONObject;
            this.f181539c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f181538b, this.f181539c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f181537a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                JSONObject jSONObject = this.f181538b.getJSONObject(this.f181539c);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                return new g(jSONObject);
            } catch (JSONException unused) {
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super g> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigJsonSerialization$putIntoJson$3", f = "FeatureConfigJsonSerialization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f181541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f181542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f181543d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, JSONObject jSONObject, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f181541b = gVar;
            this.f181542c = jSONObject;
            this.f181543d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f181541b, this.f181542c, this.f181543d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f181540a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            g gVar = this.f181541b;
            if (gVar == null) {
                return this.f181542c.remove(this.f181543d);
            }
            try {
                return this.f181542c.put(this.f181543d, gVar.a());
            } catch (JSONException unused) {
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<Object> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h() {
    }

    private final n0 c() {
        return com.planner5d.library.services.utility.s.f229729a.h();
    }

    @Nullable
    public final Object a(@NotNull JSONObject jSONObject, @NotNull f fVar, @NotNull kotlin.coroutines.d<? super g> dVar) {
        return b(jSONObject, fVar.getId(), dVar);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull kotlin.coroutines.d<? super g> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(jSONObject, str, null), dVar);
    }

    @Nullable
    public final Object d(@NotNull JSONObject jSONObject, @NotNull f fVar, @Nullable g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e(jSONObject, fVar.getId(), gVar, dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    @Nullable
    public final Object e(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(gVar, jSONObject, str, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}

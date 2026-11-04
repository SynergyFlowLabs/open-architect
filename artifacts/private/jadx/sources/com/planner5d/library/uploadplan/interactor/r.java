package com.planner5d.library.uploadplan.interactor;

import android.graphics.Bitmap;
import android.util.Base64;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import java.io.ByteArrayOutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements ke.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c2 f230816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f230817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f230818d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.UploadPlanInteractor$uploadPlan$2", f = "UploadPlanInteractor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230819a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f230821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.math.k f230822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.math.k f230823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f230824f;

        /* JADX INFO: renamed from: com.planner5d.library.uploadplan.interactor.r$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.UploadPlanInteractor$uploadPlan$2$res$1", f = "UploadPlanInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1710a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f230826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f230827c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ r f230828d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bitmap f230829e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.math.k f230830f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.math.k f230831g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f230832h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1710a(r rVar, Bitmap bitmap, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, float f10, kotlin.coroutines.d<? super C1710a> dVar) {
                super(3, dVar);
                this.f230828d = rVar;
                this.f230829e = bitmap;
                this.f230830f = kVar;
                this.f230831g = kVar2;
                this.f230832h = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f230825a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f230826b).L((id.a) this.f230827c, this.f230828d.g(this.f230829e, this.f230830f, this.f230831g, this.f230832h), this.f230828d.f230815a.getPackageName(), h3.j(this.f230828d.f230815a), h3.a());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1710a c1710a = new C1710a(this.f230828d, this.f230829e, this.f230830f, this.f230831g, this.f230832h, dVar);
                c1710a.f230826b = bVar;
                c1710a.f230827c = aVar;
                return c1710a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bitmap bitmap, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, float f10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f230821c = bitmap;
            this.f230822d = kVar;
            this.f230823e = kVar2;
            this.f230824f = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new a(this.f230821c, this.f230822d, this.f230823e, this.f230824f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ErrorMessageException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230819a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = r.this.f230817c;
                id.a aVarA = r.this.f230818d.a();
                C1710a c1710a = new C1710a(r.this, this.f230821c, this.f230822d, this.f230823e, this.f230824f, null);
                this.f230819a = 1;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1710a, this, 2, null);
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
            if (cVar2.h()) {
                throw new ErrorMessageException(he.b.s.H9, cVar2.f());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public r(@NotNull com.planner5d.library.application.b application, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f230815a = application;
        this.f230816b = networkStateUtility;
        this.f230817c = userApiRequester;
        this.f230818d = userAuthorization;
    }

    private final String f(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] bArrEncode = Base64.encode(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return "data:image/png;base64," + new String(bArrEncode, Charsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject g(Bitmap bitmap, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, float f10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "recognition");
        jSONObject.put("data", f(bitmap));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("start", k1.D(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf((int) kVar.f180480a), Integer.valueOf((int) kVar.f180481b)})));
        jSONObject2.put("end", k1.D(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf((int) kVar2.f180480a), Integer.valueOf((int) kVar2.f180481b)})));
        jSONObject2.put("length_cm", Float.valueOf(f10));
        jSONObject.put("dimensions_info", jSONObject2);
        return jSONObject;
    }

    @Override // ke.h
    @Nullable
    public Object a(@NotNull Bitmap bitmap, @NotNull com.planner5d.library.math.k kVar, @NotNull com.planner5d.library.math.k kVar2, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws ErrorMessageException {
        if (!this.f230816b.d(this.f230815a)) {
            throw ErrorMessageException.createNoInternetException();
        }
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new a(bitmap, kVar, kVar2, f10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}

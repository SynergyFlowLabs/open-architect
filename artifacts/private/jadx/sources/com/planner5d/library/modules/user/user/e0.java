package com.planner5d.library.modules.user.user;

import android.content.Context;
import com.planner5d.library.services.utility.h3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223014e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f223017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f223018d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserMessages$getUserMessage$1$ids$1", f = "UserMessages.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Set<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223019a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Set<? extends String>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Set<String>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223019a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = e0.this.f223016b;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userMessages;
            HashSet hashSet = new HashSet();
            this.f223019a = 1;
            Object objI = pVar.i(rVar, hashSet, this);
            return objI == objL ? objL : objI;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Set<String>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserMessages$getUserMessageResponse$1", f = "UserMessages.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223021a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f223023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JSONArray jSONArray, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f223023c = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new b(this.f223023c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223021a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = e0.this.f223016b;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userMessagesRequest;
                String string = this.f223023c.toString();
                this.f223021a = 1;
                if (pVar.d(rVar, string, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserMessages$getUserMessageResponse$2", f = "UserMessages.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223024a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223024a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = e0.this.f223016b;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userMessagesRequest;
            this.f223024a = 1;
            Object objY = pVar.y(rVar, this);
            return objY == objL ? objL : objY;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserMessages$getUserMessageResponse$3", f = "UserMessages.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223026a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223026a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = e0.this.f223016b;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userMessagesRequest;
            this.f223026a = 1;
            Object objU = pVar.u(rVar, okhttp3.v.f334777p, this);
            return objU == objL ? objL : objU;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserMessages$setUserMessageShown$1", f = "UserMessages.kt", i = {0}, l = {105, 109}, m = "invokeSuspend", n = {"id"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.b f223030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f223031d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(id.b bVar, e0 e0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f223030c = bVar;
            this.f223031d = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f223030c, this.f223031d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (r8.A(r1, r3, r7) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 7
                int r1 = r7.f223029b
                r2 = 2
                r3 = 1
                r6 = r3
                if (r1 == 0) goto L28
                r6 = 1
                if (r1 == r3) goto L20
                r6 = 4
                if (r1 != r2) goto L17
                kotlin.ResultKt.m(r8)
                goto L8a
            L17:
                r6 = 5
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L20:
                java.lang.Object r1 = r7.f223028a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.ResultKt.m(r8)
                goto L5e
            L28:
                kotlin.ResultKt.m(r8)
                id.b r8 = r7.f223030c
                boolean r8 = r8.e()
                if (r8 == 0) goto L36
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L36:
                r6 = 1
                id.b r8 = r7.f223030c
                long r4 = r8.f287092f
                java.lang.String r1 = java.lang.String.valueOf(r4)
                r6 = 6
                com.planner5d.library.modules.user.user.e0 r8 = r7.f223031d
                r6 = 5
                com.planner5d.library.model.manager.config.p r8 = com.planner5d.library.modules.user.user.e0.c(r8)
                r6 = 1
                com.planner5d.library.services.r r4 = com.planner5d.library.services.r.userMessages
                java.util.HashSet r5 = new java.util.HashSet
                r6 = 5
                r5.<init>()
                r7.f223028a = r1
                r7.f223029b = r3
                r6 = 4
                java.lang.Object r8 = r8.i(r4, r5, r7)
                r6 = 3
                if (r8 != r0) goto L5e
                r6 = 4
                goto L88
            L5e:
                java.util.Set r8 = (java.util.Set) r8
                r6 = 6
                boolean r3 = r8.contains(r1)
                r6 = 2
                if (r3 != 0) goto L8a
                java.util.HashSet r3 = new java.util.HashSet
                java.util.Collection r8 = (java.util.Collection) r8
                r3.<init>(r8)
                r3.add(r1)
                r6 = 4
                com.planner5d.library.modules.user.user.e0 r8 = r7.f223031d
                com.planner5d.library.model.manager.config.p r8 = com.planner5d.library.modules.user.user.e0.c(r8)
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.userMessages
                r4 = 0
                r6 = 6
                r7.f223028a = r4
                r7.f223029b = r2
                java.lang.Object r7 = r8.A(r1, r3, r7)
                r6 = 0
                if (r7 != r0) goto L8a
            L88:
                r6 = 4
                return r0
            L8a:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.e0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e0(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.services.utility.f1 coroutineScope, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f223015a = userApiRequester;
        this.f223016b = preferences;
        this.f223017c = coroutineScope;
        this.f223018d = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e0 e0Var, String str, long j10, Subscriber subscriber) {
        id.b bVarG;
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ArrayList<id.b> arrayList = new ArrayList();
        try {
            Intrinsics.checkNotNull(str);
            JSONArray jSONArrayF = e0Var.f(str, j10);
            int length = jSONArrayF.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayF.getJSONObject(i10);
                JSONObject jSONObject2 = jSONObject.getJSONObject(com.planner5d.library.services.r.content.f224891a);
                Long lValueOf = Long.valueOf(jSONObject.getString(com.planner5d.library.services.r.id.f224891a));
                String string = jSONObject2.getString(com.planner5d.library.services.r.uri.f224891a);
                Iterator<String> itKeys = jSONObject2.keys();
                HashMap map = new HashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!Intrinsics.areEqual(com.planner5d.library.services.r.uri.f224891a, next)) {
                        map.put(next, jSONObject2.getString(next));
                    }
                }
                Intrinsics.checkNotNull(jSONObject);
                boolean zA = com.planner5d.library.services.utility.k1.a(jSONObject, com.planner5d.library.services.r.closeable);
                if (!com.planner5d.library.services.utility.k1.a(jSONObject, com.planner5d.library.services.r.requestUpdate)) {
                    Intrinsics.checkNotNull(lValueOf);
                    bVarG = id.b.g(lValueOf.longValue(), zA, map, string);
                } else if (map.isEmpty()) {
                    Intrinsics.checkNotNull(lValueOf);
                    bVarG = id.b.h(lValueOf.longValue(), zA);
                } else {
                    Intrinsics.checkNotNull(lValueOf);
                    bVarG = id.b.i(lValueOf.longValue(), zA, map);
                }
                arrayList.add(bVarG);
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        int i11 = 0 >> 0;
        Set set = (Set) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, e0Var.new a(null), 3, null);
        for (id.b bVar : arrayList) {
            if (!set.contains(String.valueOf(bVar.f287092f))) {
                subscriber.onNext(bVar);
                break;
            }
        }
        subscriber.onCompleted();
    }

    @androidx.annotation.m1
    private final JSONArray f(final String str, final long j10) {
        try {
            Object objJ = this.f223015a.j(this.f223018d.a(), new Function2() { // from class: com.planner5d.library.modules.user.user.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.g(str, j10, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objJ, "requestBlocking(...)");
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) objJ;
            if (!cVar.h()) {
                JSONObject jSONObjectA = cVar.a();
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.items;
                if (jSONObjectA.has(rVar.f224891a)) {
                    com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new b(cVar.a().getJSONArray(rVar.f224891a), null), 3, null);
                }
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
        if (((Boolean) com.planner5d.library.services.utility.c0.t(c0Var, null, false, new c(null), 3, null)).booleanValue()) {
            try {
                return new JSONArray((String) com.planner5d.library.services.utility.c0.t(c0Var, null, false, new d(null), 3, null));
            } catch (Throwable th3) {
                timber.log.b.f381052a.e(th3);
            }
        }
        return new JSONArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c g(String str, long j10, com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.r0(aVar, str, j10, h3.c(), h3.a());
    }

    @NotNull
    public final Observable<id.b> d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final String packageName = context.getPackageName();
        final long j10 = h3.j(context);
        Observable<id.b> observableD = com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.modules.user.user.c0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                e0.e(this.f222993a, packageName, j10, (Subscriber) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableD, "background(...)");
        return observableD;
    }

    public final void h(@NotNull id.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kotlinx.coroutines.k.f(this.f223017c, null, null, new e(model, this, null), 3, null);
    }
}

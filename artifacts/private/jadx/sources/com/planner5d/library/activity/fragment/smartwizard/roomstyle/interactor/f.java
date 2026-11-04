package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pj.n;
import pj.q;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class f implements pa.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135715d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t1 f135716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f135717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f135718c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardAIQueueRequestInteractor", f = "SmartWizardAIQueueRequestInteractor.kt", i = {0}, l = {45}, m = "requestAIDecoratorQueue", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135720b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135722d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135720b = obj;
            this.f135722d |= Integer.MIN_VALUE;
            return f.this.b(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardAIQueueRequestInteractor$requestAIQueue$2", f = "SmartWizardAIQueueRequestInteractor.kt", i = {0}, l = {66}, m = "invokeSuspend", n = {"jsonKey"}, s = {"L$0"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f135724b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f135726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pa.a f135727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f135728f;

        /* synthetic */ class a extends g0 implements q<com.planner5d.library.api.b, id.a, String, String, JSONObject, String, com.planner5d.library.api.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f135729a = new a();

            a() {
                super(6, com.planner5d.library.api.b.class, "requestSmartWizard", "requestSmartWizard(Lcom/planner5d/library/modules/user/model/User;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/planner5d/library/api/Response;", 0);
            }

            @Override // pj.q
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final com.planner5d.library.api.c H(com.planner5d.library.api.b p10, id.a aVar, String str, String str2, JSONObject jSONObject, String str3) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return p10.M(aVar, str, str2, jSONObject, str3);
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f$b$b, reason: collision with other inner class name */
        /* synthetic */ class C1493b extends g0 implements q<com.planner5d.library.api.b, id.a, String, String, JSONObject, String, com.planner5d.library.api.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1493b f135730a = new C1493b();

            C1493b() {
                super(6, com.planner5d.library.api.b.class, "requestFurnisher", "requestFurnisher(Lcom/planner5d/library/modules/user/model/User;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/planner5d/library/api/Response;", 0);
            }

            @Override // pj.q
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final com.planner5d.library.api.c H(com.planner5d.library.api.b p10, id.a aVar, String str, String str2, JSONObject jSONObject, String str3) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return p10.t0(aVar, str, str2, jSONObject, str3);
            }
        }

        /* synthetic */ class c extends g0 implements q<com.planner5d.library.api.b, id.a, String, String, JSONObject, String, com.planner5d.library.api.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f135731a = new c();

            c() {
                super(6, com.planner5d.library.api.b.class, "requestStyler", "requestStyler(Lcom/planner5d/library/modules/user/model/User;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/planner5d/library/api/Response;", 0);
            }

            @Override // pj.q
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final com.planner5d.library.api.c H(com.planner5d.library.api.b p10, id.a aVar, String str, String str2, JSONObject jSONObject, String str3) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return p10.C0(aVar, str, str2, jSONObject, str3);
            }
        }

        /* synthetic */ class d extends g0 implements q<com.planner5d.library.api.b, id.a, String, String, JSONObject, String, com.planner5d.library.api.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f135732a = new d();

            d() {
                super(6, com.planner5d.library.api.b.class, "requestDecorator", "requestDecorator(Lcom/planner5d/library/modules/user/model/User;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/planner5d/library/api/Response;", 0);
            }

            @Override // pj.q
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final com.planner5d.library.api.c H(com.planner5d.library.api.b p10, id.a aVar, String str, String str2, JSONObject jSONObject, String str3) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return p10.s(aVar, str, str2, jSONObject, str3);
            }
        }

        public /* synthetic */ class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f135733a;

            static {
                int[] iArr = new int[pa.a.values().length];
                try {
                    iArr[pa.a.SmartWizard.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[pa.a.Furnisher.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[pa.a.Styler.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[pa.a.Decorate.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f135733a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f$b$f, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardAIQueueRequestInteractor$requestAIQueue$2$response$1", f = "SmartWizardAIQueueRequestInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1494f extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f135735b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.i<com.planner5d.library.api.c> f135736c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ id.a f135737d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f135738e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f135739f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ JSONObject f135740g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f135741h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1494f(kotlin.reflect.i<com.planner5d.library.api.c> iVar, id.a aVar, String str, String str2, JSONObject jSONObject, String str3, kotlin.coroutines.d<? super C1494f> dVar) {
                super(3, dVar);
                this.f135736c = iVar;
                this.f135737d = aVar;
                this.f135738e = str;
                this.f135739f = str2;
                this.f135740g = jSONObject;
                this.f135741h = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f135734a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((q) this.f135736c).H((com.planner5d.library.api.b) this.f135735b, this.f135737d, this.f135738e, this.f135739f, this.f135740g, this.f135741h);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1494f c1494f = new C1494f(this.f135736c, this.f135737d, this.f135738e, this.f135739f, this.f135740g, this.f135741h, dVar);
                c1494f.f135735b = bVar;
                return c1494f.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, pa.a aVar, JSONObject jSONObject, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f135726d = context;
            this.f135727e = aVar;
            this.f135728f = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(this.f135726d, this.f135727e, this.f135728f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            r rVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135724b;
            if (i10 == 0) {
                ResultKt.m(obj);
                id.a aVarA = f.this.f135718c.a();
                String packageName = this.f135726d.getPackageName();
                String strL = h3.l(this.f135726d);
                String strW = h3.w();
                int i11 = e.f135733a[this.f135727e.ordinal()];
                if (i11 == 1) {
                    pair = new Pair(a.f135729a, r.queueName);
                } else if (i11 == 2) {
                    pair = new Pair(C1493b.f135730a, r.queue);
                } else if (i11 == 3) {
                    pair = new Pair(c.f135731a, r.queue);
                } else {
                    if (i11 != 4) {
                        throw new k0();
                    }
                    pair = new Pair(d.f135732a, r.queueName);
                }
                kotlin.reflect.i iVar = (kotlin.reflect.i) pair.component1();
                r rVar2 = (r) pair.component2();
                com.planner5d.library.api.requests.c cVar = f.this.f135717b;
                C1494f c1494f = new C1494f(iVar, aVarA, packageName, strL, this.f135728f, strW, null);
                this.f135723a = rVar2;
                this.f135724b = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1494f, this, 2, null);
                if (objG == objL) {
                    return objL;
                }
                obj = objG;
                rVar = rVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.f135723a;
                ResultKt.m(obj);
            }
            return k1.y(((com.planner5d.library.api.c) obj).a(), rVar, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.SmartWizardAIQueueRequestInteractor", f = "SmartWizardAIQueueRequestInteractor.kt", i = {0}, l = {32}, m = "requestQueue", n = {"this"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135743b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135745d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135743b = obj;
            this.f135745d |= Integer.MIN_VALUE;
            boolean z10 = false;
            return f.this.a(null, null, 0, 0, null, null, this);
        }
    }

    @ij.a
    public f(@NotNull t1 logRecordManager, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f135716a = logRecordManager;
        this.f135717b = userApiRequester;
        this.f135718c = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(Context context, pa.a aVar, JSONObject jSONObject, kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(context, aVar, jSONObject, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // pa.d
    @Nullable
    public Object a(@NotNull Context context, @NotNull pa.a aVar, int i10, int i11, @NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super String> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.f135745d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f135745d = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f135743b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = cVar.f135745d;
        try {
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            JSONObject jSONObjectC = com.planner5d.library.activity.fragment.smartwizard.roomstyle.a.f135656a.c(aVar, i10, i11, str, str2);
            cVar.f135742a = this;
            cVar.f135745d = 1;
            Object objF = f(context, aVar, jSONObjectC, cVar);
            return objF == objL ? objL : objF;
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            this.f135716a.b("ai_queue", null, e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // pa.d
    @Nullable
    public Object b(@NotNull Context context, @NotNull String str, @NotNull com.planner5d.library.smartwizard.data.b bVar, @NotNull kotlin.coroutines.d<? super String> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f135722d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f135722d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f135720b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f135722d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            JSONObject jSONObjectA = com.planner5d.library.activity.fragment.smartwizard.roomstyle.a.f135656a.a(str, bVar);
            pa.a aVar2 = pa.a.Decorate;
            aVar.f135719a = this;
            aVar.f135722d = 1;
            Object objF = f(context, aVar2, jSONObjectA, aVar);
            return objF == objL ? objL : objF;
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            this.f135716a.b("ai_queue", null, e10);
            return null;
        }
    }
}

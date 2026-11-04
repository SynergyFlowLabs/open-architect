package com.planner5d.library.dgenerator.interactor;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements nb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f160470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f160471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final le.m f160472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160473d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartAutoStyleInteractor$createAutoStyle$2", f = "StartAutoStyleInteractor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160474a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f160477d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AutoStyle autoStyle, Function1<? super Long, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f160476c = autoStyle;
            this.f160477d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new a(this.f160476c, this.f160477d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160474a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.manager.a aVar = m.this.f160473d;
                AutoStyle autoStyle = this.f160476c;
                this.f160474a = 1;
                obj = aVar.j(autoStyle, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f160477d.invoke(kotlin.coroutines.jvm.internal.b.g(((Number) obj).longValue()));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartAutoStyleInteractor$getNewQueue$2", f = "StartAutoStyleInteractor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nStartAutoStyleInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartAutoStyleInteractor.kt\ncom/planner5d/library/dgenerator/interactor/StartAutoStyleInteractor$getNewQueue$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1557#2:79\n1628#2,3:80\n*S KotlinDebug\n*F\n+ 1 StartAutoStyleInteractor.kt\ncom/planner5d/library/dgenerator/interactor/StartAutoStyleInteractor$getNewQueue$2\n*L\n58#1:79\n58#1:80,3\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f160480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f160481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ byte[] f160482e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartAutoStyleInteractor$getNewQueue$2$response$1", f = "StartAutoStyleInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f160483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f160484b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f160485c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f160486d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f160487e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ JSONObject f160488f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, JSONObject jSONObject, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f160486d = str;
                this.f160487e = str2;
                this.f160488f = jSONObject;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f160483a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f160484b).g((id.a) this.f160485c, this.f160486d, this.f160487e, this.f160488f, h3.w());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f160486d, this.f160487e, this.f160488f, dVar);
                aVar2.f160484b = bVar;
                aVar2.f160485c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AutoStyle autoStyle, Context context, m mVar, byte[] bArr, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f160479b = autoStyle;
            this.f160480c = context;
            this.f160481d = mVar;
            this.f160482e = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f160479b, this.f160480c, this.f160481d, this.f160482e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            List listEmptyList;
            List listSplit$default;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160478a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (this.f160479b.z() == null) {
                        timber.log.b.f381052a.d("Can't get new queue because room type is null", new Object[0]);
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    AutoStyle autoStyle = this.f160479b;
                    byte[] bArr = this.f160482e;
                    jSONObject.put(com.planner5d.library.services.r.designGeneratorRoomType.f224891a, String.valueOf(autoStyle.z()));
                    String str = com.planner5d.library.services.r.designGeneratorRoomStyles.f224891a;
                    String strY = autoStyle.y();
                    if (strY == null || (listSplit$default = StringsKt.split$default(strY, new String[]{","}, false, 0, 6, null)) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        List list = listSplit$default;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(StringsKt.E5((String) it.next()).toString());
                        }
                        listEmptyList = CollectionsKt.toList(arrayList);
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                    }
                    jSONObject.put(str, k1.D(listEmptyList));
                    jSONObject.put(com.planner5d.library.services.r.designGeneratorRendersCount.f224891a, autoStyle.x());
                    String str2 = com.planner5d.library.services.r.designGeneratorImage.f224891a;
                    byte[] bArrEncode = Base64.encode(bArr, 0);
                    Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
                    jSONObject.put(str2, new String(bArrEncode, Charsets.UTF_8));
                    jSONObject.put(com.planner5d.library.services.r.designGeneratorWithImageUri.f224891a, true);
                    String packageName = this.f160480c.getPackageName();
                    String strL = h3.l(this.f160480c);
                    com.planner5d.library.api.requests.c cVar = this.f160481d.f160470a;
                    id.a aVarA = this.f160481d.f160471b.a();
                    a aVar = new a(packageName, strL, jSONObject, null);
                    this.f160478a = 1;
                    obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, this, 2, null);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return k1.z(((com.planner5d.library.api.c) obj).a(), com.planner5d.library.services.r.queueName.f224891a, null, 4, null);
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization, @NotNull le.m savePngUseCase, @NotNull com.planner5d.library.database.manager.a databaseManager) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(savePngUseCase, "savePngUseCase");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f160470a = userApiRequester;
        this.f160471b = userAuthorization;
        this.f160472c = savePngUseCase;
        this.f160473d = databaseManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(Uri uri, Function1<? super Long, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        AutoStyle autoStyle = new AutoStyle();
        autoStyle.G(new Date());
        autoStyle.M(uri.toString());
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new a(autoStyle, function1, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // nb.g
    @Nullable
    public Object a(@NotNull Context context, @Nullable Bitmap bitmap, @NotNull Function1<? super Long, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        Object objG;
        Uri uriA = this.f160472c.a(context, bitmap, "crop_image");
        return (uriA == null || (objG = g(uriA, function1, dVar)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objG;
    }

    @Override // nb.g
    @Nullable
    public Object b(@NotNull Context context, @NotNull AutoStyle autoStyle, @NotNull byte[] bArr, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(autoStyle, context, this, bArr, null), dVar);
    }
}

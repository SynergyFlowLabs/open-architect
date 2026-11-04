package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.c0;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPrepareProjectDataInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrepareProjectDataInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomstyle/interactor/PrepareProjectDataInteractor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class d implements pa.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135704d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f135705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f135706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f135707c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.PrepareProjectDataInteractor", f = "PrepareProjectDataInteractor.kt", i = {0}, l = {19}, m = "createNewProjectFromOtherProjectData", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135709b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135711d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135709b = obj;
            this.f135711d |= Integer.MIN_VALUE;
            return d.this.a(null, this);
        }
    }

    @ij.a
    public d(@NotNull d0 projectManager, @NotNull t userAuthorization, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f135705a = projectManager;
        this.f135706b = userAuthorization;
        this.f135707c = messageManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // pa.c
    @Nullable
    public Object a(@NotNull Project project, @NotNull kotlin.coroutines.d<? super Project> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f135711d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f135711d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objL = aVar.f135709b;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f135711d;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                c0 c0Var = c0.f225068a;
                Observable<Project> observableL = this.f135705a.L(this.f135706b.a(), null, true, null, project.data);
                Intrinsics.checkNotNullExpressionValue(observableL, "create(...)");
                aVar.f135708a = this;
                aVar.f135711d = 1;
                objL = c0Var.l(observableL, aVar);
                if (objL == objL2) {
                    return objL2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (d) aVar.f135708a;
                ResultKt.m(objL);
            }
            return (Project) objL;
        } catch (Throwable th2) {
            this.f135707c.c(th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    @Override // pa.c
    @Nullable
    public Object b(@NotNull JSONObject jSONObject, @NotNull kotlin.coroutines.d<? super byte[]> dVar) throws JSONException {
        Object obj;
        JSONArray jSONArray = null;
        if (!jSONObject.has("items")) {
            jSONObject = null;
        }
        JSONArray jSONArray2 = jSONObject != null ? jSONObject.getJSONArray("items") : null;
        if (jSONArray2 == null) {
            obj = null;
        } else {
            if (jSONArray2.length() <= 0) {
                jSONArray2 = null;
            }
            if (jSONArray2 != null) {
                obj = jSONArray2.get(0);
            } else {
                obj = null;
            }
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 != null) {
            if (!jSONObject2.has("items")) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                jSONArray = jSONObject2.getJSONArray("items");
            }
        }
        byte[] bytes = String.valueOf(jSONArray).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}

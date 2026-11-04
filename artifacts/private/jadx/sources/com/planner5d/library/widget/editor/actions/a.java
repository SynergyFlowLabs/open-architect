package com.planner5d.library.widget.editor.actions;

import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.r;
import com.planner5d.library.widget.editor.helper.c2;
import com.planner5d.library.widget.editor.helper.m1;
import com.planner5d.library.widget.editor.helper.y1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDefaultAiChatCommandsExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAiChatCommandsExecutor.kt\ncom/planner5d/library/widget/editor/actions/DefaultAiChatCommandsExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1863#2,2:92\n*S KotlinDebug\n*F\n+ 1 DefaultAiChatCommandsExecutor.kt\ncom/planner5d/library/widget/editor/actions/DefaultAiChatCommandsExecutor\n*L\n26#1:92,2\n*E\n"})
public final class a implements ta.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f254332f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f254333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m1 f254334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c2 f254335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y1 f254336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t1 f254337e;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.actions.a$a, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.widget.editor.actions.DefaultAiChatCommandsExecutor", f = "DefaultAiChatCommandsExecutor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "addItem", n = {}, s = {})
    static final class C1722a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f254338a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f254340c;

        C1722a(kotlin.coroutines.d<? super C1722a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254338a = obj;
            this.f254340c |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    static final class b implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f254341a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            throw new IllegalArgumentException("Not sure where to add item because position is null");
        }
    }

    @f(c = "com.planner5d.library.widget.editor.actions.DefaultAiChatCommandsExecutor", f = "DefaultAiChatCommandsExecutor.kt", i = {0, 0}, l = {30}, m = "executeCommands", n = {"this", "actionJson"}, s = {"L$0", "L$2"})
    static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f254343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f254344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f254345d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f254347f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254345d = obj;
            this.f254347f |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    public a(@NotNull i builtInDataManager, @NotNull m1 helperEditorAddItem, @NotNull c2 helperEditorEditItem, @NotNull y1 helperEditorDeleteItem, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(helperEditorAddItem, "helperEditorAddItem");
        Intrinsics.checkNotNullParameter(helperEditorEditItem, "helperEditorEditItem");
        Intrinsics.checkNotNullParameter(helperEditorDeleteItem, "helperEditorDeleteItem");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f254333a = builtInDataManager;
        this.f254334b = helperEditorAddItem;
        this.f254335c = helperEditorEditItem;
        this.f254336d = helperEditorDeleteItem;
        this.f254337e = logRecordManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object c(JSONObject jSONObject, kotlin.coroutines.d<? super Unit> dVar) {
        C1722a c1722a;
        if (dVar instanceof C1722a) {
            c1722a = (C1722a) dVar;
            int i10 = c1722a.f254340c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1722a.f254340c = i10 - Integer.MIN_VALUE;
            } else {
                c1722a = new C1722a(dVar);
            }
        } else {
            c1722a = new C1722a(dVar);
        }
        C1722a c1722a2 = c1722a;
        Object objK = c1722a2.f254338a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1722a2.f254340c;
        try {
            if (i11 == 0) {
                ResultKt.m(objK);
                JSONObject jSONObjectF = f(jSONObject);
                Uri uriCreateItemUri = ItemBuilder.createItemUri(this.f254333a.w(jSONObjectF.getString(r.aiChatItemId.f224891a)));
                Intrinsics.checkNotNull(jSONObjectF);
                m mVarG = g(jSONObjectF);
                if (mVarG != null) {
                    m1 m1Var = this.f254334b;
                    Intrinsics.checkNotNull(uriCreateItemUri);
                    float fH = h(jSONObjectF);
                    o3.g gVar = o3.g.ai_chat;
                    c1722a2.f254340c = 1;
                    objK = m1Var.k(uriCreateItemUri, mVarG, fH, null, gVar, c1722a2);
                    if (objK == objL) {
                        return objL;
                    }
                } else {
                    b bVar = b.f254341a;
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objK);
            kotlin.coroutines.jvm.internal.b.a(((Boolean) objK).booleanValue());
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to add item", new Object[0]);
        }
        return Unit.f312394a;
    }

    private final void d(JSONObject jSONObject) {
        try {
            y1 y1Var = this.f254336d;
            String string = f(jSONObject).getString(r.puid.f224891a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            y1Var.a(string);
        } catch (JSONException e10) {
            timber.log.b.f381052a.f(e10, "Failed to delete item", new Object[0]);
        }
    }

    private final void e(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectF = f(jSONObject);
            String string = jSONObjectF.getString(r.puid.f224891a);
            c2 c2Var = this.f254335c;
            Intrinsics.checkNotNull(string);
            c2Var.b(string, jSONObjectF);
        } catch (JSONException e10) {
            timber.log.b.f381052a.f(e10, "Failed to edit item", new Object[0]);
        }
    }

    private final JSONObject f(JSONObject jSONObject) throws JSONException {
        return jSONObject.getJSONObject(r.aiChatParams.f224891a);
    }

    private final m g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(r.position.f224891a);
        if (jSONArrayOptJSONArray != null) {
            return new m((float) jSONArrayOptJSONArray.getDouble(0), (float) jSONArrayOptJSONArray.getDouble(1), (float) jSONArrayOptJSONArray.getDouble(2));
        }
        return null;
    }

    private final float h(JSONObject jSONObject) {
        return (float) jSONObject.optDouble(r.rotation.f224891a, 0.0d);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009f -> B:33:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ta.a
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.List<? extends org.json.JSONObject> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.actions.a.a(java.util.List, kotlin.coroutines.d):java.lang.Object");
    }
}

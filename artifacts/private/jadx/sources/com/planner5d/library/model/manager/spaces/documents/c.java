package com.planner5d.library.model.manager.spaces.documents;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.f1;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nDocumentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,673:1\n1485#2:674\n1510#2,3:675\n1513#2,3:685\n1948#2,14:691\n295#2,2:705\n1485#2:708\n1510#2,3:709\n1513#2,3:719\n1948#2,14:725\n381#3,7:678\n381#3,7:712\n126#4:688\n153#4,2:689\n155#4:707\n126#4:722\n153#4,2:723\n155#4:739\n*S KotlinDebug\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager\n*L\n523#1:674\n523#1:675,3\n523#1:685,3\n527#1:691,14\n529#1:705,2\n538#1:708\n538#1:709,3\n538#1:719,3\n542#1:725,14\n523#1:678,7\n538#1:712,7\n523#1:688\n523#1:689,2\n523#1:707\n538#1:722\n538#1:723,2\n538#1:739\n*E\n"})
public final class c implements x1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final a f197812w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f197813x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f197814y = 30;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f197815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.i> f197816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.upload.a f197817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.upload.g f197818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.model.spaces.documents.d f197819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.r f197820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final f1 f197821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final y0 f197822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.b f197823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f197824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f197825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.a f197826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.database.model.spaces.documents.a f197827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.activity.fragment.spaces.view.d> f197828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<com.planner5d.library.database.model.spaces.documents.a> f197829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f197830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f197831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private String f197832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private c1<com.planner5d.library.activity.fragment.spaces.view.d> f197833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f197834v;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAPageOfDocuments$2", f = "DocumentsManager.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    static final class a0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197835a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f197837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f197838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f197839e;

        /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<JSONObject, com.planner5d.library.database.model.spaces.documents.a> {
            a(Object obj) {
                super(1, obj, com.planner5d.library.model.manager.spaces.a.class, "documentFromJSON", "documentFromJSON(Lorg/json/JSONObject;)Lcom/planner5d/library/database/model/spaces/documents/Document;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final com.planner5d.library.database.model.spaces.documents.a invoke(JSONObject p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return ((com.planner5d.library.model.manager.spaces.a) this.receiver).a(p10);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAPageOfDocuments$2$response$1", f = "DocumentsManager.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.g.f44098r}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197840a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197841b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f197842c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f197843d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f197844e;

            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAPageOfDocuments$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f197845a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f197846b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f197847c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f197848d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f197849e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f197850f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(String str, String str2, int i10, kotlin.coroutines.d<? super a> dVar) {
                    super(3, dVar);
                    this.f197848d = str;
                    this.f197849e = str2;
                    this.f197850f = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f197845a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f197846b;
                    id.a aVar = (id.a) this.f197847c;
                    String str = this.f197848d;
                    String str2 = this.f197849e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    return bVar.o(aVar, str, str2, false, 30, this.f197850f);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    a aVar2 = new a(this.f197848d, this.f197849e, this.f197850f, dVar);
                    aVar2.f197846b = bVar;
                    aVar2.f197847c = aVar;
                    return aVar2.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, String str, String str2, int i10, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f197841b = cVar;
                this.f197842c = str;
                this.f197843d = str2;
                this.f197844e = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new b(this.f197841b, this.f197842c, this.f197843d, this.f197844e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197840a;
                int i11 = 7 ^ 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f197841b.f197824l;
                id.a aVarA = this.f197841b.f197825m.a();
                a aVar = new a(this.f197842c, this.f197843d, this.f197844e, null);
                this.f197840a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, String str2, int i10, kotlin.coroutines.d<? super a0> dVar) {
            super(1, dVar);
            this.f197837c = str;
            this.f197838d = str2;
            this.f197839e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new a0(this.f197837c, this.f197838d, this.f197839e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197835a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                b bVar = new b(cVar, this.f197837c, this.f197838d, this.f197839e, null);
                this.f197835a = 1;
                obj = cVar.L0(bVar, this);
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
            if (cVar2 == null) {
                return CollectionsKt.emptyList();
            }
            try {
                return c.this.f197826n.e(cVar2.a(), new a(c.this.f197826n));
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Error while parsing documents from response:" + cVar2, new Object[0]);
                return CollectionsKt.emptyList();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return ((a0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$createOrUpdateFolder$2", f = "DocumentsManager.kt", i = {1}, l = {350, CropImageOptions.S3, 374}, m = "invokeSuspend", n = {"spaceHash"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197852b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f197854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f197855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f197856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f197857g;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$createOrUpdateFolder$2$response$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f197859b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f197860c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f197861d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f197862e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ JSONObject f197863f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f197864g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, String str, JSONObject jSONObject, String str2, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f197861d = z10;
                this.f197862e = str;
                this.f197863f = jSONObject;
                this.f197864g = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f197858a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f197859b;
                id.a aVar = (id.a) this.f197860c;
                return this.f197861d ? bVar.T0(aVar, this.f197862e, this.f197863f) : bVar.O0(aVar, this.f197862e, this.f197864g, this.f197863f);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f197861d, this.f197862e, this.f197863f, this.f197864g, dVar);
                aVar2.f197859b = bVar;
                aVar2.f197860c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, String str, List<String> list, String str2, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f197854d = z10;
            this.f197855e = str;
            this.f197856f = list;
            this.f197857g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new b(this.f197854d, this.f197855e, this.f197856f, this.f197857g, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
        
            if (r1.J0(r14, r0, r20) == r7) goto L38;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAPageOfFolders$2", f = "DocumentsManager.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
    static final class b0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197865a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f197867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f197868d;

        /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<JSONObject, com.planner5d.library.database.model.spaces.documents.c> {
            a(Object obj) {
                super(1, obj, com.planner5d.library.model.manager.spaces.a.class, "folderFromJSON", "folderFromJSON(Lorg/json/JSONObject;)Lcom/planner5d/library/database/model/spaces/documents/DocumentFolder;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final com.planner5d.library.database.model.spaces.documents.c invoke(JSONObject p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return ((com.planner5d.library.model.manager.spaces.a) this.receiver).b(p10);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAPageOfFolders$2$response$1", f = "DocumentsManager.kt", i = {}, l = {436}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197870b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f197871c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f197872d;

            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAPageOfFolders$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f197873a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f197874b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f197875c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f197876d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f197877e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(String str, int i10, kotlin.coroutines.d<? super a> dVar) {
                    super(3, dVar);
                    this.f197876d = str;
                    this.f197877e = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f197873a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return ((com.planner5d.library.api.b) this.f197874b).z((id.a) this.f197875c, this.f197876d, false, 30, this.f197877e);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    a aVar2 = new a(this.f197876d, this.f197877e, dVar);
                    aVar2.f197874b = bVar;
                    aVar2.f197875c = aVar;
                    return aVar2.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, String str, int i10, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f197870b = cVar;
                this.f197871c = str;
                this.f197872d = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new b(this.f197870b, this.f197871c, this.f197872d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197869a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f197870b.f197824l;
                id.a aVarA = this.f197870b.f197825m.a();
                a aVar = new a(this.f197871c, this.f197872d, null);
                this.f197869a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(String str, int i10, kotlin.coroutines.d<? super b0> dVar) {
            super(1, dVar);
            this.f197867c = str;
            this.f197868d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new b0(this.f197867c, this.f197868d, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197865a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                b bVar = new b(cVar, this.f197867c, this.f197868d, null);
                this.f197865a = 1;
                obj = cVar.L0(bVar, this);
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
            if (cVar2 == null) {
                return CollectionsKt.emptyList();
            }
            try {
                return c.this.f197826n.e(cVar2.a(), new a(c.this.f197826n));
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Error while parsing folders from response:" + cVar2, new Object[0]);
                return CollectionsKt.emptyList();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return ((b0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteDocument$2", f = "DocumentsManager.kt", i = {}, l = {383, 385}, m = "invokeSuspend", n = {}, s = {})
    static final class C1611c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f197880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1611c(com.planner5d.library.database.model.spaces.documents.a aVar, c cVar, kotlin.coroutines.d<? super C1611c> dVar) {
            super(1, dVar);
            this.f197879b = aVar;
            this.f197880c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new C1611c(this.f197879b, this.f197880c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r6.o0(r1, r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 0
                int r1 = r5.f197878a
                r4 = 4
                r2 = 2
                r3 = 1
                r4 = 5
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                r4 = 2
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r6)
                goto L4e
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "onskl // unrb/uemcir/aerihieeo//o t/wte/   tfoscovl"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L20:
                kotlin.ResultKt.m(r6)
                goto L3f
            L24:
                kotlin.ResultKt.m(r6)
                com.planner5d.library.database.model.spaces.documents.a r6 = r5.f197879b
                boolean r6 = r6.r()
                if (r6 == 0) goto L3f
                com.planner5d.library.model.manager.spaces.documents.c r6 = r5.f197880c
                r4 = 3
                com.planner5d.library.database.model.spaces.documents.a r1 = r5.f197879b
                r4 = 6
                r5.f197878a = r3
                java.lang.Object r6 = com.planner5d.library.model.manager.spaces.documents.c.c(r6, r1, r5)
                r4 = 5
                if (r6 != r0) goto L3f
                goto L4c
            L3f:
                com.planner5d.library.model.manager.spaces.documents.c r6 = r5.f197880c
                com.planner5d.library.database.model.spaces.documents.a r1 = r5.f197879b
                r5.f197878a = r2
                r4 = 0
                java.lang.Object r5 = com.planner5d.library.model.manager.spaces.documents.c.d(r6, r1, r5)
                if (r5 != r0) goto L4e
            L4c:
                r4 = 3
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.C1611c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1611c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$loadAllFromPaginatedSource$2", f = "DocumentsManager.kt", i = {0, 0}, l = {583}, m = "invokeSuspend", n = {"result", "pageNumber"}, s = {"L$0", "I$0"})
    static final class c0<T> extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, kotlin.coroutines.d<? super List<? extends T>>, Object> f197884d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c0(Function2<? super Integer, ? super kotlin.coroutines.d<? super List<? extends T>>, ? extends Object> function2, kotlin.coroutines.d<? super c0> dVar) {
            super(1, dVar);
            this.f197884d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new c0(this.f197884d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0042 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0043  */
        /* JADX WARN: Code duplicated, block: B:15:0x0059 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:13:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 7
                int r1 = r6.f197883c
                r2 = 1
                r5 = r2
                if (r1 == 0) goto L21
                if (r1 != r2) goto L17
                int r1 = r6.f197882b
                java.lang.Object r3 = r6.f197881a
                java.util.List r3 = (java.util.List) r3
                kotlin.ResultKt.m(r7)
                goto L45
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "sbsweaeeh tn/rem ol// fo/ieluc/ i/i/rtoru ookevtc/n"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L21:
                kotlin.ResultKt.m(r7)
                r5 = 6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r3 = r7
                r7 = r2
            L2c:
                kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.d<? super java.util.List<? extends T>>, java.lang.Object> r1 = r6.f197884d
                int r4 = r7 + 1
                r5 = 3
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r7)
                r6.f197881a = r3
                r6.f197882b = r4
                r6.f197883c = r2
                java.lang.Object r7 = r1.invoke(r7, r6)
                r5 = 5
                if (r7 != r0) goto L43
                return r0
            L43:
                r5 = 2
                r1 = r4
            L45:
                java.util.List r7 = (java.util.List) r7
                r4 = r7
                r4 = r7
                r5 = 2
                java.util.Collection r4 = (java.util.Collection) r4
                r3.addAll(r4)
                r5 = 1
                int r7 = r7.size()
                r4 = 30
                r5 = 2
                if (r7 == r4) goto L5a
                return r3
            L5a:
                r7 = r1
                goto L2c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super List<T>> dVar) {
            return ((c0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteDocumentFromServer$2", f = "DocumentsManager.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197885a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197887c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteDocumentFromServer$2$1", f = "DocumentsManager.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197890c;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteDocumentFromServer$2$1$1", f = "DocumentsManager.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
            static final class C1612a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f197891a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f197892b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f197893c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ c f197894d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197895e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1612a(c cVar, com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super C1612a> dVar) {
                    super(3, dVar);
                    this.f197894d = cVar;
                    this.f197895e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.planner5d.library.api.b bVar;
                    id.a aVar;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f197891a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        bVar = (com.planner5d.library.api.b) this.f197892b;
                        id.a aVar2 = (id.a) this.f197893c;
                        com.planner5d.library.model.manager.spaces.b bVar2 = this.f197894d.f197823k;
                        this.f197892b = bVar;
                        this.f197893c = aVar2;
                        this.f197891a = 1;
                        Object objA = bVar2.A(this);
                        if (objA == objL) {
                            return objL;
                        }
                        aVar = aVar2;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (id.a) this.f197893c;
                        bVar = (com.planner5d.library.api.b) this.f197892b;
                        ResultKt.m(obj);
                    }
                    return bVar.N0(aVar, (String) obj, this.f197895e.o());
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1612a c1612a = new C1612a(this.f197894d, this.f197895e, dVar);
                    c1612a.f197892b = bVar;
                    c1612a.f197893c = aVar;
                    return c1612a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f197889b = cVar;
                this.f197890c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f197889b, this.f197890c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197888a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f197889b.f197824l;
                id.a aVarA = this.f197889b.f197825m.a();
                C1612a c1612a = new C1612a(this.f197889b, this.f197890c, null);
                this.f197888a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1612a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f197887c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new d(this.f197887c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197885a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            c cVar = c.this;
            a aVar = new a(cVar, this.f197887c, null);
            this.f197885a = 1;
            Object objL0 = cVar.L0(aVar, this);
            return objL0 == objL ? objL : objL0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$network$2", f = "DocumentsManager.kt", i = {}, l = {com.planner5d.library.widget.editor.editor2d.drawable.c.f254878a}, m = "invokeSuspend", n = {}, s = {})
    static final class d0<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f197897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d0(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super d0> dVar) {
            super(2, dVar);
            this.f197897b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d0(this.f197897b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197896a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super T>, Object> function1 = this.f197897b;
            this.f197896a = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((d0) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteDocumentLocally$2", f = "DocumentsManager.kt", i = {}, l = {398, 400}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f197900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.planner5d.library.database.model.spaces.documents.a aVar, c cVar, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f197899b = aVar;
            this.f197900c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new e(this.f197899b, this.f197900c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r6.a(r1, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f197898a
                r2 = 7
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r6)
                goto L4f
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1b:
                kotlin.ResultKt.m(r6)
                goto L3d
            L1f:
                kotlin.ResultKt.m(r6)
                com.planner5d.library.database.model.spaces.documents.a r6 = r5.f197899b
                java.lang.String r6 = r6.t()
                r4 = 1
                if (r6 == 0) goto L3d
                r4 = 5
                com.planner5d.library.model.manager.spaces.documents.c r1 = r5.f197900c
                com.planner5d.library.activity.helper.r r1 = com.planner5d.library.model.manager.spaces.documents.c.x(r1)
                r4 = 1
                r5.f197898a = r3
                java.lang.Object r6 = r1.v(r6, r5)
                r4 = 3
                if (r6 != r0) goto L3d
                goto L4e
            L3d:
                com.planner5d.library.model.manager.spaces.documents.c r6 = r5.f197900c
                com.planner5d.library.database.model.spaces.documents.d r6 = com.planner5d.library.model.manager.spaces.documents.c.q(r6)
                r4 = 4
                com.planner5d.library.database.model.spaces.documents.a r1 = r5.f197899b
                r5.f197898a = r2
                java.lang.Object r5 = r6.a(r1, r5)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                r4 = 5
                kotlin.Unit r5 = kotlin.Unit.f312394a
                r4 = 3
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$notifyFileUploaded$2", f = "DocumentsManager.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197901a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f197903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f197904d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$notifyFileUploaded$2$response$1", f = "DocumentsManager.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f197906b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f197907c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f197908d;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$e0$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$notifyFileUploaded$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
            static final class C1613a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f197909a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f197910b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f197911c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ c f197912d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ JSONObject f197913e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1613a(c cVar, JSONObject jSONObject, kotlin.coroutines.d<? super C1613a> dVar) {
                    super(3, dVar);
                    this.f197912d = cVar;
                    this.f197913e = jSONObject;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.planner5d.library.api.b bVar;
                    id.a aVar;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f197909a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        bVar = (com.planner5d.library.api.b) this.f197910b;
                        id.a aVar2 = (id.a) this.f197911c;
                        com.planner5d.library.model.manager.spaces.b bVar2 = this.f197912d.f197823k;
                        this.f197910b = bVar;
                        this.f197911c = aVar2;
                        this.f197909a = 1;
                        Object objA = bVar2.A(this);
                        if (objA == objL) {
                            return objL;
                        }
                        aVar = aVar2;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (id.a) this.f197911c;
                        bVar = (com.planner5d.library.api.b) this.f197910b;
                        ResultKt.m(obj);
                    }
                    return bVar.r(aVar, (String) obj, this.f197913e);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1613a c1613a = new C1613a(this.f197912d, this.f197913e, dVar);
                    c1613a.f197910b = bVar;
                    c1613a.f197911c = aVar;
                    return c1613a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f197906b = str;
                this.f197907c = str2;
                this.f197908d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f197906b, this.f197907c, this.f197908d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws JSONException {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197905a;
                int i11 = 3 | 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                JSONObject jSONObjectPut = new JSONObject().put(net.openid.appauth.x.f333313b, this.f197906b).put("folder", this.f197907c);
                com.planner5d.library.api.requests.c cVar = this.f197908d.f197824l;
                id.a aVarA = this.f197908d.f197825m.a();
                C1613a c1613a = new C1613a(this.f197908d, jSONObjectPut, null);
                this.f197905a = 1;
                int i12 = 5 & 2;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1613a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, String str2, kotlin.coroutines.d<? super e0> dVar) {
            super(1, dVar);
            this.f197903c = str;
            this.f197904d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new e0(this.f197903c, this.f197904d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197901a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                a aVar = new a(this.f197903c, this.f197904d, cVar, null);
                this.f197901a = 1;
                obj = cVar.L0(aVar, this);
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
            if (cVar2 == null) {
                return null;
            }
            return c.this.M0(cVar2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super String> dVar) {
            return ((e0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteFolder$2", f = "DocumentsManager.kt", i = {1, 2, 3}, l = {404, 408, 413, 414, androidx.constraintlayout.core.motion.utils.v.c.f44016q}, m = "invokeSuspend", n = {"folder", "folder", "folder"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDocumentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$deleteFolder$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,673:1\n1863#2,2:674\n*S KotlinDebug\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$deleteFolder$2\n*L\n413#1:674,2\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f197916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f197917d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f197919f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteFolder$2$1", f = "DocumentsManager.kt", i = {}, l = {com.google.api.client.http.a0.f115563p}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197921b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.database.model.spaces.documents.c f197922c;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$deleteFolder$2$1$1", f = "DocumentsManager.kt", i = {}, l = {410}, m = "invokeSuspend", n = {}, s = {})
            static final class C1614a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f197923a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f197924b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f197925c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ c f197926d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ com.planner5d.library.database.model.spaces.documents.c f197927e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1614a(c cVar, com.planner5d.library.database.model.spaces.documents.c cVar2, kotlin.coroutines.d<? super C1614a> dVar) {
                    super(3, dVar);
                    this.f197926d = cVar;
                    this.f197927e = cVar2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.planner5d.library.api.b bVar;
                    id.a aVar;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f197923a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        bVar = (com.planner5d.library.api.b) this.f197924b;
                        id.a aVar2 = (id.a) this.f197925c;
                        com.planner5d.library.model.manager.spaces.b bVar2 = this.f197926d.f197823k;
                        this.f197924b = bVar;
                        this.f197925c = aVar2;
                        this.f197923a = 1;
                        Object objA = bVar2.A(this);
                        if (objA == objL) {
                            return objL;
                        }
                        aVar = aVar2;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (id.a) this.f197925c;
                        bVar = (com.planner5d.library.api.b) this.f197924b;
                        ResultKt.m(obj);
                    }
                    return bVar.h0(aVar, (String) obj, this.f197927e.p());
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1614a c1614a = new C1614a(this.f197926d, this.f197927e, dVar);
                    c1614a.f197924b = bVar;
                    c1614a.f197925c = aVar;
                    return c1614a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, com.planner5d.library.database.model.spaces.documents.c cVar2, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f197921b = cVar;
                this.f197922c = cVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f197921b, this.f197922c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197920a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f197921b.f197824l;
                id.a aVarA = this.f197921b.f197825m.a();
                C1614a c1614a = new C1614a(this.f197921b, this.f197922c, null);
                this.f197920a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1614a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
            this.f197919f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new f(this.f197919f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ec A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:33:0x00d0->B:46:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
        
            if (r10 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
        
            if (r10.b(r5, r9) == r0) goto L40;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$prepareToDownloadForFolder$2", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super c1<com.planner5d.library.activity.fragment.spaces.view.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f197929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f197930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<com.planner5d.library.database.model.spaces.documents.a> f197931d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$prepareToDownloadForFolder$2$1$1", f = "DocumentsManager.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197933b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f197933b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f197933b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197932a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c cVar = this.f197933b;
                    this.f197932a = 1;
                    if (cVar.h1(this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, c cVar, List<com.planner5d.library.database.model.spaces.documents.a> list, kotlin.coroutines.d<? super f0> dVar) {
            super(1, dVar);
            this.f197929b = str;
            this.f197930c = cVar;
            this.f197931d = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(c cVar) {
            cVar.f197831s = true;
            kotlinx.coroutines.k.f(cVar.f197821i, com.planner5d.library.services.utility.s.f229729a.h(), null, new a(cVar, null), 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new f0(this.f197929b, this.f197930c, this.f197931d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f197928a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!Intrinsics.areEqual(this.f197929b, this.f197930c.f197832t) || !this.f197930c.f197831s) {
                this.f197930c.f197831s = false;
                this.f197930c.f197833u = new c1();
                this.f197930c.f197832t = this.f197929b;
                this.f197930c.f197829q.clear();
                this.f197930c.f197829q.addAll(this.f197931d);
                c cVar = this.f197930c;
                cVar.f197830r = cVar.f197829q.size();
                c1 c1Var = this.f197930c.f197833u;
                com.planner5d.library.activity.fragment.spaces.view.d.a aVar = com.planner5d.library.activity.fragment.spaces.view.d.f136400c;
                int i10 = this.f197930c.f197830r;
                final c cVar2 = this.f197930c;
                c1Var.o(aVar.f(i10, new Function0() { // from class: com.planner5d.library.model.manager.spaces.documents.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.f0.m(cVar2);
                    }
                }));
            }
            return this.f197930c.f197833u;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super c1<com.planner5d.library.activity.fragment.spaces.view.d>> dVar) {
            return ((f0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$downloadDocument$2", f = "DocumentsManager.kt", i = {}, l = {125, 127, 130, 132, 135, androidx.media2.widget.f.i.f59767c0}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197936c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197938e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f197938e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new g(this.f197938e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
        
            if (r9.s0(r1, r8) == r0) goto L46;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$saveDocumentListLocally$2", f = "DocumentsManager.kt", i = {}, l = {555}, m = "invokeSuspend", n = {}, s = {})
    static final class g0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197939a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<com.planner5d.library.database.model.spaces.documents.a> f197941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(List<com.planner5d.library.database.model.spaces.documents.a> list, kotlin.coroutines.d<? super g0> dVar) {
            super(1, dVar);
            this.f197941c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new g0(this.f197941c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197939a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
                List<com.planner5d.library.database.model.spaces.documents.a> list = this.f197941c;
                this.f197939a = 1;
                if (dVar.k(list, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((g0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$downloadFileToLocalStorage$2", f = "DocumentsManager.kt", i = {}, l = {androidx.media2.widget.f.i.f59799s0}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197942a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f197944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197945d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$downloadFileToLocalStorage$2$call$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super Call<okhttp3.g0>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197946a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f197947b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f197948c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f197949d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f197949d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f197946a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f197947b).w((id.a) this.f197948c, this.f197949d);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super Call<okhttp3.g0>> dVar) {
                a aVar2 = new a(this.f197949d, dVar);
                aVar2.f197947b = bVar;
                aVar2.f197948c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super h> dVar) {
            super(1, dVar);
            this.f197944c = str;
            this.f197945d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new h(this.f197944c, this.f197945d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h hVar;
            InputStream inputStreamByteStream;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197942a;
            int i11 = 7 ^ 0;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = c.this.f197824l;
                id.a aVarA = c.this.f197825m.a();
                a aVar = new a(this.f197944c, null);
                this.f197942a = 1;
                hVar = this;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, hVar, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                hVar = this;
            }
            try {
                okhttp3.g0 g0Var = (okhttp3.g0) ((Call) obj).execute().body();
                if (g0Var != null && (inputStreamByteStream = g0Var.byteStream()) != null) {
                    BufferedInputStream bufferedInputStream = inputStreamByteStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamByteStream : new BufferedInputStream(inputStreamByteStream, 8192);
                    com.planner5d.library.database.model.spaces.documents.a aVar2 = hVar.f197945d;
                    c cVar2 = c.this;
                    try {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(aVar2.t());
                        if (fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) {
                            fileExtensionFromUrl = MimeTypeMap.getSingleton().getExtensionFromMimeType(URLConnection.guessContentTypeFromStream(bufferedInputStream));
                        }
                        if (fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) {
                            fileExtensionFromUrl = "pdf";
                        }
                        Pair<FileOutputStream, Uri> pairD = cVar2.f197820h.D("Downloaded_File_" + new Date() + "." + fileExtensionFromUrl);
                        FileOutputStream fileOutputStreamComponent1 = pairD.component1();
                        Uri uriComponent2 = pairD.component2();
                        kotlin.io.b.l(bufferedInputStream, fileOutputStreamComponent1, 0, 2, null);
                        String string = uriComponent2.toString();
                        kotlin.io.c.a(bufferedInputStream, null);
                        return string;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(bufferedInputStream, th2);
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                timber.log.b.f381052a.f(th4, "Error while downloading and saving document file", new Object[0]);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super String> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$saveDocumentLocally$2", f = "DocumentsManager.kt", i = {}, l = {470, 473}, m = "invokeSuspend", n = {}, s = {})
    static final class h0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f197953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f197954e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(com.planner5d.library.database.model.spaces.documents.a aVar, c cVar, String str, kotlin.coroutines.d<? super h0> dVar) {
            super(1, dVar);
            this.f197952c = aVar;
            this.f197953d = cVar;
            this.f197954e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new h0(this.f197952c, this.f197953d, this.f197954e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
        
            if (r8.c1(r1, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 2
                int r1 = r7.f197951b
                r6 = 6
                r2 = 2
                r3 = 1
                r6 = 0
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r8)
                goto L86
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                java.lang.Object r1 = r7.f197950a
                com.planner5d.library.database.model.spaces.documents.a r1 = (com.planner5d.library.database.model.spaces.documents.a) r1
                kotlin.ResultKt.m(r8)
                goto L41
            L25:
                r6 = 3
                kotlin.ResultKt.m(r8)
                com.planner5d.library.database.model.spaces.documents.a r1 = r7.f197952c
                com.planner5d.library.model.manager.spaces.documents.c r8 = r7.f197953d
                r6 = 6
                com.planner5d.library.activity.helper.r r8 = com.planner5d.library.model.manager.spaces.documents.c.x(r8)
                r6 = 7
                java.lang.String r4 = r7.f197954e
                r7.f197950a = r1
                r7.f197951b = r3
                java.lang.Object r8 = r8.M(r4, r7)
                if (r8 != r0) goto L41
                r6 = 7
                goto L85
            L41:
                java.lang.String r8 = (java.lang.String) r8
                r1.D(r8)
                r6 = 5
                com.planner5d.library.database.model.spaces.documents.a r8 = r7.f197952c
                r6 = 7
                java.lang.String r1 = r8.t()
                r6 = 5
                java.util.Date r4 = new java.util.Date
                r4.<init>()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r6 = 3
                r5.append(r1)
                java.lang.String r1 = "_"
                r6 = 2
                r5.append(r1)
                r5.append(r4)
                java.lang.String r1 = r5.toString()
                r6 = 4
                r8.y(r1)
                com.planner5d.library.database.model.spaces.documents.a r8 = r7.f197952c
                r8.z(r3)
                r6 = 0
                com.planner5d.library.model.manager.spaces.documents.c r8 = r7.f197953d
                com.planner5d.library.database.model.spaces.documents.a r1 = r7.f197952c
                r3 = 0
                r6 = 7
                r7.f197950a = r3
                r7.f197951b = r2
                r6 = 5
                java.lang.Object r7 = com.planner5d.library.model.manager.spaces.documents.c.W(r8, r1, r7)
                if (r7 != r0) goto L86
            L85:
                return r0
            L86:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((h0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$errorWhileDownloading$2", f = "DocumentsManager.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f197958d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197960f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$errorWhileDownloading$2$1$1", f = "DocumentsManager.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197962b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197963c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f197962b = cVar;
                this.f197963c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f197962b, this.f197963c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197961a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c cVar = this.f197962b;
                    com.planner5d.library.database.model.spaces.documents.a aVar = this.f197963c;
                    this.f197961a = 1;
                    if (cVar.g1(aVar, this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super i> dVar) {
            super(1, dVar);
            this.f197960f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(c cVar, com.planner5d.library.database.model.spaces.documents.a aVar) {
            kotlinx.coroutines.k.f(cVar.f197821i, com.planner5d.library.services.utility.s.f229729a.h(), null, new a(cVar, aVar, null), 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new i(this.f197960f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ErrorMessageException errorMessageException;
            com.planner5d.library.services.upload.a aVar;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f197958d;
            if (i11 == 0) {
                ResultKt.m(obj);
                final c cVar = c.this;
                final com.planner5d.library.database.model.spaces.documents.a aVar2 = this.f197960f;
                cVar.n1(aVar2, com.planner5d.library.activity.fragment.spaces.view.d.f136400c.a(new Function0() { // from class: com.planner5d.library.model.manager.spaces.documents.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.i.m(cVar, aVar2);
                    }
                }));
                com.planner5d.library.services.upload.a aVar3 = c.this.f197817e;
                errorMessageException = new ErrorMessageException(com.planner5d.library.f.s.f169102f7, new String[0]);
                c cVar2 = c.this;
                this.f197955a = aVar3;
                this.f197956b = errorMessageException;
                this.f197957c = 0;
                this.f197958d = 1;
                Object objW0 = cVar2.w0(this);
                if (objW0 == objL) {
                    return objL;
                }
                obj = objW0;
                aVar = aVar3;
                i10 = 0;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f197957c;
                errorMessageException = (ErrorMessageException) this.f197956b;
                aVar = (com.planner5d.library.services.upload.a) this.f197955a;
                ResultKt.m(obj);
            }
            aVar.w(i10 != 0, errorMessageException, ((Number) obj).longValue());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$saveDocumentLocally$4", f = "DocumentsManager.kt", i = {}, l = {547}, m = "invokeSuspend", n = {}, s = {})
    static final class i0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197964a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super i0> dVar) {
            super(1, dVar);
            this.f197966c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new i0(this.f197966c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197964a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f197966c;
                this.f197964a = 1;
                if (dVar.h(aVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((i0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager", f = "DocumentsManager.kt", i = {}, l = {199}, m = "errorWhileUploading", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f197970d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197972f;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f197970d = obj;
            this.f197972f |= Integer.MIN_VALUE;
            return c.this.t0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$saveFolderListLocally$2", f = "DocumentsManager.kt", i = {}, l = {559}, m = "invokeSuspend", n = {}, s = {})
    static final class j0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197973a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<com.planner5d.library.database.model.spaces.documents.c> f197975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(List<com.planner5d.library.database.model.spaces.documents.c> list, kotlin.coroutines.d<? super j0> dVar) {
            super(1, dVar);
            this.f197975c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new j0(this.f197975c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197973a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
                List<com.planner5d.library.database.model.spaces.documents.c> list = this.f197975c;
                this.f197973a = 1;
                if (dVar.j(list, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((j0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$errorWhileUploading$2$1", f = "DocumentsManager.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197976a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f197978c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new k(this.f197978c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197976a;
            boolean z10 = false & true;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f197978c;
                this.f197976a = 1;
                if (cVar.v0(aVar, this) == objL) {
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
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$saveFolderLocally$2", f = "DocumentsManager.kt", i = {}, l = {551}, m = "invokeSuspend", n = {}, s = {})
    static final class k0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197979a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.c f197981c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(com.planner5d.library.database.model.spaces.documents.c cVar, kotlin.coroutines.d<? super k0> dVar) {
            super(1, dVar);
            this.f197981c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new k0(this.f197981c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197979a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
                com.planner5d.library.database.model.spaces.documents.c cVar = this.f197981c;
                this.f197979a = 1;
                if (dVar.i(cVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((k0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$finishDocumentCreation$2", f = "DocumentsManager.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197984c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197986e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super l> dVar) {
            super(1, dVar);
            this.f197986e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new l(this.f197986e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.services.upload.a aVar;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f197984c;
            if (i11 == 0) {
                ResultKt.m(obj);
                c.this.f1(this.f197986e, com.planner5d.library.activity.fragment.spaces.view.d.a.k(com.planner5d.library.activity.fragment.spaces.view.d.f136400c, null, 1, null));
                com.planner5d.library.services.upload.a aVar2 = c.this.f197817e;
                c cVar = c.this;
                this.f197982a = aVar2;
                this.f197983b = 1;
                this.f197984c = 1;
                Object objW0 = cVar.w0(this);
                if (objW0 == objL) {
                    return objL;
                }
                obj = objW0;
                aVar = aVar2;
                i10 = 1;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f197983b;
                aVar = (com.planner5d.library.services.upload.a) this.f197982a;
                ResultKt.m(obj);
            }
            aVar.w(i10 != 0, null, ((Number) obj).longValue());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$startDocumentDownload$2", f = "DocumentsManager.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    static final class l0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197989c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f197991e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super l0> dVar) {
            super(1, dVar);
            this.f197991e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new l0(this.f197991e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.services.upload.a aVar;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f197989c;
            if (i11 == 0) {
                ResultKt.m(obj);
                c.this.f1(this.f197991e, com.planner5d.library.activity.fragment.spaces.view.d.a.d(com.planner5d.library.activity.fragment.spaces.view.d.f136400c, null, 1, null));
                com.planner5d.library.services.upload.a aVar2 = c.this.f197817e;
                c cVar = c.this;
                this.f197987a = aVar2;
                this.f197988b = 1;
                this.f197989c = 1;
                Object objW0 = cVar.w0(this);
                if (objW0 == objL) {
                    return objL;
                }
                obj = objW0;
                aVar = aVar2;
                i10 = 1;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f197988b;
                aVar = (com.planner5d.library.services.upload.a) this.f197987a;
                ResultKt.m(obj);
            }
            aVar.w(i10 != 0, null, ((Number) obj).longValue());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((l0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentDownloadLink$2", f = "DocumentsManager.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197992a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f197994c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentDownloadLink$2$response$1", f = "DocumentsManager.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f197996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f197997c;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$m$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentDownloadLink$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
            static final class C1615a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f197998a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f197999b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f198000c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ c f198001d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f198002e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1615a(c cVar, String str, kotlin.coroutines.d<? super C1615a> dVar) {
                    super(3, dVar);
                    this.f198001d = cVar;
                    this.f198002e = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.planner5d.library.api.b bVar;
                    id.a aVar;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f197998a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        bVar = (com.planner5d.library.api.b) this.f197999b;
                        id.a aVar2 = (id.a) this.f198000c;
                        com.planner5d.library.model.manager.spaces.b bVar2 = this.f198001d.f197823k;
                        this.f197999b = bVar;
                        this.f198000c = aVar2;
                        this.f197998a = 1;
                        Object objA = bVar2.A(this);
                        if (objA == objL) {
                            return objL;
                        }
                        aVar = aVar2;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (id.a) this.f198000c;
                        bVar = (com.planner5d.library.api.b) this.f197999b;
                        ResultKt.m(obj);
                    }
                    return bVar.f(aVar, (String) obj, this.f198002e);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1615a c1615a = new C1615a(this.f198001d, this.f198002e, dVar);
                    c1615a.f197999b = bVar;
                    c1615a.f198000c = aVar;
                    return c1615a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, String str, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f197996b = cVar;
                this.f197997c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f197996b, this.f197997c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f197995a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f197996b.f197824l;
                id.a aVarA = this.f197996b.f197825m.a();
                C1615a c1615a = new C1615a(this.f197996b, this.f197997c, null);
                this.f197995a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1615a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, kotlin.coroutines.d<? super m> dVar) {
            super(1, dVar);
            this.f197994c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new m(this.f197994c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197992a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                a aVar = new a(cVar, this.f197994c, null);
                this.f197992a = 1;
                obj = cVar.L0(aVar, this);
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
            if (cVar2 == null) {
                return null;
            }
            try {
                return cVar2.a().getString("uri");
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "PARSING ERROR while parsing getDocumentDownloadLink response, " + cVar2, new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super String> dVar) {
            return ((m) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$startDownloadingList$2", f = "DocumentsManager.kt", i = {0}, l = {100}, m = "invokeSuspend", n = {"counter"}, s = {"I$0"})
    static final class m0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f198004b;

        m0(kotlin.coroutines.d<? super m0> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new m0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f198004b;
            if (i11 == 0) {
                ResultKt.m(obj);
                i10 = 0;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = this.f198003a;
                ResultKt.m(obj);
                i10 = i12;
            }
            while (!c.this.f197829q.isEmpty()) {
                int i13 = i10 + 1;
                c.this.f197833u.o(com.planner5d.library.activity.fragment.spaces.view.d.f136400c.b(c.this.f197830r, i10));
                c cVar = c.this;
                com.planner5d.library.database.model.spaces.documents.a aVar = (com.planner5d.library.database.model.spaces.documents.a) cVar.f197829q.removeFirst();
                this.f198003a = i13;
                this.f198004b = 1;
                if (cVar.q0(aVar, this) == objL) {
                    return objL;
                }
                i10 = i13;
            }
            c.this.f197831s = false;
            c.this.f197833u.o(com.planner5d.library.activity.fragment.spaces.view.d.f136400c.h());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((m0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentLocal$2", f = "DocumentsManager.kt", i = {}, l = {563}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198006a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f198008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, kotlin.coroutines.d<? super n> dVar) {
            super(1, dVar);
            this.f198008c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new n(this.f198008c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198006a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
            String str = this.f198008c;
            this.f198006a = 1;
            Object objD = dVar.d(str, this);
            return objD == objL ? objL : objD;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a> dVar) {
            return ((n) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$synchronize$2", f = "DocumentsManager.kt", i = {}, l = {631, 632, com.planner5d.planner5d.n.f264532d}, m = "invokeSuspend", n = {}, s = {})
    static final class n0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f198010b;

        n0(kotlin.coroutines.d<? super n0> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new n0(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>>) dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r8 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f198010b
                r2 = 3
                r6 = 5
                r3 = 2
                r4 = 1
                r6 = r4
                r5 = 0
                int r6 = r6 >> r5
                if (r1 == 0) goto L32
                r6 = 2
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1b
                kotlin.ResultKt.m(r8)
                r6 = 5
                goto L69
            L1b:
                r6 = 2
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 6
                r7.<init>(r8)
                throw r7
            L25:
                java.lang.Object r1 = r7.f198009a
                com.planner5d.library.model.manager.spaces.documents.c r1 = (com.planner5d.library.model.manager.spaces.documents.c) r1
                kotlin.ResultKt.m(r8)
                goto L5b
            L2d:
                r6 = 7
                kotlin.ResultKt.m(r8)
                goto L47
            L32:
                r6 = 1
                kotlin.ResultKt.m(r8)
                com.planner5d.library.model.manager.spaces.documents.c r8 = com.planner5d.library.model.manager.spaces.documents.c.this
                com.planner5d.library.model.manager.spaces.b r8 = com.planner5d.library.model.manager.spaces.documents.c.E(r8)
                r6 = 7
                r7.f198010b = r4
                java.lang.Object r8 = r8.A(r7)
                r6 = 7
                if (r8 != r0) goto L47
                goto L67
            L47:
                java.lang.String r8 = (java.lang.String) r8
                r6 = 4
                if (r8 == 0) goto L6d
                com.planner5d.library.model.manager.spaces.documents.c r1 = com.planner5d.library.model.manager.spaces.documents.c.this
                r6 = 7
                r7.f198009a = r1
                r7.f198010b = r3
                r6 = 3
                java.lang.Object r8 = com.planner5d.library.model.manager.spaces.documents.c.z(r1, r8, r7)
                if (r8 != r0) goto L5b
                goto L67
            L5b:
                r6 = 5
                r7.f198009a = r5
                r7.f198010b = r2
                java.lang.Object r8 = com.planner5d.library.model.manager.spaces.documents.c.r(r1, r5, r7)
                r6 = 2
                if (r8 != r0) goto L69
            L67:
                r6 = 5
                return r0
            L69:
                r6 = 2
                java.util.List r8 = (java.util.List) r8
                return r8
            L6d:
                r6 = 3
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return ((n0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager", f = "DocumentsManager.kt", i = {0, 0}, l = {325, 327}, m = "getDocuments", n = {"this", "parentFolderHash"}, s = {"L$0", "L$1"})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f198013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f198014c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198016e;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f198014c = obj;
            this.f198016e |= Integer.MIN_VALUE;
            return c.this.z0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$updateDocument$2", f = "DocumentsManager.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
    static final class o0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198017a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f198019c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super o0> dVar) {
            super(1, dVar);
            this.f198019c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new o0(this.f198019c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198017a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f198019c;
                this.f198017a = 1;
                if (cVar.c1(aVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((o0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentsFromApi$2", f = "DocumentsManager.kt", i = {1, 2}, l = {com.facebook.internal.p.f100033q, 496, 497}, m = "invokeSuspend", n = {"remoteList", "remoteList"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDocumentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$getDocumentsFromApi$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,673:1\n774#2:674\n865#2,2:675\n*S KotlinDebug\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$getDocumentsFromApi$2\n*L\n498#1:674\n498#1:675,2\n*E\n"})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f198021b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f198023d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentsFromApi$2$remoteList$1", f = "DocumentsManager.kt", i = {0}, l = {494, 494}, m = "invokeSuspend", n = {net.openid.appauth.f.c.f332989a}, s = {"I$0"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Integer, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f198024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f198025b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f198026c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ int f198027d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f198028e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f198029f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f198028e = cVar;
                this.f198029f = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f198028e, this.f198029f, dVar);
                aVar.f198027d = ((Number) obj).intValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>> dVar) {
                return k(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i10;
                c cVar;
                String str;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f198026c;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    i10 = this.f198027d;
                    cVar = this.f198028e;
                    String str2 = this.f198029f;
                    com.planner5d.library.model.manager.spaces.b bVar = cVar.f197823k;
                    this.f198024a = cVar;
                    this.f198025b = str2;
                    this.f198027d = i10;
                    this.f198026c = 1;
                    Object objA = bVar.A(this);
                    if (objA != objL) {
                        str = str2;
                        obj = objA;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                i10 = this.f198027d;
                str = (String) this.f198025b;
                cVar = (c) this.f198024a;
                ResultKt.m(obj);
                this.f198024a = null;
                this.f198025b = null;
                this.f198026c = 2;
                Object objP0 = cVar.P0(str, (String) obj, i10, this);
                return objP0 == objL ? objL : objP0;
            }

            public final Object k(int i10, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
                return ((a) create(Integer.valueOf(i10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, kotlin.coroutines.d<? super p> dVar) {
            super(1, dVar);
            this.f198023d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new p(this.f198023d, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:30:0x009f  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x0099 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            List listEmptyList;
            c cVar;
            List listV0;
            List list2;
            String str;
            ArrayList arrayList;
            com.planner5d.library.database.model.spaces.documents.a aVar;
            boolean zAreEqual;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198021b;
            int i11 = 2 | 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar2 = c.this;
                a aVar2 = new a(cVar2, this.f198023d, null);
                this.f198021b = 1;
                obj = cVar2.T0(aVar2, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    list = (List) this.f198020a;
                    ResultKt.m(obj);
                    listEmptyList = (List) obj;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    cVar = c.this;
                    listV0 = cVar.V0(listEmptyList, list);
                    this.f198020a = list;
                    this.f198021b = 3;
                    if (cVar.a1(listV0, this) != objL) {
                        list2 = list;
                    }
                    return objL;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f198020a;
                ResultKt.m(obj);
            }
            str = this.f198023d;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                aVar = (com.planner5d.library.database.model.spaces.documents.a) obj2;
                if (str == null) {
                    zAreEqual = false;
                } else {
                    zAreEqual = Intrinsics.areEqual(aVar.n(), str);
                }
                if (zAreEqual) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
            List list3 = (List) obj;
            c cVar3 = c.this;
            String str2 = this.f198023d;
            this.f198020a = list3;
            this.f198021b = 2;
            Object objB0 = cVar3.B0(str2, this);
            if (objB0 != objL) {
                list = list3;
                obj = objB0;
                listEmptyList = (List) obj;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                cVar = c.this;
                listV0 = cVar.V0(listEmptyList, list);
                this.f198020a = list;
                this.f198021b = 3;
                if (cVar.a1(listV0, this) != objL) {
                    list2 = list;
                    str = this.f198023d;
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        aVar = (com.planner5d.library.database.model.spaces.documents.a) obj2;
                        if (str == null) {
                            zAreEqual = false;
                        } else {
                            zAreEqual = Intrinsics.areEqual(aVar.n(), str);
                        }
                        if (zAreEqual) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
            }
            return objL;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return ((p) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$updateDocumentAfterDownload$2", f = "DocumentsManager.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    static final class p0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198030a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f198032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f198033d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(com.planner5d.library.database.model.spaces.documents.a aVar, String str, kotlin.coroutines.d<? super p0> dVar) {
            super(1, dVar);
            this.f198032c = aVar;
            this.f198033d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new p0(this.f198032c, this.f198033d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198030a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                com.planner5d.library.database.model.spaces.documents.a aVarK = com.planner5d.library.database.model.spaces.documents.a.k(this.f198032c, null, null, null, null, null, null, this.f198033d, true, false, 319, null);
                this.f198030a = 1;
                if (cVar.j1(aVarK, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((p0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getDocumentsInFolderLocal$2", f = "DocumentsManager.kt", i = {}, l = {572, 572, 574}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDocumentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$getDocumentsInFolderLocal$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,673:1\n1#2:674\n*E\n"})
    static final class q extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f198035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f198036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, c cVar, kotlin.coroutines.d<? super q> dVar) {
            super(1, dVar);
            this.f198035b = str;
            this.f198036c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new q(this.f198035b, this.f198036c, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006b  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            if (r7 == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            if (r7 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 6
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f198034a
                r2 = 3
                r5 = r2
                r3 = 2
                r4 = 4
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L19
                kotlin.ResultKt.m(r7)
                r5 = 2
                goto L50
            L19:
                r5 = 6
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 7
                throw r6
            L23:
                kotlin.ResultKt.m(r7)
                goto L7c
            L27:
                kotlin.ResultKt.m(r7)
                r5 = 0
                goto L66
            L2c:
                r5 = 7
                kotlin.ResultKt.m(r7)
                r5 = 7
                java.lang.String r7 = r6.f198035b
                if (r7 == 0) goto L54
                int r7 = r7.length()
                if (r7 != 0) goto L3c
                goto L54
            L3c:
                com.planner5d.library.model.manager.spaces.documents.c r7 = r6.f198036c
                com.planner5d.library.database.model.spaces.documents.d r7 = com.planner5d.library.model.manager.spaces.documents.c.q(r7)
                r5 = 0
                java.lang.String r1 = r6.f198035b
                r5 = 5
                r6.f198034a = r2
                java.lang.Object r7 = r7.c(r1, r6)
                r5 = 2
                if (r7 != r0) goto L50
                goto L7a
            L50:
                r5 = 6
                java.util.List r7 = (java.util.List) r7
                return r7
            L54:
                com.planner5d.library.model.manager.spaces.documents.c r7 = r6.f198036c
                r5 = 3
                com.planner5d.library.model.manager.spaces.b r7 = com.planner5d.library.model.manager.spaces.documents.c.E(r7)
                r5 = 2
                r6.f198034a = r4
                java.lang.Object r7 = r7.A(r6)
                if (r7 != r0) goto L66
                r5 = 0
                goto L7a
            L66:
                r5 = 2
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L86
                com.planner5d.library.model.manager.spaces.documents.c r1 = r6.f198036c
                r5 = 0
                com.planner5d.library.database.model.spaces.documents.d r1 = com.planner5d.library.model.manager.spaces.documents.c.q(r1)
                r6.f198034a = r3
                java.lang.Object r7 = r1.g(r7, r6)
                if (r7 != r0) goto L7c
            L7a:
                r5 = 0
                return r0
            L7c:
                r5 = 6
                java.util.List r7 = (java.util.List) r7
                r5 = 7
                if (r7 != 0) goto L84
                r5 = 0
                goto L86
            L84:
                r5 = 6
                return r7
            L86:
                r5 = 7
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
            return ((q) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$updateDocumentAfterUpload$2", f = "DocumentsManager.kt", i = {1, 2, 2}, l = {299, 301, 308, 311}, m = "invokeSuspend", n = {"localData", "localData", "toSave"}, s = {"L$0", "L$0", "L$1"})
    static final class q0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f198038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f198039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f198040d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f198042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f198043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f198044h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(com.planner5d.library.database.model.spaces.documents.a aVar, String str, com.planner5d.library.database.model.spaces.documents.a aVar2, kotlin.coroutines.d<? super q0> dVar) {
            super(1, dVar);
            this.f198042f = aVar;
            this.f198043g = str;
            this.f198044h = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new q0(this.f198042f, this.f198043g, this.f198044h, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ec A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        
            if (r8.a(r1, r7) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
        
            if (r8.c1(r3, r7) == r0) goto L52;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.q0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((q0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getFolderLocal$2", f = "DocumentsManager.kt", i = {}, l = {567}, m = "invokeSuspend", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198045a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f198047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, kotlin.coroutines.d<? super r> dVar) {
            super(1, dVar);
            this.f198047c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new r(this.f198047c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198045a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
            String str = this.f198047c;
            this.f198045a = 1;
            Object objE = dVar.e(str, this);
            return objE == objL ? objL : objE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
            return ((r) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$uploadDocument$2", f = "DocumentsManager.kt", i = {3, 5, 6}, l = {205, 209, 211, 215, 221, 223, 223, 224, 227, 229, 233}, m = "invokeSuspend", n = {"documentUpload", "hash", "hash"}, s = {"L$0", "L$0", "L$0"})
    static final class r0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f198049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f198050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f198051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198052e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f198054g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super r0> dVar) {
            super(1, dVar);
            this.f198054g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new r0(this.f198054g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00da A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {all -> 0x0064, blocks: (B:14:0x005f, B:41:0x00fd, B:38:0x00da), top: B:80:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:41:0x00fd A[Catch: all -> 0x0064, PHI: r1 r11
          0x00fd: PHI (r1v22 int) = (r1v29 int), (r1v30 int) binds: [B:39:0x00f9, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x00fd: PHI (r11v36 java.lang.Object) = (r11v34 java.lang.Object), (r11v0 java.lang.Object) binds: [B:39:0x00f9, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:14:0x005f, B:41:0x00fd, B:38:0x00da), top: B:80:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0113  */
        /* JADX WARN: Code duplicated, block: B:48:0x0130 A[PHI: r11
          0x0130: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v0 java.lang.Object) binds: [B:46:0x012c, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x0136  */
        /* JADX WARN: Code duplicated, block: B:53:0x0153  */
        /* JADX WARN: Code duplicated, block: B:57:0x0168  */
        /* JADX WARN: Code duplicated, block: B:60:0x017f  */
        /* JADX WARN: Code duplicated, block: B:61:0x0181  */
        /* JADX WARN: Code duplicated, block: B:64:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:67:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:70:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:75:0x01de  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        
            if (r11.t0(r1, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
        
            if (r11.t0(r1, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01d8, code lost:
        
            if (r11.t0(r1, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01ee, code lost:
        
            if (r11.t0(r1, r10) == r0) goto L77;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 528
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.r0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((r0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getFolders$2", f = "DocumentsManager.kt", i = {1}, l = {315, androidx.constraintlayout.core.motion.utils.v.a.f43974q, com.rabbitmq.client.a.f264844o}, m = "invokeSuspend", n = {"spaceHash"}, s = {"L$0"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f198056b;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new s(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>>) dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        
            if (r7 == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f198056b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = r4
                if (r1 == 0) goto L30
                r5 = 2
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L19
                r5 = 1
                kotlin.ResultKt.m(r7)
                goto L87
            L19:
                r5 = 7
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 6
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                java.lang.Object r1 = r6.f198055a
                r5 = 4
                java.lang.String r1 = (java.lang.String) r1
                kotlin.ResultKt.m(r7)
                goto L65
            L2c:
                kotlin.ResultKt.m(r7)
                goto L45
            L30:
                r5 = 6
                kotlin.ResultKt.m(r7)
                com.planner5d.library.model.manager.spaces.documents.c r7 = com.planner5d.library.model.manager.spaces.documents.c.this
                com.planner5d.library.model.manager.spaces.b r7 = com.planner5d.library.model.manager.spaces.documents.c.E(r7)
                r5 = 6
                r6.f198056b = r4
                java.lang.Object r7 = r7.A(r6)
                if (r7 != r0) goto L45
                r5 = 5
                goto L86
            L45:
                r1 = r7
                r1 = r7
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L51
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
                r5 = 4
                return r6
            L51:
                com.planner5d.library.model.manager.spaces.documents.c r7 = com.planner5d.library.model.manager.spaces.documents.c.this
                com.planner5d.library.database.model.spaces.documents.d r7 = com.planner5d.library.model.manager.spaces.documents.c.q(r7)
                r5 = 5
                r6.f198055a = r1
                r6.f198056b = r3
                java.lang.Object r7 = r7.f(r1, r6)
                r5 = 0
                if (r7 != r0) goto L65
                r5 = 4
                goto L86
            L65:
                java.util.List r7 = (java.util.List) r7
                r3 = r7
                java.util.Collection r3 = (java.util.Collection) r3
                r5 = 2
                if (r3 == 0) goto L79
                r5 = 0
                boolean r3 = r3.isEmpty()
                r5 = 4
                if (r3 == 0) goto L77
                r5 = 7
                goto L79
            L77:
                r5 = 3
                return r7
            L79:
                com.planner5d.library.model.manager.spaces.documents.c r7 = com.planner5d.library.model.manager.spaces.documents.c.this
                r3 = 0
                r6.f198055a = r3
                r6.f198056b = r2
                java.lang.Object r7 = com.planner5d.library.model.manager.spaces.documents.c.z(r7, r1, r6)
                if (r7 != r0) goto L87
            L86:
                return r0
            L87:
                java.util.List r7 = (java.util.List) r7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return ((s) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$uploadFile$2", f = "DocumentsManager.kt", i = {}, l = {274, 280}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDocumentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$uploadFile$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,673:1\n1#2:674\n*E\n"})
    static final class s0 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f198060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f198061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f198062e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$uploadFile$2$response$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super Response<String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f198063a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f198064b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f198065c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f198066d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f198067e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ okhttp3.e0 f198068f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, int i10, okhttp3.e0 e0Var, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f198066d = str;
                this.f198067e = i10;
                this.f198068f = e0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f198063a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f198064b).B((id.a) this.f198065c, this.f198066d, "0," + this.f198067e, this.f198068f).execute();
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super Response<String>> dVar) {
                a aVar2 = new a(this.f198066d, this.f198067e, this.f198068f, dVar);
                aVar2.f198064b = bVar;
                aVar2.f198065c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, int i10, String str2, kotlin.coroutines.d<? super s0> dVar) {
            super(1, dVar);
            this.f198060c = str;
            this.f198061d = i10;
            this.f198062e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new s0(this.f198060c, this.f198061d, this.f198062e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
        
            if (r12 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f198058a
                r2 = 2
                r3 = 0
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r12)
                goto Laf
            L14:
                r10 = 6
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r10 = 0
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r10 = 4
                r11.<init>(r12)
                r10 = 7
                throw r11
            L20:
                r10 = 2
                kotlin.ResultKt.m(r12)
                goto L3d
            L25:
                kotlin.ResultKt.m(r12)
                r10 = 7
                com.planner5d.library.model.manager.spaces.documents.c r12 = com.planner5d.library.model.manager.spaces.documents.c.this
                com.planner5d.library.activity.helper.r r12 = com.planner5d.library.model.manager.spaces.documents.c.x(r12)
                r10 = 2
                java.lang.String r1 = r11.f198060c
                r11.f198058a = r3
                r10 = 4
                java.lang.Object r12 = r12.w(r1, r11)
                r10 = 1
                if (r12 != r0) goto L3d
                goto Lae
            L3d:
                r4 = r12
                r10 = 5
                byte[] r4 = (byte[]) r4
                if (r4 == 0) goto Lbd
                r10 = 2
                okhttp3.e0$a r3 = okhttp3.e0.Companion
                okhttp3.x$a r12 = okhttp3.x.f334808e
                r10 = 5
                java.lang.String r1 = "application/octet-stream"
                r10 = 7
                okhttp3.x r5 = r12.d(r1)
                r10 = 1
                r8 = 6
                r10 = 1
                r9 = 0
                r6 = 0
                r7 = 0
                okhttp3.e0 r12 = okhttp3.e0.a.r(r3, r4, r5, r6, r7, r8, r9)
                int r1 = r11.f198061d
                long r3 = (long) r1
                r10 = 1
                long r5 = r12.contentLength()
                r10 = 3
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L83
                r10 = 7
                com.planner5d.library.model.manager.spaces.documents.c r12 = com.planner5d.library.model.manager.spaces.documents.c.this
                com.planner5d.library.database.model.spaces.documents.a r12 = com.planner5d.library.model.manager.spaces.documents.c.n(r12)
                if (r12 == 0) goto L7c
                com.planner5d.library.model.manager.spaces.documents.c r11 = com.planner5d.library.model.manager.spaces.documents.c.this
                r10 = 0
                com.planner5d.library.activity.fragment.spaces.view.d$a r0 = com.planner5d.library.activity.fragment.spaces.view.d.f136400c
                com.planner5d.library.activity.fragment.spaces.view.d r0 = r0.g()
                com.planner5d.library.model.manager.spaces.documents.c.g0(r11, r12, r0)
            L7c:
                r11 = 0
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r11)
                r10 = 7
                return r11
            L83:
                r10 = 6
                com.planner5d.library.model.manager.spaces.documents.c r1 = com.planner5d.library.model.manager.spaces.documents.c.this
                com.planner5d.library.api.requests.c r3 = com.planner5d.library.model.manager.spaces.documents.c.I(r1)
                com.planner5d.library.model.manager.spaces.documents.c r1 = com.planner5d.library.model.manager.spaces.documents.c.this
                r10 = 6
                com.planner5d.library.modules.user.user.t r1 = com.planner5d.library.model.manager.spaces.documents.c.J(r1)
                id.a r4 = r1.a()
                r10 = 7
                com.planner5d.library.model.manager.spaces.documents.c$s0$a r6 = new com.planner5d.library.model.manager.spaces.documents.c$s0$a
                java.lang.String r1 = r11.f198062e
                int r5 = r11.f198061d
                r7 = 6
                r7 = 0
                r10 = 1
                r6.<init>(r1, r5, r12, r7)
                r11.f198058a = r2
                r5 = 0
                r8 = 2
                r9 = 0
                r7 = r11
                java.lang.Object r12 = com.planner5d.library.api.requests.c.g(r3, r4, r5, r6, r7, r8, r9)
                if (r12 != r0) goto Laf
            Lae:
                return r0
            Laf:
                r10 = 4
                retrofit2.Response r12 = (retrofit2.Response) r12
                boolean r11 = r12.isSuccessful()
                r10 = 5
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r11)
                r10 = 5
                return r11
            Lbd:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                r10 = 4
                java.lang.String r12 = "File is null"
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.documents.c.s0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Boolean> dVar) {
            return ((s0) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getFoldersFromApi$2", f = "DocumentsManager.kt", i = {1, 2, 3}, l = {421, androidx.constraintlayout.core.motion.utils.v.c.f44020u, 428, 430}, m = "invokeSuspend", n = {"remoteFolders", "remoteFolders", "mergedList"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDocumentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$getFoldersFromApi$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,673:1\n295#2,2:674\n*S KotlinDebug\n*F\n+ 1 DocumentsManager.kt\ncom/planner5d/library/model/manager/spaces/documents/DocumentsManager$getFoldersFromApi$2\n*L\n422#1:674,2\n*E\n"})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f198070b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f198072d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getFoldersFromApi$2$remoteFolders$1", f = "DocumentsManager.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Integer, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f198073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ int f198074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f198075c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f198076d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f198075c = cVar;
                this.f198076d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f198075c, this.f198076d, dVar);
                aVar.f198074b = ((Number) obj).intValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>> dVar) {
                return k(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f198073a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                int i11 = this.f198074b;
                c cVar = this.f198075c;
                String str = this.f198076d;
                this.f198073a = 1;
                Object objR0 = cVar.R0(str, i11, this);
                return objR0 == objL ? objL : objR0;
            }

            public final Object k(int i10, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
                return ((a) create(Integer.valueOf(i10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, kotlin.coroutines.d<? super t> dVar) {
            super(1, dVar);
            this.f198072d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new t(this.f198072d, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[PHI: r1
          0x00c6: PHI (r1v4 java.util.List) = (r1v3 java.util.List), (r1v3 java.util.List), (r1v3 java.util.List), (r1v8 java.util.List) binds: [B:20:0x0068, B:28:0x008a, B:30:0x00c3, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00db A[PHI: r1 r11
          0x00db: PHI (r1v5 java.util.List) = (r1v4 java.util.List), (r1v10 java.util.List) binds: [B:33:0x00d7, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r11v15 java.lang.Object) = (r11v14 java.lang.Object), (r11v0 java.lang.Object) binds: [B:33:0x00d7, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            List listEmptyList;
            List listW0;
            c cVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198070b;
            Object obj2 = null;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar2 = c.this;
                a aVar = new a(cVar2, this.f198072d, null);
                this.f198070b = 1;
                obj = cVar2.T0(aVar, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    list = (List) this.f198069a;
                    ResultKt.m(obj);
                    com.planner5d.library.database.model.spaces.documents.d dVar = c.this.f197819g;
                    String str = this.f198072d;
                    this.f198069a = list;
                    this.f198070b = 3;
                    obj = dVar.f(str, this);
                    if (obj != objL) {
                    }
                    return objL;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) this.f198069a;
                    ResultKt.m(obj);
                    return list2;
                }
                list = (List) this.f198069a;
                ResultKt.m(obj);
            }
            listEmptyList = (List) obj;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            listW0 = c.this.W0(list, listEmptyList);
            cVar = c.this;
            this.f198069a = listW0;
            this.f198070b = 4;
            if (cVar.d1(listW0, this) != objL) {
                return objL;
            }
            return listW0;
            list = (List) obj;
            if (c.this.f197834v.getAndSet(true)) {
                com.planner5d.library.database.model.spaces.documents.d dVar2 = c.this.f197819g;
                String str2 = this.f198072d;
                this.f198069a = list;
                this.f198070b = 3;
                obj = dVar2.f(str2, this);
                if (obj != objL) {
                    listEmptyList = (List) obj;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    listW0 = c.this.W0(list, listEmptyList);
                    cVar = c.this;
                    this.f198069a = listW0;
                    this.f198070b = 4;
                    if (cVar.d1(listW0, this) != objL) {
                        return listW0;
                    }
                }
            } else {
                for (Object obj3 : list) {
                    if (((com.planner5d.library.database.model.spaces.documents.c) obj3).u()) {
                        obj2 = obj3;
                        break;
                    }
                }
                if (obj2 == null) {
                    c cVar3 = c.this;
                    String strR = androidx.core.content.d.r(cVar3.f197815c, com.planner5d.library.f.s.X6);
                    Intrinsics.checkNotNullExpressionValue(strR, "getString(...)");
                    List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{com.planner5d.library.database.model.spaces.documents.c.a.unsorted.n(), com.planner5d.library.database.model.spaces.documents.c.a.builtIn.n(), com.planner5d.library.database.model.spaces.documents.c.a.colorGreen.n()});
                    this.f198069a = list;
                    this.f198070b = 2;
                    if (cVar3.j0(strR, listListOf, this) != objL) {
                        com.planner5d.library.database.model.spaces.documents.d dVar3 = c.this.f197819g;
                        String str3 = this.f198072d;
                        this.f198069a = list;
                        this.f198070b = 3;
                        obj = dVar3.f(str3, this);
                        if (obj != objL) {
                            listEmptyList = (List) obj;
                            if (listEmptyList == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            listW0 = c.this.W0(list, listEmptyList);
                            cVar = c.this;
                            this.f198069a = listW0;
                            this.f198070b = 4;
                            if (cVar.d1(listW0, this) != objL) {
                                return listW0;
                            }
                        }
                    }
                } else {
                    com.planner5d.library.database.model.spaces.documents.d dVar4 = c.this.f197819g;
                    String str4 = this.f198072d;
                    this.f198069a = list;
                    this.f198070b = 3;
                    obj = dVar4.f(str4, this);
                    if (obj != objL) {
                        listEmptyList = (List) obj;
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        listW0 = c.this.W0(list, listEmptyList);
                        cVar = c.this;
                        this.f198069a = listW0;
                        this.f198070b = 4;
                        if (cVar.d1(listW0, this) != objL) {
                            return listW0;
                        }
                    }
                }
            }
            return objL;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
            return ((t) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getSingleDocumentFromApi$2", f = "DocumentsManager.kt", i = {}, l = {481}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f198079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f198080d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getSingleDocumentFromApi$2$response$1", f = "DocumentsManager.kt", i = {}, l = {482}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f198081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f198082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f198083c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f198084d;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$u$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getSingleDocumentFromApi$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1616a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f198085a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f198086b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f198087c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f198088d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f198089e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1616a(String str, String str2, kotlin.coroutines.d<? super C1616a> dVar) {
                    super(3, dVar);
                    this.f198088d = str;
                    this.f198089e = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f198085a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return ((com.planner5d.library.api.b) this.f198086b).o0((id.a) this.f198087c, this.f198088d, this.f198089e);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1616a c1616a = new C1616a(this.f198088d, this.f198089e, dVar);
                    c1616a.f198086b = bVar;
                    c1616a.f198087c = aVar;
                    return c1616a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, String str, String str2, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f198082b = cVar;
                this.f198083c = str;
                this.f198084d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f198082b, this.f198083c, this.f198084d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f198081a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f198082b.f197824l;
                id.a aVarA = this.f198082b.f197825m.a();
                C1616a c1616a = new C1616a(this.f198083c, this.f198084d, null);
                this.f198081a = 1;
                int i11 = 3 & 0;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1616a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, String str2, kotlin.coroutines.d<? super u> dVar) {
            super(1, dVar);
            this.f198079c = str;
            this.f198080d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new u(this.f198079c, this.f198080d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198077a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                a aVar = new a(cVar, this.f198079c, this.f198080d, null);
                this.f198077a = 1;
                obj = cVar.L0(aVar, this);
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
            if (cVar2 == null) {
                return null;
            }
            try {
                return c.this.f197826n.a(cVar2.a());
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Error while parsing a document from response:" + cVar2, new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a> dVar) {
            return ((u) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager", f = "DocumentsManager.kt", i = {0, 0, 1}, l = {334, 335, 334}, m = "getSingleFolder", n = {"this", "folderHash", "folderHash"}, s = {"L$0", "L$1", "L$0"})
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f198091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f198092c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198094e;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f198092c = obj;
            this.f198094e |= Integer.MIN_VALUE;
            return c.this.I0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getSingleFolderFromApi$2", f = "DocumentsManager.kt", i = {1, 1}, l = {453, 461}, m = "invokeSuspend", n = {io.sentry.protocol.n.f306405g, "folder"}, s = {"L$0", "L$1"})
    static final class w extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f198095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f198096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f198097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f198098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f198099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f198100f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getSingleFolderFromApi$2$response$1", f = "DocumentsManager.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f198101a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f198102b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f198103c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f198104d;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$w$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getSingleFolderFromApi$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1617a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f198105a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f198106b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f198107c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f198108d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f198109e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1617a(String str, String str2, kotlin.coroutines.d<? super C1617a> dVar) {
                    super(3, dVar);
                    this.f198108d = str;
                    this.f198109e = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f198105a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return ((com.planner5d.library.api.b) this.f198106b).W0((id.a) this.f198107c, this.f198108d, this.f198109e);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1617a c1617a = new C1617a(this.f198108d, this.f198109e, dVar);
                    c1617a.f198106b = bVar;
                    c1617a.f198107c = aVar;
                    return c1617a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, String str, String str2, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f198102b = cVar;
                this.f198103c = str;
                this.f198104d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f198102b, this.f198103c, this.f198104d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f198101a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = this.f198102b.f197824l;
                id.a aVarA = this.f198102b.f197825m.a();
                C1617a c1617a = new C1617a(this.f198103c, this.f198104d, null);
                this.f198101a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1617a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, c cVar, String str2, kotlin.coroutines.d<? super w> dVar) {
            super(1, dVar);
            this.f198098d = str;
            this.f198099e = cVar;
            this.f198100f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new w(this.f198098d, this.f198099e, this.f198100f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            com.planner5d.library.api.c cVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198097c;
            int i11 = 1 >> 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                String str = this.f198098d;
                if (str == null || str.length() == 0) {
                    timber.log.b.f381052a.d("Error while getting folder space hash is missing!", new Object[0]);
                    return null;
                }
                c cVar2 = this.f198099e;
                a aVar = new a(cVar2, this.f198098d, this.f198100f, null);
                this.f198097c = 1;
                obj = cVar2.L0(aVar, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.planner5d.library.database.model.spaces.documents.c cVar3 = (com.planner5d.library.database.model.spaces.documents.c) this.f198096b;
                cVar = (com.planner5d.library.api.c) this.f198095a;
                try {
                    ResultKt.m(obj);
                    return cVar3;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            timber.log.b.f381052a.f(th2, "Error while parsing folder from response:" + cVar, new Object[0]);
            return null;
            com.planner5d.library.api.c cVar4 = (com.planner5d.library.api.c) obj;
            if (cVar4 == null) {
                return null;
            }
            try {
                com.planner5d.library.database.model.spaces.documents.c cVarB = this.f198099e.f197826n.b(cVar4.a());
                c cVar5 = this.f198099e;
                this.f198095a = cVar4;
                this.f198096b = cVarB;
                this.f198097c = 2;
                if (cVar5.e1(cVarB, this) != objL) {
                    return cVarB;
                }
                return objL;
            } catch (Throwable th4) {
                th2 = th4;
                cVar = cVar4;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
            return ((w) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getUploadLink$2", f = "DocumentsManager.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    static final class x extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.model.manager.spaces.documents.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198110a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f198112c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getUploadLink$2$response$1", f = "DocumentsManager.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f198113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f198114b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f198115c;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.documents.c$x$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$getUploadLink$2$response$1$1", f = "DocumentsManager.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
            static final class C1618a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f198116a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f198117b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f198118c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ c f198119d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ JSONObject f198120e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1618a(c cVar, JSONObject jSONObject, kotlin.coroutines.d<? super C1618a> dVar) {
                    super(3, dVar);
                    this.f198119d = cVar;
                    this.f198120e = jSONObject;
                    int i10 = 6 >> 3;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.planner5d.library.api.b bVar;
                    id.a aVar;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f198116a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        bVar = (com.planner5d.library.api.b) this.f198117b;
                        id.a aVar2 = (id.a) this.f198118c;
                        com.planner5d.library.model.manager.spaces.b bVar2 = this.f198119d.f197823k;
                        this.f198117b = bVar;
                        this.f198118c = aVar2;
                        this.f198116a = 1;
                        Object objA = bVar2.A(this);
                        if (objA == objL) {
                            return objL;
                        }
                        aVar = aVar2;
                        obj = objA;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (id.a) this.f198118c;
                        bVar = (com.planner5d.library.api.b) this.f198117b;
                        ResultKt.m(obj);
                    }
                    return bVar.Q(aVar, (String) obj, this.f198120e);
                }

                @Override // pj.n
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                    C1618a c1618a = new C1618a(this.f198119d, this.f198120e, dVar);
                    c1618a.f198117b = bVar;
                    c1618a.f198118c = aVar;
                    return c1618a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f198114b = str;
                this.f198115c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f198114b, this.f198115c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws JSONException {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f198113a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                JSONObject jSONObjectPut = new JSONObject().put("name", this.f198114b);
                com.planner5d.library.api.requests.c cVar = this.f198115c.f197824l;
                id.a aVarA = this.f198115c.f197825m.a();
                C1618a c1618a = new C1618a(this.f198115c, jSONObjectPut, null);
                this.f198113a = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1618a, this, 2, null);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, kotlin.coroutines.d<? super x> dVar) {
            super(1, dVar);
            this.f198112c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new x(this.f198112c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198110a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                a aVar = new a(this.f198112c, cVar, null);
                this.f198110a = 1;
                obj = cVar.L0(aVar, this);
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
            if (cVar2 == null) {
                return null;
            }
            try {
                String string = cVar2.a().getString("uri");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = cVar2.a().getString(net.openid.appauth.x.f333313b);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return new com.planner5d.library.model.manager.spaces.documents.a(string, string2, cVar2.a().getInt("max_size"));
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "PARSING ERROR while parsing createUploadLinkForDocument response, " + cVar2, new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.model.manager.spaces.documents.a> dVar) {
            return ((x) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$handleRequest$2", f = "DocumentsManager.kt", i = {}, l = {600}, m = "invokeSuspend", n = {}, s = {})
    static final class y extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> f198122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(Function1<? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> function1, kotlin.coroutines.d<? super y> dVar) {
            super(1, dVar);
            this.f198122b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new y(this.f198122b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198121a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> function1 = this.f198122b;
                    this.f198121a = 1;
                    obj = function1.invoke(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) obj;
                if (cVar == null) {
                    return null;
                }
                if (!cVar.h()) {
                    return cVar;
                }
                timber.log.b.f381052a.d("Response error\nMessage:" + cVar.f(), new Object[0]);
                return null;
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Request error", new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((y) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.documents.DocumentsManager$inBackground$2", f = "DocumentsManager.kt", i = {}, l = {663}, m = "invokeSuspend", n = {}, s = {})
    static final class z<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f198123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f198124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super z> dVar) {
            super(2, dVar);
            this.f198124b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new z(this.f198124b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f198123a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super T>, Object> function1 = this.f198124b;
            this.f198123a = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((z) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull Application application, @NotNull fg.e<com.planner5d.library.model.manager.i> consumableIntentRepository, @NotNull com.planner5d.library.services.upload.a documentNotification, @NotNull com.planner5d.library.services.upload.g documentServiceStatus, @NotNull com.planner5d.library.database.model.spaces.documents.d documentsDao, @NotNull com.planner5d.library.activity.helper.r fileHelper, @NotNull f1 globalScope, @NotNull y0 imageManager, @NotNull com.planner5d.library.model.manager.spaces.b spacesManager, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.services.utility.p0 formatter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(consumableIntentRepository, "consumableIntentRepository");
        Intrinsics.checkNotNullParameter(documentNotification, "documentNotification");
        Intrinsics.checkNotNullParameter(documentServiceStatus, "documentServiceStatus");
        Intrinsics.checkNotNullParameter(documentsDao, "documentsDao");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(globalScope, "globalScope");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(spacesManager, "spacesManager");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f197815c = application;
        this.f197816d = consumableIntentRepository;
        this.f197817e = documentNotification;
        this.f197818f = documentServiceStatus;
        this.f197819g = documentsDao;
        this.f197820h = fileHelper;
        this.f197821i = globalScope;
        this.f197822j = imageManager;
        this.f197823k = spacesManager;
        this.f197824l = userApiRequester;
        this.f197825m = userAuthorization;
        this.f197826n = new com.planner5d.library.model.manager.spaces.a(formatter);
        this.f197828p = new c1<>();
        this.f197829q = new ArrayDeque<>();
        this.f197830r = 1;
        this.f197832t = "";
        this.f197833u = new c1<>();
        this.f197834v = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A0(String str, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
        return X0(new p(str, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B0(String str, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
        return N0(new q(str, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C0(String str, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
        return N0(new r(str, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E0(String str, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
        return X0(new t(str, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H0(String str, String str2, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a> dVar) {
        return X0(new u(str2, str, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J0(String str, String str2, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
        int i10 = 6 >> 0;
        return X0(new w(str, this, str2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K0(String str, kotlin.coroutines.d<? super com.planner5d.library.model.manager.spaces.documents.a> dVar) {
        return X0(new x(str, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L0(Function1<? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> function1, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
        return X0(new y(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String M0(com.planner5d.library.api.c cVar) throws RuntimeException {
        if (!cVar.h()) {
            return this.f197826n.d(cVar.a());
        }
        throw new RuntimeException("Response error \nMessage:" + cVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object N0(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new z(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O0(com.planner5d.library.database.model.spaces.documents.a aVar) {
        String strQ = aVar.q();
        if (strQ == null || strQ.length() == 0) {
            timber.log.b.f381052a.d("ERROR while uploading document. Document name can't be empty", new Object[0]);
            return false;
        }
        if (!aVar.u()) {
            timber.log.b.f381052a.d("ERROR while uploading document. File uri can't be empty", new Object[0]);
            return false;
        }
        String strN = aVar.n();
        if (strN != null && strN.length() != 0) {
            return true;
        }
        timber.log.b.f381052a.d("ERROR while uploading document. Folder can't be null", new Object[0]);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P0(String str, String str2, int i10, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
        return X0(new a0(str2, str, i10, null), dVar);
    }

    static /* synthetic */ Object Q0(c cVar, String str, String str2, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        return cVar.P0(str, str2, i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R0(String str, int i10, kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
        return X0(new b0(str, i10, null), dVar);
    }

    static /* synthetic */ Object S0(c cVar, String str, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return cVar.R0(str, i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object T0(Function2<? super Integer, ? super kotlin.coroutines.d<? super List<? extends T>>, ? extends Object> function2, kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return X0(new c0(function2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.planner5d.library.database.model.spaces.documents.a> V0(List<com.planner5d.library.database.model.spaces.documents.a> list, List<com.planner5d.library.database.model.spaces.documents.a> list2) {
        Object next;
        String strT;
        com.planner5d.library.database.model.spaces.documents.a aVar;
        List listPlus = CollectionsKt.plus((Collection) list, (Iterable) list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listPlus) {
            String strO = ((com.planner5d.library.database.model.spaces.documents.a) obj).o();
            Object arrayList = linkedHashMap.get(strO);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strO, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list3 = (List) ((Map.Entry) it.next()).getValue();
            if (list3.size() == 1) {
                aVar = (com.planner5d.library.database.model.spaces.documents.a) CollectionsKt.first(list3);
            } else {
                List list4 = list3;
                Iterator it2 = list4.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next2 = it2.next();
                if (it2.hasNext()) {
                    com.planner5d.library.database.model.spaces.documents.a aVar2 = (com.planner5d.library.database.model.spaces.documents.a) next2;
                    Date dateM = aVar2.m();
                    if (dateM == null && (dateM = aVar2.l()) == null) {
                        dateM = new Date();
                    }
                    do {
                        Object next3 = it2.next();
                        com.planner5d.library.database.model.spaces.documents.a aVar3 = (com.planner5d.library.database.model.spaces.documents.a) next3;
                        Date dateM2 = aVar3.m();
                        if (dateM2 == null && (dateM2 = aVar3.l()) == null) {
                            dateM2 = new Date();
                        }
                        if (dateM.compareTo(dateM2) < 0) {
                            next2 = next3;
                            dateM = dateM2;
                        }
                    } while (it2.hasNext());
                }
                com.planner5d.library.database.model.spaces.documents.a aVar4 = (com.planner5d.library.database.model.spaces.documents.a) next2;
                String strT2 = aVar4.t();
                if (strT2 == null || strT2.length() == 0) {
                    Iterator it3 = list4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        strT = ((com.planner5d.library.database.model.spaces.documents.a) next).t();
                    } while (strT == null || strT.length() == 0);
                    com.planner5d.library.database.model.spaces.documents.a aVar5 = (com.planner5d.library.database.model.spaces.documents.a) next;
                    aVar4.D(aVar5 != null ? aVar5.t() : null);
                }
                aVar = aVar4;
            }
            arrayList2.add(aVar);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.planner5d.library.database.model.spaces.documents.c> W0(List<com.planner5d.library.database.model.spaces.documents.c> list, List<com.planner5d.library.database.model.spaces.documents.c> list2) {
        Object objFirst;
        List listPlus = CollectionsKt.plus((Collection) list, (Iterable) list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listPlus) {
            String strP = ((com.planner5d.library.database.model.spaces.documents.c) obj).p();
            Object arrayList = linkedHashMap.get(strP);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strP, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list3 = (List) ((Map.Entry) it.next()).getValue();
            if (list3.size() == 1) {
                objFirst = CollectionsKt.first((List<? extends Object>) list3);
            } else {
                Iterator it2 = list3.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it2.next();
                if (it2.hasNext()) {
                    com.planner5d.library.database.model.spaces.documents.c cVar = (com.planner5d.library.database.model.spaces.documents.c) next;
                    Date dateO = cVar.o();
                    if (dateO == null && (dateO = cVar.n()) == null) {
                        dateO = new Date();
                    }
                    do {
                        Object next2 = it2.next();
                        com.planner5d.library.database.model.spaces.documents.c cVar2 = (com.planner5d.library.database.model.spaces.documents.c) next2;
                        Date dateO2 = cVar2.o();
                        if (dateO2 == null && (dateO2 = cVar2.n()) == null) {
                            dateO2 = new Date();
                        }
                        if (dateO.compareTo(dateO2) < 0) {
                            next = next2;
                            dateO = dateO2;
                        }
                    } while (it2.hasNext());
                }
                objFirst = next;
            }
            arrayList2.add((com.planner5d.library.database.model.spaces.documents.c) objFirst);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object X0(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new d0(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(String str, String str2, kotlin.coroutines.d<? super String> dVar) {
        return X0(new e0(str, str2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a1(List<com.planner5d.library.database.model.spaces.documents.a> list, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new g0(list, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c1(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new i0(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d1(List<com.planner5d.library.database.model.spaces.documents.c> list, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new j0(list, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e1(com.planner5d.library.database.model.spaces.documents.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new k0(cVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h1(kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new m0(null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k0(boolean z10, String str, List<String> list, String str2, kotlin.coroutines.d<? super Unit> dVar) {
        Object objX0 = X0(new b(z10, str, list, str2, null), dVar);
        return objX0 == kotlin.coroutines.intrinsics.b.l() ? objX0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k1(String str, com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new p0(aVar, str, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    static /* synthetic */ Object l0(c cVar, boolean z10, String str, List list, String str2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return cVar.k0(z10, str, list, str2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l1(com.planner5d.library.database.model.spaces.documents.a aVar, com.planner5d.library.database.model.spaces.documents.a aVar2, String str, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new q0(aVar, str, aVar2, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
        return X0(new d(aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(com.planner5d.library.database.model.spaces.documents.a aVar, com.planner5d.library.activity.fragment.spaces.view.d dVar) {
        com.planner5d.library.database.model.spaces.documents.a aVar2 = this.f197827o;
        if (aVar2 == null || !Intrinsics.areEqual(aVar.o(), aVar2.o())) {
            return;
        }
        this.f197828p.o(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new e(aVar, this, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p1(String str, String str2, int i10, kotlin.coroutines.d<? super Boolean> dVar) {
        return X0(new s0(str, i10, str2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r0(String str, com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super String> dVar) {
        return N0(new h(str, aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s0(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new i(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object t0(final com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        j jVar;
        com.planner5d.library.services.upload.a aVar2;
        ErrorMessageException errorMessageException;
        int i10;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i11 = jVar.f197972f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f197972f = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f197970d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = jVar.f197972f;
        if (i12 == 0) {
            ResultKt.m(obj);
            n1(aVar, com.planner5d.library.activity.fragment.spaces.view.d.f136400c.i(new Function0() { // from class: com.planner5d.library.model.manager.spaces.documents.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.u0(this.f197810a, aVar);
                }
            }));
            com.planner5d.library.services.upload.a aVar3 = this.f197817e;
            ErrorMessageException errorMessageException2 = new ErrorMessageException(com.planner5d.library.f.s.f169102f7, new String[0]);
            jVar.f197967a = aVar3;
            jVar.f197968b = errorMessageException2;
            jVar.f197969c = 0;
            jVar.f197972f = 1;
            Object objW0 = w0(jVar);
            if (objW0 == objL) {
                return objL;
            }
            aVar2 = aVar3;
            errorMessageException = errorMessageException2;
            obj = objW0;
            i10 = 0;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = jVar.f197969c;
            errorMessageException = (ErrorMessageException) jVar.f197968b;
            aVar2 = (com.planner5d.library.services.upload.a) jVar.f197967a;
            ResultKt.m(obj);
        }
        aVar2.w(i10 != 0, errorMessageException, ((Number) obj).longValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(c cVar, com.planner5d.library.database.model.spaces.documents.a aVar) {
        kotlinx.coroutines.k.f(cVar.f197821i, com.planner5d.library.services.utility.s.f229729a.h(), null, cVar.new k(aVar, null), 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w0(kotlin.coroutines.d<? super Long> dVar) {
        return this.f197816d.get().l(8, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x0(String str, kotlin.coroutines.d<? super String> dVar) {
        return X0(new m(str, null), dVar);
    }

    @Nullable
    public final Object D0(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> dVar) {
        return N0(new s(null), dVar);
    }

    @Nullable
    public final Object F0(@NotNull Bundle bundle, @NotNull kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
        String strU = com.planner5d.library.services.utility.j.u(new com.planner5d.library.services.utility.j(bundle), com.planner5d.library.services.r.hash, null, 2, null);
        if (strU != null) {
            return C0(strU, dVar);
        }
        return null;
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> G0() {
        return this.f197828p;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object I0(@NotNull String str, @NotNull kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> dVar) {
        v vVar;
        Object objJ0;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i10 = vVar.f198094e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f198094e = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(dVar);
            }
        } else {
            vVar = new v(dVar);
        }
        Object objE = vVar.f198092c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = vVar.f198094e;
        if (i11 == 0) {
            ResultKt.m(objE);
            com.planner5d.library.database.model.spaces.documents.d dVar2 = this.f197819g;
            vVar.f198090a = this;
            vVar.f198091b = str;
            vVar.f198094e = 1;
            objE = dVar2.e(str, vVar);
            if (objE == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            str = (String) vVar.f198091b;
            this = (c) vVar.f198090a;
            ResultKt.m(objE);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objE);
                return objE;
            }
            this = (c) vVar.f198091b;
            str = (String) vVar.f198090a;
            ResultKt.m(objE);
        }
        vVar.f198090a = null;
        vVar.f198091b = null;
        vVar.f198094e = 3;
        objJ0 = this.J0((String) objE, str, vVar);
        if (objJ0 != objL) {
            return objL;
        }
        return objJ0;
        com.planner5d.library.database.model.spaces.documents.c cVar = (com.planner5d.library.database.model.spaces.documents.c) objE;
        if (cVar != null) {
            return cVar;
        }
        com.planner5d.library.model.manager.spaces.b bVar = this.f197823k;
        vVar.f198090a = str;
        vVar.f198091b = this;
        vVar.f198094e = 2;
        objE = bVar.A(vVar);
        if (objE != objL) {
            vVar.f198090a = null;
            vVar.f198091b = null;
            vVar.f198094e = 3;
            objJ0 = this.J0((String) objE, str, vVar);
            if (objJ0 != objL) {
                return objJ0;
            }
        }
        return objL;
    }

    @Nullable
    public final com.planner5d.library.services.bitmaploader.d.C1663d U0(@NotNull com.planner5d.library.database.model.spaces.documents.a document, @NotNull com.planner5d.library.services.bitmaploader.target.a target, int i10) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(target, "target");
        if (document.u()) {
            return this.f197822j.i(document.t(), i10, i10, target, -5L);
        }
        target.j(null, null);
        return null;
    }

    @Nullable
    public final Object Z0(@NotNull List<com.planner5d.library.database.model.spaces.documents.a> list, @NotNull String str, @NotNull kotlin.coroutines.d<? super androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d>> dVar) {
        return N0(new f0(str, this, list, null), dVar);
    }

    @Nullable
    public final Object b1(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new h0(aVar, this, str, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> f1(@NotNull com.planner5d.library.database.model.spaces.documents.a document, @NotNull com.planner5d.library.activity.fragment.spaces.view.d originalState) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(originalState, "originalState");
        this.f197827o = document;
        this.f197828p.o(originalState);
        this.f197818f.d(document);
        return this.f197828p;
    }

    @Nullable
    public final Object g1(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new l0(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @Nullable
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> i0(@NotNull com.planner5d.library.database.model.spaces.documents.a document) {
        Intrinsics.checkNotNullParameter(document, "document");
        com.planner5d.library.database.model.spaces.documents.a aVar = this.f197827o;
        if (Intrinsics.areEqual(aVar != null ? aVar.o() : null, document.o())) {
            return this.f197828p;
        }
        return null;
    }

    @Nullable
    public final Object i1(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
        return N0(new n0(null), dVar);
    }

    @Nullable
    public final Object j0(@NotNull String str, @NotNull List<String> list, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objL0 = l0(this, true, str, list, null, dVar, 8, null);
        return objL0 == kotlin.coroutines.intrinsics.b.l() ? objL0 : Unit.f312394a;
    }

    @Nullable
    public final Object j1(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new o0(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @Nullable
    public final Object m0(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new C1611c(aVar, this, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @Nullable
    public final Object m1(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK0 = k0(false, str2, list, str, dVar);
        return objK0 == kotlin.coroutines.intrinsics.b.l() ? objK0 : Unit.f312394a;
    }

    @Nullable
    public final Object o1(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new r0(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @Nullable
    public final Object p0(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objX0 = X0(new f(str, null), dVar);
        return objX0 == kotlin.coroutines.intrinsics.b.l() ? objX0 : Unit.f312394a;
    }

    @Nullable
    public final Object q0(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new g(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @Nullable
    public final Object v0(@NotNull com.planner5d.library.database.model.spaces.documents.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN0 = N0(new l(aVar, null), dVar);
        return objN0 == kotlin.coroutines.intrinsics.b.l() ? objN0 : Unit.f312394a;
    }

    @Nullable
    public final Object y0(@NotNull String str, @NotNull kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a> dVar) {
        return N0(new n(str, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object z0(@Nullable String str, @NotNull kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> dVar) {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f198016e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f198016e = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object objB0 = oVar.f198014c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f198016e;
        if (i11 == 0) {
            ResultKt.m(objB0);
            oVar.f198012a = this;
            oVar.f198013b = str;
            oVar.f198016e = 1;
            objB0 = B0(str, oVar);
            if (objB0 != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objB0);
            return objB0;
        }
        str = (String) oVar.f198013b;
        this = (c) oVar.f198012a;
        ResultKt.m(objB0);
        List list = (List) objB0;
        List list2 = list;
        if ((list2 != null && !list2.isEmpty()) || str == null) {
            return list == null ? CollectionsKt.emptyList() : list;
        }
        oVar.f198012a = null;
        oVar.f198013b = null;
        oVar.f198016e = 2;
        Object objA0 = this.A0(str, oVar);
        if (objA0 != objL) {
            return objA0;
        }
        return objL;
    }
}

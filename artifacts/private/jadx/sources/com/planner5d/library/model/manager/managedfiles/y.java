package com.planner5d.library.model.manager.managedfiles;

import android.content.Context;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.manager.builtin.g0;
import com.planner5d.library.model.manager.builtin.v0;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.b2;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.i1;
import io.sentry.k4;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadManager.kt\ncom/planner5d/library/model/manager/managedfiles/DownloadManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"})
public final class y implements x1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f192097s = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f192098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.filedownloader.c f192099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<g0> f192100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.download.a f192101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final t1 f192102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final k5 f192103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v0 f192104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c2 f192105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final NetworkErrorUtility f192106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final i1 f192107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.i> f192108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final f1 f192109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f192110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f192111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private b f192112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private p f192113r;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager$1", f = "DownloadManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192114a;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.managedfiles.y$a$a, reason: collision with other inner class name */
        static final class C1597a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1597a<T> f192116a = new C1597a<>();

            C1597a() {
            }

            public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
                if (z10) {
                    com.planner5d.library.services.download.o.f224287a.b();
                }
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192114a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0<Boolean> z0VarB = y.this.f192107l.b();
                kotlinx.coroutines.flow.j<? super Boolean> jVar = C1597a.f192116a;
                this.f192114a = 1;
                if (z0VarB.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public enum b {
        DOWNLOADING,
        CHANGING_STATE,
        IDLE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f192121e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f192121e;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager", f = "DownloadManager.kt", i = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 6, 6, 6, 6}, l = {123, okhttp3.internal.ws.g.f334652s, 133, 135, com.planner5d.library.engine.input.f.b.F1, androidx.media2.widget.f.i.f59793p0, 159}, m = "download", n = {"this", "operations", "this", "operations", "idle", "updatedDatafile", "this", "operations", "idle", "updatedDatafile", "this", "operations", "idle", "updatedDatafile"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192126e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192128g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192126e = obj;
            this.f192128g |= Integer.MIN_VALUE;
            return y.this.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager", f = "DownloadManager.kt", i = {0, 0, 0, 0, 0}, l = {229}, m = "download", n = {"this", "operations", "downloaded", k4.f305718l3, "last"}, s = {"L$0", "L$1", "L$2", "J$0", "Z$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f192132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f192133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192134f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192136h;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192134f = obj;
            this.f192136h |= Integer.MIN_VALUE;
            return y.this.m(null, 0L, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager", f = "DownloadManager.kt", i = {0, 0, 0, 0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.U1, 264}, m = "download", n = {"this", "operations", com.facebook.share.internal.k.f101891c, k4.f305718l3, "operations", com.facebook.share.internal.k.f101891c}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f192140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192141e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192143g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192141e = obj;
            this.f192143g |= Integer.MIN_VALUE;
            return y.this.n(null, null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager$download$7$1", f = "DownloadManager.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super File>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f192145b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f192147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ManagedFile f192148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f192149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f192150g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p pVar, ManagedFile managedFile, File file, long j10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f192147d = pVar;
            this.f192148e = managedFile;
            this.f192149f = file;
            this.f192150g = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y.this.new f(this.f192147d, this.f192148e, this.f192149f, this.f192150g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.services.filedownloader.c cVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192145b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.filedownloader.c cVar2 = y.this.f192099d;
                p pVar = this.f192147d;
                ManagedFile managedFile = this.f192148e;
                this.f192144a = cVar2;
                this.f192145b = 1;
                Object objC = pVar.C(managedFile, this);
                if (objC == objL) {
                    return objL;
                }
                cVar = cVar2;
                obj = objC;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (com.planner5d.library.services.filedownloader.c) this.f192144a;
                ResultKt.m(obj);
            }
            return cVar.g((com.planner5d.library.services.download.g[]) obj, this.f192149f, this.f192148e.hash, this.f192150g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super File> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager", f = "DownloadManager.kt", i = {0}, l = {169}, m = "finishDownload", n = {"operations"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f192152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f192153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192155e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192157g;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192155e = obj;
            this.f192157g |= Integer.MIN_VALUE;
            return y.this.p(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager$start$2", f = "DownloadManager.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f192159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f192160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f192161d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, y yVar, p pVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f192159b = z10;
            this.f192160c = yVar;
            this.f192161d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f192159b, this.f192160c, this.f192161d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192158a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (this.f192159b) {
                    com.planner5d.library.services.download.o.f224287a.b();
                    ((g0) this.f192160c.f192100e.get()).s(true);
                    try {
                        ((g0) this.f192160c.f192100e.get()).r();
                    } catch (Throwable unused) {
                    }
                }
                y yVar = this.f192160c;
                p pVar = this.f192161d;
                this.f192158a = 1;
                if (yVar.o(pVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DownloadManager", f = "DownloadManager.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "stop", n = {"this"}, s = {"L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f192163b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192165d;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192163b = obj;
            this.f192165d |= Integer.MIN_VALUE;
            return y.this.r(this);
        }
    }

    @ij.a
    public y(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.services.filedownloader.c downloader, @NotNull fg.e<g0> helperDataUpdate, @NotNull com.planner5d.library.services.download.a downloadNotification, @NotNull t1 logRecordManager, @NotNull k5 textureManager, @NotNull v0 helperMaterials, @NotNull c2 networkStateUtility, @NotNull NetworkErrorUtility networkErrorUtility, @NotNull i1 internetStateMonitor, @NotNull fg.e<com.planner5d.library.model.manager.i> consumableIntentRepository, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(helperDataUpdate, "helperDataUpdate");
        Intrinsics.checkNotNullParameter(downloadNotification, "downloadNotification");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(helperMaterials, "helperMaterials");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(networkErrorUtility, "networkErrorUtility");
        Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
        Intrinsics.checkNotNullParameter(consumableIntentRepository, "consumableIntentRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f192098c = application;
        this.f192099d = downloader;
        this.f192100e = helperDataUpdate;
        this.f192101f = downloadNotification;
        this.f192102g = logRecordManager;
        this.f192103h = textureManager;
        this.f192104i = helperMaterials;
        this.f192105j = networkStateUtility;
        this.f192106k = networkErrorUtility;
        this.f192107l = internetStateMonitor;
        this.f192108m = consumableIntentRepository;
        this.f192109n = coroutineScope;
        this.f192110o = new Object();
        this.f192111p = new AtomicBoolean(false);
        this.f192112q = b.IDLE;
        kotlinx.coroutines.k.f(coroutineScope, com.planner5d.library.services.utility.s.f229729a.h(), null, new a(null), 2, null);
    }

    private final ErrorMessageException k(final Throwable th2) {
        if (!this.f192106k.isNetworkError(this.f192098c, th2)) {
            this.f192102g.v(new ij.c() { // from class: com.planner5d.library.model.manager.managedfiles.x
                @Override // ij.c
                public final Object get() {
                    return y.l(th2);
                }
            });
        }
        if (ErrorMessageException.isOutOfFreeSpace(this.f192098c, th2)) {
            return new ErrorMessageException(com.planner5d.library.f.s.O9, new String[0]);
        }
        return th2 instanceof ErrorMessageException ? (ErrorMessageException) th2 : new ErrorMessageException(com.planner5d.library.f.s.f169152h9, th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord l(Throwable th2) {
        return new LogRecord("download_files", null, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x0075, B:20:0x007d, B:25:0x0087, B:28:0x008f, B:30:0x009f, B:31:0x00b7), top: B:49:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x0075, B:20:0x007d, B:25:0x0087, B:28:0x008f, B:30:0x009f, B:31:0x00b7), top: B:49:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #0 {, blocks: (B:17:0x0075, B:20:0x007d, B:25:0x0087, B:28:0x008f, B:30:0x009f, B:31:0x00b7), top: B:49:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:17:0x0075, B:20:0x007d, B:25:0x0087, B:28:0x008f, B:30:0x009f, B:31:0x00b7), top: B:49:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, com.planner5d.library.model.ManagedFile] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e3 -> B:37:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(com.planner5d.library.model.manager.managedfiles.p r17, long r18, boolean r20, kotlin.coroutines.d<? super java.lang.Integer> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.managedfiles.y.m(com.planner5d.library.model.manager.managedfiles.p, long, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[Catch: all -> 0x00ac, TryCatch #5 {all -> 0x00ac, blocks: (B:34:0x008d, B:36:0x009c, B:40:0x00ae, B:42:0x00b4, B:50:0x00dc), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x00ac, TryCatch #5 {all -> 0x00ac, blocks: (B:34:0x008d, B:36:0x009c, B:40:0x00ae, B:42:0x00b4, B:50:0x00dc), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #5 {all -> 0x00ac, blocks: (B:34:0x008d, B:36:0x009c, B:40:0x00ae, B:42:0x00b4, B:50:0x00dc), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: all -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00ac, blocks: (B:34:0x008d, B:36:0x009c, B:40:0x00ae, B:42:0x00b4, B:50:0x00dc), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(p pVar, ManagedFile managedFile, long j10, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        e eVar;
        p pVar2;
        ManagedFile managedFile2;
        p pVar3;
        ManagedFile managedFile3;
        long j11;
        y yVar;
        long jLongValue;
        File fileD;
        z1 z1VarW;
        f fVar;
        p pVar4;
        y yVar2 = this;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f192143g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f192143g = i10 - Integer.MIN_VALUE;
            } else {
                eVar = yVar2.new e(dVar);
            }
        } else {
            eVar = yVar2.new e(dVar);
        }
        Object objL = eVar.f192141e;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f192143g;
        if (i11 != 0) {
            if (i11 == 1) {
                long j12 = eVar.f192140d;
                ManagedFile managedFile4 = (ManagedFile) eVar.f192139c;
                pVar3 = (p) eVar.f192138b;
                yVar2 = (y) eVar.f192137a;
                try {
                    ResultKt.m(objL);
                    managedFile3 = managedFile4;
                    j11 = j12;
                    yVar = yVar2;
                    try {
                        jLongValue = ((Number) objL).longValue();
                        if (yVar.f192103h.N(managedFile3)) {
                            yVar.f192101f.w(true, null, jLongValue);
                            yVar.f192103h.m(managedFile3);
                            pVar3.W(managedFile3);
                            return Unit.f312394a;
                        }
                        fileD = pVar3.D(managedFile3);
                        if (fileD != null) {
                            yVar.f192101f.w(true, null, jLongValue);
                            z1VarW = com.planner5d.library.services.utility.s.f229729a.d();
                            fVar = yVar.new f(pVar3, managedFile3, fileD, j11, null);
                            eVar.f192137a = pVar3;
                            eVar.f192138b = managedFile3;
                            eVar.f192139c = null;
                            eVar.f192143g = 2;
                            if (kotlinx.coroutines.i.h(z1VarW, fVar, eVar) != objL2) {
                                pVar4 = pVar3;
                                pVar4.W(managedFile3);
                            }
                            return objL2;
                        }
                        pVar3.S(managedFile3);
                        return Unit.f312394a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    managedFile3 = managedFile4;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ManagedFile managedFile5 = (ManagedFile) eVar.f192138b;
                pVar4 = (p) eVar.f192137a;
                try {
                    ResultKt.m(objL);
                    managedFile3 = managedFile5;
                    try {
                        pVar4.W(managedFile3);
                        return Unit.f312394a;
                    } catch (Throwable th4) {
                        th = th4;
                        pVar3 = pVar4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    pVar3 = pVar4;
                    managedFile3 = managedFile5;
                }
            }
            pVar3.S(managedFile3);
            throw th;
        }
        ResultKt.m(objL);
        try {
            com.planner5d.library.model.manager.i iVar = yVar2.f192108m.get();
            eVar.f192137a = yVar2;
            pVar2 = pVar;
            try {
                eVar.f192138b = pVar2;
                managedFile2 = managedFile;
                try {
                    eVar.f192139c = managedFile2;
                    eVar.f192140d = j10;
                    eVar.f192143g = 1;
                    objL = iVar.l(6, eVar);
                    if (objL != objL2) {
                        managedFile3 = managedFile2;
                        j11 = j10;
                        pVar3 = pVar2;
                        yVar = yVar2;
                        jLongValue = ((Number) objL).longValue();
                        if (yVar.f192103h.N(managedFile3)) {
                            yVar.f192101f.w(true, null, jLongValue);
                            yVar.f192103h.m(managedFile3);
                            pVar3.W(managedFile3);
                            return Unit.f312394a;
                        }
                        fileD = pVar3.D(managedFile3);
                        if (fileD != null) {
                            yVar.f192101f.w(true, null, jLongValue);
                            z1VarW = com.planner5d.library.services.utility.s.f229729a.d();
                            fVar = yVar.new f(pVar3, managedFile3, fileD, j11, null);
                            eVar.f192137a = pVar3;
                            eVar.f192138b = managedFile3;
                            eVar.f192139c = null;
                            eVar.f192143g = 2;
                            if (kotlinx.coroutines.i.h(z1VarW, fVar, eVar) != objL2) {
                                pVar4 = pVar3;
                                pVar4.W(managedFile3);
                            }
                        } else {
                            pVar3.S(managedFile3);
                        }
                        return Unit.f312394a;
                    }
                    return objL2;
                } catch (Throwable th6) {
                    th = th6;
                    pVar3 = pVar2;
                    managedFile3 = managedFile2;
                }
            } catch (Throwable th7) {
                th = th7;
                managedFile2 = managedFile;
                pVar3 = pVar2;
                managedFile3 = managedFile2;
                pVar3.S(managedFile3);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            pVar2 = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:51:0x0101, B:53:0x0105, B:56:0x0118, B:58:0x0120, B:62:0x012b, B:61:0x0128, B:16:0x0062, B:21:0x0078), top: B:84:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:51:0x0101, B:53:0x0105, B:56:0x0118, B:58:0x0120, B:62:0x012b, B:61:0x0128, B:16:0x0062, B:21:0x0078), top: B:84:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:51:0x0101, B:53:0x0105, B:56:0x0118, B:58:0x0120, B:62:0x012b, B:61:0x0128, B:16:0x0062, B:21:0x0078), top: B:84:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:0: B:26:0x0095->B:94:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r2.p(r0, null, r1) == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (r11.p(r10, r0, r1) == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016b, code lost:
    
        if (kotlinx.coroutines.d1.b(100, r1) == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0180, code lost:
    
        if (r11.p(r10, r0, r1) == r3) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.planner5d.library.model.manager.managedfiles.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.planner5d.library.model.manager.managedfiles.y] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.planner5d.library.model.manager.managedfiles.y] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.planner5d.library.model.manager.managedfiles.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.planner5d.library.model.manager.managedfiles.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.jvm.internal.i1$f] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.jvm.internal.i1$f] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x016b -> B:13:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.planner5d.library.model.manager.managedfiles.p r17, kotlin.coroutines.d<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.managedfiles.y.o(com.planner5d.library.model.manager.managedfiles.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object p(p pVar, ErrorMessageException errorMessageException, kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        p pVar2;
        com.planner5d.library.services.download.a aVar;
        int i10;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i11 = gVar.f192157g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f192157g = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f192155e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = gVar.f192157g;
        if (i12 == 0) {
            ResultKt.m(obj);
            if (errorMessageException != null) {
                v(pVar, b.IDLE, errorMessageException);
            }
            com.planner5d.library.services.download.a aVar2 = this.f192101f;
            com.planner5d.library.model.manager.i iVar = this.f192108m.get();
            gVar.f192151a = pVar;
            gVar.f192152b = aVar2;
            gVar.f192153c = errorMessageException;
            gVar.f192154d = 0;
            gVar.f192157g = 1;
            Object objL2 = iVar.l(6, gVar);
            if (objL2 == objL) {
                return objL;
            }
            pVar2 = pVar;
            aVar = aVar2;
            obj = objL2;
            i10 = 0;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = gVar.f192154d;
            errorMessageException = (ErrorMessageException) gVar.f192153c;
            aVar = (com.planner5d.library.services.download.a) gVar.f192152b;
            pVar2 = (p) gVar.f192151a;
            ResultKt.m(obj);
        }
        aVar.w(i10 != 0, errorMessageException, ((Number) obj).longValue());
        pVar2.x();
        return Unit.f312394a;
    }

    private final void t(b2 b2Var) throws ErrorMessageException {
        if (b2Var != b2.OFFLINE) {
            return;
        }
        throw new ErrorMessageException(com.planner5d.library.f.s.I9, " - " + this.f192098c.getString(com.planner5d.library.f.s.rs));
    }

    private final void u(Throwable th2) throws ErrorMessageException {
        String error = th2 instanceof ErrorMessageException ? ErrorMessageException.getError((Context) this.f192098c, (ErrorMessageException) th2) : null;
        if (error == null || !StringsKt.V2(error, com.planner5d.library.services.filedownloader.c.f224317g, false, 2, null)) {
            return;
        }
        try {
            this.f192100e.get().r();
        } catch (ErrorMessageException e10) {
            throw e10;
        } catch (Throwable th3) {
            throw new ErrorMessageException(com.planner5d.library.f.s.f169152h9, th3.getMessage() + ", " + error);
        }
    }

    @m1
    private final void v(p pVar, b bVar, ErrorMessageException errorMessageException) {
        synchronized (this.f192110o) {
            this.f192112q = bVar;
            this.f192113r = pVar;
            pVar.U(bVar, errorMessageException);
            Unit unit = Unit.f312394a;
        }
    }

    static /* synthetic */ void w(y yVar, p pVar, b bVar, ErrorMessageException errorMessageException, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            errorMessageException = null;
            int i11 = 7 | 0;
        }
        yVar.v(pVar, bVar, errorMessageException);
    }

    @m1
    public final void q(@NotNull p operations, boolean z10) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        synchronized (this.f192110o) {
            try {
                if (this.f192112q != b.IDLE) {
                    return;
                }
                w(this, operations, b.CHANGING_STATE, null, 4, null);
                Unit unit = Unit.f312394a;
                kotlinx.coroutines.k.f(this.f192109n, com.planner5d.library.services.utility.s.f229729a.d(), null, new h(z10, this, operations, null), 2, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object r(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        i iVar;
        y yVar;
        y yVar2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f192165d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f192165d = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f192163b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f192165d;
        if (i11 == 0) {
            ResultKt.m(obj);
            synchronized (this.f192110o) {
                try {
                    if (this.f192112q == b.IDLE) {
                        return Unit.f312394a;
                    }
                    p pVar = this.f192113r;
                    if (pVar != null) {
                        yVar = this;
                        w(yVar, pVar, b.CHANGING_STATE, null, 4, null);
                    } else {
                        yVar = this;
                    }
                    yVar.f192111p.set(true);
                    Unit unit = Unit.f312394a;
                    yVar2 = yVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar2 = (y) iVar.f192162a;
            ResultKt.m(obj);
        }
        while (yVar2.f192111p.get()) {
            iVar.f192162a = yVar2;
            iVar.f192165d = 1;
            if (d1.b(100L, iVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }
}

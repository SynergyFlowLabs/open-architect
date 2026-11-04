package com.planner5d.library.model.manager.managedfiles;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.manager.builtin.g0;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.b2;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.x2;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDatafileOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatafileOperations.kt\ncom/planner5d/library/model/manager/managedfiles/DatafileOperations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,509:1\n1#2:510\n1863#3,2:511\n37#4,2:513\n*S KotlinDebug\n*F\n+ 1 DatafileOperations.kt\ncom/planner5d/library/model/manager/managedfiles/DatafileOperations\n*L\n377#1:511,2\n407#1:513,2\n*E\n"})
public final class p implements r {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f192002y = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private v f192003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.d f192004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f192005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y f192006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f192007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f192008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final t0 f192009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.n f192010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final t f192011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f192012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.managedfiles.g f192013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c1 f192014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final p0 f192015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final a0 f192016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final g0 f192017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.p f192018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final k5 f192019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final c2 f192020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f192021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final Object f192022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Object f192023u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f192024v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final List<String> f192025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private Date f192026x;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f192027p = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.application.b f192028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final y f192029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.builtin.i f192030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.modules.user.user.t f192031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final t0 f192032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.builtin.n f192033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final t f192034g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.config.p f192035h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final c1 f192036i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final p0 f192037j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final a0 f192038k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final g0 f192039l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.builtin.p f192040m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private final k5 f192041n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private final c2 f192042o;

        @ij.a
        public a(@NotNull com.planner5d.library.application.b application, @NotNull y downloadManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull t0 userPurchases, @NotNull com.planner5d.library.model.manager.builtin.n dataManager, @NotNull t datafileRepository, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull c1 installationManager, @NotNull p0 formatter, @NotNull a0 managedFileManager, @NotNull g0 helperDataUpdate, @NotNull com.planner5d.library.model.manager.builtin.p datafileManager, @NotNull k5 textureManager, @NotNull c2 networkStateUtility) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
            Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
            Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
            Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
            Intrinsics.checkNotNullParameter(dataManager, "dataManager");
            Intrinsics.checkNotNullParameter(datafileRepository, "datafileRepository");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(installationManager, "installationManager");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
            Intrinsics.checkNotNullParameter(helperDataUpdate, "helperDataUpdate");
            Intrinsics.checkNotNullParameter(datafileManager, "datafileManager");
            Intrinsics.checkNotNullParameter(textureManager, "textureManager");
            Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
            this.f192028a = application;
            this.f192029b = downloadManager;
            this.f192030c = builtInDataManager;
            this.f192031d = userAuthorization;
            this.f192032e = userPurchases;
            this.f192033f = dataManager;
            this.f192034g = datafileRepository;
            this.f192035h = preferences;
            this.f192036i = installationManager;
            this.f192037j = formatter;
            this.f192038k = managedFileManager;
            this.f192039l = helperDataUpdate;
            this.f192040m = datafileManager;
            this.f192041n = textureManager;
            this.f192042o = networkStateUtility;
        }

        @m1
        @NotNull
        public final p a(@NotNull com.planner5d.library.model.d datafile) {
            Intrinsics.checkNotNullParameter(datafile, "datafile");
            v vVar = new v(datafile, null, y.b.IDLE, null, this.f192035h.l(com.planner5d.library.services.r.managedFilesDownloadPriority, 1), new String[0]);
            this.f192038k.r(vVar);
            return new p(vVar, datafile, this.f192028a, this.f192029b, this.f192030c, this.f192031d, this.f192032e, this.f192033f, this.f192034g, this.f192035h, new com.planner5d.library.model.manager.managedfiles.g(this.f192028a, this.f192035h), this.f192036i, this.f192037j, this.f192038k, this.f192039l, this.f192040m, this.f192041n, this.f192042o, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations$getDownloadUris$2", f = "DatafileOperations.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.a.f43976s}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDatafileOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatafileOperations.kt\ncom/planner5d/library/model/manager/managedfiles/DatafileOperations$getDownloadUris$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.services.download.g[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f192043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f192044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f192045c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ManagedFile f192047e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations$getDownloadUris$2$2$1", f = "DatafileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f192048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f192049b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f192049b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f192049b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f192048a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f192049b.f192017o.s(false);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ManagedFile managedFile, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f192047e = managedFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = p.this.new b(this.f192047e, dVar);
            bVar.f192045c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            ManagedFile managedFile;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192044b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.download.g[] gVarArrC = p.this.f192018p.c(p.this.f192004b, this.f192047e);
                if (gVarArrC.length == 0) {
                    gVarArrC = null;
                }
                if (gVarArrC != null) {
                    return gVarArrC;
                }
                p pVar2 = p.this;
                ManagedFile managedFile2 = this.f192047e;
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                a aVar = new a(pVar2, null);
                this.f192045c = pVar2;
                this.f192043a = managedFile2;
                this.f192044b = 1;
                if (kotlinx.coroutines.i.h(z1VarD, aVar, this) == objL) {
                    return objL;
                }
                pVar = pVar2;
                managedFile = managedFile2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                managedFile = (ManagedFile) this.f192043a;
                pVar = (p) this.f192045c;
                ResultKt.m(obj);
            }
            return pVar.f192018p.c(pVar.f192004b, managedFile);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.services.download.g[]> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations", f = "DatafileOperations.kt", i = {}, l = {195}, m = "startDownload", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f192050a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f192052c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f192050a = obj;
            this.f192052c |= Integer.MIN_VALUE;
            return p.this.h(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations$startDownload$2", f = "DatafileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192053a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f192055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f192055c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new d(this.f192055c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192053a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            p.this.f192006d.q(p.this, !this.f192055c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations$startDownloadOnDemand$2$1", f = "DatafileOperations.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192056a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192056a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            p pVar = p.this;
            this.f192056a = 1;
            Object objH = pVar.h(true, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations$validate$1", f = "DatafileOperations.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192058a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192058a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = p.this;
                this.f192058a = 1;
                if (pVar.a0(this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.DatafileOperations$waitWhileInitializing$1", f = "DatafileOperations.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192060a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192060a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            while (p.this.f192024v.get()) {
                this.f192060a = 1;
                if (d1.b(100L, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ p(v vVar, com.planner5d.library.model.d dVar, com.planner5d.library.application.b bVar, y yVar, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.modules.user.user.t tVar, t0 t0Var, com.planner5d.library.model.manager.builtin.n nVar, t tVar2, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.managedfiles.g gVar, c1 c1Var, p0 p0Var, a0 a0Var, g0 g0Var, com.planner5d.library.model.manager.builtin.p pVar2, k5 k5Var, c2 c2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, dVar, bVar, yVar, iVar, tVar, t0Var, nVar, tVar2, pVar, gVar, c1Var, p0Var, a0Var, g0Var, pVar2, k5Var, c2Var);
    }

    @m1
    private final int A(ManagedFile managedFile, MessageDigest messageDigest) {
        String strV;
        if (managedFile.c() == 1 && (strV = managedFile.v()) != null && Item.isNotIdForItemNs(strV)) {
            return 0;
        }
        return !this.f192010h.o(managedFile.path, managedFile.hash, messageDigest) ? 1 : 0;
    }

    @m1
    private final ManagedFile B(String str) {
        t tVar = this.f192011i;
        String version = this.f192004b.f180677a;
        Intrinsics.checkNotNullExpressionValue(version, "version");
        return tVar.c(version, str);
    }

    private final String E(ManagedFile managedFile) {
        return managedFile.datafileVersion + ":" + managedFile.path;
    }

    @m1
    private final w F() {
        c0();
        return Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.G(this.f191997a, (v) obj);
            }
        }).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v G(p pVar, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.e() == null ? it.g(pVar.J()) : it;
    }

    @m1
    private final void H(File file) throws IOException {
        int i10;
        int i11;
        ArrayList arrayList;
        char c10;
        this.f192024v.set(true);
        id.a aVarA = this.f192008f.a();
        boolean zN = this.f192009g.n(aVarA);
        SQLiteDatabase sQLiteDatabaseC = com.planner5d.library.model.manager.l.c(file);
        try {
            List<String> listX = this.f192007e.x(sQLiteDatabaseC);
            Intrinsics.checkNotNullExpressionValue(listX, "getCatalogItemIds(...)");
            Set<String> set = CollectionsKt.toSet(listX);
            List<String> listZ = this.f192007e.z(sQLiteDatabaseC, aVarA);
            Intrinsics.checkNotNullExpressionValue(listZ, "getCatalogItemNsIds(...)");
            Set<String> set2 = CollectionsKt.toSet(listZ);
            t tVar = this.f192011i;
            String version = this.f192004b.f180677a;
            Intrinsics.checkNotNullExpressionValue(version, "version");
            tVar.b(version);
            Cursor cursorC0 = this.f192007e.C0(sQLiteDatabaseC);
            try {
                int columnIndex = cursorC0.getColumnIndex("hash");
                int columnIndex2 = cursorC0.getColumnIndex("path");
                int columnIndex3 = cursorC0.getColumnIndex("size");
                if (columnIndex >= 0 && columnIndex2 >= 0 && columnIndex3 >= 0) {
                    Date date = new Date();
                    MessageDigest messageDigestA = e0.a("MD5");
                    char c11 = 500;
                    ArrayList arrayList2 = new ArrayList(500);
                    while (true) {
                        arrayList2.clear();
                        while (true) {
                            if (!cursorC0.moveToNext()) {
                                i10 = columnIndex;
                                i11 = columnIndex2;
                                arrayList = arrayList2;
                                c10 = c11;
                                break;
                            }
                            ArrayList arrayList3 = arrayList2;
                            String string = cursorC0.getString(columnIndex2);
                            Intrinsics.checkNotNull(string);
                            String string2 = cursorC0.getString(columnIndex);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            long j10 = cursorC0.getLong(columnIndex3);
                            Intrinsics.checkNotNull(messageDigestA);
                            i10 = columnIndex;
                            i11 = columnIndex2;
                            arrayList = arrayList3;
                            c10 = 500;
                            arrayList.add(L(string, string2, j10, date, set, set2, messageDigestA));
                            if (arrayList.size() == 500) {
                                break;
                            }
                            arrayList2 = arrayList;
                            c11 = 500;
                            columnIndex = i10;
                            columnIndex2 = i11;
                        }
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        this.f192011i.i(arrayList);
                        arrayList2 = arrayList;
                        c11 = c10;
                        columnIndex = i10;
                        columnIndex2 = i11;
                    }
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(cursorC0, null);
                kotlin.io.c.a(sQLiteDatabaseC, null);
                Y(aVarA, zN);
                this.f192024v.set(false);
                O(this.f192008f.a());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorC0, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.c.a(sQLiteDatabaseC, th4);
                throw th5;
            }
        }
    }

    @m1
    private final boolean I(ManagedFile managedFile) {
        if (this.f192019q.N(managedFile)) {
            return this.f192019q.M(managedFile);
        }
        File fileD = D(managedFile);
        return fileD != null && fileD.isFile();
    }

    @m1
    private final w J() {
        t tVar = this.f192011i;
        String version = this.f192004b.f180677a;
        Intrinsics.checkNotNullExpressionValue(version, "version");
        return tVar.f(version);
    }

    @m1
    private final ManagedFile L(String str, String str2, long j10, Date date, Set<String> set, Set<String> set2, MessageDigest messageDigest) {
        ManagedFile managedFile = new ManagedFile();
        managedFile.datafileVersion = this.f192021s;
        managedFile.hash = str2;
        managedFile.path = str;
        managedFile.size = j10;
        managedFile.dateUpdated = date;
        String strV = managedFile.v();
        managedFile.inCatalog = strV != null ? set.contains(strV) : true;
        managedFile.storage = A(managedFile, messageDigest);
        managedFile.downloadStatus = z(managedFile, messageDigest);
        managedFile.downloadPriority = managedFile.s(set2);
        return managedFile;
    }

    @m1
    private final void M(id.a aVar) {
        List<String> listB = this.f192007e.B(this.f192004b, aVar);
        Intrinsics.checkNotNullExpressionValue(listB, "getCatalogItemNsIds(...)");
        final Set set = CollectionsKt.toSet(listB);
        Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.N(this.f191995a, set, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v N(p pVar, Set set, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        t tVar = pVar.f192011i;
        String version = pVar.f192004b.f180677a;
        Intrinsics.checkNotNullExpressionValue(version, "version");
        tVar.g(version, set);
        return it.g(null);
    }

    @m1
    private final void O(id.a aVar) {
        if (this.f192013k.f(this.f192004b)) {
            boolean zN = this.f192009g.n(aVar);
            if (!this.f192013k.g(this.f192004b, aVar, zN)) {
                M(aVar);
                P();
            }
            Y(aVar, zN);
        }
    }

    @m1
    private final void P() {
        c0();
        Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.Q(this.f191994a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v Q(p pVar, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.g(pVar.J());
    }

    private final void R(ManagedFile managedFile) {
        this.f192025w.remove(E(managedFile));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v T(int i10, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v V(y.b bVar, ErrorMessageException errorMessageException, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.h(bVar, errorMessageException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v X(ManagedFile managedFile, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        w wVarE = it.e();
        return it.g(wVarE != null ? wVarE.g(managedFile.size) : null);
    }

    @m1
    private final void Y(id.a aVar, boolean z10) {
        synchronized (this.f192022t) {
            this.f192013k.h(this.f192004b, aVar, z10);
            Unit unit = Unit.f312394a;
        }
    }

    @m1
    private final v Z(Function1<? super v, v> function1) {
        v vVar;
        synchronized (this.f192023u) {
            try {
                v vVarInvoke = function1.invoke(this.f192003a);
                v vVar2 = vVarInvoke;
                this.f192016n.r(vVar2);
                this.f192003a = vVar2;
                vVar = vVarInvoke;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Object a0(kotlin.coroutines.d<? super Unit> dVar) {
        File parentFile;
        Long id2;
        Date dateM = this.f192014l.m();
        Date date = this.f192026x;
        if (date != null && date.after(dateM) && new Date().getTime() - date.getTime() < TimeUnit.HOURS.toMillis(1L)) {
            return Unit.f312394a;
        }
        final ArrayList arrayList = new ArrayList();
        if (Math.max(0L, dateM.getTime() - this.f192014l.j().getTime()) > TimeUnit.MINUTES.toMillis(1L)) {
            String string = this.f192005c.getString(com.planner5d.library.f.s.O8, this.f192015m.f(dateM));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(string);
        }
        ArrayList arrayList2 = new ArrayList();
        t tVar = this.f192011i;
        String version = this.f192004b.f180677a;
        Intrinsics.checkNotNullExpressionValue(version, "version");
        for (ManagedFile managedFile : tVar.d(version)) {
            if (!I(managedFile) && (id2 = managedFile.getId()) != null) {
                arrayList2.add(kotlin.coroutines.jvm.internal.b.g(id2.longValue()));
            }
        }
        if (!arrayList2.isEmpty()) {
            String string2 = this.f192005c.getString(com.planner5d.library.f.s.f169006b9, kotlin.coroutines.jvm.internal.b.f(arrayList2.size()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(string2);
            synchronized (this.f192022t) {
                try {
                    this.f192011i.k(arrayList2);
                    M(this.f192008f.a());
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            P();
        }
        File fileI = this.f192010h.i();
        if (fileI != null && (parentFile = fileI.getParentFile()) != null) {
            try {
                long jR = h3.r(parentFile);
                if (jR < x2.a.f229838a.a(64)) {
                    String string3 = this.f192005c.getString(com.planner5d.library.f.s.F9, org.apache.commons.io.k.a(jR));
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    arrayList.add(string3);
                }
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        if (!arrayList.isEmpty()) {
            Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.b0(arrayList, (v) obj);
                }
            });
        }
        this.f192026x = new Date();
        Object objH = h(true, dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v b0(List list, v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.j((String[]) list.toArray(new String[0]));
    }

    private final void c0() {
        c0.t(c0.f225068a, null, true, new g(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v y(v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.c() == 2) {
            it = it.i(1);
        }
        return it;
    }

    @m1
    private final int z(ManagedFile managedFile, MessageDigest messageDigest) {
        return (managedFile.storage == 1 && this.f192010h.p(managedFile.path, managedFile.hash, messageDigest)) ? 2 : 0;
    }

    @Nullable
    public final Object C(@NotNull ManagedFile managedFile, @NotNull kotlin.coroutines.d<? super com.planner5d.library.services.download.g[]> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(managedFile, null), dVar);
    }

    @m1
    @Nullable
    public final File D(@NotNull ManagedFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.storage == 1) {
            return this.f192010h.j(file.path);
        }
        return null;
    }

    @m1
    public final void K() {
        P();
        validate();
    }

    @m1
    public final void S(@NotNull ManagedFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        synchronized (this.f192022t) {
            this.f192011i.j(file);
            R(file);
            Unit unit = Unit.f312394a;
        }
    }

    @m1
    public final void U(@NotNull final y.b downloadState, @Nullable final ErrorMessageException errorMessageException) {
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.V(downloadState, errorMessageException, (v) obj);
            }
        });
    }

    @m1
    public final void W(@NotNull final ManagedFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        synchronized (this.f192022t) {
            try {
                this.f192011i.l(file);
                R(file);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.X(file, (v) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    public boolean a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return B(path) != null;
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    public void b(@Nullable File file) throws Throwable {
        if (file != null && file.isFile()) {
            synchronized (this.f192022t) {
                try {
                    if (!this.f192013k.f(this.f192004b)) {
                        H(file);
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            P();
        }
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    public boolean c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ManagedFile managedFileB = B(path);
        return managedFileB != null && managedFileB.x();
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    public void d(final int i10) {
        Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.T(i10, (v) obj);
            }
        });
        this.f192012j.g(com.planner5d.library.services.r.managedFilesDownloadPriority, i10);
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super v> dVar) {
        v vVar;
        c0();
        F();
        synchronized (this.f192023u) {
            vVar = this.f192003a;
        }
        return vVar;
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    public boolean f(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ManagedFile managedFileB = B(path);
        return managedFileB != null && managedFileB.z();
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    @m1
    public void g(@NotNull String path) {
        String strE;
        Intrinsics.checkNotNullParameter(path, "path");
        synchronized (this.f192022t) {
            try {
                ManagedFile managedFileB = B(path);
                if (managedFileB == null || !managedFileB.y()) {
                    strE = null;
                } else {
                    t tVar = this.f192011i;
                    String version = this.f192004b.f180677a;
                    Intrinsics.checkNotNullExpressionValue(version, "version");
                    tVar.m(version, managedFileB);
                    strE = E(managedFileB);
                    if (!this.f192025w.contains(strE)) {
                        this.f192025w.add(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (strE != null) {
            if (!((Boolean) c0.t(c0.f225068a, null, false, new e(null), 3, null)).booleanValue()) {
                synchronized (this.f192022t) {
                    try {
                        this.f192025w.remove(strE);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            }
            while (true) {
                synchronized (this.f192022t) {
                    try {
                        if (this.f192003a.d() == y.b.IDLE || !this.f192025w.contains(strE)) {
                            break;
                            break;
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                Thread.yield();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.managedfiles.r
    @Nullable
    public Object h(boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f192052c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f192052c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f192050a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f192052c;
        boolean z11 = true;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!z10 || this.f192020r.c(this.f192005c)) {
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                d dVar2 = new d(z10, null);
                cVar.f192052c = 1;
                if (kotlinx.coroutines.i.h(z1VarD, dVar2, cVar) == objL) {
                    return objL;
                }
            } else {
                z11 = false;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.a(z11);
    }

    @Override // com.planner5d.library.model.manager.managedfiles.r
    public void validate() {
        kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.f(), null, new f(null), 2, null);
    }

    @m1
    @Nullable
    public final ManagedFile w(@NotNull b2 online) {
        int iC;
        int i10;
        ManagedFile managedFileA;
        Intrinsics.checkNotNullParameter(online, "online");
        synchronized (this.f192023u) {
            try {
                iC = this.f192003a.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f192022t) {
            try {
                O(this.f192008f.a());
                this.f192011i.h();
                t tVar = this.f192011i;
                String version = this.f192004b.f180677a;
                Intrinsics.checkNotNullExpressionValue(version, "version");
                if (iC == 0) {
                    i10 = 3;
                } else {
                    i10 = (iC == 2 || online == b2.ONLINE_WITH_WIFI) ? 1 : 2;
                }
                managedFileA = tVar.a(version, i10);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return managedFileA;
    }

    @m1
    public final void x() {
        Z(new Function1() { // from class: com.planner5d.library.model.manager.managedfiles.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.y((v) obj);
            }
        });
    }

    private p(v vVar, com.planner5d.library.model.d dVar, com.planner5d.library.application.b bVar, y yVar, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.modules.user.user.t tVar, t0 t0Var, com.planner5d.library.model.manager.builtin.n nVar, t tVar2, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.managedfiles.g gVar, c1 c1Var, p0 p0Var, a0 a0Var, g0 g0Var, com.planner5d.library.model.manager.builtin.p pVar2, k5 k5Var, c2 c2Var) {
        this.f192003a = vVar;
        this.f192004b = dVar;
        this.f192005c = bVar;
        this.f192006d = yVar;
        this.f192007e = iVar;
        this.f192008f = tVar;
        this.f192009g = t0Var;
        this.f192010h = nVar;
        this.f192011i = tVar2;
        this.f192012j = pVar;
        this.f192013k = gVar;
        this.f192014l = c1Var;
        this.f192015m = p0Var;
        this.f192016n = a0Var;
        this.f192017o = g0Var;
        this.f192018p = pVar2;
        this.f192019q = k5Var;
        this.f192020r = c2Var;
        String version = dVar.f180677a;
        Intrinsics.checkNotNullExpressionValue(version, "version");
        this.f192021s = Long.parseLong(version);
        this.f192022t = new Object();
        this.f192023u = new Object();
        this.f192024v = new AtomicBoolean(false);
        this.f192025w = new ArrayList();
    }
}

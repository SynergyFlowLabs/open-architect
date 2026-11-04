package com.planner5d.library.activity.fragment.dialog.titleedit;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.c0;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class FolderEdit extends TitleEdit<Folder, Void> {

    @ij.a
    public f1 coroutineScope;

    @ij.a
    public c0 folderManager;

    @ij.a
    public t userAuthorization;

    @NotNull
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        public final void a(@NotNull k dialogLauncher, int i10, long j10) {
            Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
            dialogLauncher.c(FolderEdit.class).h(new i().f(r.folderType, i10).g(r.folder, j10).a()).g();
        }

        private a() {
        }
    }

    @f(c = "com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit$getModel$2", f = "FolderEdit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Folder>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133048a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f133050c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133050c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FolderEdit.this.new b(this.f133050c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133048a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return FolderEdit.this.getFolderManager().y(FolderEdit.this.getUserAuthorization().a(), this.f133050c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Folder> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit$save$1", f = "FolderEdit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133051a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Folder f133053c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Folder folder, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f133053c = folder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FolderEdit.this.new c(this.f133053c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133051a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            FolderEdit.this.getFolderManager().M(FolderEdit.this.getUserAuthorization().a(), this.f133053c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit$save$2", f = "FolderEdit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f133056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f133057d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f133056c = str;
            this.f133057d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FolderEdit.this.new d(this.f133056c, this.f133057d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            FolderEdit.this.getFolderManager().r(FolderEdit.this.getUserAuthorization().a(), this.f133056c, FolderEdit.this.Y(), this.f133057d);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public FolderEdit() {
        com.planner5d.library.application.b.f142455c.a().E(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Y() {
        Folder model = getModel();
        return model != null ? model.type : new j(getArguments()).c(r.folderType, Folder.f180529b);
    }

    @n
    public static final void show(@NotNull k kVar, int i10, long j10) {
        Companion.a(kVar, i10, j10);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    protected Object T(long j10, @NotNull kotlin.coroutines.d<? super Folder> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(j10, null), dVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    protected boolean W() {
        r3.a aVar = getModel() == null ? r3.a.create : r3.a.edit;
        getFolderManager().N(Y(), aVar, p3.b.submit);
        boolean zW = super.W();
        getFolderManager().N(Y(), aVar, zW ? p3.b.success : p3.b.error);
        return zW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public String getModelTitle(@Nullable Folder folder) {
        if (folder != null) {
            return folder.title;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @NotNull
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public String getTitle(@Nullable Folder folder) {
        String string = getString(folder == null ? com.planner5d.library.f.s.Xr : com.planner5d.library.f.s.mz);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void save(@Nullable Folder folder, @Nullable String str) {
        if (folder == null) {
            kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new d(str, new j(getArguments()).d(r.folder, 0L), null), 3, null);
        } else {
            folder.title = str;
            int i10 = 5 << 0;
            kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new c(folder, null), 3, null);
        }
    }

    @NotNull
    public final f1 getCoroutineScope() {
        f1 f1Var = this.coroutineScope;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @NotNull
    public final c0 getFolderManager() {
        c0 c0Var = this.folderManager;
        if (c0Var != null) {
            return c0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("folderManager");
        return null;
    }

    @NotNull
    public final t getUserAuthorization() {
        t tVar = this.userAuthorization;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    public final void setCoroutineScope(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.coroutineScope = f1Var;
    }

    public final void setFolderManager(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.folderManager = c0Var;
    }

    public final void setUserAuthorization(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.userAuthorization = tVar;
    }
}

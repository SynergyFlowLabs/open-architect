package com.planner5d.library.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.q3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.model.snapshot.SnapshotLocal;
import com.planner5d.library.services.share.PublicFileProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class f0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f224302k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f224303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f224304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final r3.k f224305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final r3.l f224306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f224307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final SnapshotLocal f224308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Long f224309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final jc.b f224310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final q3.d f224311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final b4.c f224312j;

    public f0(@NotNull String subject, @NotNull String shareDialogTitle, @Nullable r3.k kVar, @Nullable r3.l lVar, @Nullable String str, @Nullable SnapshotLocal snapshotLocal, @Nullable Long l10, @Nullable jc.b bVar, @Nullable q3.d dVar, @Nullable b4.c cVar) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(shareDialogTitle, "shareDialogTitle");
        this.f224303a = subject;
        this.f224304b = shareDialogTitle;
        this.f224305c = kVar;
        this.f224306d = lVar;
        this.f224307e = str;
        this.f224308f = snapshotLocal;
        this.f224309g = l10;
        this.f224310h = bVar;
        this.f224311i = dVar;
        this.f224312j = cVar;
    }

    public static /* synthetic */ void c(f0 f0Var, Activity activity, b4.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        f0Var.b(activity, eVar);
    }

    public final void a(@Nullable Activity activity) {
        b(activity, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    public final void b(@Nullable Activity activity, @Nullable b4.e eVar) {
        String mimeTypeFromExtension;
        Activity activity2;
        Intent intentCreateChooser;
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        SnapshotLocal snapshotLocal = this.f224308f;
        if (snapshotLocal != null) {
            intent.putExtra("android.intent.extra.STREAM", PublicFileProvider.c(activity, snapshotLocal));
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(snapshotLocal.filename));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "text/plain";
            }
        } else {
            mimeTypeFromExtension = "text/plain";
        }
        intent.setType(mimeTypeFromExtension);
        intent.putExtra("android.intent.extra.SUBJECT", this.f224303a);
        intent.putExtra("android.intent.extra.TEXT", this.f224307e);
        r3.l lVar = this.f224306d;
        if (lVar != null) {
            activity2 = activity;
            intentCreateChooser = Intent.createChooser(intent, this.f224304b, com.planner5d.library.services.share.b.f224982a.a(activity2, this.f224305c, lVar, this.f224309g, this.f224310h, this.f224311i));
        } else {
            activity2 = activity;
            intentCreateChooser = Intent.createChooser(intent, this.f224304b);
        }
        if (this.f224306d == r3.l.snapshot && eVar != null) {
            u2.f217517b.J0(b4.a.share, p3.b.submit, this.f224309g, this.f224312j, eVar);
        }
        activity2.startActivity(intentCreateChooser);
    }

    public /* synthetic */ f0(String str, String str2, r3.k kVar, r3.l lVar, String str3, SnapshotLocal snapshotLocal, Long l10, jc.b bVar, q3.d dVar, b4.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : kVar, (i10 & 8) != 0 ? null : lVar, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : snapshotLocal, (i10 & 64) != 0 ? null : l10, bVar, dVar, cVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull String subject, @NotNull String uri, @Nullable SnapshotLocal snapshotLocal, @NotNull String shareDialogTitle, @Nullable Long l10, @Nullable b4.c cVar) {
        this(subject, shareDialogTitle, null, null, uri, snapshotLocal, l10, null, null, cVar, 12, null);
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(shareDialogTitle, "shareDialogTitle");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull Context context, @NotNull com.planner5d.library.model.h model, @NotNull b4.c source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(source, "source");
        String string = context.getString(com.planner5d.library.f.s.UD);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(com.planner5d.library.f.s.AB);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this(string, string2, null, com.planner5d.library.model.manager.q0.p(model.f180739a), model.e(), null, Long.valueOf(model.f180750l), null, null, source);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull Context context, @Nullable gd.b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(com.planner5d.library.f.s.YD);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(com.planner5d.library.f.s.IF);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this(string, string2, null, r3.l.snapshot, bVar instanceof Snapshot ? ((Snapshot) bVar).x() : context.getString(com.planner5d.library.f.s.DG, context.getPackageName()), bVar instanceof SnapshotLocal ? (SnapshotLocal) bVar : null, bVar != null ? bVar.d() : null, null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = context.getString(com.planner5d.library.f.s.WD);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(com.planner5d.library.f.s.JF);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this(string, string2, null, r3.l.link, uri.toString(), null, null, null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull Context context, @NotNull String projectTitle, @NotNull String projectUri, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projectTitle, "projectTitle");
        Intrinsics.checkNotNullParameter(projectUri, "projectUri");
        String string = context.getString(com.planner5d.library.f.s.XD, projectTitle);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(com.planner5d.library.f.s.KF);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this(string, string2, r3.k.projects, r3.l.project, projectUri, null, l10, null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull Context context, @NotNull Project model, @NotNull com.planner5d.library.model.manager.project.d0 projectManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        String str = model.title;
        str = str == null ? com.planner5d.library.model.payments.a.f222474i : str;
        String strJ0 = projectManager.j0(model);
        Intrinsics.checkNotNullExpressionValue(strJ0, "getProjectUri(...)");
        this(context, str, strJ0, model.projectId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull Context context, @NotNull jc.b blog, @Nullable q3.d dVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blog, "blog");
        String strF = blog.f();
        String str = strF == null ? "" : strF;
        String string = context.getString(com.planner5d.library.f.s.HF);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this(str, string, null, r3.l.article, blog.e(), null, null, blog, dVar, null);
    }
}

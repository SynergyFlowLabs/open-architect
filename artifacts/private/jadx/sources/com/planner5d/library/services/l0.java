package com.planner5d.library.services;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.FileProvider;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.k3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f224408h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Project f224409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f224410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f224411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f224412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final y0 f224413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final r3.k f224414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final r3.l f224415g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.ShareProject$share$1", f = "ShareProject.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f224417b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f224419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f224420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Intent f224421f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, String str, Intent intent, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f224419d = activity;
            this.f224420e = str;
            this.f224421f = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = l0.this.new a(this.f224419d, this.f224420e, this.f224421f, dVar);
            aVar.f224417b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f224416a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Bitmap bitmapI = l0.this.i(this.f224419d, this.f224420e);
            if (bitmapI != null) {
                l0 l0Var = l0.this;
                Activity activity = this.f224419d;
                Intent intent = this.f224421f;
                Uri uriH = l0Var.h(activity, bitmapI);
                intent.setClipData(ClipData.newRawUri(null, uriH));
                intent.putExtra("android.intent.extra.STREAM", uriH);
                intent.setType("image/*");
                l0Var.p(activity, intent);
            } else {
                Intent intent2 = this.f224421f;
                l0 l0Var2 = l0.this;
                Activity activity2 = this.f224419d;
                intent2.setType("text/plain");
                l0Var2.p(activity2, intent2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public l0(@NotNull Project project, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull b2 messageManager, @NotNull y0 imageManager, @NotNull r3.k shareSource, @NotNull r3.l shareType) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(shareSource, "shareSource");
        Intrinsics.checkNotNullParameter(shareType, "shareType");
        this.f224409a = project;
        this.f224410b = projectManager;
        this.f224411c = scope;
        this.f224412d = messageManager;
        this.f224413e = imageManager;
        this.f224414f = shareSource;
        this.f224415g = shareType;
    }

    private final String g(Activity activity) {
        String string = activity.getString(com.planner5d.library.f.s.CB, this.f224410b.j0(this.f224409a));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Uri h(Activity activity, Bitmap bitmap) {
        try {
            return m(activity, bitmap);
        } catch (FileNotFoundException e10) {
            timber.log.b.f381052a.f(e10, "Failed to find bitmap", new Object[0]);
            return null;
        } catch (IOException e11) {
            timber.log.b.f381052a.f(e11, "Failed to read/save bitmap", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final Bitmap i(final Activity activity, final String str) {
        com.planner5d.library.services.bitmaploader.target.k kVar = new com.planner5d.library.services.bitmaploader.target.k(new com.planner5d.library.services.bitmaploader.target.h(), this.f224411c);
        final int integer = activity.getResources().getInteger(com.planner5d.library.f.k.A0);
        com.planner5d.library.services.bitmaploader.target.b bVar = new com.planner5d.library.services.bitmaploader.target.b(true);
        com.planner5d.library.services.bitmaploader.target.k.b bVarB = kVar.b(bVar);
        if (str != null) {
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.services.i0
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return l0.j(this.f224348a, str, integer, aVar);
                }
            });
        } else {
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.services.j0
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return l0.k(this.f224352a, integer, aVar);
                }
            });
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.services.k0
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return l0.l(this.f224372a, activity, integer, aVar);
                }
            });
        }
        bVarB.i();
        bVar.k();
        return bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d j(l0 l0Var, String str, int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return l0Var.f224413e.a(0, str, i10, i10, aVar, -3L, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d k(l0 l0Var, int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return l0Var.f224410b.d0(l0Var.f224409a, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d l(l0 l0Var, Activity activity, int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return l0Var.f224410b.c0(activity, l0Var.f224409a, i10, aVar);
    }

    @m1
    private final Uri m(Activity activity, Bitmap bitmap) throws IOException {
        File file = new File(activity.getCacheDir(), io.sentry.protocol.d.b.f306176b);
        file.mkdirs();
        File file2 = new File(file, this.f224409a.title + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(fileOutputStream, null);
            String string = activity.getBaseContext().getString(com.planner5d.library.f.s.f169009bc);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Uri uriForFile = FileProvider.getUriForFile(activity.getBaseContext(), string, file2);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
            return uriForFile;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void o(l0 l0Var, Activity activity, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        l0Var.n(activity, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Activity activity, Intent intent) {
        String string = activity.getString(com.planner5d.library.f.s.XD, this.f224409a.title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        IntentSender intentSenderA = com.planner5d.library.services.share.b.f224982a.a(activity, this.f224414f, this.f224415g, this.f224409a.getId(), null, null);
        com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.share, p3.b.submit, this.f224409a.getId());
        activity.startActivity(Intent.createChooser(intent, string, intentSenderA));
    }

    public final void n(@Nullable Activity activity, @Nullable String str, @Nullable String str2) {
        if (activity == null) {
            return;
        }
        if (!this.f224409a.h()) {
            this.f224412d.e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(com.planner5d.library.f.s.H9, new k3(com.planner5d.library.f.s.f169177ia, new Object[0])), new com.planner5d.library.model.u.a[0]));
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (str == null) {
            str = g(activity);
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.TITLE", activity.getString(com.planner5d.library.f.s.XD, this.f224409a.title));
        intent.setFlags(1);
        kotlinx.coroutines.k.f(this.f224411c, com.planner5d.library.services.utility.s.f229729a.h(), null, new a(activity, str2, intent, null), 2, null);
    }
}

package com.planner5d.library.contest.view.vote;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.contest.view.b0;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class a implements DeepLinkListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C1529a f153812f = new C1529a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f153813g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f153814h = "Pop_up_vote_counted";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f153815i = "active";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f153816j = "host";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f153817k = "planner5d.onelink.me";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f153818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f153819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b0 f153820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f153821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private DeepLinkResult f153822e;

    /* JADX INFO: renamed from: com.planner5d.library.contest.view.vote.a$a, reason: collision with other inner class name */
    public static final class C1529a {
        public /* synthetic */ C1529a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1529a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153823a;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f153823a = iArr;
        }
    }

    @ij.a
    public a(@NotNull k dialogLauncher, @NotNull x navigator, @NotNull b0 contestViewProvider) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(contestViewProvider, "contestViewProvider");
        this.f153818a = dialogLauncher;
        this.f153819b = navigator;
        this.f153820c = contestViewProvider;
        this.f153821d = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    private final boolean a(DeepLinkResult deepLinkResult) {
        boolean z10;
        DeepLink deepLink;
        JSONObject clickEvent;
        synchronized (this.f153821d) {
            try {
                DeepLinkResult deepLinkResult2 = this.f153822e;
                String string = null;
                if ((deepLinkResult2 != null ? deepLinkResult2.getError() : null) != deepLinkResult.getError()) {
                    z10 = false;
                } else {
                    DeepLinkResult deepLinkResult3 = this.f153822e;
                    if ((deepLinkResult3 != null ? deepLinkResult3.getStatus() : null) != deepLinkResult.getStatus()) {
                        z10 = false;
                    } else {
                        DeepLinkResult deepLinkResult4 = this.f153822e;
                        if (deepLinkResult4 != null && (deepLink = deepLinkResult4.getDeepLink()) != null && (clickEvent = deepLink.getClickEvent()) != null) {
                            string = clickEvent.toString();
                        }
                        if (Intrinsics.areEqual(string, deepLinkResult.getDeepLink().getClickEvent().toString())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                }
                if (!z10) {
                    this.f153822e = deepLinkResult;
                }
            } finally {
            }
        }
        return z10;
    }

    private final void b() {
        x.g(this.f153819b, new com.planner5d.library.activity.helper.event.content.c(this.f153820c.a(), (Bundle) null), false, 2, null);
    }

    private final void d() {
        this.f153818a.c(VoteCountedDialog.class).g();
    }

    public final void c() {
        synchronized (this.f153821d) {
            try {
                this.f153822e = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NotNull DeepLinkResult deepLinkResult) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "deepLinkResult");
        if (a(deepLinkResult)) {
            return;
        }
        int i10 = b.f153823a[deepLinkResult.getStatus().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                timber.log.b.f381052a.d("Not found", new Object[0]);
                return;
            }
            DeepLinkResult.Error error = deepLinkResult.getError();
            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
            timber.log.b.f381052a.d(error.toString(), new Object[0]);
            return;
        }
        DeepLink deepLink = deepLinkResult.getDeepLink();
        try {
            if (StringsKt.N1(deepLink.getStringValue(f153814h), "active", true)) {
                b();
                d();
            } else if (StringsKt.O1(deepLink.getStringValue("host"), f153817k, false, 2, null)) {
                b();
            }
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
        }
    }
}

package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.l;
import com.google.android.gms.tasks.n;
import com.google.android.play.core.review.internal.t;
import com.google.android.play.core.review.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"RestrictedApi"})
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.play.core.review.internal.i f114975c = new com.google.android.play.core.review.internal.i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    @p0
    t f114976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114977b;

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.play.core.review.f] */
    public j(Context context) {
        this.f114977b = context.getPackageName();
        if (w.a(context)) {
            this.f114976a = new t(context, f114975c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: com.google.android.play.core.review.f
            }, null);
        }
    }

    public final Task a() {
        String str = this.f114977b;
        com.google.android.play.core.review.internal.i iVar = f114975c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f114976a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return n.f(new a(-1));
        }
        l lVar = new l();
        this.f114976a.s(new g(this, lVar, lVar), lVar);
        return lVar.a();
    }
}

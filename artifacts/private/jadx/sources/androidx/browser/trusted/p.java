package androidx.browser.trusted;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f11989i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f11990j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11991k = "androidx.browser.trusted.extra.SHARE_TARGET";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11992l = "androidx.browser.trusted.extra.SHARE_DATA";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f11993m = "androidx.browser.trusted.extra.DISPLAY_MODE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11994n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Uri f11995a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private List<String> f11997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Bundle f11998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private androidx.browser.trusted.sharing.a f11999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private androidx.browser.trusted.sharing.b f12000f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.browser.customtabs.d.c f11996b = new androidx.browser.customtabs.d.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private n f12001g = new n.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12002h = 0;

    public p(@NonNull Uri uri) {
        this.f11995a = uri;
    }

    @NonNull
    public o a(@NonNull androidx.browser.customtabs.h hVar) {
        if (hVar == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f11996b.x(hVar);
        Intent intent = this.f11996b.d().f11897a;
        intent.setData(this.f11995a);
        intent.putExtra(androidx.browser.customtabs.m.f11951a, true);
        if (this.f11997c != null) {
            intent.putExtra(f11990j, new ArrayList(this.f11997c));
        }
        Bundle bundle = this.f11998d;
        if (bundle != null) {
            intent.putExtra(f11989i, bundle);
        }
        List<Uri> list = Collections.EMPTY_LIST;
        androidx.browser.trusted.sharing.b bVar = this.f12000f;
        if (bVar != null && this.f11999e != null) {
            intent.putExtra(f11991k, bVar.b());
            intent.putExtra(f11992l, this.f11999e.b());
            List<Uri> list2 = this.f11999e.f12037c;
            if (list2 != null) {
                list = list2;
            }
        }
        intent.putExtra(f11993m, this.f12001g.b());
        intent.putExtra(f11994n, this.f12002h);
        return new o(intent, list);
    }

    @NonNull
    public androidx.browser.customtabs.d b() {
        return this.f11996b.d();
    }

    @NonNull
    public n c() {
        return this.f12001g;
    }

    @NonNull
    public Uri d() {
        return this.f11995a;
    }

    @NonNull
    public p e(@NonNull List<String> list) {
        this.f11997c = list;
        return this;
    }

    @NonNull
    public p f(int i10) {
        this.f11996b.j(i10);
        return this;
    }

    @NonNull
    public p g(int i10, @NonNull androidx.browser.customtabs.a aVar) {
        this.f11996b.k(i10, aVar);
        return this;
    }

    @NonNull
    public p h(@NonNull androidx.browser.customtabs.a aVar) {
        this.f11996b.m(aVar);
        return this;
    }

    @NonNull
    public p i(@NonNull n nVar) {
        this.f12001g = nVar;
        return this;
    }

    @NonNull
    public p j(@androidx.annotation.l int i10) {
        this.f11996b.s(i10);
        return this;
    }

    @NonNull
    public p k(@androidx.annotation.l int i10) {
        this.f11996b.t(i10);
        return this;
    }

    @NonNull
    public p l(int i10) {
        this.f12002h = i10;
        return this;
    }

    @NonNull
    public p m(@NonNull androidx.browser.trusted.sharing.b bVar, @NonNull androidx.browser.trusted.sharing.a aVar) {
        this.f12000f = bVar;
        this.f11999e = aVar;
        return this;
    }

    @NonNull
    public p n(@NonNull Bundle bundle) {
        this.f11998d = bundle;
        return this;
    }

    @NonNull
    public p o(@androidx.annotation.l int i10) {
        this.f11996b.C(i10);
        return this;
    }
}

package net.openid.appauth.browser;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class l implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f332867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f332868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f332869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f332870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f332871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f332872j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f332873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<String> f332874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f332875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f332876d;

    static {
        Set<String> set = g.a.f332844c;
        f332867e = new l(g.a.f332842a, set, true, k.b(g.a.f332845d));
        k kVar = k.f332864c;
        boolean z10 = false;
        f332868f = new l(g.a.f332842a, set, false, kVar);
        Set<String> set2 = g.b.f332848c;
        f332869g = new l(g.b.f332846a, set2, true, k.b(g.b.f332849d));
        f332870h = new l(g.b.f332846a, set2, false, kVar);
        Set<String> set3 = g.c.f332852c;
        f332871i = new l(g.c.f332850a, set3, false, kVar);
        f332872j = new l(g.c.f332850a, set3, true, k.b(g.c.f332853d));
    }

    public l(@NonNull String str, @NonNull String str2, boolean z10, @NonNull k kVar) {
        this(str, (Set<String>) Collections.singleton(str2), z10, kVar);
    }

    @Override // net.openid.appauth.browser.d
    public boolean a(@NonNull c cVar) {
        return this.f332873a.equals(cVar.f332833a) && this.f332876d == cVar.f332836d.booleanValue() && this.f332875c.f(cVar.f332835c) && this.f332874b.equals(cVar.f332834b);
    }

    public l(@NonNull String str, @NonNull Set<String> set, boolean z10, @NonNull k kVar) {
        this.f332873a = str;
        this.f332874b = set;
        this.f332876d = z10;
        this.f332875c = kVar;
    }
}

package io.sentry;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f306825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f306826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f306827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f306828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f306829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f306830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private CharSequence f306831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private CharSequence f306832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private CharSequence f306833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private CharSequence f306834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private CharSequence f306835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private CharSequence f306836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private CharSequence f306837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private CharSequence f306838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private CharSequence f306839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private CharSequence f306840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private CharSequence f306841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private Runnable f306842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Runnable f306843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private c f306844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private c f306845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private a f306846v;

    @lm.a.c
    public interface a {
        void a(@Nullable io.sentry.protocol.v vVar, @Nullable b bVar);
    }

    public interface b {
        void a(@NotNull t7 t7Var);
    }

    public interface c {
        void a(@NotNull io.sentry.protocol.f fVar);
    }

    public t7(@NotNull a aVar) {
        this.f306825a = false;
        this.f306826b = true;
        this.f306827c = false;
        this.f306828d = true;
        this.f306829e = true;
        this.f306830f = true;
        this.f306831g = "Report a Bug";
        this.f306832h = "Send Bug Report";
        this.f306833i = "Cancel";
        this.f306834j = "Name";
        this.f306835k = "Your Name";
        this.f306836l = "Email";
        this.f306837m = "your.email@example.org";
        this.f306838n = " (Required)";
        this.f306839o = "Description";
        this.f306840p = "What's the bug? What did you expect?";
        this.f306841q = "Thank you for your report!";
        this.f306846v = aVar;
    }

    public void A(boolean z10) {
        this.f306827c = z10;
    }

    public void B(@NotNull CharSequence charSequence) {
        this.f306831g = charSequence;
    }

    public void C(@NotNull CharSequence charSequence) {
        this.f306838n = charSequence;
    }

    public void D(@NotNull CharSequence charSequence) {
        this.f306839o = charSequence;
    }

    public void E(@NotNull CharSequence charSequence) {
        this.f306840p = charSequence;
    }

    public void F(@NotNull CharSequence charSequence) {
        this.f306834j = charSequence;
    }

    public void G(@NotNull CharSequence charSequence) {
        this.f306835k = charSequence;
    }

    public void H(boolean z10) {
        this.f306825a = z10;
    }

    public void I(@Nullable Runnable runnable) {
        this.f306843s = runnable;
    }

    public void J(@Nullable Runnable runnable) {
        this.f306842r = runnable;
    }

    public void K(@Nullable c cVar) {
        this.f306845u = cVar;
    }

    public void L(@Nullable c cVar) {
        this.f306844t = cVar;
    }

    public void M(boolean z10) {
        this.f306830f = z10;
    }

    public void N(boolean z10) {
        this.f306828d = z10;
    }

    public void O(boolean z10) {
        this.f306826b = z10;
    }

    public void P(@NotNull CharSequence charSequence) {
        this.f306832h = charSequence;
    }

    public void Q(@NotNull CharSequence charSequence) {
        this.f306841q = charSequence;
    }

    public void R(boolean z10) {
        this.f306829e = z10;
    }

    @NotNull
    public CharSequence a() {
        return this.f306833i;
    }

    @lm.a.c
    @NotNull
    public a b() {
        return this.f306846v;
    }

    @NotNull
    public CharSequence c() {
        return this.f306836l;
    }

    @NotNull
    public CharSequence d() {
        return this.f306837m;
    }

    @NotNull
    public CharSequence e() {
        return this.f306831g;
    }

    @NotNull
    public CharSequence f() {
        return this.f306838n;
    }

    @NotNull
    public CharSequence g() {
        return this.f306839o;
    }

    @NotNull
    public CharSequence h() {
        return this.f306840p;
    }

    @NotNull
    public CharSequence i() {
        return this.f306834j;
    }

    @NotNull
    public CharSequence j() {
        return this.f306835k;
    }

    @Nullable
    public Runnable k() {
        return this.f306843s;
    }

    @Nullable
    public Runnable l() {
        return this.f306842r;
    }

    @Nullable
    public c m() {
        return this.f306845u;
    }

    @Nullable
    public c n() {
        return this.f306844t;
    }

    @NotNull
    public CharSequence o() {
        return this.f306832h;
    }

    @NotNull
    public CharSequence p() {
        return this.f306841q;
    }

    public boolean q() {
        return this.f306827c;
    }

    public boolean r() {
        return this.f306825a;
    }

    public boolean s() {
        return this.f306830f;
    }

    public boolean t() {
        return this.f306828d;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f306825a + ", showName=" + this.f306826b + ", isEmailRequired=" + this.f306827c + ", showEmail=" + this.f306828d + ", useSentryUser=" + this.f306829e + ", showBranding=" + this.f306830f + ", formTitle='" + ((Object) this.f306831g) + "', submitButtonLabel='" + ((Object) this.f306832h) + "', cancelButtonLabel='" + ((Object) this.f306833i) + "', nameLabel='" + ((Object) this.f306834j) + "', namePlaceholder='" + ((Object) this.f306835k) + "', emailLabel='" + ((Object) this.f306836l) + "', emailPlaceholder='" + ((Object) this.f306837m) + "', isRequiredLabel='" + ((Object) this.f306838n) + "', messageLabel='" + ((Object) this.f306839o) + "', messagePlaceholder='" + ((Object) this.f306840p) + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean u() {
        return this.f306826b;
    }

    public boolean v() {
        return this.f306829e;
    }

    public void w(@NotNull CharSequence charSequence) {
        this.f306833i = charSequence;
    }

    @lm.a.c
    public void x(@NotNull a aVar) {
        this.f306846v = aVar;
    }

    public void y(@NotNull CharSequence charSequence) {
        this.f306836l = charSequence;
    }

    public void z(@NotNull CharSequence charSequence) {
        this.f306837m = charSequence;
    }

    public t7(@NotNull t7 t7Var) {
        this.f306825a = false;
        this.f306826b = true;
        this.f306827c = false;
        this.f306828d = true;
        this.f306829e = true;
        this.f306830f = true;
        this.f306831g = "Report a Bug";
        this.f306832h = "Send Bug Report";
        this.f306833i = "Cancel";
        this.f306834j = "Name";
        this.f306835k = "Your Name";
        this.f306836l = "Email";
        this.f306837m = "your.email@example.org";
        this.f306838n = " (Required)";
        this.f306839o = "Description";
        this.f306840p = "What's the bug? What did you expect?";
        this.f306841q = "Thank you for your report!";
        this.f306825a = t7Var.f306825a;
        this.f306826b = t7Var.f306826b;
        this.f306827c = t7Var.f306827c;
        this.f306828d = t7Var.f306828d;
        this.f306829e = t7Var.f306829e;
        this.f306830f = t7Var.f306830f;
        this.f306831g = t7Var.f306831g;
        this.f306832h = t7Var.f306832h;
        this.f306833i = t7Var.f306833i;
        this.f306834j = t7Var.f306834j;
        this.f306835k = t7Var.f306835k;
        this.f306836l = t7Var.f306836l;
        this.f306837m = t7Var.f306837m;
        this.f306838n = t7Var.f306838n;
        this.f306839o = t7Var.f306839o;
        this.f306840p = t7Var.f306840p;
        this.f306841q = t7Var.f306841q;
        this.f306842r = t7Var.f306842r;
        this.f306843s = t7Var.f306843s;
        this.f306844t = t7Var.f306844t;
        this.f306845u = t7Var.f306845u;
        this.f306846v = t7Var.f306846v;
    }
}

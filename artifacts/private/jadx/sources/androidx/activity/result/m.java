package androidx.activity.result;

import androidx.annotation.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10049c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10052f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private g.b.j.g f10047a = g.b.j.c.f275339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10048b = g.b.i.f275325b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private g.b.j.AbstractC1906b f10050d = g.b.j.AbstractC1906b.C1907b.f275337a;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10055c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f10058f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private g.b.j.g f10053a = g.b.j.c.f275339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10054b = g.b.i.f275325b.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private g.b.j.AbstractC1906b f10056d = g.b.j.AbstractC1906b.C1907b.f275337a;

        @NotNull
        public final m a() {
            m mVar = new m();
            mVar.k(this.f10053a);
            mVar.j(this.f10054b);
            mVar.l(this.f10055c);
            mVar.i(this.f10056d);
            mVar.h(this.f10057e);
            mVar.g(this.f10058f);
            return mVar;
        }

        @NotNull
        public final a b(long j10) {
            this.f10058f = j10;
            this.f10057e = true;
            return this;
        }

        @NotNull
        public final a c(@NotNull g.b.j.AbstractC1906b defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.f10056d = defaultTab;
            return this;
        }

        @NotNull
        public final a d(@g0(from = 2) int i10) {
            this.f10054b = i10;
            return this;
        }

        @NotNull
        public final a e(@NotNull g.b.j.g mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f10053a = mediaType;
            return this;
        }

        @NotNull
        public final a f(boolean z10) {
            this.f10055c = z10;
            return this;
        }
    }

    public final long a() {
        return this.f10052f;
    }

    @NotNull
    public final g.b.j.AbstractC1906b b() {
        return this.f10050d;
    }

    public final int c() {
        return this.f10048b;
    }

    @NotNull
    public final g.b.j.g d() {
        return this.f10047a;
    }

    public final boolean e() {
        return this.f10051e;
    }

    public final boolean f() {
        return this.f10049c;
    }

    public final void g(long j10) {
        this.f10052f = j10;
    }

    public final void h(boolean z10) {
        this.f10051e = z10;
    }

    public final void i(@NotNull g.b.j.AbstractC1906b abstractC1906b) {
        Intrinsics.checkNotNullParameter(abstractC1906b, "<set-?>");
        this.f10050d = abstractC1906b;
    }

    public final void j(int i10) {
        this.f10048b = i10;
    }

    public final void k(@NotNull g.b.j.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f10047a = gVar;
    }

    public final void l(boolean z10) {
        this.f10049c = z10;
    }
}

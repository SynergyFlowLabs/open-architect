package io.ktor.client.engine.android;

import io.ktor.client.engine.j;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f294310e = 100000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f294311f = 100000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Function1<? super HttpsURLConnection, Unit> f294312g = new Function1() { // from class: io.ktor.client.engine.android.f
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return h.u((HttpsURLConnection) obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private Function1<? super HttpURLConnection, Unit> f294313h = new Function1() { // from class: io.ktor.client.engine.android.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return h.p((HttpURLConnection) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(HttpsURLConnection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    public final int l() {
        return this.f294310e;
    }

    @NotNull
    public final Function1<HttpURLConnection, Unit> m() {
        return this.f294313h;
    }

    public final int n() {
        return this.f294311f;
    }

    @NotNull
    public final Function1<HttpsURLConnection, Unit> o() {
        return this.f294312g;
    }

    public final void q(int i10) {
        this.f294310e = i10;
    }

    public final void r(@NotNull Function1<? super HttpURLConnection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f294313h = function1;
    }

    public final void s(int i10) {
        this.f294311f = i10;
    }

    public final void t(@NotNull Function1<? super HttpsURLConnection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f294312g = function1;
    }
}

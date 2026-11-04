package io.sentry.android.replay;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f305111a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.semantics.d0<String> f305112b = new androidx.compose.ui.semantics.d0<>("SentryPrivacy", a.f305114a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f305113c = androidx.compose.ui.semantics.d0.f41092e;

    static final class a extends l0 implements Function2<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305114a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    private x() {
    }

    @NotNull
    public final androidx.compose.ui.semantics.d0<String> a() {
        return f305112b;
    }
}

package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class d extends kotlin.random.a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f312892d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f312893e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Random f312894c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(@NotNull Random impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f312894c = impl;
    }

    @Override // kotlin.random.a
    @NotNull
    public Random r() {
        return this.f312894c;
    }
}

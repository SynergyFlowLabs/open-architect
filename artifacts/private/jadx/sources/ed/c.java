package ed;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 1)
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274761b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f274762a;

    public enum a {
        Title(0),
        ClickableItem(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f274766e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f274767a;

        a(int i10) {
            this.f274767a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f274766e;
        }

        public final int n() {
            return this.f274767a;
        }
    }

    public c(@NotNull a viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f274762a = viewType;
    }

    @NotNull
    public final a a() {
        return this.f274762a;
    }
}

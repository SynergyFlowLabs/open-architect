package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface l extends g {

    @w0(parameters = 1)
    public static final class a implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15642b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f15643a;

        public a(@NotNull b bVar) {
            this.f15643a = bVar;
        }

        @NotNull
        public final b a() {
            return this.f15643a;
        }
    }

    @w0(parameters = 1)
    public static final class b implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15644b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f15645a;

        public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        public final long a() {
            return this.f15645a;
        }

        private b(long j10) {
            this.f15645a = j10;
        }
    }

    @w0(parameters = 1)
    public static final class c implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15646b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f15647a;

        public c(@NotNull b bVar) {
            this.f15647a = bVar;
        }

        @NotNull
        public final b a() {
            return this.f15647a;
        }
    }
}

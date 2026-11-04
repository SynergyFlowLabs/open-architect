package le;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface o {

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f322674c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC2327a f322675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.h f322676b;

        /* JADX INFO: renamed from: le.o$a$a, reason: collision with other inner class name */
        public enum EnumC2327a {
            LIKE_ADDED,
            LIKE_REMOVED,
            FAILED;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ kotlin.enums.a f322681e = kotlin.enums.c.c(k());

            @NotNull
            public static kotlin.enums.a<EnumC2327a> l() {
                return f322681e;
            }
        }

        public a(@NotNull EnumC2327a state, @NotNull com.planner5d.library.model.h processedItem) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(processedItem, "processedItem");
            this.f322675a = state;
            this.f322676b = processedItem;
        }

        @NotNull
        public final com.planner5d.library.model.h a() {
            return this.f322676b;
        }

        @NotNull
        public final EnumC2327a b() {
            return this.f322675a;
        }
    }

    @Nullable
    Object a(@NotNull com.planner5d.library.model.h hVar, @NotNull kotlin.coroutines.d<? super a> dVar);
}
